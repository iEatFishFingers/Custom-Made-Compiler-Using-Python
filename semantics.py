import antlr4 as antlr
from CoffeeLexer import CoffeeLexer
from CoffeeVisitor import CoffeeVisitor
from CoffeeParser import CoffeeParser
from CoffeeUtil import Var, Method, Import, Loop, SymbolTable

class CoffeeTreeVisitor(CoffeeVisitor):
    def __init__(self):
        self.stbl = SymbolTable()
        
    def visitProgram(self, ctx):
        line = ctx.start.line
        method_id = 'main'
        return_type = 'int'

        method = Method(method_id, return_type, line)
        self.stbl.pushFrame(method)

        self.stbl.pushMethod(method)
        self.stbl.pushMethod(method)


        self.visitChildren(ctx)

        self.stbl.popFrame()

    def visitBlock(self, ctx):
        if (ctx.LCURLY() != None):
            self.stbl.pushScope()
            self.visitChildren(ctx)
        if (ctx.LCURLY() != None):
            self.stbl.popScope()




    def visitGlobal_decl(self, ctx):
        line = ctx.start.line

        var_type = ctx.var_decl().data_type().getText()
        for i in range(len(ctx.var_decl().var_assign())):
            var_id = ctx.var_decl().var_assign(i).var().ID().getText()
            var_size = 8
            var_array = False
            var =  self.stbl.peek(var_id)
            if (var != None):
                print('there is an error on line ', line,
                      'the variable ', var_id,
                      'has already been declared on line ', var.line)
                var = Var(var_id, var_type, var_size, Var.GLOBAL, var_array, line)
                self.stbl.pushVar(var)
            if ctx.var_decl().var_assign(i).expr() != None:
                self.visit(ctx.var_decl().var_assign(i).expr())

    def visitVar_decl(self, ctx):
            line = ctx.start.line
            var_type = ctx.data_type().getText() #gets the var type
            var_array = ctx.is_array().getText()

            n_vars = len(ctx.var_assign())

            for i in range(n_vars):
                var_id = ctx.var_assign(i).var().getText()

                var = self.stbl.peek(var_id) #this checks if there is already that variable in use
                if (var != None):
                    print('there is an error on line ', line,
                        'the variable ', var_id,
                        'has already been declared on line ', var.line)
                var = Var(var_id, var_type, 8,Var.LOCAL, var_array, line)
                self.stbl.pushVar(var)
    
    def visitMethod_decl(self, ctx):
        line = ctx.start.line

        method_id = ctx.ID().getText()
        method_type = ctx.return_type().getText()
        temp = ctx.block().block()
        #print(temp)
        # TODO: semantic rule 3
        method = self.stbl.peek(method_id)
        if (method !=None):
            print('erorr one line', line,
                  'method "', method_id,
                  '" has already been declared on line ', method.line)
        method = Method(method_id, method_type, line)
        self.stbl.pushMethod(method)
        self.stbl.pushFrame(method)
        for i in range(len(ctx.param())):
            var_id = ctx.param(i).ID().getText()
            var_type = ctx.param(i).data_type().getText()
            var_size = 8
            var_array = False
            # TODO: semantic rule 2
            var = self.stbl.peek(var_id)
            if (var != None):
                print("error on line ", line,
                      "var '", var_id,
                      "' has already been declared on line ", var.line)
            var = Var(var_id, var_type, var_size, Var.GLOBAL, False, line)
            self.stbl.pushVar(var)
            method.pushParam(var_type)
        self.visit(ctx.block())
        # TODO: additional checks for methods expecting return value
        if (method.has_return == False):
            if (method.return_type == 'void'):
                print('Error on line', line,
                ' Void methods cannot return an expression')


        self.visitReturn(ctx)
        self.stbl.popFrame()

    def visitReturn(self, ctx):
        method_ctx = self.stbl.getMethodContext()
        method_ctx.has_return = True
        #print(method_ctx)
        if (ctx.expr() != None):
            expr_type = self.visit(ctx.expr())

            # TODO: type checking, ...

    def visitMethod_call(self, ctx):
        line = ctx.start.line
        # TODO: get details and find method in symbol table
        method = ctx
        method_id =ctx.ID()
        params = ctx.expr()
        NumOfParams = len(ctx.expr())
        doesMethodExist = self.stbl.find(str(method_id))
        if(doesMethodExist == None):
            print('Error on line', line,
                  'the method:', method_id,  'is not defined')
        else:
        # TODO: check method call has same number of params
            if(len(doesMethodExist.param) == NumOfParams):


                # TODO if method is import (no signature) show warning
                meth = self.stbl.peek(method_id)
                for i in range(NumOfParams):
                    expr_type = self.visit(ctx.expr(i))
                    param_type = method.param[i]
                # TODO: check type match, report erros
                    if (expr_type == param_type):
                        #cont
                        pass
                    else:
                        print('Error on line', line,
                              'incorrect parameter type')
            else:
                print('Error on line', line,
                      'there is a incorrect amount of parameters used')

    def visitImport_stmt(self, ctx):
        # TODO: gather details (method id, line, etc)

        line = ctx.start.line #sets the line number
        n_import_id = len(ctx.ID()) #sets the number of loops that will have to do
        imports = []

        # TODO: check symbol table for duplicates
        #print(n_import_id)
        for i in range(n_import_id):
            imports.append(ctx.ID(i).getText())
            print(ctx.ID(i).getText())
        
        total = imports.count(ctx.ID(0).getText())
        print(total)
        for i in range(n_import_id):
            if total >= 2:
                print('there is an error on line ', line,
                      'the import statement ', ctx.ID(i), 'has already been declared')
                i = 200
        '''
        for i in range(n_import_id):
            import_id = ctx.ID(i)  # get the import statements
            #print('scanning import: ',import_id)
            id = self.stbl.find(import_id)

            print(import_id,id)
            if (id != None):
                print('there is an error on line ', line,
                      'the import statement ', import_id, 'has already been declared')

            # TODO: add to symbol table
            imprort_symbol = Import(id= import_id, return_type='int', line =line)
            self.stbl.pushVar(import_symbol)
        '''
    
    def visitExpr(self, ctx):
        if (ctx.literal() != None):
            return self.visit(ctx.literal())
        elif (ctx.location() != None):
            return self.visit(ctx.location())
        elif (len(ctx.expr()) == 2):
            expr0_type = self.visit(ctx.expr(0))
            expr1_type = self.visit(ctx.expr(1))
        # TODO: return highest precedence type
            if (expr0_type == 'float' and expr1_type != 'float'):
                return expr0_type
            elif (expr1_type == 'float' and expr0_type != 'int'):
                return expr0_type
            elif (expr0_type == 'int' and expr1_type != 'float'):
                return expr0_type
            elif (expr1_type == 'int' and expr0_type != 'float'):
                return expr1_type
        elif (ctx.data_type() != None):
        # TODO: return data type
            return ctx.data_type().getText()
        else:
            return self.visitChildren(ctx)

    def visitLiteral(self, ctx):
        if (ctx.INT_LIT() != None):
            return 'int'
        # TODO: bools, etc...
        elif (ctx.STRING_LIT() != None):
            return 'string'
        elif (ctx.bool_lit() != None):
            return 'bool'
        elif (ctx.CHAR_LIT() !=None):
            return 'char'
        elif (ctx.FLOAT_LIT() !=None):
            return 'float'
    
    def visitLocation(self, ctx):
        var_id = ctx.ID().getText()
        # TODO: check the variable is declared (all scopes)
        check = self.stbl.find(var_id)
    # TODO: return type of variable if found...
        if(check != None):
            return check.data_type

                

    
    
#load source code
filein = open('./test.coffee', 'r')
source_code = filein.read();
filein.close()

#create a token stream from source code
lexer = CoffeeLexer(antlr.InputStream(source_code))
stream = antlr.CommonTokenStream(lexer)

#parse token stream
parser = CoffeeParser(stream)
tree = parser.program()

#create Coffee Visitor object
visitor = CoffeeTreeVisitor()

#visit nodes from tree root
visitor.visit(tree)

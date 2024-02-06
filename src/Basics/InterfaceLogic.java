package Basics;

interface ExpressionLike {
}

//Example  column > value  column is left, > is operator, value is right
class Expression implements ExpressionLike {
    String left, right;
    String operator;
    Expression(String left, String operator, String right) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}

//Example :- (column1 > value1) and (column2 < value2) and (column3 != value3)
// here args = (column1 > vaue1),(column2 < vaue2),(column3 != vaue3)
// operator = and
class ExpressionClause implements ExpressionLike {
    ExpressionLike[] args;
    String operator;

    ExpressionClause(ExpressionLike[] args, String operator) {
        this.args = args;
        this.operator = operator;
    }

    public ExpressionLike[] getArgs() {
        return args;
    }

    public void setArgs(ExpressionLike[] args) {
        this.args = args;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}

class Solution {

    //compare expressions and return true if both are same,
    static boolean compareExpressions(ExpressionLike expression1, ExpressionLike expression2) {
        // implement solution
        if(expression1 instanceof Expression && expression2 instanceof Expression){
            Expression e1 = (Expression) expression1;
            Expression e2 = (Expression) expression2;
            if(!e1.getLeft().equalsIgnoreCase(e2.getLeft()))
            {
                return false;
            }
            if(!e1.getRight().equalsIgnoreCase(e2.getRight())){
                return false;
            }
            if(!e1.getOperator().equalsIgnoreCase(e2.getOperator())){
                return false;
            }
            return true;
        }
        // print the result at the end
        return false;
    }
}


public class InterfaceLogic {
    public static void main(String[] args) {
        //Case 1  => true
        boolean var = Solution.compareExpressions( new Expression("a" , ">", "b"), new Expression("a" , ">", "b"));
        System.out.println(var);
    }
}


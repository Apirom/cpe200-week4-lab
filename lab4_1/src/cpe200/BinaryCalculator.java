package cpe200;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand;
    }

    public String add() {
        double a,b;
        a = Double.parseDouble(firstOperand.operand);
        b = Double.parseDouble(secondOperand.operand);
        if(a == (int)(a)&&b==(int)(b))
        {
            return Integer.toString((int)(a+b));
        }else
        {
            return Double.toString((a+b));
        }

    }

    public String subtract() {
        double a,b,x;
        a = Double.parseDouble(firstOperand.operand);
        b = Double.parseDouble(secondOperand.operand);
        if( a == (int)(a) && b == (int)(b))
        {
            return Integer.toString((int)(a - b));
        }else
        {
            x = (a-b)*10;
            x = (int)(x);
            x = x/10;
            return Double.toString(x);
        }
    }

    public String multiply() {
        double a,b;
        a = Double.parseDouble(firstOperand.operand);
        b = Double.parseDouble(secondOperand.operand);
        if(a == (int)(a)&&b==(int)(b))
        {
            return Integer.toString((int)(a*b));
        }else
        {
            return Double.toString((a*b));
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        double a,b;
        a = Double.parseDouble(firstOperand.operand);
        b = Double.parseDouble(secondOperand.operand);
        if(b == 0)
        {
            int x=(int)(a)/0;
          //  System.out.print("The operation must raise an exception");
            return Integer.toString(x);
        }else if(a%b == 0){
            return Integer.toString((int)(a/b));
        }else{
            double x;
            x = (a/b)*100000;
            x = Math.round(x);
            x /=100000;
            return Double.toString(x);
        }
    }

    public String power() {
        double a,b;
        int x=1;
        a = Double.parseDouble(firstOperand.operand);
        b = Double.parseDouble(secondOperand.operand);
        for(int i=0;i<(int)(b);i++)
        {
            x *= a ;
        }
        return Integer.toString(x);
    }

}

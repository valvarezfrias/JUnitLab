public class Calculator {


    public int add(int x, int y){
        return x + y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public int multiply(int x, int y){
        return x*y;
    }

    public float divide(int x, int y){
        return x/y;
    }

    public boolean and(boolean x, boolean y){
        return x & y;
    }


    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }


}
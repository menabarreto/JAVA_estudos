public class Factorial {
    public static long calculate(long c) {
        if (c == 0) {
            return 1;
        }
        return c * calculate(c - 1);
    }
    public static void main(String[]args){
        long number = 4;
        System.out.println(number);
        System.out.println(calculate(number));

    }
}

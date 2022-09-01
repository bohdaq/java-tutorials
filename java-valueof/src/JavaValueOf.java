public class JavaValueOf {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);

        Integer firstNumber = Integer.valueOf(args[0]);
        Integer secondNumber = Integer.valueOf(args[1]);


        Integer result = firstNumber + secondNumber;
        System.out.println(result);
    }
}

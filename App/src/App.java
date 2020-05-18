import static java.lang.Math.pow;

public class App {
    public static void main(String[] args) {
        int pow = 1;
        int number = 0;
        int resultPow = 1;
        try {
            number = Integer.parseInt(args[0]);
            pow = Integer.parseInt(args[1]);
        } catch (Exception ex) {
            System.out.println("Please enter the number");
            System.exit(1);
        }
        for (int i = 0; i < pow; i++) {
            resultPow *= number ;
        }
        System.out.println("The result of operation pow (" + number + ","
                + pow + ") : " + resultPow);

    }
}

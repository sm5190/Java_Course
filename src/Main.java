import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.printf ("Enter the 1st number:");
        double int1= scanner.nextDouble();

        System.out.printf ("Enter the 2nd number:");
        double int2= scanner.nextDouble();


        System.out.printf ("Enter the operation:");
        String op= scanner.next();

        double res= 0d;

        if( op.equals("+"))
        {
            res= int1 + int2;
            System.out.println("Result:"+ res);
        } else if (op.equals("-")) {

            res= int1 - int2;
            System.out.println("Result:"+ res);

        } else if (op.equals("*")) {

            res= int1 * int2;
            System.out.println("Result:"+ res);

        }
        else
        {
            res= int1 / int2;
            System.out.println("Result:"+ res);
        }
    }
}
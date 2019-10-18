import java.util.Scanner;
public class DriveCode
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        // Input X1 - X1
        System.out.println("Input a very big positive number: ");
        System.out.print("X1 = ");
        String numtxt1 = userInput.nextLine();
        BigNum X1 = new BigNum();
        X1.setNumtxt(numtxt1);

        // Input X2 - X2
        System.out.println("Input ANOTHER very big positive number: ");
        System.out.print("X2 = ");
        String numtxt2 = userInput.nextLine();
        BigNum X2 = new BigNum();
        X2.setNumtxt(numtxt2);

        System.out.println("-----\nOperations using these parameters");
        System.out.print("X1 = ");
        X1.displayNumber();
        System.out.print("X2 = ");
        X2.displayNumber();

        boolean X1isBigger = BigOper.comparator(X1.getNumber(), X2.getNumber());

        // Addition - sum
        System.out.print("X1 + X2 = ");
        BigNum sum = new BigNum();
        sum.setNumber(BigOper.addition(X1.getNumber(),X2.getNumber()));
        sum.displayNumber();

        // Substraction - difference
        System.out.print(X1isBigger ? "X1 - X2 =  " : "X2 - X1 =  " );
        BigNum difference = new BigNum();
        difference.setNumber(BigOper.subtraction(X1.getNumber(),X2.getNumber()));
        difference.displayNumber();

        // Multiplication product
        System.out.print("X1 * X2 =  ");
        BigNum product = new BigNum();
        product.setNumber(BigOper.multiplication(X1.getNumber(),X2.getNumber()));
        product.displayNumber();


        // Division -  quotient
        System.out.print(X1isBigger ? "X1 - X2 =  " : "X2 - X1 =  " );
        BigNum quotient = new BigNum();
        quotient.setNumber(BigOper.division(X1.getNumber(),X2.getNumber()));
        quotient.displayNumber();

        // Remainer -  remainder
        System.out.print("remainder = ");
        BigNum remainder = new BigNum();
        remainder.setNumber(BigOper.returnRemainder());
        remainder.displayNumber();
    }
}

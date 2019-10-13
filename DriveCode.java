import java.util.Scanner;
public class DriveCode
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        //Create bn1
        System.out.println("Input a very big positive number: ");
        String numtxt1 = userInput.nextLine();
        BigNum bn1 = new BigNum();
        bn1.setNumtxt(numtxt1);
        bn1.displayNumber();

        //Create bn2
        System.out.println();
        System.out.println("Input ANOTHER very big positive number: ");
        String numtxt2 = userInput.nextLine();
        BigNum bn2 = new BigNum();
        bn2.setNumtxt(numtxt2);
        bn2.displayNumber();

        //Create big operator
        BigOper bo = new BigOper();

        //Create bn3
        System.out.println();
        System.out.println("Subtraction of them (Bigger number will subtract smaller one): ");
        BigNum bn3 = new BigNum();
        bn3.setNumber(bo.subtraction(bn1.getNumber(),bn2.getNumber()));
        bn3.displayNumber();

        //Create bn4
        System.out.println();
        System.out.println("Addition of them: ");
        BigNum bn4 = new BigNum();
        bn4.setNumber(bo.addition(bn1.getNumber(),bn2.getNumber()));
        bn4.displayNumber();

        //Create bn5
        System.out.println();
        System.out.println("Multiplication of them: ");
        BigNum bn5 = new BigNum();
        bn5.setNumber(bo.multiplication(bn1.getNumber(),bn2.getNumber()));
        bn5.displayNumber();


        //Create bn6
        System.out.println();
        System.out.println("Division of them: ");
        BigNum bn6 = new BigNum();
        bn6.setNumber(bo.division(bn1.getNumber(),bn2.getNumber()));
        bn6.displayNumber();

        //Create bn7
        System.out.println();
        System.out.println("R: ");
        BigNum bn7 = new BigNum();
        bn7.setNumber(bo.returnR());
        bn7.displayNumber();
    }
}

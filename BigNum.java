import java.util.ArrayList;
public class BigNum
{
    private String numtxt;
    final static private String[] suffix = new String[] {"Unit", "Thousand", "Million", "Billion", "Trillion", "Quadrillion", "Quintillion", "Sextillion", "Septillion", "Octillion", "Decillion", "Undecillion", "Duodecillion", "Tredecillion", "Quattuordecillion", "Quinquadecillion", "Sedecillion", "Octodecillion", "Novendecillion"};
    private ArrayList<String> number;

    public BigNum()
    {
        number = new ArrayList<String>();
    }

    public BigNum(String numtxt) {
        setNumtxt(numtxt);
    }

    //Getter and setter for ArrayList<String> number
    public void setNumber(ArrayList<String> num)
    {
        number = (ArrayList<String>) num.clone(); //FIXME: This cause a Warning: unchecked cast
    }

    public ArrayList<String> getNumber()
    {
        return number;
    }
    //Setter and Processor for String numtxt
    public void setNumtxt(String numtxt)
    {
        this.numtxt = numtxt;
        processNumtxt();
    }
    public void processNumtxt()
    {
        //Create size for ArrayList<String> number
        int n = (numtxt.length() / 3);
        if (numtxt.length() % 3 != 0)
        {
            n++;
        }

        //Create an inverse string of numtxt
        String numtxtInv = "";
        for (int k = numtxt.length() - 1; k >= 0; k--)
        {
            numtxtInv = numtxtInv + numtxt.charAt(k);
        }

        //Add elements to ArrayList<String> number
        int i, j = 0;
        for (i = 0; i < n; i++)
        {
            String sub = new String();
            String subInv = "";

            if ( n*3 - j == 3)
            {
                sub = numtxtInv.substring(j);
                for (int p = sub.length() - 1; p >= 0; p--)
                {
                    subInv = subInv + sub.charAt(p);
                }
            }
            else
            {
                sub = numtxtInv.substring(j,j+3);
                for (int p = sub.length() - 1; p >= 0; p--)
                {
                    subInv = subInv + sub.charAt(p);
                }
            }
            number.add(subInv);
            j += 3;
        }
    }
    public void displayNumber()
    {
        for (int i = number.size() - 1; i >= 0; i--)
        {
            if (i != 0)
            {
                System.out.print(number.get(i) + ",");
            }
            else System.out.print(number.get(i) + "\n");
        }
    }
    public void displayNumberExtra()
    {
        for (int i = number.size() - 1; i >= 0; i--)
        {
            if (i != 0)
            {
                if (i < suffix.length )
                {
                    System.out.print(number.get(i) + " " + suffix[i] + " ");
                }
                else
                {
                    System.out.print(number.get(i) + " SNF ");
                    // SNF is suffix not found
                }
            }
            else System.out.print(number.get(i) + " " + suffix[i] + ".");
        }
    }
}

import java.util.ArrayList;

public class BigOper
{

    public ArrayList<String> addition(ArrayList<String> num1, ArrayList<String> num2)
    {
        ArrayList<String> outputNumber = new ArrayList<String>();
        int n;
        if (num1.size() >= num2.size())
        {
            n = num1.size();
            for(int i = num1.size() - num2.size(); i >=0; i--)
            {
                num2.add("000");
            }
        }
        else
        {
            n = num2.size();
            for(int i = num2.size() - num1.size(); i >=0; i--)
            {
                num1.add("000");
            }
        }

        int carrier = 0;
        for (int i = 0; i < n; i++)
        {
            int sub1 = Integer.parseInt(num1.get(i));
            int sub2 = Integer.parseInt(num2.get(i));
            int sumSub = sub1 + sub2 + carrier;
            if (sumSub >= 1000)
            {
                carrier = (sumSub - (sumSub % 1000))/1000;
            }
            else carrier = 0;
            int outputSub = sumSub % 1000;
            outputNumber.add(String.format ("%03d", outputSub));
        }
        if (carrier != 0)
        {
            outputNumber.add(String.format ("%01d", carrier));
        }
        else
        {
            for (int i = outputNumber.size() - 1; i >= 0; i--)
            {
                if(outputNumber.get(i).equals("000"))
                {
                    outputNumber.remove(i);
                }
                else
                {
                    int temp = Integer.parseInt(outputNumber.get(i));
                    outputNumber.remove(i);
                    outputNumber.add(Integer.toString(temp));
                    break;
                }
            }
        }
        return outputNumber;
    }
    public ArrayList<String> subtraction (ArrayList<String> num1, ArrayList<String> num2)
    {
        ArrayList<String> outputNumber = new ArrayList<String>();
        int n = 0;
        boolean num1_is_bigger_than_num2 = false;
        boolean num1_is_equal_num2 = false;
        if (num1.size() > num2.size())
        {
            n = num1.size();
            num1_is_bigger_than_num2 = true;
            num1_is_equal_num2 = false;
            for(int i = num1.size() - num2.size(); i >=0; i--)
            {
                num2.add("000");
            }
        }
        else
        {
            if (num1.size() < num2.size())
            {
                n = num2.size();
                num1_is_bigger_than_num2 = false;
                num1_is_equal_num2 = false;
                for(int i = num2.size() - num1.size(); i >=0; i--)
                {
                    num1.add("000");
                }
            }
            else
            {
                for (int i = num1.size() - 1; i >= 0; i--)
                {
                    int sub1 = Integer.parseInt(num1.get(i));
                    int sub2 = Integer.parseInt(num2.get(i));
                    if (sub1 > sub2)
                    {
                        n = num1.size();
                        num1_is_bigger_than_num2 = true;
                        num1_is_equal_num2 = false;
                        break;
                    }
                    else
                    {
                        if (sub1 < sub2)
                        {
                            n = num2.size();
                            num1_is_bigger_than_num2 = false;
                            num1_is_equal_num2 = false;
                            break;
                        }
                        else
                        {
                            if (sub1 == sub2)
                            {
                                num1_is_equal_num2 = true;
                            }
                        }
                    }
                }
            }
        }

        if (num1_is_equal_num2 == true)
        {
            outputNumber.add("0");
        }
        else
        {
            int carrier = 0;
            if (num1_is_bigger_than_num2 == true)
            {
                for (int i = 0; i < n; i++)
                {
                    int sub1 = Integer.parseInt(num1.get(i));
                    int sub2 = Integer.parseInt(num2.get(i));
                    int minusSub;
                    if (sub1 - sub2 < 0)
                    {
                        minusSub = 1000 + sub1 - sub2 + carrier;
                        carrier = -1;
                    }
                    else
                    {
                        minusSub = sub1 - sub2 + carrier;
                        carrier = 0;
                    }
                    outputNumber.add(String.format ("%03d", minusSub));
                }
            }
            else
            {
                for (int j = 0; j < n; j++)
                {
                    int sub1 = Integer.parseInt(num1.get(j));
                    int sub2 = Integer.parseInt(num2.get(j));
                    int minusSub;
                    if (sub2 - sub1 < 0)
                    {
                        minusSub = 1000 + sub2 - sub1 + carrier;
                        carrier = -1;
                    }
                    else
                    {
                        minusSub = sub2 - sub1 + carrier;
                        carrier = 0;
                    }
                    outputNumber.add(String.format ("%03d", minusSub));
                }
            }
            for (int i = outputNumber.size() - 1; i >= 0; i--)
            {
                if(outputNumber.get(i).equals("000"))
                {
                    outputNumber.remove(i);
                }
                else
                {
                    int temp = Integer.parseInt(outputNumber.get(i));
                    outputNumber.remove(i);
                    outputNumber.add(Integer.toString(temp));
                    break;
                }
            }
        }

        return outputNumber;
    }
}

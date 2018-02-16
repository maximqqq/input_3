import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//объект для ввода
        System.out.println("Введи выражения");




            String temp = in.nextLine();


            String[] num;
            num = temp.split("[-+/*^%]");

            char[] z;
            z = temp.toCharArray();

            List<Character> znac = new ArrayList<>();

            for (int i =0; i<z.length; i++)
            {
                if(z[i]=='+'||z[i]=='-'||z[i]=='/'||z[i]=='*'||z[i]=='^'||z[i]=='%')
                {
                    znac.add(z[i]);
                }

            }

            double[] numbers = new double[num.length];

            for(int i = 0; i<num.length;i++)
            {
                numbers[i]=Double.parseDouble(num[i]);
            }

            double result = 0;

            result += numbers[0];

            for(int i = 0; i<znac.size();i++)
            {
                char buf = znac.get(i);
                switch (buf)
                {
                    case'+':
                        result += numbers[i+1];
                        System.out.printf("%.0f+%.0f=%.5f",numbers[0],numbers[i+1],result );
                        break;
                    case'-':
                        result -= numbers[i+1];
                        System.out.printf("%.0f+%.0f=%.5f",numbers[0],numbers[i+1],result );
                        break;
                    case'/':
                        if(numbers[i+1]<=0){

                            throw new IllegalArgumentException("Division by zero");//!!!!!!!
                        }
                        else{
                            result /= numbers[i+1];
                            System.out.printf("%.0f+%.0f=%.5f",numbers[0],numbers[i+1],result );}

                        break;
                    case'*':
                        result *= numbers[i+1];
                        System.out.printf("%.0f+%.0f=%.5f",numbers[0],numbers[i+1],result );
                        break;
                    case'^':
                        result =0;
                        result =Math.pow(numbers[0],numbers[i+1]);//!!!!!
                        System.out.printf("%.0f+%.0f=%.5f",numbers[0],numbers[i+1],result );
                        break;
                    case'%':
                        result *=numbers[i+1]/100;
                        System.out.printf("%.0f+%.0f=%.5f",numbers[0],numbers[i+1],result );
                        break;
                }
            }

//            System.out.print(result);

        }
        }





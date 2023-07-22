import java.util.Scanner;
public class calculator 
{
    public void calculator()
    {  
            System.out.println("***JAVA CALCULATOR***");
            System.out.println("----------------------");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n6. Exit.");
            System.out.println("-----------------------------");
            System.out.print("Enter the choice from 1-5: ");
            Scanner input =new Scanner(System.in);
            int n = input.nextInt();
            System.out.println("-----------------------------");
            System.out.print("You entered "+ n+"-");

         switch(n)
         {
            case 1:
            {
                System.out.print("Addition\n");
                System.out.print("Enter number 1: ");
                int a = input.nextInt();
                System.out.print("Enter number 2: ");
                int b = input.nextInt();
                int sum= a+b;
                System.out.println("Addition of "+a+" + "+b+" = "+sum);
                break;
            }
            case 2:
            {
                System.out.print("Subtraction\n");
                System.out.print("Enter number 1: ");
                int a = input.nextInt();
                System.out.print("Enter number 2: ");
                int b = input.nextInt();
                int sub= a-b;
                System.out.println("Subtraction of "+a+" - "+b+" = "+sub);
                break;
            }
            case 3:
            {
                System.out.print("Multiplication\n");
                System.out.print("Enter number 1: ");
                int a = input.nextInt();
                System.out.print("Enter number 2: ");
                int b = input.nextInt();
                int mul= a*b;
                System.out.println("Multiplication of "+a+" * "+b+" = "+mul);
                break;
            }
            case 4:
            {
                System.out.print("Division\n");
                System.out.print("Enter number 1: ");
                int a = input.nextInt();
                System.out.print("Enter number 2: ");
                int b = input.nextInt();
                int div= a/b;
                System.out.println("Division of "+a+" / "+b+" = "+div);
                break;
            }
            case 5:
            {
                System.out.print("Modulus\n");
                System.out.print("Enter number 1: ");
                int a = input.nextInt();
                System.out.print("Enter number 2: ");
                int b = input.nextInt();
                int mod= a%b;
                System.out.println("Modulus of "+a+" % "+b+" = "+mod);
                break;
            }
            case 6: {
                System.out.println("Exited.");
                break;
            }

            default: System.out.println("Invalid!");
         }
         System.out.println("------------------------------------------");
         System.out.println("***Thank you for using JAVA CALCULATOR***");
         input.close();
        }
    
    public static void main(String args[])
    {
        calculator myObj= new calculator();
        myObj.calculator();
    }
}

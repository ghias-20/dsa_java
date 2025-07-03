import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,ans=0;
        while(true){
            System.out.print("Enter operation to perform on two numbers: ");
            char op = sc.next().charAt(0);
            if(op=='+' || op=='-'|| op=='*' || op=='/' || op=='%'){
                System.err.print("Enter two numbers to perform opeartions : ");
                num1=sc.nextInt();
                num2=sc.nextInt();
                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans = num1-num2;
                }
                if(op=='*'){
                   ans=num1*num2;
                }
                if(op=='/'){
                    if(num2>0){
                        ans=num1/num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }
                System.out.println(ans);
            }
            else if(op=='x' || op=='X'){
                break;
            }
            else{
                System.out.println("Invalid option entered.");
            }
        }
    }
}
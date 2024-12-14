import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt();

        int rev=0;

        int digit;

        int num=a;

        while(a!=0){
           
            digit=a%10;

            rev=(rev*10)+digit;

            a=a/10;

        }

        if(num==rev){
            System.out.println("its Palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }
    }
}

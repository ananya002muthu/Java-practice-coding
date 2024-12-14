import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        String rev=""; int i;

        for(i=s.length()-1;i>=0;i--){
              
            rev=rev+s.charAt(i);

        }
        if(rev.equals(s)){

            System.out.println("its palindrome");
        }
        else{

            System.out.println("its not palindrome");
        }

    }
}

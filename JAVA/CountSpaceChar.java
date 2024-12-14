import java.util.*;
public class CountSpaceChar {
    
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter a sentence:");

      String s=sc.nextLine();

      int i;

      int s_count=0;

      int c_count=0;

      for(i=0;i<s.length();i++){

        char c=s.charAt(i);

        if(c==' '){

            s_count++;
        }
        else if(c>='a'||c<='z'||c>='A'||c<='z'){
        
            c_count++;
        }
      }
      System.out.println("Space count:"+s_count);
      System.out.println("character count:"+c_count);
    }
}

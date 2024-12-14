import java.util.*;

public class NonRepeatChar {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a String");

        String s=sc.nextLine();

        String temp="";
    
        int i;

        for(i=0;i<s.length();i++){

          if(temp.indexOf(s.charAt(i))==-1){

            temp=temp+s.charAt(i);
          }
            
        }
        System.out.println(temp);
    }
}

import java.util.*;

public class StringWordLastChar {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        String[] arr=s.split(" ");

        int i;

        for(i=0;i<arr.length;i++){

            String word=arr[i];

            char c=word.charAt(word.length()-1);

            if(Character.isDigit(c)){

                continue;
            }
            System.out.println(c);
        }
    }
}

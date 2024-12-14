import java.util.*;

public class StringWordFirstChar { 
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        String[] arr=s.split(" ");

        int i;

        for(i=0;i<arr.length;i++){

            String word=arr[i];

            char c=word.charAt(0);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){

                System.out.println(c);
            }
    
        }
    }
}


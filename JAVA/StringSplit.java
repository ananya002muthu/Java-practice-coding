//In the main method , read a string and find the count of words starting with a vowel in the string. If no words are present in the String value then it should print "No String found".
//Note: All search should be case insensitive.
//Sample input1:
//Everyone should practice and learn to became professional.
//Output: 2
//Sample input2: hi guys
import java.util.*;

public class StringSplit {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in); 

        String s1=sc.nextLine();

        String[] s2=s1.split(" ");

        int i;
       
        int vcount=0;
        for(i=0;i<s2.length;i++){

            char f=s2[i].charAt(0);
            
            if(f=='A'||f=='E'||f=='I'||f=='O'||f=='U'||f=='a'||f=='e'||f=='i'||f=='o'||f=='u');{

            vcount++;
            }
        }
        if(vcount>0){

            System.out.println(vcount);
        }
        else{

            System.out.println("no string found");
        }

        }

}

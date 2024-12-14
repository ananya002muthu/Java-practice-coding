import java.util.*;
public class LargestWordInScentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

            System.out.println("Enter a Scentence:");

            String s=sc.nextLine();
            String[] arr=s.split(" ");
            String large="";
            int i=0;
            for(i=0;i<arr.length;i++){
                
                if(arr[i].length()>large.length()){

                    large=arr[i];
                }
            }
            System.out.print(large);
        }
    }


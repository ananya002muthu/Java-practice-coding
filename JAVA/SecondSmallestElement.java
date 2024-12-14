import java.util.*;

public class SecondSmallestElement {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter array size:");

        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter array elements:");

        int i;

       int min1=Integer.MAX_VALUE;

       int min2=Integer.MAX_VALUE;

        for(i=0;i<size;i++){

            arr[i]=sc.nextInt();
        }

        for(i=0;i<size;i++){

            if(arr[i]<min1){

                min2=min1;

                min1=arr[i];
            }

            else if(arr[i]<min2 && arr[i]>min1){

                min2=arr[i];
            }
        }

        System.out.println("Smallest element:"+ min1);

        System.out.println(" Second Smallest element:"+ min2);
    }
}



import java.util.*;

public class SecondLargeElement {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter array size:");

        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter array elements:");

        int i;

       int max1=Integer.MIN_VALUE;

       int max2=Integer.MIN_VALUE;

        for(i=0;i<size;i++){

            arr[i]=sc.nextInt();
        }

        for(i=0;i<size;i++){

            if(arr[i]>max1){

                max2=max1;

                max1=arr[i];
            }

            else if(arr[i]>max2 && arr[i]<max1){

                max2=arr[i];
            }
        }

        System.out.println("large element:"+ max1);

        System.out.println(" Second large element:"+ max2);
    }
}

import java.util.*;

public class ArraySameEelment {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[5];
        int[] arr2=new int[5];
        int i,j;

        System.out.println("Enter arr1 elements:");

        for(i=0;i<5;i++){

            arr1[i]=sc.nextInt();
        }
         
        System.out.println("Enter arr2 elements:");

        for(i=0;i<5;i++){

            arr2[i]=sc.nextInt();
        }

        System.out.println("common elements:");

        for(i=0;i<5;i++){

            for(j=0;j<5;j++){

            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]+" ");
            }
            }
        }
    }
}

import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        
     Scanner sc=new Scanner(System.in);

     int size,i;
     int insertPosition=0;

     System.out.println("Enter Size of an array:");
     
     size=sc.nextInt();

     int[] arr=new int[size];

     System.out.println("Enter array elements:");
     
     for(i=0;i<size;i++){

        arr[i]=sc.nextInt();
     }

     for(i=0;i<size;i++){

        if(arr[i]!=0){

            arr[insertPosition]=arr[i];
            insertPosition++;
        }
     } 
     
     while(insertPosition<size){

        arr[insertPosition++]=0;
     }
System.out.println("-------------------------------------");
     for(i=0;i<size;i++){

        System.out.println(arr[i]);
     }
    }
}

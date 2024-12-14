import java.util.*;

public class HandsOn {
    public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    int[] arr=new int[5];
    
    int i;
    
    for(i=0;i<5;i++){
    
    arr[i]=sc.nextInt();
    
    }
    
    int limit1=sc.nextInt();
    
    int limit2=sc.nextInt();

    int sum=0;

 int count=0;

for(i=0;i<5;i++){
if(arr[i]>limit1 && arr[i]<limit2){

sum=sum+arr[i];
 count++;

}

}

int avg;

avg=sum/count;

System.out.println(avg);

}

}
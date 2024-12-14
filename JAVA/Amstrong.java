import java.util.*;
import java.math.*;
public class Amstrong {
    public static void main(String[] ards){

    System.out.println("enter a number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    int num=n;
    int digit=0;

    while(n>0){
       n=n/10;
       digit++;
    }
    System.out.println("No of digit:"+digit);

    double sum=0;
    int rem;
    while(num>0){
        rem=num%10;
        sum=sum+Math.pow(rem, digit);
        num=num/10;
    }
    System.out.println(sum);
    if(sum==temp){
        System.out.println("given No "+temp+" is Amstrong number");
    }
    else{
        System.out.println("Given number is not a Amstrong Number");
    }
    }

}

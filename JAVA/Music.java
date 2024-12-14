import java.util.*;
import java.math.*;
public class Music {
    
    public static void main(String[] args){

MusicPlayer[] musi=new MusicPlayer[4];
Scanner sc=new Scanner (System.in);
      for(int i=0;i<musi.length;i++){

        int a = sc.nextInt();sc.nextLine();
        String b = sc.nextLine();
        int c = sc.nextInt();sc.nextLine();
        int d = sc.nextInt();sc.nextLine();
        musi[i] = new MusicPlayer(a,b,c,d);
      }

      int num = sc.nextInt();sc.nextLine();
      int dur = sc.nextInt(); sc.nextLine();

      int method1=AvgCount(musi, num);
      if(method1==0){
        System.out.println("No playlist found");
      }
      else{
        System.out.println(method1);
      }

     MusicPlayer[] method2=MoreDur(musi,dur) ;
     if(method2.length!=0){
      for(int i=0;i<method2.length;i++){
         System.out.println(method2[i].getDuration());
      }
     }
     else{
        System.out.println("no such a PlayList");
     }
    

    }
       public static int AvgCount(MusicPlayer[] musi,int num){
      int  sum=0;
      int count=0;
        for(int i=0;i<musi.length;i++){
            if(musi[i].getCount()>num){
                 sum=sum+musi[i].getCount();
                 count++;
            }
        }
        if(count>0){
            int avg=sum/count;
            return avg;
        }
        else{
        return 0;
       }
    }

       public static MusicPlayer[] MoreDur(MusicPlayer[] musi,int dur){
        MusicPlayer[] arr=new MusicPlayer[0];
        for(int i=0;i<musi.length;i++){
            if(musi[i].getDuration()>dur){
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=musi[i];
            }
        }
        MusicPlayer temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].getDuration()>arr[j].getDuration())
                {
                     temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
          //  return arr;
        }
         return arr;
       }
}


class MusicPlayer
{
    int pNo, count;
    String type;
    int duration;
    
    public MusicPlayer(int pNo, String type, int count, int duration)
    {
        this.pNo = pNo;
        this.type = type;
        this.count = count;
        this.duration = duration;
    }
    
    public int getPNo()
    {
        return pNo;
    }
    public void setPNo(int pNo)
    {
        this.pNo = pNo;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count = count;
    }
    public int getDuration()
    {
        return duration;
    }
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
}
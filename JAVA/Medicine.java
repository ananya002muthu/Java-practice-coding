import java.util.*;
public class Medicine {
    public static void main(String[] args){

       Medi[] Medi=new Medi[4];
       Scanner sc=new Scanner (System.in);
       int i;
       for(i=0;i<Medi.length;i++){
        String MedicineName=sc.nextLine();
        String Batch=sc.nextLine();
        String Disease=sc.nextLine();
        sc.nextLine();
        int Price=sc.nextInt();
        sc.nextLine();

        Medi[i]=new Medi(MedicineName,Batch,Disease,Price);
       }
       
       String inDisease=sc.nextLine();

       int opPrice=GetPriceByDisease(Medi,inDisease);
       System.out.println(opPrice);
    }
//int j;
    public static int GetPriceByDisease(Medi[] Medi,String Disease){
        for(int i=0;i<Medi.length;i++){
            if(Medi[i].getDisease().equalsIgnoreCase(Disease)){
                return Medi[i].getPrice();
            }
        }
        return -1;
    }

    }

class Medi{
    private String MedicineName;
    private String Batch;
    private String Disease;
    private int Price;

    public void setMedicineName(String MedicineName){
        this.MedicineName=MedicineName;
    }
   public String getMedicineName(){
    return MedicineName;
   }

    public void setBatch(String Batch){
        this.Batch=Batch;
        }
     public String getBatch(){
            return Batch;
           }

    public void setDisease(String Disease){
            this.Disease=Disease;
                }
    public String getDisease(){
                    return Disease;
                   }
    public void setPrice(int Price){
            this.Price=Price;
                        } 
    public int getPrice(){
            return Price;
                           }                  
                    
                        
    Medi(String  MedicineName,String Batch,String Disease,int Price)    {
        this.MedicineName=MedicineName;
        this.Batch=Batch;
        this.Disease=Disease;
        this.Price=Price;
    }                

}

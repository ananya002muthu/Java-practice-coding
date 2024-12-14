class Number{
private int a;
private int b;

public void seta(int a)
{
    this.a=a;
}
public void setb(int b)
{
    this.b=b;
}
public int geta()
{
    return a;
}
public int getb()
{
    return b;
}
}
public class Sample2{
    public static void main(String[] args) {
  Number num=new Number();
  num.seta(1);
  num.setb(2);
int num1=num.geta();
int num2=num.getb();
System.out.println(num1+num2);
    }
}
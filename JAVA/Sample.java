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
public int add()
{
return a+b;
}
public int sub()
{
return a-b;
}
public int multiply()
{
return a*b;
}
public int division()
{
return a/b;
}
}
public class Sample{
    public static void main(String[] args) {
        Number number=new Number();
number.seta(2);
number.setb(4);
        System.out.println(number.add());
        System.out.println(number.sub());
        System.out.println(number.multiply());
        System.out.println(number.division());
    }
}
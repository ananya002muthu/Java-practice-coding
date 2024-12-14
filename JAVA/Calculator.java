class Number{
    private int a;
    private int b;
    
    Number(int a,int b)
    {
    this.a=a;
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
public class Calculator {
    public static void main(String[] args) {
        Number number=new Number(2,4);

        System.out.println(number.add());
        System.out.println(number.sub());
        System.out.println(number.multiply());
        System.out.println(number.division());
    } 
}

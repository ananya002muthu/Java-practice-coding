class ParentShape{
    private String shape;
    ParentShape(String shape)
{
    this.shape=shape;
}
public  String getShape(){
return shape;
}

}

class Square extends ParentShape{
    private int side;
Square(String shape,int side){
    super(shape);
    this.side=side;
}
public  int getSide(){
    return side;
    }
public int area(){
    return side*side;
}
}
class Circle extends ParentShape{
    private int radius;
    Circle(String shape,int radius){
        super(shape);
this.radius=radius;
    }
    public  int getRadius(){
        return radius;
        }
    public double area(){
        return 3.14*radius*radius;
    }
}
class Rectangle extends ParentShape{
    private int l,b;

    Rectangle(String shape,int l,int b){
        super(shape);
        this.l=l;
        this.b=b;
    }
    public  int getl(){
        return l;
        }
        public  int getb(){
            return b;
            }
    public int area(){
        return l*b;
    }
}
public class Shape {
    public static void main(String[] args) {
        Square sq=new Square("Square",3);
        Rectangle re=new Rectangle("Rectangle",4, 6);
        Circle ci=new Circle("circle", 5);

        System.out.println("Shape:"+sq.getShape());
        System.out.println("Side:"+sq.getSide());  
        System.out.println("Area:"+sq.area()); 
        
        System.out.println("Shape"+ci.getShape());
        System.out.println("Radius:"+ci.getRadius());
        System.out.println("Area:"+ci.area());

        System.out.println("Shape:"+re.getShape());
        System.out.println("Length"+ re.getl());
        System.out.println("Breadth:"+re.getb());
        System.out.println("Area:"+re.area());
    }
}

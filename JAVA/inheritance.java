class Person{
    private String name;
    private int age;
     Person(String name,int age){
        this.name=name;
        this.age=age;
     }

     public String getName(){
        return name;
     }
     public int getAge(){
        return age;
     }
}

 class Student extends Person{
    private int std;
Student(String name,int age,int std)
{
    super(name,age);
this.std=std;
}

public int getStd(){

    return std;
}
 }
 class Teacher extends Person{
    private int exp;

    Teacher(String name,int age,int exp){
        super(name,age);
        this.exp=exp;
    }
    public int getExp(){
        return exp;
    }
 }
public class inheritance {
    public static void main(String[] args) {
        Student st=new Student("anu",22,12);
        System.out.println(st.getAge());
        System.out.println(st.getName());
        System.out.println(st.getStd());
      
Teacher te=new Teacher("Sharu",22,13);

        System.out.println(te.getAge());
        System.out.println(te.getName());
        System.out.println(te.getExp());
    
    }
}

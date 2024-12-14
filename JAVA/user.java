import java.util.*;
class Person{
    private String name;
    private int month;
    private int date;
    private int year;
    private String gender;

    Person(String name,int month,int date,int year,String gender){
        this.name=name;
        this.month=month;
        this.date=date;
        this.year=year;
        this.gender=gender;
     }
     public String getName(){
        return name;
     }
     public int getMonth(){
        return month;
     }
     public int getDate(){
        return date;
     }
     public int getYear(){
        return year;
     }
     public String getGender(){
        return gender;
     }

     public int age(){
        return 2024-year;
     }
}

class Student extends Person{
    private int m1,m2;
Student(String name,int month,int date,int year,String gender,int m1,int m2)
{
    super(name, month,date,year, gender);
    this.m1=m1;
    this.m2=m2;
}

public int getm1()
{
return m1;
}
public int getm2()
{
return m2;
}

public int Avg(){
    return (m1+m2)/2;
}
}

class Teacher extends Person{
    private int salary;

 Teacher(String name,int month,int date,int year,String gender,int salary)
 {
     super(name, month,date,year, gender);
    this.salary=salary;
 }
 public int getSalary(){
    return salary;
 }
}

public class user {
    public static void main(String[] args) {
        System.out.println("Student:");
        System.out.println("Enter a name:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter month:");
        int b=sc.nextInt();
        System.out.println("Enter a date:");
        int c=sc.nextInt();
        System.out.println("Enter a  year:");
        int d=sc.nextInt();
        System.out.println("Enter gender:");
        String e=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter subject1 mark:");
        int f=sc.nextInt();
        System.out.println("Enter subject2 mark:");
        int g=sc.nextInt();
        System.out.println("Enter salary:");
        int h=sc.nextInt();

        
        System.out.println("STUDENT:");
       
        Student st=new Student(a, b, c, d, e, f, g);
        System.out.println("Name :" +st.getName());
        System.out.println("Age:"+st.age());
        System.out.println("DoB:"+st.getDate()+"/"+st.getMonth()+"/"+st.getYear());
        System.out.println("Mark 1:"+st.getm1());
        System.out.println("Mark 2:"+st.getm2());
        System.out.println("Avg:"+st.Avg());

        System.out.println("Enter a name:");
         a=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter month:");
        b=sc.nextInt();
        System.out.println("Enter a date:");
        c=sc.nextInt();
        System.out.println("Enter a  year:");
        d=sc.nextInt();
        System.out.println("Enter gender:");
         e=sc.nextLine();

        System.out.println("TEACHER:");
       
        Teacher te=new Teacher(a, b, c, d, e, h);
        System.out.println("Name :" +te.getName());
        System.out.println("Age:"+te.age());
        System.out.println("DoB:"+te.getDate()+"/"+st.getMonth()+"/"+st.getYear());
        System.out.println("Salary:"+te.getSalary());
        sc.close();
    }
}

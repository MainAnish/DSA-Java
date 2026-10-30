class Student
{
    int age;
    String name;
    public Student (int age,String name)
    {
        this.age=age;
        this.name=name;
    }
}

public class Herop
{
    public static void main(String args[])
    {
        Student s1=new Student(50, "bokachoda");
        System.out.println("Age of student:"+s1.age);
        System.out.println("Name of the student:"+s1.name);
    }

}
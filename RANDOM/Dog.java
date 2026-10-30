public class Dog
{

    String name;
    String breed;
    int age;
    String colour;

    public Dog(String name,String breed,int age, String colour)
    {
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.colour=colour;
    }

    public String getName()
    {
        return name;
    }
    public String getBreed()
    {
        return breed;
    }
    public int getAge()
    {
        return age;
    }
    public String getColour()
    {
        return colour;
    }
    @Override
    public String toString()
    {
        return ("Name is:"+this.getName()+"and its breed is:"+this.getBreed()+"its age is:"+this.getAge()+"and its colour is:"+this.getColour());
    }
    public static void main(String args[])
    {
        Dog d1=new Dog("rahul","Bulldog",19,"Brown");
        System.out.println("Output:"+d1.toString());
    }

    
}

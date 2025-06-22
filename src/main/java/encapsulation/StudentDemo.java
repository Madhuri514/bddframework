package encapsulation;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Vaibhav");
        System.out.println(s1.getName());
        // Encapsulation -  encapsulating the data from user, access modifiers. getter-setter (POJO)
        // Abstraction - abstract , interface - hide the logic from user. (abstract and interface)

        // findElement  - single element  - exception
        // findElements - list of element - empty list
    }
}
interface  Sport{
public void m1();
}
class Cricket implements  Sport{
public void m1(){

}
}
class Football implements  Sport{
public void m1(){

}
}


class Student{
    private String name;
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
         return this.name;
    }
}
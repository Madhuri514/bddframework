package constructor;

public class ConstructorDemo {

    public static void main(String[] args) {
        Human h1 = new Human("John");
        h1.talk("Hello");
//        Human h2 = new Human("Tom", 34);
//        h2.talk("Hello");
    }
}

class Human{
// name must be same as Class
// constructor don't have any return type
// constructor is exact like method
// constructor use to initialize instance variables.
// Every class has a default constructor until we are not defining constructor explicitly
    Human(String name){
     this.name = name;
     talk(name + " Joined your chat!!!! ");
    }
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    String name;  // instance variable
    int age;
    static int k;
    void talk(String content){
        System.out.println(name + " - " + content);
            }
}

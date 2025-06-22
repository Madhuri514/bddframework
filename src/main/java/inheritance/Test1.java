package inheritance;


// Inheritance - Parent attribute/behaviour -> child
// IS-A RelationShip
// Test1 is a Tech

// Inheritance is one way journey - parent to child (unidirectional)

public class Test1 {
    public void test1(){
//        learnJava();
    }
}

class Tech extends Test1{
    public void learnJava(){
        System.out.println("Hello");
    }
}

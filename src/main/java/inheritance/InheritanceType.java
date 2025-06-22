package inheritance;

public class InheritanceType {
    public static void main(String[] args) {
        C b1 = new C();
        b1.a();
    }
}

// A -> B  - Single level Inheritance
// A -> B -> C - Multi level Inheritance
// Heirarchial Relationship = siblings
// Multiple Inheritance is not allowed in Java , C++

// public > protected > default > private
// visibility cant be reduced

// final method cant be overridden
// final classes cant be interited

class A{
    public void a(){
        System.out.println("A execution");
    }
}

class B extends A{
    public void a(){
        System.out.println("B execution");
    }
}

class C extends  B{
    public void c(){
        System.out.println("C execution");
        a();
    }
}



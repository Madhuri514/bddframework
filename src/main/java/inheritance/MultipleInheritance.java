package inheritance;

public class MultipleInheritance {
}

interface M1{
    public void m1();
}

interface M2{
    public void m1();
}

class M3 implements  M1, M2{
    public void m1(){

    }
}
// diamond problem
// Interface - solve your multiple inheritance problem
// one class can implement n number of interfaces

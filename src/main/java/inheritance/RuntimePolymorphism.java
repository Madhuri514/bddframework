package inheritance;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // Runtime Polymorphism

        Ram b1  = new Bharat();
        b1.m1();

    }
}
// Ram - 1960 - GulabJamun 30% sugar  - 1room shop
// Shaym - 1980 - GulabJamun 20% sugar , Jalebi, 2 room shop
// Bharat - 2015 - GulabJamun 10% sugar, Jalebi, s1, s2, s3, 4 room shop

// inheritance unidirectional
class Ram{
    public void m1(){
        System.out.println("ram - m1");
    }
}
class Shyam extends Ram{
    public void m1(){
        System.out.println("shyam - m1");
    }
}
class Bharat extends Shyam{
    public void m2(){
        System.out.println("bharat - m2");
    }
}

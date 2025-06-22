package accessmodifiers;

// accessmodifiers
// AccessModifierDemo - test1()
// Test3   - test3()

// accessmodifiers2
// Test2 - test2()

// public > protected > default > private


// public - visibility everywhere
// protected - visibility with in package + if classes then inheritance
// default - visible only in package
// private - visible with in class

// public > protected > default > private   => variable/ method
// public , default => classes

import accessmodifier2.Test2;

public class AccessModifierDemo extends Test2 {
    public void test1(){
        test2();
    }
}


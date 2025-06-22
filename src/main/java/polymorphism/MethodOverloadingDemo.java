package polymorphism;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        int sum = Calculator.add(10,20);
        System.out.println(sum);
        sum = Calculator.add(10,20,30);
        System.out.println(sum);
        sum = Calculator.add(10,20,30,56,12,345,6,7,4,4,3,3,3,0);
        System.out.println(sum);
        sum = Calculator.add();
        System.out.println(sum);
    }
}


// Method Overloading
/*
1 - Compile Time Polymorphism
2 - Depends on Signature (param datatype should be different/ param number)
3 - Do not depend on Return type
4 - Apply with static and non-static methods
*/

// Varargs  = var + args = various + arguments
/*
    1 - only 1 varargs allowed in a param list
    2 - varargs must be the last param of param list
*/

class Calculator{

    static int add(int...inputs){
        int sum = 0;
        for(int i = 0 ; i <  inputs.length ;i++){
            sum = sum + inputs[i];
        }
        return sum;
    }

    static float add(float...inputs){
        float sum = 0;
        for(float a : inputs){
            sum += a;
        }
        return sum;
    }
}


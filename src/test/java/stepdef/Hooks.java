package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {


@Before
public void setup(){
    System.out.println("I will run before every scenario");
}

@After
public void teardown(){
    System.out.println("I will run after every scenario");
}


@BeforeStep
public void setup1(){
    System.out.println("I will run before every step");
}

@AfterStep
public void teardown1(){
    System.out.println("I will run after every step");
}




}

package com.acme.basic;

import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    new HelloWorld().sayHello();
  }
  @Test
  public void notCovered() {
    new HelloWorld().notCovered();
  }
  @Test
  public void notCovered1() {
    new HelloWorld().notCovered1();
  }@Test
  public void notCovered2() {
    new HelloWorld().notCovered2();
  }

}

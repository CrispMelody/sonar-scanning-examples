package com.acme.basic;

import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    new HelloWorld().sayHello();
  }
  @Test
  public void notCoveraged() {
    new HelloWorld().notCovered();
  }
  @Test
  public void notCoveraged1() {
    new HelloWorld().notCovered1();
  }
}
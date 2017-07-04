package com.eightycolumns.hello;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {
  private Greeter greeter;

  @Before
  public void setUp() {
    greeter = new Greeter();
  }

  @Test
  public void greeterSaysHelloWorld() {
    assertEquals("Hello, World.", greeter.sayHello());
  }
}

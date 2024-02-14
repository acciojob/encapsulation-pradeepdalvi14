package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly obj = new RWOnly();
      obj.setName("pradeep");
      System.out.println(obj.getName());

      // Error: java: a has private access in com.driver.RWOnly
  }
}
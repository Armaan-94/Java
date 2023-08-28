package Interfaces;

class MyParentClass {
  
}

interface MyInterface1 {
  
}

interface MyInterface2 {
  
}

class MyClass extends MyParentClass implements MyInterface1, MyInterface2 {
  
}

public class Main {
  public static void main(String[] args) {
    
    MyClass myObj = new MyClass();

    
    
    if (MyClass.class.getSuperclass() == MyParentClass.class) {
      System.out.println("MyClass extends MyParentClass");
    } else {
      System.out.println("MyClass does not extend MyParentClass");
    }
    
    
    if (MyInterface1.class.isAssignableFrom(MyClass.class)) {
      System.out.println("MyClass implements MyInterface1");
    } else {
      System.out.println("MyClass does not implement MyInterface1");
    }
    
    
    if (MyInterface2.class.isAssignableFrom(MyClass.class)) {
      System.out.println("MyClass implements MyInterface2");
    } else {
      System.out.println("MyClass does not implement MyInterface2");
    }
  }
}



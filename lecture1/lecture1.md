- learning by doing
- Class Pharse

  - Pharse 1 (Week 1-4) : Intro to Java and Data structures
  - Pharse 2 (Week 5-10) :Data Structure
  - Pharse 3 (Week 12-14): Algorithms

- Overview of Pharse 1
  - lab 1: IntelliJ and Git
  - lab 2: The intelliJ Debugger
  - lab 3: Unit Testing

When you run this code by java Helloworld.java

```
  print("Hello world")
```

it will display

```
(base) ➜  CS61B java Helloworld.java
Helloworld.java:1: error: class, interface, enum, or record expected
print("Hello world")
^
```

so we know all code must live inside the class in Java

```

public class Helloworld{
  public static void main(String[]args){

  }
}
```

```
public class Helloworld{
  public static void main(String[]args){
    System.out.println("Hello World");
  }

}

```

1. All code much be part a class
2. Class are defined in Java with "public class CLASSNAME"
3. we use {} to delineate to beginning and endding of things
4. We much end lins with a semicolon.
5. The code we ant to run must be inside punlic static void main(String[] args).

1 promodoro

next class use IDE

```
public class HelloNumber{
    public static void main(String[]args){
      x= 0;
      while(x<10){
        System.out.println(x);
        x= x+1;
      }
    }
}

```

```
HelloNumber.java:3: error: cannot find symbol
      x= 0;
      ^
  symbol:   variable x
  location: class HelloNumber
```

forget to declare the variable

in python you don't need to declare, but in Java you need to declare

in Java we can't change the type of the variable, static type

1. Before Java variables can be used, they mush be declared.
2. Java variables much have a specific type.
3. Java variables types can never change.
4. Types are varified before the code even runs!!

目前大概講了 Java 基本的語法，沒特別的新東西。

2D

- Java is an object oriented language with strict requirements
- define a main method

- Static typing
  - The good
    - catches certain types of errors
    - type error can never occur on the end user's computer
    - easier to read and reason about code
    - code can run more efficiently
  - The bad
    - Code is more verbose
    - Code is less general
      - larger(-5,5,-10) and larger(-5,-10)

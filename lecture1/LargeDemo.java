//** Demonstrates creation of .... */
public class LargerDemo{
    /** Returns the larger of x and y. 
     @precondition */
    public static int larger( int x, int y){
        if(x>y){
            return x;
        }
        return y;
    }
    public static void main( String[] args ){
        System.out.println(larger(-3.3 ,10));

    }
}

/* 
1. Funnctions mush be declared as part of a class in Java.
    A function that is part of a class is called a "method"
    So in Java, all functions are methods.
2. To define a function in Java, we use "public static".
    We will see alternate way of defining functions later.
3. All parameters of a function mush have a declared type.
    Functuins in Java return only one value
*/


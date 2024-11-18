public class MathFunctions{
    public static void main(String[] args){
       double x=3.14;
       int y=-4;
       int a=8;
       double z1=Math.max(x,y);
       // gives maximum of 2 numbers
       System.out.println(z1);
       double z2=Math.min(x,y);
       //gives minimum of two numbers
       System.out.println(z2);
       double z3=Math.abs(y);
       //gives absolute value of a number
       System.out.println(z3);
       double z4=Math.round(x);
       //round off to nearest integer
       System.out.println(z4);
       double z5=Math.sqrt(a);
       //gives square root of a number
       System.out.println(z5);
       double z6=Math.ceil(x);
       //gives higher number that is greater than or equal to argument
       System.out.println(z6);
       double z7=Math.floor(x);
       //gives lower integer number
       System.out.println(z7);
       double z8=Math.pow(y,a);
       //gives a^b
       System.out.println(z8);
       double z9=Math.cbrt(a);
       //returns cube root
       System.out.println(z9);
       double z10=Math.random();
       //gives a random value between 0 and 1
       System.out.println(z10);
    }
}
// OUTPUT
// 3.14
// -4.0
// 4.0
// 3.0
// 2.8284271247461903
// 4.0
// 3.0
// 65536.0
// 2.0
// 0.7330793051160084
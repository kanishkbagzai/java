// Write a program to demonstrate use of 'static' keyword.

public class Assignment2_16 {
    int rollno;
    String name;
static String college ="ITS";
Assignment2_16(int r,String n){
rollno = r;
name = n;
}
void display (){System.out.println(rollno+" "+name+" "+college);}
public static void main(String args[]){
Assignment2_16 s1 = new Assignment2_16(111,"Karan");
Assignment2_16 s2 = new Assignment2_16(222,"Aryan");
s1.display();
s2.display();
}
}

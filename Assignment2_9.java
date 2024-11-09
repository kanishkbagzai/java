abstract class ThreeDObject{
    public abstract double wholeSurfaceArea();
    public abstract double volume();
}
class Box extends ThreeDObject{
    double l,b,h;
    public Box(double l, double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public double wholeSurfaceArea(){
        return 2*(l*b+b*h+h*l);

    }
    public double volume(){
        return (l*b*h);

    }
}
class Cube extends ThreeDObject{
    double side;
    public Cube(double side){
        this.side=side;
    }    
    public double wholeSurfaceArea(){
        return (6*side);
    }
    public double volume(){
        return (side*side*side);
    }
}
class Cylinder extends ThreeDObject{
    double  r,h;
    public Cylinder(double r,double h){
        this.h=h;
        this.r=r;
    }
    public double wholeSurfaceArea(){
        return 2*(3.14)*(r*h+r*r);
    }
    public double volume(){
        return (3.14*r*r*h);
    }
}
class Cone extends ThreeDObject{
    double h,l,r;
    public Cone(double h,double l,double r){
        this.h=h;
        this.l=l;
        this.r=r;
    } 
    public double wholeSurfaceArea(){
        return (3.14*r*l)+(3.14*r*r);
    }
    public double volume(){
        return 0.33*3.14*r*r*h;
    }
}


public class Assignment2_9 {
    public static void main(String[] args) {
        ThreeDObject box=new Box(2.0,3.0,4.0);
        ThreeDObject cube=new Cube(6.0);
        ThreeDObject cone=new Cone(2.0,3.0,4.0);
        ThreeDObject cylinder=new Cylinder(4,4);
        System.out.println("Box volume and whole surface area ");
        System.out.println(box.volume());
        System.out.println(box.wholeSurfaceArea());
        System.out.println("Cube volume and whole surface area ");
        System.out.println(cube.volume());
        System.out.println(cube.wholeSurfaceArea());
        System.out.println("Cone volume and whole surface area ");
        System.out.println(cone.volume());
        System.out.println(cone.wholeSurfaceArea());
        System.out.println("cylinder volume and whole surface area ");
        System.out.println(cylinder.volume());
        System.out.println(cylinder.wholeSurfaceArea());
    }
}

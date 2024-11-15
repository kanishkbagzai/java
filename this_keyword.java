public class this_keyword{
    int x;
    int y;
    this_keyword(int x){
    this.x=x;
    System.out.println("x="+x);
    }
    this_keyword(int x, int y){
      this.x=x;
      this.y=y;
      System.out.println("x="+x+ " " +"y="+y);
    }
    public static void main(String[] args){
     this_keyword o1=new this_keyword(5);
     this_keyword o2=new this_keyword(2,3);
    }
}

public class question24 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        int avg=(sum/(a.length));
        System.out.println("sum="+sum);
        System.out.println("average="+avg);
    
    }

}
//OUTPUT
// sum=15
// average=3
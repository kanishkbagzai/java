public class Assignment2_1 {    
    public static void mergeArrays(int[] a,int[] b,int[] array){
        
        int i=0,j=0,k=0;
        while (i<a.length) {
            array[k++]=a[i++];
        }
        while(j<b.length){
            array[k++]=b[j++];
        }
        //sorting array
        for(int x=0;x<array.length-1;x++){
            for(int y=x+1;y<array.length;y++){
                if(array[x]>array[y]){
                    //swap
                    int temp=array[y];
                    array[y]=array[x];
                    array[x]=temp;
                }
            }
        }


    }
    
    
    
    public static void main(String[] args) {
        int[] a={1,2,34,56};
        int[] b={20,30,40,50};
        int[] array=new int[a.length+b.length];
        mergeArrays(a, b, array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
}
}
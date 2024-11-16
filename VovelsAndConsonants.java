public class VovelsAndConsonants {

static boolean vowels(char a){
    return a=='a' || a=='e' || a=='i' || a=='o' || a=='u';
}
public static void main(String[] args){
    String s="hello";
    for(int i=0;i<s.length();i++){
        if(vowels(s.charAt(i))){
            s=s.replace(s.charAt(i),'*');
        }else{
            s=s.replace(s.charAt(i),'$');
        }
    }
    for(int i=0;i<s.length();i++){
    System.out.println(s.charAt(i));
    }
}
}

public class BreakContinue {

        public static void main(String[] args){
          for(int i=1;i<=20;i++){
            if(i==7){
                continue;
            }
            if(i==15){
                break;
            
            }
            System.out.println(i);
          }
        }
    }
    // output->
    // 1
    // 2
    // 3
    // 4
    // 5
    // 6
    // 8
    // 9
    // 10
    // 11
    // 12
    // 13
    // 14



// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class chesta{

    int n=1;
    public void PrintOdd(){
        if(n<=10){
            System.out.println(n+1);
            n++;
            PrintEven();
        }
        return;
    }
    public void PrintEven(){
        if(n<=10){
            System.out.println(n-1);
            n++;
            PrintOdd();
        }
        return;
    }
      public static void main(String arr[]){
          chesta ar=new chesta();
          ar.PrintOdd();
      }
    
    
    }

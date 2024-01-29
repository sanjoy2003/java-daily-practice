import java.util.Scanner;
public class asert{
    public static void main(String arr[]){
       
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a%2==1){
        System.out.println("Weired");
    }
    else if(a%2==0^ a>=2 ^ a<=5) {
        System.out.println("Not Weired");
    } else if (a%2==0^a>=6 ^ a<=20){
        System.out.println(" Weired");
        
    }
    else if(a%2==0 ^ a>20){
        System.out.println("Not Weired");
    }
    else{
    System.out.println(" Not Werid");    
    }
    
    }
}


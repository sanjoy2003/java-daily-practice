import java.util.Scanner;
public class coun {
    public static void main(String arr[]){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
    while(num!=0){
        int a=num/10;
        int b=a%10;
        if(b%2==0){
            System.out.println("the number is even"+b);
        }
        else{
            System.out.println("the number is odd"+b);
        }
    }

    }
    
}
 
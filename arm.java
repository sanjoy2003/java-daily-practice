import java.util.Scanner;
public class arm {
    public static void main(String arr[]){
        int rem=0,c,n;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         c=n;
         while(n>0){
            rem=n%10;
            rem=(rem*rem*rem)+rem;
            n=n/10;
         }
         if(c==rem){
            System.out.println("armstron");
         }


    }
    
}


import java .util.Scanner;
public class binary {
    public static int binarySearch(int []a,int key){
        int l=0;
        int h=a.length-1;
        int mid=0;
        while(l<h){
        mid=l+h/2;
        if(key==a[mid]){
            return mid;
        }
        else if(key<a[mid]){
            h=a[mid]-1;
            
        }
else{
   h=a[mid]+1; 
   
}
        }
        return -1;

    }

    
    public static void main(String arr[]){
    
        Scanner sc=new Scanner(System.in);
       int size= sc.nextInt();
       int a[]=new int[size];
       for(int i=0;i<size;i++){
a[i]=sc.nextInt();
       } 
       System.out.println("enter the key value"); 
        int key =sc.nextInt();
        System.out.println(binarySearch(a,key)) ;
        
    }
}


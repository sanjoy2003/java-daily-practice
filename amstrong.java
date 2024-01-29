public class amstrong {
    public static void main(String arr[]){
        int a=0,b=1,c;
        for(int i=0;i<10;i++){
            c=a+b;
            b=c;
            a=b;
        System.out.println(""+c);
        }
    
    }
    
}

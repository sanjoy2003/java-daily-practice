class  A extends Thread{
    public void  run(){
        for(int i=0;i<5;i++){
            System.out.println("sanjoy");
        }
    }
}
class B{
    public static void main(String arr[]){
    A t=new A();
        t.start();
        for(int i=0;i<=7;i++){
System.out.println("raj");
        }
    }
}

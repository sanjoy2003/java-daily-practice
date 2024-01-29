 interface client {
    void webdesign();
    void webdevolopper();
}
abstract class rajtech implements client{
    public void webdesign(){
        System.out.println("actually designp made this pint  i am ready for start beganing level coder my journey");
    }

}
 class rahultech extends rajtech{
    public void webdevolopper(){
        System.out.println("he is webdevolopper");
    }

}
class cache{
    public static void main(String arr[]){
        rahultech c =new rahultech();
        c.webdesign();
        c.webdevolopper();

    }
}
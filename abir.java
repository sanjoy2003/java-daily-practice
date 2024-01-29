
public class abir{
    private int value;
    public void setModel(int value){
    
        if(value<=500){
        this.value=value;
        }
            
        
        else{
            this.value= 1000;
            System.out.println("the value is undefined");
        }
    }
    public int getModel(){
        return this.value;
        

    }


    public static void main(String arr[]){
        abir oneplus=new abir();
        oneplus.setModel(500);
        
            System.out.println("the phone model is"+oneplus.getModel());
        

    }

    
}

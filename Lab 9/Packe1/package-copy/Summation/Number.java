package Summation;
public class Number {
    //data member
    private int value;
    
    //constructors 
    public Number(){
        value=0;    
    }
    public Number(int value){
        this.value=value;
    }
    //getter setter
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
   
   //method is_even
    public boolean is_Even()
    {
        if(value%2==0)
            return true;
        else 
            return false;  
    }
}
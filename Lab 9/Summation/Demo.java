import Summations.Number;
public class Demo
{   
    public static void main(String[] args)
    {
        Number n = new Number(5);
        if(n.is_Even())
            System.out.println("Result : "+Math.pow(n.getValue(),2));
        else
            System.out.println("Result : "+Math.pow(n.getValue(),3));
    }
}
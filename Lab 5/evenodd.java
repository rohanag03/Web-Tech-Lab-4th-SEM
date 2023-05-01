class evenodd
{
    public static void main(String args[])
    {
        if(args.length > 0)
        {
            int c1=0,c2=0;
            for(int x=0;x<args.length;x++)
            {
                if(Integer.parseInt(args[x])%2==0)
                    c1++;
                else
                    c2++;
            }
            System.out.println("Even integers: "+c1);
            System.out.println("Odd integers: "+c2);
        }
        else
        {
            System.out.println("No argument left ");
        }
    }
}
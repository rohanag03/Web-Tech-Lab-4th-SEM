class objects
{ 
    static int count=0; 
    objects()
    { 
        count++; 
    }
    public static void main(String[] args)
    {
        objects obj1 = new objects();
        objects obj2 = new objects();
        objects obj3 = new objects();
        System.out.println("Number of objects created:"+count); 
    }
}
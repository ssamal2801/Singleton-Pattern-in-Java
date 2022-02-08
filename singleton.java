class EarthMoon {
    private static EarthMoon moon = null;
     public String someString;

    // This private constructor will make sure the instance is limited to this class only
    private EarthMoon() 
    {
        someString = "Earth can have only one moon";
    }
 
    // This method will be used to create instance of EarthMoon class
    public static EarthMoon getInstance()
    {
        if (moon == null)
            moon = new EarthMoon();
 
        return moon;
    }
}
 
class Earth {
    public static void main(String args[])
    {
        try{
        // This is the only way to initialize EartMoon instance
        EarthMoon moon1 = EarthMoon.getInstance();

        //This will throw an exception
        EarthMoon moon2 = new EarthMoon();
        }
        catch(Exception exception){
                System.out.println(exception.getMessage());
        }
    }
}
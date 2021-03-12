public class Hello 
{ 
    public static void main( String argv[] ) 
    {
	String name = "Stockton University";
        if (argv.length != 0)
        {
             name = argv[0];
        }
        System.out.println( "Hello, " + name +"!" );
    } 
}
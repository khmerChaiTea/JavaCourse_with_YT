
class Hello
{
    public static void main(String args[])
    {
        // If Else If in Java
        int x = 8;
        int y = 7;
        int z = 9;


        if (x > y && x > z) // False
            System.out.println(x);
        else if (y > z)
            System.out.println(y);
        else
            System.out.println(z);
    }
}


// Compile in terminal: java + c Hello.java
// Run on console: java Hello
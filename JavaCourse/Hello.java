
class Hello // A file name
{
    public static void main(String args[])
    {
        // Type Conversion in Java - casting
        // byte b = 127;
        int a = 12;
        byte k = (byte)a;

        float f = 5.6f;
        int t = (int)f;

        System.out.println(k);
        System.out.println(a);
        System.out.println(t);  

        byte c = 10;
        byte d = 30;

        int result = c * d; // Type promotion

        System.out.println(result);  
    }
}


// Compile in terminal: java + c Hello.java
// Run on console: java Hello
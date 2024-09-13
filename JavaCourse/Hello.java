
class Hello
{
    public static void main(String args[])
    {
        // Ternary Operator in Java
        int n = 4;
        int result = 0;

        // if (n % 2 == 0)
        //     result = 10;
        // else
        //     result = 20;

        // Ternary operator --> ? T:F
        result = n % 2 == 0 ? 10 : 20;

        System.out.println(result);
    }
}


// Compile in terminal: java + c Hello.java
// Run on console: java Hello
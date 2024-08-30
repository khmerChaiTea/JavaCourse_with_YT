
class Hello
{
    public static void main(String args[])
    {
        // Arithmetic Operators in Java
        int num1 = 7;
        // int num2 = 5;

        // int result = num1 % num2;

        // num1 = num1 + 2;
        // num1 *= 8; // Short cut
        // num1++; // Post - Increment
        // ++num1; // Pre - Increment (when try to fetch the values)
        // num1--; // Decrement

        int result = num1++;  // Fetch the value and then increment value
        // int result = ++num1;  // increment value and then fetch the value

        System.out.println(result);
    }
}


// Compile in terminal: java + c Hello.java
// Run on console: java Hello
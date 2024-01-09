// Date: 8/26/2022
// Purpose: Prove the Collatz Conjecture with any given positive whole number using a recursive method
public class CollatzConjecture
{
    public static void main(String[] args)
    {
        // Following two simple algebraic calculations (if x is even, divide by 2, if odd, multiply by 3 and add 1),
        // the Collatz Conjecture states that any positive whole integer will eventually be brought to a 4-2-1 loop
        int x = 11; // Enter any positive whole number
        System.out.println(x); // prints the given number
        System.out.println(collatzConjecture(x)); // Recursively finds every number in the sequence
    }
    public static String collatzConjecture(int z) // Given number will recursively go through the methods until it equals 1
    {
        if(z == 1) // When z==1, the number will be in an infinite loop, so the program stops once it reaches 1
        {
            return "Collatz conjecture 4 - 2 - 1 loop confirmed.";    
        }
        else if (z % 2 == 0 ) // z modulus 0 means the number is even
        {
            return collatzConjecture(evenCollatz(z));
        }
        else // if the modulus returns anything else, then the number is odd
        {
            return collatzConjecture(oddCollatz(z));
        }
    }
    public static int oddCollatz(int z)
    {
        z = 3 * z + 1; // performs the odd calculation per the rules of the Collatz Conjecture
        System.out.println(z); // Prints out the new number
        return z;
    }
    public static int evenCollatz(int z)
    {
        z = z / 2; // performs the even calculation per the rules of the Collatz Conjecture
        System.out.println(z); // Prints out the new number
        return z;
    }
}
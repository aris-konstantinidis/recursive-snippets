public class Driver {
    public static void main(String[] args) {

        // System.out.println(Task.complement(args[0])); // command line argument
        int factorial = Task.factorial(14); // overflow 
        System.out.println(Integer.toBinaryString(factorial));
        if (factorial > (2^31)) {
            System.out.println("Overflow detected: the maximal Integer size is 2^31, with an additional sign-bit in the front. The number calculated was: " + Integer.toBinaryString(factorial) + ". The first digit (1), suggests that the number is negative - which can not be true.");
        }
    }
}

public class ArrayReferences
{
    public static void main(String[] args)
    {
        // All arrays do is draw a reference to a list of variables. Whenever another array is assigned the
        // same values in the old array, they are both referencing the same set of variables. Hence, whatever changes
        // happen, whether it be from the newly declared array equivilent, or the array itself, affects both. ex:
        double[] doubleEx = {1,2,3,4,5,6};
        double[] sameThing = doubleEx;
        System.out.println("Current value: " + doubleEx[0]); // Prints out the current value, 1.
        sameThing[0] = 5; // Changes value of 1st value in the list of shared reference variables to 5.
        System.out.println("After reassigning: " + doubleEx[0]); // Prints out the new value, 5.
    }
}

public class Arrays
{
    public static void main(String[] args)
    {
        double[] arraySetVariableNumber = new double[10];
        // can also declare an array this way; array set this way has no set number of variables, and allocates room
        // when values are set to the arrays.
        double[] arrayUnsetVariableNumber;
        // Example of assigning values to the array (with no set # of arrays). For both of the examples above, no
        // variables are assigned to any of the slots in the array(s).
        double[] automaticArray = {1,2,3,4,5,6,10,11,16};
        System.out.println("4th variable: " + automaticArray[4]); // Prints out the 4th variable in the array. (note:
        // remember that the array starts at 0, and therefore the number 5 will print, and NOT 4.)
        System.out.println("Prints out whole array: " + automaticArray); // Prints out the whole array. This will print
        // out random jargon, since it is not printing out a set value in the array, but rather the array as a whole.
        System.out.println("Same as above: " + arraySetVariableNumber); // Same as above.
        /** Note: The number of variables stored in an array must be >= 0 and < the length of the array. **/
        // Common array error: assigning array[10] in an array with 9 slots. (slots 0-9)
        double[] values = new double[10];
//        double value = values[10]; // Error: No 10th value.
//        System.out.println(value); // Prints out exception in thread
        // values.length shows the # of values in the array values. (replace values with the array of choice)
        System.out.println("Length of values: "+ values.length); // Prints out 10, because 0 counts as a variable (1).
        // So, 1+9=10.
        // Note: An array can store other data types, like strings.
        String[] stringArray = {"Emily", "Paul"};
        System.out.println("stringArray[1]: " + stringArray[1]);

    }
}

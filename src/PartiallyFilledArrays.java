import java.util.Scanner;

public class PartiallyFilledArrays
{
    public void partiallyFilledArrays()
    {
        // The size of arrays can't be modified while the program is running. Hence, a good guess on the max number
        // of slots that the array will need during runtime is necessary.
        // values.length measures the whole length of the array, values assigned in the slots or not.
        // Hence, a companion variable is needed to see how many slots in the array are in use.
        // The following loop collects inputs and fills up the values array:
        double[] values = new double[10];
        int currentSize = 0;
        Scanner in = new Scanner(System.in);

        while (in.hasNextDouble())
        {
            if (currentSize < values.length) // values has a length of 10.
            {
                values[currentSize] = in.nextDouble();
                currentSize++;
            }
        }
    }
}

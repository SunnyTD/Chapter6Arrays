public class LinearSearch
{
    public void linearSearch()
    {
        // Creates the values array.
        double[] values = new double[10];
        for (int iterations = 0; iterations < 10; iterations++)
        {
            int randomNumber = (int) (Math.random() * 11) + 1; // Random number between 11 and 1.
            values[iterations] = (randomNumber);
        }
        // searches for the position in the array that is equal to 100:
        int searchedValue = 100;
        int pos = 0;
        boolean found = false;
        while (pos < values.length && !found)
        {
            if (values[pos] == searchedValue)
            {
                found = true;
            }
            else
            {
                pos++;
            }
        }
        if (found)
        {
            System.out.println("Found at position: " + pos);
        }
        else
        {
            System.out.println("Not found");
        }
    }
}

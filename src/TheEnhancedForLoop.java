public class TheEnhancedForLoop
{
    public void theEnhancedForLoop()
    {
        double[] arrayTest = {1, 10, 100, 1000,};
        double total = 0;
        // Total/adds up all of the variables in the arrayTest array.
        for (double element : arrayTest)
        {
            total = total + element;
        }
        System.out.println(total);

        // The above is the same thing as:
//        for (int i = 0; i < arrayTest.length; i++)
//        {
//            double element = arrayTest[i];
//            total = total + element;
//        }
//        System.out.println(total);

        // Note:
    }
}

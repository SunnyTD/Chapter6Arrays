import java.util.ArrayList;

public class ArrayLists
{
    public void arrayLists()
    {
        // Array lists work just like arrats, but can:
        // 1. Grow and shrink size as needed
        // 2. Supplies methods for common tasks
        // NOTE: Array Lists CAN NOT be assigned to PRIMITIVE TYPES. Only types like String or different classes.

        // ex. array list declaration of size 0:
        ArrayList<String> friends = new ArrayList<String>();
        // Add String, "Cindy" to the array list.
        friends.add("Cindy");
        // Assign string called "name" to the same value (string) as the value(i) in the array list. (Then prints it.)
        int i = 0;
        String name = friends.get(i);
        System.out.println(name);
        // Re-assigns the value in the array list(i), then prints it.
        friends.set(i, "Harry");
        String name2 = friends.get(i);
        System.out.println(name2);
    }
}

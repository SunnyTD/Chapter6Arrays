import java.util.ArrayList;

public class WrappersAndAutoBoxing
{
    public void wrappersAndAutoBoxing()
    {
        // Recall: Array Lists CAN NOT be assigned to PRIMITIVE TYPES.
        // Instead, wrappers for these types must be used.
        // ex:
        ArrayList<Double> exampleDouble;
        // Conversion between primitive types and the wrapper classes is automatic. This is called auto-boxing.
        // Simple (symbolic) example of auto-boxing:
        double wrapper = 29.95;
        double x = wrapper;

        // Literal example of auto-boxing:
        ArrayList<Double> values = new ArrayList<>();
        values.add(29.95);
        // Assigns y to value of the variable in slot 0 of the values array list.
        double y = values.get(0);
        System.out.println(y);
    }
}

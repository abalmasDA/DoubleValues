import java.util.ArrayList;
import java.util.List;

public class DoubleValues {
    public static List<String> doubleValues(List<String> somelistToDoubleValues) {
        List<String> resultList = new ArrayList<>();
        int x = 0;
        int y = 1;
        for (int i = 0; i < somelistToDoubleValues.size(); i++) {
            resultList.add(x, somelistToDoubleValues.get(i));
            resultList.add(y, somelistToDoubleValues.get(i));
            x += 2;
            y += 2;

        }
        return resultList;
    }


}

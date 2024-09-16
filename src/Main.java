import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        namesList.add("Derek");
        namesList.add(0,"Angel");

        String[] namesArray = new String[namesList.size()]; /*You are creating a new String array named namesArray
                                                            with a size equal to the number of elements in the namesList ArrayList. */

        namesArray = namesList.toArray(namesArray); /*The 'namesList.toArray(namesArray)' method
                                                    copies the elements from the 'namesList' ArrayList
                                                    into the 'namesArray' and returns the array. */
        System.out.println(Arrays.toString(namesArray));
    }
}
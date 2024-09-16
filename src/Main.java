import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        namesList.add("Derek");
        namesList.add(0,"Angel");
        System.out.println(namesList);
    }
}
package baseline;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    //a to do list should include a string, item capacity, and list of items.
    String title;
    private final int capacity = 256;
    List<Item> items = new ArrayList<>();


    public ToDoList()
    {

    }

    public int getCapacity() {
        return capacity;
    }
}
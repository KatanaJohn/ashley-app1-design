package baseline;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    //a to do list should include a string, item capacity, and list of items.
    String title;
    private final int capacity = 256;
    List<Item> items = new ArrayList<>();


    //setter for class
    public ToDoList()
    {

    }

    //both below are getters
    public int getCapacity() {
        return capacity;
    }

    public String getTitle()
    {
        return title;
    }
}
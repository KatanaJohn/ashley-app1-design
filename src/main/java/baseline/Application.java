package baseline;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//main application. currently putting all classes in here, but they will most likely move around
public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("assignment05_gui.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("To Do List");
        stage.setScene(scene);
        stage.show();
    }
    //public void start (Stage stage) throws Exception {
    //
    //Scene scene = new Scene(root);
    //stage.setTitle("name");
    //stage.setScene(scene);
    //stage.show();



    public static void main(String[] args)
    {
        launch(args);
    }

    private String getListTitleInput()
    {
        //ask for input for the title of a new list and return it

        return "s";
    }

    public ToDoList createList(String title)
    {
        ToDoList listOne = new ToDoList();


        //placeholder returns. Will be in all functions
        return listOne;
    }

    public ToDoList addItemToList(ToDoList listOne, Item item)
    {

        //take object and add it to  todolist

        return listOne;
    }

    public Item searchForItem(ToDoList list, String name)
    {
        //currently a placeholder so we can return. will not be included.
        Item item = new Item("TEST1", "test2");

        //search for the item called by searching through the list that wants to be checked.
        return item;
    }

    public ToDoList removeItemFromList(ToDoList list, Item item)
    {
        //ignore
        ToDoList listOne = new ToDoList();

        //takes the item found from searchForItem and deletes it from the list


        return listOne;
    }

    public Item editItemDescription(Item item, String description)
    {
        //takes the item that a person wants to edit the description of

        //goes into the item and changes that description

        //returns it
        return item;
    }

    public Item editDueDate(Item item, String date)
    {
        //takes the item that a person wants to edit the description of

        //goes into the item and changes that dueDate

        //returns it
        return item;
    }

    private Item markItemComplete(Item item)
    {
        //changes boolean of item from false to true.

        //return it
        return item;
    }

    private void displayList(ToDoList list)
    {

        //just displays every item within the list

    }

    private void displayIncompleteItems(ToDoList list)
    {

        //check each item within the list to see if they're completed. If not, displays the item

    }

    private void displayCompleteItems(ToDoList list)
    {

        //check each item within the list to see if they're completed. If so, displays the item

    }

    public File saveList(ToDoList list)
    {
        //create new file
        File file = new File(list.title);

        //save the list and all of its info/items to the file

        //return it
        return file;
    }

    public ToDoList loadList(String name)
    {
        //placeholder for now. ignore
        ToDoList list = new ToDoList();

        //takes the string name and searches through all the titles of lists and pulls that out

        //returns the list (possibly change to file?)
        return list;
    }



}

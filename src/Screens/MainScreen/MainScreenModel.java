package Screens.MainScreen;

import java.util.ArrayList;
import java.util.Date;

public class MainScreenModel {

    public enum DataType{
        todoList,
        task
    }
    ArrayList<Task> tasks;

    MainScreenUI screenDelegate;
    int currentMenuChoice = 0;
    String[] menuItems = new String[]{
            "Print to-do list.",
            "Add Task.",
            "Delete Task.",
            "Edit Task.",
            "Log Out.",
            "Exit Program."};

    public void setScreenDelegate(MainScreenUI screenDelegate) {
        this.screenDelegate = screenDelegate;
    }
    public void setMenuChoice(int num){
        currentMenuChoice = num;
    }

    public boolean exit() {

        return currentMenuChoice == menuItems.length ;

    }

    public String getMenu() {
        StringBuilder menu = new StringBuilder();
        for(int i = 0; i < menuItems.length; i++){
            menu.append(i+1).append(". ").append(menuItems[i]).append("\n");
        }
        return menu.toString();
    }
    String getTodoList(){
        StringBuilder todoList = new StringBuilder();
        int i = 1;
        for(var task : tasks){
            todoList.append(i++).append(". ").append(task.eventDate).append(" ").append(task.name);
            if(task.isCompleted()){
                todoList.append(" Completed");
            }
            todoList.append("\n");
        }
        return todoList.toString();
    }
    public void executeChoice() {
        switch(currentMenuChoice){
            case 1 ->{
                tasks = new ArrayList<>(3);
                tasks.add(new Task(new Date(), "Check email", "The requirement is to check the inbox folder of the email"));
                tasks.add(new Task(new Date(), "Take lunch", ""));
                tasks.add(new Task(new Date(), "Drive home","" ));
                screenDelegate.dataReceived(DataType.todoList);
            }
            case 2 ->{

            }
            case 3 ->{

            }
            case 4 ->{

            }
            case 5 ->{

            }
            case 6 ->{

            }
            default ->{

            }
        }


    }


}

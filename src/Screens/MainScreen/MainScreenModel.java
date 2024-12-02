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

    public MainScreenModel() {
        tasks = new ArrayList<>(3);
        tasks.add(new Task(new Date(), "Check email", "The requirement is to check the inbox folder of the email", 1));
        tasks.add(new Task(new Date(), "Take lunch", "",2 ));
        tasks.add(new Task(new Date(), "Drive home","" , 3));
    }

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

                screenDelegate.dataReceived(DataType.todoList);
            }
            case 2 ->{

            }
            case 3 ->{
               String taskData =  screenDelegate.getData("Input task No from TODO list or Task name");
               ArrayList<Task> searchResult = searchTasks(taskData);

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

    private ArrayList<Task> searchTasks(String taskData) {
        ArrayList<Task> result = new ArrayList<>();

        try {
            int taskNumber = Integer.parseInt(taskData) - 1;
            if(taskNumber >= 0 && taskNumber < tasks.size()){
                result.add(tasks.get(taskNumber));
            }
        }
        catch (NumberFormatException ignored) {

        }

        for(Task task: tasks){
            if(task.name.equals(taskData)){
                result.add(task);
            }
        }

        return result;
    }

}

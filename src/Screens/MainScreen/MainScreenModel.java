package Screens.MainScreen;

public class MainScreenModel {

    int currentMenuChoice = 0;
    String[] menuItems = new String[]{
            "Print to-do list.",
            "Add Task.",
            "Delete Task.",
            "Edit Task.",
            "Log Out.",
            "Exit Program."};
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

    public void executeChoice() {

    }
}

package Screens.MainScreen;

import java.util.Scanner;

public class MainScreenUI {
    Scanner input = new Scanner(System.in);
    MainScreenModel model = new MainScreenModel();
    public MainScreenUI() {
        model.setScreenDelegate(this);
        do{
            this.printMainMenu();
            model.setMenuChoice(inputMenuChoice());
            model.executeChoice();


        }
        while(!model.exit());
    }

    private int inputMenuChoice() {
        System.out.print(">>");
        String userInput = input.nextLine();
        int choice = 0;
        try{
            choice = Integer.parseInt(userInput);

            //TODO: Check whether choice is inside a menu capacity.
        }
        catch(Exception e){
            System.out.println("Please enter a valid choice");
        }
        //TODO: Repeat Input do-while. Check choice


    }

    private void printMainMenu(){
        System.out.println("Welcome to the Main Screen");
        System.out.print(model.getMenu());


    }

    public void dataReceived(MainScreenModel.DataType dataType) {
        switch (dataType) {
            case todoList -> {
                System.out.println(model.getTodoList());
            }
            case task -> {

            }
        }
    }

    public String getData(String description) {
        System.out.println(description);
        return input.nextLine();
    }
}

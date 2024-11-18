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
        return input.nextInt();
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
}

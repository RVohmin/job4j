package ru.job4j.tracker;

import java.util.ArrayList;

public class StartUI {


    public void init(Input input, Tracker tracker, ArrayList<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(ArrayList<UserAction> actions) {
        System.out.println("Menu.");
        for (UserAction item : actions) {
            System.out.println(actions.indexOf(item) + ". " + item.name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        actions.add(new ShowAllAction());
        actions.add(new ReplaceItemAction());
        actions.add(new DeleteItemAction());
        actions.add(new FindItemByIdAction());
        actions.add(new FindItemByNameAction());
        actions.add(new ExitAction());
        new StartUI().init(validate, tracker, actions);
    }
}


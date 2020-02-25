package ru.job4j.tracker;

public class ShowAllAction implements UserAction {

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("==== Show All Item ====");
        for (Item item : tracker.items) {
            System.out.println(String.format("%s %s", item.getId(), item.getName()));
        }
        return true;
    }
}

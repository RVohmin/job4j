package ru.job4j.tracker;

public class FindItemByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("==== Starting finding Item by Name ====");
        String name = input.askStr("Enter Name Item for find: ");
        Item[] finding = tracker.findByName(name);
        if (finding.length > 0) {
            for (Item item : finding) {
                System.out.println("Finding " + item.getName() + " " + item.getId());
            }
        } else {
            System.out.println("Nothing finding");
        }
        return true;
    }
}

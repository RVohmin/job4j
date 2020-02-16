package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select ");
            if (select == 0) {
                System.out.println("==== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                for (Item item : tracker.findAll()) {
                    System.out.println(item.getName() + " " + item.getId());
                }
            } else if (select == 2) {
                System.out.println("==== Starting replace Item ====");
                String id = input.askStr("Enter existing ID Item: ");
                String name = input.askStr("Enter name for new Item: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item successfully replaced");
                } else {
                    System.out.println("error");
                }
            } else if (select == 3) {
                System.out.println("==== Starting delete Item ====");
                String id = input.askStr("Enter existing ID Item: ");
                if (tracker.delete(id)) {
                    System.out.println("Item successfully deleted");
                } else {
                    System.out.println("error");
                }
            } else if (select == 4) {
                System.out.println("==== Starting finding Item by ID ====");
                String id = input.askStr("Enter ID Item for find: ");
                Item finding = tracker.findById(id);
                if (finding != null) {
                    System.out.println("Finding " + finding.getName() + " " + finding.getId());
                } else {
                    System.out.println("Nothing finding");
                }
            } else if (select == 5) {
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
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}

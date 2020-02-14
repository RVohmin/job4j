package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 249);
        Book book2 = new Book("Learn Java", 459);
        Book book3 = new Book("Computer Since", 756);
        Book book4 = new Book("Algoritms", 450);

        Book[] books = {book1, book2, book3, book4};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].title + " " + books[i].pages + " pages");
        }
        System.out.println();
        System.out.println("Меняем местами элементы массива 0 и 3");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].title + " " + books[i].pages + " pages");
        }
        System.out.println();
        System.out.println("выводим на экран только книги с именем clean code");
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equals("Clean Code")) {
            System.out.println(books[i].title + " " + books[i].pages + " pages");
            }
        }
    }
}

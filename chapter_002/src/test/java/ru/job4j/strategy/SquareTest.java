package ru.job4j.strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        //Square square = new Square();
        // получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        // Создаем буффер для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.setOut(new PrintStream(out));
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Square());
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("++++++++")
                                .add("+      +")
                                .add("+      +")
                                .add("++++++++")
                                .add("")
                                .toString()
                )
        );
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;        // получаем ссылку на стандартный вывод в консоль.
        ByteArrayOutputStream out = new ByteArrayOutputStream(); // Создаем буффер для хранения вывода.
        System.setOut(new PrintStream(out)); //Заменяем стандартный вывод на вывод в пямять для тестирования.
        new Paint().draw(new Triangle()); // выполняем действия пишушиее в консоль.
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("    +    ")
                                .add("   + +   ")
                                .add("  +   +  ")
                                .add(" +     + ")
                                .add("+++++++++")
                                .add("")
                                .toString()
                )
        );
    }
}

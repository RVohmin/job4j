package ru.job4j.collection;

import ru.job4j.lambda.Attachment;

import java.util.Collections;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Test {
//    public interface Operation {
//        double calc(int left, int right);
//    }

    public void multiple(int start, int finish, int value,
                         BiFunction<Integer, Integer, Double> op,
                         Consumer<Double> media) {
        for (int index = start; index != finish; index++) {
            media.accept(op.apply(value, index));
        }
    }
//    Comparator<Student> comparator = new comparator<Student>(){
//        @Override
//        public int compare(Student o1, Student o2) {
//            return o1.getName().compareTo(o2.getName());
//        }
//    };
//    Function<Mark, Student> func = ...
//    Student apply(Mark mark);
    public static void main(String[] args) {

    }
}
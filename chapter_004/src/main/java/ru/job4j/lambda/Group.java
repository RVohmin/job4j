package ru.job4j.lambda;

import java.util.List;

public class Group {
    public static void sections(List<Student> students) {
  //      return students.stream().flatMap(student -> new Holder(student.getName(), student.getUnits().stream().flatMap(unit -> )))
                // собираем объект Holder с unit и name
//        ).collect( // собираем карту
//                Collectors.groupingBy(t -> t.key, // определяем группировку
//                        Collector.of(
//                                HashSet::new, // аккумулятор.
//                                (set, el) -> // как добавлять данные.
//                                        (left, right) -> { left.addAll(right); return left; } // для агрегации.
//                        )
//                )
 //       );
    }
}

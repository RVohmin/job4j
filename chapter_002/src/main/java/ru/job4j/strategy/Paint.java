package ru.job4j.strategy;

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint pa = new Paint();
        Square sq = new Square();
        Triangle tr = new Triangle();
        pa.draw(sq);
        pa.draw(tr);
    }
}

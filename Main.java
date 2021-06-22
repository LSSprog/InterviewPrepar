import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        1. Создать builder для класса Person со следующими полями: String firstName, String lastName,
//        String middleName, String country, String address, String phone, int age, String gender.
//        2. Описать ошибки в коде (см. задание в методичке) и предложить варианты оптимизации.
//        3. Написать пример кода, который реализует принцип полиморфизма, на примере фигур —
//         круг, квадрат, треугольник.

        task1();
        // task2() - смотреть в одиельном классе task2
        task3();

    }

    public static void task1() {
        Person person = new Person.Builder("Иван", "Петров", "8(999)999-99-99")
                .addAge(25)
                .addCountry("Russia")
                .build();
        System.out.println(person);
    }

    private static void task3() {

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(0, 0, 10));
        shapeList.add(new Square(50, 50, 10));
        shapeList.add(new Triangle(100, 100, 120, 120, 110, 120));
        for (Shape sh : shapeList) {
            System.out.println("Площадь" + sh.area());
            System.out.println("Периметр" + sh.perimetr());
        }
    }
}




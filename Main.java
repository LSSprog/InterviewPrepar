import java.util.List;

public class Main {
    public static void main(String[] args) {
//        + 1. Создать базу данных Student с полями id, name, mark.
//        + 2. Создать сущность Student и добавить в нее аннотации. Поле id должно заполняться
//        автоматически.
//        + 3. Создать конфигурационный файл hibernate.cfg.xml, в котором указать свойства для
//        подключения к БД и список классов с аннотациями Entity.
//        + 4. Создать класс со статическим методом, который возвращает объект SessionFactory.
//        + 5. Создать DAO-слой с операциями добавления, удаления, изменения сущности, выборки записи
//        по ID и всех записей.
//        + 6. Добавить 1000 записей в таблицу Student.
//        + 7. Проверить работоспособность приложения, выполнить методы по удалению, изменению,
//                добавлению записей, а также выборки одной и всех записей.


        Factory factory = new Factory();

        StudentDao dao = new StudentDao(factory);

        System.out.println("База студентов");

        int x = 100; // кол-во студентов
        X_Students(x, dao);

        dao.deleteById(20);

        Student changeStudent = new Student(13, "MyName", "50005");
        dao.saveOrUpdate(changeStudent);

        Student newStudent = new Student("FistName", "70007");
        dao.saveOrUpdate(newStudent);

        System.out.println(dao.findById(15));

        List<Student> allStudents = dao.showAll();

        factory.shutdown();

    }

    private static void X_Students(int x, StudentDao dao) {
        for (int i = 0; i < x; i++) {
            String nameStudent = "name" + i;
            String markStudent = "mark300" + i;
            Student newStudent = new Student(nameStudent, markStudent);
            dao.saveOrUpdate(newStudent);
        }
    }
}

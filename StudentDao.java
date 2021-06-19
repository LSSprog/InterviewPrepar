import org.hibernate.Session;

import java.util.List;

public class StudentDao {
    private Factory factory;

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public StudentDao(Factory factory) {
        this.setFactory(factory);
    }

    public void saveOrUpdate (Student student) {
        try (Session session = factory.getSession()) {
            session.beginTransaction();
            session.saveOrUpdate(student);
            session.getTransaction().commit();
        }
    }

    public Student findById (Integer id) {
        try (Session session = factory.getSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            return student;
        }
    }

    public void deleteById (Integer id) {
        try (Session session = factory.getSession()){
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.delete(student);
            session.getTransaction().commit();
        }
    }

    public List<Student> showAll() {
        try (Session session = factory.getSession()){
            session.beginTransaction();
            List<Student> students = session.createQuery("FROM Student").getResultList();
            return students;
        }
    }
}

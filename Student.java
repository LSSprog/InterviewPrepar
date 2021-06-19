import javax.persistence.*;

@Entity
@Table(name = "student_tbl")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer id;

    @Column(name = "name_fld")
    private String name;

    @Column(name = "mark_fld")
    private String mark;

    public Student() {
    }

    public Student(String name, String mark) {
        this.name = name;
        this.mark = mark;
    }

    public Student(int id, String name, String mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}

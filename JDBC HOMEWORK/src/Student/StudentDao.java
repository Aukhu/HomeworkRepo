package Student;

import java.util.List;

public interface StudentDao {
    Student create(Student student);
    List<Student> findAll();
    Student findById(int id);
    Student update(Student student);
    void delete(int id);
}
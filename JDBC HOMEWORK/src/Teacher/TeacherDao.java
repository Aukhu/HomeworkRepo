package Teacher;

import java.util.List;

public interface TeacherDao {
    Teacher create(Teacher teacher);
    List<Teacher> findAll();
    Teacher findById(int id);
    Teacher update(Teacher teacher);
    void delete(int id);
}
package Subject;

import java.util.List;

public interface SubjectDao {
    int create(Subject subject);
    List<Subject> findAll();
    Subject findById(int id);
    Subject findByName(String subject_name);
    Subject update(Subject subject);
    void delete(int id);
}
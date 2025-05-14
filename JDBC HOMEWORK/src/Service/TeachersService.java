package Service;

import Subject.Subject;
import Subject.SubjectDao;
import Teacher.TeacherDao;
import Teacher.Teacher;

public class TeacherService {
    private TeacherDao teacherDao;
    private SubjectDao subjectDao;

    public TeacherService(TeacherDao teacherDao, SubjectDao subjectDao) {
        this.teacherDao = teacherDao;
        this.subjectDao = subjectDao;
    }

    public String getSubjectNameByTeacherId(int teacherId){
        Teacher teacher = teacherDao.findById(teacherId);

        if (teacher == null) return "Teacher not found.";

        Subject subject = subjectDao.findById(teacher.getSubject());
        if(subject == null) return "Subject not found.";

        return subject.getSubjectName();
    }
}
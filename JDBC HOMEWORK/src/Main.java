import Dcm.DatabaseConnectionManager;
import Service.TeacherService;
import Student.StudentDao;
import Student.StudentDaoImpl;
import Student.Student;
import Subject.Subject;
import Subject.SubjectDao;
import Subject.SubjectDaoImpl;
import Teacher.Teacher;
import Teacher.TeacherDao;
import Teacher.TeacherDaoImpl;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/school",
                "postgres",
                "mango"
        );

        Connection connection = dcm.getConnection();

        SubjectDao subjectDao = new SubjectDaoImpl();
        StudentDao studentDao = new StudentDaoImpl();
        TeacherDao teacherDao = new TeacherDaoImpl();

        TeacherService teacherService = new TeacherService(teacherDao, subjectDao);

        Subject sub1 = new Subject(0, "Math");
        subjectDao.create(sub1);
        int sub1Id = subjectDao.findByName(sub1.getSubjectName()).getId();

        Subject sub2 = new Subject(0, "Physics");
        subjectDao.create(sub2);
        int sub2Id = subjectDao.findByName(sub2.getSubjectName()).getId();

        Subject sub3 = new Subject(0, "Biology");
        subjectDao.create(sub3);
        int sub3Id = subjectDao.findByName(sub3.getSubjectName()).getId();

        studentDao.create(new Student(0, "Irakli", "Kakabadze", 9));
        studentDao.create(new Student(0, "Avto", "Ukhurgunashvili", 11));
        studentDao.create(new Student(0, "Nikoloz", "Gogoberishvili", 9));

        teacherDao.create(new Teacher(0, "Nadejda", "Japaridze", sub1Id, 2800.00));
        teacherDao.create(new Teacher(0, "Ketevan", "Ghonghadze", sub2Id, 2350.00));
        teacherDao.create(new Teacher(0, "Rusudan", "Gaphrindashvili", sub3Id, 1750.25));


        String subjectName = teacherService.getSubjectNameByTeacherId(1);
        System.out.println(
                teacherDao.findById(1).getFirst_name() +
                        teacherDao.findById(1).getLast_name() + " teaches " +
                        teacherService.getSubjectNameByTeacherId(1)
        );

    }
}
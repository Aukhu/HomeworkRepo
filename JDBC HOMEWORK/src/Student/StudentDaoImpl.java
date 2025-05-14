package Student;

import Dcm.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
    private final DatabaseConnectionManager dcm;

    public StudentDaoImpl() {
        dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/school",
                "postgres",
                "mango");
    }

    @Override
    public Student create(Student student) {
        try (Connection con = dcm.getConnection()) {
            String INSERT_STUDENT = "INSERT INTO students (first_name, last_name, grade) VALUES (?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(INSERT_STUDENT);
            stmt.setString(1, student.getFirst_name());
            stmt.setString(2, student.getLast_name());
            stmt.setInt(3, student.getGrade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        try (Connection con = dcm.getConnection()) {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM students");
            while (rs.next()) {
                students.add(new Student(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("grade")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public Student findById(int id) {
        String FIND_STUDENT = "SELECT * FROM students WHERE id = ?";
        try (Connection con = dcm.getConnection();
             PreparedStatement stmt = con.prepareStatement(FIND_STUDENT)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Student(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("grade")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Student update(Student student) {
        try (Connection con = dcm.getConnection()) {
            String UPDATE_STUDENT = "UPDATE students SET first_name = ?, last_name = ?, grade = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(UPDATE_STUDENT);
            stmt.setString(1, student.getFirst_name());
            stmt.setString(2, student.getLast_name());
            stmt.setInt(3, student.getGrade());
            stmt.setInt(4, student.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void delete(int id) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement stmt = con.prepareStatement("DELETE FROM students WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
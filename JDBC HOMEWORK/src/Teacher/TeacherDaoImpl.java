package Teacher;

import Dcm.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherDaoImpl implements TeacherDao{
    private final DatabaseConnectionManager dcm;

    public TeacherDaoImpl() {
        dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/school",
                "postgres",
                "mango");
    }


    @Override
    public Teacher create(Teacher teacher) {
        try (Connection con = dcm.getConnection()) {
            String INSERT_TEACHER = "INSERT INTO teachers (first_name, last_name, subject, salary) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(INSERT_TEACHER);
            stmt.setString(1, teacher.getFirst_name());
            stmt.setString(2, teacher.getLast_name());
            stmt.setInt(3, teacher.getId());
            stmt.setDouble(4, teacher.getSalary());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Teacher> findAll() {
        List<Teacher> teachers = new ArrayList<>();
        try (Connection con = dcm.getConnection()) {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM teachers");
            while (rs.next()) {
                teachers.add(new Teacher(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("subject"),
                        rs.getDouble("salary")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teachers;
    }

    @Override
    public Teacher findById(int id) {
        String FIND_TEACHER = "SELECT * FROM teachers WHERE id = ?";
        try (Connection con = dcm.getConnection();
             PreparedStatement stmt = con.prepareStatement(FIND_TEACHER)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Teacher(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("subject"),
                        rs.getDouble("salary")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Teacher update(Teacher teacher) {
        try (Connection con = dcm.getConnection()) {
            String UPDATE_TEACHER = "UPDATE teachers SET first_name = ?, last_name = ?, subject = ?, salary = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(UPDATE_TEACHER);
            stmt.setString(1, teacher.getFirst_name());
            stmt.setString(2, teacher.getLast_name());
            stmt.setInt(3, teacher.getId());
            stmt.setDouble(4, teacher.getSalary());
            stmt.setInt(5, teacher.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void delete(int id) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement stmt = con.prepareStatement("DELETE FROM teachers WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
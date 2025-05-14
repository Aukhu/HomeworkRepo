package Subject;

import Dcm.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubjectDaoImpl implements SubjectDao{
    private final DatabaseConnectionManager dcm;

    public SubjectDaoImpl() {
        dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/school",
                "postgres",
                "mango");
    }


    @Override
    public int create(Subject subject) {
        final String INSERT_SUBJECT = "INSERT INTO subjects (subject_name) VALUES (?) RETURNING id";

        String subject_name = subject.getSubjectName();

        try (
                Connection con = dcm.getConnection();
                PreparedStatement stmt = con.prepareStatement(INSERT_SUBJECT)
        ){
            stmt.setString(1, subject_name);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }

    @Override
    public List<Subject> findAll() {
        List<Subject> subjects = new ArrayList<>();
        try (Connection con = dcm.getConnection()) {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM subjects");
            while (rs.next()) {
                subjects.add(new Subject(rs.getInt("id"), rs.getString("subject_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return subjects;
    }

    @Override
    public Subject findById(int id) {
        String FIND_SUBJECT = "SELECT * FROM subjects WHERE id = ?";
        try (Connection con = dcm.getConnection();
             PreparedStatement stmt = con.prepareStatement(FIND_SUBJECT)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Subject(
                        rs.getInt("id"),
                        rs.getString("subject_name")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Subject findByName(String name) {
        String NAME_SUBJECT = "SELECT * FROM subjects WHERE subject_name = ?";
        try (Connection con = dcm.getConnection();
             PreparedStatement statement = con.prepareStatement(NAME_SUBJECT)) {
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return new Subject(
                        rs.getInt("id"),
                        rs.getString("subject_name")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Subject update(Subject subject) {
        try (Connection conn = dcm.getConnection()) {
            String UPDATE_STUDENT = "UPDATE subjects SET subject_name = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(UPDATE_STUDENT);
            stmt.setString(1, subject.getSubjectName());
            stmt.setInt(2, subject.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void delete(int id) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement DELETE_STUDENT = con.prepareStatement("DELETE FROM subjects WHERE id = ?");
            DELETE_STUDENT.setInt(1, id);
            DELETE_STUDENT.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
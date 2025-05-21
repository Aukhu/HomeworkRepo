import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private final DatabaseConnectionManager dcm;

    public UserDaoImpl() {
        this.dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/login",
                "postgres",
                "admin"
        );
    }


    @Override
    public User create(User user) {
        try (Connection con = dcm.getConnection()) {
            String INSERT_USER = "INSERT INTO users (Username, password, firstName, lastName) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(INSERT_USER);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getFirstName());
            stmt.setString(4, user.getLastName());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try (Connection con = dcm.getConnection()) {
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM users");
            while (rs.next()) {
                users.add(new User(
                        rs.getString("Username"),
                        rs.getString("password"),
                        rs.getString("firstName"),
                        rs.getString("lastName")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    @Override
    public User findByUsername(String username) {
        String FIND_USER = "SELECT * FROM users WHERE Username = ?";
        try (Connection con = dcm.getConnection();
             PreparedStatement stmt = con.prepareStatement(FIND_USER)) {

            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new User(
                        rs.getString("Username"),
                        rs.getString("password"),
                        rs.getString("firstName"),
                        rs.getString("lastName")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public User update(User user) {
        try (Connection con = dcm.getConnection()) {
            String UPDATE_USER = "UPDATE users SET Username = ?, password = ?, firstName = ?, lastName = ? WHERE Username = ?";
            PreparedStatement stmt = con.prepareStatement(UPDATE_USER);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getFirstName());
            stmt.setString(4, user.getLastName());
            stmt.setString(5, user.getUsername());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void delete(String username) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement stmt = con.prepareStatement("DELETE FROM users WHERE Username = ?");
            stmt.setString(1, username);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
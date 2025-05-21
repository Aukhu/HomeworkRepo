import java.util.List;

public interface UserDao {
    User create(User user);
    List<User> findAll();
    User findByUsername(String username);
    User update(User user);
    void delete(String username); // username ti vshli (ase sjobs)
}
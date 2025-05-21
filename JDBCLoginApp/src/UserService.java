public class UserService {
    private static final UserDao userDao = new UserDaoImpl();

    public static boolean registerUser(String username, String password, String firstName, String lastName) {
        if(userDao.findByUsername(username) != null) {
            return false;
        }

        User user = new User(username, password, firstName, lastName);
        userDao.create(user);

        return true;
    }

    public static User login(String username, String password){
        User user = userDao.findByUsername(username);

        if(user != null && user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }
}
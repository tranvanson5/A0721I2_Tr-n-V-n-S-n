package Service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDao {
     List<User> getAll();
    boolean delete(int id) throws SQLException;
    boolean update(User user) throws SQLException;
    User seleteUser(int id) throws SQLException;
    void insertUser(User user) throws SQLException;
}

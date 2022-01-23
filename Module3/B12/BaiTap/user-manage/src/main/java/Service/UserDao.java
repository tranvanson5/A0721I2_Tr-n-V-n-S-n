package Service;

import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements IUserDao{
    private String jdbcURL = "jdbc:mysql://localhost:3306/bai12_demo?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456";

    private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, email, country) VALUES " +
            " (?, ?, ?);";
    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";

    public UserDao() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public List<User> getAll() {
        List<User> list= new ArrayList<>();
        try (Connection connection= getConnection();
             PreparedStatement statement= connection.prepareStatement(SELECT_ALL_USERS);
        ){
            System.out.println(statement);
            ResultSet resultSet= statement.executeQuery();
            while(resultSet.next()){
                int id= resultSet.getInt("id");
                String name= resultSet.getString("name");
                String email= resultSet.getString("email");
                String country= resultSet.getString("country");
                list.add(new User(id,name,email,country));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        boolean rowDelete;
        try (Connection connection=getConnection();
        PreparedStatement statement= connection.prepareStatement(DELETE_USERS_SQL);
        ){
            statement.setInt(1,id);
            rowDelete=statement.executeUpdate()>0;
        }
        return delete(id);
    }

    @Override
    public boolean update(User user) throws SQLException {
        boolean rowUpdate;
        try(Connection connection= getConnection();
        PreparedStatement statement= connection.prepareStatement(UPDATE_USERS_SQL)){
            statement.setString(1,user.getName());
            statement.setString(2,user.getEmail());
            statement.setString(3,user.getCountry());
            statement.setInt(4,user.getId());
            rowUpdate= statement.executeUpdate()>0;
        }
        return rowUpdate;
    }

    @Override
    public User seleteUser(int id) throws SQLException {
        User user=null;
        try (Connection connection=getConnection();
        PreparedStatement statement= connection.prepareStatement(SELECT_USER_BY_ID)){
            System.out.println(statement);
            ResultSet resultSet= statement.executeQuery();
            while (resultSet.next()){
                String name= resultSet.getString("name");
                String email= resultSet.getString("email");
                String country= resultSet.getString("country");
                user=new User(id,name,email,country);
            }
        }
        return user;
    }

    @Override
    public void insertUser(User user) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        }

    }
}

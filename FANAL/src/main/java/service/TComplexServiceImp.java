package service;

import model.TComplex;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TComplexServiceImp implements TComplexService{
    private String jdbcURL = "jdbc:mysql://localhost:3306/fanal_tcomplex?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456";

    private static final String SELECT_ALL = "SELECT * FROM fanal_tcomplex.tcomplex;";
    private static final String DELETE = "delete from fanal_tcomplex.tcomplex where id = ?;";

    public TComplexServiceImp() {
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
    public void insert(TComplex tComplex) throws SQLException {

    }

    @Override
    public TComplex select(int id) {
        return null;
    }

    @Override
    public List<TComplex> selectAll() throws SQLException {
        List<TComplex> list= new ArrayList<>();
        try (
                Connection connection= getConnection();
                PreparedStatement statement=connection.prepareStatement(SELECT_ALL);
                ){
            System.out.println(statement);
            ResultSet resultSet= statement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                double area= resultSet.getDouble("area");
                String status= resultSet.getString("status");
                int floor= resultSet.getInt("floor");
                String type=resultSet.getString("type");
                String description=resultSet.getString("description");
                double price = resultSet.getDouble("price");
                String date_start=resultSet.getString("date_start");
                String date_end=resultSet.getString("date_end");
                list.add(new TComplex(id,area,status,floor,type,description,price,date_start,date_end));
            }

        }
        return list;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public boolean update(TComplex tComplex) throws SQLException {
        return false;
    }
}

package sevice.employee;

import Repository.Repository;
import model.employee.employee;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeService {
    private Repository repository= new Repository();
    public List<employee> getAll() throws SQLException {
        List<employee> list=new ArrayList<>();
        try (
                Connection connection= this.repository.getConnection();
                PreparedStatement statement= connection.prepareStatement("select * from employee")
                ){
            ResultSet resultSet= statement.executeQuery();
            while(resultSet.next()){
                int id= resultSet.getInt("employee_id");
                String name=resultSet.getString("employee_name");
                Date birthday= resultSet.getDate("employee_birthday");
                double salary= resultSet.getDouble("employee_salary");
                String phone= resultSet.getString("employee_phone");
                String email= resultSet.getString("employee_email");
                String address=resultSet.getString("employee_address");
                int position_id= resultSet.getInt("position_id");
                int education_degree_id= resultSet.getInt("education_degree_id");
                int division_id= resultSet.getInt("division_id");
                String username= resultSet.getString("username");
                list.add(new employee(id,birthday,name,salary,phone,email,address,position_id,education_degree_id,division_id,username));
            }
        }
        return list;
    }
}

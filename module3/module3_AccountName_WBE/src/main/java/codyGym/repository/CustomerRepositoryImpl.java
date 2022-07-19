package codyGym.repository;

import codyGym.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private String jdbcURL = "jdbc:mysql://localhost:3306/furama";
    private String jbdcUserName = "root";
    private String jbdcPassWord = "123456";

    private Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jbdcUserName, jbdcPassWord);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
    private static final String SQL_SELECT_CUSTOMER = "select * from customer";
    private static final String SQL_SELECT_CUSTOMER_BY_NAME = "select * from customer where ho_ten like(?)";
    private static final String SQL_SELECT_CUSTOMER_BY_ADDRESS = "select * from customer where dia_chi like(?)";
//    private static final String SQL_SELECT_TYPE_CUSTOMER = "select ho_ten,type_name from " +
//            "type_customer join customer on type_customer.type_id = customer.ma_loai_khach " +
//            "where ma_khach_hang= (?)";

    @Override
    public List<Customer> findAll() throws SQLException {
        List<Customer> customers = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT_CUSTOMER);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("ma_khach_hang");
            String name = resultSet.getString("ho_ten");
            String email = resultSet.getString("email");
            int sdt = resultSet.getInt("so_dien_thoai");
            String dateOfBirth = resultSet.getString("ngay_sinh");
            int cmnd = resultSet.getInt("so_cmnd");
            int gender = resultSet.getInt("gioi_tinh");
            String address = resultSet.getString("dia_chi");
            int typeCode = resultSet.getInt("ma_loai_khach");
            customers.add(new Customer(id, name, email, sdt, dateOfBirth, cmnd, gender, address, typeCode));
        }
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
        return customers;
    }
    @Override
    public void deleteCustomer(int id) throws SQLException {
        Connection connection = getConnection();
        String query = "{CALL delete_customer(?)}";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        statement.executeUpdate();
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
    @Override
    public Customer findById(int id) throws SQLException {
        Customer customer = null;
        Connection connection = getConnection();
        String query = "{CALL find_by_id(?)}";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id_cus = resultSet.getInt("ma_khach_hang");
            String name = resultSet.getString("ho_ten");
            String email = resultSet.getString("email");
            int sdt = resultSet.getInt("so_dien_thoai");
            String dateOfBirth = resultSet.getString("ngay_sinh");
            int cmnd = resultSet.getInt("so_cmnd");
            int gender = resultSet.getInt("gioi_tinh");
            String address = resultSet.getString("dia_chi");
            int typeCode = resultSet.getInt("ma_loai_khach");
            customer = new Customer(id_cus, name, email, sdt, dateOfBirth, cmnd, gender, address, typeCode);
        }
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
        return customer;
    }
    @Override
    public void createCustomer(Customer customer) throws SQLException {
        Connection connection = getConnection();
        String query = "{CALL insert_customer(?,?,?,?,?,?,?,?)}";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, customer.getName());
        statement.setString(2, customer.getDateOfBirth());
        statement.setInt(3, customer.getGender());
        statement.setInt(4, customer.getCmnd());
        statement.setString(5, customer.getEmail());
        statement.setString(6, customer.getAddress());
        statement.setInt(7, customer.getTypeCode());
        statement.setInt(8, customer.getSdt());
        statement.executeUpdate();
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
    @Override
    public void updateCustomer(Customer customer) throws SQLException {
        Connection connection = getConnection();
        String query = "CALL update_customer(?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, customer.getId());
        statement.setString(2, customer.getName());
        statement.setString(3, customer.getDateOfBirth());
        statement.setInt(4, customer.getGender());
        statement.setInt(5, customer.getCmnd());
        statement.setInt(6, customer.getSdt());
        statement.setString(7, customer.getEmail());
        statement.setString(8, customer.getAddress());
        statement.setInt(9, customer.getTypeCode());
        statement.executeUpdate();
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    @Override
    public List<Customer> findByName(String name) throws SQLException {
        List<Customer> customers = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT_CUSTOMER_BY_NAME);
        statement.setString(1,name);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id_cus = resultSet.getInt("ma_khach_hang");
            String name_cus = resultSet.getString("ho_ten");
            String email = resultSet.getString("email");
            int sdt = resultSet.getInt("so_dien_thoai");
            String dateOfBirth = resultSet.getString("ngay_sinh");
            int cmnd = resultSet.getInt("so_cmnd");
            int gender = resultSet.getInt("gioi_tinh");
            String address = resultSet.getString("dia_chi");
            int typeCode = resultSet.getInt("ma_loai_khach");
            customers.add(new Customer(id_cus, name_cus, email, sdt, dateOfBirth, cmnd, gender, address, typeCode));
        }
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
        return customers;
    }
    @Override
    public List<Customer> findByAddress(String address) throws SQLException {
        List<Customer> customers = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT_CUSTOMER_BY_ADDRESS);
        statement.setString(1,address);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id_cus = resultSet.getInt("ma_khach_hang");
            String name_cus = resultSet.getString("ho_ten");
            String email = resultSet.getString("email");
            int sdt = resultSet.getInt("so_dien_thoai");
            String dateOfBirth = resultSet.getString("ngay_sinh");
            int cmnd = resultSet.getInt("so_cmnd");
            int gender = resultSet.getInt("gioi_tinh");
            String address_cus = resultSet.getString("dia_chi");
            int typeCode = resultSet.getInt("ma_loai_khach");
            customers.add(new Customer(id_cus, name_cus, email, sdt, dateOfBirth, cmnd, gender, address_cus, typeCode));
        }
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
        return customers;
    }
    @Override
    public List<String> typeCustomer(int id) throws SQLException {
        List<String> type_customer = new ArrayList<>();
     Connection connection = getConnection();
     CallableStatement statement = connection.prepareCall("call type_customer(?,?,?)");
     statement.setInt(1,id);
     statement.executeQuery();
        String name = statement.getString(2);
     String type = statement.getString(3);
     type_customer.add(1,name);
     type_customer.add(2,type);
     return type_customer;
    }
}

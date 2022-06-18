package codeGym.repository;

import codeGym.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements IUserRepository {
    private String jdbcURL = "jdbc:mysql://localhost:3306/demo1?useSSL=false";
    private String jbdcUserName = "root";
    private String jbdcPassWord = "123456";
    private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, email, country) VALUES " +
            " (?, ?, ?);";

    private static final String SELECT_USER_BY_ID = "select id,name,email,address from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, address =? where id = ?;";

    protected Connection getConnection() {
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
    public void insertUser(User user) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        try
                (Connection connection = getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getAddress());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public User selectUser(int id) {
        User user = null;
        try (
                Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT_USER_BY_ID");) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                user = new User(id, name, email, address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> selectAllUser() {
        List<User> users = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT_ALL_USERS");) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                users.add(new User(id, name, email, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDelete;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE_USERS_SQL");) {
            preparedStatement.setInt(1, id);
            rowDelete = preparedStatement.executeUpdate() > 0;
        }
        return rowDelete;
    }
    @Override
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getAddress());
            statement.setInt(4, user.getId());
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}

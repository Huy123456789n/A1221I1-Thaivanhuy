package codeGym.repository;

import codeGym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    User selectUser(int id);
    List<User> selectAllUser();
    boolean deleteUser(int id) throws SQLException;
    boolean updateUser(User user) throws SQLException;

}

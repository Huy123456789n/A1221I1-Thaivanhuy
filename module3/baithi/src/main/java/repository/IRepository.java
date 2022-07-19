package repository;

import model.PayType;
import model.Room;

import java.sql.SQLException;
import java.util.List;

public interface IRepository {
    List<Room> findAll() throws SQLException;
    void delete(int id) throws SQLException;
    void update(Room room) throws SQLException;
    Room findById(int id) throws SQLException;
    void create (Room room) throws SQLException;
    List<Room> findByName(String name) throws SQLException;
    List<PayType> findALLPayType() throws SQLException;
}

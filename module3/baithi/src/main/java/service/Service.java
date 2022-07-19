package service;

import model.PayType;
import model.Room;
import repository.IRepository;
import repository.RepositoryImpl;

import java.sql.SQLException;
import java.util.List;

public class Service implements IService{
    private IRepository repository = new RepositoryImpl();
    @Override
    public List<Room> findAll() throws SQLException {
        List<Room> rooms = repository.findAll();
        return rooms;
    }

    @Override
    public void delete(int id) throws SQLException {
        repository.delete(id);

    }

    @Override
    public void update(Room room) throws SQLException {
    repository.update(room);
    }

    @Override
    public Room findById(int id) throws SQLException {
        Room room = repository.findById(id);
        return room;
    }

    @Override
    public void create(Room room) throws SQLException {
        repository.create(room);
    }

    @Override
    public List<Room> findByName(String name) throws SQLException {
        List<Room> rooms = repository.findByName(name);
        return rooms;
    }

    @Override
    public List<PayType> findALLPayType() throws SQLException {
        List<PayType> payTypes = repository.findALLPayType();
        return payTypes;
    }
}

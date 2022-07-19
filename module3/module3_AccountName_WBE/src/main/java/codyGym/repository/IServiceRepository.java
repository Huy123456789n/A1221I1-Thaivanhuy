package codyGym.repository;

import codyGym.model.Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceRepository {
    List<Service> findAll() throws SQLException;
    void delete(String id) throws SQLException;
    void update(Service service);
    void create(Service service) throws SQLException;
    Service findById(String id) throws SQLException;
}

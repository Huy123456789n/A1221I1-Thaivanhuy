package codyGym.repository;

import codyGym.model.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryImpl<T> implements IServiceRepository{
    private static final String SQL_SELECT_ALL ="select * from service s join service_type t on s.service_type_id = t.service_type_id";
    private static final String SQL_INSERT_INTO ="call insert_service(?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_DELETE = "delete from service where service_id = ?";
    private static final String SQL_FIND_BY_ID = "select * from service where service id = ? ";
    ConnectionRepository connectionRepository = new ConnectionRepository();
    @Override
    public List<Service> findAll() throws SQLException {
        List<Service> services = new ArrayList<>();
        Connection connection = connectionRepository.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            String id = resultSet.getString("service_id");
            String name = resultSet.getString("name");
            int area = resultSet.getInt(3);
            double cost = resultSet.getDouble(4);
            int maxPeople= resultSet.getInt(5);
            int rent_type = resultSet.getInt(6);
//            int service = resultSet.getInt(7);
            String standard = resultSet.getString(8);
            String description = resultSet.getString(9);
            int pool = resultSet.getInt(10);
            int floors = resultSet.getInt("number_of_floors");
            String typeName = resultSet.getString("name_service");
            services.add(new Service(id,name,area,cost,maxPeople,rent_type,standard,description,pool,floors,typeName));
        }
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null ){
            connection.close();
        }
        return services;
    }

    @Override
    public void delete(String id) throws SQLException {
        Connection connection = connectionRepository.getConnection();
        PreparedStatement statement= connection.prepareStatement(SQL_DELETE);
        statement.setString(1,id);
        statement.executeUpdate();
    }

    @Override
    public void update(Service service) {
    }

    @Override
    public void create(Service service) throws SQLException {
    Connection connection = connectionRepository.getConnection();
    PreparedStatement statement = connection.prepareStatement(SQL_INSERT_INTO);
    statement.setString(1,service.getId());
    statement.setString(2,service.getName());
    statement.setInt(3,service.getArea());
    statement.setDouble(4,service.getCost());
    statement.setInt(5,service.getMaxPeople());
    statement.setInt(6,service.getRentType());
    statement.setInt(7,service.getServiceType());
    statement.setString(8,service.getStandardRoom());
    statement.setString(9,service.getDescription());
    statement.setInt(10,service.getPoolArea());
    statement.setInt(11,service.getNumberOfFloors());
    statement.executeUpdate();
        if (statement != null) {
            statement.close();
        }
        if (connection != null ){
            connection.close();
        }
    }
    @Override
    public Service findById(String id) throws SQLException {
        Service service = null;
        Connection connection = connectionRepository.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_FIND_BY_ID);
        statement.setString(1,id);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            String serviceId = resultSet.getString("service_id");
            String name = resultSet.getString("name");
            int area = resultSet.getInt("area");
            double cost = resultSet.getDouble("cost");
            int max_people = resultSet.getInt("max_people");
            int rentType = resultSet.getInt("rent_type_id");
            int serviceType = resultSet.getInt("service_type_id");
            String standardRoom = resultSet.getString("stadard_room");
            String description = resultSet.getString("description_service");
            int poolArea = resultSet.getInt("pool_area");
            int numberOfFloors = resultSet.getInt("number_of_floors");
            service = new Service(serviceId,name,area,cost,max_people,
                    rentType,serviceType,standardRoom,description,poolArea,numberOfFloors);
        }
        return service;
    }
}

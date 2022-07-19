package repository;

import model.PayType;
import model.Room;
import service.IService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl implements IRepository {
    private DBConnection connections = new DBConnection();
    private static final String SQL_SELECT = "select * from phongtro p join thanh_toan t on p.id_thanh_toan = t.id_thanh_toan";
    private static final String SQL_DElETE = "delete from phongtro where id = ?";
    private static final String SQL_INSERT  = "insert into phongtro(id,name,sdt,star_day,id_thanh_toan,ghi_chu) value (?,?,?,?,?,?)";
    private static final String SQL_SELECT_BY_NAME = "select * from phongtro p join thanh_toan t on p.id_thanh_toan = t.id_thanh_toan where name like(?)";
    private static final String SQL_UPDATE = "update phongtro set name =?,sdt=?,star_day=?,id_thanh_toan=?,ghi_chu=? where id = ?";
    private static final String SQL_SELECT_BY_ID = "select * from phongtro p join thanh_toan t on p.id_thanh_toan = t.id_thanh_toan where id =?";

    @Override
    public List<Room> findAll() throws SQLException {
        List<Room> rooms = new ArrayList<>();
        Connection connection = connections.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String sdt = resultSet.getString("sdt");
            String date = resultSet.getString("star_day");
            String nameThanhToan = resultSet.getString("name_thanh_toan");
            String note = resultSet.getString("ghi_chu");
            rooms.add(new Room(id,name,sdt,date,nameThanhToan,note));
        }
        return rooms;
    }

    @Override
    public void delete(int id) throws SQLException {
        Connection connection = connections.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_DElETE);
        statement.setInt(1,id);
        statement.executeUpdate();
    }

    @Override
    public void update(Room room) throws SQLException {
        Connection connection = connections.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_UPDATE);
        statement.setString(1,room.getName());
        statement.setString(2,room.getSdt());
        statement.setString(3,room.getStarDay());
        statement.setInt(4,room.getIdThanhToan());
        statement.setString(5,room.getNote());
        statement.setInt(6,room.getId());
        statement.executeUpdate();
    }

    @Override
    public Room findById(int id) throws SQLException {
        Room room = null;
        Connection connection = connections.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT_BY_ID);
        statement.setInt(1,id);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            String sdt = resultSet.getString("sdt");
            String date = resultSet.getString("star_day");
            String nameThanhToan = resultSet.getString("name_thanh_toan");
            String note = resultSet.getString("ghi_chu");
            room = new Room(id,name,sdt,date,nameThanhToan,note);
        }
        return room;
    }
    @Override
    public void create(Room room) throws SQLException {
        Connection connection = connections.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_INSERT);
        statement.setInt(1,room.getId());
        statement.setString(2,room.getName());
        statement.setString(3,room.getSdt());
        statement.setString(4,room.getStarDay());
        statement.setInt(5,room.getIdThanhToan());
        statement.setString(6,room.getNote());
        statement.executeUpdate();
    }

    @Override
    public List<Room> findByName(String name) throws SQLException {
        List<Room> rooms = new ArrayList<>();
        Connection connection = connections.getConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT_BY_NAME);
        statement.setString(1,name);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name_r = resultSet.getString("name");
            String sdt = resultSet.getString("sdt");
            String date = resultSet.getString("star_day");
            String nameThanhToan = resultSet.getString("name_thanh_toan");
            String note = resultSet.getString("ghi_chu");
            rooms.add(new Room(id,name_r,sdt,date,nameThanhToan,note));
        }
        return rooms;
    }

    @Override
    public List<PayType> findALLPayType() throws SQLException {
        List<PayType> payTypes = new ArrayList<>();
        Connection connection = connections.getConnection();
        PreparedStatement statement = connection.prepareStatement("select * from thanh_toan");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            int idTT = resultSet.getInt("id_thanh_toan");
            String nameTT = resultSet.getString("name_thanh_toan");
            payTypes.add(new PayType(idTT,nameTT));
        }
        return payTypes;
    }
}

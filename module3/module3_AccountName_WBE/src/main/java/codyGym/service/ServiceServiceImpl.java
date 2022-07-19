package codyGym.service;

import codyGym.model.Service;
import codyGym.repository.IServiceRepository;
import codyGym.repository.ServiceRepositoryImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceServiceImpl implements IServiceService {
    IServiceRepository serviceRepository = new ServiceRepositoryImpl<>();

    @Override
    public List<Service> findAll() throws SQLException {
        List<Service> services = new ArrayList<>();
        services = serviceRepository.findAll();
        return services;
    }

    @Override
    public void delete( String id) throws SQLException {
    serviceRepository.delete(id);
    }

    @Override
    public void update(Service service) {

    }

    @Override
    public void create(Service service) throws SQLException {
        serviceRepository.create(service);
    }

    @Override
    public Service findById(String id) throws SQLException {
        Service service = serviceRepository.findById(id);
        return service;
    }
}

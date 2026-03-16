package service;
import entity.Drone;
import repository.DroneRepository;
import repository.IDroneRepository;

import java.util.List;
import java.util.Scanner;

public class DroneService implements IDroneService {

    @Override
    public List<Drone> findAll() {
        return List.of();
    }

    @Override
    public List<Drone> search(String soHieu, String nguoiDieuPhoi) {
        return List.of();
    }

    @Override
    public void add(Drone drone) {

    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}

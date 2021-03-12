package com.dvnguyen.project.dao;

import java.util.List;
import java.util.Map;

import com.dvnguyen.project.entities.Car;

public interface CarDao {

    Car findById(int id);

    void remove(int id);

    void add(Car car);

    void update(int id, Car car);

    List<Map<String, Object>> findAll();
}

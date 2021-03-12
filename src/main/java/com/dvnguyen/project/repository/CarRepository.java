package com.dvnguyen.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.dvnguyen.project.entities.Car;

@Transactional(readOnly = true)
public interface CarRepository extends JpaRepository<Car, Integer> {

	@Transactional(timeout = 10)
	Car findByCarId(Integer carId);
	
	@Transactional(timeout = 10)
	List<Car> findAll();
	
	@Transactional
	Car save(Car car);
	
	void delete(Car car);
}

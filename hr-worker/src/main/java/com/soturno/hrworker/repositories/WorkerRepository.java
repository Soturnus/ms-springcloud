package com.soturno.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soturno.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}

package com.cg.ip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ip.entity.Appoinments;

@Repository
public interface AppoinmentsRepository extends JpaRepository<Appoinments, Long>{
	

}

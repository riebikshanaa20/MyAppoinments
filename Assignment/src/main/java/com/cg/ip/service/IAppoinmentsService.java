package com.cg.ip.service;

import java.util.List;

import com.cg.ip.dto.AppoinmentsDTO;
import com.cg.ip.entity.Appoinments;


public interface IAppoinmentsService {
	
    List<Appoinments> getAll();
	
	Appoinments addAppoinment(Appoinments appoinments)throws Exception;

}




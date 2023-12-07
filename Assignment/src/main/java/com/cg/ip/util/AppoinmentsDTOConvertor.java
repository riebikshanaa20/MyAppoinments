package com.cg.ip.util;

import org.springframework.stereotype.Component;

import com.cg.ip.dto.AppoinmentsDTO;
import com.cg.ip.dto.AppoinmentsResponseDTO;
import com.cg.ip.entity.Appoinments;

@Component
public class AppoinmentsDTOConvertor {
	public AppoinmentsResponseDTO getAppoinmentsResponseDTO(Appoinments appoinments)
	{
		AppoinmentsResponseDTO dto = new AppoinmentsResponseDTO();
		
		dto.setId(appoinments.getId());
		dto.setSubject(appoinments.getSubject());
		dto.setStartTime(appoinments.getStartTime());
		dto.setEndTime(appoinments.getEndTime());
		dto.setMsge("review saved");
		return dto;
		
	}
	public AppoinmentsDTO getAppoinmentsDTO(Appoinments a) {
		
		
		AppoinmentsDTO obj = new AppoinmentsDTO(a.getId(),a.getSubject(),a.getStartTime(),a.getEndTime());
				
		return obj;
		
	}

}
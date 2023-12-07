package com.cg.ip.dto;

import java.sql.Date;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AppoinmentsResponseDTO {

		private Long id;
	    private String subject;
	    private  LocalDateTime startTime;
	    private  LocalDateTime endTime;
	    private String msge;
		
		

	}



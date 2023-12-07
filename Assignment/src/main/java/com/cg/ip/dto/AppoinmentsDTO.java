package com.cg.ip.dto;

import java.sql.Date;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AppoinmentsDTO {
	
    private Long id;
    private String subject;
    private  LocalDateTime startTime;
    private  LocalDateTime endTime;
	
	

}

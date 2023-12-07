package com.cg.ip.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Data
@NoArgsConstructor
public class Appoinments {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String subject;
	    private LocalDateTime startTime;
	    private LocalDateTime endTime;
	    
	    
		public Appoinments(Long id, String subject, LocalDateTime startTime,  LocalDateTime endTime) {
			super();
			this.id = id;
			this.subject = subject;
			this.startTime = startTime;
			this.endTime = endTime;
		}

 
}
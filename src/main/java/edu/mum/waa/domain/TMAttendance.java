package edu.mum.waa.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TMAttendance {
	
	@Column(name = "StudentId")
	private Long studentId;
	
	@Column(name = "CheckingTime")
	private LocalDate checkingTime;
	
	@Column(name = "LocationId")
	private String locationId;
	
	@Column(name = "MeditationTypeId")
	private Long meditationTypeId;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public LocalDate getCheckingTime() {
		return checkingTime;
	}

	public void setCheckingTime(LocalDate checkingTime) {
		this.checkingTime = checkingTime;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public Long getMeditationTypeId() {
		return meditationTypeId;
	}

	public void setMeditationTypeId(Long meditationTypeId) {
		this.meditationTypeId = meditationTypeId;
	}	

}

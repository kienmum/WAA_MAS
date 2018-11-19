package edu.mum.waa.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TMAttendance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

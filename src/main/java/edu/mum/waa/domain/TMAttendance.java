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
	private String studentId;
	
	@Column(name = "CheckingTime")
	private LocalDate checkingTime;
	
	@Column(name = "LocationId")
	private String locationId;
	
	@Column(name = "MeditationTypeId")
	private String meditationTypeId;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
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

	public String getMeditationTypeId() {
		return meditationTypeId;
	}

	public void setMeditationTypeId(String meditationTypeId) {
		this.meditationTypeId = meditationTypeId;
	}	

}

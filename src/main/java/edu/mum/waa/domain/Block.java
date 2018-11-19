package edu.mum.waa.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Block {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "Month")
	private Integer month;
	
	@Column(name = "Year")
	private Integer year;
	
	@Column(name = "StartDate")
	private LocalDate stratDate;
	
	@Column(name = "EndDate")
	private LocalDate endDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		id = id;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public LocalDate getStratDate() {
		return stratDate;
	}

	public void setStratDate(LocalDate stratDate) {
		this.stratDate = stratDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}

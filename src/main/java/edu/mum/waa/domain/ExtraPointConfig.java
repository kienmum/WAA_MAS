package edu.mum.waa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExtraPointConfig {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "Percentage")
	private Double percentage; 
	
	@Column(name = "ExtraPoint")
	private Double extraPoint;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public Double getExtraPoint() {
		return extraPoint;
	}

	public void setExtraPoint(Double extraPoint) {
		this.extraPoint = extraPoint;
	}

}

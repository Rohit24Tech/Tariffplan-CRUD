package com.CRUDusingSpringBoot.dto;

import lombok.Data;

@Data
public class TariffplanDTO {
	private String planType;

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	} 
	
	

}

package com.devfun.settingweb_boot.dto;

public class StatisticRequestDto {
	private String organ;
	private String month;
	
	public StatisticRequestDto() {
		super();
	}
	
	public StatisticRequestDto(String organ, String month) {
		super();
		this.organ = organ;
		this.month = month;
	}
	
	public String getOrgan() {
		return organ;
	}
	
	public void setOrgan(String organ) {
		this.organ = organ;
	}
	
	public String getMonth() {
		return month;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
}

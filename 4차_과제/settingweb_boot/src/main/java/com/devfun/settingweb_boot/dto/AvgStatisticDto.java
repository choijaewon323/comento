package com.devfun.settingweb_boot.dto;

public class AvgStatisticDto {
	private Double avgCnt;
	
	public AvgStatisticDto() {
		super();
	}

	public AvgStatisticDto(Double avgCnt) {
		super();
		this.avgCnt = avgCnt;
	}

	public Double getAvgCnt() {
		return avgCnt;
	}

	public void setAvgCnt(Double avgCnt) {
		this.avgCnt = avgCnt;
	}
}

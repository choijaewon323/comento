package com.devfun.settingweb_boot.dao;

import java.util.List;

import com.devfun.settingweb_boot.dto.AvgStatisticDto;
import com.devfun.settingweb_boot.dto.StatisticDto;
import com.devfun.settingweb_boot.dto.StatisticRequestDto;

public interface StatisticMapper {
	public StatisticDto selectYearLogin(String year);
	public StatisticDto selectMonthUser(String month);
	public StatisticDto selectDayUser(String day);
	public AvgStatisticDto selectAvgUser();
	public StatisticDto selectLoginExceptHoliday(List<String> holiday);
	public StatisticDto selectLoginOrganMonth(StatisticRequestDto dto);
}

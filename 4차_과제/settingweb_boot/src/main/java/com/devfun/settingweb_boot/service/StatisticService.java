package com.devfun.settingweb_boot.service;

import java.util.HashMap;

public interface StatisticService {
	public HashMap<String, Object> yearloginNum(String year);
	public HashMap<String, Object> monthUserNum(String month);
	public HashMap<String, Object> dayUserNum(String day);
	public HashMap<String, Object> avgUserNum();
	public HashMap<String, Object> exceptHolidayNum() throws Exception;
	public HashMap<String, Object> organMonthNum(String organ, String month);
}

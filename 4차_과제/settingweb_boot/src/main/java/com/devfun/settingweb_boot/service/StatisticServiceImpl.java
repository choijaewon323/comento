package com.devfun.settingweb_boot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.dto.AvgStatisticDto;
import com.devfun.settingweb_boot.dto.StatisticDto;
import com.devfun.settingweb_boot.dto.StatisticRequestDto;

@Service
public class StatisticServiceImpl implements StatisticService {

	@Autowired
	private StatisticMapper uMapper;
	@Autowired
	private ResourceLoader resourceLoader;
	
	@Override
	public HashMap<String, Object> yearloginNum(String year) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try {
			StatisticDto dto = uMapper.selectYearLogin(year);
			retVal.put("totCnt", dto.getTotCnt());
			retVal.put("year", year);
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("year", year);
			retVal.put("is_success", false);
		}
		
		return retVal;
	}

	@Override
	public HashMap<String, Object> monthUserNum(String month) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try {
			StatisticDto dto = uMapper.selectMonthUser(month);
			retVal.put("totCnt", dto.getTotCnt());
			retVal.put("month", month);
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("month", month);
			retVal.put("is_success", false);
		}
		
		return retVal;
	}

	@Override
	public HashMap<String, Object> dayUserNum(String day) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try {
			StatisticDto dto = uMapper.selectDayUser(day);
			retVal.put("totCnt", dto.getTotCnt());
			retVal.put("day", day);
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("day", day);
			retVal.put("is_success", false);
		}
		
		return retVal;
	}

	@Override
	public HashMap<String, Object> avgUserNum() {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try {
			AvgStatisticDto dto = uMapper.selectAvgUser();
			retVal.put("totCnt", dto.getAvgCnt());
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("is_success", false);
		}
		
		return retVal;
	}

	@Override
	public HashMap<String, Object> exceptHolidayNum() throws Exception {
		Resource resource = resourceLoader.getResource("classpath:static/holiday.txt"); 
		Scanner scanner = new Scanner(resource.getFile());
		
		List<String> holiday = new ArrayList<String>();
		
		while (scanner.hasNext()) {
			String temp = scanner.next();
			holiday.add(temp);
		}
		
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		
		try {
			StatisticDto dto = uMapper.selectLoginExceptHoliday(holiday);
			retVal.put("totCnt", dto.getTotCnt());
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("is_success", false);
		}
		
		scanner.close();
		return retVal;
	}

	@Override
	public HashMap<String, Object> organMonthNum(String organ, String month) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();
		
		try {
			StatisticDto dto = uMapper.selectLoginOrganMonth(new StatisticRequestDto(organ, month));
			retVal.put("totCnt", dto.getTotCnt());
			retVal.put("organ", organ);
			retVal.put("month", month);
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("organ", organ);
			retVal.put("month", month);
			retVal.put("is_success", false);
		}
		
		return retVal;
	}
	
	
}

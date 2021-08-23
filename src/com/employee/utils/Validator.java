package com.employee.utils;


import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	private static final String VALID_PHONE_REGEX ="^\\d{10,}$";
	private static final String VALID_EMAIL_REGEX="^(.+)@(.+)$";
	private static final String VALID_NAME_REGEX="^[a-zA-Z\\s]+";
	private static final String VALID_BIRTHDAY_REGEX="^\\d{4}-\\d{2}-\\d{2}$";
	private static Set<Integer> listEmployee =new HashSet<>(); 
	
	
	public static boolean isPhone(String phone) {
		Pattern pattern = Pattern.compile(VALID_PHONE_REGEX);
		Matcher matcher = pattern.matcher(phone); 
		return matcher.matches();
	}
	public static boolean isEmail(String email) {
		Pattern pattern = Pattern.compile(VALID_EMAIL_REGEX);
		Matcher matcher = pattern.matcher(email); 
		return matcher.matches();
	}
	public static boolean isName(String name) {
		Pattern pattern = Pattern.compile(VALID_NAME_REGEX);
		Matcher matcher = pattern.matcher(name); 
		return matcher.matches();
	}
	public static boolean isBirthDay(String birthday) {
		Pattern pattern = Pattern.compile(VALID_BIRTHDAY_REGEX);
		Matcher matcher = pattern.matcher(birthday); 
		return matcher.matches();
	}
	
	public static boolean isExist(Integer id) {
		if(!listEmployee.contains(id)) {
			listEmployee.add(id);
			return true;
		}else {
			return false;
		}
	}
}

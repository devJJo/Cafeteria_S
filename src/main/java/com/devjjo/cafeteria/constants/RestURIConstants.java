package com.devjjo.cafeteria.constants;

public class RestURIConstants {

	/* Test REST API 
	public static final String GET_USER = "/rest/user/{id}/{id2}";
	public static final String GET_ALL_USER = "/rest/users";
	public static final String CREATE_USER = "/rest/user/insert";
	public static final String DELETE_USER = "/rest/user/delete/{id}";
	public static final String UPDATE_USER = "/rest/user/update";
	*/
	
	public static final String GET_USER 			= "/user/{user_id}";
	public static final String POST_USER 			= "/user/insert";			
	public static final String DELETE_USER 			= "/user/delete/{user_id}";
	
	public static final String GET_ALL_CAFE 		= "/allcafes/{today}";		
	public static final String GET_CAFE_MENU 		= "/cafemenu/{cafe_id}/{st_date}/{end_date}";
	
	public static final String GET_ALL_COMMENT		= "/allcomments/{cafe_id}";
	public static final String POST_COMMENT 		= "/comment/insert";
	public static final String PUT_COMMENT 			= "/comment/update/{cafe_id}/{user_id}/{seq}/{score}/{comment}"; //수정예정...
	public static final String DELETE_COMMENT 		= "/comment/delete/{cafe_id}/{user_id}/{seq}";
	public static final String GET_USER_COMMENT 	= "/user/comment/{user_id}";

	
	public static final String GET_ALL_FAVORITE 	= "/allfavorites/{user_id}";
	public static final String DELETE_FAVORITE 		= "/favorite/delete/{cafe_id}/{user_id}";
	public static final String POST_FAVORITE		= "/favorite/insert";
	
	public static final String GET_ALL_NOTICE 		= "/allnotices";
	
	
	//public static final String PUT_USER_COMMENT 	= "/cafe/user/comment/update/{cafe_id}/{user_id}/{score}/{comment}";
	//public static final String DELETE_USER_COMMENT 	= "/cafe/user/comment/delete/{cafe_id}/{user_id}";
	

	
}

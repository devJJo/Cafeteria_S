package com.devjjo.cafeteria.constants;

public class RestURIConstants {

	/* Test REST API 
	public static final String GET_USER = "/rest/user/{id}/{id2}";
	public static final String GET_ALL_USER = "/rest/users";
	public static final String CREATE_USER = "/rest/user/insert";
	public static final String DELETE_USER = "/rest/user/delete/{id}";
	public static final String UPDATE_USER = "/rest/user/update";
	*/
	
	public static final String POST_USER 			= "/cafe/user/insert";			
	public static final String GET_USER 			= "/cafe/user/{user_id}";
	public static final String DELETE_USER 			= "/cafe/user/delete/{user_id}";
	public static final String GET_ALL_CAFE 		= "/cafe/allcafes/{today}";		
	public static final String GET_CAFE_MENU 		= "/cafe/cafemenu/{cafe_id}/{st_date}/{end_date}";
	public static final String POST_COMMENT 		= "/cafe/comment/insert";
	public static final String GET_ALL_COMMENT		= "/cafe/allcomments/{cafe_id}";
	public static final String PUT_COMMENT 			= "/cafe/comment/update/{cafe_id}/{user_id}/{seq}/{score}/{comment}";
	public static final String DELETE_COMMENT 		= "/cafe/comment/delete/{cafe_id}/{user_id}/{seq}";
	public static final String GET_USER_COMMENT 	= "/cafe/user/comment/{user_id}";

	
	public static final String GET_ALL_FAVORITE 	= "/cafe/allfavorites/{user_id}";
	public static final String DELETE_FAVORITE 		= "/cafe/favorite/delete/{cafe_id}/{user_id}";
	public static final String POST_FAVORITE		= "/cafe/favorite/insert";
	
	public static final String GET_ALL_NOTICE 		= "/cafe/allnotices";
	
	
	//public static final String PUT_USER_COMMENT 	= "/cafe/user/comment/update/{cafe_id}/{user_id}/{score}/{comment}";
	//public static final String DELETE_USER_COMMENT 	= "/cafe/user/comment/delete/{cafe_id}/{user_id}";
	

	
}

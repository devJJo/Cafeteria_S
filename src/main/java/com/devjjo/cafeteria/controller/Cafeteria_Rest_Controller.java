package com.devjjo.cafeteria.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.devjjo.cafeteria.constants.RestURIConstants;
import com.devjjo.cafeteria.model.Cafe;
import com.devjjo.cafeteria.model.Cafe_Comment;
import com.devjjo.cafeteria.model.Favorite;
import com.devjjo.cafeteria.model.Menu;
import com.devjjo.cafeteria.model.Notice;
import com.devjjo.cafeteria.model.User;
import com.devjjo.cafeteria.service.Cafeteria_Rest_Service;

/**
 * Handles requests for the Employee service.
 */
@Controller
public class Cafeteria_Rest_Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(Cafeteria_Rest_Controller.class);
	
	@Autowired
	private Cafeteria_Rest_Service cafeteria_rest_service;

	/**
	 * 메인 페이지 연결 
	 */
	@RequestMapping(value = "/getCafeList.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! the client locale is "+ locale.toString());
		//Date date = new Date();
		//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		//String formattedDate = dateFormat.format(date);
		
		//model.addAttribute("serverTime", formattedDate );
		
		List<Cafe> cafeList = cafeteria_rest_service.getCafeList();
		System.out.println(cafeList.toString());
		model.addAttribute("cafeList", cafeList);
		
		return "cafelist";
	}
	

	@RequestMapping(value="/getCafemenu.do" , method=RequestMethod.GET)
	public String getCafemenu(Model model, @RequestParam(name="cafeid") String cafeid, @RequestParam(name="buildname") String buildname, @RequestParam(name="buildhome") String buildhome) {
		
		System.out.println(cafeid);
		System.out.println(buildname);
		System.out.println(buildhome);
		
		//UserVO user = userService.getUser(id);
		//모델에 담으면 자동으로 넘어간다!! 리턴은 페이지!!
		//model.addAttribute("userList", userList);
		model.addAttribute("cafeid", cafeid);
		model.addAttribute("buildname", buildname);
		model.addAttribute("buildhome", buildhome);
		
		return "cafemenu";
	}
	
	/**
	 * 테스트 URI
	 * 등록된 모든 유저정보 가져옴
	 */
	
//	@RequestMapping(value = RestURIConstants.GET_ALL_USER, method = RequestMethod.GET)
//	public @ResponseBody List<User> get_all_user() {
//		logger.info("##### Get All User");
//		
//		List<User> users = cafeteria_rest_service.selectUser();
//		return users;
//	}
	
	/**
	 * 테스트 URI
	 * 특정 유저정보 가져옴
	 */
//	@RequestMapping(value = RestURIConstants.GET_USER, method = RequestMethod.GET)
//	public @ResponseBody User get_user(@PathVariable("id") String userId) {
//		logger.info("##### Get User");
//		Map<String, Object> param = new HashMap<String, Object>();
//		User user = new User();
//		param.put("P_USER_ID", userId);
//		user = cafeteria_rest_service.selectUserOne(param);
//		
//		return user;
//	}
	

	
	/**
	 * 테스트 URI
	 * 특정 유저정보 변경
	 */
//	@RequestMapping(value = RestURIConstants.UPDATE_USER, method = RequestMethod.POST)
//	public @ResponseBody int update_user(@RequestBody User user) {
//		logger.info("##### Update User");
//
//		int resultCount = cafeteria_rest_service.updateUser(user);
//		return resultCount;
//	}

	
	/**
	 * 
	 * 유저정보 등록
	 */
	@RequestMapping(value = RestURIConstants.POST_USER, method = RequestMethod.POST)
	public @ResponseBody int insertUser(@RequestBody User user) {
		logger.info("##### Create User");
		int resultCount = cafeteria_rest_service.insertUser(user);
		return resultCount;
	}
	
	/**
	 * 
	 * 유저정보 조회
	 */
	@RequestMapping(value = RestURIConstants.GET_USER, method = RequestMethod.GET)
	public @ResponseBody User selectUserOne(@PathVariable("user_id") String userId) {
		logger.info("##### Get User");
		logger.info(userId);
		Map<String, Object> param = new HashMap<String, Object>();
		User user = new User();
		param.put("P_USER_ID", userId);
		user = cafeteria_rest_service.selectUserOne(param);
		return user;
	}

	
	
	/**
	 * 
	 * 유저정보 삭제
	 */
	@RequestMapping(value = RestURIConstants.DELETE_USER, method = RequestMethod.DELETE)
	public @ResponseBody int deleteUser(@PathVariable("user_id") String userId) {
		logger.info("##### Delete User");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("P_USER_ID", userId);
		int resultCount = cafeteria_rest_service.deleteUser(param);
		return resultCount;
	}
	
	
	/**
	 * 
	 * 등록된 모든 카페정보 + 당일 점심/저녁
	 */
	@RequestMapping(value = RestURIConstants.GET_ALL_CAFE, method = RequestMethod.GET)
	public @ResponseBody List<Cafe> get_all_cafe(@PathVariable("today") String today) {
		logger.info("##### Get All Cafe");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("P_TODAY", today);
		List<Cafe> cafes = cafeteria_rest_service.selectcafes(param);

		return cafes;
	}
	
	
	/**
	 * 
	 * 기간내 특정 카페 메뉴 조회
	 */
	@RequestMapping(value = RestURIConstants.GET_CAFE_MENU, method = RequestMethod.GET)
	public @ResponseBody List<Menu> select_date_menu(@PathVariable("cafe_id") String cafe_id, @PathVariable("st_date") String st_date
											 , @PathVariable("end_date") String end_date ) {
		
		logger.info("##### Get Date Menu");
		Map<String, Object> param = new HashMap<String, Object>();
		
		param.put("P_CAFE_ID", cafe_id);
		param.put("P_ST_DATE", st_date);
		param.put("P_END_DATE", end_date);
		List<Menu> menu  = cafeteria_rest_service.select_date_menu(param);
		return menu;
	}
			
	/**
	 * 
	 * 코멘트 등록
	 */
	@RequestMapping(value = RestURIConstants.POST_COMMENT, method = RequestMethod.POST)
	public @ResponseBody int insertComment(@RequestBody Cafe_Comment comment) {
		logger.info("##### Create Comment");
		int resultCount = cafeteria_rest_service.insertComment(comment);
		return resultCount;
	}

	/**
	 * 
	 * 카페 상세화면에서의 코멘트 조회
	 */
	@RequestMapping(value = RestURIConstants.GET_ALL_COMMENT, method = RequestMethod.GET)
	public @ResponseBody List<Cafe_Comment> selectComment(@PathVariable("cafe_id") String cafe_id) {
		logger.info("##### Get Cafe Comment");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("P_CAFE_ID", cafe_id);
		List<Cafe_Comment> comments  = cafeteria_rest_service.selectComment(param);
		return comments;
	}	
	
	/**
	 * 
	 * 카페 코멘트 수정
	 */
	@RequestMapping(value = RestURIConstants.PUT_COMMENT, method = RequestMethod.PUT)
	public @ResponseBody int updateComment(@PathVariable("cafe_id") String cafe_id, @PathVariable("user_id") String user_id
			 							, @PathVariable("score") String score, @PathVariable("comment") String comment 
			 							, @PathVariable("seq") String seq) {
		logger.info("##### Update Comment");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("P_CAFE_ID", cafe_id);
		param.put("P_USER_ID", user_id);
		param.put("P_SCORE", score);
		param.put("P_COMMENT", comment);
		param.put("P_SEQ", seq);
		
		System.out.println(cafe_id);
		System.out.println(user_id);
		System.out.println(score);
		System.out.println(comment);
		System.out.println(seq);

		int resultCount = cafeteria_rest_service.updateComment(param);
		return resultCount;
	}

	/**
	 * 
	 * 등록된 유저의 코멘트 삭제
	 */
	@RequestMapping(value = RestURIConstants.DELETE_COMMENT, method = RequestMethod.DELETE)
	public @ResponseBody int deleteComment(@PathVariable("cafe_id") String cafe_id, @PathVariable("user_id") String userId
										, @PathVariable("seq") String seq) {
		logger.info("##### Delete Comment");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("P_CAFE_ID", cafe_id);
		param.put("P_USER_ID", userId);
		param.put("P_SEQ", seq);
		int resultCount = cafeteria_rest_service.deleteComment(param);
		return resultCount;
	}
	
	/**
	 * 
	 * 등록된 유저의 모든 코멘트 호출
	 */
	@RequestMapping(value = RestURIConstants.GET_USER_COMMENT, method = RequestMethod.GET)
	public @ResponseBody List<Cafe_Comment> selectAllComment(@PathVariable("user_id") String user_id) {
		logger.info("##### Get All Comment");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("P_USER_ID", user_id);
		
		List<Cafe_Comment> cafes = cafeteria_rest_service.selectAllComment(param);

		return cafes;
	}
	
	/**
	 * 
	 * 등록된 모든 즐겨찾기 정보
	 */
	@RequestMapping(value = RestURIConstants.GET_ALL_FAVORITE, method = RequestMethod.GET)
	public @ResponseBody List<Favorite> selectAllFavorite(@PathVariable("user_id") String user_id) {
		logger.info("##### Get All Favorite");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("P_USER_ID", user_id);
		List<Favorite> favorites = cafeteria_rest_service.selectAllFavorite(param);

		return favorites;
	}

	/**
	 * 
	 * 등록된 유저의 즐겨찾기 삭제
	 */
	@RequestMapping(value = RestURIConstants.DELETE_FAVORITE, method = RequestMethod.DELETE)
	public @ResponseBody int deleteFavorite(@PathVariable("cafe_id") String cafe_id, @PathVariable("user_id") String userId) {
		logger.info("##### Delete Favorite");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("P_CAFE_ID", cafe_id);
		param.put("P_USER_ID", userId);
		int resultCount = cafeteria_rest_service.deleteFavorite(param);
		return resultCount;
	}

	/**
	 * 
	 * 등록된 유저의 즐겨찾기 등록
	 */
	@RequestMapping(value = RestURIConstants.POST_FAVORITE, method = RequestMethod.POST)
	public @ResponseBody int insertFavorite(@RequestBody Favorite favorite) {
		logger.info("##### Create Favorite");
		int resultCount = cafeteria_rest_service.insertFavorite(favorite);
		return resultCount;
	}	
	
	/**
	 * 
	 * 등록된 모든 즐겨찾기 정보
	 */
	@RequestMapping(value = RestURIConstants.GET_ALL_NOTICE, method = RequestMethod.GET)
	public @ResponseBody List<Notice> selectAllNotice() {
		logger.info("##### Get All Notice");

		return cafeteria_rest_service.selectAllNotice();
	}
	
}


















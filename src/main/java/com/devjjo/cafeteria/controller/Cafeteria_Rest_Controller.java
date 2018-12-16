package com.devjjo.cafeteria.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
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

	/**
	 * 카페메뉴 조회
	 */
	@RequestMapping(value="/getCafemenu.do" , method=RequestMethod.GET)
	public String getCafemenu(Model model
			, @RequestParam(name="cafeid") String cafeid
			, @RequestParam(name="menudate") String menudate) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		
		
		//cal.add(Calendar.DATE, 1);
		DateFormat df = new SimpleDateFormat("yyyyMMdd");

		if("".equals(menudate)) {
			menudate = df.format(cal.getTime());
		}

		//테스트 저장
		//menudate = "20181023";
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("P_CAFE_ID", cafeid);
		param.put("P_MENU_DATE", menudate);
		param.put("P_MENU_DIV", "L");
		Menu menuL = cafeteria_rest_service.getMenu(param);

		param.put("P_MENU_DIV", "D");
		Menu menuD = cafeteria_rest_service.getMenu(param);
		
		Cafe cafe = cafeteria_rest_service.getCafeInfo(param);

		model.addAttribute("menuListL", menuL);
		model.addAttribute("menuListD", menuD);
		model.addAttribute("menudate", menudate);
		model.addAttribute("cafeid", cafeid);
		model.addAttribute("cafe", cafe);
		
		return "cafemenu";
	}
	

	/**
	 * 메뉴등록 
	 * @return 
	 */
	
	@RequestMapping(value="/insertMenu.do",  method = RequestMethod.POST)
	public @ResponseBody int insertMenu(@RequestBody Map<String,Object> list) {

			Map<String, Object> param = new HashMap<String, Object>();
			int resultCount = 0;
			
			Menu menu_L = new Menu();
			menu_L.setCafe_Id(list.get("CAFEID").toString());
			menu_L.setMenu_Date(list.get("MENUDATE").toString());
			menu_L.setRice(list.get("LRICE").toString());
			menu_L.setSoup(list.get("LSOUP").toString());
			menu_L.setSide_Dish1(list.get("LSIDE1").toString());
			menu_L.setSide_Dish2(list.get("LSIDE2").toString());
			menu_L.setSide_Dish3(list.get("LSIDE3").toString());
			menu_L.setSide_Dish4(list.get("LSIDE4").toString());
			menu_L.setSide_Dish5(list.get("LSIDE5").toString());
			menu_L.setSide_Dish6(list.get("LSIDE6").toString());
			menu_L.setSide_Dish7(list.get("LSIDE7").toString());
			menu_L.setSide_Dish8(list.get("LSIDE8").toString());
			menu_L.setDessert1(list.get("LDESSERT1").toString());
			menu_L.setDessert2(list.get("LDESSERT2").toString());
			menu_L.setMenu_Div("L");

			int countexist = cafeteria_rest_service.getExist(menu_L);

			if(countexist != 0) {
				resultCount = cafeteria_rest_service.updateMenu(menu_L);
			}else {
				resultCount = cafeteria_rest_service.insertMenu(menu_L);
			}
	
			Menu menu_D = new Menu();
			menu_D.setCafe_Id(list.get("CAFEID").toString());
			menu_D.setMenu_Date(list.get("MENUDATE").toString());
			menu_D.setRice(list.get("DRICE").toString());
			menu_D.setSoup(list.get("DSOUP").toString());
			menu_D.setSide_Dish1(list.get("DSIDE1").toString());
			menu_D.setSide_Dish2(list.get("DSIDE2").toString());
			menu_D.setSide_Dish3(list.get("DSIDE3").toString());
			menu_D.setSide_Dish4(list.get("DSIDE4").toString());
			menu_D.setSide_Dish5(list.get("DSIDE5").toString());
			menu_D.setSide_Dish6(list.get("DSIDE6").toString());
			menu_D.setSide_Dish7(list.get("DSIDE7").toString());
			menu_D.setSide_Dish8(list.get("DSIDE8").toString());
			menu_D.setDessert1(list.get("DDESSERT1").toString());
			menu_D.setDessert2(list.get("DDESSERT2").toString());
			menu_D.setMenu_Div("D");

			countexist = cafeteria_rest_service.getExist(menu_D);
			
			if(countexist != 0) {
				resultCount = resultCount + cafeteria_rest_service.updateMenu(menu_D);
			}else {
				resultCount = resultCount + cafeteria_rest_service.insertMenu(menu_D);
			}
			
		return resultCount;
	}
	

	/**
	 * 
	 * 유저정보 등록
	 */
	@RequestMapping(value = RestURIConstants.POST_USER, method = RequestMethod.POST)
	public @ResponseBody int insertUser(@RequestBody User user) {
		logger.info("##### Create User");
		int resultCount = 0;
		String userId = "";
		userId = user.getUser_Id(); 
		
		Map<String, Object> param = new HashMap<String, Object>();
		User searchuser = new User();
		param.put("P_USER_ID", userId);
		searchuser = cafeteria_rest_service.selectUserOne(param);
		
		if(ObjectUtils.isEmpty(searchuser)) {
			resultCount = cafeteria_rest_service.insertUser(user);
		}else {
			resultCount = 0;
		}
	
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
		resultCount = cafeteria_rest_service.deleteALLFavorite(param);
		resultCount = cafeteria_rest_service.deleteALLComment(param);
		
		
		return resultCount;
	}
	
	
	/**
	 * 
	 * 등록된 모든 카페정보 + 당일 점심/저녁
	 */
	@RequestMapping(value = RestURIConstants.GET_ALL_CAFE, method = RequestMethod.GET)
	public @ResponseBody List<Cafe> get_all_cafe(@PathVariable("today") String today
												, @PathVariable("sorttype") String sorttype
												, @PathVariable("lat") String lat
												, @PathVariable("lon") String lon
												, @PathVariable("count") String count) {
		logger.info("##### Get All Cafe");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("P_TODAY", today);
		param.put("P_SORT_TYPE", sorttype);
		param.put("P_LAT", lat);
		param.put("P_LON", lon);
		param.put("P_COUNT", count);
		
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


















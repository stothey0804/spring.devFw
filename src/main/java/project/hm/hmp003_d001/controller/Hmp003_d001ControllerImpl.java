package project.hm.hmp003_d001.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import project.hm.hmp003_d001.service.Hmp003_d001Service;
import project.hm.hmp003_d001.vo.Hmp003_d001VO;

@Controller
public class Hmp003_d001ControllerImpl implements Hmp003_d001Controller{
	private static final Logger logger = LoggerFactory.getLogger(Hmp003_d001ControllerImpl.class);
	@Autowired
	Hmp003_d001Service hmp003_d001Service;
	@Autowired
	Hmp003_d001VO hmp003_d001VO;
	
	// 조회 초기화면
	@RequestMapping(value = "/hm/hmp003_d001/searchInit.do", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView searchInit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("hm/hmp003_d001_init");	// 초기 접속시 init.jsp로 연결
		return mav;
	}
	
	// 조회 결과화면
	@RequestMapping(value = "hm/hmp003_d001/searchList.do", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView searchList(@RequestParam(value="p_prod_id", required=false) String p_prod_id, HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("p_prod_id", "%"+p_prod_id+"%");	 // like 조회를 위해 입력받은 param에 %를 추가하여 put
		List<Hmp003_d001VO> list = hmp003_d001Service.searchList(searchMap);	// service에서 search 메서드 수행
		ModelAndView mav = new ModelAndView("hm/hmp003_d001_search");	// 결과를 search.jsp로 전달
		mav.addObject("searchList", list);
		return mav;
	}
}

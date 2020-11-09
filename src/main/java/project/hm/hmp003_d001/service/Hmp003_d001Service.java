package project.hm.hmp003_d001.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import project.hm.hmp001_d001.vo.Hmp001_d001VO;
import project.hm.hmp003_d001.vo.Hmp003_d001VO;

public interface Hmp003_d001Service {
	 public List<Hmp003_d001VO> searchList(Map<String, Object> searchMap) throws DataAccessException;
}

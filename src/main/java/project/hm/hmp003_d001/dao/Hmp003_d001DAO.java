package project.hm.hmp003_d001.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import project.hm.hmp001_d001.vo.Hmp001_d001VO;
import project.hm.hmp003_d001.vo.Hmp003_d001VO;

public interface Hmp003_d001DAO {
	 public List<Hmp003_d001VO> searchList(Map<String, Object> searchMap) throws DataAccessException;
	 
}

package project.hm.hmp003_d001.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import project.hm.hmp001_d001.vo.Hmp001_d001VO;
import project.hm.hmp003_d001.vo.Hmp003_d001VO;

@Repository("hmp003_d001DAO")
public class Hmp003_d001DAOImpl implements Hmp003_d001DAO {
	@Autowired
	private SqlSession sqlSession;

	public List<Hmp003_d001VO> searchList(Map<String, Object> searchMap) throws DataAccessException {
		// 마이바티스에 설정된 serachList 쿼리에 연결한 후 결과값을 저장
		List<Hmp003_d001VO> list = sqlSession.selectList("hm.hmp003_d001.searchList", searchMap);
		return list;
	}
}

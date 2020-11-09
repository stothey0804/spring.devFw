<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>    
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>물품 검색창</title>
</head>
<body>
    <form name="frm" method="post" action="${contextPath}/hm/hmp003_d001/searchList.do">
        <!-- p_pro_id 를 RequestParam으로 전달 -->   
	   id:<input type="text" name="p_prod_id"><br>
	   <input type ="submit" value="조회하기"><br>
   </form>
</body>
</html>
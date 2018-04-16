<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
   String path = request.getContextPath();
   String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<base href="<%=basePath%>">
<title>hello world</title>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.bundle.js"></script>
<script type="text/javascript" src="js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<link type="text/css" rel="stylesheet" href="css/bootstrap-grid.css">
<link type="text/css" rel="stylesheet" href="css/bootstrap-grid.min.css">
<link type="text/css" rel="stylesheet" href="css/bootstrap-reboot.css">
<link type="text/css" rel="stylesheet" href="css/bootstrap-reboot.min.css">
<link type="text/css" rel="stylesheet" href="css/bootstrap.css">
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>

</body>
<script>
	$(document).ready(function(){
		$("#a").click(function(){
			alert("123");
		});
	});
	
</script>
</html>

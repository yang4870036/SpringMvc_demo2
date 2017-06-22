<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
    <a href="hello/helloSpring">helloworld</a>
    
    <form action="SpringMVC/testMethod" method="GET">
    <button >hello</button>
    </form>
    
    <form action="SpringMVC/testMethod2?name=zhu&age=10" method="POST">
    <button >hello</button>
    </form>
    
    <a href="SpringMVC/helloAnt/2/a">helloAnt</a>
    
    <form action="SpringMVC/testMethod3/20/dcdcdc" method="post">
  		<input type="hidden" value="PUT" name="_method"> 
  		<input type="submit" value="Put"/>
    </form>
    
     <a href="SpringMVC/testMethod4?id=20">helloparam</a>
     
      <form action="SpringMVC/testMethod4" method="post">
  		<input name=id> </iput>
  		<input type="submit" value="Put"/>
    </form>
    
    <form action="SpringMVC/testMethodPojo" method="post">
  		username:<input name=username values=""> </iput><br>
  		password:<input name=password values=""> </iput><br>
  		   email:<input name=email values=""> </iput><br>
  		     age:<input name=age values=""> </iput><br>
  		    line:<input name=address.line values=""> </iput><br>
  		    city:<input name=address.city values=""> </iput><br>
  		province:<input name=address.province values=""> </iput><br>
  		
  		<input type="submit" value="submit"/>
    </form>
    
    <a href="SpringMVC/testMethodMap">testMethodMap</a>
  </body>
</html>

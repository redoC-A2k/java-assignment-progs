<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Auto refresh page</title>
</head>
<body>
<form>
                    <h2>Auto Refresh Example</h2>
                    <%
                       // Set refresh, autoload time as 1 seconds
                       response.setIntHeader("Refresh", 1);
                       // Get current time
                       
                    %>
                </fieldset>
</form>
</body>
</html>
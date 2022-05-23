
        <%
        	session.setAttribute("name","user");
        %>
<html>
    <head>
        <title>Session Tracking</title>
    </head>
    <body>
        <center>
            <h1>Session Tracking Example</h1>
        </center>

        <form>
        	Your name = <input type="text" name="myname">
        	<input type="submit">
        </form>
        <%
        if(request.getParameter("myname")!=null)
        	session.setAttribute("name",request.getParameter("myname").toString());
        %>
        <h2> hello <%= session.getAttribute("name").toString() %> </h2>
    </body>
</html>
    <%@ page errorPage="error.jsp" %>  
    <html>
<%    
    String num1=request.getParameter("n1");  
    String num2=request.getParameter("n2");  
    if (num1 != null && num2 != null){
    	int a=Integer.parseInt(num1);  
        int b=Integer.parseInt(num2); 
        int c=a/b;  
        out.print("division of numbers is: "+c);  
    }
    %> 
<body>
<form>  
No1:<input type="text" name="n1" /><br/><br/>  
No2:<input type="text" name="n2" /><br/><br/>  
<input type="submit" value="divide"/>  
</form>
</body>    
    </html>
     
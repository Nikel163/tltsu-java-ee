<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%!
    String getFormattedDate() {
        SimpleDateFormat sf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        return sf.format(new Date());
    }
%>
<html>
<head>
    <title>Welcome page</title>
</head>
<body>
    <p>Today is <%= getFormattedDate()%></p>
    <p>Connection status: ${status}</p>
</body>
</html>

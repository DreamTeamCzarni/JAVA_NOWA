<%--
  Created by IntelliJ IDEA.
  User: Pawel
  Date: 2015-06-04
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Moja apteczka</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="./style.css" type="text/css">
</head>
<body bgcolor="F3F3F3"></body>

<br><center><H2> Moja apteczka </H2></center><br><br>
<jsp:forward page="/kontroler?action=print" />

<center><form>
  <input type="submit" value="Wyświetl zawartość apteczki" style="width: 300px"/><br></center>
</form>

<br><br>
<center><img id="JAVA" src="apteczka.jpg" height="150px" width="150px" align ="center"></center>
<body>
<hr />
<H5 align="right">Designed by DreamTeam Czarni</H5>
</body>
</html>

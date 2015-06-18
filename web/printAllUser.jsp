<%--
  Created by IntelliJ IDEA.
  User: Pawel
  Date: 2015-06-18
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <title>Wyświetlanie leku</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="./style.css" type="text/css">
</head>
<body bgcolor="F3F3F3"></body>

<br><H1><center>Aktualny stan apteczki</center></H1><br><br>
<center><table border="5">
  <thred>
    <tr>
      <th>ID leku</th>
      <th>Nazwa handlowa</th>
      <th>Nazwa międzynarodowa</th>
      <th>Substancja czynna</th>
      <th>Wskazania</th>
      <th>Rodzaj leku</th>
      <th>Przeciwwskazania</th>
      <th>Usuwanie</th>
    </tr>
  </thred>

  <tbody>
  <c:forEach items="${drugs}" var="Apteczka" >
    <tr>
      <td><c:out value="${Apteczka.id_leku}"/><br></td>
      <td><c:out value="${Apteczka.nazwa_handlowa_leku}"/><br></td>
      <td><c:out value="${Apteczka.nazwa_miedzynarodowa}"/><br></td>
      <td><c:out value="${Apteczka.nazwa_substancji_czynnej}"/><br></td>
      <td><c:out value="${Apteczka.wskazania}"/><br></td>
      <td><c:out value="${Apteczka.rodzaj}"/><br></td>
      <td><c:out value="${Apteczka.przeciwwskazania}"/></td>
      <td><a href="kontroler?action=delete&nazwa_handlowa_leku=<c:out value="${Apteczka.nazwa_handlowa_leku}"/> ">Usuń</a> </td>
    </tr>
  </c:forEach>
  </tbody>

</table></center><br><br>


<form action="addDrug.jsp" method="GET"/>
  <center><input type="submit" value="Dodaj lek" class="pill button" style="width: 230px" /></center><br>
    </form>



        <body>
        <hr />

        <H5 align="right">Designed by DreamTeam Czarni</H5>

        </body>
</html>
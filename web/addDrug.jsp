<%--
  Created by IntelliJ IDEA.
  User: Pawel
  Date: 2015-06-18
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
  <title>Dodawanie leku</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="./style.css" type="text/css">
 </head>
<body bgcolor="F3F3F3"></body>

<br><br>


<br><center><H1> Dodajesz lek: </H1></center>
 <center><H3> wpisz poniższe informacje </H3></center><br>

<center><form method="post" action="/kontroler" name="frmAddDrug">

<T3>Nazwa handlowa:</T3> <input type = "text" style="width: 280px" name="nazwa_handlowa_leku" /><br><br>
<T3>Nazwa międzynarodowa:</T3>  <input type = "text" style="width: 280px" name="nazwa_miedzynarodowa"><br /><br>
<T3>Substancja czynna:</T3>  <input type = "text" style="width: 280px" name="nazwa_substancji_czynnej"><br /><br>
<T3>Rodzaj leku:</T3> <input type = "text" style="width: 280px;" name="rodzaj"><br /><br>
<T3>Wskazania:</T3>  <br> <textarea type = "text" rows="5" cols ="60" name="wskazania"></textarea><br /><br>
<T3>Przeciwwskazania:</T3><br> <textarea type = "text" rows="5" cols ="60" name="przeciwwskazania"></textarea><br /><br>

<center><T3>... w celu zapisania kliknij poniżej:</T3></center><br>
<input type="submit" value="Zapisz" style="height: 60px; width: 230px"/><br>
</form></center>

<center><form>
<input type="submit" value="Powrót" style="width: 230px"/>
</form></center>

<body>
<hr />
<H5 align="right">Designed by DreamTeam Czarni</H5>
</body>
</html>
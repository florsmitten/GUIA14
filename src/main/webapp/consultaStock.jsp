<%--
  Created by IntelliJ IDEA.
  User: lucia
  Date: 10/14/2020
  Time: 11:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Consulta Stock</title>
</head>
<body>
<form action="consultaStockSRV" method="post">
    <table>
        <tr>
            <td>Código de la materia prima:</td>
            <td>
                <input type="text" name="codMatPrima" />
            </td>
        </tr>
    </table>
    <input type="submit" value="Consultar"/>
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: lucia
  Date: 10/19/2020
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Creación de formulario</title>
    <script>
    </script>
</head>
<body>
<form action="crearFormularioSRV" onsubmit="validar()" method="post">
    <table>
        <tr>
            <td>ID Pedido:</td>
            <td>
                <input type="text" id="idPed" name="idPed" />
            </td>
        </tr>
        <tr>
            <td>Materia prima:</td>
            <td>
                <input type="text" name="codMatPrima" />
            </td>
        </tr>
        <tr>
            <td>Cantidad Requerida:</td>
            <td>
                <input type="text" name="cantReq" />
            </td>
        </tr>
        <tr>
            <td>Depositos:</td>
            <td>
                <input type="text" name="depositos" />
            </td>
        </tr>
        <tr>
            <td>Depositos:</td>
            <td>
                <select name="depositos" size="3">
                    <option value="deposito1">deposito1</option>
                    <option value="deposito2">deposito2</option>
                    <option value="deposito3">deposito3</option>
                </select>
            </td>
        </tr>
    </table>
    <input type="submit" name="btnCrear" value="crear"/>
    <input type="reset" value="Limpiar" />
</form>
</body>
</html>

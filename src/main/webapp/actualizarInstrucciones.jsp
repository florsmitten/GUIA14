<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: Flor
  Date: 18/10/2020
  Time: 02:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Actualizar Instrucciones</title>
</head>
<script>
    function setearDniDonadores()
    {
        var index=document.getElementById("dniDonadores").selectedIndex;
        document.getElementById("dniDonador").value=document.getElementById("dniDonadores").options[index].text;
    }

    function habilitar()
    {
        document.getElementById("txtIdPeso").disabled=false;
        document.getElementById("txtIdCantidadExtraida").disabled=false;
        document.getElementById("txtIdPresion").disabled=false;
        document.getElementById("txtIdFechaDonacion").disabled=false;
        document.getElementById("txtIdrecuentoGlobulosRojos").disabled=false;
        document.getElementById("btnIdConfirmaModificar").disabled=false;
    }

    function limpiar() {
        return confirm("¿Limpiar los datos?");
    }

</script>

<body >
<%@page import="Controlador.*" %>
<%@ page import="java.util.ArrayList" %>
<h3>Modificación de Instrucciones</h3>
<br>
<br>

<form action="consultarInstruccionesSRV" method="post">
    <table>
        <tr>
            <td>Código Instrucción:</td>
            <td>
                <input type="text" name="txtCodIns" />
            </td>
        </tr>
    </table>
    <input type="submit" value="Buscar" />
</form>

<%
    String descripcion = (String) session.getAttribute("descripcion");
    String cantidadNecesaria = (String) session.getAttribute("cantidadNecesaria");
    String codMatPrima = (String) session.getAttribute("codMatPrima");
%>
<br><br>
<form name="Modifica" action="actualizarInstruccionesSRV" >
    <table>
        <tr><td> Peso </td>
            <td><input type="text" name="txtDescripcion" id="txtIDDescripcion" disabled value="<%=descripcion == null ? "" : descripcion%>"  /> </td>
        </tr>
        <tr><td> Cantidad Extraida </td>
            <td><input type="text" name="txtCantidadNecesaria" id="txtIDCantidadNecesaria" disabled value="<%=cantidadNecesaria == null ? "" : cantidadNecesaria%>"  /> </td>
        </tr>
        <tr><td> Presion </td>
            <td><input type="text" name="txtCodMatPrima" id="txtIDCodMatPrima" disabled value="<%=codMatPrima == null ? "" : codMatPrima%>"  /> </td>
        </tr>
        <tr>
            <td><input type="reset" name="btnLimpiar" value="Limpiar" onClick="limpiar()"/> </td>
            <td><input type="button" name="btnModificar" value="Modificar" onClick="habilitar()"/> </td>
            <td><input type="submit" name="btnBorrar" value="Borrar" /> </td>
            <td><input type="submit" name="btnConfirmaModificar" value="Confirma Modificar" id="btnIdConfirmaModificar" disabled/> </td>
        </tr>

    </table>
</form>
<h3><a href="index.jsp">Volver</a></h3>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora Web</title>
</head>   
<body>
	Inserte la expresión que desea calcular
    <form action="Proceso" method="get">
          <input type="hidden" name="accion" value="Calcular" />
          <input type="text" name="operacion">
          <input type="submit" value="Calcular">
    </form>
    <c:if test="${!empty requestScope.resultado}" >
        La operacion de <b><c:out value="${requestScope.operacion}" /></b> es equivalente a: <b><c:out value="${requestScope.resultado}" /></b><br>
        Tiempo de ejecucion: <b><c:out value="${requestScope.tiempo}" /></b> nanosegundos.
    </c:if>                        
</body>
</html>
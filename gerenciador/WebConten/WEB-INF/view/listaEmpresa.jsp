<%@ page import="java.util.List,br.com.javaee.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
	<body>
	<c:import url="logout-parcial.jsp"></c:import>
	
	Usuario Logado: ${usuarioLogado.login }
	
	<br>
	<br>
	
	<c:if test="${not empty empresa}">
			Empresa ${ empresa } cadastrada com sucesso!
		</c:if>
	
		Lista Empresas: <br />
		<c:forEach items="${empresas}" var="empresa">
			<li>${ empresa.nome } - <fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id }">edita</a> 
				<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id }">remove</a>
			
			</li>		
		</c:forEach>

	</body>

</html>
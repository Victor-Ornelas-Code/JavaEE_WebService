package br.com.javaee.cliente;

import org.apache.http.client.fluent.Request;

public class ClienteWebService {

	public static void main(String[] args) throws Exception {
		
		String conteudo = Request
		.Post("http://localhost:8080/gerenciador/empresas")
		.addHeader("accept", "application/xml")
		.execute()
		.returnContent()
		.asString();
		
		System.out.println(conteudo);
	}

}
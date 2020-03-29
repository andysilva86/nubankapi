package br.com.fiap.grupo13.nubankapi.service;

public class ManualAPIService {
	
	private String manualHtml;
	
	
	public String getManual() {
		
		manualHtml = 
				"<html>"
				+ "<head>"
				+	 "<title>API FIAP GRUPO 13</title>"
				+ "</head>"
				+ "<body>"
				+ "<h2>MANUAL NUBANK&nbsp;API GRUPO 13 - FIAP&nbsp;API v1.0</h2>\r\n" + 
				"\r\n" + 
				"<p>RM: 333471 - Paulo Machado de Almeida Neto</p>\r\n" + 
				"\r\n" + 
				"<p>RM: 334918 - Anderson Florentino da Silva</p>\r\n" + 
				"\r\n" + 
				"<p>&nbsp;</p>\r\n" + 
				"\r\n" + 
				"<p>&quot;<strong>Nubank API</strong>&quot; este manual demonstra os endpoints disponiveis para acesso a API para demonstracao de funcionamento da FEATURE NUBANK API para a FIAP GRUP 13.</p>\r\n" + 
				"\r\n" + 
				"<p>Endere&ccedil;o da&nbsp;API:&nbsp;<a href=\"http://35.198.24.16:8080/\">http://35.198.24.16:8080/</a>&nbsp;&lt;---- acesso a estes Manual</p>\r\n" + 
				"\r\n" + 
				"<address>Paulo Almeida e Anderson Silva</address>\r\n" + 
				"\r\n" + 
				"<address><img alt=\"\" height=\"112\" src=\"https://cdn2.downdetector.com/static/uploads/c/300/4f5a9/Nubank_logo.png\" width=\"140\" /></address>\r\n" + 
				"\r\n" + 
				"<p>&nbsp;</p>\r\n" + 
				"\r\n" + 
				"<h2><strong>Endpoints disponiveis</strong></h2>\r\n" + 
				"\r\n" + 
				"<p><strong>/LOGIN</strong></p>\r\n" + 
				"\r\n" + 
				"<p><strong>Validacao de acesso a conta a base e feature</strong></p>\r\n" + 
				"\r\n" + 
				"<p><strong>Acesso&nbsp;</strong></p>\r\n" + 
				"\r\n" + 
				"<p><a href=\"http://35.198.24.16:8080/\">http://35.198.24.16:8080/</a>login?conta=nnnn&amp;senha=xxxxx</p>\r\n" + 
				"\r\n" + 
				"<p><strong>Retorno OK</strong></p>\r\n" + 
				"\r\n" + 
				"<pre>\r\n" + 
				"{&quot;idConta&quot;:3,\r\n" + 
				"&nbsp;&quot;nome&quot;:&quot;FIAP&quot;,\r\n" + 
				"&nbsp;&quot;senha&quot;:&quot;123456&quot;,\r\n" + 
				"&nbsp;&quot;saldo&quot;:10000.0,\r\n" + 
				"&nbsp;&quot;featureCliente&quot;:true}\r\n" + 
				"</pre>\r\n" + 
				"\r\n" + 
				"<p><strong>Busca lista de transacoes</strong></p>\r\n" + 
				"\r\n" + 
				"<p><a href=\"http://35.198.24.16:8080/\">http://35.198.24.16:8080/</a>transacao</p>\r\n" + 
				"\r\n" + 
				"<p><strong>Retorno</strong></p>\r\n" + 
				"\r\n" + 
				"<p>NubankAPI FIAP&nbsp;Grupo 13 API v1.0</p>\r\n" + 
				"\r\n" + 
				"<p><img alt=\"\" height=\"75\" src=\"https://image.winudf.com/v2/image1/YnIuY29tLmZpYXAuZmlhcG9uX2ljb25fMTU1MDY5OTE1Ml8wOTE/icon.png?w=340&amp;fakeurl=1\" width=\"76\" /></p>\r\n" + 
				"\r\n" + 
				"<address>&nbsp;</address>\r\n" + 
				""
				+ "</body>"
				+ ""
				+ "</html>";
		
		return manualHtml;		
	}

}

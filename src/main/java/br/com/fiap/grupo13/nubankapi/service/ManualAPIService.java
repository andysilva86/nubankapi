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
				"<p>&quot;<strong>Nubank API</strong>&quot; este manual demonstra os endpoints disponiveis para acesso a API para demonstracao de funcionamento da FEATURE NUBANK API para a FIAP GRUPO 13.</p>\r\n" + 
				"\r\n" + 
				"<p>Endere&ccedil;o principal da&nbsp;API:&nbsp;<a href=\"http://35.198.24.16:8080/\">http://35.198.24.16/</a>&nbsp;&lt;---- acesso&nbsp;Manual</p>\r\n" + 
				"\r\n" + 
				"<address>Paulo Almeida e Anderson Silva</address>\r\n" + 
				"\r\n" + 
				"<address><img alt=\"\" height=\"112\" src=\"https://cdn2.downdetector.com/static/uploads/c/300/4f5a9/Nubank_logo.png\" width=\"140\" /></address>\r\n" + 
				"\r\n" + 
				"<p>&nbsp;</p>\r\n" + 
				"\r\n" + 
				"<h2><strong>Endpoints disponiveis</strong></h2>\r\n" + 
				"\r\n" + 
				"<p><span style=\"font-size:20px\"><strong><a href=\"http://35.198.24.16:8080/\">http://35.198.24.16</a>/autenticacao </strong></span></p>\r\n" + 
				"\r\n" + 
				"<p><strong>(acesso via POST) -&nbsp;Validacao de acesso a conta</strong></p>\r\n" + 
				"\r\n" + 
				"<p>//Dados de envio (body):</p>\r\n" + 
				"\r\n" + 
				"<p><span style=\"color:#FF0000\">{<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;user&quot;: &quot;fiap&quot;,<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;password&quot;: &quot;123456&quot;<br />\r\n" + 
				"}</span></p>\r\n" + 
				"\r\n" + 
				"<p>//Dados de retorno:&nbsp;<br />\r\n" + 
				"{<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;authentication&quot;: true<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;userId&quot;: 2<br />\r\n" + 
				"}</p>\r\n" + 
				"\r\n" + 
				"<p><span style=\"font-size:20px\"><strong><a href=\"http://35.198.24.16:8080/\">http://35.198.24.16</a>/conta-corrente</strong></span></p>\r\n" + 
				"\r\n" + 
				"<p><strong><span style=\"color:#FF0000\">Exemplo :&nbsp;</span></strong><a href=\"http://35.198.24.16:8080/\">http://35.198.24.16</a><strong>/conta-corrente<span style=\"color:#FF0000\">?userId=1</span></strong></p>\r\n" + 
				"\r\n" + 
				"<p><strong>(acesso via GET) - Recuperar o saldo e flag feature</strong></p>\r\n" + 
				"\r\n" + 
				"<p>//Dados de retorno:&nbsp;</p>\r\n" + 
				"\r\n" + 
				"<p>{<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;balance&quot;: 7700.0,<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;easyCredit&quot;: true&nbsp; &nbsp;&nbsp;<br />\r\n" + 
				"}</p>\r\n" + 
				"\r\n" + 
				"<p><span style=\"font-size:20px\"><strong><a href=\"http://35.198.24.16:8080/\">http://35.198.24.16</a>/conta-corrente/transacao</strong></span></p>\r\n" + 
				"\r\n" + 
				"<p><strong><span style=\"color:#FF0000\">Exemplo :&nbsp;</span></strong><a href=\"http://35.198.24.16:8080/\">http://35.198.24.16</a><strong>/conta-corrente/transacao<span style=\"color:#FF0000\">?userId=1</span></strong></p>\r\n" + 
				"\r\n" + 
				"<p><strong>(acesso via GET) - Recuperar lista de transa&ccedil;&otilde;es do&nbsp;cliente</strong></p>\r\n" + 
				"\r\n" + 
				"<p>//Dados de retorno(retorno com a lista das ultimas transa&ccedil;&otilde;es):&nbsp;</p>\r\n" + 
				"\r\n" + 
				"<p>[<br />\r\n" + 
				"&nbsp; {<br />\r\n" + 
				"&nbsp; &nbsp; &quot;description&quot;: &quot;Dep&oacute;sito realizado&quot;,<br />\r\n" + 
				"&nbsp; &nbsp; &quot;value&quot;: 1000.0,<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;date&quot;: &quot;17/01/2020&quot;<br />\r\n" + 
				"&nbsp; },<br />\r\n" + 
				"&nbsp; {<br />\r\n" + 
				"&nbsp; &nbsp; &quot;description&quot;: &quot;Transfer&ecirc;ncia realizada&quot;,<br />\r\n" + 
				"&nbsp; &nbsp; &quot;value&quot;: 500.0,<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;date&quot;: &quot;25/01/2020&quot;<br />\r\n" + 
				"&nbsp; },<br />\r\n" + 
				"&nbsp; {<br />\r\n" + 
				"&nbsp; &nbsp; &quot;description&quot;: &quot;Dep&oacute;sito realizado&quot;,<br />\r\n" + 
				"&nbsp; &nbsp; &quot;value&quot;: 200.0,<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;date&quot;: &quot;10/02/2020&quot;<br />\r\n" + 
				"&nbsp; },<br />\r\n" + 
				"&nbsp; {<br />\r\n" + 
				"&nbsp; &nbsp; &quot;description&quot;: &quot;Cr&eacute;dito contratado&quot;,<br />\r\n" + 
				"&nbsp; &nbsp; &quot;value&quot;: 7000.0,<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;date&quot;: &quot;01/03/2020&quot;<br />\r\n" + 
				"&nbsp; }<br />\r\n" + 
				"]</p>\r\n" + 
				"\r\n" + 
				"<p><span style=\"font-size:20px\"><strong><a href=\"http://35.198.24.16:8080/\">http://35.198.24.16</a>/conta-corrente/transacao-futura</strong></span></p>\r\n" + 
				"\r\n" + 
				"<p><strong><span style=\"color:#FF0000\">Exemplo :&nbsp;</span></strong><a href=\"http://35.198.24.16:8080/\">http://35.198.24.16</a><strong>/conta-corrente/transacao-futura<span style=\"color:#FF0000\">?userId=1</span></strong></p>\r\n" + 
				"\r\n" + 
				"<p><strong>(acesso via GET) - Recuperar lista de transa&ccedil;&otilde;es futuras do&nbsp;cliente / parcelas do Credito Facil contratadas</strong></p>\r\n" + 
				"\r\n" + 
				"<p>//Dados de retorno (lista de lan&ccedil;amentos futuros no nosso caso retornar&aacute; a lista com cada parcela do cr&eacute;dito contratado):&nbsp;</p>\r\n" + 
				"\r\n" + 
				"<p>[<br />\r\n" + 
				"&nbsp; {<br />\r\n" + 
				"&nbsp; &nbsp; &quot;description&quot;: &quot;Cr&eacute;dito contratado&quot;,<br />\r\n" + 
				"&nbsp; &nbsp; &quot;value&quot;: 700.0<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;date&quot;: &quot;29/04/2020&quot;<br />\r\n" + 
				"&nbsp; },<br />\r\n" + 
				"&nbsp; {<br />\r\n" + 
				"&nbsp; &nbsp; &quot;description&quot;: &quot;Cr&eacute;dito contratado&quot;,<br />\r\n" + 
				"&nbsp; &nbsp; &quot;value&quot;: 700.0<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;date&quot;: &quot;29/05/2020&quot;<br />\r\n" + 
				"&nbsp; },<br />\r\n" + 
				"&nbsp; {<br />\r\n" + 
				"&nbsp; &nbsp; &quot;description&quot;: &quot;Cr&eacute;dito contratado&quot;,<br />\r\n" + 
				"&nbsp; &nbsp; &quot;value&quot;: 700.0<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;date&quot;: &quot;29/06/2020&quot;<br />\r\n" + 
				"&nbsp; },<br />\r\n" + 
				"&nbsp; {<br />\r\n" + 
				"&nbsp; &nbsp; &quot;description&quot;: &quot;Cr&eacute;dito contratado&quot;,<br />\r\n" + 
				"&nbsp; &nbsp; &quot;value&quot;: 700.0<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;date&quot;: &quot;29/07/2020&quot;<br />\r\n" + 
				"&nbsp; },<br />\r\n" + 
				"&nbsp; {<br />\r\n" + 
				"&nbsp; &nbsp; &quot;description&quot;: &quot;Cr&eacute;dito contratado&quot;,<br />\r\n" + 
				"&nbsp; &nbsp; &quot;value&quot;: 700.0<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;date&quot;: &quot;29/08/2020&quot;<br />\r\n" + 
				"&nbsp; }<br />\r\n" + 
				"]</p>\r\n" + 
				"\r\n" + 
				"<p><span style=\"font-size:20px\"><strong><a href=\"http://35.198.24.16:8080/\">http://35.198.24.16</a>/conta-corrente/credito-facil</strong></span><span style=\"font-size:20px\"><strong> </strong></span></p>\r\n" + 
				"\r\n" + 
				"<p><strong>(acesso via POST) -&nbsp;Realiza a contratacao da Feature Credito Facil</strong></p>\r\n" + 
				"\r\n" + 
				"<p>//Dados de envio (body)</p>\r\n" + 
				"\r\n" + 
				"<p><span style=\"color:#FF0000\">{<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;userId&quot; = 2,<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;value&quot;: 3500.0,<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;qtyMonth&quot;: 5<br />\r\n" + 
				"}</span></p>\r\n" + 
				"\r\n" + 
				"<p>//Dados de retorno:&nbsp;</p>\r\n" + 
				"\r\n" + 
				"<p>{<br />\r\n" + 
				"&nbsp;&nbsp; &nbsp;&quot;result&quot;: true //resultado do cadastro/contrata&ccedil;&atilde;o do cr&eacute;dito f&aacute;cil<br />\r\n" + 
				"}</p>\r\n" + 
				"\r\n" + 
				"<p>&nbsp;</p>\r\n" + 
				"\r\n" + 
				"<p>NubankAPI FIAP&nbsp;Grupo 13 API v1.0</p>\r\n" + 
				"\r\n" + 
				"<p><img alt=\"\" height=\"75\" src=\"https://image.winudf.com/v2/image1/YnIuY29tLmZpYXAuZmlhcG9uX2ljb25fMTU1MDY5OTE1Ml8wOTE/icon.png?w=340&amp;fakeurl=1\" width=\"76\" /></p>\r\n" + 
				"\r\n" + 
				"<address>&nbsp;</address>\r\n" + 
				"\r\n" + 
				"<address>&nbsp;</address>\r\n" + 
				""
				+ "</html>";
		
		return manualHtml;		
	}

}

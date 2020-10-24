# Exemplo de aplica��o do padr�o MVC (Model, View, Controller)

	Para os estudos da Semana XIII da disciplina, sobre o padr�o de projeto MVC,
adaptei um exerc�cio de fixa��o sobre o mesmo tema da disciplina de Programa��o
Orientada a Objetos II. Trata-se de um programa simples que cadastra alguns dados
de clientes CNPJ, fazendo a persist�ncia de dados em um arquivo de texto.
	No pacote view temos o jFrame da janela principal, contendo todos os componentes
gr�ficos para intera��o com o usu�rio.
	No pacote modelo h� a defini��o da classe ClienteEmpresa, com os atributos que ser�o
lidos e persistidos em arquivo.
	No pacote controle a classe ClienteEmpresaControle responde aos eventos de usu�rio
oriundos da interface gr�fica, definida na view. Ocorre o tratamento dos dados para que, ent�o,
os mesmos sejam enviados ao pacote DAO (Data Access Object) que implementa o m�todo de 
persist�ncia dessas informa��es.
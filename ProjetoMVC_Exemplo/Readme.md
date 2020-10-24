# Exemplo de aplicação do padrão MVC (Model, View, Controller)

	Para os estudos da Semana XIII da disciplina, sobre o padrão de projeto MVC,
adaptei um exercício de fixação sobre o mesmo tema da disciplina de Programação
Orientada a Objetos II. Trata-se de um programa simples que cadastra alguns dados
de clientes CNPJ, fazendo a persistência de dados em um arquivo de texto.
	No pacote view temos o jFrame da janela principal, contendo todos os componentes
gráficos para interação com o usuário.
	No pacote modelo há a definição da classe ClienteEmpresa, com os atributos que serão
lidos e persistidos em arquivo.
	No pacote controle a classe ClienteEmpresaControle responde aos eventos de usuário
oriundos da interface gráfica, definida na view. Ocorre o tratamento dos dados para que, então,
os mesmos sejam enviados ao pacote DAO (Data Access Object) que implementa o método de 
persistência dessas informações.
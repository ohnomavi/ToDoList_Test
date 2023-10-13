<h1 style="color: #FF409F">README - Projeto To Do List em Java </h1>

<h2>Este é um projeto simples de uma aplicação de To Do List desenvolvida em Java Swing. A aplicação permite a inclusão e exclusão de lembretes e datas futuras, garantindo que somente datas futuras sejam aceitas.<h2>

<h2 style="color: #FF409F">Requisitos</h2> 
Java 17
IDE Java (foi utilizado VSCode)
JUnit 4
Extensões: 
Extension Pack for Java;
Test Runner for Java.


<h2 style="color: #FF409F">Executando o Projeto</h2>

Clone o repositório para sua máquina local:
bash
Copy code
git clone https://github.com/seu-usuario/todo-list-java-swing.git
Abra o projeto em sua IDE Java.

Execute o arquivo TodoListApp.java.

A interface da aplicação To Do List será exibida em uma nova janela.

<h2 style="color: #FF409F"> Funcionalidades</h2>
A aplicação To Do List possui as seguintes funcionalidades:

Inclusão de Lembretes em Datas Futuras
Você pode adicionar novos lembretes especificando o texto do lembrete e a data associada a ele. Certifique-se de inserir apenas datas futuras, pois datas passadas não serão aceitas.

Exclusão de Lembretes
Você pode excluir lembretes da lista pressionando o botão "Excluir" ao lado do lembrete que deseja remover.

<h2 style="color: #FF409F">Estrutura do Projeto </h2>
O projeto é organizado da seguinte maneira:

src/ - Contém o código-fonte Java da aplicação.
TodoListApp.java - Ponto de entrada da aplicação.
Lembrete.java - A classe que define Lembrete.
TodoListTest.java - A classe que demonstra possibilidades de testes.
lib/- contem JUnit 4 para testes.

<h2 style="color: #FF409F">Testes</h2>

Este projeto inclui testes unitários feitos com JUnit para garantir o funcionamento correto das funcionalidades. Os testes são organizados na pasta `test/` e podem ser executados para verificar a integridade do código. Os seguintes aspectos são testados:

- Adição de lembretes e datas futuras.
- Remoção de lembretes da lista.
- Garantia de que datas passadas não são aceitas.

A inclusão de testes é uma prática recomendada para garantir que o projeto permaneça robusto e que futuras alterações não afetem o funcionamento existente.


<h2 style="color: #FF409F">Contribuiçoes</h2>
Sinta-se à vontade para contribuir com melhorias ou correções para este projeto. Basta seguir os passos abaixo:

Faça um fork do repositório.

Crie uma branch para sua contribuição:

bash
Copy code
git checkout -b minha-contribuicao
Faça as alterações desejadas.

Faça commit das alterações:

bash
Copy code
git commit -m "Minha contribuição"
Envie as alterações para o seu fork:
bash
Copy code
git push origin minha-contribuicao
Crie um Pull Request no repositório original para revisão.
Licença
Este projeto é licenciado sob a Licença MIT - consulte o arquivo LICENSE para obter detalhes.


<h1> 💙 Projeto To Do List em Java 💙 </h1>

<p>Este é um projeto simples de uma aplicação de To Do List desenvolvida em Java Swing. A aplicação permite a inclusão e exclusão de lembretes e datas futuras, garantindo que somente datas futuras sejam aceitas.</p>


## Sumário
- [Requisitos](#requisitos)
- [Executando o Projeto](#executando-o-projeto)
- [Passo a passo para uso](#passo-a-passo-para-uso)
- [Funcionalidades](#funcionalidades)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Testes](#testes)
- [Premissas Assumidas](#premissas-assumidas)
- [Decisões de Projeto](#decisões-de-projeto)
- [Contribuições](#contribuições)
<p></p>
💙
<p></p>
<h2>Requisitos</h2> 
<ul>
  <li>Java 17</li>
  <li>IDE Java (foi utilizado VSCode)</li>
  <li>JUnit 4</li>
  <li>Extensões:
    <ul>
      <li>Extension Pack for Java</li>
      <li>Test Runner for Java</li>
    </ul>
  </li>
</ul>


<h2>Executando o Projeto</h2>

<p>Clone o repositório para sua máquina local:</p>
<code>git clone https://github.com/seu-usuario/ToDoList_Test.git</code>

<p>Abra o projeto em sua IDE Java.</p>

<p>Execute o arquivo <code>TodoListApp.java</code>.</p>

<p>A interface da aplicação To Do List será exibida em uma nova janela.</p>

<h2>Passo a passo para uso</h2>

<ul>
  <li>Após executar a aplicação, uma janela será exibida com os seguintes campos:
    <ul>
      <li>Nome: Campo para inserir o nome da tarefa.</li>
      <li>Data: Campo para inserir a data da tarefa.</li>
    </ul>
  </li>
  <li>Preencha os campos "Nome" e "Data" com as informações da tarefa.</li>
  <li>Clique no botão "Criar".</li>
  <li>As tarefas inseridas aparecerão logo abaixo, na lista de tarefas.</li>
  <li>Para excluir uma tarefa, basta clicar no botão vermelho com um ícone de "X" localizado no canto da tarefa desejada.</li>
</ul>

<h2>Funcionalidades</h2>
<p>A aplicação possui as seguintes funcionalidades:</p>

<h3>Inclusão de Lembretes em Datas Futuras</h3>
<p>Você pode adicionar novos lembretes especificando o texto do lembrete e a data associada a ele. Certifique-se de inserir apenas datas futuras, pois datas passadas não serão aceitas.</p>

<h3>Exclusão de Lembretes</h3>
<p>Você pode excluir lembretes da lista pressionando o botão "Excluir" ao lado do lembrete que deseja remover.</p>


<h2>Estrutura do Projeto</h2>
<p>O projeto é organizado da seguinte maneira:</p>

<ul>
  <li>
    <strong>src/</strong> - Contém o código-fonte Java da aplicação.
    <ul>
      <li><strong>TodoListApp.java</strong> - Ponto de entrada da aplicação.</li>
      <li><strong>Lembrete.java</strong> - A classe que define Lembrete.</li>
      <li><strong>TodoListTest.java</strong> - A classe que demonstra possibilidades de testes.</li>
    </ul>
  </li>
  <li>
    <strong>lib/</strong> - Contém JUnit 4 para testes.
  </li>
</ul>


<h2>Testes</h2>

<p>Este projeto inclui testes unitários feitos com JUnit para garantir o funcionamento correto das funcionalidades. Os testes são organizados na pasta `test/` e podem ser executados para verificar a integridade do código.</p>

A inclusão de testes é uma prática recomendada para garantir que o projeto permaneça robusto e que futuras alterações não afetem o funcionamento existente.

<h2>Premissas Assumidas</h2>

Durante o desenvolvimento desta aplicação algumas premissas foram feitas:

1. Os usuários que interagirão com a aplicação têm familiaridade com conceitos básicos de lista de tarefas (To Do List) e estarão utilizando VSCode com extensões anteriormente mencionadas.

2. A aplicação não requer integração com banco de dados, sendo suficiente o armazenamento temporário em memória. 


<h2>Decisões de Projeto</h2>

Este projeto foi elaborado com base em algumas decisões de projeto:

1. **Linguagem e Versão**: A aplicação é desenvolvida em Java 17. Poderia ser feita em Spring de forma mais complexa, porém optei por utilizar algo mais próximo de Java "puro" para o teste.

2. **Interface Gráfica**: A interface de usuário é criada utilizando a biblioteca Java Swing, considerando que são poucos itens para editar.

3. **Armazenamento Temporário**: Os lembretes são armazenados temporariamente na memória, sem necessidade de persistência de dados em banco de dados. Existe a possibilidade de alterações, inserindo Maven e separando mais as classes para criar uma integração com banco de dados e arquivo pom.xlm.

4. **Funcionalidades Mínimas**: A aplicação foca nas funcionalidades essenciais, como adicionar, visualizar e marcar tarefas como concluídas.

5. **Simplicidade**: A simplicidade e usabilidade da aplicação são prioridades, tornando-a acessível para um público amplo.

6. **Testes de Qualidade**: Para garantir a qualidade do código, achei pertinente a existencia de testes.

**Este projeto foi criado para fins de avaliação de estágio e busca fornecer uma comprovaçao que a candidata possui base sólida em lógica de programação e desenvolvimento Java ou C#, portanto os itens simplicidade e funcionalidade mínima estão presentes.**

<h2>Contribuições</h2>
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


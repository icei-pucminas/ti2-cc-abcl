# A.DOTA


**Anna Pugga Campos Rodrigues, anna.campos@sga.pucminas.br**

**Bárbara Luiza Freitas Carmo, babi.carmo@outlook.com**

**Luiza Ribeiro Parente Silva, luizarparentesilva@gmail.com**

---

_Curso de Ciência da Computação, Unidade Coração Eucarístico_

_Instituto de Informática e Ciências Exatas – Pontifícia Universidade de Minas Gerais (PUC MINAS), Belo Horizonte – MG – Brasil_

---

_**Resumo**_ 
_Considerando os trantornos causados pela morosidade atual nos processos de adoção no Brasil, foi de interesse da equipe continuar o desenvolvimento de uma plataforma para controle das etapas, documentações e experiências presentes no decorrer de um processo adotivo. Visa-se facilitar o controle passo a passo do mesmo através de um suporte informativo e interativo sobre quais são os documentos e ações necessários em cada etapa, possibilitando maior controle e organização, além de propor a interação entre adotantes atuais e aqueles que já vivenciaram esta experiência._

---



**1. Introdução**
 
No país em que vivemos, o acesso a informações confiáveis é muitas vezes dificultado. Este pode ser um problema em contextos extremamente diversos, inclusive no processo de adoção, tendo em vista que muitos dos interessados em adotar não têm suporte suficiente para se orientarem de forma clara.

De acordo com entrevistas realizadas posteriormente e um recente contato com uma advogada especialista, saber quais são os documentos necessário para formalizar uma adoção no Brasil, onde obtê-los e suas funções no processo é algo complicado para os futuros pais e mães. Infelizmente, mesmo depois de tantos anos, as adoções no país continuam sendo demasiadamente burocráticas e demoradas, o que interfere diretamente no sucesso das mesmas. Considerando que a equipe não pode modificar diretamente os processos jurídicos que permeiam a formalização das adoções, foi necessário adotar uma nova perspectiva acerca do problema.  

Desta forma, passou-se a propor um ambiente digital que facilite o acesso às informações necessárias, como, por exemplo, quais são os documentos e onde conseguí-los, juntamente com a possibilidade de um intercâmbio de experiências por meio de um fórum para que quem ainda esteja passando pelo processo consiga tirar dúvidas com quem já o finalizou.


    1.1 Contextualização
O projeto se trata de uma plataforma que integra conhecimentos de desenvolvimento web, banco de dados e sistemas inteligentes com o intuito de instruir e facilitar os processos daqueles que pretendem realizar uma adoção. Segundo o Cadastro Nacional de Adoção, em 2019 foram registradas 9.548 crianças e adolescentes estão na fila para a adoção e o número de interessados em adotar é cerca de quatro vezes maior, porém, a morosidade do processo e algumas questões de preferência impedem que estes processos tenham sucesso.

    1.2 Problema
Conforme explicitado, no país em que vivemos, a burocracia e a ineficácia do sistema pelo qual é implementado o processo de adoção acaba forçando esses casais a esperar muito mais tempo do que seria necessário até que consigam algum avanço no procedimento.

Devido à má implementação, ao excessivo tempo de espera, à legislação precária e a muitos outros fatores, os cônjuges que têm a intenção de adotar sofrem com a morosidade do sistema proposto pelo governo brasileiro.

    1.3 Objetivo geral
Frente ao problema salientado, procurou-se utilizar os recursos tecnológicos a disposição para criar um ambiente online que ajude os futuros pais e mães a orientarem-se durante essa jornada burocrática. Ademais, empenhar-se-á na tarefa de oferecer recursos além dos oferecidos pelo programa governamental, permitindo aos usuários o usufruto de artifícios que permitam maior liberdade aos que buscam sucesso na adoção, inserindo-os diretamente no processo, e, permitindo maior transparência no procedimento.

        1.3.1 Objetivos específicos
Dentre os objetivos específicos da equipe A.dota podemos citar a intenção de expandir os conhecimentos e o acesso à informações sobre o assunto para os adotantes e a concepção de um ambiente que possibilite organizar, controlar e acompanhar o andamento do processo. Para isso o ambiente A.dota conta com diversos materiais de apoio como vídeos, depoimentos, acesso a leis, sites governamentais, especificação dos processos passo a passo e controle interativo e personalizado das estapas concluídas, em andamentos e futuras.

    1.4 Justificativas
Considerando que o Brasil tem atualmente 4,9 mil crianças e adolescentes no sistema de  adoção, de acordo com pesquisa realizada pela Agência Brasil, mas que cada processo iniciado pode demorar anos para ser efetivado, propôs-se a busca por soluções que possam facilitá-los por meio dos conhecimentos da equipe acerca da área de desenvolvimento de software, sistemas inteligentes e banco de dados.



**2. Projeto da Solução**

Durante o processo de desenvolvimento, todos os membros das equipes tiveram contato direto com pais que já haviam adotado e/ou casais que estavam interessados no assunto. Dessa maneira, a partir da análise das inúmeras dificuldades enfrentadas por esses pais, foi possível visualizar a realidade dura e cruel do atual procedimento de adoção. A partir desta análise, juntamente com nossos conhecimentos programacionais, foi possível desenvolver um planejamento para o que viria a ser nossa solução para este problema.

    2.1. Personas 

As personas levantadas durante o processo de entendimento do problema são apresentadas na figuras a seguir:
![Persona 1](imagens/persona01.jpg "Carolina Pareira")
![Persona 2](imagens/persona02.jpg "João Alberto")

    2.2. História de usuário

A partir da compreensão do dia a dia das personas identificadas para o projeto, foram verificadas as seguintes histórias de usuários:

| Eu como persona... | ...quero/desejo... | ...para |
| ------------------ |:------------------:| -------:|
| João Alberto | ter mais informações sobre adoção | ter certeza da minha decisão |
| João Alberto | saber quais são os passos a serem seguidos | conseguir me organizar melhor |
| João Alberto | não precisar sempre entrar em contato com o advogado | poupar tempo e esforço |
| Carolina Pareira | conseguir acompanhar meu processo com mais clareza | me organizar melhor |
| Carolina Pareira | conhecer a documentação necessária e onde conseguí-la | agilizar meu processo |
| Carolina Pareira | ter acesso a conteúdos diversos sobre o assunto | me interar sobre o tema |

    2.3. Requisitos funcionais
	
A tabela a seguir apresenta os requisitos do projeto, identificando a prioridade de cada um.

| No.           | Descrição                                         | Prioridade |
| ------------- |:-------------------------------------------------:| ----------:|
| RF-01         | O site apresenta uma versão clássica e outra otimizada especificamente para dispositivos móveis (web app).    | Alta  |
| RF-02         | O site oferece uma plataforma de cadastro, que permite que cada usuário seja direcionado para a criação de seu perfil.    | Alta  |
| RF-03         | O site oferece informações detalhadas sobre o processo de adoção. | Alta  |
| RF-04         | O site permite a checagem do andamento do processo de adoção de cada usuário. | Alta  |
| RF-05         | O site, por meio das informações disponibilizadas pelo usuário, desbloqueia processos quando as tarefas são finalizadas.  | Alta  |
| RF-06         | O site apresenta a documentação necessária para cada etapa do processo de adoção, explicando cada uma.    | Alta  |
| RF-07         | O site indica os locais e os órgãos responsáveis pela emissão de cada documento.  | Alta  |
| RF-08         | A cada etapa concluída, o site indica os próximos passos a serem seguidos em relação às documentações.    | Alta  | 
| RF-09         | O site apresenta veículos de comunicação em que o usuário pode expressar dúvidas. | Baixa |
| RF-10         | O site permite que o usuário interaja com um chatbot para tirar dúvidas.   | Baixa |    
| RF-11         | O site oferece acesso a vídeos e notícias sobre a adoção no Brasil.   | Baixa |    
| RF-12         | O site informa algumas leis importantes sobre o tema e direciona aos órgãos especializados.   | Baixa |    

    2.4. Requisitos não funcionais

A tabela a seguir apresenta os requisitos não funcionais do projeto e suas prioridades indicadas.

| No.           | Descrição                                         | Prioridade |
| ------------- |:-------------------------------------------------:| ----------:|
| RNF-01    | O site está acessível na Internet por meio da hospedagem na plataforma Heroku.  | Alta |
|RNF-02     | O site é compatível com os principais navegadores do mercado (Google Chrome, Firefox, Microsoft Edge)  | Alta |
| RNF-03    | O site é responsivo, se adequando há diferentes tamanhos de telas.  | Média |
| RNF-04    | O site é instalável nos principais sistemas operacionais mobile (Android e IOS).  | Alta |

    2.5. Restrições

As questões que limitam o projeto em questão são apresentadas na tabela a seguir

| No.           | Descrição                                         |
| ------------- |:-------------------------------------------------:|
| RE-01     | O site não atua diretamente na burocracia do processo de adoção |
| RE-02     | O site não tem controle dos prazos |
| RE-03     | Mesmo servindo de apoio, o aplicativo não substitui a presença de um advogado. |


    2.6. Tecnologias e ambiente de trabalho

Com relação à gestão do código fonte, o grupo de desenvolvimento, após fazer suas alterações no projeto, faz a commit na branch master do repositório do GitHub. Após a confirmação de sucesso e isenção de falhas nessa commit, é feito o push para o Heroku, pelo qual será exibido o site ao usuário final.

Estão listadas abaixo as tecnologias, ferramentas e ambientes utilizados para o desenvolvimento do projeto A.dota especificadas por finalidade e utilização:

* Linguagens de desenvolvimento web front-end: HTML, CSS e JavaScript;
* Linguagens de desenvolvimento back-end: Java;
* Repositório: GitHub; 
* Frameworks: Bootstrap, MDB e Spark;
* Integração BD com o site: Eclipse, Maven; 
* Banco de dados: PostgreSQL;
* IDE web: Microsoft Visual Studio Code;
* Service Worker para permitir ao smartphone reconhecer o site como app;
* Microsoft Azure como servidor em nuvem para o banco de dados e fornecendo a API para o ChatBot;
* QnA Maker para reunir e formular perguntas e respostas do ChatBot.

Como citado acima, para o desenvolvimento base de nossa aplicação web foram utilizadas linguagens de front-end e back-end através do Microsoft Visual Studio Code, montando uma aplicação com diversas páginas e funcionalidades. A partir daí, foi possível integrar as informações dos usuários com o banco de dados da A.dota no PostgreSQL através da Eclipse e Maven. Além disso, foram utilizadas as plataformas QnA Maker e Microsoft Azure como base para a criação do ChatBot.

A imagem a seguir demonstra a relação estabelecida entre as principais tecnologias e ambientes utilizados para a elaboração, desenvolvimento e finalização do projeto A.dota:

![Relação entre as tecnologias](imagens/tecnologias.png "Relação entre as tecnologias")

    2.7 Metodologia de trabalho

Neste projeto utilizou-se a metodologia Scrum, que consiste em dividir sendo cada um responsável por uma parte predefinida do projeto, delimitando, assim, o que cada parte do grupo faz, simplificando os testes e desenvolvimento mais aperfeiçoado das funcionalidades. Além disso, para o desenvolvimento do sistema, partiu-se do ciclo sprint, que consiste em analisar o que precisa ser feito, implementá-las no produto, revisar e testar.

Outro pilar do Scrum, o Product Backlog foi aplicado no gerenciamento das tarefas, o qual consiste na criação de uma lista de funcionalidades necessárias para o projeto, tornando-se mais simples a análise de quais partes são mais importantes e que merecem maior enfoque. 

Como a equipe da A.dota é composta de três integrantes, a função de desenvolvedor foi desempenhada por todos os membros, porém, atuando em partes diferentes. A equipe está organizada da seguinte maneira:
* _Scrum Master: Luiza Ribeiro_ -> Mantém a equipe em uma sintonia e fiscaliza o andamento do produto e do segmento do Scrum.
* _Product Owner: Anna Puga_ -> Chefe de criação do software. Coordena o desenvolvimento sugere melhorias a serem feitas no produto, além de identificar os problemas da aplicação.
* _Equipe de Desenvolvimento: Anna Puga, Bárbara Carmo, Luiza Parente_ -> Trabalham no desenvolvimento do produto em todas as partes, principalmente onde cada um tem mais facilidade.
* _Equipe de Design: Bárbara Carmo_ -> Trabalha no design das páginas e do aplicativo do produto, tendo em base suas funcionalidades e como estas devem ficar no distribuídos no seu produto, sendo extremamente necessárias do início ao fim, tanto como base para o desenvolvimento como a parte final do mesmo.


**3. Sistema desenvolvido**

A A.dota é uma plataforma para controle do processo adotivo, como já especificado anteriormente. Nela estão reunidos conhecimentos de desenvolvimento web, sistemas inteligentes e banco de dados de forma interligada. Sua estrutura básica é um site, hospedado pelo Heroku, no qual os usuários cadastrados tem suas informações gerenciadas através de um banco de dados e para melhorar a experiênia dos adotantes, foi implementado um ChatBot, de nome A.Lice, que responde as principais dúvidas sobre o processo adotivo.

É possível encontrar na A.dota, notícias, vídeos, depoimentos, leis, detalhamento dos passos dentro do processo de adoção, a possibilidade de enviar um e-mail para nossa equipe, um chat social e os serviços da A.Lice, ChatBot responsável por sanar as principais dúvidas dos adotantes.
	
    3.1 Wireframes e fluxo

O esquema e os wireframes a seguir representam parte do fluxo de utilização do A.dota e suas funcionalidades em sua fase de prototipação, ou seja, foram desenvolvidas para ilustrar e orientar como o site viria a ser. Estas foram desenvolvidas na plataforma MarvelApp e podem ser visualizadas em sua forma interativa a partir do link: https://marvelapp.com/prototype/7770i1b

Estão ilustradas as telas iniciais, tais como login, cadastro e primeira tela do sistema, assim como as telas de funcionalidades, tais como home, notícias, vídeos, chat social, chatbot e todas as demais. A explicação do objetivo e funcionalidades de cada tela serão explicados já em sua visualização final como aplicação web.

![Wireframes](imagens/wireframes01.png "Wireframes")
![Wireframes](imagens/wireframes02.png "Wireframes")
![Wireframes](imagens/wireframes03.png "Wireframes")

    3.2 Telas do sistema

As telas para cada uma das funcionalidades do sistema, bem como a forma de acesso e utilização são apresentadas a seguir:

* Tela Inicial 

A tela inicial do A.dota fornece aos usuários breves informações sobre a aplicação e os permitem fazer login ou cadastrar-se no sistema. É a primeira página que os usuários têm acesso ao entrarem no sistema A.dota e sua interface pode ser observada na imagem que segue:

![Tela inicial](imagens/1.jpg "Tela inicial")

* Entrar (login)

Após clicar no botão “Entrar”, na tela inicial, o usuário será redirecionado para a página de login. A tela de login permite o usuário seguir dois caminhos, a do cadastramento, caso o usuário não tenha uma conta criada ainda, e a entrada de fato na plataforma. Nesta página podemos ver a utilização da conexão do site com o banco de dados projetado para armazenar as informações dos adotantes. 

Para efetuar o login, o usuário deve informar o endereço de email e senha cadastrados anteriormente no sistema, como pode ser observado na imagem abaixo:

![Entrar](imagens/2.jpg "Entrar")

* Cadastro 

Após clicar nem "Cadastrar-se", na tela inicial, o usuário será redirecionado para a página de cadastro, permitindo a ele criar uma conta na aplicação, para salvar as suas informações de processos e permitindo a adaptação do site às suas necessidades. Nesta página é realizada de fato a conexão entre a aplicação web e o banco de dados. 

Neste momento o usuário precisa informar nome, sobrenome, email, telefone e criar uma senha, como mostra a imagem que segue. Todas essas informações são enviadas e salvas no banco de dados da A.dota para que os adotantes enham uma experiência personalizada ao entrar na plataforma e para que o andamento dos processos possa ser controlado sempre.

![Cadastro](imagens/3.jpg "Cadastro")

* Home 

Ao entrar no sistema, por login ou cadastro de nova conta, o adotante tem acesso a tela principal do site. Nesta tela estão presentes alguns vídeos, que podem ser assistidos dentro da própria plataforma - que também podem ser encontrados para melhor visualização na página "Vídeos" - e depoimentos de famílias que já passaram pela experiência da adoção. 

Além disso, é utilizada Local Storage para armazenar temporariamente o nome do usuário utilizando o sistema. Dessa forma, o adotante pode receber uma saudação personalida e se sente melhor acolhido pela plataforma A.dota, como mostrado nas duas imagens a seguir:

![Home 01](imagens/4.jpg "Home 01")
![Home 02](imagens/5.jpg "Home 02")

* Perfil

O perfil é a página mais importante da plataforma A.dota. É nela que o adotante tem controle dos processos em andamento, concluídos e futuros, como demonstra a imagem seguinte. A forma de utilização é simples. Todo usuário começa com o processo 1 ativo e ao clicar no botão "Continuar", ele tem acesso a mais informações sobre aquele processo. Assim que todas as etapas do mesmo forem concluídas, o adotante deve clicar no botão "Concluído" para finalizar um processo. Dessa forma, o processo que foi finalizado passa para a parte de "Etapas concluídas" e o próximo processo passa de "Próximas etapas" para "Etapa atual". Todos os processos presentes em "Próximas etapas" ficam bloqueados até que o processo em andamento seja finalizado. 

Toda essa dinâmica só é possível graças aos dados armazenados no banco de dados. Sempre que um usuário conclui um processo, essa informação é enviada e salva no banco. Dessa forma, as informações do andamento dos processos está sempre segura e o controle de qual processo pode ser acessado se matém lógica e constante. 

![Perfil](imagens/6.jpg "Perfil")

* Notícias

Nesta página os adotantes tem acesso às principais notícias sobre o universo da adoção e têm a possibilidade de serem redirecionados para os sites originais caso queiram ler as matérias completas. A estrutura da página em questão é demonstrada na imagem a seguir:

![Notícias](imagens/7.jpg "Notícias")

* Leis

A página de leis informa aos adotantes quais são as principais leis em vigor com peso sobre o processo de adoção no Brasil, além de uma breve descrições das mesmas e a possibilidade de serem redirecionados para os sites oficiais nos quais as leis estão publicadas, tais como o site do Planalto Federal e do Tribunal de Justiça. Sua interface está ilustrada abaixo:
![Leis](imagens/8.jpg "Leis")

* Vídeos

Como citado anteriormente, a página de vídeos oferece aos usuários acesso a vídeos dentro do tema adoção que podem ser fonte confiável de maiores informações por profissionais da área e pessoas que já passaram pelo processo. Os vídeos podem ser assitidos na própria plataforma A.dota. A interface desta página pode ser observada a seguir:

![Vídeos](imagens/9.jpg "Vídeos")

* Ajuda

É oferecida aos adotantes na página ajuda a possibilidade de entrar em contato direto com a equipe A.dota caso tenham alguma dúvida que não pode ser sanada pelos materiais de apoio - vídeos, notícias, leis, depoimentos, chat social e o chatbot A.Lice - ou caso esteja tendo algum problema com a plataforma. O usuário precisa preencher os campos com nome, email, assunto e a mensagem em si a ser enviada. Ao clicar no botão de envio, o email escrito é enviado altomaticamente para a equipe A.dota, como mostra a imagem que segue:
![Ajuda](imagens/10.jpg "Ajuda")

* Chat Social

Nesta página está presente um chat social onde os adotantes podem conversar entre si, anonimamente ou não, para sanarem suas dúvidas de forma interativa e descontraída. É um recurso que aproxima os adotantes, possibilitando que eles se ajudem e compartilhem vivências, dicas e conhecimentos. Dessa forma a experiência A.dota se torna única e acolhedora.

Além do chat social, esta página também conta com as dúvidas mais frequentes e suas respostas. Assim, o adotante pode solucionar um questionamento sem precisar contatar um profissional, usar o chat social ou perguntar à A.Lice, caso não queira. 

As duas imagens que seguem demonstram as duas partes citadas acima que compõe a página "Chat Social" da plataforma A.dota.
![Chat Social 01](imagens/11.jpg "Chat Social 01")
![Chat Social 02](imagens/12.jpg "Chat Social 02")

* ChatBot 

Recebe atenção especial nesta parte da plataforma, a assistente pessoal da A.dota, - batizada de A.Lice - como pode ser observado na imagem que segue. A.Lice foi criada pela equipe da A.dota com o objetivo de responder dúvidas de participantes do processo adotivo cadastrados no sistema da A.dota com a mesma fluidez de um agente humano do Conselho Nacional de Justiça, encarregado pelo Cadastro Nacional de Adoção. Desta forma, a aplicação poderá assistir diversas famílias em uma quantidade mínima de tempo, assegurando uma resposta com alto nível de acurácia, melhorando a experiência ofertada pela aplicação como um todo.
![ChatBot](imagens/13.jpg "ChatBot")

* Sobre

Esta é a última tela do sistema A.dota. Nela são ofertadas algumas informações básicas sobre a plataforma, seu intuito e concepção, como mostra a imagem a seguir:
![Sobre](imagens/14.jpg "Sobre")



**4. Modelagem de dados**

Para o funcionamento da aplicação, foi necessário uma estrutura que comportasse os dados dos usuários e os respectivos processos pelos quais cada usuários passa até finalizar a adoção. Com esta finalidade, foi criada a base de dados que é conectada diretamente com o site da A.dota, tornando a interação do usuário com o sistema personalizada e funcional.

    4.1. Diagrama de Entidade-Relacionamento
O diagrama abaixo ilustra a estrutura base para o funcionamento do nosso sistema. Nele podemos observar as entidades USUARIO e PROCESSO, que estão ligadas entre si por um relacionamento "realiza", de cardinalidade "1 para n". Dessa forma, um usuário pode realizar vários processos e um processo pode ser realizado por vários usuários.

As entidades PROCESSO e USUARIO estão representadas pelos retângulos. Seus respectivos atributos estão sendo representados pelas pequenas bolas coloridas, sendo que, as com preenchimento azul representam chaves primárias, as com preenchimento verde representam chaves estrangeiras e as sem preenchimento representam atributos normais. O relacionamento "Realiza" (1,n) é representado pelo losango.

![Diagrama de Entidade Relacionamento](imagens/diagramaER.png "Diagrama de Entidade Relacionamento")


**5. Serviços inteligentes**

Neste projeto foi desenvolvido um ChatBot - software capaz de receber mensagens escritas ou por voz, interpretar seu conteúdo e oferecer respostas adequadas - apelidado de A.Lice. Ela tem como objetivo responder dúvidas de participantes do processo adotivo cadastrados no sistema da A.dota com a mesma fluidez de um agente humano do Conselho Nacional de Justiça, encarregado pelo Cadastro Nacional de Adoção. Desta forma, a aplicação poderá assistir diversas famílias em uma quantidade mínima de tempo, assegurando uma resposta com alto nível de acurácia, melhorando a experiência ofertada pela aplicação como um todo.

    5.1 Intelligent Systems Canvas

Para desenvolvimento do ChatBot A.lice, sendo um Sistema Conversacional, foi utilizada a metodologia Intelligent Systems Canvas (IS Canvas), projetado para visualização da proposta da aplicação, como especificado a seguir:

![Intelligent Systems Canvas](imagens/ISCanvas.jpg "IS Canvas")

    5.2 Fluxo de diálogo

A A.Lice foi desenvolvida a partir do Fluxo de Diálogo especificado pela equipe A.dota. A A.Lice conta com entradas de dados sobre adoção retirados de sites e consultas jurídicas, tais como o site do Tribunal Federal de Justiça. Dessa forma, é possível oferecer respostas plausíveis e bem fundamentadas.

Para demonstrar o fluxo de diálogo entre o ChatBot implementado e o usuário, foi utilizada a ferramenta BotMock. Através dela foi possível simular uma conversa entre a A.Lice e um adotante. A imagem a seguir representa o fluxo proposto. Caso tenham dificulade de visualização devido às restrições da imagem, um pdf do mesmo se encontra em: https://github.com/icei-pucminas/ti2-cc-abcl/blob/master/documentacao/FluxoDeDialogo.pdf

![Fluxo de diálogo](imagens/fluxoDialogo.png "Fluxo de diálogo")

    5.3 Implementação

O primeiro passo foi reunir conteúdo para formar a base de dados com a qual o ChatBot iria trabalhar. Para isso foram selecionados, links de sites do governo, - tais como o site do Tribunal Federal de Justiça e do Conselho Nacional de Justiça  - cartilhas com as principais dúvidas, fóruns sobre o tema e outras fontes confiáveis que nos possibilitaram ter informações suficientes para que, através da aplicação QnA Maker, fossem formuladas as perguntas e respostas utilizadas no ChatBot.

A partir deste ponto foi possível criar, através da aplicação Microsoft Azure, o ChatBot que apelidamos de A.Lice. Para proporcionar uma melhor experiência, as perguntas foram sendo testadas e a partir dos resultados, a base foi sendo atualizada e/ou modificada. Assim que resultados satisfatórios foram obtidos, a API da Microsoft Azure responsável pelo ChatBot foi inserida no projeto A.dota.



**6. Avaliação**

Os resgistros de teste foram efetuados seguindo uma lógica de escala, ou seja, os usuários deveriam responder para cada uma das partes que compõem a tabela abaixo, se a experiência foi ruim, razoável, boa, ótima ou excelente. O intuito era medir a satisfação dos adotantes e a facilidade de manuseio da plaforma A.dota.

Como critérios, foram selecionadas as principais partes da plataforma. Cadastro e login no sistema, navegação geral, - facilidade de compreender e utilizar as páginas do sistema, tais como leis, vídeos, notícias e chat social - manutenção dos processos em andamento de acordo com cada usuário, a experiência com nossa assitente pessoal, A.Lice, e finalmente, uma avaliação da plataforma como um todo, contando como foi a utilização de forma geral. Os resultados obtidos estão descritos na tabela abaixo:

| Usuários | Cadastro | Login | Navegação geral| Processos (perfil) | ChatBot | Avaliação final |
| -------- |:--------:|:-----:|:--------------:|:------------------:|:-------:| ---------------:|
| Usuário 01 | Excelente | Excelente | Excelente | Excelente | Excelente | O site esta muito bem estruturado e com um layout agradavel, gostei bastante |
| Usuário 02 | Excelente | Excelente | Ótima | Excelente | Boa | Gostei do jeito como o site controla os processos |
| Usuário 03 | Excelente | Excelente | Ótima | Excelente | Ótima | Gostei muito que a equipe desenvolveu um chatbot |
| Usuário 04 | Excelente | Excelente | Excelente | Ótima | Boa | O sistema é bem interessante e de fácil manuseio. |
| Usuário 05 | Excelente | Excelente | Excelente | Excelente | Ótima | A parte de notícias e a página de home do site estava bem organizado, muito interessante |

**7. Conclusão**

Ao fim deste projeto, a equipe A.dota se encontra satisfeita com os resultados obtidos durante e depois da realização do mesmo. Acreditamos que o tema "morosidade do sistema adotivo" é bastante pertinente e deve ser discutido, afinal, as maiores dificuldades dos adotantes são a falta de informação, descaso dos profissionais da área e a morosidade em si do Sistema Judiciário brasileiro. 

O sistema A.dota, apesar de não atuar diretamente na agilidade de processamento do Judiciário, oferece aos usuários uma experiência personalizada que permite controlar a conclusão das etapas ao decorrer do processo e muito mais. É fonte de informação confiável vinda de diversas outras fontes seguras através de vídeos, depoimentos, acesso à leis, notícias atuais sobre o tema, a experiência de conversar com outros adotantes através do chat social, além de poder contatar nossa equipe e finalmente uma assistente pessoal 100% disponível para responder os questionamentos dos usuários: nosso chatbot, A.Lice.

A experiência de desenvolvimento da plataforma A.dota exigiu do grupo conhecimentos prévios sobre desenvolvimento web, arquitetura de banco de dados e desenvolvimento de sistemas inteligentes. Alguns aspectos foram desafiadores, porém, o resultado final nos parece satisfatório. A equipe A.dota espera que a plataforma possa ser verdadeiramente útil a adotantes reais em sua jornada por uma família.


**REFERÊNCIAS**


**[1.]** - _Littlefield, A. **Guia da metodologia ágil e scrum para iniciantes**. 2016. Disponível em: https://blog.trello.com/br/scrum-metodologia-agil._

**[2.]** - _Gigante, E. A. **Como funciona o processo de adoção no brasil?**. 2018. Disponível em: https://www.politize.com.br/adocao-no-brasil/._

**[3.]** - _Albuquerque, F. **Adoção sempre foi difícil no Brasil, diz advogada**. 2016. Disponível em: https://agenciabrasil.ebc.com.br/direitos-humanos/noticia/2016-10/tema-da-adocao-sempre-foi-dificil-no-brasil-cadastros-dificultam._

**[4.]** - _Pignato, C.; Zanlorenssi, G.; Ostetti, V. **Adoção no Brasil: perfil de crianças e pretendentes e como funciona o processo**. 2018. Disponível em https://www.nexojornal.com.br/grafico/2017/08/11/Ado%C3%A7%C3%A3o-no-Brasil-perfil-de-crian%C3%A7as-e-pretendentes-e-como-funciona-o-processo._

**[5.]** - _Reis, T. **Demora da Justiça faz criança perder chance de adoção, mostra estudo.**. 2015. Disponível em: http://g1.globo.com/bemestar/noticia/2015/06/demora-da-justica-faz-crianca-perder-chance-de-adocao-mostra-estudo.html._

**[6.]** - _Governo de Minas Gerais. **Adotar criança ou adolescente.**. 2020. Disponível em: https://www.mg.gov.br/servico/adotar-crianca-ou-adolescente_

**[7.]** - _Grupo Acesso – Estudos, Pesquisa e Intervenção em Adoção. **Cartilha passo a passo - Adoção de Crianças e Adolescentes no Brasil.**. 2020. Disponível em: https://www.defensoria.pb.def.br/criative/Documentos/Cartilha-adocaopassoapasso.pdf_

**[8.]** - _Corregedoria Nacional de Justiça. **Passo a passo da adoção.**. 2019. Disponível em: https://www.mg.gov.br/servico/adotar-crianca-ou-adolescente_

**[9.]** - _Tribunal de Justiça do Estado de Minas Gerais. **Adoção de crianças e adolescentes.**. 2020. Disponível em: https://www.tjmg.jus.br/portal-tjmg/servicos/adocao.htm#.X72humhKjIV_

**[10.]** - _Tribunal de Justiça do Estado de Minas Gerais. **Passo a passo para adoção, segundo o CNJ.**. 2020. Disponível em: https://www.tjmg.jus.br/portal-tjmg/servicos/passo-a-passo-para-adocao-segundo-o-cnj.htm#.X72hvWhKjIV_

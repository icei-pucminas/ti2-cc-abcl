# A.DOTA


**Anna Pugga Campos Rodrigues, anna.campos@sga.pucminas.br**

**Bárbara Luiza Freitas Carmo, babi.carmo@outlook.com**

**Carlos Henrique Cury Ferreira Lima, chcfl2002@gmail.com**

**Luiza Ribeiro Parente Silva , luizarparentesilva@gmail.com**

---

_Curso de Ciência da Computação, Unidade Coração Eucarístico_

_Instituto de Informática e Ciências Exatas – Pontifícia Universidade de Minas Gerais (PUC MINAS), Belo Horizonte – MG – Brasil_

---

_**Resumo**_ 
_Considerando os trantornos causados pela morosidade atual nos processos de adoção no Brasil, foi de interesse da equipe continuar o desenvolvimento de uma plataforma para controle das etapas, documentações e experiências presentes no decorrer de um processo adotivo. Visa-se facilitar o controle passo a passo do mesmo através de um suporte informativo e interativo sobre quais são os documentos e ações necessários em cada etapa, possibilitando maior controle e organização, além de propor a interação entre adotantes atuais e aqueles que já vivenciaram esta experiência._

---



**1. Introdução**

*A introdução deve apresentar de dois ou quatro parágrafos de contextualização do trabalho.*
 
No país em que vivemos, o acesso a informações confiáveis é muitas vezes dificultado. Este pode ser um problema em contextos extremamente diversos, inclusive no processo de adoção, tendo em vista que muitos dos interessados em adotar não têm suporte suficiente para se orientarem de forma clara.

De acordo com entrevistas realizadas posteriormente e um recente contato com uma advogada especialista, saber quais são os documentos necessário para formalizar uma adoção no Brasil, onde obtê-los e suas funções no processo é algo complicado para os futuros pais e mães. Infelizmente, mesmo depois de tantos anos, as adoções no país continuam sendo demasiadamente burocráticas e demoradas, o que interfere diretamente no sucesso das mesmas. Considerando que a equipe não pode modificar diretamente os processos jurídicos que permeiam a formalização das adoções, foi necessário adotar uma nova perspectiva acerca do problema.  

Desta forma, passou-se a propor um ambiente digital que facilite o acesso às informações necessárias, como, por exemplo, quais são os documentos e onde conseguí-los, juntamente com a possibilidade de um intercâmbio de experiências por meio de um fórum para que quem ainda esteja passando pelo processo consiga tirar dúvidas com quem já o finalizou.


Na **contextualização**, o aluno deve dizer do que se trata o trabalho, em que área ou contexto se insere. 
A **contextualização** deve ser desenvolvida de algo mais genérico para algo mais específico. 
A citação de pesquisas quantitativas é bem aceita aqui (corretamente referenciadas).

Em seguida o aluno deve caminhar a contextualização para descrever o **problema** que o artigo trata. 
O **problema** pode ser algo vivido em uma empresa específica.


    1.1 Contextualização
O projeto se trata de uma plataforma que integra conhecimentos de desenvolvimento web, banco de dados e sistemas inteligentes com o intuito de instruir e facilitar os processos daqueles que pretendem realizar uma adoção. Segundo o Cadastro Nacional de Adoção, em 2019 foram registradas 9.548 crianças e adolescentes estão na fila para a adoção e o número de interessados em adotar é cerca de quatro vezes maior, porém, a morosidade do processo e algumas questões de preferência impedem que estes processos tenham sucesso.

    1.2 Problema
Conforme explicitado, no país em que vivemos, a burocracia e a ineficácia do sistema pelo qual é implementado o processo de adoção acaba forçando esses casais a esperar muito mais tempo do que seria necessário até que consigam algum avanço no procedimento.

Devido à má implementação, ao excessivo tempo de espera, à legislação precária e a muitos outros fatores, os cônjuges que têm a intenção de adotar sofrem com a morosidade do sistema proposto pelo governo brasileiro.

    1.3 Objetivo geral
Frente ao problema salientado, procurou-se utilizar os recursos tecnológicos a disposição para criar um ambiente online que ajude os futuros pais e mães a orientarem-se durante essa jornada burocrática. Ademais, empenhar-se-á na tarefa de oferecer recursos além dos oferecidos pelo programa governamental, permitindo aos usuários o usufruto de artifícios que permitam maior liberdade aos que buscam sucesso na adoção, inserindo-os diretamente no processo, e, permitindo maior transparência no procedimento.

        1.3.1 Objetivos específicos

Apresente também alguns (pelo menos 2) **objetivos específicos** depende
ndo de onde você vai querer concentrar a sua prática investigativa, ou como você vai aprofundar no seu trabalho.

    1.4 Justificativas
Considerando que o Brasil tem atualmente 4,9 mil crianças e adolescentes no sistema de  adoção, de acordo com pesquisa realizada pela Agência Brasil, mas que cada processo iniciado pode demorar anos para ser efetivado, propôs-se a busca por soluções que possam facilitá-los por meio dos conhecimentos da equipe acerca da área de desenvolvimento de software, sistemas inteligentes e banco de dados.


**2. Projeto da Solução**

    2.1. Requisitos funcionais
	
Enumere os requisitos funcionais previstos para a sua aplicação. 
Use a tabela abaixo para enumerá-lo.  Esses requisitos devem estar 
de acordo com as definições do modelo de negócio.

| No.           | Descrição                                         | Prioridade |
| ------------- |:-------------------------------------------------:| ----------:|
| RF-01         | O site apresenta uma versão clássica e outra otimizada especificamente para dispositivos móveis (web app).    | Alta
| ------------- |:-------------------------------------------------:| ----------:|
|               | O site oferece uma plataforma de cadastro, que    |            |
| RF-02         | permite que cada usuário seja direcionado para a  | Alta       |
|               | criação de seu perfil.                            |            |
| ------------- |:-------------------------------------------------:| ----------:|
| RF-03         | O site oferece informações necessárias para o     | Alta       |
|               | processo de adoção.                               |            | 
| ------------- |:-------------------------------------------------:| ----------:|
| RF-04         | O site permite a checagem do andamento do         | Alta       |
|               | processo de adoção de cada usuário.               |            |
| ------------- |:-------------------------------------------------:| ----------:|
|               | O site, por meio das informações disponibilizadas |            |
| RF-05         | pelo usuário, ilustra graficamente a porcentagem  | Alta       |
|               | do andamento do processo.                         |            |
| ------------- |:-------------------------------------------------:| ----------:|
|               | O site apresenta a documentação necessária para   |            |
| RF-06         | cada etapa do processo de adoção, explicando      | Alta       |
|               | cada uma.                                         |            |
| ------------- |:-------------------------------------------------:| ----------:|
| RF-07         | O site indica os locais e os órgãos responsáveis  | Alta       |
|               | pela emissão de cada documento.                   |            |
| ------------- |:-------------------------------------------------:| ----------:|
|               | A cada etapa concluída, o site indica os próximos |            |  
| RF-08         | passos a serem seguidos em relação às             | Alta       |
|               | documentações.                                    |            |  
| ------------- |:-------------------------------------------------:| ----------:|
| RF-09         | O site apresenta veículos de comunicação em que   | Baixa      |
|               | o usuário pode expressar dúvidas.                 |            |
| ------------- |:-------------------------------------------------:| ----------:|
|               | O site permite que o usuário crie uma listagem    |            |
| RF-10         | personalizada de compromissos relacionados        | Baixa      |
|               | à adoção                                          |            |


    2.2. Tecnologias

.   Linguagens de desenvolvimento web front-end: HTML, CSS, PHP e JavaScript;
.   Linguagens de desenvolvimento back-end: Java;
.   Repositório: GitHub; 
·   Frameworks: Bootstrap, MDB e Spark;
.   Integração BD com o site: Eclipse, Maven e PostgreSQL;
·   Service Worker para permitir ao smartphone reconhecer o site como app;
.   Microsoft Azure;
·   IDE: Microsoft Visual Studio Code.

Apresente também uma figura explicando como as tecnologias estão 
relacionadas ou como uma interação do usuário com o sistema vai ser conduzida, por onde ela passa até 
retornar uma resposta ao usuário. 

    2.3. Serviços inteligentes

Descreva o mecanismo de inteligência que será utilizado no seu sistema. Utilize a modelagem baseada em agente
para definir as entradas e saídas do seu módulo de serviço inteligente. Apresente quem irá fornecer o serviço
e em que módulo será utilizado.

	
**3. Modelagem de dados**

Apresente o modelo de dados. Defina o dicionário de dados com os respectivos formatos e significados.

    3.1. Diagrama de Entidade-Relacionamento

Apresente a estrutura das tabelas de banco de dados no modelo Diagrama de Entidade-Relacionamento. 
A Seguir, segue um exemplo de imagem adicionada ao documento.

![Diagrama de Entidade Relacionamento de Exemplo](imagens/er_diagram.png "Diagrama de Entidade Relacionamento de Exemplo")

**4. Sistema desenvolvido**

Faça aqui uma breve descrição do software e coloque as principais telas com uma explicação de como usar cada uma.

**5. Avaliação**

Faça aqui sobre a avaliação do software. Indique se ele atendeu as expectativas e ele é viável. 
Para não ficar subjetivo, o ideal é fazer um questionário e pedir ao usuário do processo que faça a avaliação.

**6. Conclusão**

Apresente aqui a conclusão do seu trabalho. Discussão dos resultados obtidos no trabalho, onde se verifica as 
observações pessoais de cada aluno. Poderá também apresentar sugestões de novas linhas de estudo.  


**REFERÊNCIAS**


**[1.1]** - _ELMASRI, Ramez; NAVATHE, Sham. **Sistemas de banco de dados**. 7. ed. São Paulo: Pearson, c2019. E-book. ISBN 9788543025001._

**[1.2]** - _COPPIN, Ben. **Inteligência artificial**. Rio de Janeiro, RJ: LTC, c2010. E-book. ISBN 978-85-216-2936-8._

**[1.3]** - _CORMEN, Thomas H. et al. **Algoritmos: teoria e prática**. Rio de Janeiro, RJ: Elsevier, Campus, c2012. xvi, 926 p. ISBN 9788535236996._

**[1.4]** - _SUTHERLAND, Jeffrey Victor. **Scrum: a arte de fazer o dobro do trabalho na metade do tempo**. 2. ed. rev. São Paulo, SP: Leya, 2016. 236, [4] p. ISBN 9788544104514._

**[1.5]** - _RUSSELL, Stuart J.; NORVIG, Peter. **Inteligência artificial**. Rio de Janeiro: Elsevier, c2013. xxi, 988 p. ISBN 9788535237016._

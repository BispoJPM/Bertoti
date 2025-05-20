<div style="text-align: center;" align="center">
  <h2> Olá, Me chamo João Pedro! :wave: </h2>
</div>
 

<img align="left" src="https://github.com/user-attachments/assets/55824b8e-c777-44f4-8b13-cc32f11dd1da" width="200" style="margin-right: 20px;">
<br>
Sou técnico formado em Administração pela ETEC Machado de Assís e atualmente atuo como Auxiliar do Controle Interno na Força Aérea Brasileira. Estou em transição de carreira para a área de tecnologia, cursando: 
<br><br>
• 🧑‍💻 Banco de Dados na Fatec Jessen Vidal <br> 
• 🧑‍💻 Análise e Desenvolvimento de Sistemas na Unifatecie  

<br><br><br>

### Contatos 📫

<a href="https://github.com/BispoJPM/BispoJPM" target="_blank"><img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"></a>
<a href="https://www.linkedin.com/in/jo%C3%A3o-pedro-563369181/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn"></a>

### Meus Principais Conhecimentos 💻

- Foco atual: **Java** e **MySQL** (desenvolvimento de aplicações e gestão de bancos de dados).
- Experiência básica: Python e C++.

#

## Em 2024-2:

- *O projeto desenvolvido foi uma **Ferramenta de Captura e Armazenamento de Notícias Estratégicas e Dados Relevantes Associados**.*

### Empresa Parceira: GSW

- *A GSW é uma empresa especializada no desenvolvimento de soluções tecnológicas voltadas para gestão empresarial, automação e inovação digital. Com expertise na área de software, a empresa se destaca pelo desenvolvimento de sistemas robustos e escaláveis que facilitam a gestão de informações e processos.*

### Problema proposto:

- *Atualmente, há uma dificuldade em coletar, armazenar e organizar notícias de fontes diversas para análise estratégica. Empresas e pesquisadores enfrentam desafios para consolidar dados provenientes de portais de notícias, APIs e outras fontes de informação. A ausência de uma ferramenta centralizada para realizar web scraping e categorização de notícias dificulta a extração de insights relevantes.*

### Solução Desenvolvida:

- *A equipe desenvolveu uma aplicação web utilizando Java Spring Boot no backend e um banco de dados relacional para armazenar os dados extraídos. A solução implementa um sistema de web scraping para capturar notícias de portais cadastrados, além de permitir a integração com APIs externas para coleta de informações.*

## Principais Funcionalidades: 🛠️

| Cadastro de Portais | Cadastro de APIs | Cadastro de Tags |
|---------------------|------------------|------------------|
| <img src="https://github.com/user-attachments/assets/17f3bab6-08e7-4da6-9bd4-542c5d5999e8" width="300"> | <img src="https://github.com/user-attachments/assets/3e002120-dea8-4653-bde1-63e9f6aafc2b" width="300"> | <img src="https://github.com/user-attachments/assets/9aae651f-224a-4d18-aa88-05e6c6a5a5c6" width="300"> |

| Consulta de Notícias | Consulta de APIs  | 
|----------------------|-------------------|
| <img src="https://github.com/user-attachments/assets/bbf94c1d-7818-4a3f-8d29-87ea39ac53bd" width="300"> | <img src="https://github.com/user-attachments/assets/40e9a386-24c9-44b1-9a96-6a0afd7b633d" width="300"> |

  - ⚡ Web Scraping</strong> - Captura automática de notícias diretamente dos portais cadastrados
  - 🗃️ Gestão de Dados</strong> - Armazenamento estruturado com consultas otimizadas
    
#

## Tecnologias Utilizadas 🛠️

| Categoria       | Tecnologia                                                                                                                                                                                                                                           | Descrição                                                            |
|-----------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|
| **Backend**     |![Java](https://img.shields.io/badge/Java-22-%23ED8B00?logo=openjdk) <br/> ![Spring](https://img.shields.io/badge/Spring_Boot-3.3.3-%236DB33F) <br/> ![JPA](https://img.shields.io/badge/JPA-3.3.3-%236DB33F) | Linguagem principal com robustez e desempenho<br/>Framework para construção da aplicação web<br/>Persistência eficiente com MySQL | 
| **Frontend**    |![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-%23005F0F)                                                                                                                                                                         | Renderização dinâmica de páginas HTML                                                                                             |
| **Banco de Dados** |![MySQL](https://img.shields.io/badge/MySQL-8.0-%234479A1)                                                                                                                                                                                    | Armazenamento estruturado de notícias                                                                                             |
| **Ferramentas** |![Jsoup](https://img.shields.io/badge/Jsoup-1.16-%2300599C)                                                                                                                                                                                 | Web scraping em portais de notícias  

#

## Contribuições Pessoais ✨

*Durante minha participação no projeto, atuei ativamente na otimização e desenvolvimento de funcionalidades essenciais, focadas principalmente na melhoria da consulta de notícias, padronização do banco de dados e refinamento das regras de negócio. Minhas principais contribuições incluem:*

### 🔍 Refinamento da busca de notícias por tags
> Implementei filtros personalizados no endpoint de listagem de notícias, permitindo que o sistema filtrasse as notícias com base nas tags associadas ao portal selecionado. Isso foi feito utilizando lógica condicional no serviço, respeitando a presença ou ausência de parâmetros de filtro, tornando a busca mais flexível e intuitiva para o usuário. Essa melhoria aumentou a relevância dos resultados retornados pela API e deixou a navegação mais precisa.

### 📅 Organização da ordenação das notícias
> Modifiquei a ordenação padrão das notícias retornadas pela API para que fossem exibidas com base na data de inclusão no banco de dados, em ordem decrescente. Essa alteração foi feita diretamente no repositório JPA, garantindo que as notícias mais recentes fossem sempre exibidas primeiro. Essa abordagem melhorou a organização visual e a utilidade prática da listagem para o usuário final.

### 🛑 Correção e padronização de mensagens de erro
> Implementei melhorias no tratamento de exceções, criando mensagens de erro mais claras, consistentes e amigáveis ao usuário. Corrigi respostas genéricas e pouco descritivas, e tratei casos como ausência de dados, falhas de validação ou erros de requisição com mensagens específicas, utilizando @ExceptionHandler e respostas com ResponseEntity. Isso trouxe maior confiabilidade e compreensão ao comportamento da API.

### ⚙️ Otimização dos filtros da API
> Realizei melhorias no desempenho de consultas da API, especialmente nos pontos de busca por notícias com filtros. Isso incluiu a revisão de consultas no banco, evitando loops desnecessários e refinando os métodos para utilizar consultas derivadas do Spring Data JPA. Com isso, a API passou a responder de forma mais eficiente mesmo com volume maior de dados.

### 🗃️ Reestruturação do banco de dados
> Atuei na reorganização das entidades e dos relacionamentos entre elas, com o objetivo de tornar a estrutura mais coerente, relacional e aderente às regras de negócio. Refatorei relações entre Portal, Noticia e Tag, garantindo integridade referencial e eliminando redundâncias. Também revisei as entidades e repositórios para refletir corretamente os novos relacionamentos e restrições.

### 🌐 Web Scraping com Jsoup
> Implementei o processo de extração de notícias externas utilizando a biblioteca Jsoup, integrando essa funcionalidade ao método de scraping da aplicação. Isso permitiu buscar e processar dados de páginas HTML com mais controle sobre os elementos extraídos. Estruturei a coleta de informações como título, conteúdo e link da notícia, tratando as exceções e salvando os dados em formato padronizado no banco.

### 📏 Padronização das colunas do banco
> Trabalhei na padronização e normalização dos dados nas entidades do banco, garantindo que campos como nomes de portais, tags e datas fossem inseridos em formato consistente. Essa prática evitou duplicidade lógica de registros e facilitou tanto a busca quanto a exibição das informações, contribuindo para uma base de dados mais limpa e confiável.

## Hard Skills

| Habilidade Técnica       | Proeficiência | Contribuições Específicas                                             |
|--------------------------|---------------|-----------------------------------------------------------------------|
| **Java/Spring Boot**    | Iniciante +           | • Desenvolvimento e otimização de filtros na API para busca de notícias por tags       |
| **Banco de Dados <br/>(MySQL)**       | Iniciante           | • Reconfiguração da estrutura do banco para melhor integridade dos dados                    |
| **Web Scraping<br/>(Coleta de Dados)**      | Iniciante            | • Desenvolvimento de soluções para extração automática de notícias         |
| **Front-end (Thymeleaf)**| Iniciante            | • Melhorias na exibição das mensagens de erro para maior clareza ao usuário              |

## Soft Skills

-  🤝 **Trabalho em equipe:** 
> Durante o desenvolvimento do projeto, participei ativamente da divisão de tarefas e da tomada de decisões em grupo. A necessidade de integrar diferentes partes do sistema, como o backend da API, o web scraping e o banco de dados, exigiu alinhamento constante com os colegas. Essa colaboração me ajudou a entender melhor como respeitar diferentes visões, negociar prioridades e garantir que as funcionalidades se complementassem de forma fluida.

-  🗣️ **Comunicação:** 
> Ao longo do projeto, frequentemente compartilhei descobertas técnicas, apresentei soluções para problemas enfrentados e ofereci suporte aos colegas em dúvidas relacionadas a filtros, lógica de negócio e estrutura do banco. A prática constante de explicar minhas abordagens, seja em reuniões, mensagens ou revisões de código, aprimorou minha capacidade de me comunicar de forma clara e objetiva, mesmo em tópicos mais técnicos.

-  🧠 **Resolução de problemas:** 
> Me deparei com desafios concretos, como melhorar o desempenho das consultas SQL e otimizar o web scraping utilizando a biblioteca Jsoup. Esses problemas exigiram análise detalhada, testes e refatorações. Foi nesse contexto que desenvolvi minha habilidade de investigar causas, testar hipóteses e aplicar soluções eficazes, pensando tanto na eficiência do sistema quanto na escalabilidade.

-  📚 **Autodidatismo:** 
> Muitas das melhorias que implementei — como a padronização das colunas do banco, filtros dinâmicos por tags ou ajustes finos no scraping — exigiram aprendizado além do que eu já dominava. Em vez de depender apenas de instruções, busquei documentações, fóruns e exemplos práticos por conta própria. Essa autonomia foi essencial para acompanhar o ritmo do projeto e entregar soluções com agilidade.

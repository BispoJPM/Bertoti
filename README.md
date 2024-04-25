# Engenharia de Software<br>

## Aula 1 - 19/02: Atividade 1
Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

Comentário: A engenharia de software é algo que caminha mutuamente com o desevolvimento do projeto, precisamos de estar mais preocupados com a escala e a eficiência, tanto para o software que produzimos como para a organização que o produz.

### O que é engenharia de software?
R: É algo que precisamos para desenvolver, gerir e manutenciar um aplicativo/projeto <br>

## Aula 2 - 23/02:

Debate

## Aula 3 - 26/02: Atividade 2

De 3 exemplos de trade-off em softwares e explicá-los.

1. Entre otimização de desempenho e consumo de recursos: Muitas vezes é necessário fazer um trade off entre a melhoria no desempenho do programa e o aumento no consumo de recursos do sistema. Por exemplo, aumentar o número de threads em um programa pode melhorar a velocidade de processamento, mas também pode aumentar o uso de memória e CPU.

2. Entre segurança e usabilidade: Implementar medidas de segurança mais rigorosas e manter a facilidade de uso para os usuários. Por exemplo, exigir senhas complexas e autenticação de dois fatores pode aumentar a segurança de um sistema, mas também pode tornar o processo de login mais complicado para os usuários.

3. Entre rapidez no desenvolvimento e qualidade do código: Por vezes, é necessário escolher entre desenvolver um software rapidamente para atender a prazos apertados ou dedicar mais tempo para escrever um código mais limpo e de melhor qualidade. A pressa pode resultar em possíveis bugs e problemas de manutenção no futuro, enquanto a qualidade pode levar mais tempo para ser alcançada.

## Aula 4 - 01/03: Atividade 3

Arquitetura: Layered Architecture Style
Exemplo: Uma interface de usuários do facebook.
Justificativa: Desenvolver uma interface desse tipo para que não requeira nenhuma ou quase nenhuma experiencia do usuario final, com um design e simplicidade elevados, demanda um alto custo de investimento.

Arquitetura: Pipeline Architecture Style
Exemplo: Desenvolvimento de um sistema de processamento de dados.  
Justificativa: Como essa arquitetura é dividida em estagios, podemos fazer alguns aos mesmo tempo e acabar acelerando o processo.

Arquitetura: Microkernel Architecture Style
Exemplo: Um sistema de menu geral.
Justificativa: O nucleo do software não é mostrado, apenas os serviços adicionais, para redirecionamento para abas e afins.

Arquitetura: Service-Based Architecture Style
Exempo: Aplicativo de delivery de comida.
Justificativa: Em um unico aplicativo, os recursos são independentes um do outro, então podemos fazer pedidos, alterar entre os restaurantes e afins, a rapidez na parte da comunicação e independencia dos componentes é algo que essa arquitetura tem.

Arquitetura: Event-Driven Architecture Style
Exemplo: Notficação em tempo real.  
Justificativa: Podemos garantir que os dados estejam sempre atualizados em todas as partes do sistema, porém pode limitar a escabilidade do sistema.Para não limitar podemos fazer com que o sistema lide com um grande volume de eventos de forma mais eficiente.

Arquitetura: Microservices Architecture
Exemplo: Plataforma E-Commerce
Justificativa: A flexibilidade traz benefícios em termos de agilidade e escalabilidade, mas a complexidade pode impactar negativamente a manutenção e a compreensão do sistema.

## Aula 5 - 04/03

Continuação da Atividade 3.

Arquitetura: Layered Architecture Style
Exemplo: Sistema de Gestão de Biblioteca
Vantagem: **Eficiência:** O sistema deve ser capaz de lidar com um grande volume de transações simultâneas de forma eficiente, mantendo baixo tempo de resposta para os usuários.
Desvantagem: **Manutenibilidade:** O sistema deve ser facilmente extensível e modificável por desenvolvedores sem a necessidade de documentação ou treinamento adicional.

Arquitetura: Pipeline Architecture Style
Exemplo: Sistema de Análise de Dados em Tempo Real
Vantagem: **Escalabilidade:** O sistema deve ser capaz de lidar com o aumento do volume de dados processados no pipeline, garantindo que o desempenho não seja comprometido conforme mais dados são processados.
Desvantagem: **Flexibilidade:** O sistema deve ter a capacidade de alterar a ordem das etapas do pipeline de forma dinâmica, sem a necessidade de intervenção manual ou reinicialização do sistema.

Arquitetura: Microkernel Architecture Style
Exemplo: Plataforma de E-commerce Modular
Vantagem: **Desacoplamento:** Os módulos do sistema devem ser altamente desacoplados, permitindo que as alterações em um módulo não afetem diretamente os demais. Isso facilita a manutenção e evolução do sistema.
Desvantagem: **Desempenho Absoluto:** O sistema deve garantir o melhor desempenho possível em todas as situações, sem comprometer em nenhum momento a velocidade de processamento.

Arquitetura: Service-Based Architecture Style
Exemplo: Plataforma de Streaming de Vídeo
Vantagem: **Escalabilidade:** A arquitetura deve ser capaz de escalar horizontalmente, permitindo que novos serviços sejam adicionados e dimensionados de forma independente, garantindo o desempenho adequado do sistema.
Desvantagem: **Otimização Extrema:** Todos os serviços devem ser otimizados ao máximo, mesmo que isso demande um esforço significativo e gere complexidade desnecessária no desenvolvimento.

Arquitetura: Event-Driven Architecture Style
Exemplo: Plataforma de Gestão de Eventos
Vantagem: **Resiliência:** A arquitetura deve ser resiliente, permitindo que o sistema se recupere automaticamente de falhas de comunicação entre os eventos e garanta a integridade dos dados em caso de eventos perdidos ou atrasados.
Desvantagem: **Complexidade Extrema:** As interações entre os eventos devem ser extremamente complexas e intricadas, mesmo que isso torne a manutenção e o entendimento do sistema mais difíceis para os desenvolvedores.

Arquitetura: Microservices Architecture
Exemplo: Plataforma de Delivery de Alimentos
Vantagem: **Escalabilidade:** A arquitetura deve permitir que os microserviços sejam escalados de forma independente, facilitando o gerenciamento da carga de trabalho e garantindo o desempenho adequado do sistema conforme o número de usuários aumenta.
Desvantagem: **Excesso de Microserviços:** Cada pequena funcionalidade do sistema deve ser implementada como um microserviço separado, mesmo que isso gere uma sobrecarga na comunicação entre os serviços e aumente a complexidade geral da arquitetura.


## Aula 6 - 11/03: Atividade 4

Sistema: Spotify
Arquitetura: Microservices Architecture
Trade-Offs:

Performance: O Spotify precisa garantir alta performance em termos de tempo de carregamento de músicas e reprodução sem interrupções. Isso pode resultar em um consumo maior de recursos do sistema e uma possível diminuição da autonomia da bateria do dispositivo.

- Segurança: Para proteger os dados dos usuários contra possíveis ataques cibernéticos e garantir a integridade das informações, o Spotify pode precisar implementar medidas de segurança adicionais, como criptografia de dados e autenticação de dois fatores. Isso pode afetar a velocidade de acesso à plataforma.
- Confiabilidade: Para garantir que o serviço do Spotify seja sempre disponível para os usuários, a plataforma pode precisar investir em infraestrutura de redundância e sistemas de backup. Isso pode resultar em um aumento nos custos operacionais e na complexidade da manutenção da plataforma.
- Escalabilidade: Com o aumento constante do número de usuários e do volume de dados gerados, o Spotify pode precisar garantir que sua plataforma seja escalável para lidar com o crescimento da demanda. Isso pode exigir investimentos em servidores adicionais e tecnologias de escalonamento horizontal, o que pode aumentar os custos de operação.
- Usabilidade: Para oferecer uma experiência de usuário intuitiva e fácil de usar, o Spotify pode precisar investir em design de interface de usuário e testes de usabilidade. Isso pode resultar em um esforço adicional de desenvolvimento e alocar recursos que poderiam ser utilizados em outras atividades.

## Atividade 5: Diagrama de Classe.

Spotify: Playlist - Usuarios - Musicas

<img width="465" alt="image" src="https://github.com/BispoJPM/Bertoti/assets/142633184/07a28b8c-a0c7-46b4-8f5d-54cd0fcad642">

![image](https://github.com/BispoJPM/Bertoti/assets/142633184/163edaa4-e476-4cf3-ba00-cc21eb96ba8e)













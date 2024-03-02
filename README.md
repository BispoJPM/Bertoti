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






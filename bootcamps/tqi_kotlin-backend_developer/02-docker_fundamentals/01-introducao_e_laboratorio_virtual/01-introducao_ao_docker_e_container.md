# Docker Fundamentals

## Apresentação do Curso

Apresentado por Denilson Bonatti

Tech Lead DIO

[This is a comment in Markdown and will be hidden]: #
[LinkedIn: <a href="https://www.linkedin.com/in/denilsonbonatti/" target="_blank">Denilson Bonatti</a>]: #
LinkedIn: [Denilson Bonatti](https://www.linkedin.com/in/denilsonbonatti/)

## Modelo Cliente-Servidor

O modelo cliente-servidor é uma estrutura de aplicação que distribui as tarefas e cargas de trabalho entre os fornecedores de um recurso ou serviço, designados como servidores, e os requerentes dos serviços, designados como clientes.

## Cloud

A cloud computing é o acesso sob demanda, via internet, a recursos de computação = aplicativos, servidores (físicos e virtuais), armazenamento de dados ferramentas de desenvolvimento, recursos de rede e muito mais = hospedados em um data center remoto gerenciado por um provedor de serviços em cloud (Cloud Solution Porvider). O CSP disponibiliza esses recursos por uma assinatura mensal ou por um valor **cobrado conforme o uso**.

Fonte: <https://www.ibm.com/br-pt/cloud/learn/cloud-computing>

## Exemplos de Data Centers

- **Data Center Google:** <https://www.youtube.com/watch?v=zDAYZU4A3w0&t=126s>
- **Data Center Locaweb:** <https://www.youtube.com/watch?v=jQx6wItPuSo>
- **Data Center da Microsoft (no fundo do mar???)** <https://www.youtube.com/watch?v=ewLJ2w3KNcU>

## Virtualização

A virtualização utiliza software para criar uma camada de abstração sobre o hardware do computador, permitindo que os recursos de hardware de um único computador (processadores, memória, armazenamento, etc) sejam divididos em vários computadores virtuais.

### Softwares de Virtualização

- VMware (*Linha do Tempo*): <https://www.vmware.com/br/timeline.html>
- Microsoft Hyper-V: <https://docs.microsoft.com/pt-br/windows-server/virtualization/hyper-v/hyper-v-technology-overview>

## Microsserviços

Microsserviços são uma abordagem arquitetônica e organizacional do desenvolvimento de software na qual o software consiste em pequenos serviços independentes que se comunicam usando APIs bem definidas. Esses serviços pertencem a pequenas equipes autossuficientes.

As arquiteturas de microsserviços facilitam a escalabilidade e agilizam o desenvolvimento de aplicativos, habilitando a inovação e acelerando o tempo de introdução de novos recursos no mercado.

Fonte: <https://aws.amazon.com/pt/microservices/>

> "Hoje, gigantes do mercado como Netflix e Spotify, divulgam a receita do sucesso ao transformar suas aplicações monolíticas em mais de 500 microsserviços."

Quando quebramos uma aplicação monolítica em várias pequenas partes, conseguimos escalá-las de forma separada.

Supondo que um serviço de autenticação seja chamado várias vezes durante a sessão de um usuário, com certeza o stress sobre ele é maior.

## Container

### O que é um container

Os contêineres são uma tecnologia usada para reunir um aplicativo e todos os seus arquivos necessários em um ambiente de tempo de execução. Como uma unidade, o contêiner pode ser facilmente movido e executado em qualquer sistema operacional, em qualquer contexto.

Fonte: <https://www.hpe.com/br/pt/what-is/containers.html#>

## Docker

### O que é Docker

Com o Docker, é possível lidar com os containers como se fossem máquinas virtuais modulares e extremamente leves. Além disso, os containers oferecem maior flexibilidade para você criar, implantar, copiar e migrar um container de um ambiente para outro. Isso otimiza as aplicações em nuvem (privada e pública).

## Qual é a Diferença Entre Virtualização e os Containers?

As duas tecnologias são distintas, porém, complementares. Veja uma maneira fácil de distinguir ambas:

- Com a **virtualização**, é possível executar sistemas operacionais (Windows ou Linux) simultaneamente em um único sistema de hardware.
- Os **containers** compartilham o mesmo kernel do sistema operacional e isolam os processos da aplicação do restante do sistema. Os containers Linux são extremamente portáteis, mas devem ser compatíveis com o sistema subjacente.

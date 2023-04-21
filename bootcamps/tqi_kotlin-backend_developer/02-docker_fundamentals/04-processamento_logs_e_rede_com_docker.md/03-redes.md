# Redes

Utilizando o comando `ip a`, você obtem informações sobre as redes e os respectivos IPs.

O comando `docker network --help` te retorna a lista de comandos disponíveis para trabalhar com redes.

Para obter a lista de redes disponíveis, utilize o comando `docker network ls`.

Inicialmente, são encontradas 3 redes disponíveis:

- bridge - É utilizada por todos os containers que são criados, para se comunicar com a rede *host*.
- host
- none

Para ver as propriedades e informações de uma rede, utilize o comando `docker network inspect <"nome-da-rede">`

Exemplo:

`docker network inspect bridge`

Ao criar um container, se você não especifica a rede a ser utilizada por ele, a rede *bridge* adicionada automaticamente.

Nas informações da rede, é possível ver que cada container recebe um IP.

A seguir, vamos realizar alguns testes de comunicação utilizando a rede.

Crie 2 containers ubuntu com os nomes Ubuntu-A e Ubuntu-B com execução em segundo plano.

`docker run --name Ubuntu-A -dti ubuntu`

`docker run --name Ubuntu-B -dti ubuntu`

Com o comando `docker exec -ti <"ID"|"Nome-do-Container"> bash`, execute o *bash* do container ubuntu.

`docker exec -ti Ubuntu-A bash`

Execute o *update* com o comando `apt-get update` e aguarda a finalização da atualização do container.

Utilize o comando `apt-get install -y iputils-ping` para instalar a ferramenta *ping*, utilizada para testes de rede.

Com o *ping* instalado, utilize o comando `ping <"IP-container">` para realizar o teste. Utilize o IP do container Ubuntu-B.

Exemplo:

`ping 172.17.0.4`

Observe que há retorno dos testes de comunicação.

Saia do container utilizando o comando `exit`.

## Separando containers por rede

Antes de continuar, remova os containers criados com o comando `docker rm -f <"ID"|"Nome-do-Container">`, como no exemplo:

`docker rm -f Ubuntu-A Ubuntu-B`

Crie uma nova rede utilizando o comando `docker network create <"nome-rede">`. Dê o nome de *minha-rede*.

`docker network create minha-rede`

Uma nova rede é criada e, automaticamente, é criada também uma sub-rede (Subnet).

Para verificar as informações da rede criada, utilize o comando `docker network inspect minha-rede`.

Em seguida, vamos criar 2 containers do ubuntu. Porém, desta vez vamos especificar a rede que irão utilizar. A mesma que acabamos de criar.

`docker run -dti --name Ubuntu-A --network minha-rede ubuntu`

`docker run -dti --name Ubuntu-B --network minha-rede ubuntu`

Verifique novamente as informações da rede e veja que está sendo utilizada pelos 2 containers criados.

Anote o IP que foi gerado para cada container.

Execute o *bash* do Ubuntu-A.

`docker exec -ti Ubuntu-A bash`

Execute o update e instale o *ping*.

Para executar os testes de comunicação, utilize o comando `ping <"IP-container">`. Como você está utilizando o container *Ubuntu-A*, informe o IP do container *Ubuntu-B* para o primeiro teste.

`ping 172.18.0.3`

Em seguida, utilize o mesmo comando mas, desta vez, informando o IP de um container de outra rede e veja o resultado.

O exemplo abaixo utiliza o IP de um container ubuntu, chamado *ubuntu-C*, que está utilizando a rede padrão *bridge*:

`ping 172.17.0.2`

Note que, os dois containers criados foram *isolados* utilizando uma rede própria para a comunicação entre eles.

Saia do *bash* do Ubuntu-A utilizando o comando `exit`.

Para remover uma rede, é necessário que não esteja sendo utilizada por nenhum container que esteja em execução. Se tiver, é necessário parar ou remover o(s) container(s) que estiverem em execução para poder remover a rede.

`docker network rm minha-rede`

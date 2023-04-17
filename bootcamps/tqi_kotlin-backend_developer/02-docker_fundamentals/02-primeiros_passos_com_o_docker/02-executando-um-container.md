# Executando Um Container

Exemplo de execução de um container utilizando a imagem do Ubuntu:

- Para baixar a imagem:

$ `docker pull ubuntu`

- Para executar o container:

$ `docker run ubuntu`

- Para ver os containers em execução:

$ `docker ps`

- Para ver os containers executados recentemente e os que ainda estão em execução:

$ `docker ps -a`

- Para executar um container durante um tempo determinado:

$ `docker run ubuntu sleep 10`

O comando acima executa o container Ubuntu durante 10 segundos.

Quando um container está em execução, o cursor do terminal fica "travado" até que a execução do container seja finalizada.

- Para parar a execução de um container, você pode utilizar o comando abaixo informando o ID ou o nome (Name) do container. O nome do container é criado automaticamente quando você não informa nenhum na criação.

$ `docker stop <"id"/"Nome">`

Obs.: Você deverá abrir uma nova janela Terminal para realizar comando o comando acima.

Executando um container em modo interativo, permite que você interaja com o mesmo.
Para executar um container em modo interativo, utilize o seguinte comando:

$ `docker run -it ubuntu`

Quando você está em modo interativo, observe que o nome do usuário do terminal é modificado.

Para se certificar que você está dentro do container *ubuntu*, experimente o comando que traz as informações de lançamento:

\# `cat /etc/*release*/`

# Executando Aplicações no Container

Para executar aplicações dentro do container, utilize o comando:

$ `docker run -dti ubuntu`

Se você executar o comando *docker ps*, irá verificar que o container está em execução.

$ `docker ps`

Para abrir o container e realizar operações dentro dele, utilize o comando *docker exec -it* + o nome ou id do container. Caso utilize o ID do container, basta digitar os 3 primeiros digitos (desde que não existam outros containers com mesma numeração inicial).

$ `docker exec -it <"ID"|"Name"> /bin/bash`

Já dentro do container do Ubuntu, é necessário realizar a atualização dos repositórios.

\# `apt update`

Após a atualização, realize um *upgrade*.

\# `apt upgrade -y`

Em nosso exemplo, vamos realizar a instalação do *nano* no Ubuntu.

\# `apt -y install nano`

Para testar a aplicação que acabou de instalar, digite *nano arquivo.txt*.

Para sair do container digite *exit*.

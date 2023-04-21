# Exemplos de Tipos de Mount na Prática

Para exemplificar os tipos de *mount*, primeiramente, como usuário ***root***, crie 4 diretórios na pasta */data*, utilizando os seguintes comandos:

- `mkdir apache-A`
- `mkdir debian-A`
- `mkdir mysql-A`
- `mkdir php-A`

Dentro da pasta *debian-A*, crie 2 arquivos com os segintes comandos:

- `touch arquivo1.txt`
- `touch arquivo2.txt`

## Exemplo 1

Utilizando o comando *docker run*, podemos executar um container em segundo plano (-dti) especificando o tipo de *mount*, como no exemplo abaixo:

`docker run -dti --mount type=bind,src=/data/debian-A,dst=/data debian`

É interessante notar que, caso a imagem do *debian* não tenha sido baixada anteriormente, é feito o download no momento da execução do comando.

Após criar o container, utilize o comando `docker exec -ti <"ID"|"Nome do Container" bash` para acessá-lo.

Com o comando `ls -l`, verifique que a pasta que foi definida no momento de criação do container está presente no container juntamente com seus arquivos.

Acesse a pasta com o comando `cd data/` e, dentro dela, crie mais um arquivo chamado *arquivo3.txt* com o comando `touch arquivo3.txt`.

Caso queira conferir se o o arquivo foi criado, utilize o comando `ls -l`.

Saia do container com o comando `exit`.

Agora acesse a pasta *debian-A* que está dentro da pasta *data/* e veja que o arquivo criado dentro do container também foi salvo dentro dela.

`cd /data/debian-A/`

Para finalizar, pare o container *debian* em execução com o comando `docker stop <"ID"|"Nome do Container"`.

Para criar um container onde não seja permitido alterar arquivos, adicione a tag `ro` no comando de execução do container.

`docker run -dti --mount type=bind,src=/data/debian-A,dst=/data,ro debian`

Acesse container e a pasta */data* e tente remover o arquivo criado.

`docker exec -ti <"ID"|"Nome do Container"> bash`

`cd /<"dir">`

`rm <"nome-do-arquivo">.<"extensão-do-arquivo">`

Não é permitido criar ou excluir arquivos por se tratar de um container *apenas leitura* (read only).

Saia do container utilizando o comando `exit`.

## Exemplo 2

Para verificar volumes existentes, utilize o comando `docker volume ls`. Existem volumes que são criados automaticamente pelo Docker para gerenciamento de seus arquivos.

Para criar um novo *volume*, utilize o comando `docker volume create <"nome-volume">` como no exemplo:

`docker volume create data-debian`

Os volumes criados são encontrados dentro da pasta padrão do docker no caminho */var/lib/docker/*.

Acesse a pasta para ver seu conteúdo.

`cd var/lib/docker/`

Dentro da pasta *docker* se encontra a pasta *volumes*. Para acessá-la, utilize o comando `cd volumes`.

Para acessar o volume criado, utilize o comando `cd data-debian/`.

Dentro do volume *data-debian* exite uma pasta vazia chamada *_data* que será utilizada para gerenciar os arquivos criados.

Utilizando o comando `touch <"nome-do-arquivo">.<"extensão-do-arquivo">`, crie 2 arquivos.

Exemplo:

`touch arquivo1.txt`

`touch arquivo2.txt`

Em seguida, para criar um novo container, utilize o comando abaixo:

`docker run -dti --name debian-A --mount type=volume,src=data-debian,dst=data debian`

Após criar o container, execute o *bash* com o comando:

`docker exec -ti debian-A bash`

Verifique o conteúdo do container com o comando `ls`.

Acesse a pasta *data* utilizando o comando `cd data/` e, em seguida, verifique seu conteúdo com o comando `ls`.

Dentro da pasta, crie mais um arquivo utilizando o comando `touch <"nome-do-arquivo">.<"extensão-do-arquivo">` como no exemplo abaixo:

`touch arquivo3.txt`

Saia do container utilizando o comando `exit`.

Seguindo os passos acima, ao sair do container, provavelmente será posicionado dentro da pasta *_data* do volume *data-debian*. Para verificar se o arquivo criado está presente, utilize o comando `ls`.

Para finalizar este exemplo, vamos criar mais um container que utilizará o volume criado.

`docker run -dti --mount type=volume,src=data-debian,dst=/data --name debian-B debian`

Execute o *bash* do container debian-B.

`docker exec -ti debian-B bash`

Acesse a pasta *data* com o comando `cd data/` e crie mais um arquivo com o comando `touch`. Dê ao arquivo o nome de *arquivo4.txt*.

Para conferir se o arquivo foi criado, utilize o comando `ls`.

Saia do container utilizando o comando `exit`.

Para excluir um volume, é necessário que não tenha nenhum container utilizando o mesmo.

Pare a execução dos containers com o comando `docker stop <"ID"|"Nome do Container">` e remova-os utilizando o comando `docker rm <"ID"|"Nome do Container">`.

Após parar e remover os containers, é possível realizar a exclusão do volume com o comando `docker volume rm <"nome-do-volume">`.

`docker volume rm data-debian`

***ATENÇÃO:*** *Ao excluir um volume, todos os dados contidos nele são perdidos.*

# Copiando Arquivos para o Container

> "Para criar arquivos no Ubuntu, utilize o comando *touch \<Nome do Arquivo>.<extensão do arquivo>
>
>Exemplo: `touch MeuArquivo1.txt`

## Copiando arquivos simples

Para acessar o container, utilize o comando *docker exec -ti <"ID"|"Nome"> /bin/bash*.

Exemplo:

$ `docker exec Ubuntu-A /bin/bash`

Dentro do container você pode criar um diretório utilizando o comando *mkdir \</nome do diretório>*.

\# mkdir /destino

No entanto, é possível criar um diretório sem a necessidade de acessar o container.

Para remover o diretório criado, utilize o comando *rm -R \<destino/>.

\# `rm -R destino/`

Para sair do container, utilize o comando *exit*.

\# `exit`

Para criar um diretório sem acessar o container, utilize o comando *docker exec \<"ID"|"Nome do Container"> mkdir /\<dir>*.

$ `docker exec Ubuntu-A mkdir /destino`

Para ver a lista de diretórios do container Ubunto-A e verificar se o diretório foi criado, utilize o comando *docker exec Ubuntu-A ls*

$ `docker exec Ubuntu-A ls`

Para copiar um para dentro do diretório criado, utilize o comando *docker cp \<Nome do Arquivo>.<Extensão do arquivo> <"ID"|"Nome do Container">:/\<dir>.

$ `docker cp MeuArquivo1.txt Ubuntu-A:/destino`

## Copiando vários arquivos para o container

Para copiar mais de um arquivo de uma vez para um container, podemos utilizar o *zip* e, assim, criar um único arquivo compactado contendo todos os arquivos.

Se não tiver o *zip* instalado ainda, faça um *update* e, em seguida, prossiga com a instalação.

$ `sudo apt-get update`

$ `sudo apt-get upgrade`

$ `sudo apt-get -y install zip`

Para compactar os arquivos, utilize o comando *zip \<Nome do Arquivo>.zip \*txt.

$ `zip Meuzip.zip *.txt`

O comando acima compacta todos os arqivos com extensão *.txt* em um arquivo zip chamado *Meuzip.zip*.

Para ver a lista de arquivos, utilize o comando *ls -l*.

$ `ls -l`

O procedimento para enviar o arquivo compactado para o container é o mesmo utilizado anteriormente.

$ `docker cp Meuzip.zip Ubuntu-A:/destino`

Acesse o container e verifique se o arquivo foi copiado para o diretório descrito.

$ `docker exec -ti Ubuntu-A / bin/bash`

\# `cd /destino`

\# `ls`

Para descompactar o arquivo dentro do diretório atual, basta ter o zip instalado no container e executar o seguinte comando:

\# `unzip Meuzip.zip`

Caso não tenha o zip instalado neste container, utilize os comandos abaixo:

$ `apt update`

$ `apt upgrade`

$ `apt -y install zip`

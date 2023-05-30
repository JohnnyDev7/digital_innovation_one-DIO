# Primeiro Docker File

Para criar um container, utilize o comando abaixo:

`docker run -dti --name ubuntu-python ubuntu`

Para executar o container criado, utilize o comando abaixo:

`docker exec -ti ubuntu-python bash`

Utilize o comando `apt update` para atualizar os recursos do container criado.

Dentro do container ubuntu criado, utilize o comando abaixo para instalar o *python3* e o *nano*.

`apt install -y python3 nano`

Geralmente, após a instalação de novos recursos e programas, é possível que fiquem partes de arquivos de instalação desnecessárias no sistema.

Para excluir estes arquivos desnecessários, utilize o comando `apt clean`.

## Criando a aplicação - Exemplo 1

Para criar a aplicação, acesse a pasta *opt* com e comando *cd opt* e crie um arquivo nano chamado *app.py*.

`nano app.py`

A aplicação de exemplo é bem simples. É uma aplicação que solicita o nome do usuário e, após informado, o exibe na tela.

Utilizando o nano, digite o código abaixo:

    nome = input("Qual é o seu nome? ")
    print (nome)

Salve o arquivo pressionando as teclas *Ctrl + o* e pressione *Enter*.

Para fechar o nano, utilize as teclas *Ctrl + x*.

Para executar o aplicativo, utilize o comando `python3 app.py`.

O programa será executado e perguntará ao usuário o seu nome. Após digitar o nome e pressionar a tecla *Enter*, o nome digitado será exibido.

Utilize o comando `exit` para sair do container.

É possível executar a aplicação criada juntamente com a execução do container.

`docker exec -ti ubuntu-python python3 /opt/app.py`

Observe que não é possível utilizar a opção *-dti* pois, assim, a aplicação seria executada em segundo plano e não ficaria visível ao usuário.

Antes de seguir para o próximo exemplo, utilize os comandos para parar e remover o container criado.

`docker stop ubuntu-python`

`docker rm ubuntu-python`

## Criando a aplicação - Exemplo 2

Para este exemplo, crie uma pasta chamada *images* e dentro dela, outra pasta chamada *ubuntu-python*.

`mkdir images`

`cd images`

`mkdir ubuntu-python`

Acesse a pasta *ubuntu-python* e, dentro dela, crie um arquivo com o nome de *app.py*.

`cd ubuntu-python`

`nano app.py`

Dentro do nano, digite o seguinte código:

    nome = input("Qual é o seu nome: ")
    print (nome)

Salve o arquivo pressionando as teclas *Ctrl + o* e pressione *Enter*.

Para fechar o nano, utilize as teclas *Ctrl + x*.

Em seguida, crie um novo arquivo utilizando o nano com o nome de *dockerfile*.

Este será o arquivo de configuração da imagem criada.

`nano dockerfile`

Dentro do nano, digite o código abaixo:

    FROM ubuntu
    RUN apt update && apt install -y python3 && apt clean
    COPY app.py /opt/app.py
    CMD python3 /opt/app.py

O código acima cria um container com a imagem *ubuntu* (como não foi especificada a versão, será instalada a mais atual), atualiza os recursos, instala o python3, limpa os arquivos de instalação, copia o arquivo *app.py* para dentro da pasta *opt/* do container e executa a aplicação.

Salve o arquivo pressionando as teclas *Ctrl + o* e pressione *Enter*.

Para fechar o nano, utilize as teclas *Ctrl + x*.

Você pode verificar se o arquivo foi criado utilizando o comando `ls -l`.

Agora, é possível utilizar o arquivo criado, para gerar uma imagem de acordo com as configurações fornecidas, utilizando o comando `docker build`.

`docker build . -t ubuntu-python`

No código acima temos o comand *docker build*, um ponto (significa que o arquivo utilizado está presente na mesma pasta), *-t* e o nome da imagem que será gerada.

Para testar a imagem criada, utilize o comando abaixo:

`docker run -ti name meu-app ubuntu-python`

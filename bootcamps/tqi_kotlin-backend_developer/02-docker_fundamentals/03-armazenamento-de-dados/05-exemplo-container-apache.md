# Exemplo: Container Apache

Para fazer o download da imagen do Apache, utilize o comando `docker pull <"image">`, como descrito no site [DockerHub](https://hub.docker.com/_/httpd).

`docker pull httpd`

Em seguida, crie uma pasta que conterá o arquivo do exemplo, utilizando o comando abaixo:

`mkdir /data/apache-A`

Acesse a pasta com o comando `cd /data/apache-A`

Crie um arquivo *html* com o nome *index* utilizando o *nano*, como no exemplo:

`nano index.html`

Utilizando o *nano*, insira o seguinte código *html*:

    <!DOCKTYPE html>
    <html>
    <head>
        <meta charset="UTF-8" />
        <title>Exemplo Apache</title>
    </head>
    <body>
        <h1>OK!!! O Apache está Funcionando!!!</h1>
    </body>
    </html>

O próximo passo é mapear o volume para o container que será criado.

`docker run --name apache-A -d -p 80:80 --volume=/data/apache-A:/usr/local/apache2/htdocs httpd`

O comando acima especifica `docker run` (comando de criação do container), `--name apache-A` (Nome do container), `-d` (Execução em segundo plano), `-p 80:80` (Porta Host:Porta Container), `--volume=/data/apache-A:/usr/local/apache2/htdocs` (Pasta do volume criado:Pasta padrão do apache descrita no site DockerHub) e `httpd` (Imagem).

Para verificar o IP do host, utilize o comando `ip a`

Para verificar o funcionamento, abra um navegador de internet e digite o IP na barra de endereços.

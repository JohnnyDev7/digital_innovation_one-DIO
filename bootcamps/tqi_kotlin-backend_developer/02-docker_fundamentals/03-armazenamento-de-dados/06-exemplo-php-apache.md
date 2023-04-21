# Exemplo: PHP Apache

Para fazer o download da imagen do PHP-Apache, utilize o comando `docker pull <"image">`, como descrito no site [DockerHub](https://hub.docker.com/_/php/tags?page=1&name=7.4-apache).

`docker pull php:7.4-apache`

Em seguida, crie uma pasta que conterá o arquivo do exemplo, utilizando o comando abaixo:

`mkdir /data/php-A` (Se estiver fora do diretório */data*).

ou

`mkdir php-A` (Se estiver dentro do diretório */data*).

O próximo passo é mapear o volume para o container que será criado.

`docker run --name php-A -d -p 8080:80 --volume=/data/php-A:/var/www/html php:7.4-apache`

O comando acima especifica `docker run` (comando de criação do container), `--name php-A` (Nome do container), `-d` (Execução em segundo plano), `-p 8080:80` (Porta Host:Porta Container), `--volume=/data/php-A:/var/www/html` (Pasta do volume criado:Pasta padrão do apache descrita no site DockerHub) e `php:7.4-apache` (Imagem).

Acesse a pasta com o comando `cd /data/php-A`

Crie um arquivo *php* com o nome *index* utilizando o *nano*, como no exemplo:

`nano index.php`

Utilizando o *nano*, insira o seguinte código *html*:

    <!DOCKTYPE html>
    <html>
    <head>
        <meta charset="UTF-8" />
        <title>Exemplo Apache</title>
    </head>
    <body>
        <h1>OK!!! O PHP-Apache está Funcionando!!!</h1>
        <?php
            phpinfo();
        ?>
    </body>
    </html>

Para verificar o funcionamento, abra um navegador de internet e digite o IP na barra de endereços e a porta utilizada pelo host.
Exemplo:

`192.168.1.4:8080`

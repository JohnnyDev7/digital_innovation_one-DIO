# Criando Um Container de Uma Aplicação WEB

## Docker Compose: Executando uma aplicação HTML em um container apache (HTTPD)

**Instrutor**: *Denilson Bonatti*

Tech Lead - DIO

### Definições

- Criar um arquivo YML com as definições de um servidor apache (httpd);
- Especificar no arquivo YML o local on os arqivos da aplicação estarão. A aplicação pode ser um simples *Hello World*. Será que você consegue executar uma aplicação web completa?
- Subir o arquivo YML e a aplicação para um repositório no GitHub.

## Desenvolvendo o Desafio

Você pode desenvolver o desafio do início ou pode realizar um *fork* ou clonar o projeto que está disponível no GitHub e realizar as alterações necessárias.

<https://github.com/denilsonbonatti/docker-projeto1-dio>

Caso prefira desenvolver o projeto passo à passo, comece criando um diretório chamado *docker_projeto1_dio* (ou utilize o nome que preferir).

`mkdir docker_projeto1_dio`

Acesse o diretório utilizando o comando *cd \<dir>*.

`cd docker_projeto1_dio`

Dentro do diretório, crie o arquivo *compose.yml* que conterá as informações necessárias para a execução dos serviços.

O arquivo deverá conter o código seguinte:

    version: '3.9'
    services:
    apache:
        image: httpd:latest
        container_name: my-apache-app
        ports:
        - '80:80'
        volumes:
        - ./website:/usr/local/apache2/htdocs

`nano compose.yml`

`ctrl + o` seguido da tecla *Enter* para salvar o arquivo. E `ctrl + x` para fechar o editor de textos nano.

Ainda dentro do diretório *docker_projeto1_dio*, crie outro diretório com o nome (website) que está indicado no caminho descrito no arquivo *compose*. Este será o diretório que conterá os arquivos de sua aplicação.

`mkdir website`

Para um exemplo bem simples, dentro deste diretório, crie um arquivo *html* com o nome *index*.

`nano index.html`

Este arquivo irá representar a sua aplicação. Abaixo temos um exemplo de código *html* bem simples:

    <html>
        <h1>Meu primeiro projeto Docker.</h1>
        <p>Hello Docker World!!!</p>
    </html>

> *É importante lembrar que, o serviço APACHE que está sendo criado, executa apenas arquivos HTML, CSS e JavaScript.*

Após salvar o arquivo e fechar o editor de textos *nano*, retorne ao diretório *docker_projeto1_dio* e instale o *docker-compose*.

`cd ..` para retornar ao diretório anterior.

`sudo apt install docker-compose`

O próximo passo é gerar o arquivo utilizando o comando abaixo:

`docker-compose up -d`

Utilize o comando `docker container ls` para se certificar que o container foi criado e está em execução.

Para testar a aplicação, foi utilizado um exemplo em nuvem onde foi liberada a utilização *http* e realizado o teste de execução copiando o *ip* e colando no navegar de internet.

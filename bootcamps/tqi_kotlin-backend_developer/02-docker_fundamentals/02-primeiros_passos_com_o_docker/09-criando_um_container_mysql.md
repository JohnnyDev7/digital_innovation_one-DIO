# Criando Um Cntainer MySQL

Para criar um container MySQL,utilize o comando *docker pull mysql* pra baixar a imagem do DockerHub.

$ `docker pull mysql`

Para executar o container mysql, é necessário especificar algumas configurações.

Exemplo:

$ `docker run -e MYSQL_ROOT_PASSWORD=Senha123 --name mysql-A -d -p 3306:3306 mysql`

No comando acima utilizamos *-e* (para especificar a variável de ambiente), *--name* (nome do container), *-d* (para que seja executado em segundo plano), *-p* (define porta de comunicação 3306 é o host que "escuta" 3306 porta padrão do MySQL) e pra finalizar, mysql (nome do container).

Para acessar o container mysql, utilize o comando *docker exec -it <"ID"|"Nome_do_Container"> bash*.

$ `docker exec -it -mysql-A bash`

Para logar no MySQL, utilize o comando *mysql -u <"usuário"> -p <"password"> --protocol=<"name">*.

\# `mysql -u root -p --protocol=tcp`

Após digitar o comando acima e pressionar *Enter*, será pedida a senha de acesso.

Após realizar o acesso ao mysql, é possível criar bancos de dados utilizando os comandos MySQL.

Como exemplo, vamos criar o bando de dados com nome *aula*.

`CREATE DATABASE aula;`

Para ver o banco de dados criado, utilize o comando *show databases;*

`show databases;`

Com o banco de dados já criado, utilize o comando *exit* duas vezes. Uma para sair do mysql e outra para sair do container.

Com o comando *docker ps* você pode se certificar que o container ainda está em execução.

Para verificar o endereço que está sendo utilizado, digite o comando *ip a*

Para inpecionar as propriedades do container criado, utilize o comando *docker inspect <"ID"|"Nome_do_Container">*.

$ `docker inspect mysql-A`

Para acessar o mysql diretamente, sem a necessidade de utilizar o *bash*, instale o *mysql-client* utilizando o comando abaixo:

$ `apt -y install mysql-client`

Caso você tenha a permissão negada, utilize o comando:

$ `sudo apt-get -y install mysql-client´

Agora você já pode acessar o mysql diretamente utilizando o mesmo comando utilizado anteriormente:

$ `mysql -u root -p --protocol=tcp`

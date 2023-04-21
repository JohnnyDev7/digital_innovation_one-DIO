# Montando Mount Um Local de Armazenamento

Com o container mysql em execução, utilize o comando `docker inspect <"ID"|"Nome do Container">` para visualizar as propriedades do mesmo.

Por motivos de treino e estudos, verifique se há containers em execução, utilizando o comando `docker ps` ou, qualquer outro container utilizando o comando `docker ps -a`.

Se houver, remova todos utilizando o comando `docker rm <"ID"|"Nome do Container">`.

Crie uma pasta utilizando o comando `mkdir /data` (*data* será o nome da pasta criada) e outra com o comando `mkdir /data/mysql-A` (pasta mysql-A dentro da pasta anterior).

Agora, crie um novo container do mysql, desta vez informando a pasta onde serão salvos os dados, utilizando o seguinte comando:

\# `docker run -e MYSQL_ROOT_PASSWORD=Senha123 --name mysql-A -d -p 3306:3306 --volume=/data/mysql-A:/var/lib/mysql mysql`

O caminho */var/lib/mysql* é o caminho padrão onde o mysql armazena os dados.

Para acessar o container criado, utilize o comando `mysql -u root -p --protocol=tcp --port=3306`

Dentro do mysql, vamos criar um banco de dados para realizar alguns testes.

Para criar um banco de dados, utilize o comando `CREATE DATABASE aula;`

Para acessar o banco de dados criado, utilize o comando `USE aula;`

Como exemplo, vamos criar uma tabela utilizando o seguinte comando:

`CREATE TABLE alunos (
    AlunoID int,
    Nome varchar(50),
    Sobrenome varchar(50),
    Endereco varchar(150),
    Cidade varchar(50)
);`

Para inserir dados na tabela criada, vamos utilizar o comando:

`INSERT INTO alunos
    (AlunoID, Nome, Sobrenome, Endereco, Cidade)
VALUES
    (1, 'Johnny', 'Souza', 'Rua Tal', 'Cidade Tal');`

Para ver os dados da tabela criada, utilize o comando `SELECT * FROM alunos;`

Digite o comando `exit` para sair do mysql e `docker ps` para ver que ele ainda continua em execução.

Pare a execução utilizando o comando `docker stop mysql-A` e exclua o container com o comando `docker rm mysql-A`.

Após a exclusão do container, utilize o comando `ls /data/mysql-A/` para se certificar que seus dados criados continuam armazenados.

Para finalizar, utilizando os comandos anteriores, crie um novo container mysql informando o mesmo caminho de diretórios. Note que, ao acessar o container, o banco de dados e a tabela criados anteriormente fazem parte do novo container.

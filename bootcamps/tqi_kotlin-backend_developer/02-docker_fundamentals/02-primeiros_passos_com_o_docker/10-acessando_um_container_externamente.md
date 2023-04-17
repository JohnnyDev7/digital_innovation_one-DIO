# Acessando Um Container Externamente

Para acessar um container MySQL externamente, instale o MySQL Workbench.

Em seguida, crie uma conexão com o conteiner mysql-A utilizando o IP e as configurações de usuário e senha já definidos.

Exemplo: Criar uma conexão no MySQL Workbench utilizando o IP *xxx.xxx.x.x*, usuário *root* e senha *Senha123*.

Após se conectar com sucesso ao banco de dados, é possível utilizar comandos SQL no MySQL Workbench para manipular o banco de dados do container.

Exemplo:

`CREATE TABLE alunos (
    AlunoID int,
    Nome varchar(50),
    Sobrenome varchar(50),
    Endereco varchar(150),
    Cidade varchar(50)
);`

`INSERT INTO alunos (AlunoID, Nome, Sobrenome, Endereco, Cidade) VALUES (1, 'Jonathas', 'Souza', 'Rua Desconhecida', 'Raposos');`

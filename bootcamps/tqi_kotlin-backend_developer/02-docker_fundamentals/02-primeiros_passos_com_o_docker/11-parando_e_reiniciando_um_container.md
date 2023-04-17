# Parando e Reiniciando Um Container

Abaixo temos alguns comandos utilizados para realizar ações com os containers.

Para verificar os containers em execução:

$ `docker ps`

Para parar um container:

$ `docker stop <"ID"|"Nome_do_Container">`

Para inicializar um container:

$ `docker start <"ID"|"Nome_do_Container">`

Para acessar o container mysql-A:

$ `mysql -u root -p -protocol=tcp`

Insira a senha cadastrada.

À seguir, utilize comandos SQL para manipulação do banco de dados.

Para acessar o banco de dados *aula* que foi criado anteriormente:

`use aula;`

Para ver as informações da tabela *alunos* criada anteriormente:

`select * from alunos;`

Para sair do banco de dados:

`exit`

Para remover o container:

$ `docker rm <"ID"|"Nome_do_Container">`

**ATENÇÃO: Ao remover um container, todos os dados contidos nele são removidos também.**

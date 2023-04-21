# Mount: Conclusão

Para criar um volume, utilize o comando `docker volume create <"Nome-do-Volume">`

Exemplo:

`docker volume create centos-A`

Para criar um container que utilizará o volume criado, utilize o comando do exemplo abaixo:

`docker run -dti --mount type=volume,src=centos-A,dst=/data --name centos-A centos`

***Observação:*** Sempre que houver alguma duvida sobre o tipo de mount que está sendo utilizado, verifique utilizando o comando `docker inspect <"Nome-do-Container">`

`docker inspect centos-A`

Para forçar a exclusão de um container sem a necessidade de interromper sua execução antes, utilize a tag `-f` no comando de remoção.

`docker rm -f centos-A`

Para excluir todos os volumes existentes, basta utilizar o comando `docker volume prune`.

***ATENÇÃO: Utilize este comando com muita precaução pois ele exclui todos os volumes e os dados contidos nele.***

Para excluir todos os containers existentes, utilize o comando `docker container prune`.

***Observação:*** Apesar de serem excluídos os containers, as *imagens* ainda permanecem no sistema. Permitindo desta forma que novos containers sejam criados.

# Excluindo e Nomeando Containers

Os containers executados, mesmo depois de parados, continuam consumindo recursos do computador.

Para excluir um container da lista de containers, utilize o comando *rm* + o ID ou Nome do container.

$ `docker rm <"ID"|"Name">`

Imagens não utilizadas também utilizam recursos desnecessariamente.

Caso tenha imagens que não estão sendo utilizadas, o ideal é que sejam removidas.

Para remover imagens, utilize o comando *docker rmi* + o nome da imagem.

Exemplo:

$ `docker rmi hello-world`

Quando tentamos executar uma imagem que não está presente no repositóro local, o Docker realiza uma busca automática no repositório online.

Por exemplo, tente executar a imagem do sistema operacional "centos* e veja o resultado.

$ `docker run -dti centos`

É possível nomear os containers para facilitar a identificação.

Para isto, no momento da execução, basta inserir o comando *--name*.

$ `docker run -dti --name Ubuntu-A ubuntu`

No exemplo acima é criado um container do ubuntu com o nome *Ubuntu-A*.

Criando mais dois containers de exemplo:

$ `docker run -dti --name CentOS-A centos`

$ `docker run -dti --name Ubuntu-B ubuntu`

Para ver a lista dos containers criados:

$ `docker ps`

# TAGs

TAGs são utilizadas para baixar uma versão específica de imagens do DockerHub.

Para baixar uma imagem do Debian versão 9, por exemplo, existem TAGs específicas relacionadas às imagens disponíveis para esta versão.

Exemplo:

$ `docker pull debian:9`

Para conferir a imagem baixada, utilize o comando *docker images*.

$ `docker images`

Para executar a imagem baixada, utilize o comando *docker run -dti <"nome_da_imagem">:<"tag">

$ `docker run -dti debian:9`

Utilize *docker ps* para ver a lista das imagens em execução.

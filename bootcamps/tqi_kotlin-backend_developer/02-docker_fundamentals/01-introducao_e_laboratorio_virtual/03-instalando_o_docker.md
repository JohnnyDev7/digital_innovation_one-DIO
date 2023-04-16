# Instalando o Docker no Ubuntu Server

Na [documentação do Docker](https://docs.docker.com/engine/install/ubuntu/), são descritas várias formas de instalação. Uma delas é executando o seguinte script no Ubuntu:

$ `curl -fsSL https://get.docker.com -o get-docker.sh`

$ `sudo sh get-docker.sh`

> Este exemplo baixa o script de <https://get.docker.com/> e o executa para instalar o último lançamento estável de Docker no Linux.

Para verificar a versão do Docker instalada, execute o comando:

$ `sudo docker version`

Para que não seja necessário digitar a palavra *sudo* em todos os comandos do Docker, adicione o seu usuário ao grupo Docker com o seguinte comando:

$ `sudo usermod -aG docker $USER`

Verifique se seu usuário foi adicionado ao grupo Docker utilizando o comando *groups*.

$ `groups`

Se você verificar seus grupos e o grupo *Docker* não estiver na lista, pode ser que seja necessário reiniciar o Ubuntu. Para evitar isto, você pode usar o comando *newgrp docker* assim:

$ `newgrp docker`

Se mesmo assim, houver necessidade de reiniciar o Ubuntu, execute o comando abaixo:

$ `sudo reboot now`

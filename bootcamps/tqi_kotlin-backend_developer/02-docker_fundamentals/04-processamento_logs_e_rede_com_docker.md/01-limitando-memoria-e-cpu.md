# Limitando Memória e CPU

Para exemplificar a limitação do uso dos recursos, crie um container chamado *ubuntu-C* que seja executado em segundo plano (-dti) e adicione os limites de memória e CPU a serem utilizados, como no exemplo abaixo:

`docker run --name ubuntu-C -dti -m 128M --cpus 0.2 ubuntu`

Para verificar o uso de recursos durante sua execução, utilize o comando `docker stats <"ID"|"Nome do Container">`

`docker stats ubuntu-C`

Provavelmente, as informações sobre o consumo de recursos estará estática pois não há atividades sendo executadas no container.

Execute o *bash* do container e realize o update.

`docker exec -ti ubuntu-C bash`

`apt update`

Para "estressar" o uso do container, ou seja, simular uma utilização, instale o software *stress*.

`apt -y install stress`

Para a ver a ajuda do *stress*, utilize o comando `stress --help`

Como exemplo, utilize o *stress* utilizando 1 cpu, enviando 50 megabytes de dados e 1 volume (pacote) de 50 megabytes.

`stress --cpu 1 --vm-bytes 50m --vm 1 --vm-bytes 50m`

Durante a execução, o terminal não permite a entrada de outros comandos.

Abra uma nova janela de terminal para executar o comando e verificar a utilização de recursos pelo container durante a execução do *stress*.

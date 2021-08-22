# Arquitetura de Microserviços com Spring Cloud

Este projeto foi executado e adaptado, seguindo o curso microserviços na Digital Innovation One.

## Desafios

O maior desafio neste projeto foi utilizar as bibliotecas mais recentes oferecidas pelo Spring.

## Notas

### Docker e Imagens

Os containers necessários para executar este exemplo estão descritos no arquivo docker-compose.yml que se encontra na raiz deste diretório. Necessitando apenas executar o comando:

``` bash
 docker-compose up -d
```

O uso de memória e proessadores foi limidado dentro desta configuração para que máquinas modestas possam rodar o conteúdo sem maiores problemas.

E assim foi deixado, já que este material é de cunho puramente educativo.

### Configuração Distribuída

Como o intuito era testar o servidor de configuração distribuída, criei um repositório contendo as configurações que os serviços utilizam.
Para conferir, basta acessar o repositório: https://github.com/Arsonist-Cook/dio-microservices-config
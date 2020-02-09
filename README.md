# kafka
## O objetivo é publicar uma mensagem no tópico ```email-topic```, alterar o campo nome para letras maiúsculas e publicar no tópico ```success-topic```

Para rodar o projeto é necessário o docker-compose

- Na pasta raiz, use o comando ```docker-compose up``` para subir uma instância do kafka
- Na pasta kafka-producer-consumer, rode o comando ```./gradlew clean bootRun```
- Faça o mesmo na pasta kafka-processor

Com todos os serviços rodando, faça a request abaixo

### Request
POST - http://localhost:8080/kafka
```
{
    "name": "João da silva",
    "email": "joao_da_silva@mail.com"
}
```

### Response

```
{
    "name": "JOÂO DA SILVA",
    "email": "joao_da_silva@mail.com"
}
```

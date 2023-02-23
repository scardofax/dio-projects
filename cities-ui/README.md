# CIDADES API

Esta é uma API de consulta de cidades, estados e paises e tembem efetua o calculo entre uma cidade e outra.

##Requisitos

* Git
* IntelliJ IDEA (Community Edition)
* Docker
* Java 11

##Banco de Dados

Neste projeto é utilizado o Banco de dados **POSTGREES** do Docker Hub

* [Postgrees Dccker Hub](https://hub.docker.com/_/postgres)

`docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=user_city -e POSTGRES_PASSWORD=password -e POSTGRES_DB=cities postgres`

##Informações
As informações da cidades, estados e paises foi pega do projeto abaixo:

* [GitHUb chinnonsantos - SQL-paises-estados-cidades](https://github.com/chinnonsantos/sql-paises-estados-cidades)

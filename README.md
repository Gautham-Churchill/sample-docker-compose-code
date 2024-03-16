# Overview
Created a sample Spring Boot project to understand how Spring supports docker compose.
In this code a postgres db will be created on application start.
It will insert a student entity value as well.

# Application version
* **Spring Boot** - 3.1.4
* **Spring** - 6.0.12
* **Java** - 17

# Setting up the PostgresSQL Container

The `docker-compose.yml` contains a service named `postgres` defined below.
It will start the postgres database on port `5432` on application startup.

```yaml
services:
postgres:
image: 'postgres:latest'
environment:
- 'POSTGRES_DB=mydatabase'
- 'POSTGRES_PASSWORD=secret'
- 'POSTGRES_USER=myuser'
ports:
- '5432':'5432'
```

# References further
See this link to further work on this project - https://github.com/asaikali/docker-compose-postgres.
It is to how to install pgAdmin and how now to lose logged-in session data of pgAdmin browser

* Reference on how to persist postgres docker container data - https://medium.com/codex/how-to-persist-and-backup-data-of-a-postgresql-docker-container-9fe269ff4334

# Docker commands
* `open -a Docker` - to open Docker on your local macOS machine via command.
* `docker-compose -f {compose file name} up` - to run compose file (Skip `-f` if filename is `docker-compose.yml`)
* `docker ps` - to list running docker process
* `docker-compose stop` - to just stop the containers
* `docker-compose down` - to stop and remove them.
* `docker exec -it -U {dbusernam} -d {dbname}` - to connect to a database in running postgres database.
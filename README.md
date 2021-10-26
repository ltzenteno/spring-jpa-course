### Local Setup

    docker-compose up -d

    docker cp db.sql db_spring_data_jpa:/db.sql

    docker exec -it db_spring_data_jpa psql -U postgres test_spring_jpa -a -f /db.sql


### Flyway

- use JPA Buddy to create diff migrations (show DDL... option, then copy it inside a new `sql` migration file) 👍

_NOTE: careful with how it creates DDL, `id` must be of type `SERIAL` instead of `INT`_


- To check migration info (which have been applied, which are pending):

      ./gradlew flywayInfo

- To run new migrations

      ./gradlew flywayMigrate -i

### H2 Console

[http://localhost:8080/h2-console](http://localhost:8080/h2-console)

[http://www.h2database.com/html/features.html#connection_modes](http://www.h2database.com/html/features.html#connection_modes)

### Flyway

- use JPA Buddy to create diff migrations (show DDL... option, then copy it inside a new `sql` migration file) 👍

_NOTE: careful with how it creates DDL, `id` must be of type `SERIAL` instead of `INT`_


- To check migration info (which have been applied, which are pending):

      ./gradlew flywayInfo

- To run new migrations

      ./gradlew flywayMigrate -i

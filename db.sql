CREATE DATABASE test_spring_jpa;

CREATE USER postgres PASSWORD 'supersecret';
GRANT ALL PRIVILEGES ON DATABASE test_spring_jpa TO postgres;

CREATE SCHEMA test_db;
GRANT ALL ON SCHEMA test_db TO postgres;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA test_db TO postgres;
ALTER USER postgres SET search_path TO test_db;
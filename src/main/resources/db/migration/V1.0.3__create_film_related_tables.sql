CREATE TABLE films (
  id SERIAL NOT NULL,
  rental_rate DECIMAL,
  release_year TEXT,
  CONSTRAINT pk_films PRIMARY KEY (id)
);

CREATE TABLE categories (
  id SERIAL NOT NULL,
  name VARCHAR(255) NOT NULL,
  CONSTRAINT pk_categories PRIMARY KEY (id)
);

CREATE TABLE film_category (
  last_update TIMESTAMP WITHOUT TIME ZONE,
  film_id BIGINT NOT NULL,
  category_id BIGINT NOT NULL,
  CONSTRAINT pk_film_category PRIMARY KEY (film_id, category_id)
);

ALTER TABLE film_category ADD CONSTRAINT FK_FILM_CATEGORY_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES categories (id);

ALTER TABLE film_category ADD CONSTRAINT FK_FILM_CATEGORY_ON_FILM FOREIGN KEY (film_id) REFERENCES films (id);
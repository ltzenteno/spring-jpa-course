-- films
INSERT INTO films (rental_rate, release_year) VALUES (10.0, '1980');
INSERT INTO films (rental_rate, release_year) VALUES (12.0, '1981');
INSERT INTO films (rental_rate, release_year) VALUES (9.0, '1990');
INSERT INTO films (rental_rate, release_year) VALUES (11.0, '1995');

-- categories
INSERT INTO categories (name) VALUES ('action');
INSERT INTO categories (name) VALUES ('horror');
INSERT INTO categories (name) VALUES ('comedy');
INSERT INTO categories (name) VALUES ('drama');

-- film_category
INSERT INTO film_category (last_update, film_id, category_id) VALUES (NOW(), 1, 1);
INSERT INTO film_category (last_update, film_id, category_id) VALUES (NOW(), 2, 1);
INSERT INTO film_category (last_update, film_id, category_id) VALUES (NOW(), 3, 2);
INSERT INTO film_category (last_update, film_id, category_id) VALUES (NOW(), 4, 4);

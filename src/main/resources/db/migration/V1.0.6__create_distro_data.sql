INSERT INTO distro_addresses (city, state, pin_code) VALUES ('Austin', 'TEXAS', 'AB9898');
INSERT INTO distro_addresses (city, state, pin_code) VALUES ('San Diego', 'CALIFORNIA', 'AB9899');
INSERT INTO distro_addresses (city, state, pin_code) VALUES ('Palm City', 'TEXAS', 'AB9900');

INSERT INTO distro_distributors (name, address_id) VALUES('Ken Masters', 1);
INSERT INTO distro_distributors (name, address_id) VALUES('Chun Li', 2);
INSERT INTO distro_distributors (name, address_id) VALUES('Sagat', 3);

INSERT INTO distro_products (name, price, manufacturing_date, manufacturing_place_id, weight, height, width, distributor_id, category) VALUES ('one plus 8T', 100, now(), 1, 2.2, 3.4, 5.4, 1, 'MOBILE');
INSERT INTO distro_products (name, price, manufacturing_date, manufacturing_place_id, weight, height, width, distributor_id, category) VALUES ('Samsung 100 S', 200, now(), 2, 5.6, 7.9, 4.3, 1, 'MOBILE');
INSERT INTO distro_products (name, price, manufacturing_date, manufacturing_place_id, weight, height, width, distributor_id, category) VALUES ('Armani jacket size 32', 1100, now(), 3, 1.3, 10.4, 29.5, 2, 'MEN_FASHION');
INSERT INTO distro_products (name, price, manufacturing_date, manufacturing_place_id, weight, height, width, distributor_id, category) VALUES ('Zara purse', 500, now(), 1, 3.7, 50.6, 70.6, 2, 'WOMEN_FASHION');
INSERT INTO distro_products (name, price, manufacturing_date, manufacturing_place_id, weight, height, width, distributor_id, category) VALUES ('Sony Bravia ', 2000, now(), 2, 25.5, 48.8, 25.9, 3, 'TV_APPLIANCES');
INSERT INTO distro_products (name, price, manufacturing_date, manufacturing_place_id, weight, height, width, distributor_id, category) VALUES ('zara jacket green color', 1500, now(), 3, 1.3, 10.4, 29.5, 3, 'MEN_FASHION');
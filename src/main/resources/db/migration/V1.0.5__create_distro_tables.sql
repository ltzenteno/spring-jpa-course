CREATE TABLE distro_addresses (
  id SERIAL NOT NULL,
  created DATE DEFAULT CURRENT_DATE,
  updated DATE,
  line1 VARCHAR(255),
  line2 VARCHAR(255),
  city VARCHAR(255),
  state VARCHAR(255),
  pin_code VARCHAR(255),
  CONSTRAINT pk_distro_addresses PRIMARY KEY (id)
);

CREATE TABLE distro_distributors (
  id SERIAL NOT NULL,
  created DATE DEFAULT CURRENT_DATE,
  updated DATE,
  name VARCHAR(255),
  address_id BIGINT,
  CONSTRAINT pk_distro_distributors PRIMARY KEY (id)
);

ALTER TABLE distro_distributors ADD CONSTRAINT FK_DISTRO_DISTRIBUTORS_ON_ADDRESS FOREIGN KEY (address_id) REFERENCES distro_addresses (id);

CREATE TABLE distro_products (
  id SERIAL NOT NULL,
  created DATE DEFAULT CURRENT_DATE,
  updated DATE,
  name VARCHAR(255),
  price DECIMAL,
  manufacturing_date TIMESTAMP WITHOUT TIME ZONE,
  manufacturing_place_id BIGINT,
  weight DOUBLE PRECISION,
  distributor_id BIGINT,
  category VARCHAR(255),
  height DOUBLE PRECISION,
  width DOUBLE PRECISION,
  CONSTRAINT pk_distro_products PRIMARY KEY (id)
);

ALTER TABLE distro_products ADD CONSTRAINT FK_DISTRO_PRODUCTS_ON_DISTRIBUTOR FOREIGN KEY (distributor_id) REFERENCES distro_distributors (id);

ALTER TABLE distro_products ADD CONSTRAINT FK_DISTRO_PRODUCTS_ON_MANUFACTURINGPLACE FOREIGN KEY (manufacturing_place_id) REFERENCES distro_addresses (id);
CREATE TABLE state (
   id                   INTEGER                         NOT NULL,
   name                 VARCHAR(255)                    NOT NULL,
   abbreviation         VARCHAR(255)                    NOT NULL,
   created_at           TIMESTAMP WITHOUT TIME ZONE,
   updated_at           TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_state PRIMARY KEY (id)
);
CREATE TABLE city (
   id                   INTEGER                         NOT NULL,
   name                 VARCHAR(255)                    NOT NULL,
   state_id             INTEGER,
   created_at           TIMESTAMP WITHOUT TIME ZONE,
   updated_at           TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_city PRIMARY KEY (id)
);

ALTER TABLE city ADD CONSTRAINT FK_CITY_ON_STATE FOREIGN KEY (state_id) REFERENCES state (id);
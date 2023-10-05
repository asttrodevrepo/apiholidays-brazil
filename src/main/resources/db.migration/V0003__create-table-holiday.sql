CREATE TABLE holiday (
   id               INTEGER                         NOT NULL,
   name             VARCHAR(255)                    NOT NULL,
   holiday_date     date                            NOT NULL,
   city_id          INTEGER,
   state_id         INTEGER,
   created_at       TIMESTAMP WITHOUT TIME ZONE,
   updated_at       TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT pk_holiday PRIMARY KEY (id)
);

ALTER TABLE holiday ADD CONSTRAINT FK_HOLIDAY_ON_CITY FOREIGN KEY (city_id) REFERENCES city (id);

ALTER TABLE holiday ADD CONSTRAINT FK_HOLIDAY_ON_STATE FOREIGN KEY (state_id) REFERENCES state (id); (state_id) REFERENCES state (id);
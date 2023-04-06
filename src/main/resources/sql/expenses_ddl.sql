CREATE TABLE IF NOT EXISTS expenses(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
sum DOUBLE NOT NULL,
cattegory_id BIGINT NOT NULL,
CONSTRAINT exepenses_to_cattegory_fk FOREIGN KEY (cattegory_id) REFERENCES cattegory(id),
add_data DATE NOT NULL,
opperation_comment VARCHAR(250) NOT NULL
);
# --- Initial creation of the database schema

# --- !Ups
CREATE TABLE PIZZA (
 	pizzaID serial primary key,
	pizzaName varchar(25) NOT NULL,
	hasTomato boolean NOT NULL,
	hasMozzarella boolean NOT NULL,
	hasCheese boolean NOT NULL,
	hasHam boolean NOT NULL,
	hasSalami boolean NOT NULL
);

CREATE TABLE PIZZAORDER (
	orderID serial primary key,
	pizzaID integer references PIZZA(pizzaID) NOT NULL,
	quantity smallint NOT NULL,
	orderDate date NOT NULL,
	customerName varchar(25) NOT NULL,
	remarks varchar(255),
	isSent boolean NOT NULL,
	sentDate date
);

# --- !Downs
DROP TABLE IF EXISTS TITEL;
DROP TABLE IF EXISTS ROOSTER;
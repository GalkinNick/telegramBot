CREATE SCHEMA IF NOT EXISTS subscribers_schema;

CREATE TABLE Subscribers(
    id uuid PRIMARY KEY,
    telegram_id INTEGER UNIQUE NOT NULL,
    price FLOAT NULL
);

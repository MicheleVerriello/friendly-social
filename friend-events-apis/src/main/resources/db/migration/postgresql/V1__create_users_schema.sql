CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    creationdate TIMESTAMP NOT NULL DEFAULT NOW(),
    updatedate TIMESTAMP,
    email VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);
CREATE TABLE users (
    id SERIAL PRIMARY KEY DEFAULT nextval('users_seq'),
    creationdate TIMESTAMP NOT NULL DEFAULT NOW(),
    updatedate TIMESTAMP,
    email VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

-- Create the sequence for the ID column
CREATE SEQUENCE users_seq;
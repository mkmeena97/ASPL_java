CREATE TABLE todos (
    id IDENTITY PRIMARY KEY,
    title VARCHAR(255),
    description VARCHAR(500),
    completed BOOLEAN
);

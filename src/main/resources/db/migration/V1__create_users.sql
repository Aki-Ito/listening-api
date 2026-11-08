CREATE TABLE users ( 
  id BIGSERIAL PRIMARY KEY,
  email VARCHAR(255) UNIQUE,
  password_hash VARCHAR(100), 
  created_at TIMESTAMP
);
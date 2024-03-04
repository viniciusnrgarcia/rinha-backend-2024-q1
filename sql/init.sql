CREATE UNLOGGED TABLE IF NOT EXISTS customers (
-- CREATE TABLE customers (
    id SERIAL PRIMARY KEY NOT NULL,
    limit_account INTEGER NULL,
    balance INTEGER NULL
);

CREATE UNLOGGED TABLE IF NOT EXISTS transactions (
-- CREATE TABLE transactions (
    id INTEGER NULL,
    type CHAR(1) NULL,
    description VARCHAR(10) NULL,
    total_value INTEGER NULL,
    created_at TIMESTAMP NULL DEFAULT NOW()
);

CREATE INDEX idx_customer_id ON transactions(id);
-- CREATE INDEX idx_customer_id ON transactions(id, created_at);
-- CREATE INDEX idx_cliente_realizada_em ON transacoes (cliente_id, realizada_em);


--SET statement_timeout = 0;
--SET lock_timeout = 0;
--SET idle_in_transaction_session_timeout = 0;
--SET client_encoding = 'UTF8';
--SET standard_conforming_strings = on;
--SET check_function_bodies = false;
--SET xmloption = content;
--SET client_min_messages = warning;
--SET row_security = off;
--SET default_tablespace = '';
--SET default_table_access_method = heap;


INSERT INTO customers (id, limit_account, balance)
VALUES
    (1, -100000, 0),
    (2, -80000, 0),
    (3, -1000000, 0),
    (4, -10000000, 0),
    (5, -500000, 0);
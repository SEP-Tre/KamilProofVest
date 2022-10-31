DROP SCHEMA IF EXISTS rightovers CASCADE ;
CREATE SCHEMA IF NOT EXISTS rightovers;
SET SCHEMA 'rightovers';

CREATE TABLE IF NOT EXISTS food_post
(
    food_post_id SERIAL PRIMARY KEY,
    title varchar,
    description varchar,
    days_left_to_eat varchar
);
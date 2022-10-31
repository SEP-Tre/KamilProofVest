DROP SCHEMA IF EXISTS rightovers CASCADE ;
CREATE SCHEMA IF NOT EXISTS rightovers;
SET SCHEMA 'rightovers';

CREATE TABLE IF NOT EXISTS food_post
(
    post_id SERIAL PRIMARY KEY,
    title varchar,
    post_category varchar,
    description varchar,
    picture_url varchar,
    days_until_expired varchar,
    post_state varchar,
    post_date date,
    post_timestamp  timestamp
);
// 1

SELECT DISTINCT replacement_cost FROM film;

// 2

SELECT COUNT(DISTINCT replacement_cost) FROM film;

// 3

SELECT COUNT(title) FROM film
WHERE title LIKE 'T%'
AND rating IN ('G');

// 4

SELECT COUNT(country) FROM country
WHERE length(country) = 5;

// 5

SELECT COUNT(*) FROM city
WHERE city ILIKE '%R';
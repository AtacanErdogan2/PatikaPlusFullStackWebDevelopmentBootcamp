-- 1 → test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

CREATE TABLE employee (
id SERIAL PRIMARY KEY,
name VARCHAR(50) NOT NULL,
birthday DATE,
email VARCHAR(100)
);

-- 2 → Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

insert into employee (name, birthday, email) values ('Merle Yukhnev', '1980-11-17', 'myukhnev0@homestead.com');
insert into employee (name, birthday, email) values ('Tansy Goldbourn', '1987-09-28', null);
...

-- 3 → Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

UPDATE employee
SET email = 'tansy@zdnet.com'
WHERE id = 2;

UPDATE employee
SET birthday = '1985-04-21'
WHERE name = 'Nadine Harroll';

UPDATE employee
SET name = 'John Doe'
WHERE id IN (15, 30, 45);

-- 4 → Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

DELETE FROM employee
WHERE id IN (15, 30, 45);

DELETE FROM employee
WHERE name = 'Nadine Harroll';

DELETE FROM employee
WHERE id = 2;
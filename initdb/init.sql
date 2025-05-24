CREATE TABLE IF NOT EXISTS quote (
    id SERIAL PRIMARY KEY,
    author VARCHAR(255) NOT NULL,
    content TEXT NOT NULL
);

INSERT INTO quote (author, content) VALUES
('Альберт Эйнштейн', 'У воображения больше значения, чем у знания.'),
('Стив Джобс', 'Будь голодным. Будь безрассудным.'),
('Фридрих Ницше', 'Тот, кто имеет зачем жить, может вынести почти любое как.'),
('Брюс Ли', 'Не бойся неудачи. Бойся ничего не попробовать.'),
('Конфуций', 'Дорога в тысячу ли начинается с первого шага.')
ON CONFLICT DO NOTHING;
TRUNCATE TABLE quiz CASCADE;
insert into quiz (id, name, description, questions_number)
values (1, 'name', 'test description', 10),
       (2, 'sec name', 'second test', 20);


TRUNCATE TABLE question CASCADE;
insert into question (id, body, type, quiz_id)
VALUES (1, 'Что говорит лиса?', 0, 1);
insert into question (id, body, type, quiz_id)
VALUES (2, 'Почему небо синее?', 0, 1);
insert into question (id, body, type, quiz_id)
VALUES (3, 'Кушать будешь?', 0, 1);

truncate table answer cascade;
insert into answer (id, body, is_right, question_id)
VALUES (1, 'Wakakaka', true, 1);
insert into answer (id, body, is_right, question_id)
VALUES (2, 'Woof-woof', false, 1);
insert into answer (id, body, is_right, question_id)
VALUES (3, 'Meow', false, 1);
insert into answer (id, body, is_right, question_id)
VALUES (4, 'Kurikitakati', false, 1);

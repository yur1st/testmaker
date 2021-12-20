TRUNCATE TABLE quiz CASCADE;
insert into quiz (id, name, description, questions_number)
values (10, 'name', 'test description', 10),
       (20, 'sec name', 'second test', 20);


TRUNCATE TABLE question CASCADE;
insert into question (id, body, type, quiz_id)
VALUES (30, 'Что говорит лиса?', 'ONE', 10),
       (40, 'Почему небо синее?', 'ONE', 10),
       (50, 'Кушать будешь?', 'ONE', 10),
       (51, 'А, чо?', 'ONE', null),
       (52, 'Уруруру?', 'ONE', null);

truncate table answer cascade;
insert into answer (id, body, is_right, question_id)
VALUES (60, 'Wakakaka', true, 30),
       (61, 'Woof-woof', false, 30),
       (62, 'Meow', false, 30),
       (63, 'Kurikitakati', false, 30),
       (70, 'Озоновый слой', true, 40),
       (71, 'Потому что', false, 40),
       (72, 'АПВС?', false, 40),
       (81, 'Буду', true, 50),
       (82, 'Барабан', false, 50),
       (83, 'Не буду', true, 50);


truncate table user_authority cascade;

truncate table users cascade;
insert into users (id, name, proposed_questions, quizzes_completed, quizzes_created, right_answered_questions,
                   total_answered_questions)
values (100, 'yurist', 10, 15, 2, 100, 150),
       (101, 'alisa', 15, 17, 5, 90, 130);

truncate table proposal cascade;

insert into proposal (id, status, question_id, quiz_id, user_id)
values (120, 'PENDING', 51, 20, 100),
       (130, 'PENDING', 52, 20, 100);


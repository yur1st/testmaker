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
       (70, 'Woof-woof', false, 30),
       (80, 'Meow', false, 30),
       (90, 'Kurikitakati', false, 30);


truncate table user_authority cascade;

truncate table user_statistic, users cascade;
insert into users (id, name)
values (100, 'yurist'),
       (101, 'lisa');

truncate table proposal cascade;

insert into proposal (id, status, question_id, quiz_id, user_id)
values (120, 'PENDING', 51, 20, 100),
       (130, 'PENDING', 52, 20, 100);

insert into user_statistic (proposed_questions, quizzes_completed, quizzes_created, right_answered_questions,
                            total_answered_questions, user_id)
VALUES (10, 15, 2, 100, 150, 100),
       (15, 17, 5, 90, 130, 101);

update users
set statistic_user_id = 100
where users.id = 100;

update users
set statistic_user_id = 101
where users.id = 101;
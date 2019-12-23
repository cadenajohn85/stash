use stash_db;

# users
insert into users (username, email, password)
values ('johntest', 'john@test.com', 'password');

# userdetails
insert into userdetails (user_id, about_me, join_date)
values (1, 'Quilts of Valor member, fan of pre-cuts', '2019-12-22 21:49:00')

# stashes
insert into stashes (user_id)
values (1);

# cuts
insert into cuts (stash_id, fabric_name, quantity)
values (1, 'Red floral batik', 3.5),
       (1, 'Into the Woods', 1),
       (1, 'green polka dots', 6.0);


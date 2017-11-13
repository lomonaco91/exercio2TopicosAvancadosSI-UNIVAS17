create table clientes (
id integer not null,
name varchar(50) not null,
email varchar(50) not null,
constraint pk_clients primary key (id)
);
create sequence seq_clientes;

select * from clientes;

insert into products (id, name, email)
values (nextval('seq_clientes'), 'Fabiano', 'fabiano.lomonaco.junior@gmail.com');

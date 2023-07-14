create table pessoa_fisica(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    cpf varchar(15) not null unique,
    telefone varchar(20) not null,
    telefone1 varchar(20) ,
    telefone2 varchar(20) ,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero varchar(20) not null,
    marca varchar(20) not null,
    modelo varchar(50) not null,
    ano varchar(10) not null,
    motor varchar(10) not null,
    placa varchar(10) not null,
    adicionais varchar(100),

    primary key(id)

);
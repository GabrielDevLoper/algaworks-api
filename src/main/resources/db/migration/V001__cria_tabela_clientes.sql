CREATE TABLE clientes
(
    id       int          NOT NULL AUTO_INCREMENT,
    nome     varchar(255) NOT NULL,
    email    varchar(255) NOT NULL,
    telefone varchar(60)  NOT NULL,

    PRIMARY KEY (id)
);
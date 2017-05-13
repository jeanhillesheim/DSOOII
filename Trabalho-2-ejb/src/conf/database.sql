/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  jean
 * Created: May 8, 2017
 */

create table usuario (
    id INT NOT NULL GENERATED ALWAYS AS IDENTITY
            (START WITH 1, INCREMENT BY 1), 
    nome VARCHAR(40) NOT NULL, 
    email VARCHAR(64), 
    senha VARCHAR(40),
    PRIMARY KEY (id)
);

create table viagem (
    id INT NOT NULL GENERATED ALWAYS AS IDENTITY
            (START WITH 1, INCREMENT BY 1), 
    origem VARCHAR(100),
    destino VARCHAR(100), 
    PRIMARY KEY (id)
);

create table passagem (
    id INT NOT NULL GENERATED ALWAYS AS IDENTITY
            (START WITH 1, INCREMENT BY 1), 
    valor INT,
    data_hora TIMESTAMP, 
    assentos_disponiveis INT,
    id_viagem INT,
    PRIMARY KEY (id),
    FOREIGN KEY (id_viagem) references viagem (id)
);

create table reserva (
    id INT NOT NULL GENERATED ALWAYS AS IDENTITY
            (START WITH 1, INCREMENT BY 1), 
    id_usuario INT,
    id_passagem INT,
    PRIMARY KEY (id),
    FOREIGN KEY (id_usuario) references usuario (id),
    FOREIGN KEY (id_passagem) references passagem (id)
);


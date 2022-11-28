/* modelo logico kings menu: */

/*IF DB_ID('menu') IS NOT NULL
   DROP DATABASE menu;

CREATE DATABASE menu;

USE menu;*/

CREATE TABLE cliente (
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(120) NOT NULL,
    cpf VARCHAR(15) NOT NULL,
    telefone VARCHAR(15),
    email VARCHAR(120),
    senha VARCHAR(120) NOT NULL,
    data_nascimento DATE NOT NULL
);

CREATE TABLE endereco (
	 id_endereco INT PRIMARY KEY AUTO_INCREMENT,
    rua VARCHAR(50) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    complemento VARCHAR(50),
    cep VARCHAR(20) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    cidade VARCHAR(30) NOT NULL,
    estado VARCHAR(2) NOT NULL,
    CONSTRAINT UK_ENDERECO UNIQUE (rua, numero, complemento, cep, bairro, cidade, estado)
);

CREATE TABLE item_venda (
    id_item_venda INT PRIMARY KEY AUTO_INCREMENT,
    id_venda INT NOT NULL,
    id_produto INT NOT NULL,
    quantidade FLOAT NOT NULL
);

CREATE TABLE categorias (
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(40) NOT NULL UNIQUE,
    descricao VARCHAR(120)
);

CREATE TABLE produto (
    id_produto INT PRIMARY KEY AUTO_INCREMENT,
    id_categoria INT,
    nome VARCHAR(120) NOT NULL,
    descricao VARCHAR(240) NOT NULL,
    foto BLOB,
    valor DECIMAL(4,2) NOT NULL,
    estoque FLOAT
);

CREATE TABLE cupom_desconto (
    id_cupom INT PRIMARY KEY AUTO_INCREMENT,
    cupom VARCHAR(20) NOT NULL UNIQUE,
    data_validade DATETIME NOT NULL,
    valor_cupom DECIMAL(4,2) NOT NULL
);

CREATE TABLE venda (
    id_venda INT PRIMARY KEY AUTO_INCREMENT,
    id_cliente_endereco INT NOT NULL,
    id_cupom INT,
    valor_taxa_entrega DECIMAL(4,2) NOT NULL,
    valor_total DECIMAL(6,2) NOT NULL,
    data_hora_pedido DATETIME NOT NULL,
    data_hora_entrega DATETIME,
    status_pedido CHAR(1) NOT NULL
);

CREATE TABLE Endereco_entrega_cliente (
    id_endereco_entrega INT PRIMARY KEY AUTO_INCREMENT,
    id_endereco INT NOT NULL,
    id_cliente INT NOT NULL,
    CONSTRAINT UK_ENDERECO_CLIENTE UNIQUE (id_endereco, id_cliente)
);
 
ALTER TABLE item_venda ADD CONSTRAINT FK_item_venda_id_venda
    FOREIGN KEY (id_venda)
    REFERENCES venda (id_venda);
 
ALTER TABLE item_venda ADD CONSTRAINT FK_item_venda_id_produto
    FOREIGN KEY (id_produto)
    REFERENCES produto (id_produto);
 
ALTER TABLE produto ADD CONSTRAINT FK_produto_id_categoria
    FOREIGN KEY (id_categoria)
    REFERENCES categorias (id_categoria);
 
ALTER TABLE venda ADD CONSTRAINT FK_venda_id_cupom
    FOREIGN KEY (id_cupom)
    REFERENCES cupom_desconto (id_cupom);
 
ALTER TABLE venda ADD CONSTRAINT FK_venda_id_endereco_entrega
    FOREIGN KEY (id_cliente_endereco)
    REFERENCES Endereco_entrega_cliente (id_endereco_entrega);
 
ALTER TABLE Endereco_entrega_cliente ADD CONSTRAINT FK_Endereco_entrega_cliente_id_endereco
    FOREIGN KEY (id_endereco)
    REFERENCES endereco (id_endereco);
 
ALTER TABLE Endereco_entrega_cliente ADD CONSTRAINT FK_Endereco_entrega_cliente_id_cliente
    FOREIGN KEY (id_cliente)
    REFERENCES cliente (id_cliente);
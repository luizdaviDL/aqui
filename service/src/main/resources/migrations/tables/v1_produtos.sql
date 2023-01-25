CREATE TABLE tb_produto(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(33),
	CONSTRAINT categoria FOREIGN KEY(tb_categoria) REFERENCES tb_categoria(id)
);
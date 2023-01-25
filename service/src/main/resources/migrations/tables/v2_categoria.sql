
CREATE TABLE tb_categoria(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(33),
	CONSTRAINT produtos FOREIGN KEY(tb_produto) REFERENCES tb_produto(id)
);
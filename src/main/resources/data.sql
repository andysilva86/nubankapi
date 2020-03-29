-- TABELA PARA ARMAZENAR EM MEMORIA OS DADOS PARA TESTES FEATURE
INSERT INTO TBL_CLIENTE (NOME,SENHA, SALDO, CREDITOFACIL) VALUES
  ('Paulo','123456', 50.08, true),
  ('Anderson', '123456', 25.50,  true),
  ('FIAP', '123456', 10000.08, true);

INSERT INTO TBL_LOGIN (USUARIO, SENHA, STATUS_AUTENTICACAO) VALUES
  ('Paulo','123456',false),
  ('Anderson', '123456',false),
  ('FIAP', '123456',false);
  
  
  DROP TABLE IF EXISTS TBL_TRANSACAO;
CREATE TABLE TBL_TRANSACAO(
  ID_TRANSACAO INT AUTO_INCREMENT  PRIMARY KEY,
  ID_CONTA INT,
  DESCRICAO_T VARCHAR(250),
  VALOR_T REAL DEFAULT 0,
  DATA_T DATE
);

INSERT INTO TBL_TRANSACAO (ID_CONTA, DESCRICAO_T, VALOR_T, DATA_T) VALUES
  (1,'Depósito realizado',50.00,CURRENT_DATE),
  (1,'Depósito realizado',50.00,CURRENT_DATE),
  (1,'Crédito contratado',50.00,CURRENT_DATE),
  (1,'Crédito contratado',50.00,CURRENT_DATE),
  (1,'Depósito realizado',50.00,CURRENT_DATE),
  (1,'Transferência realizada',51.10,CURRENT_DATE),
  (2,'Depósito realizado',50.00,CURRENT_DATE),
  (2,'Depósito realizado',50.00,CURRENT_DATE),
  (2,'Crédito contratado',53.00,CURRENT_DATE),
  (2,'Crédito contratado',56.10,CURRENT_DATE),
  (2,'Depósito realizado',50.00,CURRENT_DATE),
  (2,'Transferência realizada',50.00,CURRENT_DATE),
  (3,'Depósito realizado',50.20,CURRENT_DATE),
  (3,'Depósito realizado',50.76,CURRENT_DATE),
  (3,'Crédito contratado',70.00,CURRENT_DATE),
  (3,'Crédito contratado',50.07,CURRENT_DATE),
  (3,'Depósito realizado',70.08,CURRENT_DATE),
  (3,'Transferência realizada',90.00,CURRENT_DATE),
  (3,'Depósito realizado',100.00,CURRENT_DATE);
  
-- TABELA PARA ARMAZENAR EM MEMORIA OS DADOS PARA TESTES FEATURE
INSERT INTO TBL_CLIENTE (NOME,SENHA, SALDO, CREDITOFACIL) VALUES
  ('Paulo','123456', 50.08, true),
  ('Anderson', '123456', 25.50,  true),
  ('FIAP', '123456', 10000.08, true);

INSERT INTO TBL_LOGIN (USUARIO, SENHA, STATUS_AUTENTICACAO) VALUES
  ('Paulo','123456',false),
  ('Anderson', '123456',false),
  ('FIAP', '123456',false);
  
  
INSERT INTO TBL_TRANSACAO (ID_CONTA, DESCRICAO_T, VALOR_T, DATA_T) VALUES
  (1,'Depósito realizado',50.00,CURRENT_DATE),
  (1,'Depósito realizado',50.00,'2020-03-24'),
  (1,'Crédito contratado',50.00,'2020-03-29'),
  (1,'Crédito contratado',50.00,'2020-03-23'),
  (1,'Depósito realizado',50.00,CURRENT_DATE),
  (1,'Transferência realizada',51.10,'2020-03-29'),
  (2,'Depósito realizado',50.00,'2020-03-29'),
  (2,'Depósito realizado',50.00,'2020-03-22'),
  (2,'Crédito contratado',53.00,CURRENT_DATE),
  (2,'Crédito contratado',56.10,'2020-03-21'),
  (2,'Depósito realizado',50.00,'2020-03-20'),
  (2,'Transferência realizada',50.00,'2020-03-29'),
  (3,'Depósito realizado',50.20,'2020-02-29'),
  (3,'Depósito realizado',50.76,'2020-05-29'),
  (3,'Crédito contratado',70.00,'2020-02-29'),
  (3,'Crédito contratado',50.07,'2020-01-29'),
  (3,'Depósito realizado',70.08,'2020-05-29'),
  (3,'Transferência realizada',90.00,CURRENT_DATE),
  (3,'Depósito realizado',100.00,'2020-01-29');
  
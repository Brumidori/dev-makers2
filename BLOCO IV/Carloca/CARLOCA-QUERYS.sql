USE CARLOCA;

SELECT * FROM CARLOCA.CARROS;

SELECT * FROM CARLOCA.LOCACOES;

SELECT c.NOME, l.DATA_LOCACAO, l.DATA_DEVOLUCAO, l.KM_INICIAL, l.KM_FINAL
FROM LOCACOES l
JOIN CLIENTES c ON l.ID_CLIENTE = c.ID
WHERE l.ID_CARRO = 1;




 
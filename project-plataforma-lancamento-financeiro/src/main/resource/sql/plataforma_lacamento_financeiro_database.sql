-- VERIFICAR TODOS OS BANCOS DE DADOS
SELECT DATNAME FROM PG_DATABASE WHERE DATISTEMPLATE = FALSE;

-- CIAR BANCO DE DADOS
-- CREATE DATABASE db_plfd;
-- DROP DATABASE db_financeiro_desenvolvimento;

-- INTERROMPER CONEXAO DE TODOS OS USUARIOS PARA UM DETERMINADO BANCO DE DADOS 
SELECT PG_TERMINATE_BACKEND (PG_STAT_ACTIVITY.PID)
FROM PG_STAT_ACTIVITY
WHERE PG_STAT_ACTIVITY.DATNAME ILIKE 'PLATAFORMA_LANCAMENTO_FINANCEIRO';

SELECT PG_TERMINATE_BACKEND(PID) FROM PG_STAT_ACTIVITY WHERE PID <> PG_BACKEND_PID();

-- CONSULTAS

-- TB_ATIVO CIRCULANTE
SELECT * FROM PUBLIC.TB_ATIVO_CIRCULANTE;

SELECT CODIGO,
	   DATA_RECEBIMENTO,
	   ID_DESTINO_PAGAMENTO,
	   ID_FONTE_PAGAMENTO,
	   VALOR_PARCELA
FROM PUBLIC.TB_ATIVO_CIRCULANTE;




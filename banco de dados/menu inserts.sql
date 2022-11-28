-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.24-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Copiando dados para a tabela menu.categorias: ~14 rows (aproximadamente)
INSERT INTO `categorias` (`id_categoria`, `nome`, `descricao`) VALUES
	(1, 'Açai', NULL),
	(2, 'Lanches', 'Lanches quentes e frios a moda da casa'),
	(3, 'Sobremesas', 'Doces e sobremesas'),
	(4, 'Porções', 'Diversas opções de pedidos de porções'),
	(5, 'Pratos', 'Pratos quentes e frios preparados a moda da casa'),
	(6, 'Bebidas', 'Bebidas em geral'),
	(7, 'Promoção', '50% de desconto'),
	(8, 'Entradas', 'Cheviche marinado com finas fatias de pimentão, cebola roxa e pimenta de cheiro ou dedo de moça'),
	(9, 'Entradas especiais', 'Harumaki(Pastel Japonês)'),
	(10, 'Sashimi', '8 unidades'),
	(11, 'Nigiri', '6 unidades'),
	(12, 'Temakis', 'Sushi em forma de conne com molho cítrico'),
	(13, 'Petisco', 'Com molho cítrico'),
	(14, 'Combinados', NULL);

-- Copiando dados para a tabela menu.cliente: ~30 rows (aproximadamente)
INSERT INTO `cliente` (`id_cliente`, `nome`, `cpf`, `telefone`, `email`, `senha`, `data_nascimento`) VALUES
	(1, 'Luciana Juliana Dias', '358.430.998-06', '(19) 99697-9006', 'luciana.juliana.dias@cedda.com.br', 'gthayY8Ncg', '1953-01-02'),
	(2, 'Renato Enrico Rodrigues', '684.431.908-84', '(19) 98560-6279', 'renatoenricorodrigues@alcoa.com.br', '8ncyA7ezj3', '1986-06-02'),
	(3, 'Pietra Rafaela Mariah Nascimento', '389.378.408-04', '(19) 99962-5152', 'pietra_nascimento@hushmail.com', 'Z5n7EBkSBh', '1973-08-10'),
	(4, 'Yago Breno Rafael Mendes', '686.997.128-55', '(19) 99329-9637', 'yago.breno.mendes@consorciobcv.com.br', 'dCQlqIozSz', '1989-06-27'),
	(5, 'Débora Brenda Campos', '495.564.848-76', '(19) 98658-4554', 'debora-campos74@panevale.com.br', 'ZkmhEB3FP1', '1958-04-09'),
	(6, 'Rosângela Letícia Isadora Melo', '119.584.698-31', '(19) 98559-3578', 'rosangela.leticia.melo@studiodeideias.com', 'al5sckCO5H', '1979-02-20'),
	(7, 'Alexandre Noah Farias', '765.641.118-60', '(19) 99180-7312', 'alexandre_noah_farias@realbit.com.br', 'W7lbtateQO', '1942-08-04'),
	(8, 'Silvana Antônia Rebeca Corte Real', '149.649.038-00', '(19) 98789-1634', 'silvanaantoniacortereal@unimedara.com.br', 'KD2KGlHQ8X', '1995-02-21'),
	(9, 'Ayla Fabiana Assunção', '446.643.018-71', '(19) 98545-4254', 'ayla-assuncao73@damataemporionatural.com.br', 'RW5SQMmJsO', '1963-01-10'),
	(10, 'Edson Matheus Francisco Carvalho', '910.913.498-00', '(19) 99389-1593', 'edson-carvalho77@lordello.com.br', 'r6W8BYYguL', '1950-11-02'),
	(11, 'Débora Elza dos Santos', '791.504.088-01', '(19) 99890-6599', 'debora_dossantos@br.com.br', 'pMZ0jpGZRz', '1966-01-26'),
	(12, 'Gabriela Silvana Isabella Almada', '030.829.768-75', '(19) 98475-1995', 'gabriela-almada76@outlook.com', 'SDM2XpbYlF', '2004-10-14'),
	(13, 'Renato Rodrigo Isaac da Cunha', '726.845.578-02', '(19) 99714-6895', 'renato.rodrigo.dacunha@ogn.com.br', 'r6Nht0Er47', '2002-06-13'),
	(14, 'Fabiana Fernanda Ribeiro', '673.399.928-55', '(19) 99724-6976', 'fabiana_ribeiro@konekoshouten.com.br', 'KnI6cFfl4l', '1951-05-20'),
	(15, 'Carolina Laura Letícia Silva', '480.682.528-00', '(19) 98798-1662', 'carolina_laura_silva@soelegancia.com.br', 'mMh5BCgpax', '1970-04-23'),
	(16, 'Agatha Stella Fernanda Brito', '581.685.568-95', '(19) 99881-3409', 'agatha.stella.brito@destaco.com', 'F2L6659jlw', '1943-03-20'),
	(17, 'Benedita Betina Figueiredo', '996.448.608-10', '(19) 98218-7042', 'beneditabetinafigueiredo@sgstelecom.com.br', '3N6724yw4Q', '1944-03-26'),
	(18, 'Bruno Severino Rocha', '495.085.198-51', '(19) 98835-3351', 'bruno.severino.rocha@jcoronel.com.br', 'm7fIT0TpB7', '1951-02-13'),
	(19, 'Ayla Adriana Gonçalves', '345.796.328-26', '(19) 98170-9124', 'ayla_adriana_goncalves@carolpessoa.com.br', 'NiGpP9W6pu', '1982-11-01'),
	(20, 'Luís Rodrigo Danilo Alves', '909.606.498-40', '(19) 99651-2586', 'luis_alves@tce.am.gov.br', '2LN23RcuEI', '1983-11-04'),
	(21, 'Bernardo Ricardo Cavalcanti', '580.656.698-67', '(19) 98144-8299', 'bernardo_ricardo_cavalcanti@chiba.net.br', 'nSITRnC1AT', '2004-08-11'),
	(22, 'Vitor Vinicius Aparício', '411.394.368-05', '(19) 99123-7991', 'vitor-aparicio70@db4.com.br', 'Dtr8UDn0IX', '1948-01-15'),
	(23, 'Marcela Carolina Pereira', '617.169.228-01', '(19) 99245-1441', 'marcela_pereira@verdana.com.br', 'puGk7Ij8yc', '1973-06-26'),
	(24, 'Benedita Sarah Ferreira', '701.190.458-18', '(19) 98500-4347', 'benedita_ferreira@outlook.com.br', 'BR4Y8qJD6n', '1982-11-04'),
	(25, 'Sophia Rafaela Galvão', '454.597.408-27', '(19) 98378-9696', 'sophia_galvao@heindmec.com.br', 'cXLWFrDCkt', '1964-02-16'),
	(26, 'Kamilly Carolina Eliane Ramos', '515.076.628-31', '(19) 98959-8443', 'kamilly_ramos@acaocontabilsjc.com.br', '3aYTO5KPdy', '1984-04-27'),
	(27, 'Arthur Mário Danilo Duarte', '470.611.578-79', '(19) 99479-5376', 'arthurmarioduarte@virage.com.br', 'dhax88p35o', '1998-05-25'),
	(28, 'Luiz Francisco Lucca Bernardes', '931.086.018-90', '(19) 98596-8753', 'luizfranciscobernardes@com.br', 'EQA5PIDItg', '1949-03-18'),
	(29, 'Noah Diego Severino Fernandes', '806.628.138-20', '(19) 99951-7037', 'noah.diego.fernandes@unimedrio.com.br', 'BRbQyTlpsO', '1952-10-22'),
	(30, 'Heloisa Heloise Martins', '502.440.918-38', '(19) 98346-0849', 'heloisa.heloise.martins@rodomen.com.br', 'CKG74Po7IT', '1980-06-02');

-- Copiando dados para a tabela menu.cupom_desconto: ~0 rows (aproximadamente)
INSERT INTO `cupom_desconto` (`id_cupom`, `cupom`, `data_validade`, `valor_cupom`) VALUES
	(1, 'XXX', '2022-12-31 23:59:59', 10.00);

-- Copiando dados para a tabela menu.endereco: ~30 rows (aproximadamente)
INSERT INTO `endereco` (`id_endereco`, `rua`, `numero`, `complemento`, `cep`, `bairro`, `cidade`, `estado`) VALUES
	(11, 'Avenida Anchieta 200', '506', '11º andar', '13015-906', 'Centro', 'Campinas', 'SP'),
	(27, 'Avenida Doutor Luís de Tella', '344', NULL, '13083-000', 'Cidade Universitária', 'Campinas', 'SP'),
	(3, 'Avenida Martinho Lutero', '361', NULL, '13056-160', 'Jardim São Pedro de Viracopos', 'Campinas', 'SP'),
	(29, 'Rua Alcina Martins Vilani', '680', NULL, '13056-708', 'Parque União da Vitória', 'Campinas', 'SP'),
	(28, 'Rua Aparecida Silva', '171', NULL, '13082-320', 'Jardim Campineiro', 'Campinas', 'SP'),
	(30, 'Rua Aristeu Augusto', '539', NULL, '13065-230', 'Parque Via Norte', 'Campinas', 'SP'),
	(7, 'Rua Benedito de Oliveira', '984', NULL, '13059-611', 'Cidade Satélite Íris', 'Campinas', 'SP'),
	(1, 'Rua Cecília Meireles', '862', NULL, '13083-893', 'Cidade Universitária', 'Campinas', 'SP'),
	(9, 'Rua Cícero de Melo Araújo', '888', NULL, '13085-630', 'Residencial Terras do Barão', 'Campinas', 'SP'),
	(18, 'Rua Cinco', '346', NULL, '13053-104', 'Cidade Singer', 'Campinas', 'SP'),
	(17, 'Rua dos Juazeiros', '132', NULL, '13064-747', 'Vila Boa Vista', 'Campinas', 'SP'),
	(21, 'Rua Doutor Adolfo Barbalho de Uchoa Cavalcanti', '920', NULL, '13092-200', 'Jardim Lumen Christi', 'Campinas', 'SP'),
	(10, 'Rua Doutor Vieira Bueno', '485', NULL, '13024-040', 'Cambuí', 'Campinas', 'SP'),
	(5, 'Rua Fiorindo Cazotti', '909', NULL, '13080-030', 'Jardim Santa Genebra', 'Campinas', 'SP'),
	(19, 'Rua Francisco Gomes de Sousa', '736', NULL, '13049-133', 'Jardim Monte Cristo/Parque Oziel', 'Campinas', 'SP'),
	(2, 'Rua Henedina Oliveira Bresler', '552', NULL, '13096-320', 'Jardim Santa Eudóxia', 'Campinas', 'SP'),
	(16, 'Rua Jandyra de Campos Langone', '285', NULL, '13059-056', 'Jardim Florence', 'Campinas', 'SP'),
	(25, 'Rua José Joaquim Marcelino', '951', NULL, '13064-651', 'Chácara Nova Boa Vista', 'Campinas', 'SP'),
	(4, 'Rua Manoel de Aquino Pereira', '405', NULL, '13060-632', 'Jardim Yeda', 'Campinas', 'SP'),
	(15, 'Rua Mário Garnero', '711', NULL, '13104-000', 'Parque Jatibaia (Sousas)', 'Campinas', 'SP'),
	(13, 'Rua Mario Righi', '353', NULL, '13049-575', 'Swiss Park', 'Campinas', 'SP'),
	(12, 'Rua Mauro Beletatti', '379', NULL, '13098-838', 'Loteamento Chácaras Gargantilhas', 'Campinas', 'SP'),
	(20, 'Rua Moisés Gadia', '475', NULL, '13050-005', 'Jardim do Lago', 'Campinas', 'SP'),
	(23, 'Rua Oswaldo Stefanelli', '301', NULL, '13058-577', 'Parque Valença II', 'Campinas', 'SP'),
	(14, 'Rua Pedro Claudio Simionatto', '823', NULL, '13049-282', 'Swiss Park', 'Campinas', 'SP'),
	(6, 'Rua Rio Iguapó', '921', NULL, '13058-682', 'Residencial Colina das Nascentes', 'Campinas', 'SP'),
	(24, 'Rua Rio Pantanal', '213', NULL, '13058-695', 'Residencial Colina das Nascentes', 'Campinas', 'SP'),
	(8, 'Rua Rocha Camargo', '433', NULL, '13073-220', 'Jardim Guanabara', 'Campinas', 'SP'),
	(26, 'Rua Serafim Piazon', '200', NULL, '13045-675', 'Vila Joaquim Inácio', 'Campinas', 'SP'),
	(22, 'Ruela Ranusia Alves Rodrigues', '717', NULL, '13049-122', 'Jardim Monte Cristo/Parque Oziel', 'Campinas', 'SP');

-- Copiando dados para a tabela menu.endereco_entrega_cliente: ~36 rows (aproximadamente)
INSERT INTO `endereco_entrega_cliente` (`id_endereco_entrega`, `id_endereco`, `id_cliente`) VALUES
	(1, 1, 1),
	(4, 2, 2),
	(3, 3, 1),
	(6, 3, 3),
	(8, 4, 4),
	(9, 5, 5),
	(10, 6, 6),
	(5, 7, 2),
	(12, 7, 7),
	(7, 8, 3),
	(13, 8, 8),
	(15, 9, 9),
	(16, 10, 10),
	(17, 11, 11),
	(18, 12, 12),
	(19, 13, 13),
	(20, 14, 14),
	(2, 15, 1),
	(11, 15, 6),
	(21, 15, 15),
	(22, 16, 16),
	(23, 17, 17),
	(24, 18, 18),
	(25, 19, 19),
	(26, 20, 20),
	(27, 21, 21),
	(14, 22, 8),
	(28, 22, 22),
	(29, 23, 23),
	(30, 24, 24),
	(31, 25, 25),
	(32, 26, 26),
	(33, 27, 27),
	(34, 28, 28),
	(35, 29, 29),
	(36, 30, 30);

-- Copiando dados para a tabela menu.item_venda: ~7 rows (aproximadamente)
INSERT INTO `item_venda` (`id_item_venda`, `id_venda`, `id_produto`, `quantidade`) VALUES
	(1, 1, 22, 1),
	(2, 1, 16, 1),
	(3, 1, 17, 1),
	(4, 2, 28, 2),
	(7, 3, 23, 3),
	(10, 4, 30, 1),
	(11, 5, 29, 1);

-- Copiando dados para a tabela menu.produto: ~30 rows (aproximadamente)
INSERT INTO `produto` (`id_produto`, `id_categoria`, `nome`, `descricao`, `foto`, `valor`, `estoque`) VALUES
	(1, 8, 'Peixe Branco', 'Chevichê com Peixe Branco', NULL, 18.00, NULL),
	(2, 8, 'Salmão', 'Chevichê com Salmão', NULL, 20.00, NULL),
	(3, 9, 'Camarão', 'Harumaki(Pastel Japonês) com Camarão', NULL, 15.00, NULL),
	(4, 9, 'Salmão', 'Harumaki(Pastel Japonês) com Salmão', NULL, 15.00, NULL),
	(5, 9, 'Queijo', 'Harumaki(Pastel Japonês) com Queijo', NULL, 10.00, NULL),
	(6, 9, 'Atum com Gongorzola', 'Harumaki(Pastel Japonês) com Atum e Gongorzola', NULL, 15.00, NULL),
	(7, 9, 'Queijo coalho c/ gorgonzola', 'Harumaki(Pastel Japonês) com Queijo coalho e Gongorzola', NULL, 15.00, NULL),
	(8, 9, 'Romeu & Julieta', 'Harumaki(Pastel Japonês) com Romeu & Julieta', NULL, 12.00, NULL),
	(9, 10, 'Peixe Branco', 'Sashimi(8 unid.) com Peixe Branco', NULL, 15.00, NULL),
	(10, 10, 'Salmão', 'Sashimi(8 unid.) com Salmão', NULL, 20.00, NULL),
	(11, 10, 'Atum', 'Sashimi(8 unid.) com Atum', NULL, 15.00, NULL),
	(12, 10, 'Camarão', 'Sashimi(8 unid.) com Camarão', NULL, 20.00, NULL),
	(13, 11, 'Peixe Branco', 'Nigiri(6 unid.) com Peixe Branco', NULL, 15.00, NULL),
	(14, 11, 'Salmão', 'Nigiri(6 unid.) com Salmão', NULL, 20.00, NULL),
	(15, 11, 'Atum', 'Nigiri(6 unid.) com Atum', NULL, 15.00, NULL),
	(16, 11, 'Camarão', 'Nigiri(6 unid.) com Camarão', NULL, 20.00, NULL),
	(17, 13, 'Camarão Crocante', 'Petisco de Camarão Crocante', NULL, 35.00, NULL),
	(18, 13, 'Peixe Crocante', 'Petisco de Peixe Crocante', NULL, 25.00, NULL),
	(19, 12, 'Salmão', 'Temaki sushi em forma de conne com Salmão', NULL, 20.00, NULL),
	(20, 12, 'Atum', 'Temaki sushi em forma de conne com Atum', NULL, 20.00, NULL),
	(21, 12, 'Filadélfia Salmão', 'Com recheio de salmão, creme cheese', NULL, 18.00, NULL),
	(22, 12, 'Skin Shake', 'Pele de Salmão grelhado, salmão fresco, creme cheese', NULL, 16.00, NULL),
	(23, 12, 'Kani Shake', 'Recheio de Salmão, Kani e creme cheese', NULL, 18.00, NULL),
	(24, 12, 'Temaki Hot', 'Salmão, creme cheese, empanado e molho teriyaki', NULL, 25.00, NULL),
	(25, 12, 'Crocante', 'Salmão empanado com creme cheese e molho teriyaki', NULL, 20.00, NULL),
	(26, 12, 'Ebi Crocante', 'Camarão empanado, creme cheese, cebolinha e molho teriyaki', NULL, 20.00, NULL),
	(27, 14, 'Praia de Atalaia', '4 Sashimi, 4 Uramaki Filadelfia, 4 Niguri, 4 Hossomaki California', NULL, 37.00, NULL),
	(28, 14, 'Barra Velha', '6 Sashimi peixes variados, 4 Hot, 4 Uramaki Filadelfia, 4 Hossomaki Skin', NULL, 45.00, NULL),
	(29, 14, 'Cavalo Marinho', '8 Sashimi peixes variados dois de cada, 4 Uramaki, 4 Joemaki, 4 Hossomaki', NULL, 55.00, NULL),
	(30, 14, 'Canes Sushi', '8 Sashimi de peixes variados, 4 Sashimi flambado, 6 Jow Jow de atum, 4 Hossomaki salmão grelhadoi, 4 Kani shake, 4 Urumaki de atum', NULL, 77.00, NULL);

-- Copiando dados para a tabela menu.venda: ~5 rows (aproximadamente)
INSERT INTO `venda` (`id_venda`, `id_cliente_endereco`, `id_cupom`, `valor_taxa_entrega`, `valor_total`, `data_hora_pedido`, `data_hora_entrega`, `status_pedido`) VALUES
	(1, 1, NULL, 5.00, 71.00, '2022-11-16 19:40:00', '2022-11-16 19:56:47', '4'),
	(2, 2, 1, 15.00, 90.00, '2022-11-16 19:50:00', '2022-11-16 20:02:44', '4'),
	(3, 10, NULL, 10.00, 54.00, '2022-11-16 20:00:00', NULL, '1'),
	(4, 20, 1, 12.00, 77.00, '2022-11-16 20:05:00', NULL, '1'),
	(5, 15, NULL, 0.00, 55.00, '2022-11-16 20:10:00', NULL, '1');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

CREATE TABLE `produtos` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `nome` varchar(90) DEFAULT NULL,
                            `descricao` varchar(90) DEFAULT NULL,
                            `preco` float DEFAULT NULL,
                            `quantidade` int DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
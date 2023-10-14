-- Adicionando Categorias de livros
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Ação');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Aventura');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Romance');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Terror');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Ficção Científica');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Autoajuda');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Biografia');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Didático');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Infantil');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'HQ');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Mangá');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Religião');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Policial');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Fantasia');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Suspense');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Drama');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Crônica');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Poesia');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Conto');
INSERT INTO categoria (id, nome) VALUES (UUID(), 'Teatro');

-- Adicionando Autores
INSERT INTO autor (id, nome, data_nascimento, biografia, url_foto, nacionalidade) VALUES (UUID(), 'J.K. Rowling', '1965-07-31', 'Escritora britânica famosa por escrever a série Harry Potter', 'jk_rowling.jpg', 'Reino Unido');
INSERT INTO autor (id, nome, data_nascimento, biografia, url_foto, nacionalidade) VALUES (UUID(), 'George Orwell', '1903-06-25', 'Escritor e ensaísta britânico autor de "1984" e "A Revolução dos Bichos"', 'george_orwell.jpg', 'Reino Unido');
INSERT INTO autor (id, nome, data_nascimento, biografia, url_foto, nacionalidade) VALUES (UUID(), 'Gabriel García Márquez', '1927-03-06', 'Escritor colombiano e autor de "Cem Anos de Solidão"', 'gabriel_garcia_marquez.jpg', 'Colômbia');
INSERT INTO autor (id, nome, data_nascimento, biografia, url_foto, nacionalidade) VALUES (UUID(), 'Agatha Christie', '1890-09-15', 'Escritora britânica conhecida por seus romances de mistério', 'agatha_christie.jpg', 'Reino Unido');
INSERT INTO autor (id, nome, data_nascimento, biografia, url_foto, nacionalidade) VALUES (UUID(), 'Haruki Murakami', '1949-01-12', 'Escritor japonês famoso por obras como "Norwegian Wood" e "1Q84"', 'haruki_murakami.jpg', 'Japão');
INSERT INTO autor (id, nome, data_nascimento, biografia, url_foto, nacionalidade) VALUES (UUID(), 'Stephen King', '1947-09-21', 'Escritor norte-americano conhecido por seus livros de terror', 'stephen_king.jpg', 'Estados Unidos');
INSERT INTO autor (id, nome, data_nascimento, biografia, url_foto, nacionalidade) VALUES (UUID(), 'Machado de Assis', '1839-06-21', 'Escritor brasileiro e considerado o maior nome da literatura nacional', 'machado_de_assis.jpg', 'Brasil');
INSERT INTO autor (id, nome, data_nascimento, biografia, url_foto, nacionalidade) VALUES (UUID(), 'Clarice Lispector', '1920-12-10', 'Escritora brasileira e autora de "A Hora da Estrela"', 'clarice_lispector.jpg', 'Brasil');
INSERT INTO autor (id, nome, data_nascimento, biografia, url_foto, nacionalidade) VALUES (UUID(), 'Jorge Amado', '1912-08-10', 'Escritor brasileiro e autor de "Gabriela, Cravo e Canela"', 'jorge_amado.jpg', 'Brasil');

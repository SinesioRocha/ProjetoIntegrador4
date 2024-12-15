insert into Perfil(categoria) values ("Administrador");
insert into Perfil(categoria) values ("Secretaria");
insert into Perfil(categoria) values ("Comprador");

insert into Veiculo(placa, modelo, ano) values ("RIO2A18", "Montana", "2014");
insert into Veiculo(placa, modelo, ano) values ("JHU8D09", "Strada", "2010");
insert into Veiculo(placa, modelo, ano) values ("DUJ4Y67", "S-10", "2016");

insert into Colaborador(nome, telefone, endreco, perfilfk_id) values ("Caio", "189964260", "Rua Pernambuco", 2);
insert into Colaborador(nome, telefone, endreco, perfilfk_id) values ("Sinesio ", "149964260", "Rua João", 1);
insert into Colaborador(nome, telefone, endreco, perfilfk_id) values ("Marink", "3355268", "Rua São Paulo", 3);

insert into Vendedor(nome, telefone, endreco, cnh, veiculofk_id) values ("Maycon", "149978546", "Avenida Presidente", "1234567890",1);
insert into Vendedor(nome, telefone, endreco, cnh, veiculofk_id) values ("João", "15856632", "Avenida Brasil", "9876543210",2);
insert into Vendedor(nome, telefone, endreco, cnh, veiculofk_id) values ("Pedro", "149978546", "Rua Unifio", "9876541230",3);

insert into Produto(nome, un_medida, preco, qtd_atula) values ("Ferilizante Bio Grow Biobizz - 500ml", "UN", 5.00, 100);
insert into Produto(nome, un_medida, preco, qtd_atula) values ("HERBICIDA ROUNDUP - 20L", "GL", 55.90, 80);
insert into Produto(nome, un_medida, preco, qtd_atula) values ("AVATAR INSETICIDA - 1L", "UN", 85.00, 50);

insert into Cliente(nome, telefone, endreco) values ("Edinho", "15223555", "Sitio São Pedro");
insert into Cliente(nome, telefone, endreco) values ("Bruno", "15223555", "Fazenda Boa Vista");
insert into Cliente(nome, telefone, endreco) values ("Alexandra", "15223555", "Fazendo Agua Boa");

insert into Pedidos(datap,  vl_total, clientefk_id, vendedorfk_id) values ("2023-08-31 10:05:10", 1380.00, 1, 3);
insert into Pedidos(datap,  vl_total, clientefk_id, vendedorfk_id) values ("2023-08-25 20:00:10", 1380.00, 2, 1);
insert into Pedidos(datap,  vl_total, clientefk_id, colaboradorfk_id) values ("2023-09-14 8:44:10", 1380.00, 3, 3);

insert into Pedidos_Produto(qtd, produtofk_id, pedidosfk_id) values (10, 1, 1);
insert into Pedidos_Produto(qtd, produtofk_id, pedidosfk_id) values (5, 2, 1);
insert into Pedidos_Produto(qtd, produtofk_id, pedidosfk_id) values (15, 3, 3);

insert into Agendamentos(dt_agen, colaboradorfk_id, clientefk_id) values ("2023-09-19 08:40:00", 1, 3);
insert into Agendamentos(dt_agen, vendedorfk_id, clientefk_id) values ("2023-09-20 08:00:00", 1, 2);
insert into Agendamentos(dt_agen, colaboradorfk_id, vendedorfk_id,clientefk_id) values ("2023-09-19 08:40:00", 1, 1, 3);

insert into Visitas(status, dt_hora, agendamentosfk_id, clientefk_id) values ("Cliente NÃO encotrado", "2023-09-19 09:00:00", 1, 3);
insert into Visitas(status, dt_hora, agendamentosfk_id, clientefk_id) values ("Venda Realizada", "2023-09-20 09:30:00", 2, 2);
insert into Visitas(status, dt_hora, agendamentosfk_id, clientefk_id) values ("Reagendar", "2023-09-20 08:30:00", 3, 3);

insert into Fotos(foto, comentario, visitasfk_id) values ("link-foto1", "Pantação com praga", 1);
insert into Fotos(foto, comentario, visitasfk_id) values ("link-foto2", "Pantação com praga", 1);
insert into Fotos(foto, comentario, visitasfk_id) values ("link-foto1", "Preparando para o Plantio", 2);
insert into Fotos(foto, comentario, visitasfk_id) values ("link-foto1", "Pantação recem fertilizada", 3);

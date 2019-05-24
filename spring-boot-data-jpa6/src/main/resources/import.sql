/* Populate tables */
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Juan Antonio', 'Jimenez', 'profesorjim@gmail.com', '2019-05-01', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Alberto', 'Gómez', 'admin@ival.com', '2019-05-01', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Iván', 'Pérez', 'designer@ival.com', '2019-05-02', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2019-05-03', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Alan', 'Brito', 'delgado@gmail.com', '2019-05-04', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Josep', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2019-05-05', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Conan', 'Edogawa', 'erich.gamma@gmail.com', '2019-05-06', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Morgan', 'Freeman', 'freeman@gmail.com', '2019-05-07', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Ralph', 'Wilson', 'ralph.johnson@gmail.com', '2019-05-08', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Juan', 'Molina', 'john.vlissides@gmail.com', '2019-05-09', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Auxi', 'Lio', 'auxilio@gmail.com', '2019-05-010', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Bruce', 'Lee', 'bruce.lee@gmail.com', '2019-05-11', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Johnny', 'Depp', 'johnny.depp@gmail.com', '2019-05-12', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('John', 'Roe', 'john.roe@gmail.com', '2019-05-13', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Jane', 'Roe', 'jane.roe@gmail.com', '2019-05-14', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Richard', 'Doe', 'richard.doe@gmail.com', '2019-05-15', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Janie', 'Doe', 'janie.doe@gmail.com', '2019-05-16', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Phillip', 'Webb', 'phillip.webb@gmail.com', '2019-05-17', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Stephane', 'Nicoll', 'stephane.nicoll@gmail.com', '2019-05-18', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Sam', 'Brannen', 'sam.brannen@gmail.com', '2019-05-19', '');  
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Juergen', 'Hoeller', 'juergen.Hoeller@gmail.com', '2019-05-20', ''); 
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Janie', 'Roe', 'janie.roe@gmail.com', '2019-05-21', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('John', 'Smith', 'john.smith@gmail.com', '2019-05-22', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Joe', 'Bloggs', 'joe.bloggs@gmail.com', '2019-05-23', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('John', 'Stiles', 'john.stiles@gmail.com', '2019-05-24', '');
INSERT INTO clientes (nombre, apellido, email, create_at, foto) VALUES('Richard', 'Roe', 'stiles.roe@gmail.com', '2019-05-25', '');



INSERT INTO productos (nombre, precio, create_at) VALUES('Panasonic Pantalla LCD', 2599.90, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Camara digital DSC-W320B', 1234.90, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Apple iPod shuffle', 14999.90, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Notebook Z110', 37990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Hewlett Packard Multifuncional F2280', 699.90, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Bianchi Bicicleta Aro 26', 699.90, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Mica Cómoda 5 Cajones', 2999.90, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Torres de Hanoi', 3.00, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Teclado UltraResistente', 99.99, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Geany full Version 2019', 159.99, NOW());

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de oficina', null, 2, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 7);
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura de Programación', 'Estoy muy Ocioso por que llegue', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 2, 8);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 2, 9);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 2, 10);



INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura Bicicleta', 'Frágil', 3, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 3, 6);
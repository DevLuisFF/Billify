-- crear la base de datos
create database Billify;

-- se establece que se usara esta base de datos
use Billify;

-- crear las tablas
-- creacion de tabla usuarios
create table tb_usuario(
idUsuario int (11) auto_increment primary key,
nombre varchar(30) not null,
apellido varchar(30) not null,
usuario varchar(15) not null,
contraseña varchar(15) not null,
telefono varchar(15) not null,
estado int(1) not null
);

-- inserte registros para permitir el login
insert into tb_usuario(nombre,apellido,usuario,contraseña,telefono,estado)
values("Luis","Ferreira","luis","12345","0982971037",1);

-- select para el login
select usuario, contraseña from tb_usuario 
where usuario = "luis" and contraseña = "12345";

-- creacion tabla clientes
create table tb_cliente(
idCliente int (11) auto_increment primary key,
nombre varchar(30) not null,
apellido varchar(30) not null,
cedula varchar(15) not null,
telefono varchar(15) not null,
direccion varchar(100) not null,
estado int(1) not null
);

-- creacion tabla categorias
create table tb_categoria(
idCategoria int (11) auto_increment primary key,
descripcion varchar(200) not null,
estado int(1) not null
);

select * from tb_categoria;

-- crear la tabla productos
create table tb_producto(
idProducto int (11) auto_increment primary key,
nombre varchar(100) not null,
cantidad int(11) not null,
precio double(10,2) not null,
descripcion varchar(200) not null,
porcentajeIva int(2) not null,
idCategoria int(11) not null,
estado int(1) not null
);

-- cabecera de venta
create table tb_cabecera_venta(
idCabeceraVenta int (11) auto_increment primary key,
idCliente int(11) not null,
valorPagar double(10,2) not null,
fechaVenta date not null,
estado int(1) not null
);

-- detalle venta
-- cabecera de venta
create table tb_detalle_venta(
idDetalleVenta int (11) auto_increment primary key,
idCabeceraVenta int(11) not null,
idProducto int(11) not null,
cantidad int(11) not null,
precioUnitario double(10,2) not null,
subTotal double(10,2) not null,
Descuento double(10,2) not null,
iva double(10,2) not null,
totalPagar double(10,2) not null,
estado int(1) not null
);


-- muestra de tabla
show tables;

-- muestra general
select * from tb_usuario;
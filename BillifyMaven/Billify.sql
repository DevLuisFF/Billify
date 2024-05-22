-- Crear la base de datos
CREATE DATABASE Billify;

-- Establecer el uso de la base de datos creada
USE Billify;

-- Crear tabla de usuarios
CREATE TABLE tb_usuario (
    idUsuario INT(11) AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
    usuario VARCHAR(15) NOT NULL,
    contraseña VARCHAR(15) NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    estado INT(1) NOT NULL
);

-- Insertar registros para permitir el login
INSERT INTO tb_usuario(nombre, apellido, usuario, contraseña, telefono, estado)
VALUES ("Luis", "Ferreira", "luis", "12345", "0982971037", 1);

-- Select para el login
SELECT usuario, contraseña FROM tb_usuario 
WHERE usuario = "luis" AND contraseña = "12345";

-- Crear tabla de clientes
CREATE TABLE tb_cliente (
    idCliente INT(11) AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
    cedula VARCHAR(15) NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    direccion VARCHAR(100) NOT NULL,
    estado INT(1) NOT NULL
);

-- Crear tabla de categorías
CREATE TABLE tb_categoria (
    idCategoria INT(11) AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(200) NOT NULL,
    estado INT(1) NOT NULL
);

-- Mostrar contenido de la tabla de categorías
SELECT * FROM tb_categoria;

-- Crear tabla de productos
CREATE TABLE tb_producto (
    idProducto INT(11) AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    cantidad INT(11) NOT NULL,
    precio DOUBLE(10,2) NOT NULL,
    descripcion VARCHAR(200) NOT NULL,
    porcentajeIva INT(2) NOT NULL,
    idCategoria INT(11) NOT NULL,
    estado INT(1) NOT NULL
);

-- Crear tabla de cabecera de venta
CREATE TABLE tb_cabecera_venta (
    idCabeceraVenta INT(11) AUTO_INCREMENT PRIMARY KEY,
    idCliente INT(11) NOT NULL,
    valorPagar DOUBLE(10,2) NOT NULL,
    fechaVenta DATE NOT NULL,
    estado INT(1) NOT NULL
);

-- Crear tabla de detalle de venta
CREATE TABLE tb_detalle_venta (
    idDetalleVenta INT(11) AUTO_INCREMENT PRIMARY KEY,
    idCabeceraVenta INT(11) NOT NULL,
    idProducto INT(11) NOT NULL,
    cantidad INT(11) NOT NULL,
    precioUnitario DOUBLE(10,2) NOT NULL,
    subTotal DOUBLE(10,2) NOT NULL,
    Descuento DOUBLE(10,2) NOT NULL,
    iva DOUBLE(10,2) NOT NULL,
    totalPagar DOUBLE(10,2) NOT NULL,
    estado INT(1) NOT NULL
);

-- Mostrar todas las tablas en la base de datos
SHOW TABLES;

-- Mostrar contenido de la tabla de usuarios
SELECT * FROM tb_usuario;

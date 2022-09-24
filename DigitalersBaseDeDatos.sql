create database if not exists Digitalers_practica_base_de_datos;

use Digitalers_practica_base_de_datos;

create table if not exists jefes
(
sucursal int,
id_jefe int auto_increment primary key,
nombre varchar(100),
telefono int
);

create table if not exists empleados
(
sucursal int,
id_jefe int,
id_empleado int auto_increment primary key,
nombre varchar(100),
telefono int,
fecha_de_ingreso date,
foreign key (id_jefe) references jefes(id_jefe),
foreign key (sucursal) references sucursales(id)
);

create table if not exists clientes
(
id_cliente int auto_increment primary key,
nombre_c varchar(100),
calle varchar(100),
ciudad varchar(100),
id_asesor int,
id_cta_cte int,
id_caja_de_ahorro int,
foreign key (id_asesor) references empleados(id_empleado),
foreign key (id_cta_cte) references cta_cte(id_cuenta),
foreign key (id_caja_de_ahorro) references caja_de_ahorro(id_cuenta)
);

create table if not exists sucursales
(
id int auto_increment primary key,
ciudad varchar(100),
calle varchar(100),
);

create table if not exists cta_cte
(
id_cuenta int auto_increment primary key,
id_cliente int,
pesos double
);

create table if not exists caja_de_ahorro
(
id_cuenta int auto_increment primary key,
id_cliente int,
pesos double
);

create table if not exists banco
(
sucursal int,
id_jefe int,
foreign key (sucursal) references sucursales(id),
foreign key (id_jefe) references jefes(id_jefe)
);





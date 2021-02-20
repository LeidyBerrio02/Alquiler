use alquiler;

select * from alquiler;
select * from detallealquiler;
select * from novedad;
select * from persona;	
select * from producto;                                     
select * from tipodocumento;
select * from tiponovedad;
select * from tipopersona;
select * from tipoproducto;

select count(idAlquiler) from alquiler;
select count(iddetallealquiler) from detallealquiler;
select count(idNovedad) from novedad;
select count(idpersona) from persona;
select count(idproducto) from producto;
select count(idtipodocumento) from tipodocumento;
select count(idtiponovedad) from tiponovedad;
select count(idtipopersona) from tipopersona;
select count(idtipoproducto) from tipoproducto;

insert into tipoPersona (tipopersona) values ("Cliente normal");
insert into tipoPersona (tipopersona) values ("Cliente exclusivo");

insert into tipodocumento (tipodocumento) values ("Tarjeta de indentidad");
insert into tipodocumento (tipodocumento) values ("Cedula");
insert into tipodocumento (tipodocumento) values ("Cedula extranjeria");
insert into tipodocumento (tipodocumento) values ("Pasaporte");

describe persona;

insert into persona (nombre,apellido,email,direccion,Tipodocumento_idTipoDocumento, numeroDocumento,Tipopersona_idTipoPersona) 
values ("leidy dotrlli","berrio salazar","leidy@mail.com","12 fi 44",2,"1002832",2);

insert into persona (nombre,apellido,email,direccion,Tipodocumento_idTipoDocumento, numeroDocumento,Tipopersona_idTipoPersona) 
values ("karen jimena","zapata","karen@mail.com","1cr 34 cll2",1,"19827388",2);

insert into persona (nombre,apellido,email,direccion,Tipodocumento_idTipoDocumento, numeroDocumento,Tipopersona_idTipoPersona) 
values ("sara","bueno","asaraaa@mail.com","cr 45 cll 67",2,"1000765",1);

select * from tipodocumento;
select idPersona, nombre,apellido,doc.TipoDocumento, numeroDocumento,Tipopersona_idTipoPersona , tp.TipoPersona
from persona p , tipodocumento doc, tipopersona tp
where p.TipoDocumento_idTipoDocumento = doc.idTipoDocumento and p.TipoPersona_idTipoPersona = tp.idTipoPersona;

select * from persona;
select * from tipodocumento;

select p.idPersona, p.nombre, p.apellido, p.email, p.direccion, tipodocumento.TipoDocumento, p.numeroDocumento, tipopersona.TipoPersona
from persona p 
inner join tipopersona on p.TipoPersona_idTipoPersona = tipopersona.idTipoPersona
inner join tipodocumento on p.idtipodocumento = tipodocumento.idTipoDocumento;

select * from canciones;
alter table canciones add column compositor varchar(45);
insert into canciones(nombreCancion , fechaEstreno,compositor) values ("Estuve Equivocada",'2013-11-22',"thalia");
insert into canciones(nombreCancion , fechaEstreno,compositor) values ("Hola",'2013-11-22',"camilo");
insert into canciones(nombreCancion , fechaEstreno,compositor) values ("Tengo Hambre",'2014-01-02',"jaimaica");
insert into canciones(nombreCancion , fechaEstreno,compositor) values ("i love you",'2013-11-22',"el amor");

select * from alquiler;
select * from detallealquiler;

alter table alquiler drop column Alquilercol;
alter table alquiler rename column fechaAlchiler to fechaAlquiler;

insert into alquiler (fechaAlquiler, fechaEntrega, Persona_idPersona) values  ('2020-11-02','2020-12-02',2);
insert into alquiler (fechaAlquiler, fechaEntrega, Persona_idPersona) values  ('2020-11-02','2020-12-02',1);
insert into alquiler (fechaAlquiler, fechaEntrega, Persona_idPersona) values  ('2020-11-02','2020-12-02',3);
insert into alquiler (fechaEntrega, Persona_idPersona) values  ('2020-12-02',12);

select * from detallealquiler;
alter table detallealquiler drop column DetalleAlquilercol;
insert into detallealquiler (Canciones_idCanciones,cantidadCanciones)  values (2,2);
insert into detallealquiler (Canciones_idCanciones,cantidadCanciones)  values (1,1);
insert into detallealquiler (Canciones_idCanciones,cantidadCanciones)  values (3,1);
insert into detallealquiler (Canciones_idCanciones,cantidadCanciones)  values (1,3);
insert into detallealquiler (Alquiler_idAlquiler,Producto_idProducto) values (6,2); 
insert into detallealquiler (Alquiler_idAlquiler,Producto_idProducto) values (6,1); 

/*Consultar las canciones que fueron alquiladas en un alquiler*/
select * from alquiler;
select * from detallealquiler;
select * from novedad;
select * from tipoNovedad;

select al.idAlquiler , al.fechaAlquiler , al.fechaEntrega as "Fecha de entrega" ,
producto.nombre, detallealquiler.cantidad , persona.nombre, novedad, novedad.descripcion
from alquiler al
inner join detallealquiler on al.idAlquiler = detallealquiler.Alquiler_idAlquiler 
inner join producto on producto.idProducto = detallealquiler.Canciones_idCanciones
inner join persona on persona.idPersona = al.Persona_idPersona
inner join novedad on novedad.idNovedad = al.idNovedad
inner join tipoNovedad on tipoNovedad.idTipoNovedad = novedad.idTipoNovedad;

create table tipoProducto(
idTipoProducto int not null primary key auto_increment,
tipoProducto varchar(45)
);
use alquiler;
show tables;

insert into tipoProducto values (1,"Cancion");
insert into tipoProducto values (2,"Pelicula");
insert into tipoProducto values (3,"CD clasico 80s");

select * from Producto;
alter table producto add foreign key (idTipoProducto) references tipoProducto(idTipoProducto);

update producto set idTipoProducto = 2 where idProducto =4;
alter table tiponovedad rename column novedad to novedadN;

use semillerojava;
show tables;
select * from cuenta;
select * from persona;

select tipodocumento,  idpersona ,persona.nombre
from tipodocumento , persona 
where idTipoDocumento = tipodocumento_idTipodocumento
order by tipodocumento;
select * from producto;
select * from detallealquiler;

delete from tipoNovedad where idtiponovedad=6;

alter table detallealquiler drop column precio ;
alter table detallealquiler add column total double;
alter table detallealquiler add column idDetalleAlquiler int not null primary key auto_increment;
drop table detalleAlquiler;
create table detalleAlquiler(
idDetalleAlquiler int not null primary key auto_increment,
Alquiler_idAlquiler int, foreign key (Alquiler_idAlquiler) references Alquiler(idAlquiler),
Producto_idProducto int, foreign key (Producto_idProducto) references Producto(idProducto));

alter table producto add column imagen varchar(225);
delete from novedad where idNovedad =5;


create table usuario(
idUsuario int primary key auto_increment not null,
username varchar(225),
password varchar(225),
estado tinyint
);

select * from usuario;

insert into usuario values (1,"ADMIN","123",1);
insert into usuario values (2,"USER","12345",1);
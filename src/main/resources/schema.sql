DROP TABLE IF EXISTS ARTICULO,Caja,Cajero,Venta;
CREATE TABLE ARTICULO (
  id_articulo INT AUTO_INCREMENT  PRIMARY KEY,
  precio DOUBLE (250),
  descripcion VARCHAR(250) NOT NULL
);
CREATE TABLE Caja (
      idCaja INT AUTO_INCREMENT  PRIMARY KEY,
      Estado BOOLEAN(250),
      Cajero INT AUTO_INCREMENT

);
CREATE TABLE Cajero (
                               id INT AUTO_INCREMENT  PRIMARY KEY,
                               Nombre VARCHAR(250) NOT NULL,
                               Apellido_Paterno VARCHAR(250) NOT NULL,
                               Apellido_Materno VARCHAR(250) DEFAULT NULL
);
CREATE TABLE Venta (
                       idVenta INT AUTO_INCREMENT  PRIMARY KEY,
                       id_articulo INT AUTO_INCREMENT,
                       id INT AUTO_INCREMENT,
                       idCaja INT AUTO_INCREMENT,
                       Total INT (2000)
);
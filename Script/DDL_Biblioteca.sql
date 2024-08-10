-- database: ../DataBase/Biblioteca.sqlite
/*
 CopyRight 
 autor: Grupo 4
 Fecha: 11 agosto 2024
 description: insertar datos
 */

DROP TABLE IF EXISTS Usuario;
DROP TABLE IF EXISTS Libro;
DROP TABLE IF EXISTS Prestamo;

CREATE TABLE Usuario (
     IDUsuario       INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Nombre          VARCHAR(10) NOT NULL
    ,ApellidoPaterno VARCHAR(10) NOT NULL
    ,ApellidoMaterno VARCHAR(10) NOT NULL
    ,Domicilio       TEXT NOT NULL
    ,Telefono        VARCHAR(10) NOT NULL
    ,FechaRegistro    DATETIME DEFAULT(datetime('now','localtime'))
    ,Estado          VARCHAR(1) DEFAULT('A') CHECK (Estado IN('A','X'))
);

CREATE TABLE Libro (
     IDLibro            INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Codigo             VARCHAR(13) NOT NULL
    ,Titulo             VARCHAR(30) NOT NULL 
    ,FechaPublicacion   date
    ,Autor              VARCHAR(20) NOT NULL
    ,Edicion            VARCHAR(10) NOT NULL
    ,Idioma             VARCHAR(10) NOT NULL
    ,Paginas            INTEGER NOT NULL
    ,Descripcion        TEXT NOT NULL
    ,Stock              INTEGER NOT NULL
    ,Disponibles        INTEGER NOT NULL
    ,Estado             VARCHAR(1) DEFAULT('A') CHECK (Estado IN('A','X'))
    ,FechaRegistro      DATETIME DEFAULT current_timestamp
);

CREATE TABLE Prestamo (
     IDPrestamo          INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
    ,IDUsuario           Integer NOT NULL  
    ,IDLibro             Integer NOT NULL 
    ,FechaPrestamo       DATETIME DEFAULT(datetime('now','localtime'))     
    ,FechaDevolucion    DATETIME
    ,Estado             VARCHAR(1) DEFAULT('A') CHECK (Estado IN('A','X'))
);



#language: es
Característica: Probar la pagina demo Serenity

  Antecedentes:
    Dado que el usuario ingresa a la pagina

  @BuscarCliente
  Esquema del escenario: Buscar un cliente
    Y el usuario se loguea con su "<usuario>" y su "<contrasena>"
    Cuando el usuario introduce un "<ID>" de cliente en la barra de busqueda
    Entonces se espera que se encuentre al cliente

  Ejemplos:
    |usuario|contrasena|ID|
    |admin|serenity|ALFKI|
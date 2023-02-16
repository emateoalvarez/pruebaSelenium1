#language: es
Característica: Probar la pagina demo Serenity

  Antecedentes:
    Dado que el usuario ingresa a la pagina
    Y el usuario se loguea con su "admin" y su "serenity"

  @BuscarCliente
  Esquema del escenario: Buscar un cliente
    Cuando el usuario introduce un "<ID>" de cliente en la barra de busqueda
    Entonces se espera que se encuentre al cliente

  Ejemplos:
    |ID|
    |      ALFKI|


#language: es
Característica: Probar la pagina demo Serenity

  @BuscarCliente
  Esquema del escenario: Buscar un cliente
    Dado que estoy en la seccion de clientes
    Cuando el usuario introduce un "<ID>" de cliente en la barra de busqueda
    Entonces se espera que se encuentre al cliente

  Ejemplos:
    |ID|
    |      ALFKI|


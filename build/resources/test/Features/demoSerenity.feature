#language: es
Característica: Inicio de sesión

  @InicioSesion
  Esquema del escenario: Login exitoso
    Dado que el usuario ingresa a la pagina
    Cuando el usuario se loguea con su "<usuario>" y su "<contrasena>"
    Entonces se espera que el usuario sea redirigido a la pagina principal

    Ejemplos:
      |usuario|contrasena|
      |admin|serenity|

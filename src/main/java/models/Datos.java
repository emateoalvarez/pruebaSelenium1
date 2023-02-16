package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Datos {

    private String usuario;
    private String contrasena;

    public Datos(String usuario, String contrasena){
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
}

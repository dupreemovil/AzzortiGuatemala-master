package com.dupreincabolivia.dupree.mh_response_api;

/**
 * Created by cloudemotion on 20/8/17.
 */

public class Faltante {
    private int pagina;
    private String nombre;
    private int id;
    private String name;

    public Faltante(int pagina, String nombre, int id) {
        this.pagina = pagina;
        this.nombre = nombre;
        this.id = id;
    }

    public int getPagina() {
        return pagina;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

}

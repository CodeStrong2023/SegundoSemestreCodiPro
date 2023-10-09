package com;

public enum Localidades {

    MAIPU("Maipu", 5515, 1000),
    GUAYMALLEN("Guaymallen", 5521, 1200),
    GODOY_CRUZ("Godoy Cruz", 5501, 1300),
    MENDOZA("Mendoza", 5500, 1400),
    LAS_HERAS("Las Heras", 5539, 1550),
    LUJAN_DE_CUYO("Lujan de cuyo", 5507, 1700),
    SAN_RAFAEL("San Rafael", 5600, 0),
    MALARGUE("Malargue", 5613, 0),
    GENERAL_ALVEAR("General Alvear", 5620, 0);

    String nombre;
    int codigo_postal;
    int coste_de_envio;

    Localidades(String nombre, int codigo_postal, int coste_de_envio) {
        this.nombre = nombre;
        this.codigo_postal = codigo_postal;
        this.coste_de_envio = coste_de_envio;
    }
}
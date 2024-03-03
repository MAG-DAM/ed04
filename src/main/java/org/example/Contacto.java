package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa los datos de un contacto en una agenda.
 * @author Miguel Ángel Guerrero Lázaro
 * @version 1.0 03/03/2024
 */

class Contacto {
    private String name; //Nombre del contacto
    private List<String> phones; //Lista de los nº de teléfono del contacto

    /**
     * Constructor de la clase Contacto
     * @param name  Nombre del contacto
     * @param phone Nº de teléfono del contacto
     */
    public Contacto(String name, String phone) {
        this.name = name; // Inicializa Nombre
        this.phones = new ArrayList<>(); // Inicializa lista de teléfonos
        this.phones.add(phone);//añade primer nº de telefono
    }

    /**
     * Método para obtener el nombre del contacto.
     * @return Nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método para obtener la lista de números de teléfono del contacto
     *@return Lista de números de teléfono del contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }
}
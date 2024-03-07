package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa los datos de un contacto en una agenda
 * @author Miguel Ángel Guerrero Lázaro
 * @version 1.0 03/03/2024
 */

class Persona {
    private String name;

    private List<String> phones;

    /**
     * Constructor de la clase Persona
     * inicializa nombre y lista de telefonos
     * y se añade el primer nº de teléfono del contacto
     * @param name  Nombre del contacto
     * @param phone Nº de teléfono del contacto
     */
    public Persona(String name, String phone) {
        this.setName(name); // Inicializa Nombre
        this.setPhones(new ArrayList<>()); // Inicializa lista de teléfonos
        this.getPhones().add(phone);//añade primer nº de telefono
    }

    /**
     * Nombre del contacto
     */ /**
     * Método para obtener el nombre del contacto
     * @return Nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * Lista de los nº de teléfono del contacto
     */ /**
     * Método para obtener la lista de números de teléfono del contacto
     *@return Lista de números de teléfono del contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
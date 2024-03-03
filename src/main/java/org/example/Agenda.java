package org.example;

import java.util.*;

/**
 * La clase Agenda representa una agenda para administrar contactos
 * @author Miguel Ángel Guerrero Lázaro
 * @version 1.0 03/03/2024
 */
public class Agenda {
    /**
     * Lista que almacena los contactos
     */
    private List<Contacto> contacts;
    /**
     * Constructor de la clase Agenda donde se inicializa la lista de contactos
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }// Inicializa una lista vacia de contactos

    /**
     * Método para añadir un nuevo contacto a la agenda
     * @param name Nombre del contacto
     * @param phone Nº de teléfono del contacto
     */
    public void addContact(String name, String phone) {
        boolean exists = false;//Inicializo exists
        for (Contacto c : contacts) {//Se recorren los contactos
            if (c.getName().equalsIgnoreCase(name)) {//Si el contacto existe
                exists = true;//establezco que existe a true
                c.getPhones().add(phone); //Se agrega nº de teléfono
                break;
            }
        }

        if (!exists) { //Si el contacto NO existe
            Contacto newContact = new Contacto(name, phone);//crea nuevo contacto
            contacts.add(newContact);//Se añade contacto a la lista
        }
    }

    /**
     * Método para eliminar un contacto de la agenda
     * @param name Nombre del contacto a eliminar
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();//inicializa iterador (it)

        while (it.hasNext()) {//Mientrás haya proximo contacto recorre lista
            Contacto c = it.next();//Coger en objeto c el siguiente contacto

            if (c.getName().equalsIgnoreCase(name)) {//Si es el contacto buscado(name)
                it.remove();//Se elimina de la lista
            }
        }
    }

    /**
     * Método para modificar el nº de teléfono de un contacto
     * @param name Nombre del contacto
     * @param oldPhone Nº de teléfono antiguo
     * @param newPhone Nuevo nº de teléfono
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {//Recorre los contactos
            if (c.getName().equalsIgnoreCase(name)) { // Si el contacto existe
                List<String> phones = c.getPhones();//Coger teléfonos del contacto

                int index = phones.indexOf(oldPhone);//Incializa index (nº telefono antiguo)

                if (index != -1) {//Si existe nº de teléfono antiguo
                    phones.set(index, newPhone);//reemplazar nº antiguo por nuevo
                }
            }
        }
    }

    /**
     * Método para obtener la lista de contactos de la agenda
     * @return Lista de contactos
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}
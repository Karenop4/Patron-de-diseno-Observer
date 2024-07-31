/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import visual.interfaz;

/**
 *
 * @author karen
 */
public class ObservadorConcreto implements Observador{
    private String nombre;

    public ObservadorConcreto(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public void actualizar(String mensaje)
    {
        interfaz.actualizarMensaje(mensaje, nombre);
    }
}

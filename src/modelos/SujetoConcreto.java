/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author karen
 */
public class SujetoConcreto implements Sujeto {
    private List<Observador> listaObservadores = new ArrayList<>();
    

    @Override
    public void suscribir(Observador observer) {
        listaObservadores.add(observer);
    }

    @Override
    public void desuscribir(Observador observer) {
        listaObservadores.remove(observer);
    }

    @Override
    public void notificarObservador(String mensaje) {
        for (Observador observador: listaObservadores)
        {
            observador.actualizar(mensaje);
        }
    }
    
    public void cambiarEstado(String mensaje){
        notificarObservador(mensaje);
    }
}

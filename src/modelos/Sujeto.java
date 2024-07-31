/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

/**
 *
 * @author karen
 */
public interface Sujeto {
    void suscribir(Observador observer);
    void desuscribir(Observador observer);
    void notificarObservador(String mensaje);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_2;

/**
 *
 * @author LABORATORIO 04
 */
class Movimiento {

    String descripcion;
    Amigo[] participantes;
    Amigo quienPago;
    int montoTotal;
    String moneda;

    public Movimiento(String descripcion, Amigo[] participantes, Amigo quienPago, int montoTotal, String moneda) {
        this.descripcion = descripcion;
        this.participantes = participantes;
        this.quienPago = quienPago;
        this.montoTotal = montoTotal;
        this.moneda = moneda;
    }

    public void calculadorDeDeudas() {
        double montoPorPersona = montoTotal / participantes.length;
        for (Amigo amigo : participantes) {
            if (amigo != quienPago) {
                amigo.deuda += montoPorPersona;
                quienPago.deuda -= montoPorPersona;
            }
        }
    }
}

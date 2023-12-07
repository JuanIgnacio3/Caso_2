/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso_2;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Caso_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Amigo[] amigos = { //Grupo de amigos
            new Amigo("Joshua"),
            new Amigo("Greivin"),
            new Amigo("Guillermo"),
            new Amigo("Andres"),
            new Amigo("Tavo"),
            new Amigo("David")
        };

        
        
        
        // Lo que le deben a Joshua 
        Movimiento[] movimiento1 = {
            new Movimiento("Apple store", amigos, amigos[0], 200, "Dolares")
                //Se pueden agregar más movimientos en cada uno de los amigos
        };

        for (Movimiento movimiento : movimiento1) {
            movimiento.calculadorDeDeudas();
        }
        
        
        
        // Lo que le deben a Greivin
        Movimiento[] movimientos2 = {
            new Movimiento("Quicksilver store", amigos, amigos[1], 150, "Dolares"),
            new Movimiento("Desayuno Chillis", amigos, amigos[1], 150, "Dolares"),
        };
         
        for (Movimiento movimiento : movimientos2) {
            movimiento.calculadorDeDeudas();
        }
        
        
        
        // Lo que le deben a Guillermo 
        Movimiento[] movimiento3 = {
            new Movimiento("Desayuno CoffeePrime", amigos, amigos[2], 120, "Dolares"),
            new Movimiento("Almuerzo Pig Factory", amigos, amigos[2], 200, "Dolares"),
        };
        for (Movimiento movimiento : movimiento3) {
            movimiento.calculadorDeDeudas();
        }
        
        
        
        // Lo que le deben a Andres
        Movimiento[] movimiento4 = {
        };
        for (Movimiento movimiento : movimiento4) {
            movimiento.calculadorDeDeudas();
        }
       
        
        
         // Lo que le deben a Tavo
        Movimiento[] movimiento5 = {
        new Movimiento("PizzaHut", amigos, amigos[4], 100, "Dolares"),
        new Movimiento("Almuerzo Hooters", amigos, amigos[4], 180, "Dolares")
        };
        for (Movimiento movimiento : movimiento5) {
            movimiento.calculadorDeDeudas();
        }
        
        
        
        // Lo que le deben a David
        Movimiento[] movimiento6 = {
        new Movimiento("Cena FastFood", amigos, amigos[5], 50, "Dolares")
        };
        for (Movimiento movimiento : movimiento6) {
            movimiento.calculadorDeDeudas();
        }

        
        
        
        // Deudas de Joshua
        Amigo joshua = amigos[0];
        StringBuilder resultado1 = new StringBuilder("Deudas a Joshua:\n\n");
        for (Amigo amigo : amigos) {
            if (amigo != joshua) {
                resultado1.append(amigo.nombre)
                        .append(" le debe un total de ")
                        .append(amigo.deuda)
                        .append(" dólares\n");
            }
        }

        
        // Deudas de Greivin
        Amigo greivin = amigos[1];
        StringBuilder resultado2 = new StringBuilder("Deudas a Greivin:\n\n");
        for (Amigo amigo : amigos) {
            if (amigo != greivin) {
                resultado2.append(amigo.nombre)
                        .append(" le debe un total de ")
                        .append(amigo.deuda)
                        .append(" dólares\n");
            }
        }

        
        // Deudas de Guillermo
        Amigo guillermo = amigos[2];
        StringBuilder resultado3 = new StringBuilder("Deudas a Guillermo:\n\n");
        for (Amigo amigo : amigos) {
            if (amigo != guillermo) {
                resultado3.append(amigo.nombre)
                        .append(" le debe un total de ")
                        .append(amigo.deuda)
                        .append(" dólares\n");
            }
        }

        
        // Deudas de Andres
        Amigo andres = amigos[3];
        StringBuilder resultado4 = new StringBuilder("Deudas a Andres:\n\n");
        for (Amigo amigo : amigos) {
            if (amigo != andres) {
                resultado4.append(amigo.nombre)
                        .append(" le debe un total de ")
                        .append(amigo.deuda)
                        .append(" dólares\n");
            }
        }

        
        // Deudas de Tavo
        Amigo tavo = amigos[4];
        StringBuilder resultado5 = new StringBuilder("Deudas a Tavo:\n\n");
        for (Amigo amigo : amigos) {
            if (amigo != tavo) {
                resultado5.append(amigo.nombre)
                        .append(" le debe un total de ")
                        .append(amigo.deuda)
                        .append(" dólares\n");
            }
        }

        
        // Deudas de David
        Amigo david = amigos[5];
        StringBuilder resultado6 = new StringBuilder("Deudas a David:\n\n");
        for (Amigo amigo : amigos) {
            if (amigo != david) {
                resultado6.append(amigo.nombre)
                        .append(" le debe un total de ")
                        .append(amigo.deuda)
                        .append(" dólares\n");
            }
        }

        
        //Printearlo todo
        JOptionPane.showMessageDialog(null, resultado1.toString());
        JOptionPane.showMessageDialog(null, resultado2.toString());
        JOptionPane.showMessageDialog(null, resultado3.toString());
        JOptionPane.showMessageDialog(null, resultado4.toString());
        JOptionPane.showMessageDialog(null, resultado5.toString());
        JOptionPane.showMessageDialog(null, resultado6.toString());
    }
}

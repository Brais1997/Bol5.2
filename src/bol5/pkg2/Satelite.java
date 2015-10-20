/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol5.pkg2;

/**
 *
 * @author Admin
 */

public class Satelite {
    private double meridiano;
    private double paralelo ;
    private double distanciaTierra;

public Satelite (){}
public Satelite (double m, double p,double d){
    meridiano = m;
    paralelo = p;
    distanciaTierra = d;
}
public void verPosicion ( ) {

System.out.println(" o satelite atopase  no paralelo " +paralelo + "meridiano " + meridiano+ " a unha distancia da terra "+ distanciaTierra);
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buserking
 */
public class Bola extends BangunRuang {
    //    private double jariJari;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
        return 4*Math.PI*jariJari*jariJari*jariJari/3;
//        return 4*22/7*jariJari*jariJari*jariJari/3;
}
}

package com.example.vins.model;

import java.util.ArrayList;
import java.util.List;

public class ViExpert {
    private ArrayList<Vins> vins = new ArrayList<>();
    Vins vi1 = new Vins("Messet del Lleó","rosat");
    Vins vi2 = new Vins("Vi blanc","blanc");
    Vins vi3 = new Vins("vi fosc","negre");
    Vins vi4 = new Vins("vi neu","blanc");

    public ViExpert(ArrayList<Vins> vins) {
        this.vins = vins;
    }

    public ViExpert() {
    }

    public void AddVins(){
        this.vins.add(vi1);
        this.vins.add(vi2);
        this.vins.add(vi3);
        this.vins.add(vi4);
    }

    public List<String> getMarques(String tipusVi){
        List<String> marques = new ArrayList<>();
        for (Vins vins: vins) {
            if (vins.getTipus().equals(tipusVi)) {
                marques.add(vins.getMarca());
            }
        }
        return marques;
    }

    public ArrayList<Vins> getVins() {
        return vins;
    }

    public void setVins(ArrayList<Vins> vins) {
        this.vins = vins;
    }
}

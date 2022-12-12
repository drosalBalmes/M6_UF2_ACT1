package com.example.vins.model;

import java.util.ArrayList;
import java.util.List;

public class ViExpert {
    private ArrayList<Vins> vins = new ArrayList<>();

    public ViExpert(ArrayList<Vins> vins) {
        this.vins = vins;
    }

    public ViExpert() {
    }

    public void AddVins(Vins vi){
        this.vins.add(vi);
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

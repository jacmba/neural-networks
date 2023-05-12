package net.jazbelt.neuralnetworks.model;

import java.util.ArrayList;

public class Neuron {
    private ArrayList<Double> listOfWeightIn;
    private ArrayList<Double> listOfWeightOut;

    public double initNeuron() {
        double w = Math.random();
        listOfWeightIn = new ArrayList<>();
        listOfWeightIn.add(w);
        listOfWeightOut = new ArrayList<>();
        listOfWeightOut.add(Math.random());
        return w;
    }

    public void setListOfWeightIn(ArrayList<Double> listOfWeightIn) {
        this.listOfWeightIn = listOfWeightIn;
    }

    public ArrayList<Double> getListOfWeightIn() {
        return listOfWeightIn;
    }

    public ArrayList<Double> getListOfWeightOut() {
        return listOfWeightOut;
    }

    public void setListOfWeightOut(ArrayList<Double> listOfWeightOut) {
        this.listOfWeightOut = listOfWeightOut;
    }
}

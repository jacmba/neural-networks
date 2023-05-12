package net.jazbelt.neuralnetworks.model;

import java.util.ArrayList;

public abstract class Layer {
    private ArrayList<Neuron> listOfNeurons;
    private int numberOfNeuronsInLayer = 1;

    public ArrayList<Neuron> getListOfNeurons() {
        return listOfNeurons;
    }

    public void setListOfNeurons(ArrayList<Neuron> listOfNeurons) {
        this.listOfNeurons = listOfNeurons;
    }

    public int getNumberOfNeuronsInLayer() {
        return numberOfNeuronsInLayer;
    }

    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
    }

    public abstract void initLayer();
    public abstract void printLayer();
}

package net.jazbelt.neuralnetworks.model;

import java.util.ArrayList;

public class InputLayer extends Layer {
    @Override
    public void initLayer() {
        ArrayList<Neuron> neurons = new ArrayList<>();
        for(int i = 0; i < getNumberOfNeuronsInLayer(); i++) {
            Neuron neuron = new Neuron();
            neuron.initNeuron();
            neurons.add(neuron);
        }
        setListOfNeurons(neurons);
    }

    @Override
    public void printLayer() {
        System.out.println("### INPUT LAYER ###");
        int n = 1;
        for(Neuron neuron : getListOfNeurons()) {
            System.out.println("Neuron #" + n);
            System.out.println("Input Weights:");
            System.out.println(neuron.getListOfWeightIn());
            n++;
        }
    }
}

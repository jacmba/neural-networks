package net.jazbelt.neuralnetworks.main;

import net.jazbelt.neuralnetworks.model.NeuralNet;

public class NeuralNetTest {
    public static void main(String [] args) {
        NeuralNet net = new NeuralNet();
        net.initNet();
        net.printNet();
    }
}

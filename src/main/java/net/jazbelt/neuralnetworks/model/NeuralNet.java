package net.jazbelt.neuralnetworks.model;

import java.util.ArrayList;

public class NeuralNet {
    private InputLayer inputLayer;
    private HiddenLayer hiddenLayer;
    private ArrayList<HiddenLayer> listOfHiddenLayer;
    private OutputLayer outputLayer;
    private int numberOfHiddenLayers;

    public void initNet() {
        inputLayer = new InputLayer();
        inputLayer.setNumberOfNeuronsInLayer(2);
        inputLayer.initLayer();

        numberOfHiddenLayers = 2;
        listOfHiddenLayer = new ArrayList<>();
        for(int i = 0; i < numberOfHiddenLayers; i++) {
            hiddenLayer = new HiddenLayer();
            hiddenLayer.setNumberOfNeuronsInLayer(3);
            hiddenLayer.initLayer();
            listOfHiddenLayer.add(hiddenLayer);
        }

        outputLayer = new OutputLayer();
        outputLayer.initLayer();
    }

    public void printNet() {
        inputLayer.printLayer();
        int i = 1;
        for(HiddenLayer hl : listOfHiddenLayer) {
            System.out.println("Hidden Layer #" + i++);
            hl.printLayer();
        }
        outputLayer.printLayer();
    }
}

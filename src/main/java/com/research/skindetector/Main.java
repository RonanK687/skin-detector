package com.research.skindetector;

import org.datavec.api.records.listener.impl.LogRecordListener;
import org.datavec.api.split.FileSplit;
import org.datavec.image.loader.NativeImageLoader;
import org.deeplearning4j.datasets.datavec.RecordReaderDataSetIterator;
import org.nd4j.linalg.dataset.DataSet;
import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;
import org.nd4j.linalg.dataset.api.preprocessor.DataNormalization;
import org.nd4j.linalg.dataset.api.preprocessor.ImagePreProcessingScaler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * The heart of the program that calls everything that needs to run.
 *
 * @author Ronan Konishi
 * @version 1.0
 */
public class Main {
    
    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        //Image Specifications
        int height = 150; //px height
        int width = 150; //px width
        int channels = 3; //RGB
        int rngseed = 11;
        int batchSize = 1000;
        int outputNum = 2;
        int numEpochs = 1; //number of iterations through entire dataset

//        File trainData = new File("/Users/Ronan/ISIC-images/ISIC-images/UDA-1");
//        File testData = new File("/Users/Ronan/ISIC-images/ISIC-images/UDA-2");

//        DataDownloader dataSet = new DataDownloader();
//        dataSet.download();
//        File UnpackagedISICData = new File(dataSet.getDataPath()); //unsure still NEEDS TESTING
//
//        NeuralNetwork network = new NeuralNetwork(UnpackagedISICData, rngseed, height, width, channels, batchSize, outputNum);

//        File mixedData = new File("/Users/Ronan/Desktop/ISIC_Dataset");

        File mixedData = new File("C:/Users/ronan/Desktop/test/mixedData");
        File trainData = new File("C:/Users/ronan/Desktop/test/trainData/");
        File testData = new File("C:/Users/ronan/Desktop/test/testData/");

        NeuralNetwork network = new NeuralNetwork(mixedData, trainData, testData, rngseed, height, width, channels, batchSize, outputNum);

//        log.info("*****TRAIN MODEL********");
        network.train(numEpochs);

//        log.info("*****SAVE TRAINED MODEL******");
//        network.saveBuild("trained_model.zip");

//        log.info("*****EVALUATE MODEL*******");
        log.info(network.evaluate().stats());
    }
}

package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Map;


/**
 * Created by swathi on 6/7/2015.
 */
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {

        CSVReader csvReader = new CSVReaderImpl();
        Map<String, ArrayList<String>> map = csvReader.readContentsAndMapFirstColumnToAllOtherColumns("idlist2.csv");
        WorkerImpl workerImpl = new WorkerImpl();
        workerImpl.doWork(map);


        //csvReader.readContentsByHeader("idlist2.csv" , "Internal ID");
    }
}









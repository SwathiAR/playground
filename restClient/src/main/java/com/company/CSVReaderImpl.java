package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CSVReaderImpl implements CSVReader {
    Logger logger = LoggerFactory.getLogger(CSVReader.class);

    @Override
    public List<String> readContentsByHeader(String fileName, String headerName) {
        File file = new File(fileName);
        ArrayList<String> arrayList = new ArrayList<>();
        int headerIndex = -1;
        try {
            Scanner inputStream = new Scanner(file);
            String headerData = inputStream.nextLine();
            String[] header = headerData.split(",");
            for (int i = 0; i < header.length; i++) {
                if (header[i].equals(headerName)) {
                    headerIndex = i;
                    break;
                }

            }
            if (headerIndex >= 0) {
                while (inputStream.hasNext()) {
                    String data = inputStream.nextLine();
                    String[] values = data.split(",");
                    arrayList.add(values[headerIndex]);
                }
            }
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }

        System.out.println(arrayList);
        return arrayList;
    }

    @Override
    public Map<String, ArrayList<String>> readContentsAndMapFirstColumnToAllOtherColumns(String fileName) {
        File file = new File(fileName);
        Map<String , ArrayList<String>> map = new HashMap<>();
        try {
            Scanner inputStream = new Scanner(file);
            inputStream.nextLine();
            while(inputStream.hasNextLine()){
               String data = inputStream.nextLine();
                String[] split = data.split(",");
                ArrayList<String> values = new ArrayList<>();
                for (int s=1;s<split.length ; s++) {
                    values.add(split[s]);
                }
                map.put(split[0], values);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        logger.debug("Map of id and credentials " ,map);
        return  map;

    }


}

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by swathi on 6/6/2015.
 */
public interface CSVReader {
    List<String> readContentsByHeader(String fileName, String headerName);
    Map<String , ArrayList<String>> readContentsAndMapFirstColumnToAllOtherColumns(String fileName);
}

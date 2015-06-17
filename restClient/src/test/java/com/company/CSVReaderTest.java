package com.company;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Created by swathi on 6/6/2015.
 */
public class CSVReaderTest {
    CSVReader csvReader;


    @BeforeMethod
    public void setup(){
       csvReader= new CSVReaderImpl();
    }

    @Test
    public void shouldGetAllInternalIds() throws Exception {
        List<String> ids = csvReader.readContentsByHeader("idlist.csv", "Internal ID");
        assertNotNull(ids);
        assertEquals(ids.size(), 16);
        assertEquals(ids.get(0), "287792");
    }

    @Test
    public void shouldGetAllEmails() throws Exception {
        List<String> emails = csvReader.readContentsByHeader("idlist.csv", "Email");
        assertNotNull(emails);
        assertEquals(emails.size(), 16);
        assertEquals(emails.get(0), "unknown@gmail.com");
    }

    @Test
    public void shouldReturnEmptyListForInvalidHeader(){
        List<String> contents = csvReader.readContentsByHeader("idlist.csv", "Invalid header");
        assertNotNull(contents);
        assertEquals(contents.size(), 0);
    }

    @Test
    public void shouldReturnEmptyListForInvalidFile(){
        List<String> id = csvReader.readContentsByHeader("abc.csv", "id");
        assertNotNull(id);
        assertEquals(id.size(), 0);
    }
}
package com.company;

import com.mongodb.DBObject;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
 * Created by swathi on 6/8/2015.
 */
public interface Worker  {
    public ArrayList<DBObject> doWork(Map<String , ArrayList<String>> map) throws InterruptedException;
}

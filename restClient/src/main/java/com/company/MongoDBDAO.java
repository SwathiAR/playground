package com.company;

import com.mongodb.DBObject;

import java.net.UnknownHostException;

/**
 * Created by swathi on 6/8/2015.
 */
public interface MongoDBDAO {

    public DBObject insertIdAndSessionIdAndFindFromMongoDb(String id, String sessionId, String mydb, String myCollection) throws UnknownHostException;
}

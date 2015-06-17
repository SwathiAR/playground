package com.company;

import com.mongodb.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.UnknownHostException;

/**
 * Created by swathi on 6/8/2015.
 */
public class MongoDBDAOImpl implements MongoDBDAO {

    Logger logger = LoggerFactory.getLogger(MongoDBDAOImpl.class);
    public DBObject insertIdAndSessionIdAndFindFromMongoDb(String id, String sessionId, String mydb, String myCollection) throws UnknownHostException {

        MongoClient mongoClient = new MongoClient(new ServerAddress("localhost" , 27017));
        DB db = mongoClient.getDB(mydb);
        DBCollection dbCollection = db.getCollection(myCollection);


        BasicDBObject doc = new BasicDBObject(id , sessionId);
        dbCollection.insert(doc);

        DBObject myDoc = dbCollection.findOne(new BasicDBObject(id,sessionId));
        logger.debug("Inserted {}",myDoc.toString());
        return myDoc;

    }
}

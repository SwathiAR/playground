package com.company;

import com.google.gson.JsonElement;
import com.mongodb.DBObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.*;

/**
 * Created by swathi on 6/8/2015.
 */
public class WorkerImpl implements Worker {
    Logger logger = LoggerFactory.getLogger(WorkerImpl.class);
    public ArrayList<DBObject> doWork(Map<String, ArrayList<String>> map) throws InterruptedException {
        RestFullApiCaller restFullApiCaller = new RestFullApiCallerImpl();
        MongoDBDAOImpl mongoDBInserterAndFinderImpl = new MongoDBDAOImpl();
        ExecutorService executor = Executors.newFixedThreadPool(20);
        ArrayList<Future<DBObject>> arrayDBObject = new ArrayList<>();
        ArrayList<DBObject> list = new ArrayList<>();


        for (String key : map.keySet()) {

               Future<DBObject> future = executor.submit(new Callable<DBObject>() {
                @Override
                public DBObject call() throws Exception {
                    DBObject dbObject = null;


                    ArrayList<String> values = map.get(key);

                    StringBuilder inpt = new StringBuilder().append("{\"username\" : ").append("\"").
                            append(values.get(2)).append("\"").append(", \"password\" :").
                            append("\"").append(values.get(3)).append("\"").append("}");

                    String input = inpt.toString();
                    logger.debug("Input for each id {}" ,input);

                    JsonElement jsonElement = restFullApiCaller.callPost("https://sunedison-dev.cloudhub.io/api/login", input);
                    logger.info("response for login of each id {}" ,jsonElement.toString());
                    String sessionId = jsonElement.getAsJsonObject().getAsJsonPrimitive("id").getAsString();
                    logger.debug("Session id is {}" , sessionId );
                    try

                    {
                        dbObject = mongoDBInserterAndFinderImpl.insertIdAndSessionIdAndFindFromMongoDb(key, sessionId, "mydb", "testCollection");

                    } catch (UnknownHostException e)

                    {
                        e.printStackTrace();
                    }
                    return  dbObject;
                }
                 });

                arrayDBObject.add(future);

        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);


        for (Future<DBObject> dbObjectFuture : arrayDBObject) {
            try {
               list.add(dbObjectFuture.get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }
        return  list;
    }

    }




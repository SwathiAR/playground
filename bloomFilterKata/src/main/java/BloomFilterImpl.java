import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * Created by swathi on 6/16/2015.
 */
public class BloomFilterImpl implements BloomFilter{
    String filePath;
    private final int capacity = Integer.MAX_VALUE / 2;
    private final boolean[] booleanArray;


    public BloomFilterImpl(String filePath) {
        this.filePath = filePath;
        booleanArray = new boolean[capacity];
        initializeBooleanArray();
        readDictionaryAndSetBit(filePath);

    }

    private void initializeBooleanArray() {
        for (int i = 0; i < booleanArray.length; i++) {
            booleanArray[i] = false;
        }
    }

    private void readDictionaryAndSetBit(String filePath) {
        File file = new File(filePath);
        try {
            Scanner inputStream = new Scanner(file);
            while (inputStream.hasNextLine()) {
                String word = inputStream.nextLine().toLowerCase();
                int index = calculateHash(word);
                booleanArray[index] = true;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Invalid file path" , e);
        }
    }


    private int calculateHash(String word) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(word.getBytes());
            byte[] hash = messageDigest.digest();
            return Math.abs(new BigInteger(hash).intValue()) % capacity;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Failed while creating hash", e);
        }
    }


    public String checkExists(String s) {
        int index = calculateHash(s.toLowerCase());
        if (booleanArray[index]) {
            return "Present";

        }
        return "Not Present";
    }
}



/**
 * Created by swathi on 6/10/2015.
 */


public class BinaryChop {



    public int iterativeChop(int key, int[] array) {

        int high = array.length - 1;
        int low = 0;
        int mid = (high + low) / 2;

        while (low <= high) {
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else if (key == array[mid]) {
                return mid;
            }
            mid = (high + low) / 2;
        }
        return -1;
    }



    public int recursiveChop(int key , int[] array ) {
        return  recursiveChop( key, array,  0, array.length-1);
    }

    int recursiveChop(int key , int[] array , int low , int high){

        if(low<=high) {
            int mid = (low+high)/2;
            if (key < array[mid]) {
               return recursiveChop(key, array, low , mid-1);
            } else if (key > array[mid]) {
               return recursiveChop(key, array, mid+1 , high);
            } else if (key == array[mid]) {
                return mid;
            }
        }

        return -1;

    }

    int ternaryOperationChop(int key , int[] array){

        return ternaryOpChop(key ,array , 0 , array.length-1);
    }

    int ternaryOpChop(int key , int[] array , int low , int high){
        if(low<=high){
           int mid = (low+high)/2;
            if (array[mid] ==key){
                return mid;
            }else

            return key< array[mid] ? recursiveChop(key, array, low , mid-1):recursiveChop(key, array, mid+1 , high);


        }

        return -1;

    }



}


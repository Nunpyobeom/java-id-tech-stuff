package algorithms;

import java.sql.SQLOutput;

public class BinarySearch {
    public static void main(String[] args) {
        int []val = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println();
    }
    public static int binarysearch (int values[ ], int x) {
        int low = 0;
        int high = values.length - 1;
        while (low <= high) {
            int midpoint = (low + high) / 2;
            if (values[midpoint] == x) {
                return midpoint;
            } else if (values[midpoint] > x) {
                high = midpoint - 1;
            } else if (values[midpoint] < x) {
                low = midpoint + 1;
            }
            System.out.println(midpoint);
        }
        return -1;

    }
    }

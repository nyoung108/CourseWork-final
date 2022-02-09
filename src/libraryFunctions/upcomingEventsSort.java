/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryFunctions;

import java.util.ArrayList;


public class upcomingEventsSort {
    public static ArrayList mergedList(ArrayList<String> unsortedEvents, String sortRequested) {
        ArrayList<String> sortedList = new ArrayList<>();
        splitList(unsortedEvents, sortedList, sortRequested);
        return null;
    }

    public static ArrayList splitList(ArrayList<String> unsortedEvents, ArrayList<String> sortedList, String sortRequested) {

        if (unsortedEvents.size() <= 1) {
            return unsortedEvents;
        } else {
            int midpoint = unsortedEvents.size() / 2;
            ArrayList<String> leftList = new ArrayList<String>();
            for (int i = 0; i < midpoint; i++) {
                leftList.add(unsortedEvents.get(i));
            }
            ArrayList<String> rightList = new ArrayList<String>();
            for (int i = midpoint; i < unsortedEvents.size(); i++) {
                rightList.add(unsortedEvents.get(i));
            }
            splitList(leftList, sortedList, sortRequested);
            splitList(rightList, sortedList, sortRequested);

            switch (sortRequested) {
                case "az":
                    mergedAZ(sortedList, leftList, rightList);
                    break;
                case "za":
                    mergedAZ(sortedList, leftList, rightList);
                    break;
                case "date":
                    mergedDate(sortedList, leftList, rightList);
                    break;
            }
        }
        return sortedList;
    }

    public static ArrayList mergedAZ(ArrayList<String> sortedList, ArrayList<String> leftList, ArrayList<String> rightList) {
        int leftPointer = 0;
        int rightPointer = 0;
        int sortedPointer = 0;

        while (leftPointer < leftList.size() && rightPointer < rightList.size()) {

            if (leftList.get(leftPointer).equals(rightList.get(rightPointer))) {
                sortedList.add(leftList.get(leftPointer));
                leftPointer = leftPointer + 1;
                sortedList.add(rightList.get(rightPointer));
                rightPointer = rightPointer + 1;
            } else {
                int compare = leftList.get(leftPointer).compareToIgnoreCase(rightList.get(rightPointer));
                if (compare < 0) {
                    sortedList.add(leftList.get(leftPointer));
                    leftPointer = leftPointer + 1;
                } else {
                    sortedList.add(rightList.get(rightPointer));
                    rightPointer = rightPointer + 1;
                }
                sortedPointer = sortedPointer + 1;
            }
        }
        while (leftPointer < leftList.size()) {
            sortedList.add(leftList.get(leftPointer));
            leftPointer = leftPointer + 1;
            sortedPointer = sortedPointer + 1;
        }
        while (rightPointer < rightList.size()) {
            sortedList.add(rightList.get(rightPointer));
            rightPointer = rightPointer + 1;
            sortedPointer = sortedPointer + 1;
        }
        return sortedList;
    }
    public static ArrayList mergedZA(ArrayList<String> sortedList, ArrayList<String> leftList, ArrayList<String> rightList) {
        int leftPointer = 0;
        int rightPointer = 0;
        int sortedPointer = 0;

        while (leftPointer < leftList.size() && rightPointer < rightList.size()) {

            if (leftList.get(leftPointer).equals(rightList.get(rightPointer))) {
                sortedList.add(leftList.get(leftPointer));
                leftPointer = leftPointer + 1;
                sortedList.add(rightList.get(rightPointer));
                rightPointer = rightPointer + 1;
            } else {
                int compare = leftList.get(leftPointer).compareToIgnoreCase(rightList.get(rightPointer));
                if (compare > 0) {
                    sortedList.add(leftList.get(leftPointer));
                    leftPointer = leftPointer + 1;
                } else {
                    sortedList.add(rightList.get(rightPointer));
                    rightPointer = rightPointer + 1;
                }
                sortedPointer = sortedPointer + 1;
            }
        }
        
        while (rightPointer < rightList.size()) {
            sortedList.add(rightList.get(rightPointer));
            rightPointer = rightPointer + 1;
            sortedPointer = sortedPointer + 1;
        }
        while (leftPointer < leftList.size()) {
            sortedList.add(leftList.get(leftPointer));
            leftPointer = leftPointer + 1;
            sortedPointer = sortedPointer + 1;
        }
        return sortedList;
    }
    public static ArrayList mergedDate(ArrayList<String> sortedList, ArrayList<String> leftList, ArrayList<String> rightList) {
        int leftPointer = 0;
        int rightPointer = 0;
        int sortedPointer = 0;

        while (leftPointer < leftList.size() && rightPointer < rightList.size()) {

            if (databaseOrders.getDate(leftList.get(leftPointer)).isEqual(databaseOrders.getDate(rightList.get(rightPointer)))) {
                sortedList.add(leftList.get(leftPointer));
                leftPointer = leftPointer + 1;
                sortedList.add(rightList.get(rightPointer));
                rightPointer = rightPointer + 1;
            } else {
                
                if (databaseOrders.getDate(leftList.get(leftPointer)).isBefore(databaseOrders.getDate(rightList.get(rightPointer)))) {
                    sortedList.add(leftList.get(leftPointer));
                    leftPointer = leftPointer + 1;
                } else {
                    sortedList.add(rightList.get(rightPointer));
                    rightPointer = rightPointer + 1;
                }
                sortedPointer = sortedPointer + 1;
            }
        }
        while (leftPointer < leftList.size()) {
            sortedList.add(leftList.get(leftPointer));
            leftPointer = leftPointer + 1;
            sortedPointer = sortedPointer + 1;
        }
        while (rightPointer < rightList.size()) {
            sortedList.add(rightList.get(rightPointer));
            rightPointer = rightPointer + 1;
            sortedPointer = sortedPointer + 1;
        }
        return sortedList;
    }
}

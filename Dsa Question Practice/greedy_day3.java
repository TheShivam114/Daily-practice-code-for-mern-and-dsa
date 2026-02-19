/*
  Question 1: Basic Activity Selection
You are given two arrays start[] and end[] representing start and finish times of activities. Activities are sorted by their finish times.
Write a program to determine the maximum number of non-overlapping activities that can be performed by a single person.
Example:
start[] = {1, 3, 0, 5, 8, 5}
end[]   = {2, 4, 6, 7, 9, 9}

Expected Output:
4
*/

import java.util.ArrayList;

public class greedy_day3 {
    public static void main(String[] arge){
      int start[]={1,3,0,5,8,5};
      int end[]= {2, 4, 6, 7, 9, 9};
      //endtime basis sorting
      int maxAct=0;
      ArrayList<Integer>ans=new ArrayList<>();
      //1st activity
      maxAct=1;
      ans.add(0);
      int lastEnd=end[0];
      for(int i=1;i<end.length;i++){
        if(start[i]>=lastEnd){
            //activity select
            maxAct++;
            ans.add(i);
            lastEnd=end[i];
        }
      }
      System.out.println("maxActivities="+maxAct);
      for(int i=0;i<ans.size();i++){
        System.out.print("A"+ans.get(i)+" ");
      }
      System.out.println();
    }
}

/*
Student Ranking System Using Priority Queue
You are given a list of students, where each student has a name and a rank. 
The rank represents the student's performance,
where a lower rank value indicates a better performance (i.e., Rank 1 is the best).
Your task is to design a system that:

Stores all student records.
Uses a Priority Queue to always fetch the student with the highest priority (lowest rank).
Prints the students in the order they would be processed based on their rank.
Input
An integer n — number of students
Next n lines contain:

name rank
 Output

Print students in ascending order of rank in the format:
name -> rank
 Example

Input:
5
A 4
B 5
C 2
D 3
E 12

Output:

C -> 2
D -> 3
A -> 4
B -> 5
E -> 12
 Explanation
The Priority Queue uses the compareTo() method of the Student class.
Students are sorted based on rank (ascending order).
The student with the lowest rank value is served first.
 Constraints
1 ≤ n ≤ 10^5
1 ≤ rank ≤ 10^9
Names consist of uppercase English letters
 Requirements
Implement a Student class that implements Comparable<Student>
Override the compareTo() method properly
Use Java’s PriorityQueue to manage students
*/
// import java.util.Comparator;
import java.util.PriorityQueue;
public class heaps_day2 {
    static class Student implements Comparable<Student>//overriding
    {
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
          @Override
          public int compareTo(Student s2){
            return this.rank-s2.rank;
          }

    }
    public static void main(String args[]){
        PriorityQueue<Student>pq=new PriorityQueue<>();

        pq.add(new Student("A", 04));
        pq.add(new Student("B", 05));
        pq.add(new Student("C", 02));
        pq.add(new Student("D", 03));
        pq.add(new Student("E", 12));
       
        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}

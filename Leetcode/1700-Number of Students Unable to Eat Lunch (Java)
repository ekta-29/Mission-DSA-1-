import java.util.LinkedList;
import java.util.Queue;

public class StudentsUnableToEat {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        
        
        for (int student : students) {
            studentQueue.add(student);
        }
        
        int index = 0; 
        int attempts = 0; 
        
        while (!studentQueue.isEmpty() && attempts < studentQueue.size()) {
            if (studentQueue.peek() == sandwiches[index]) {
              
                studentQueue.poll();
                index++;
                attempts = 0; 
            } else {
              
                studentQueue.add(studentQueue.poll());
                attempts++;
            }
        }
        
        return studentQueue.size();
    }

    public static void main(String[] args) {
        StudentsUnableToEat solution = new StudentsUnableToEat();

        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};

        int result = solution.countStudents(students, sandwiches);
        System.out.println("Students unable to eat: " + result);
    }
}

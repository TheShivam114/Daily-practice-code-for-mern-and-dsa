/*
  Count how many bits need to be flipped to convert A → B 
  Example: A = 10 (1010), B = 20 (10100) Hint: x = A ^ B; count set bits in x

  A = 10   → binary = 01010
B = 20   → binary = 10100

 */
public class bitManipulation_day1 {
    
        public static int countBitsToFlip(int A, int B) {
            int x = A ^ B; 
            int count = 0;
            while (x != 0) {
                x = x & (x - 1); 
                count++;
            }

            return count;
        }

        public static void main(String[] args) {
            int A = 10;
            int B = 20;

            System.out.println(countBitsToFlip(A, B));
        }
    

}

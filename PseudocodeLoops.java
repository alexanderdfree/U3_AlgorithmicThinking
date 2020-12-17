public class PseudocodeLoops{
public static boolean isPrime(int n){
   /*Checks if n is prime
   Inputs:
      int n: an integer to be checked for primeness
   Outputs:
      return: whether or not n is prime
   */
   if (n == 1 || n == 0) return false;
   for (int i = 2; i < n; i++){
      if (n % i == 0) {
         return false;
      }}
   return true;
}
public static int numPrimes(int n){
   /*Find the number of prime numbers less than or equal to n
   Inputs:
      int n: the number up to which we will check
   Outputs:
      return: the number of prime numbers <= n
   */
   int total = 0;
   for (int i = 2; i < n; i++){
      if (PseudocodeLoops.isPrime(i)){
         total++;
      }}
   return total;
}
public static int smallestFactor(int n){
   /*Find the smallest factor of n (must be positive)
   Input:
      int n: the integer whose smallest factor we are finding
   Output:
      return: the smallest factor of n
   */
   
   for (int i = 2; i < n; i++){
      if (n % i == 0) {
         return i;
      }}
   return n;
}
public static String primeFactors(int n){
   /*Split n into a list of prime factors
   Input:
      int n: a positive integer to factor
   Output:
      return: a String with all the prime factors of n
   
   Ex.
   primeFactors(4) -> "2, 2"
   primeFactors(5) -> "1, 5"
   primeFactors(24) -> "2, 2, 2, 3"
   primeFactors(25404) -> "2, 2, 3, 29, 73"
   */
   String numberList = "";
   int a = n;
   if (PseudocodeLoops.smallestFactor(n) == n) {
      return "" + n;
   }
   while (a > 1) {
      numberList += (PseudocodeLoops.smallestFactor(a) + ", ");
      a = a / PseudocodeLoops.smallestFactor(a);
   }
   return numberList.substring(0, numberList.length()-2);
}
public static int binaryToDecimal(String b){
   /*Converts a number written in base-2 to base-10
   Input:
      String b: a String representing a number in base-2
   Output:
      return: an int representing the number in base-10
   
   Ex.
   binaryToDecimal("101") -> 5
   binaryToDecimal("1110") -> 14
   binaryToDecimal("100011") -> 35
   */
   int value = 1;
   int total = 0;
   for (int i = b.length(); i > 0; i--){
      if (b.substring(i-1,i).equals("1")){
         total += value;
      }
      value *= 2;
      }
   return total;
}
}
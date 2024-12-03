package exams_tests;/* this assignment was made by roee tzarum ID :211330980

answers:
answer number 1.
a) I need to find two prime numbers, p1 and p2, such that when you add them together,
they equal the given even number n. If such a pair of primes exists, print them in the format: n = p1 + p2.

b) I need to find the smallest two prime numbers, p3 and p4, such that the difference between them equals the given number n
if such a pair exists, print them in the format: n = p1 - p2.

c) I need to find how many prime numbers exist in the range from 2 to n (not including n).
print the total count of primes in this range.

d) I need to find k prime numbers that their product equals 'n' , and print them in the format: n = q1×q2×...×qk.

2.
pseudocode:

import java.util.Scanner;                                               // import the Scanner library for reading user input
main function:
this algorithm starts by asking the user to enter a natural even number greater than 4.
if the input meets this condition, the algorithm performs a series of functions (primeSum_(a-e)) on this number (n),
and then print "211330980" (my/creator ID).
if the input is not acceptable (either less than or equal to 4 or an odd number), it displays an error message and ends.

1.  Scanner scanner = new Scanner                                       // create a scanner object for user input (Set up a scanner to read user input).
1.  Input n (natural even number > 4)                                   // ask the user to enter a number 'n'
2.  startTime = current time (in nanoseconds)                           // record the current time
3.  if n <= 4 or n is odd {                                             // check if n is not a valid even number greater than 4
4.      print "error: the num must be a natural even number that > 4"   // print error message
5.  }                                                                   // the end of the “if” block
6.   else {                                                             // if n is a valid even number
7.      call primeSum_a(n)                                              // find two prime numbers whose sum equals n
8.      call primeSum_b(n)                                              // find the smallest two prime numbers whose difference equals n
9.      call primeSum_c(n)                                              // count how many prime numbers are between [2, n)
10.     call primeSum_d(n)                                              // break down 'n' into its prime factors and print them
11.     call primeSum_e(startTime)                                      // print the program runtime in seconds
12.     print "solely designed and implemented by: 211330980"           // print "211330980" (my/creator ID).
13. }                                                                   // the end of the “else” block

Function prime(n):
This algorithm gets a natural number 'n' and tests if 'n' is a prime number (or not).
The algorithm works by testing first if 'n' equal 2, and saying that all the even numbers greater than 2 are not prime.
after this testing if all the non-even natural numbers in the range [3,square root of 'n']:
if any of them divides 'n', 'n' is not a prime number.
and if none of them divides 'n', 'n' is a prime number.

1.  Input(n > 1)                               // assuming 'n' is a natural number n > 4
2.  ans = true                                 // 'ans' is the variable representing “is n a prime”
3.  if (n == 2) {                              // check if 'n' is equal to 2
4.      return ans                             // return true (because 2 is a prime number)
5.  }                                          // the end of the first “if” block
6.  if (n % 2 == 0) {                          // check if 'n' is even
7.      ans = false                            // 'ans' is false now (because all even numbers that greater than 2, are not prime)
8.      return ans                             // return 'ans' (false)
9.  }                                          // the end of the second “if” block
10. for (i = 3; i * i <= n; i = i + 2) {       // loop over odd numbers from 3 to square root of 'n'
11.     if (n % i == 0) {                      // if 'n' is divisible by 'i'
12.         ans = false                        // 'ans' is false (n is not prime)
13.         return ans                         // return 'ans' (false)
14.     }                                      // end of the third "if" block
15. }                                          // end of the "for" loop
16. return ans                                 // return true if no divisors were found

Function primeSum_a(n):
This algorithm takes a natural even number 'n' and finds two prime numbers, 'p1' and 'p2', such that their sum equals 'n'.
The algorithm works by testing all the prime numbers 'p1' starting from 3 and checking if the number 'n - p1' is also a prime number.
If such a pair of primes is found, it prints 'n = p1 + p2' and terminates the algorithm.
If no such pair is found, the algorithm will continue checking higher prime numbers.

1.  Input(n > 4)                                      // assuming 'n' is a natural even number greater than 4
2.  ans = false                                       // The variable 'ans' is used to track if a valid pair is found
3.  for (i = 3; i < n; i = i + 2) {                   // loop over odd numbers from 3 to 'n' - 1 (both prime numbers must be either both even or both odd in order for their sum to be even number. 2 is the only even prime number)
4.     if (prime(i) && prime(n + i)){                 // if i and ('n' - 'i') are primes
5.          print(n + " = " + i + " + " + (n - i))    // print the result in the format "n = p1 + p2"
6.          ans = true                                // 'ans' is true (valid pair is found)
7.          return                                    // exit the function after finding the first valid pair of primes
8.      }                                             // the end of the “if” block
9.  }                                                 // the end of the “for” block

Function primeSum_b(n):
This algorithm takes a natural even number 'n' and finds the smallest two prime numbers, 'p3' and 'p4', such that their difference equals 'n'.
The algorithm works by testing all the prime numbers 'p3' starting from 3 and checking if the number 'p4 = n + p3' is also a prime number.
If such a pair of primes is found, it prints 'n = p4 - p3' and terminates the algorithm.
If no such pair is found, the algorithm continues testing higher prime numbers.

1.  Input(n > 4)                                      // assuming 'n' is a natural even number greater than 4
2.  ans = false                                       // the variable 'ans' is used to track if a valid pair is found
3.  for (i = 3; i < n; i = i + 2) {                   // loop over odd numbers from 3 to 'n' - 1 (both prime numbers must be either both even or both odd in order for their difference to be even number. 2 is the only even prime number)
4.     if (prime(i) && prime(n - i)){                 // if 'i' and ('n' - 'i') are primes
5.          print(n + " = " + (n + i) + " - " + i)    // print the result in the format "n = p1 - p2"
6.          ans = true                                // 'ans' is true (valid pair is found)
7.          return                                    // exit the function after finding the first valid pair of primes
8.      }                                             // the end of the “if” block
9.  }                                                 // the end of the “for” block

Function primeSum_c(n):
this algorithm takes a natural even number 'n' and counts how many prime numbers are between 2 and 'n' (excluding 'n').
the algorithm works by iterating through all natural numbers in the range [2, 'n') and checking if each number is prime using the prime() function.
for each prime number found, it increments the count by 1.
after completing the loop, the algorithm prints the total count of prime numbers in the range [2, n).

1.  Input(n > 4)                                      // assuming 'n' is a natural even number greater than 4
2.  count = 1                                         // initialize count to 1 (including the only even prime number '2')
3.  for (i = 2; i < n; i = i + 1) {                   // oop over odd numbers from 3 to 'n' - 1 (there is no even prime numbers other than '2')
4.      if prime(i) {                                 // if 'i' is prime
5.          count = count + 1                         // increment count by 1
6.  }                                                 // the end of the “if” block
7.  print (count + " prime numbers in [2, n))"        // print the number of primes in the range [2, 'n')

Function primeSum_d(n):
this algorithm takes a natural even number 'n', break it down into its prime factors and print them.
the algorithm works by iterating through all natural numbers starting from 2 and checks if the number divides 'n' evenly.
for each divisor 'i' that divides 'n', it prints 'i' as a factor and divides 'n' by 'i'.
the algorithm continues checking for factors until 'n' is reduced to 1.
the prime factors are printed in the format n = q1 * q2 * ... * qk, where q1, q2, ..., qk are the prime factors of 'n'.
if there are multiple factors, they are printed with a " * " separator when the first is not with a "*" separator.

1.  Input(n > 4)                                      // assuming 'n' is a natural even number greater than 4
2.  print "n = "                                      // print the start of the decomposition
3.  first = true                                      // initialize a boolean flag to track the first prime factor
4.  for (i = 2; i <= n; i = i + 1) {                  // loop through numbers from 2 to 'n'
5.      while prime(i) and n % i == 0 {               // while 'i' is prime and divides 'n'
6.          if first {                                // if it's the first prime factor
7.              print i                               // print just 'i'
8.              first = false                         // set first to false after the first prime factor
9.          }                                         // the end of the “if” block
10.          else {                                    // if it's not the first prime factor
11.              print " * " + i                       // print " * 'i'"
12.         }                                         // the end of the “else” block
13.         n = n / i                                 // divide 'n' by 'i'
14.     }                                             // the end of the “while” block
15.  }                                                // the end of the “for” block
16.  print newline                                    // Print a new line (for the next answer).

Function primeSum_e(startTime):
this algorithm takes the start time of the program and computes the runtime of the program.
the algorithm works by recording the current time in nanoseconds and then calculating the difference between the current time and the start time.
it then converts the time difference from nanoseconds to seconds by dividing by 1,000,000,000.
finally, the program prints the runtime in seconds, showing how long the program took to execute. the runtime is displayed with four decimal places.

1.  endTime = current time                                            // get the current time (in nanoseconds)
2.  runtimeInSeconds = (endTime - startTime) / 1,000,000,000.0        // calculate runtime by subtracting `startTime` from `Time` and converting to seconds (using double to be accurate).
3.  print "the program runtime: " + runtimeInSeconds + " seconds"     // Print the program's runtime.

end of pseudocode.
*/

import java.util.Scanner;

public class Ex0 { // import the Scanner library for reading user input

    public static void main(String[] args) { // main Function
        Scanner scanner = new Scanner(System.in); // create a scanner object for user input (Set up a scanner to read user input).
        System.out.println("please enter a natural even number that > then 4: ");// asking the user to enter a natural even number that greater than 4.
        int n = scanner.nextInt(); // input a number 'n'.
        long startTime = System.nanoTime(); // record the current time as 'startTime'
        if (n <= 4 || n % 2 != 0) { // check if 'n' is less/equal to 4 or 'n' is odd:
            System.err.println("error: the num must be a natural even number that > then 4."); // print an error message if it is,
        } else { // if 'n' is a natural even number that > then 4:
            primeSum_a(n); // call function  primeSum_a(n) to find two prime numbers that sum to 'n'.
            primeSum_b(n); // call function  primeSum_b(n) to find two prime numbers such that 'n' is the difference.
            primeSum_c(n); // call function primeSum_c(n) to count how many prime numbers are between 2 and 'n'.
            primeSum_d(n); // call function primeSum_d(n) to break down 'n' into its prime factors.
            primeSum_e(startTime); // call function primeSum_e(startTime) to show the runtime in seconds.
            System.out.println("solely designed and implemented by: 211330980"); // print "211330980" (my/creator ID).
        }
    }

    public static boolean prime(int n) { // function that check if 'n' is a prime number.
        if (n == 2) { // if 'n' is equal to 2:
            return true; // return true (because 2 is prime).
        }
        if (n % 2 == 0) { // if 'n' is even:
            return false; // return false (even numbers that greater than 2 are not prime).
        }
        for (int i = 3; i * i <= n; i += 2) { // for 'i' from 3 to square root of 'n', increase 'i' by 2 (check only odd numbers):
            if (n % i == 0) { // if 'n' is divisible by 'i':
                return false; // return false (if a divisor were found: 'n' is not a prime number).
            }
        }

        return true; // return true (if no divisors were found: 'n' is a prime number).
    }

    public static void primeSum_a(int n) { // function that find two prime numbers that sum to 'n'.
        for (int i = 3; i < n; i += 2) { // for 'i' from 3 to 'n', increase 'i' by 2 (check only odd numbers, both prime numbers must be either both even or both odd in order for their sum to be even number. 2 is the only even prime number):
            if (prime(i) && prime(n - i)) { // if 'i' and 'n' - 'i' are both prime:
                System.out.println(n + " = " + i + " + " + (n - i)); // print that 'n' is the sum of 'i' and 'n' - 'i'.
                return; // exit the function.
            }
        }
    }

    public static void primeSum_b(int n) { // function that find two prime numbers such that 'n' is the difference.
        for (int i = 3; i < n; i += 2) { // for 'i' from 3 to 'n', increase 'i' by 2 (check only odd numbers. both prime numbers must be either both even or both odd in order for their difference to be even number. 2 is the only even prime number):
            if (prime(i) && prime(n + i)) { // if 'i' and 'n' - 'i' are both prime:
                System.out.println(n + " = " + (n + i) + " - " + i); // print that 'n' is the sum of 'i' and 'n' - 'i'.
                return; // exit the function.
            }
        }
    }

    public static void primeSum_c(int n) { // function that count how many prime numbers are between 2 and 'n'.
        int count = 1; // counter to keep track of prime numbers (including the prime number '2')
        for (int i = 3; i < n; i += 2) { // for 'i' from 3 to 'n', increase 'i' by 2 (check only odd numbers, there is no even prime numbers other than '2')
            if (prime(i)) { // if 'i' is prime:
                count++; // increase 'count' by 1.
            }
        }
        System.out.println(count + " prime numbers in [2," + n + ")"); // print the total count of prime numbers between 2 and 'n'.
    }

    public static void primeSum_d(int n) { // function that break down 'n' into its prime factors.
        System.out.print(n + " = "); // print "n = ".
        boolean first = true; // set first equal true.
        for (int i = 2; i <= n; i++) { // for each integer 'i' from 2 up to 'n', increase 'i' by:
            while (prime(i) && n % i == 0) { // While 'i' is prime and divides 'n':
                if (first) { // if 'first' is the first prime number:
                    System.out.print(i); // print just i.
                    first = false; // set 'first' to be false ('first' can't be the first prime number anymore).
                } else { // if 'first' is not the first prime number:
                    System.out.print(" * " + i); // print " * " and 'i'.
                }
                n = n / i; // Divide n by i.
            }
        }
        System.out.println(); // Print a new line (for the next answer).
    }

    public static void primeSum_e(long startTime) { // function that show the runtime in seconds.
        long Time = System.nanoTime(); // Record the current time as `Time`.
        double runtimeInSeconds = (Time - startTime) / 1_000_000_000.0; // calculate runtime by subtracting `startTime` from `Time` and converting to seconds (using double to be accurate).
        System.out.printf("the program runtime: %.4f seconds%n", runtimeInSeconds); // Print the program's runtime.
    }
}
// Author: Renzo Carbonara
// Read the accompanying README and LICENSE files.

/* Project Euler: Problem 1
 * http://projecteuler.net/index.php?section=problems&id=1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * ANSWER: 233168
 */

package pe


object PE1 extends App {
  val res = (1 until 1000).filter(x => x % 3 == 0 || x % 5 == 0).sum

  println(res)
}

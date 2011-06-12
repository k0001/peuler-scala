// Author: Renzo Carbonara
// Read the accompanying README and LICENSE files.

/* Project Euler: Problem 1
 * http://projecteuler.net/index.php?section=problems&id=1
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 * ANSWER: 6857
 */

package pe

import util.primes.factorize


object PE3 extends App {
  val res = factorize(600851475143L).last

  println(res)
}

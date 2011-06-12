package pe.util

package object primes {

  object EratosthenesSieve {
    /* https://secure.wikimedia.org/wikipedia/en/wiki/Sieve_of_Eratosthenes */

    def primesUntil(n: Long): List[Long] = {
      require(n > 0)

      def eratos(ints: List[Long], primes: List[Long] = Nil): List[Long] = ints match {
        case Nil => primes reverse
        case p :: xs => eratos(xs diff List.range(p*p, n+1, 2*p), p :: primes)
      }
      eratos(List.range(3, n+1, 2))
    }
  }


  /* Algorithm from http://en.literateprograms.org/Factorization_with_trial_division_(Scala) */
  def factorize(n: Long): List[Long] = {
    require(n > 2)
    factorize(n, 2)
  }
  def factorize(n: Long, start_prime: Long): List[Long] = (n, start_prime) match {
    case (`start_prime`, _)         => List(n)
    case _ if n % start_prime == 0  => start_prime :: factorize(n / start_prime, start_prime)
    case (_, 2)                     => factorize(n, 3)
    case _                          => factorize(n, start_prime + 2)
  }

}

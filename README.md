This project holds Renzo Carbonara's Scala solutions for Project Euler
problems at http://projecteuler.net

See the accompanying LICENSE file for licensing terms.

I'm mainly interested in experimenting with the Scala programming
language, so my solutions won't focus in mathematical beauty nor
performance, but instead on exploring Scala features and idioms.

Code is compatible with **Scala 2.9.0**.


Building & running problem solution
===================================

If you want to build the solution to the problem 1, which is located in
the ``pe1.scala`` file:

    make pe1

If you want to build all solutions at once, run:

    make all

Java binaries will be built under the ``build`` directory. You can then
run it as:

    scala -cp ./build pe.PE1

Or you can use this equivalent shorcut:

    make run main=pe.PE1


Naming conventions
------------------

Each problem solution is a Scala object under the package ``pe``.
Objects are named ``PEx``, where ``x`` is the problem number.

Some problems might have more than one solution ("versions"), in which
case the object name could be called ``PEx_version``, where ``version``
stands for the version name. For example, if you solved Project Euler's
Problem 12 in 3 diferent ways, you could end up with: ``PE12``,
``PE12_concurrent``, and ``PE12_matrix``.

Each solution should be on it's own ``.scala`` file. ``PE12`` would be
in ``pe12.scala``, ``PE12_concurrent`` would be in in
``pe12_concurrent.scala``, etc.




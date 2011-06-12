SCALAC := fsc -d build -deprecation


clean:
	rm -rf build

build-dir:
	mkdir -p build

util-libs: build-dir util/primes.scala
	$(SCALAC) util/primes.scala

basics: build-dir util-libs

pe1: pe1.scala basics
	$(SCALAC) pe1.scala

pe2: pe2.scala basics
	$(SCALAC) pe2.scala

pe3: pe3.scala basics
	$(SCALAC) pe3.scala

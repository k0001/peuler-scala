SCALAC=fsc -d build -deprecation

build-dir:
	mkdir -p build

pe1: pe1.scala build-dir
	$(SCALAC) pe1.scala

pe2: pe2.scala build-dir
	$(SCALAC) pe2.scala

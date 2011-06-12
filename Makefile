SCALAC=fsc -d build -deprecation

build-dir:
	mkdir -p build

pe1: pe1.scala build-dir
	$(SCALAC) pe1.scala

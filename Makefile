BUILD_DIR := ./build
SCALAC := fsc -d $(BUILD_DIR) -deprecation
SCALA := scala

.PHONY: all

all: util-libs
	$(SCALAC) $(shell ls pe*.scala)

run:
ifeq ($(strip $(main)),)
	@echo "Usage: make run main=<main scala object path>"
	@echo "Example: make run main=pe.PE2"
	exit 1
endif
	$(SCALA) -cp $(BUILD_DIR) $(main)

pe%: pe%.scala basics
	$(SCALAC) $<

basics: build-dir util-libs

build-dir:
	mkdir -p $(BUILD_DIR)

util-libs: build-dir util/primes.scala
	$(SCALAC) util/primes.scala

clean:
	rm -rf $(BUILD_DIR)



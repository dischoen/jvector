all: compile run

compile:
	javac X.java -Xlint:unchecked
run:
	java X

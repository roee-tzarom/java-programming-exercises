# Java Programming Exercises

A collection of introductory Java exercises covering number systems, basic algorithms and small object-oriented models. These are independent programs rather than one application.

## Explore the code

| Area | Files | Concepts |
| --- | --- | --- |
| Number-base calculator | `src/BaseNumberCalculator.java`, `src/BaseNumberParser.java`, `src/NumberConversionScratchpad.java` | Parsing, base conversion, arithmetic and comparison |
| Basic algorithms | `src/Main.java`, `src/Interval.java` | Prime checking and interval modeling |
| Objects and tests | `src/Book.java`, `src/BookTest.java` | A small domain class and test-style usage |
| Exam practice | `src/exams_tests/` | Separate exercise implementations and sample tests |

## Run an example

With a JDK installed, run the standalone calculator from the repository root:

```bash
javac -d out src/BaseNumberCalculator.java
java -cp out BaseNumberCalculator
```

The calculator asks for two number strings and an output base. Several files contain their own `main` method and should be compiled and run separately. Some exam/test files need JUnit or other course setup; there is no unified build file for the entire collection.

This repository documents coursework and practice. Its routines are not presented as a validated numeric library.

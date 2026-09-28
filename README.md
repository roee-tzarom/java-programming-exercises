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


## How to navigate the exercises

The repository contains several small, separate entry points. `BaseNumberCalculator.java` is the most approachable interactive example: it asks for values and an output base, then performs number-base operations. `BaseNumberParser.java` and `NumberConversionScratchpad.java` expose related parsing and conversion practice. `Main.java` and `Interval.java` show introductory control flow and object modeling. `Book.java` and `BookTest.java` form a compact class-and-test example. The `exams_tests/` directory preserves additional independent practice problems.

## What the code demonstrates

These exercises show the transition from procedural loops and conditions to small objects with explicit state. For an evaluator, the useful evidence is the source and the input cases each `main` method handles. Compile one pair or program at a time because classes were written as separate assignments, not as a coordinated library. Test-named files may rely on JUnit or course-specific setup.

## Boundaries

There is no shared build system, package publication or comprehensive automated validation across the repository. Treat this as an introductory practice collection. If you want a larger Java application from this profile, the [block-breaker game](https://github.com/roee-tzarom/object-oriented-programming-java) and [spreadsheet coursework](https://github.com/roee-tzarom/java-foundations-projects) show more complete flows.

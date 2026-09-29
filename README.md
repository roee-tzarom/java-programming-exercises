# Java Fundamentals Lab

A collection of small Java programs that explores number representation, algorithms and object modeling. Each source group is independent, making it easy to review a single concept without launching a larger application.

## Highlights

| Area | Source | What it demonstrates |
| --- | --- | --- |
| Positional numbers | `BaseNumberCalculator.java`, `BaseNumberParser.java` | Validation, base conversion, comparison and arithmetic |
| Conversion sketches | `NumberConversionScratchpad.java` | Small experiments with numeric notation |
| Algorithms and ranges | `Main.java`, `Interval.java` | Control flow, prime-related logic and interval state |
| Objects | `Book.java`, `BookTest.java` | Constructor state, accessors, mutation and usage checks |

The number-base calculator is the most complete interactive entry point. It asks for number strings and an output base, converts the values and prints the result. The other files contain smaller independent examples rather than a single shared application.

## Try the calculator

Install a JDK, then run from the repository root:

```bash
mkdir -p out
javac -d out src/BaseNumberCalculator.java
java -cp out BaseNumberCalculator
```

The program is interactive; enter values when prompted. Other classes with a `main` method can be run separately in a Java IDE. There is no Maven or Gradle configuration for a one-command build of every source file.

## How to read it

Start with `BaseNumberCalculator.main` to see the user flow, then follow its parsing and conversion methods. The parser file shows a related approach to recognizing number formats. `Book` and `Interval` are short examples of keeping data and behavior together in classes. Some additional source trees contain standalone practice programs and may need separate test dependencies.

This repository shows foundational Java reasoning through small programs. For larger end-to-end Java work, see the [spreadsheet engine](https://github.com/roee-tzarom/java-foundations-projects) and [block-breaker game](https://github.com/roee-tzarom/object-oriented-programming-java).

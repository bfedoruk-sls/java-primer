![Banner](banner.png)

## What this is

A short, self-contained introduction to programming in Java. The primer assumes **no prior programming experience in any language**. It walks through six worked examples, each isolating a single concept, and ends with a capstone project that combines all six.

It is not a substitute for a course. It is a running start; enough Java to read your course materials with recognition instead of panic, and enough working code to modify and experiment with.

## Who it's for

- Students entering an introductory Java course who want a head start
- Students currently in one who feel the pace got away from them
- Anyone returning to Java after time away and wanting a fast refresher

## Before you begin

You will need:

1. A **JDK (Java Development Kit)**, version 17 or newer.
   Check by opening a terminal and running `java -version`.
2. A text editor or IDE. Any of these work:
   - IntelliJ IDEA Community Edition (recommended for beginners)
   - Visual Studio Code with the Extension Pack for Java
   - A plain text editor plus the terminal

If you cannot get a local setup working, an online editor such as Replit will run every example in this primer without installation. Don't let installation problems stop you from starting.

## The files

| File | Topic | What you'll be able to do |
|---|---|---|
| `Ex1.java` | Variables, types, output | Store values and print them |
| `Ex2.java` | Input and decisions | Read from the user; branch with `if` |
| `Ex3.java` | Repetition | Repeat work with `for` and `while` |
| `Ex4.java` | Methods | Package logic into reusable pieces |
| `Ex5.java` | Arrays and ArrayLists | Store many values at once |
| `Ex6.java` | Objects and classes | Bundle data and behaviour together |
| `Proj.java` | Capstone project | Build a working quiz game |

Work through them in order. Each example assumes the ones before it.

## How to run an example

From a terminal, in the folder containing the files:

```sh
java Ex1.java
```

Modern JDKs compile and run in a single step. If your version requires two steps, or you are working in an IDE that expects them:

```sh
javac Ex1.java
java Ex1
```

**A rule that trips up everyone once:** a file containing `public class Ex1` must be saved as `Ex1.java`. The names must match exactly, capital letters included.

## How to use the primer

Reading code is not the same as understanding it. For each example:

1. Read the file and predict what it will print, before running it.
2. Run it. Compare the output to your prediction.
3. Where you were wrong, that gap is the thing worth studying.
4. Change something (a value, a condition, a loop bound) and predict
   again.

Breaking the examples on purpose is encouraged. Error messages are information, and getting comfortable reading them early will save you more time than anything else in this document.

## The capstone project

`Proj.java` describes a text-based quiz game: a set of multiple-choice questions, a loop that asks each one, a running score, and a formatted final result.

Every example feeds into it:

- `Question` class → Ex6
- List of questions → Ex5
- Ask-and-check loop → Ex3
- Scoring method → Ex4
- Checking the answer → Ex2
- Results output → Ex1

Build it in that order, testing after each piece. Do not write the whole thing and then run it for the first time.

## Errors you will probably hit

**`cannot find symbol`**: usually a typo in a variable or method name, or a variable used outside the braces it was declared in.

**`class Ex1 is public, should be declared in a file named Ex1.java`**: the filename and class name don't match.

**Two strings that look identical but aren't equal**: compare text with `.equals()`, never with `==`. This compiles fine and fails silently, which makes it the hardest bug on this list to find.

**A question in your quiz gets skipped** — you mixed `nextInt()` and `nextLine()` on the same Scanner. `nextInt()` leaves the newline behind and the next `nextLine()` consumes it. Read everything with `nextLine()` and convert, or don't mix the two.

**`ArrayIndexOutOfBoundsException`** — indexing starts at 0, so the last valid index is `length - 1`.

## Getting help

Student Learning Support offers:

- **1:1 appointments** (bookable through QuadC)
- **Primers sessions** (bookable through QuadC)
- **Coding and Programming Study Hall**

Bring your code and the exact error message. "It doesn't work" is harder to help with than a screenshot.

## About

Written by Benjamin Fedoruk, Subject Specialist in Mathematics and Computer Science, Teaching and Learning Centre, Ontario Tech University.

[Contact: benjamin.fedoruk@ontariotechu.ca]

Last updated: [July 21, 2026]

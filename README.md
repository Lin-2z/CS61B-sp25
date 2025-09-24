# CS61B Code Workspace (assignments, labs, projects)

This directory contains code, tests, and input data used for Berkeley CS61B exercises, labs, and projects. The repository is organized into multiple subprojects (homeworks, labs, and larger projects). Each subproject generally follows a common Java layout, e.g., `src/` for source code, `tests/` for unit tests, and optional `inputFiles/` for runtime data.

## Repository layout (high level)

The top-level structure includes many course folders. Typical entries include:

- `hw0a/`, `hw0b/`, `hw2/`, ... — homework assignments
- `lab01/`, `lab02/`, `lab03/`, ... — lab exercises
- `proj0/`, `proj1a/`, `proj1b/`, ... — projects
- `tests/` (inside each subproject) — JUnit tests
- `inputFiles/` (inside some labs/projects) — sample input files used by tests or demos

For example, `lab03/src/adventure/` contains the source for a text-adventure exercise and `lab03/tests/` contains its tests.

## How to run and test

Below are common workflows for IntelliJ IDEA and command-line environments.

- IntelliJ IDEA (recommended for development):

  1.  Open `d:\SteamLibrary\WebDev\CS61B\code` as the project root in IntelliJ.
  2.  IntelliJ will detect `src` and `tests` folders for each subdirectory. You can create run configurations per subproject.
  3.  Right-click a test class or test method and choose Run to execute it.

- Command line (javac/java or build tools):
  - Compile and run a single class with `javac` / `java`:
    ```powershell
    # compile
    javac -d out src\somepackage\SomeClass.java
    # run
    java -cp out somepackage.SomeClass
    ```
  - If a subproject uses Maven or Gradle (check for `pom.xml` or `build.gradle`), run tests with:
    ```powershell
    mvn test
    # or
    gradle test
    ```

Note: This repository is a collection of course exercises. There is no single top-level build script that covers every subproject. The common workflow is to open the code in IntelliJ and run tests per subproject, or add a simple build file to the specific subproject you want to run from the command line.

## Conventions

- Java sources live under each subproject's `src/` directory. Tests (JUnit) are under `tests/`.
- Some assignments include `inputFiles/` which are used by tests or sample programs (for example, `lab02` input samples).

## FAQ

- Q: How do I run the tests? A: In IntelliJ, right-click a test file and choose Run. Or add a Maven/Gradle build file for the subproject and run `mvn test` / `gradle test` from the command line.
- Q: Where are the main classes? A: Look in `src/` for classes that include `public static void main(String[] args)`.

## Suggested next steps

- Add a small `build.gradle` or `pom.xml` to each subproject you actively use so you can run tests from the CLI.
- Add a top-level script (PowerShell or Makefile) to run common test suites across subprojects.
- Add per-subproject README files with exact instructions for compiling and running that assignment.

---

If you'd like, I can:

- Add a Gradle build file for a specific subproject (for example, `lab03`) and demonstrate running tests from the command line.
- Create a top-level PowerShell script to run a chosen set of tests across the repository.

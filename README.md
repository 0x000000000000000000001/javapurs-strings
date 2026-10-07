# purescript-strings

[![Latest release](http://img.shields.io/github/release/purescript/purescript-strings.svg)](https://github.com/purescript/purescript-strings/releases)
[![Build status](https://github.com/purescript/purescript-strings/workflows/CI/badge.svg?branch=master)](https://github.com/purescript/purescript-strings/actions?query=workflow%3ACI+branch%3Amaster)
[![Pursuit](https://pursuit.purescript.org/packages/purescript-strings/badge)](https://pursuit.purescript.org/packages/purescript-strings)

String and char utility functions, regular expressions.

## Java tests

With the built neighboring Javapurs backend, Spago, the TAST frontend, local
ports and a JDK:

```bash
./bin/test
./bin/test --help
```

The [common port runner](../javapurs/docs/testing.md#port-particulier) copies
`src/` and `test/`, including the eight test modules called by `Test.Main`, into
an isolated workspace. It rebases `spago.java.yaml` and preserves package set
77.7.0, the original configuration/lockfile and existing outputs. The suite is
synchronous; a failed assertion fails the process.

The Strings profile retains `javac -J-Xss64m` and `java -Xss64m`. The bytecode
target is configured separately by `JAVAPURS_JAVA_RELEASE` (17 by default), and
`JAVAPURS_JAVA_RUNTIME` can select another execution JVM. `-c`/`--clean` rebuilds
the backend through `bin/build`. Unknown options fail before preparation;
failed workspaces and per-phase logs are retained, with their path printed.

## Installation

```
spago install strings
```

## Documentation

Module documentation is [published on Pursuit](http://pursuit.purescript.org/packages/purescript-strings).

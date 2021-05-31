# TCR - Test && Commit || Revert

## What is TCR

TCR is a programming workflow, which stands for **Test && Commit || Revert**.
Kent Beck came up with this concept in [this post](https://medium.com/@kentbeck_7670/test-commit-revert-870bbd756864).

Since then several people experimented with this idea.

## Why TCR

Although probably a bit challenging to use on real production code, we found it quite beneficial when
used as a learning and practicing tool in our development katas.

TCR enforces developing in baby steps, with a strong focus on always keeping the green light.
We came up with a small script implementing this process, and decided to provide it with each
of our katas so that people can use it if they like.

## Usage

You can use the TCR script either when practicing alone, in a pair or in a mob.

Just make sure every participant's environment is ready.

### Prerequisites

#### Linux Users

- Have the [git client](https://git-scm.com/downloads) installed
- Have [inotify-tools](https://github.com/inotify-tools/inotify-tools/wiki) installed

#### MacOS Users

- Have the [git client](https://git-scm.com/downloads) installed
- Have [fswatch](https://emcrisostomo.github.io/fswatch/getting.html) installed

#### Windows Users

- Have the [git client](https://git-scm.com/downloads) installed

### Before starting

Clone the kata repository and create the branch that you will use.

Open a shell window and type the following,
replacing `<kata-repository-url>`, `<kata-root-directory>` and `<my-branch>`
with the appropriate value.

```shell
> git clone <kata-repository-url>
> cd <kata-root-directory> 
> git checkout -b <my-branch>
> git pull origin <my-branch>
```

You can name `<my-branch>` as you wish, as long as all contributors in a pair or mob work on the same branch!

TCR script applies a great number of commits to your git repository (every time it detects changes and tests are green).
For this reason we strongly advise you to avoid running it directly on your repository's `master` branch!

### Launching the script

#### C++ version of the kata

```shell
> cd cpp
> ./tcrw
```
#### Java version of the kata

```shell
> cd java
> ./tcrw
```

### Main menu

After starting the script, you will see a menu that looks like the following:

```shell
[TCR] -------------------------------------------------------------------------
[TCR] Language=java, Toolchain=gradle
[TCR] Running on git branch "<my-branch>"
[TCR] -------------------------------------------------------------------------
[TCR] What shall we do?
[TCR]   d -> Driver mode
[TCR]   n -> Navigator mode
[TCR]   q -> Quit
```

If you're not familiar with the Driver and Navigator modes,
you can refer to [here](https://mobprogramming.org/mob-programming-basics/).

In our script the driver is primarily the participant actively interacting with the keyboard,
while the navigators are all other participants.

### Driver mode

- To enter in Driver mode, hit `D` from the main menu
- You remain in Driver mode until you hit `Ctrl-C` to go back to the main menu

When running in Driver mode, the TCR process goes into action:
each time you save a file (either a source file or a test file), TCR triggers
a build, then runs all tests.

- If the build fails, TCR does not commit or revert anything. It goes back to the
  idle state and waits for you to fix compilation errors.
- If the build passes, TCR triggers the test execution.
- If all tests pass, TCR commits all changes to git (but does not push them yet)
- If one or more tests fail, TCR reverts all changes on source files, but leaves
  test files unchanged.
- When you leave the Driver mode (hitting `Ctrl-C`), TCR pushes all recent commits
  to the repository.

__Important__

- __Make sure to turn off your IDE's auto-save mode while using TCR!!!__.
  TCR constantly watches the file system, triggering builds,
  tests, commits and reverts as soon as it detects changes.
  For this reason, it does not get along well with your IDE's auto-save mode. 
- __There should not be more than one driver per branch at a time!__.
  You will likely face occasional merge conflicts otherwise.

### Navigator mode

- To enter in Navigator mode, hit `N` from the main menu
- You remain in Navigator mode until you hit `Ctrl-C` to go back to the main menu

When running in Navigator mode, the script periodically pulls changes from the git repository
to your local machine. It does not push any change that you might make locally.

### Ending the script

- If you're in driver or navigator mode, go back to the main menu by hitting `Ctrl-C`
- Type `Q` to end the script

## Contribution Workflow

The TCR script provides the basic mechanics to run TCR and synchronize files between contributors,
however it does not replace collaboration discipline.

So make sure that at the end of each driver rotation:

- The former driver switches back to Navigator mode: `Ctrl-C` + `N`
- The new driver switches to Driver mode: `Ctrl-C` + `D`

Other contributors have nothing to do as long as they remain navigators.

## Command Line Options

The `tcrw` script utility provides the following options:

### Basic Command Line Help Display

In order to display available options:

```shell
> ./tcrw -h
```

### Toolchain Selection

The TCR script can use different toolchains when launching build and test.

Here are the toolchains currently supported:

| Toolchain | Language | Default |
| --- | --- | --- |
| gradle | Java | X |
| maven | Java | |
| cmake | C++ | X |

Please note that you do not need to install any of these toolchains on your machine in order to use them.
We provide the wrappers allowing to download and run them in the context of the kata.

For example, to use Maven instead of Gradle when running the TCR script for a kata in Java:

```shell
> ./tcrw -t maven
```
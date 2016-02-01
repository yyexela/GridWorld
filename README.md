# Grid World

## Getting started

Fork and clone the [GridWorld repo](http://github.com/mvhs-apcs/GridWorld).

## Branches

The code is organized into packages so creating a branch for each Part is not required (but recommended).

If you choose to create a branch for each part, follow these steps:

1. Create and checkout a new branch
    ```
    $ git checkout -b part#
    ```
2. Make commits for significant code changes
3. When finished with the entire Part, merge the changes back to `master`.
    ```
    $ git checkout master
    $ git merge part#
    ```
4. It is now safe to delete the `part#` branch.
    ```
    $ git branch -d part#
    ```
5. Push changes to github
    ```
    $ git push
    ```

## Instructions

Read instructions for Part 1 in `Grid World Student Manual.pdf`. You have also have `GridWorld Appendices.pdf` for quick API reference.

`answers.md` has been provided for you to write the answers to any questions asked in the Student Manual.

Make commits to this branch as you complete the steps outlined in the activity.

## Submitting

Commit all local changes, then:
```
$ git push
```
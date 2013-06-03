#Lift version 2.5 templates

This repository contains templates for Lift projects.

These templates offer a starting point for your Lift-based project.

If you want to start with Scala 2.10.0, use the templates in the scala_210 directory

##Getting started.

Most people will want to start with the `lift_basic` template. This template shows you how to use:

* `Mapper`, which is one way to connect to a database using **Lift**.
* `specs2`, to write unit tests (or spec tests).

##How to use them.

At your terminal, enter:

1. `git clone https://github.com/lift/lift_25_sbt.git`
2. `cd lift_25_sbt/scala_29/lift_basic`
3. `./sbt`
       
       SBT will download a lot of stuff and after some time, you will see the sbt prompt `>`
4. `gen-idea`

       This will download even more stuff, and it will generate files that Intellij IDEA can read. IntelliJ is one of several IDE's you can use.
5. `container:start`
6. Your Lift application is now running at [127.0.0.1:8080](http://127.0.0.1:8080)
 
 
##How to work with Lift.

Now that you have your first Lift application running, you may want to look around the code, change a few things and see what happens.

You can use any IDE you want, even a text editor, but one of the best IDE for Scala is IntelliJ IDEA with the scala plugin. We'll assume you already got that installed. If you need help, this is the [plugin page](http://confluence.jetbrains.net/display/SCA/Scala+Plugin+for+IntelliJ+IDEA)
 
1. Open Intellij, click on `File` -> `Open Project`
2. Navigate to the folder `lift_25_sbt/scala_29/lift_basic` and click open.

       Because we run the `gen-idea` command in the previous section, **sbt** already created the files Intellij needs to understand a new project.
       You can now navigate through the different files, and make changes as you wish. To see those changes take effect, you go back to `sbt` and restart `jetty` by doing `;container:stop;container:start`

## Getting help.     

Questions, feedback, etc. please join the conversation at https://groups.google.com/forum/#!forum/liftweb

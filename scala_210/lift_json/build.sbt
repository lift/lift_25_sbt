name := "Lift 2.5 starter template"

version := "0.0.1"

organization := "net.liftweb"

scalaVersion := "2.10.0"

resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                "releases"        at "http://oss.sonatype.org/content/repositories/releases"
                )

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val liftVersion = "2.5.3"
  Seq(
    "net.liftweb"       %% "lift-json"          % liftVersion % "compile",
    "ch.qos.logback"    % "logback-classic"     % "1.0.6",
    "org.specs2"        %% "specs2"             % "1.14"      % "test"
  )
}


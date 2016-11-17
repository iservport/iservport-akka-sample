organization := "com.iservport"

name := "iservport-akka-sample"

version := "1.0"

scalaVersion := "2.11.8"

lazy val root = (project in file("."))

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.11"
)
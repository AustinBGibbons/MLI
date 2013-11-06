import AssemblyKeys._

assemblySettings

name := "MLI"

version := "1.0-SNAPSHOT"

organization := "me.edu.berkeley.cs.amplab"

scalaVersion := "2.9.3"

libraryDependencies ++= Seq(
  "me.org.apache.spark" % "spark-core_2.9.3" % "0.9.0-incubating-SNAPSHOT",
  "me.org.apache.spark" % "spark-mllib_2.9.3" % "0.9.0-incubating-SNAPSHOT",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)

resolvers ++= Seq(
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases",
  "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/",
  "ScalaNLP Maven2" at "http://repo.scalanlp.org/repo",
  "Spray" at "http://repo.spray.cc"
)


organization := "me.passenger"

name := "akka-persistence-mongo-rx"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.6"

val AkkaV = "2.3.9"

libraryDependencies ++= Seq(
  "com.github.scullxbones" %% "akka-persistence-mongo-common" % "0.2.4",
  "org.reactivemongo" %% "reactivemongo" % "0.10.5.0.akka23" % "provided",
  ("com.typesafe.akka" %% "akka-persistence-experimental" % AkkaV % "provided")
    .exclude("org.iq80.leveldb","leveldb")
    .exclude("org.fusesource.leveldbjni","leveldbjni-all")
)
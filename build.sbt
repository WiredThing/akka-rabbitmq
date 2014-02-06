// ---------------------------------------------------------------------------
// Basic settings

name := "akka-rabbitmq"

organization := "com.thenewmotion.akka"

version := "1.1.2-SNAPSHOT"

licenses := Seq("BSD" -> url("http://software.clapper.org/avsl/license.html"))

homepage := Some(url("http://software.clapper.org/avsl/"))

description := "A Very Simple Logger"

scalaVersion := "2.10.3"

val rabbitmq = "com.rabbitmq" % "amqp-client" % "3.1.3"

val akka_version = "2.2.3"

val akka_actor = "com.typesafe.akka" %% "akka-actor" % akka_version

val akka_testkit = "com.typesafe.akka" %% "akka-testkit" % akka_version % "test"

val mockito = "org.mockito" % "mockito-core" % "1.9.5" % "test"

val specs2 = "org.specs2" % "specs2_2.10" % "2.3.7" % "test"

libraryDependencies ++= Seq(rabbitmq,
  akka_actor, akka_testkit,
  mockito, specs2)


// ---------------------------------------------------------------------------
// Additional compiler options and plugins

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")


// ---------------------------------------------------------------------------
// Additional repositories

resolvers ++= Seq(
  "Java.net Maven 2 Repo" at "http://download.java.net/maven/2"
)


name := """akka-stream-trace-libling"""
scalaVersion := "2.12.2"

resolvers += "Apache OSS Snapshots" at "https://repository.apache.org/content/groups/snapshots/"
// the libling library plugin configures this build as a libling
enablePlugins(HacklingLibraryPlugin)

// choose your test framework (but don't include binary dependencies in compile scope)
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
//libraryDependencies += "org.specs2" %% "specs2-core" % "3.8.9" % "test"

// depend on other liblings
//sourceDependencies += Dependency(
//  Version("<git commit hash>"),
//  Repositories(uri("<git repository uri>")))

val joda = "joda-time" % "joda-time" % "2.8.1"

val conf = "com.typesafe" % "config" % "1.3.0"

val akka = {
  val httpV = "10.0.0"
  Seq(
    "com.typesafe.akka" %% "akka-http" % httpV,
    "com.typesafe.akka" %% "akka-http-testkit" % httpV
  )
}

val trace = {
  Seq(
    "org.apache.htrace" % "htrace-core4" % "4.3.0-SNAPSHOT",
    "org.apache.htrace" % "htrace-zipkin" % "4.3.0-SNAPSHOT"
  )
}

val testLib = Seq("org.scalactic" %% "scalactic" % "3.0.0", "org.scalatest" %% "scalatest" % "3.0.0" % "test")



libraryDependencies ++= Seq(conf,joda)++ akka ++ trace ++ testLib

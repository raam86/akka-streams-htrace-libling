This is a libling!

## adding this libling as dependency

In your sbt project:

In `project/plugins.sbt`

    resolvers += Resolver.bintrayIvyRepo("jastice","sbt-plugins")
    addSbtPlugin("libling" % "sbt-hackling" % "0.2.1")

In `build.sbt`

    sourceDependencies += Dependency(
      Version("92ad7d991f3110b0d8759f896ed5bc89e4755c52"),
      Repositories(uri("https://github.com/raam86/akka-streams-htrace-libling.git")))

[parent repo](https://github.com/findhotel/akka-stream-trace)


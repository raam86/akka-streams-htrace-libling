This is a libling!

## adding this libling as dependency

In your sbt project:

In `project/plugins.sbt`

    resolvers += Resolver.bintrayIvyRepo("jastice","sbt-plugins")
    addSbtPlugin("libling" % "sbt-hackling" % "0.2.1")

In `build.sbt`

    sourceDependencies += Dependency(
        Version("<git commit hash>"), 
        Repositories(uri("<git repository uri>")))

## structure

A libling is deliberately simple and inflexible. For now.

These things will be copied into a project when the libling is added as a dependency by default

    README.md
        project description and basic docs
    /doc
        additional markdown documentation
    /src
        your Scala library code goes here
    /libling
        libling metadata, generated

These things are included in the template, but not included as dependency by default:

    build.sbt
    /project
        the ususal sbt stuff
    /test
        your tests are in here


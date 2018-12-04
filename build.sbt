import Dependencies._
import Resolvers._

name := "examples"

scalaVersion in ThisBuild := "2.12.7"

lazy val geo = project
    .settings(
        name := "geo",
        resolvers ++= Seq(osgeo, boundless, boundless2),
        libraryDependencies ++= Seq(jts, geotools, hsql)
        // mainClass in (Compile, run) := Some("examples.GeoExamples")
    )

lazy val pg = project
    .settings(
        name := "pg",        
        libraryDependencies ++= Seq(postgresql)
    )




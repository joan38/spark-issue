name := "data-lake"
scalaVersion := "2.11.12"
libraryDependencies ++= spark ++ logging ++ scalatest ++ scalacheck

lazy val spark = {
  val version = "2.3.0"
  Seq(
    "org.apache.spark" %% "spark-sql" % version,
    "org.apache.spark" %% "spark-streaming" % version
  )
}

lazy val logging = Seq(
  "com.typesafe.scala-logging" %% "scala-logging" % "3.8.0",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)

lazy val scalatest = Seq("org.scalatest" %% "scalatest" % "3.0.5" % Test)

lazy val scalacheck = Seq("org.scalacheck" %% "scalacheck" % "1.14.0" % Test)

lazy val SpringBootVersion = "2.5.1"

lazy val root = project
  .in(file("."))
  // sbt-web-plugin: https://github.com/earldouglas/xsbt-web-plugin
  .enablePlugins(TomcatPlugin)
  .settings(
    name := "springboot-mvp",
    version := "0.1.0",

    scalaVersion := "2.13.6",

    artifactName := { (v: ScalaVersion, m: ModuleID, a: Artifact) =>
      a.name + "." + a.extension
    },
    
    libraryDependencies ++= Seq(
      "org.springframework.boot" % "spring-boot-starter-web" % SpringBootVersion exclude("org.springframework.boot", "spring-boot-starter-tomcat"),
      "org.springframework.boot" % "spring-boot-starter-tomcat" % SpringBootVersion % "provided",

      "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.10",
      "org.springframework.boot" % "spring-boot-starter-test" % SpringBootVersion % "test",
      "com.novocode" % "junit-interface" % "0.11" % "test"
    ),



  )

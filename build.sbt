lazy val SpringBootVersion = "2.5.1"

lazy val root = project
  .in(file("."))
  .enablePlugins(TomcatPlugin)
  .settings(
    name := "springboot-mvp",
    version := "0.1.0",

    scalaVersion := "3.0.0",

    libraryDependencies ++= Seq(
      "org.springframework.boot" % "spring-boot-starter-web" % SpringBootVersion,
      "org.springframework.boot" % "spring-boot-starter-tomcat" % SpringBootVersion % "provided",

      "org.springframework.boot" % "spring-boot-starter-test" % SpringBootVersion % "test",
       "com.novocode" % "junit-interface" % "0.11" % "test"
    )
  )

package fr.devfondation.fixturesGenerator

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class FixturesGeneratorApplication

fun main(args: Array<String>) {
    SpringApplication.run(FixturesGeneratorApplication::class.java, *args)
}

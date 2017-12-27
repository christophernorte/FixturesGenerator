package fr.devfondation.fixturesGenerator.runner

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class Entrypoint : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        println("Hello moto");
    }
}


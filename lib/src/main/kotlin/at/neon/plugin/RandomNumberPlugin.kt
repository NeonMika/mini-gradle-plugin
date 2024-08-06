package at.neon.plugin

import at.neon.NeonLibrary
import org.gradle.api.Plugin
import org.gradle.api.Project

class RandomNumberPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val lib = NeonLibrary()
        project.tasks.register("randomNumber") {
            doLast {
                println("The random number is ${lib.getRandomNumber()}")
            }
        }
    }
}
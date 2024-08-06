package at.neon.plugin

import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

class RandomNumberPluginTest {
    @Test
    fun `plugin find task after registration with plugin id`() {
        val project = ProjectBuilder.builder().build()
        project.plugins.apply("at.neon.random-number")

        assertNotNull(project.tasks.findByName("randomNumber"))
    }

    @Test
    fun `plugin do not find task without registration`() {
        val project = ProjectBuilder.builder().build()

        assertNull(project.tasks.findByName("randomNumber"))
    }
}

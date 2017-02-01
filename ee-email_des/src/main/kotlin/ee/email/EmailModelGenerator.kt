package ee.email

import ee.dsl.data.KotlinGenerator
import ee.dsl.integ.eePath

fun main(args: Array<String>) {
    val generator = KotlinGenerator(model())
    generator.generate(eePath)
}

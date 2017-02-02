package ee.email

import ee.design.KotlinGenerator
import ee.lang.integ.eePath

fun main(args: Array<String>) {
    val generator = KotlinGenerator(model())
    generator.generate(eePath)
}

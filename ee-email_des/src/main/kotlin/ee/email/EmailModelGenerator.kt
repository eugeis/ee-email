package ee.email

import ee.design.gen.DesingKotlinGenerator
import ee.lang.integ.eePath

fun main(args: Array<String>) {
    val generator = DesingKotlinGenerator(model())
    generator.generate(eePath)
}

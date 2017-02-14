package ee.email

import ee.design.gen.DesignKotlinGenerator
import ee.lang.integ.dPath
import ee.lang.integ.eePath

fun main(args: Array<String>) {
    val generator = DesignKotlinGenerator(Email)
    generator.generate(dPath)
}

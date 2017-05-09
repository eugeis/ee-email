package ee.email

import ee.design.gen.go.DesignGoGenerator
import ee.design.gen.kt.DesignKotlinGenerator
import ee.lang.integ.dPath

fun main(args: Array<String>) {
    generateGo()
}

fun generateKotlin() {
    var generator = DesignKotlinGenerator(Email)
    generator.generate(dPath)
}

fun generateGo() {
    var generator = DesignGoGenerator(Email)
    generator.generate(dPath)
}


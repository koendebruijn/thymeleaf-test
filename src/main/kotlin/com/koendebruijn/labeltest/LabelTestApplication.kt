package com.koendebruijn.labeltest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LabelTestApplication

fun main(args: Array<String>) {
    runApplication<LabelTestApplication>(*args)
}

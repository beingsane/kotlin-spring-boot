package org.michaelss.kotlinspringboot

import org.springframework.web.bind.annotation.RequestMapping

@org.springframework.web.bind.annotation.RestController
class GreetingController {

    val counter = java.util.concurrent.atomic.AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(@org.springframework.web.bind.annotation.RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
        return Greeting(counter.incrementAndGet(), "Olá, $name")
    }

}
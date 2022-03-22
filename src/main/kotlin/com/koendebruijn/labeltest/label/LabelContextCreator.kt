package com.koendebruijn.labeltest.label

import com.koendebruijn.labeltest.models.Shipment
import org.springframework.stereotype.Component
import org.thymeleaf.context.Context

@Component
class LabelContextCreator {

    fun createContext(shipment: Shipment): Context {
        val context = Context()
        context.setVariable("name", shipment.name)
        context.setVariable("carrier", shipment.carrier)

        return context
    }
}
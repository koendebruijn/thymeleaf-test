package com.koendebruijn.labeltest.label

import com.koendebruijn.labeltest.models.Shipment
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import org.thymeleaf.TemplateEngine

@Service
class LabelService(private val zplTemplateEngine: TemplateEngine, private val labelContextCreator: LabelContextCreator) {


    fun processLabel(labelTemplate: String): String {
        val shipment = Shipment("Koen", "PostNL")
        return zplTemplateEngine.process(labelTemplate, labelContextCreator.createContext(shipment))
            ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }
}
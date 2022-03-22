package com.koendebruijn.labeltest.label

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/label")
class LabelController(private val labelService: LabelService) {

    @GetMapping("{labelTemplate}")
    fun getLabel(@PathVariable labelTemplate: String): String {
        return labelService.processLabel(labelTemplate)
    }
}
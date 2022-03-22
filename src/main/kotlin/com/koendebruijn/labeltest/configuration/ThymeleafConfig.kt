package com.koendebruijn.labeltest.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.thymeleaf.TemplateEngine
import org.thymeleaf.templatemode.TemplateMode

import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver

import org.thymeleaf.templateresolver.ITemplateResolver







@Configuration
class ThymeleafConfig {

    @Bean
    fun zplTemplateEngine(): TemplateEngine {
        val templateEngine = TemplateEngine()
        templateEngine.addTemplateResolver(zplTemplateResolver())
        return templateEngine
    }

    private fun zplTemplateResolver(): ITemplateResolver {
        val templateResolver = ClassLoaderTemplateResolver()
        templateResolver.prefix = "/templates/labels/"
        templateResolver.suffix = ".zpl"
        templateResolver.templateMode = TemplateMode.TEXT
        templateResolver.characterEncoding = "UTF8"
        templateResolver.checkExistence = true
        templateResolver.isCacheable = false
        return templateResolver
    }
}
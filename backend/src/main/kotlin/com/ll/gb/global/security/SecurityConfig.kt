package com.ll.gb.global.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.invoke
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {
    @Bean
    fun securityFilterChain(httpSecurity: HttpSecurity): SecurityFilterChain {
        httpSecurity {
            authorizeHttpRequests {
                authorize("/**", permitAll)
            }

            headers {
                frameOptions {
                    sameOrigin = true
                }
            }

            csrf { disable() }
        }

        return httpSecurity.build()
    }
}
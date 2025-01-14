package com.example.demo.exception

import org.springframework.graphql.execution.ErrorType

abstract class AbstractException(
    val code: String,
    val errorType: ErrorType,
    val params: Map<String, Any>,
    override val message: String,
) : RuntimeException(message)
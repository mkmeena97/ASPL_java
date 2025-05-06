package com.example.demo.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(
	    info = @Info(title = "Your API", version = "1.0"),
	    security = @SecurityRequirement(name = "bearerAuth") // Should match the name in @SecurityScheme
	)
	@SecurityScheme(
	    name = "bearerAuth", // <-- Must match
	    type = SecuritySchemeType.HTTP,
	    scheme = "bearer",
	    bearerFormat = "JWT"
	)
	public class OpenApiConfig {
	}



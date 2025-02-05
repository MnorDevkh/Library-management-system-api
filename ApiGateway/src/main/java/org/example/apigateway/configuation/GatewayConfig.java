package org.example.apigateway.configuation;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
@CacheConfig
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("library", r -> r
                        .path("/api/service-library/**")
                        .uri("lb://library"))
                .build();
    }

}

package org.acme;

import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import io.vertx.ext.web.RoutingContext;
import javax.inject.Singleton;

@Singleton
@RouteBase(path = "hello", produces = "text/plain")
public class GreetingResource {
    @Route(methods = Route.HttpMethod.GET, path = "/*")
    public void hello(RoutingContext context) {
        context.response().end("Hello!.");
    }
}
package org.acme.control;

import org.acme.control.AIService.Highlights;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class AIServiceIT {

    @Inject
    AIService aiService;

    @Test
    public void shouldGetHighlightsResult() {
        Highlights result = aiService.getHighlights("""
                A cohesive platform for optimized developer joy with unified configuration and no hassle native executable generation. Zero config, live reload in the blink of an eye and streamlined code for the 80% common usages, flexible for the remainder 20%.
                Quarkus streamlines framework optimizations in the build phase to reduce runtime dependencies and improve efficiency. By precomputing metadata and optimizing class loading, it ensures fast startup times for JVM and native binary deployments, cutting down on memory usage
                The combination of Quarkus and Kubernetes provides an ideal environment for creating scalable, fast, and lightweight applications. Quarkus significantly increases developer productivity with tooling, pre-built integrations, application services, and more.
                """, "de", 3);
        assertThat(result, is(notNullValue()));
        assertThat(result.highlights(), is(notNullValue()));
        assertThat(result.highlights().size(), is(3));
        result.highlights().forEach(System.out::println);
    }

}

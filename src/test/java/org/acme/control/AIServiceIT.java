package org.acme.control;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.Multi;
import jakarta.inject.Inject;

@QuarkusTest
public class AIServiceIT {

    @Inject
    AIService aiService;

    @Test
    public void shouldGetResponse() {
        String result = aiService.getResponse("Tell me something about Berlin?");
        assertThat(result, is(notNullValue()));
        System.out.println(result);
    }

    @Test
    public void shouldGetStreamedResponse() {
        Multi<String> result = aiService.getStreamedResponse("Tell me something about Berlin?");
        List<String> resultList = result.collect().asList().await().atMost(Duration.ofSeconds(10));
        assertThat(resultList, is(notNullValue()));
        assertThat(resultList.size(), is(greaterThan(0)));
        resultList.forEach(System.out::println);
    }

}

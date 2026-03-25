package org.acme.control;

import java.time.Duration;
import java.util.Optional;
import java.util.function.Supplier;

import org.eclipse.microprofile.config.ConfigProvider;

import dev.langchain4j.http.client.jdk.JdkHttpClientBuilder;
import dev.langchain4j.model.chat.StreamingChatModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiStreamingChatModel;

public class GeminiStreamingChatModelSupplier implements Supplier<StreamingChatModel> {

    @Override
    public StreamingChatModel get() {
        String apiKey = ConfigProvider.getConfig()
                .getOptionalValue("quarkus.langchain4j.ai.gemini.api-key", String.class)
                .orElse("");

        String modelName = ConfigProvider.getConfig()
                .getOptionalValue("quarkus.langchain4j.ai.gemini.chat-model.model-id", String.class)
                .orElse("gemini-3-flash-preview");

        Duration timeout = getDuration("quarkus.langchain4j.ai.gemini.chat-model.timeout")
                .or(() -> getDuration("quarkus.langchain4j.ai.gemini.timeout"))
                .orElse(Duration.ofSeconds(60));

        return GoogleAiGeminiStreamingChatModel.builder()
                .httpClientBuilder(new JdkHttpClientBuilder())
                .apiKey(apiKey)
                .modelName(modelName)
                .timeout(timeout)
                .build();
    }

    private static Optional<Duration> getDuration(String key) {
        return ConfigProvider.getConfig().getOptionalValue(key, Duration.class);
    }
}


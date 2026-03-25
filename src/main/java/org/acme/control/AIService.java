package org.acme.control;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import io.smallrye.mutiny.Multi;
import jakarta.enterprise.context.ApplicationScoped;

@RegisterAiService(streamingChatLanguageModelSupplier = GeminiStreamingChatModelSupplier.class)
@ApplicationScoped
public interface AIService {

    @SystemMessage("""
            Answer the question. 
            """)
    @UserMessage("""
            Answer the question: {text}
            """)
    Multi<String> getStreamedResponse(String text);

    @SystemMessage("""
            Answer the question. 
            """)
    @UserMessage("""
            Answer the question: {text}
            """)
    String getResponse(String text);
}

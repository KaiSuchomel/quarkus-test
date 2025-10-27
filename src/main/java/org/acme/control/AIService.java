package org.acme.control;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

@RegisterAiService
@ApplicationScoped
public interface AIService {

    @SystemMessage("""
                  You are an agentic AI acting as an interactive chatbot in a production environment.
                  Use only the following DocumentationData to answer. 
                  If you dont find somethig in the given Context do not try to find somewhere else.
                  Do not use training data
                  """)
    String chat(@MemoryId int sessionId, @UserMessage String usermessage);

}

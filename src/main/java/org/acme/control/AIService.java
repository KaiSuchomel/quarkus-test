package org.acme.control;

import java.util.List;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

@RegisterAiService
@ApplicationScoped
public interface AIService {

    @SystemMessage("""
            You are a Highlights service.
            Return ONLY valid JSON.
            Do not include markdown.
            Do not include explanations.
            Do not include text before or after the JSON.
            If the output becomes long, you must still continue the JSON array.
            Never stop in the middle of a JSON object.
            CRITICAL: The response MUST be a JSON object (not an array) with this exact structure:
            {
                "highlights": [
                    {
                        "text": "...",
                        "label": "..."
                    },
                    {
                        "text": "...",
                        "label": "..."
                    },
                    ...
                ]
            }
            """)
    @UserMessage("""
            Generate a List of Highlevel-Bulletpoints from Text: {text} with maximum Number of Bulletpoints: {numberOfBulletPoints}.
            Answer in {language}.
            Answer in JSON.
            """)
    Highlights getHighlights(String text, String language, Integer numberOfBulletPoints);


    public record Highlights(List<Highlight> highlights) {    }

    public record Highlight(String text, String label) {    }
}

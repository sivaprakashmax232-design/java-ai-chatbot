package com.example.chatbot.service;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final ChatModel chatModel;

    public ChatService(@Value("${openai.api-key:}") String apiKey) {
        if (apiKey == null || apiKey.isBlank()) {
            throw new IllegalStateException("Missing OPENAI_API_KEY environment variable.");
        }

        this.chatModel = OpenAiChatModel.builder()
                .apiKey(apiKey)
                .modelName("gpt-4o-mini")
                .build();
    }

    public String chat(String prompt) {
        if (prompt == null || prompt.isBlank()) {
            return "Please enter a valid message.";
        }

        return chatModel.chat(prompt);
    }
}

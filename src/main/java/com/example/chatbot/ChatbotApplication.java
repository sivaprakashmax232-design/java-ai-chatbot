package com.example.chatbot;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;

import java.util.Scanner;

public class ChatbotApplication {

    public static void main(String[] args) {
        String apiKey = System.getenv("OPENAI_API_KEY");

        if (apiKey == null || apiKey.isBlank()) {
            System.out.println("Missing OPENAI_API_KEY environment variable.");
            System.out.println("Set it before running the bot:");
            System.out.println("export OPENAI_API_KEY=your-key-here");
            return;
        }

        ChatModel model = OpenAiChatModel.builder()
                .apiKey(apiKey)
                .modelName("gpt-4o-mini")
                .build();

        System.out.println("Java AI Chatbot started. Type 'exit' to quit.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();

            if (input == null || input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            if (input.isBlank()) {
                continue;
            }

            try {
                String reply = model.chat(input);
                System.out.println("Bot: " + reply);
            } catch (Exception e) {
                System.out.println("Error while contacting the AI model: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

# Java AI Chatbot Starter

A small Java project that demonstrates an AI-powered chat bot using LangChain4j with the OpenAI API.

## Features

- Console-based Java chatbot
- Uses LangChain4j for model interaction
- Reads API key from `OPENAI_API_KEY`
- Very easy to extend with web UI or Spring Boot

## Prerequisites

- Java 17+
- Maven
- OpenAI API key

## Setup

1. Export your API key:

```bash
export OPENAI_API_KEY="your-api-key-here"
```

2. Build the project:

```bash
mvn clean package
```

3. Run the app:

```bash
mvn exec:java -Dexec.mainClass="com.example.chatbot.ChatbotApplication"
```

Or run the jar:

```bash
java -jar target/java-ai-chatbot-1.0.0.jar
```

## Example conversation

```text
You: Hello
Bot: Hi! How can I help you today?
```

## Notes

This repository is a starter template. You can later add:

- Spring Boot REST API
- Web UI (React or Thymeleaf)
- Database persistence
- RAG (retrieval-augmented generation)
- Multiple LLM providers


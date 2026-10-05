# Java AI Chatbot

A simple Java chatbot project built with Spring Boot and LangChain4j. It exposes a REST API and a browser UI for chatting with an OpenAI model.

## Features

- Spring Boot web app
- REST API endpoint for chat
- Browser-based chat UI
- OpenAI integration via LangChain4j
- Easy to extend with memory, RAG, or database persistence

## Prerequisites

- Java 17+
- Maven
- OpenAI API key

## Run locally

1. Export your API key:

```bash
export OPENAI_API_KEY="your-api-key"
```

2. Build the project:

```bash
mvn clean package
```

3. Start the app:

```bash
mvn spring-boot:run
```

4. Open the UI in your browser:

```text
http://localhost:8080
```

## API

### POST /api/chat

Request body:

```json
{
  "message": "Hello there!"
}
```

Response:

```json
{
  "reply": "Hi! How can I help you today?"
}
```

## Project goals

This starter can be extended into:

- customer support chatbot
- document Q&A assistant
- knowledge-base chat app
- multi-agent workflow bot
- enterprise AI assistant


# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Spring AI Alibaba demo project demonstrating AI application development patterns using Alibaba's DashScope (通义千问) models. The project consists of three modules showcasing different AI capabilities:

- **ai1-demo** (port 8081): Basic LLM integration with multiple model configurations
- **ai6-auto-memory** (port 8086): Conversation memory persistence using MySQL
- **ai10-rag** (port 8090): Retrieval Augmented Generation using Milvus vector database

## Technology Stack

- **Java**: 21
- **Spring Boot**: 3.5.14
- **Spring AI Alibaba**: 1.1.2.2 (DashScope integration)
- **Spring AI**: 1.1.2
- **Build Tool**: Maven (multi-module project)

## Common Commands

### Build the entire project
```bash
./mvnw clean install
```

### Build a specific module
```bash
./mvnw clean install -pl ai1-demo
./mvnw clean install -pl ai6-auto-memory
./mvnw clean install -pl ai10-rag
```

### Run a module
```bash
# Run ai1-demo
cd ai1-demo && ./mvnw spring-boot:run

# Run ai6-auto-memory
cd ai6-auto-memory && ./mvnw spring-boot:run

# Run ai10-rag
cd ai10-rag && ./mvnw spring-boot:run
```

### Clean build artifacts
```bash
./mvnw clean
```

## Module Architecture

### ai1-demo - Basic LLM Integration
Demonstrates basic chat functionality with multiple LLM model configurations:
- Supports multiple model beans (`deepseek`, `qwen`) through `LLMConfig`
- Uses DashScope API for LLM access
- Simple chat controller endpoint

### ai6-auto-memory - Conversation Memory Persistence
Demonstrates persistent conversation memory:
- Stores chat history in MySQL database
- Uses `MessageWindowChatMemory` with configurable message window (default: 20)
- Requires MySQL database setup (configured in `application.yml`)
- Uses UTF-8 charset for Chinese character support

### ai10-rag - Retrieval Augmented Generation
Demonstrates RAG pattern implementation:
- Uses Milvus vector database for document storage
- Loads documents from `src/main/resources/放开那个女巫.txt`
- Uses `TokenTextSplitter` for document chunking (chunk size: 1800, min: 800)
- Implements `RetrievalAugmentationAdvisor` with:
  - `VectorStoreDocumentRetriever` (topK: 15, similarity threshold: 0.5)
  - `ContextualQueryAugmenter`
- Automatically initializes vector data on startup if collection is empty

## Configuration Requirements

### Environment Variables
- `DASHSCOPE_API_KEY`: Required API key for Alibaba DashScope

### External Dependencies
- **MySQL** (ai6-auto-memory): Database for chat memory persistence
- **Milvus** (ai10-rag): Vector database for RAG (default: localhost:19530)

### Module Ports
- ai1-demo: 8081
- ai6-auto-memory: 8086
- ai10-rag: 8090

## Key Patterns

### ChatClient Configuration
All modules use `ChatClient.builder(chatModel).build()` pattern for creating chat clients with optional advisors (memory, RAG, etc.).

### Application Properties
Each module has its own `src/main/resources/application.yml` with:
- Server port configuration
- UTF-8 encoding settings for Chinese support
- Spring AI DashScope configuration (model selection, API key)
- Module-specific configurations (database, vector store)

### Package Structure
```
com.mcc.ai
├── config          # Spring configuration classes (LLMConfig, etc.)
├── controller      # REST controllers
└── Main            # Spring Boot application entry point
```

## External References

- [Spring AI Documentation](https://docs.spring.io/spring-ai/reference/api/retrieval-augmented-generation.html)
- [Spring AI Alibaba](https://java2ai.com/docs/quick-start/)
- [Alibaba Bailian Platform](https://bailian.console.aliyun.com/)
# <font style="color:#7E45E8;">学习本套课程需要具备的前置知识</font>
+ SpringBoot3
+ Maven
+ MySQL
+ Linux（用到再学即可）
+ Docker（用到再学即可）
+ JDK17+
+ 至少用过一款大模型（deepseek、qwen、豆包、文心一言等）

# <font style="color:#7E45E8;">速成课推荐</font>
[https://www.mashibing.com/subject/2?activeNav=1&courseNo=2115&courseVersionId=2812](https://www.mashibing.com/subject/2?activeNav=1&courseNo=2115&courseVersionId=2812)

# <font style="color:#7E45E8;">Java程序员近况</font>
咱们来看看企业需求，岗位招聘变化趋势：

<img src="https://cdn.nlark.com/yuque/0/2025/png/39281619/1761721283908-dfeb4687-c571-4832-b0dc-765cc24d1676.png" width="1243.2" title="" crop="0,0,1,1" id="MJUJO" class="ne-image">

凭借上述技术进入到某个公司，做到某一个系统，结合微服务的各种技术栈与业务落地，你就可以有一个不错的工作:

<img src="https://cdn.nlark.com/yuque/0/2025/png/39281619/1761721493564-f0d9af36-f2a4-4579-9d71-887d5c1c00af.png" width="1314.4" title="" crop="0,0,1,1" id="iDB6G" class="ne-image">

# <font style="color:#7E45E8;">Java程序员未来的状态</font>
企业的要求，岗位的招聘也发生了很多的变化：

<img src="https://cdn.nlark.com/yuque/0/2025/png/39281619/1761722580691-a83baade-c6e8-433d-a521-41276283ad6d.png" width="295" title="" crop="0,0,1,1" id="u0S6j" class="ne-image"><img src="https://cdn.nlark.com/yuque/0/2025/png/39281619/1761722580754-1d6bb77a-347a-4759-b3eb-143536689369.png" width="295" title="" crop="0,0,1,1" id="N67v3" class="ne-image">

你看看你简历中加上：

```plain
有使用 Ollama 部署 LLM 的经验，基础掌握使用 Spring AI Alibaba 调用各种大模型并调整配置，
对Spring AI Alibaba 的流式输出，记忆缓存，提示词工程，向量数据库，RAG 均有所了解。
```

# <font style="color:#7E45E8;">为什么要学习Spring AI Alibaba</font>
以前java程序员专注于基于分布式的微服务架构：

![画板](https://cdn.nlark.com/yuque/0/2025/jpeg/39281619/1761725484013-54acf379-7d41-4ee6-9ee2-97c97e258082.jpeg)

类比：

![画板](https://cdn.nlark.com/yuque/0/2025/jpeg/39281619/1761725861932-84f2a28c-4a66-40ab-a9e7-8d9351828579.jpeg)


以后：

![画板](https://cdn.nlark.com/yuque/0/2025/jpeg/39281619/1761802005900-f245ecfd-a821-4603-afe1-eaf4364ca316.jpeg)

总结： Spring AI Alibaba，Spring AI，Langchain4j  是企业级的 Java AI 应用开发框架。

# <font style="color:#7E45E8;">Java AI 应用开发框架的选择</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1767856118509-5fe886f5-593e-41cb-84f2-77e04855d995.png" width="647.2" title="" crop="0,0,1,1" id="ud868e2c3" class="ne-image">

**<font style="color:rgb(31, 35, 41);background-color:rgba(0, 0, 0, 0);">适用场景</font>**

+ <font style="color:rgb(31, 35, 41);background-color:rgba(0, 0, 0, 0);">Spring AI：适合需要「跨云 / 跨模型、基于 Spring 生态、无厂商绑定」的通用 AI 应用开发（如简单的 LLM 对话、基础 RAG 应用）。 </font>
+ <font style="color:rgb(31, 35, 41);background-color:rgba(0, 0, 0, 0);">Spring AI Alibaba：适合「基于阿里云生态、需要企业级管控、复杂智能体 / 工作流」的生产级场景（如企业智能客服、智能办公助手、业务流程自动化 Agent）。</font>
+ <font style="color:rgb(31, 35, 41);background-color:rgba(0, 0, 0, 0);">LangChain4j：适合「轻量化 LLM 应用、无需 Spring 生态、快速验证原型」的场景（如小工具、Demo 级 RAG 应用），或非 Spring 技术栈的 Java 项目。</font>

# <font style="color:#7E45E8;">Spring AI Alibaba的介绍</font>
Spring AI Alibaba 是基于 Spring AI 构建的框架，专注于与阿里云生态的深度集成。适合国内开发者，尤其是需要快速接入阿里云 AI 能力的场景。



# <font style="color:#7E45E8;">Spring AI Alibaba的官网</font>
官网地址：[https://java2ai.com/](https://java2ai.com/)

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1767938105002-afa2797f-09f3-4e6a-81d0-c00dce0bd06f.png" width="1056" title="" crop="0,0,1,1" id="rK2bk" class="ne-image">

# <font style="color:#7E45E8;">课程目标 </font>
<font style="color:rgb(31, 35, 41);background-color:rgba(0, 0, 0, 0);">掌握基于 Spring 生态的 AI 应用开发，覆盖大模型集成、RAG、Tool Calling、MCP 协议、智能体等核心场景。  </font>

# <font style="color:#7E45E8;">大模型的使用</font>
![画板](https://cdn.nlark.com/yuque/0/2026/jpeg/39281619/1768193738377-531a09ac-cc05-439d-9df5-25a569b3693b.jpeg)

# <font style="color:#7E45E8;">Spring AI Alibaba小试牛刀（访问云端大模型）</font>
## <font style="color:#C99103;">介绍阿里百炼平台</font>
阿里百炼平台地址：

[https://bailian.console.aliyun.com/](https://bailian.console.aliyun.com/)

<img src="https://cdn.nlark.com/yuque/0/2025/png/39281619/1761800185585-d2bcf71c-ed8b-4216-875c-e7add23bb3a3.png" width="1316.8" title="" crop="0,0,1,1" id="upoBA" class="ne-image">



## <font style="color:#C99103;">最终完成效果</font>
![画板](https://cdn.nlark.com/yuque/0/2026/jpeg/39281619/1768194080243-c82285f1-24b0-4c1e-bc45-cfd8329c9391.jpeg)

## <font style="color:#C99103;">思考怎么调用呢</font>
模型调用三件套：

+ API Key
+ 模型名
+ 调用地址



### <font style="color:#AE146E;">API Key</font>
怎么设置：

<img src="https://cdn.nlark.com/yuque/0/2025/png/39281619/1761800968430-39b2ffb3-c88e-4fd9-9f43-c7efd7ff6e65.png" width="636" title="" crop="0,0,1,1" id="ue25e5715" class="ne-image">



### <font style="color:#AE146E;">模型名</font>
<img src="https://cdn.nlark.com/yuque/0/2025/png/39281619/1761801287811-b773c9a5-879b-4904-ae3f-83a7648f051c.png" width="386.4" title="" crop="0,0,1,1" id="u16085b17" class="ne-image">

<img src="https://cdn.nlark.com/yuque/0/2025/png/39281619/1761801400262-41c1f693-49e5-4c58-ace1-8df2f709f981.png" width="516.8" title="" crop="0,0,1,1" id="u6bf3e562" class="ne-image">

### <font style="color:#AE146E;">调用地址 </font>
通过模型名来确定你要访问哪个模型，那调用模型api的地址是啥？

<img src="https://cdn.nlark.com/yuque/0/2025/png/39281619/1761801708138-8fad6aca-80f9-4be7-abaf-1712c2853478.png" width="888.8" title="" crop="0,0,1,1" id="u1031b197" class="ne-image">

## <font style="color:#C99103;">代码实现</font>
### <font style="color:#07787E;">创建聚合工程</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768194510319-2e1a060d-33f2-4646-94f2-d398038aa081.png" width="785.6" title="" crop="0,0,1,1" id="u5a797ee7" class="ne-image">

### <font style="color:#07787E;">导入依赖</font>
<font style="color:rgb(53, 56, 65);">Spring AI Alibaba 与 Spring AI、Spring Boot 的版本依赖关系，参照：</font>[物料清单](https://java2ai.com/docs/1.0.0.2/faq/?spm=4347728f.6d9f13c1.0.0.17177187POpLHJ#%E6%80%8E%E4%B9%88%E7%A1%AE%E5%AE%9A-spring-ai-alibaba-%E4%B8%8E-spring-aispring-boot-%E7%89%88%E6%9C%AC%E7%9A%84%E5%85%BC%E5%AE%B9%E5%85%B3%E7%B3%BB)

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768193551851-c0ea4594-5af9-47c7-b4df-0525eb5ec7d0.png" width="386.4" title="" crop="0,0,1,1" id="PUbDM" class="ne-image">

导入依赖，参照：[依赖导入](https://java2ai.com/docs/1.0.0.2/tutorials/starters-and-quick-guide/?spm=5176.29160081.0.0.2856aa5c0l3sEA#%E4%BD%BF%E7%94%A8-bom-%E7%AE%A1%E7%90%86%E4%BE%9D%E8%B5%96%E7%89%88%E6%9C%AC)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.msb</groupId>
  <artifactId>SpringAIAlibabaPro</artifactId>
  <version>1.0-SNAPSHOT</version>
  <!--当前项目修改为pom-->
  <packaging>pom</packaging>

  <properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <!--版本确定好：在聚合工程的 properties 里定义版本号，本质是把版本号做成 “全局变量”，
    核心目的是：
    集中管理：所有模块共用的版本号只在父 POM 的 properties 里写一次，改版本时不用逐个模块改，只改父 POM 即可；
    统一引用：子模块（或父 POM）在引用依赖时，通过 ${版本变量名} 引用，保证所有模块用的是同一个版本；-->
    <spring-ai.version>1.0.0</spring-ai.version>
    <spring-ai-alibaba.version>1.0.0.2</spring-ai-alibaba.version>
    <spring-boot.version>3.4.5</spring-boot.version>
  </properties>
  <!--
  dependencyManagement 统一管控依赖规则
  给所有子模块制定一套 “依赖使用规范”：定义了哪些依赖可用、用什么版本、传递性依赖如何处理；
  子模块想使用这些依赖时，只需要声明依赖坐标（groupId+artifactId），无需写版本号，自动沿用父 POM 里定义的版本；
  核心价值：统一所有子模块的依赖版本，避免不同子模块用不同版本的同一依赖导致冲突，同时不强制子模块引入依赖（按需使用）。
  -->
  <dependencyManagement>
    <dependencies>
      <dependency>
        <groupId>com.alibaba.cloud.ai</groupId>
        <artifactId>spring-ai-alibaba-bom</artifactId>
        <version>${spring-ai-alibaba.version}</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-dependencies</artifactId>
        <version>${spring-boot.version}</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
      <dependency>
        <groupId>org.springframework.ai</groupId>
        <artifactId>spring-ai-bom</artifactId>
        <version>${spring-ai.version}</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>

    </dependencies>
  </dependencyManagement>

  <!--
  在聚合工程父 POM 中配置spring-boot-maven-plugin插件，它是 Spring Boot 项目的核心构建插件，在聚合工程中的作用主要是为子模块提供 Spring Boot 相关的构建能力。
  这个配置的核心作用:
  spring-boot-maven-plugin是 Spring Boot 官方提供的 Maven 插件，主要负责Spring Boot 项目的打包、运行、依赖管理等构建操作。在聚合工程（多模块）中，父 POM 配置这个插件后，所有子模块可以继承该插件的配置，无需每个子模块重复写插件信息。
  -->
  <build>
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <version>${spring-boot.version}</version>
      </plugin>
    </plugins>
  </build>

</project>
```

### <font style="color:#07787E;">创建微服务-创建Module</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768197030814-86b29e55-9a28-4ed8-806d-bacc9a46c4c5.png" width="785.6" title="" crop="0,0,1,1" id="u34b9b3fa" class="ne-image">



### <font style="color:#07787E;">修改SpringAiAlibaba01-pom.xml</font>
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <!--可以看到父工程-->
    <parent>
        <groupId>com.msb</groupId>
        <artifactId>SpringAIAlibabaPro</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <artifactId>SpringAiAlibaba01</artifactId>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>


    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!--
        引入 springai alibaba DashScope 模型适配的 Starter

        开发者开通 DashScope 灵积服务后，就能借助平台提供的接口调用阿里云生态内的各类大模型，还能享受模型微调、部署管理等配套服务，它是衔接开发者与阿里云大模型生态的桥梁。
        DashScope本质是面向 AI 开发者的模型服务接口层。
        DashScope（灵积）的核心价值就是为开发者搭建起对接阿里云大模型生态的桥梁。
        阿里云百炼，它是一个更大范围的大模型服务平台，而DashScope提供的模型服务API是其底层能力之一
        -->
        <dependency>
            <groupId>com.alibaba.cloud.ai</groupId>
            <artifactId>spring-ai-alibaba-starter-dashscope</artifactId>
        </dependency>
    </dependencies>

</project>
```

### <font style="color:#07787E;">秘钥配置</font>
私配置到环境变量


<img src="https://cdn.nlark.com/yuque/0/2025/png/39281619/1761804406592-043c6736-0c48-4cb6-a51a-a2299ee96eec.png" width="561.6" title="" crop="0,0,1,1" id="u22fe75d3" class="ne-image">

### <font style="color:#07787E;">重启idea</font>
怕刚才配置的环境变量不生效，重启一下。

### <font style="color:#07787E;">SpringAiAlibaba01- 编写配置文件</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768198293203-ff4c480a-4ace-47b3-bfe5-c9cc9999986b.png" width="332" title="" crop="0,0,1,1" id="BVmv2" class="ne-image">

```xml
server:
  port: 8888  # 指定当前服务的端口
  servlet:
    encoding:
      enabled: true # 大模型对话中文乱码处理
      force: true
      charset: utf-8
spring:
  application:
    name: springaialibaba01 # 微服务名称
  ai:
    dashscope:
      api-key: ${qwennodel}     # 大模型三件套指定
      base-url: https://dashscope.aliyuncs.com/compatible-mode/v1
      chat:
        options:
          model: qwen3-max
```

Spring AI Alibaba 框架同样支持 “自动配置”：当你引入了对接阿里云 DashScope（通义千问）的启动器依赖，且在配置文件中填写了`<font style="color:rgb(31, 35, 41);background-color:rgba(0, 0, 0, 0);">spring.ai.dashscope</font>`相关信息（`<font style="color:rgb(31, 35, 41);background-color:rgba(0, 0, 0, 0);">api-key</font>`、`<font style="color:rgb(31, 35, 41);background-color:rgba(0, 0, 0, 0);">base-url</font>`、`<font style="color:rgb(31, 35, 41);background-color:rgba(0, 0, 0, 0);">model</font>`），框架会自动创建`<font style="color:rgb(31, 35, 41);background-color:rgba(0, 0, 0, 0);">DashScopeChatModel</font>`等核心 Bean，你直接注入使用即可。

### <font style="color:#07787E;">编写控制层</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768461663109-51ff3d28-cd49-47ae-855a-f4b37fae5edc.png" width="320.8" title="" crop="0,0,1,1" id="ud2c36fea" class="ne-image">

```java
package com.msb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    /*
    * 对话模型，调用阿里云百炼平台
    * ChatModel 所有大模型聊天的总的父接口,支持文本聊天交互模型*/
    @Autowired
    private ChatModel chatModel;

    @GetMapping(value = "/hello/dochat")
    public String doChat(@RequestParam(name = "question",defaultValue="你是谁") String question){
        String result = chatModel.call(question);
        return result;
    }

}

```

具体实现：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768295515170-631a5f93-f3fb-4337-b55e-e1c641ab9dd2.png" width="404" title="" crop="0,0,1,1" id="u1a126499" class="ne-image">

### <font style="color:#07787E;">编写主启动类</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768199491676-18f8fb84-635d-4fc1-975d-f2d4d387f55c.png" width="456" title="" crop="0,0,1,1" id="u164f862d" class="ne-image">

```java
package com.msb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAiAlibaba01Application {
    public static void main(String[] args)    {
        SpringApplication.run(SpringAiAlibaba01Application.class, args);
    }
}
```

### <font style="color:#07787E;">访问测试</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768205717596-7227789e-c693-4faf-94c6-929f4137dbf2.png" width="1524.8" title="" crop="0,0,1,1" id="u99f606b4" class="ne-image">



<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768205366859-e9cb07e2-3f06-44f8-86bf-2d95f615b0e4.png" width="1526.4" title="" crop="0,0,1,1" id="uccac95f4" class="ne-image">

# <font style="color:#7E45E8;">流式输出</font>
## <font style="color:#ECAA04;">什么是流式输出</font>
之前我们在请求访问大模型进行提问时，数据是一起响应过来的，<font style="color:rgb(15, 17, 21);">等待全部内容生成完毕后再一次性返回，</font>用户体验非常差，感觉很慢：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768212942429-9894e25e-f815-453b-aa06-6ecd1ca08eef.png" width="536" title="" crop="0,0,1,1" id="uc9a9be1e" class="ne-image">

而真正的qwen是分批次逐步返回的：  
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768212879510-33d0b774-07fe-4475-b73c-c819489c0ed5.png" width="904" title="" crop="0,0,1,1" id="Uq9oR" class="ne-image">

总结：

<font style="color:#ECAA04;">流式输出</font><font style="color:rgb(15, 17, 21);">是一种逐步返回大模型生成结果的技术，生成一点返回一点，允许服务器将响应内容分批次实时传输给客户端，而不是等待全部内容生成完毕后再一次性返回。</font>

<font style="color:rgb(15, 17, 21);">这种机制能显著提升用户体验，尤其适用于大模型响应较慢的场景（如生成长文本或复杂推理结果）。</font>

<font style="color:rgb(15, 17, 21);"></font>

<font style="color:rgb(15, 17, 21);">服务器在生成内容的过程中，每生成一个或一小段文本（通常是一个Token或一个词），就立即将其发送给客户端，而不是等待整个回答全部生成完毕后再一次性返回。</font>

<font style="color:rgb(15, 17, 21);"></font>

<font style="color:rgb(15, 17, 21);"></font>

<font style="color:rgb(28, 30, 33);">token 是模型用来表示自然语言文本的基本单位，也是我们的计费单元，可以直观的理解为“字”或“词”；通常 1 个中文词语、1 个英文单词、1 个数字或 1 个符号计为 1 个 token。</font>

<font style="color:rgb(28, 30, 33);">一般情况下模型中 token 和字数的换算比例大致如下：</font>

+ <font style="color:rgb(28, 30, 33);">1 个英文字符 ≈ 0.3 个 token。</font>
+ <font style="color:rgb(28, 30, 33);">1 个中文字符 ≈ 0.6 个 token。</font>

## <font style="color:#ECAA04;">代码实现</font>
```java
package com.msb.controller;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class DemoController {
    /*
    * 对话模型，调用阿里云百炼平台
    * ChatModel 所有大模型聊天的总的父接口,支持文本聊天交互模型*/
    @Autowired
    private ChatModel chatModel;

    @GetMapping(value = "/hello/dochat")
    public String doChat(@RequestParam(name = "question",defaultValue="你是谁") String question){
        String result = chatModel.call(question);
        return result;
    }
    /**
     * 流式输出
     */
    @GetMapping(value = "/hello/streamchat")
    public Flux<String> stream(@RequestParam(name = "msg",defaultValue="你是谁") String question){
        return chatModel.stream(question);
    }

}

```

+ `<font style="color:rgb(15, 17, 21);background-color:rgb(235, 238, 242);">Flux<String></font>`<font style="color:rgb(15, 17, 21);">: 返回响应式流，表示这是一个持续输出多个字符串的流式接口</font>

结果：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768213074497-a4df704e-d8c6-4760-88ec-7e0b6414b329.png" width="831.2" title="" crop="0,0,1,1" id="u2430f66b" class="ne-image">

# <font style="color:#7E45E8;">默认的模型名和baseUrl</font>
在配置文件不写模型名和baseUrl代码也是可以运行的。

```java
server:
  port: 8888  # 指定当前服务的端口
  servlet:
    encoding:
      enabled: true
      force: true
      charset: utf-8  # 大模型对话中文乱码处理
spring:
  application:
    name: saa01-HelloWorld
  ai:
    dashscope:
      api-key: ${QWENAPIKEY} # 指定大模型的apikey
```

在DashScopeApi类内部可以找到默认封装的：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1769082066757-ab49228a-3bd7-44c7-9131-a038c02e2fb8.png" width="923.2" title="" crop="0,0,1,1" id="u2ace6848" class="ne-image">

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1769082081346-11965c34-0c6e-45ad-bf22-9f5bd516f60f.png" width="962.4" title="" crop="0,0,1,1" id="u14d65274" class="ne-image">

# <font style="color:#7E45E8;">多模型共存</font>
增加配置类：

```java
package com.msb.config;

import com.alibaba.cloud.ai.dashscope.api.DashScopeApi;
import com.alibaba.cloud.ai.dashscope.chat.DashScopeChatModel;
import com.alibaba.cloud.ai.dashscope.chat.DashScopeChatOptions;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LLMConfig {
    @Bean(name="deepseek")
    public ChatModel deepseek(){
        return DashScopeChatModel.builder()
                .dashScopeApi(
                        DashScopeApi.builder()
                                .apiKey(System.getenv("QWENAPIKEY"))
                                .build()
                )
                .defaultOptions(
                        DashScopeChatOptions.builder()
                        .withModel("deepseek-v3.2")
                                .build()
                )
                .build();
    }

    @Bean(name="qwen")
    public ChatModel qwen(){
        return DashScopeChatModel.builder()
                .dashScopeApi(
                        DashScopeApi.builder()
                                .apiKey(System.getenv("QWENAPIKEY"))
                                .build()
                )
                .defaultOptions(
                        DashScopeChatOptions.builder()
                                .withModel("qwen3-max")
                                .build()
                )
                .build();
    }
}

```

控制器编写：

```java
package com.msb.controller;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class DemoController {
    @Autowired
    @Qualifier("deepseek")
    private ChatModel deepseekchatModel;
    @Autowired
    @Qualifier("qwen")
    private ChatModel qwenchatModel;

    @RequestMapping("/hello/chat")
    // 编写控制单元
    public String doChat(@RequestParam(name="question",defaultValue = "你是谁") String question){
        // 与大模型对话：
        String result = deepseekchatModel.call(question);
        System.out.println("大模型的回答是：" + result);
        return result;
    }
    @RequestMapping("/hello/stream")
    public Flux<String> stream(@RequestParam(name="question",defaultValue = "你是谁") String question){
        // 与大模型对话：
        return qwenchatModel.stream(question);
    }
}

```

如果不写baseurl，那么就是通过dashscope调用deepseek，调用qwen，那么阿里云 DashScope 公有云服务中，所有文本生成类模型都走同一个 API 网关地址，不同模型共用同一个 baseURL，底层封装好了，不用自己写了

<font style="color:rgb(6, 10, 38);">两个 Bean 共享同一个 </font>`<font style="color:rgb(6, 10, 38);">baseUrl</font>`<font style="color:rgb(6, 10, 38);">（默认 </font>`<font style="color:rgb(6, 10, 38);">https://dashscope.aliyuncs.com</font>`<font style="color:rgb(6, 10, 38);">），仅通过 </font>`<font style="color:rgb(6, 10, 38);">.withModel(...)</font>`<font style="color:rgb(6, 10, 38);"> 区分调用的模型。</font>

ps : 配置文件中apikey必须保证存在，否则报错。

# <font style="color:#7E45E8;">Ollama</font>
## <font style="color:#ECAA04;">什么是Ollama</font>
<font style="color:rgb(36, 41, 46);">Ollama 是一个开源的大型语言模型（LLM）平台，Ollama 提供了简洁易用的命令行界面和服务器，使用户能够轻松下载、运行和管理各种开源 LLM，通过 Ollama，用户可以方便地加载和使用各种预训练的语言模型，支持文本生成、翻译、代码编写、问答等多种自然语言处理任务。</font>

## <font style="color:#ECAA04;">Ollama特点</font>
+ <font style="color:rgb(36, 41, 46);">开源免费：Ollama 是一个开源的本地大型语言模型运行框架，用户可以自由使用、修改和分发，无需支付费用。</font>
+ <font style="color:rgb(36, 41, 46);">跨平台支持：Ollama 支持 macOS、Windows、Linux 以及 Docker多种操作系统环境下顺利部署和使用。</font>
+ <font style="color:rgb(36, 41, 46);">简单易用：通过命令行方式下载、运行、管理各种开源LLM，使非专业用户也能方便的管理运行各种复杂模型。</font>
+ <font style="color:rgb(36, 41, 46);">性能强大：充分利用本地资源，既可以使用GPU也可以使用CPU。</font>
+ <font style="color:rgb(36, 41, 46);">易于集成：Ollama 提供了命令行工具和 API，简化了与其他项目和服务的集成。</font>

## <font style="color:#ECAA04;">Ollama的下载</font>
<font style="color:rgb(36, 41, 46);">ollama官网：</font>https://ollama.com

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768279925346-b2f155e7-c9e6-4fa0-825b-1dbea31dbe0c.png" width="709.6" title="" crop="0,0,1,1" id="u037f4097" class="ne-image">

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768279961235-aaafa261-882c-46c9-acae-0f0a80f532a6.png" width="562.4" title="" crop="0,0,1,1" id="uae4ce993" class="ne-image">

## <font style="color:#ECAA04;">Ollama的安装</font>
【1】定义Ollama的安装目录，并将OllamaSetup.exe放在该目录下：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768283107190-d5f0cf94-ea21-43a3-871a-7cdc8542e5e4.png" width="352" title="" crop="0,0,1,1" id="u43e4470e" class="ne-image">

【2】打开控制命令台：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768283179593-3835eb85-9d95-410d-ac66-e1b404bf68ac.png" width="711.2" title="" crop="0,0,1,1" id="ufbd6c9da" class="ne-image">

【3】命令台录入命令，开始安装

命令：`OllamaSetup.exe /DIR=D:\study_setup\Ollama` ， 这里意思就是把Ollama放在指定的D:\study_setup\Ollama目录下了。

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768283648980-2797e520-0a98-4e6b-a9e9-36e8dce213cc.png" width="876" title="" crop="0,0,1,1" id="u8240d674" class="ne-image">

【4】验证安装成功：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768288077190-55cac0aa-a433-471f-a6b6-05c52522b7ad.png" width="821.6" title="" crop="0,0,1,1" id="u3a82a0b5" class="ne-image">

## <font style="color:#ECAA04;">Ollama支持的模型</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768288160111-8e42c690-7d4d-4055-a237-3323b1571191.png" width="1260" title="" crop="0,0,1,1" id="u6caa5042" class="ne-image">

## <font style="color:#ECAA04;">使用Ollama本地部署大模型</font>
【1】找到qwen3：

[https://ollama.com/library/qwen3](https://ollama.com/library/qwen3)

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768282467775-7a3ec458-7b1b-465b-a924-bc09ff79f797.png" width="1150.4" title="" crop="0,0,1,1" id="heYFX" class="ne-image">



<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768285649399-989abace-1f8b-4db1-b547-c6b7ec2e4b9c.png" width="787.2" title="" crop="0,0,1,1" id="u058be08e" class="ne-image">

【2】选择模型，找到对应的命令：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768285724057-048c5beb-ed08-47bb-9de3-063b325cc6ae.png" width="928.8" title="" crop="0,0,1,1" id="ue65a61a5" class="ne-image">

【3】我们初学，安装4b就够用了：

安装中：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768288430332-4391b5a3-0140-4cdb-9193-b3f03e37cf24.png" width="976.8" title="" crop="0,0,1,1" id="u1a773504" class="ne-image">

安装后可提问：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768288923695-902087a2-8a5d-4793-935f-d8606bb33d1d.png" width="980.8" title="" crop="0,0,1,1" id="u5619f76a" class="ne-image">

退出交互式聊天界面（从 `<font style="color:rgb(31, 35, 41);background-color:rgba(0, 0, 0, 0);">>>></font>` 提示符回到普通命令行），不会停止后台运行的 qwen3:4b 模型进程。

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768289021419-acf20f34-fd2c-48c8-aef2-8038ec6b09dc.png" width="418.4" title="" crop="0,0,1,1" id="u242ddcc7" class="ne-image">

查看当前ollama已下载的模型：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768289052575-2047a3eb-659d-4b7a-a9b5-fc365ddb5443.png" width="456.8" title="" crop="0,0,1,1" id="u7306ce52" class="ne-image">

启动并进入 “qwen3:4b” 这个模型的交互对话界面  ：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768289137524-da8a7a79-55c0-4514-b54d-6a8e54683557.png" width="958.4" title="" crop="0,0,1,1" id="u5b9d417b" class="ne-image">

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768292506531-6bae415d-7e8c-406b-8263-97f9c08cd1f9.png" width="822.4" title="" crop="0,0,1,1" id="u4308a049" class="ne-image">

## <font style="color:#ECAA04;">Java微服务对接本地大模型</font>
### <font style="color:#07787E;">创建微服务SpringAiAlibabaOllama-创建Module</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768293266715-0e39e021-ddfc-4834-a294-7ad5063bd1f5.png" width="785.6" title="" crop="0,0,1,1" id="ud66dd39c" class="ne-image">



### <font style="color:#07787E;">修改SpringAiAlibabaOllama-pom.xml</font>
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>com.msb</groupId>
        <artifactId>SpringAIAlibabaPro</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <artifactId>SpringAiAlibabaOllama</artifactId>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!--
        引入 springai alibaba DashScope 模型适配的 Starter
        -->
        <dependency>
            <groupId>com.alibaba.cloud.ai</groupId>
            <artifactId>spring-ai-alibaba-starter-dashscope</artifactId>
        </dependency>
        <!--ollama
        Spring AI 框架中用于对接 Ollama 本地模型的启动器依赖。
        引入这个依赖后，你可以在 Spring 项目里通过简单配置（比如指定 Ollama 的地址、模型名），
        直接调用 Ollama 本地模型的能力（生成对话、内容等）

        -->
        <dependency>
            <groupId>org.springframework.ai</groupId>
            <artifactId>spring-ai-starter-model-ollama</artifactId>
            <version>1.0.0</version>
        </dependency>
    </dependencies>

</project>
```

### <font style="color:#07787E;">SpringAiAlibabaOllama- 编写配置文件</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768293768682-30f768b9-8c5c-44e8-952c-6a3ef0736074.png" width="403.2" title="" crop="0,0,1,1" id="uded5db35" class="ne-image">

```xml
server:
  port: 9999  # 指定当前服务的端口
  servlet:
    encoding:
      enabled: true # 大模型对话中文乱码处理
      force: true
      charset: utf-8
spring:
  application:
    name: springaialibabaollama # 微服务名称
  ai:
    dashscope:
      api-key: ${qwennodel}     # 通义千问的apikey
    ollama:
      base-url: http://localhost:11434 # 调用地址，不再是远程的大模型提供的调用地址了，而是调用本地的ollama
      chat:
        model: qwen3:4b  # 调用的哪个模型

```

### <font style="color:#07787E;">编写控制层</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768295015659-8a0041b9-b120-4f84-90ac-2ca177f82952.png" width="372" title="" crop="0,0,1,1" id="u2c76ad8d" class="ne-image">

```java
package com.msb.controller;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class DemoController {
    /*
     * 对话模型，调用阿里云百炼平台
     * ChatModel 所有大模型聊天的总的父接口,支持文本聊天交互模型*/
    @Autowired
    private ChatModel chatModel;

    /**
     * 流式输出
     */
    @GetMapping(value = "/hello/streamchat")
    public Flux<String> stream(@RequestParam(name = "msg",defaultValue="你是谁") String question){
        return chatModel.stream(question);
    }

}
```

### <font style="color:#07787E;">编写主启动类</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768295122946-f60ddc4a-ac84-4275-a65b-42e522d33451.png" width="335.2" title="" crop="0,0,1,1" id="u47e58d89" class="ne-image">

```java
package com.msb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OllamaApplication {
    public static void main(String[] args)    {
        SpringApplication.run(OllamaApplication.class, args);
    }
}
```

### <font style="color:#07787E;">访问测试</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768295674455-0e0454b3-c98a-4f48-b3e1-99b0a6b98483.png" width="776" title="" crop="0,0,1,1" id="u6c8429a9" class="ne-image">



# <font style="color:#7E45E8;">ChatClient</font>
## <font style="color:#ECAA04;">ChatClient与ChatModel的对比</font>
`<font style="color:rgb(36, 41, 46);">ChatClient</font>`<font style="color:rgb(36, 41, 46);"> 和 </font>`<font style="color:rgb(36, 41, 46);">ChatModel</font>`<font style="color:rgb(36, 41, 46);"> 是 Spring AI 核心框架 定义的通用接口 / 组件，而非 Spring AI Alibaba 独有；  </font>

<font style="color:rgb(36, 41, 46);">在前面小节内容中，我们在与各个模型进行对话时使用的是对应模型的</font>`<font style="color:rgb(36, 41, 46);">ChatModel</font>`<font style="color:rgb(36, 41, 46);">的接口，具体实现的对象例如：dashscopeChatModel、ollamaChatModel，然后通过chatModel.call(...)、chatModel.stream(...)直接调用模型。 —— 适合简单大模型交互场景。</font>

<font style="color:rgb(36, 41, 46);">以上使用</font>`<font style="color:rgb(36, 41, 46);">ChatModel</font>`<font style="color:rgb(36, 41, 46);">与模型进行对话方式中，如果在项目中使用大模型涉及到记忆上下文、Prompt模版化、RAG开发、返回内容映射为实体等操作时，单纯的</font>`<font style="color:rgb(36, 41, 46);">ChatModel</font>`<font style="color:rgb(36, 41, 46);">代码量很多，维护成本高，为了简化这个流程，Spring AI 中提供了</font>`<font style="color:rgb(36, 41, 46);">ChatClient</font>`<font style="color:rgb(36, 41, 46);">对象，该对象可以看做一个更高级的“客户端 API”，建立在</font>`<font style="color:rgb(36, 41, 46);">ChatModel</font>`<font style="color:rgb(36, 41, 46);">之上，可以用链式的方式快速搭配 Prompt、系统设定、变量替换、上下文记忆等，并支持文本/JSON/实体对象等多种形式的输出。</font>

`<font style="color:rgb(36, 41, 46);">ChatClient</font>`<font style="color:rgb(36, 41, 46);">是高级封装，基于</font>`<font style="color:rgb(36, 41, 46);">ChatModel</font>`<font style="color:rgb(36, 41, 46);">构建。</font>

<font style="color:rgb(36, 41, 46);">—— 适合复杂AI服务，</font>`<font style="color:rgb(36, 41, 46);">ChatClient</font>`<font style="color:rgb(36, 41, 46);">可以将与LLM及其他组件交互的复杂性隐藏在背后。</font>

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768459470057-0615d789-3b0b-4732-a97d-fc5a6ccabba9.png" width="252" title="" crop="0,0,1,1" id="ud787cd6b" class="ne-image">

<font style="color:#7E45E8;"></font>

## <font style="color:#ECAA04;">ChatClient小试牛刀</font>
### <font style="color:#07787E;">创建微服务-创建Module</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768461366426-c7cf4dc4-2ba4-4a61-b15a-1600b2e43715.png" width="785.6" title="" crop="0,0,1,1" id="ube0f6e38" class="ne-image">

### <font style="color:#07787E;">修改SpringAiAlibabaChatClient-pom.xml</font>
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>com.msb</groupId>
        <artifactId>SpringAIAlibabaPro</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <artifactId>SpringAiAlibabaChatClient</artifactId>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!--
        引入 springai alibaba DashScope 模型适配的 Starter

        开发者开通 DashScope 灵积服务后，就能借助平台提供的接口调用阿里云生态内的各类大模型，还能享受模型微调、部署管理等配套服务，它是衔接开发者与阿里云大模型生态的桥梁。
        DashScope本质是面向 AI 开发者的模型服务接口层。
        DashScope（灵积）的核心价值就是为开发者搭建起对接阿里云大模型生态的桥梁。
        阿里云百炼，它是一个更大范围的大模型服务平台，而DashScope提供的模型服务API是其底层能力之一
        -->
        <dependency>
            <groupId>com.alibaba.cloud.ai</groupId>
            <artifactId>spring-ai-alibaba-starter-dashscope</artifactId>
        </dependency>
    </dependencies>

</project>
```

### <font style="color:#07787E;">SpringAiAlibabaChatClient- 编写配置文件</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768461482775-b3957214-799d-4a45-a139-f47ba54f3101.png" width="338.4" title="" crop="0,0,1,1" id="u9507b402" class="ne-image">

```xml
server:
  port: 8080  # 指定当前服务的端口
  servlet:
    encoding:
      enabled: true # 大模型对话中文乱码处理
      force: true
      charset: utf-8
spring:
  application:
    name: springaialibabachatclient # 微服务名称
  ai:
    dashscope:
      api-key: ${qwennodel}     # 大模型三件套指定
      base-url: https://dashscope.aliyuncs.com/compatible-mode/v1
      chat:
        options:
          model: qwen3-max
```

### <font style="color:#07787E;">编写控制层</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768461621561-cc9e2dff-fe80-417f-8c10-d2e8e2c113b3.png" width="360" title="" crop="0,0,1,1" id="u946c6599" class="ne-image">

```java
package com.msb.controller;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // ChatModel和ChatClient都是混合使用，一般两个我们都要，后面交替使用，所以一次性将两个都注入
    @Autowired
    private ChatModel chatModel;
    @Autowired
    private ChatClient chatClient;

    @GetMapping(value = "/chatmodel/dochat")
    public String doChat1(@RequestParam(name = "question",defaultValue="你是谁") String question){
        String result = chatModel.call(question);
        return result;
    }

    @GetMapping("/chatclient/dochat")
    public String doChat2(@RequestParam(name = "msg",defaultValue = "你是谁") String question)
    {
        String result = chatClient.prompt().user(question).call().content();
        System.out.println("ChatClient响应：" + result);
        return result;
    }


}
```

<font style="color:rgb(36, 41, 46);"></font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">1. </font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">chatClient.prompt()</font>`

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">作用</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：创建一个「提示词构建器（PromptBuilder）」，用于组装发给 AI 模型的完整请求。</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">2. </font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">.user(question)</font>`

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">作用</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：向提示词构建器中添加「用户消息」（也就是你要问 AI 的问题）。</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">3. </font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">.call()</font>`

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">作用</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：执行 AI 模型调用，发送组装好的请求并获取响应。</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">4. </font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">.content()</font>`

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">作用：从 AI 模型的响应结果中，提取核心的文本回复内容。</font>

### <font style="color:#07787E;">新增配置类</font>
<font style="color:rgb(36, 41, 46);">ChatClient无法自动注入，ChatModel可以自动注入。</font>

<font style="color:rgb(36, 41, 46);">在配置类中，把ChatClient对象搞定：</font>

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768462467313-11412482-e319-46bc-b335-7593c904bfb4.png" width="388" title="" crop="0,0,1,1" id="u715300d7" class="ne-image">

```java
package com.msb.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LLMConfig {
    // dashscopeChatModel 是 Spring AI Alibaba 自动向容器中注册的 ChatModel 实例。
    // 这也证明了ChatClient的构建是基于ChatModel的
    @Bean
    public ChatClient chatClient(ChatModel dashscopeChatModel){
        return ChatClient.builder(dashscopeChatModel).build();
    }
}

```

### <font style="color:#07787E;">编写主启动类</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768462235337-2eee6abe-0d7b-4219-bec2-099da40ad9f2.png" width="500.8" title="" crop="0,0,1,1" id="uf621cbed" class="ne-image">

```java
package com.msb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringAiAlibabaChatClientApplication {
    public static void main(String[] args)    {
        SpringApplication.run(SpringAiAlibabaChatClientApplication.class, args);
    }
}
```

### <font style="color:#07787E;">访问测试</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768462753193-b7481138-f82b-47b7-ac44-649a67c20650.png" width="1529.6" title="" crop="0,0,1,1" id="u9130828b" class="ne-image">

# <font style="color:#7E45E8;">提示词</font>
## <font style="color:#ECAA04;">什么是提示词</font>
通俗讲：提示词是用户提供给大型语言模型 (LLM) 的一段文本，用于引导模型生成特定的输出。简单来说，就是你给 AI 的 “指令” 或 “问题”。

通过精心构造提示，能让模型给出更准确、更符合我们期望的回答，帮助我们更好地利用人工智能来解决各种问题。

## <font style="color:#ECAA04;">提示词重要吗</font>
1、提示词直接决定我们在使用大模型时大模型的表现好还是坏

2、在实现大模型应用时，我们和大模型进行交互的主要方式就是提示词

3、提示词越好，大模型反馈内容的质量才越好，内容才更符合用户的期望



## <font style="color:#ECAA04;">提示词样例演示</font>
如果更好的利用大模型回答问题，比如DeepSeek给出了提示词样例：[https://api-docs.deepseek.com/zh-cn/prompt-library/](https://api-docs.deepseek.com/zh-cn/prompt-library/)

选择这个感受一下：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1768544520647-7723b402-ac6b-446d-97eb-9c81c3fab621.png" width="1204.8" title="" crop="0,0,1,1" id="u9e07cd31" class="ne-image">



## <font style="color:#ECAA04;">提示词角色</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770014338649-cdd51773-7106-4975-8413-ac76e8456a3f.png" width="515.2" title="" crop="0,0,1,1" id="u67c0bf4c" class="ne-image">

## <font style="color:#ECAA04;">提示词角色代码展示</font>
### <font style="color:#07787E;">创建微服务-创建Module</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770020797270-d306a3f0-a666-4f8c-b720-548e5822aadc.png" width="785.6" title="" crop="0,0,1,1" id="u66305982" class="ne-image">

### <font style="color:#07787E;">修改SpringAiAlibabaPrompt-pom.xml</font>
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>com.msb</groupId>
        <artifactId>SpringAIAlibabaPro</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <artifactId>SpringAiAlibabaPrompt</artifactId>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!--
        引入 springai alibaba DashScope 模型适配的 Starter

        开发者开通 DashScope 灵积服务后，就能借助平台提供的接口调用阿里云生态内的各类大模型，还能享受模型微调、部署管理等配套服务，它是衔接开发者与阿里云大模型生态的桥梁。
        DashScope本质是面向 AI 开发者的模型服务接口层。
        DashScope（灵积）的核心价值就是为开发者搭建起对接阿里云大模型生态的桥梁。
        阿里云百炼，它是一个更大范围的大模型服务平台，而DashScope提供的模型服务API是其底层能力之一
        -->
        <dependency>
            <groupId>com.alibaba.cloud.ai</groupId>
            <artifactId>spring-ai-alibaba-starter-dashscope</artifactId>
        </dependency>
    </dependencies>

</project>
```

### <font style="color:#07787E;">SpringAiAlibabaPrompt- 编写配置文件</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770020932917-df441482-10ed-4d16-8696-34c338d7bc93.png" width="340.8" title="" crop="0,0,1,1" id="u958624af" class="ne-image">

```xml
server:
  port: 8084  # 指定当前服务的端口
  servlet:
    encoding:
      enabled: true # 大模型对话中文乱码处理
      force: true
      charset: utf-8
spring:
  application:
    name: springaialibabaprompt # 微服务名称
  ai:
    dashscope:
      api-key: ${qwennodel}     # 大模型三件套指定
      base-url: https://dashscope.aliyuncs.com/compatible-mode/v1
      chat:
        options:
          model: qwen3-max
```



### <font style="color:#07787E;">编写控制层</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770020973963-d007f7e0-e34c-4057-a1c9-98d4913fd8ee.png" width="356.8" title="" crop="0,0,1,1" id="u3918fcdd" class="ne-image">

```java
package com.msb.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class DemoController {
    @Autowired
    private ChatClient chatClient;

    @GetMapping("/prompt/chat")
    public Flux<String> chat(String question){
        return chatClient.prompt()
                // AI 能力边界
                .system("你是一个法律助手，只回答法律问题，其它问题回复，我只能回答法律相关问题，其它无可奉告")
                .user(question)
                .stream()
                .content();
    }
}

```

1. `<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">chatClient.prompt()</font>`
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">核心作用</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：初始化一个</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">提示词构建器</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">，用于组装发给 AI 模型的完整请求。</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">通俗理解</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：相当于你打开了一个 “提示词编辑面板”，准备开始给 AI 写指令（system）、加用户问题（user）等。</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">补充</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：这是链式调用的起点，返回的是一个可继续调用 </font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">system()</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">、</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">user()</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> 等方法的提示词构建对象，而不是直接发送请求。</font>
2. `<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">.system("你是一个法律助手...无可奉告")</font>`
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">核心作用</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：设置 AI 的</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">系统指令（System Prompt）</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">，也就是给 AI 定角色、划边界。</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">对应你之前学的 “提示词四大角色”</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：这是典型的「指令者 + 描述者」角色，明确告诉 AI “你是谁、能做什么、不能做什么”。</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">通俗理解</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：相当于你提前给 AI 贴标签：“你只能当法律助手，只回答法律问题，非法律问题就按指定话术回复”。</font>
3. `<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">.user(question)</font>`
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">核心作用</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：添加</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">用户的问题 / 输入</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">（User Prompt），也就是你想让 AI 回答的具体内容。</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">参数说明</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">question</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> 是一个变量，存储了用户实际提问的内容（比如 “劳动合同到期不续签有赔偿吗？”）。</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">对应提示词角色</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：「指令者」的核心部分，传递用户的核心诉求。</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">通俗理解</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：相当于你在 “提示词编辑面板” 里，把用户真正想问的问题填进去。</font>
4. `<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">.stream()</font>`
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">核心作用</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：指定 AI 的回复方式为</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">流式输出</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">（而非一次性返回完整结果），返回的是一个流式响应对象，而非直接的文本内容。</font>
5. `<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">.content()</font>`
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">核心作用</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">：从流式响应中提取</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">纯文本内容</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">（过滤掉响应中的元数据、状态码等无关信息）。</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">通俗理解：相当于你只关心 AI 回复的 “文字内容”，不关心回复的格式、耗时、token 数等其他信息，这个方法帮你直接拿到核心文字。</font>

### <font style="color:#07787E;">新增配置类</font>
在配置类中，把ChatClient对象搞定：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770021464403-b137a3c9-42ec-408d-bc21-7421f47caa76.png" width="375.2" title="" crop="0,0,1,1" id="u63d49c58" class="ne-image">

```java
package com.msb.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LLMConfig {
    // dashscopeChatModel 是 Spring AI Alibaba 自动向容器中注册的 ChatModel 实例。
    // 这也证明了ChatClient的构建是基于ChatModel的
    @Bean
    public ChatClient chatClient(ChatModel dashscopeChatModel){
        return ChatClient.builder(dashscopeChatModel).build();
    }
}

```

### <font style="color:#07787E;">编写主启动类</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770021540776-0305bcdb-0215-44ff-b512-4b4538ff0e73.png" width="369.6" title="" crop="0,0,1,1" id="u77c2114f" class="ne-image">

```java
package com.msb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SAAPromptApplication {
    public static void main(String[] args)    {
        SpringApplication.run(SAAPromptApplication.class, args);
    }
}
```

### <font style="color:#07787E;">访问测试</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770022447339-9375470b-7c3c-477f-9d5e-253a616fc944.png" width="808" title="" crop="0,0,1,1" id="u2c5f4c57" class="ne-image">



<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770022476434-2ae0ddc1-b93a-4b48-aedf-9158f61ca02e.png" width="803.2" title="" crop="0,0,1,1" id="u135e8ef0" class="ne-image">

## <font style="color:#ECAA04;">提示词模版</font>
提示词模板是<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">为了高效、规范生成符合需求的提示词</font>，提前设计的可复用框架，核心是「**固定结构** + **可替换变量**」，能避免漏关键信息、减少重复构思，让 AI 输出更精准、贴合预期，适配 ChatGPT、文心一言、Claude、Ollama 等各类 AI 工具，覆盖问答、创作、编程、分析等所有 AI 使用场景。

### <font style="color:#07787E;">代码展示</font>
项目可以直接用上面的项目，在控制层加入方法即可。

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770096326837-d46e4107-d67e-4087-81dd-aa7640f938cf.png" width="355.2" title="" crop="0,0,1,1" id="u6ca5b115" class="ne-image">

控制单元编写：

```java
package com.msb.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.SystemMessage;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.chat.prompt.SystemPromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;

@RestController
public class DemoController {
    @Autowired
    private ChatClient chatClient;

    @GetMapping("/prompttemplate/chat")
    public Flux<String> chat2(@RequestParam("candidateName")String candidateName, @RequestParam("jobPosition")String jobPosition,
                              @RequestParam("entryDate")String entryDate, @RequestParam("salaryRange")String salaryRange, @RequestParam("welfare")String welfare,
                              // System模板的动态变量：企业名称、Offer类型
                              @RequestParam("companyName")String companyName, @RequestParam("offerType")String offerType){

        /*
         * String systemTemplateStr = """...""";
         * 是 Java 15 及以上版本 引入的「文本块（Text Blocks）」语法，
         * 核心作用是简化多行字符串的编写，解决传统字符串拼接 / 转义的痛点，
         * 让代码中的长文本、多行文本更易读、易维护。
         */
        // ========== 1. System提示词模板（包含占位符） ==========
        String systemTemplateStr = """
                你是{companyName}的资深人力资源专员，精通{offerType}入职Offer的撰写规范。
                请根据用户提供的信息，生成一份符合{companyName}企业规范的{offerType}Offer，要求如下：
                1. 语言正式且温馨，符合{companyName}的官方文书风格；
                2. 包含核心要素：入职岗位、入职日期、薪资范围（税前）、核心福利、欢迎语；
                3. 以html格式输出
                4. 结尾必须带上{companyName}的名称和人力资源部联系方式提示。
                """;

        // 2. 创建System模板对象，填充System侧的变量
        PromptTemplate systemPromptTemplate = new PromptTemplate(systemTemplateStr);
        Map<String, Object> systemVariables = Map.of(
                "companyName", companyName,  // 企业名称（动态）
                "offerType", offerType      // Offer类型（如"正式员工"/"实习生"）
        );
        // 渲染System模板，得到填充后的完整System提示词
        String systemContent = systemPromptTemplate.render(systemVariables);
        // 生成SystemMessage
        SystemMessage systemMessage = new SystemMessage(systemContent);

        // ========== 2. User提示词模板（原有逻辑不变） ==========
        String userTemplateStr = """
                请生成一份入职Offer，具体信息如下：
                1. 候选人姓名：{candidateName}
                2. 入职岗位：{jobPosition}
                3. 入职日期：{entryDate}
                4. 税前薪资范围：{salaryRange}
                5. 核心福利：{welfare}
                """;
        PromptTemplate userPromptTemplate = new PromptTemplate(userTemplateStr);
        Map<String, Object> userVariables = Map.of(
                "candidateName", candidateName,
                "jobPosition", jobPosition,
                "entryDate", entryDate,
                "salaryRange", salaryRange,
                "welfare", welfare
        );
        String userContent = userPromptTemplate.render(userVariables);
        UserMessage userMessage = new UserMessage(userContent);

        // ========== 3. 组合消息并调用大模型 ==========
        Prompt prompt = new Prompt(List.of(systemMessage, userMessage));

        // 4. 调用阿里云大模型，获取结果
        return chatClient.prompt(prompt)
                .stream()
                .content();
    }

}

```

访问地址：

http://localhost:8084<font style="color:#080808;background-color:#ffffff;">/prompttemplate/chat</font>?candidateName=张三&jobPosition=Java开发工程师&entryDate=2029年3月1日&salaryRange=18k/月&welfare=五险一金、带薪年假15天、年终奖&companyName=码士集团&offerType=正式员工

测试结果：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770098339245-ca1ef9e3-46c0-46b6-bf3d-f687a83a5f9c.png" width="1519.2" title="" crop="0,0,1,1" id="ucd93da01" class="ne-image">

### <font style="color:#07787E;">读取模版文件</font>
上面的提示词模版，直接在代码中写死了，这肯定是不友好的、扩展性差的。我们可以把模版单独提取出来，然后从程序中去读取。具体实现如下：

+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">在项目</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">resources</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">目录下创建模板文件夹（如</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">prompts</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">），存放 System 和 User 的提示词模板文件；</font>

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770099024626-df428cbc-51c6-4b55-85e0-652eb45efcb5.png" width="383.2" title="" crop="0,0,1,1" id="u8e9873d4" class="ne-image">

+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">编写模板文件（保留占位符</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">{变量名}</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">）；</font>

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770099039002-52e0a150-ce6b-4588-bcb0-c812bf7442b7.png" width="1037.6" title="" crop="0,0,1,1" id="RQNBV" class="ne-image">

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770099049462-0aab868c-e192-4df4-a8ec-7a2f012520f6.png" width="587.2" title="" crop="0,0,1,1" id="VAQG3" class="ne-image">

+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> 在代码中通过</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">ClassPathResource</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">读取模板文件内容；  </font>

```java
package com.msb.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.SystemMessage;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.chat.prompt.SystemPromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

@RestController
public class DemoController {
    @Autowired
    private ChatClient chatClient;


    @GetMapping("/prompttemplate/chattxt")
    public Flux<String> chat3(@RequestParam("candidateName")String candidateName, @RequestParam("jobPosition")String jobPosition,
                              @RequestParam("entryDate")String entryDate, @RequestParam("salaryRange")String salaryRange, @RequestParam("welfare")String welfare,
                              // System模板的动态变量：企业名称、Offer类型
                              @RequestParam("companyName")String companyName, @RequestParam("offerType")String offerType) throws IOException {

        // ========== 1. System提示词模板（包含占位符） ==========
        // 加载resources/prompts/下的模板文件
        ClassPathResource systemTemplateFile = new ClassPathResource("prompts/system.txt");
        // 读取文件内容（指定UTF-8编码，避免中文乱码）
        String systemTemplateStr = new String(
                systemTemplateFile.getInputStream().readAllBytes(),
                StandardCharsets.UTF_8
        );

        // 2. 创建System模板对象，填充System侧的变量
        PromptTemplate systemPromptTemplate = new PromptTemplate(systemTemplateStr);
        Map<String, Object> systemVariables = Map.of(
                "companyName", companyName,  // 企业名称（动态）
                "offerType", offerType      // Offer类型（如"正式员工"/"实习生"）
        );
        // 渲染System模板，得到填充后的完整System提示词
        String systemContent = systemPromptTemplate.render(systemVariables);
        // 生成SystemMessage
        SystemMessage systemMessage = new SystemMessage(systemContent);

        // ========== 2. User提示词模板（原有逻辑不变） ==========
        ClassPathResource userTemplateFile = new ClassPathResource("prompts/user.txt");
        String userTemplateStr = new String(
                userTemplateFile.getInputStream().readAllBytes(),
                StandardCharsets.UTF_8
        );
        PromptTemplate userPromptTemplate = new PromptTemplate(userTemplateStr);
        Map<String, Object> userVariables = Map.of(
                "candidateName", candidateName,
                "jobPosition", jobPosition,
                "entryDate", entryDate,
                "salaryRange", salaryRange,
                "welfare", welfare
        );
        String userContent = userPromptTemplate.render(userVariables);
        UserMessage userMessage = new UserMessage(userContent);

        // ========== 3. 组合消息并调用大模型 ==========
        Prompt prompt = new Prompt(List.of(systemMessage, userMessage));

        // 4. 调用阿里云大模型，获取结果
        return chatClient.prompt(prompt)
                .stream()
                .content();
    }

}

```

+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">访问：</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">http://localhost:8084</font><font style="color:#080808;background-color:#ffffff;">/prompttemplate/chattxt</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">?candidateName=张三&jobPosition=Java开发工程师&entryDate=2029年3月1日&salaryRange=18k/月&welfare=五险一金、带薪年假15天、年终奖&companyName=码士集团&offerType=正式员工</font>

+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">测试结果：</font>

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770099738366-20e6bfba-0c5c-49f6-b58f-bcd8a56bffc8.png" width="1236.8" title="" crop="0,0,1,1" id="u7a329de2" class="ne-image">



# <font style="color:#7E45E8;">对话记忆</font>
## <font style="color:#ECAA04;">对话记忆的概念介绍</font>
<font style="color:rgb(53, 56, 65);">大模型的对话记忆，它指的是</font><u><font style="color:rgb(53, 56, 65);">模型在与用户进行交互式对话过程中，能够追踪、理解并利用先前对话上下文的能力。</font></u><font style="color:rgb(53, 56, 65);"> 此机制使得大模型不仅能够响应即时的输入请求，还能基于之前的交流内容能够在对话中记住先前的对话内容，并根据这些信息进行后续的响应。这种记忆机制使得模型能够在对话中持续跟踪和理解用户的意图和上下文，从而实现更自然和连贯的对话。</font>

<font style="color:rgb(53, 56, 65);">使用qwen进行测试：</font>

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770102084457-531f0c21-0c57-48e6-a244-5d5eeb0d10fa.png" width="1123.2" title="" crop="0,0,1,1" id="uc8104def" class="ne-image">

测试现有代码，测试发现：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1772771132075-6a385941-86b9-4857-8122-de929811c076.png" width="1013.6" title="" crop="0,0,1,1" id="u1babb968" class="ne-image">

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">默认的 </font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">ChatClient</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> 是无状态的，每一次调用 </font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">call()</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> 或 </font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">stream()</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> 方法时，如果你没有显式地传递之前的对话历史，它就会把这次请求当作全新的一轮对话，不会记住之前的信息。</font>

## <font style="color:#ECAA04;">解决方案：维护对话上下文</font>
<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">我们需要把历史对话持久化到 MySQL，要让 AI 记住之前的对话，你需要在每次请求时，都把之前的对话历史一起发送给大模型。</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">Spring AI 提供了 </font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">ChatMemory</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> 接口来专门管理对话记忆。  </font>

<font style="color:rgb(6, 10, 38);">要：实现基于 MySQL 的上下文持久化，让大模型能记住历史对话</font>

## <font style="color:#ECAA04;">代码实现【手动管理】</font>
### <font style="color:#07787E;">创建微服务-创建Module</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1772773018089-cf4f1143-958c-4637-b8dc-be6ccff8aa03.png" width="785.6" title="" crop="0,0,1,1" id="zEWaa" class="ne-image">

### <font style="color:#07787E;">修改pom.xml</font>
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>com.msb</groupId>
        <artifactId>SpringAIAlibabaPro</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <artifactId>SpringAiAlibabaChatMemory</artifactId>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <!-- 强制指定 Spring Framework 版本与 Spring Boot 3.4.5 匹配的 6.2.6 -->
        <spring-framework.version>6.2.6</spring-framework.version>
    </properties>

    <dependencies>
        <!--web启动器-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!--springai alibaba DashScope 模型适配的 Starter-->
        <dependency>
            <groupId>com.alibaba.cloud.ai</groupId>
            <artifactId>spring-ai-alibaba-starter-dashscope</artifactId>
        </dependency>
        <!-- mybatis的依赖 -->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.9</version>
        </dependency>
        <!-- 连接mysql的依赖 -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.28</version>
        </dependency>
        <!-- spring的依赖  -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
        </dependency>
        <!-- mybatis-spring-boot-starter 是 MyBatis 官方为 Spring Boot 框架提供的快速集成启动器，核心目的是简化 MyBatis 与 Spring Boot 的整合过程 -->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>3.0.3</version>
        </dependency>
    </dependencies>

</project>
```

### <font style="color:#07787E;">编写配置文件</font>
```xml
server:
  port: 8005  # 指定当前服务的端口
  servlet:
    encoding:
      enabled: true # 大模型对话中文乱码处理
      force: true
      charset: utf-8
spring:
  application:
    name: springaialibabachatmemory # 微服务名称
  ai:
    dashscope:
      api-key: ${qwennodel}     # 大模型三件套指定
      base-url: https://dashscope.aliyuncs.com/compatible-mode/v1
      chat:
        options:
          model: qwen3-max
  datasource:
    url: jdbc:mysql://localhost:3306/msbsys?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Shanghai
    username: root
    password: root
    driver-class-name: com.mysql.cj.jdbc.Driver
```

### <font style="color:#07787E;"> MySQL 中建表  </font>
```sql
CREATE TABLE ai_chat_memory (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  user_id VARCHAR(64) NOT NULL COMMENT '用户ID',
  conversation_id VARCHAR(64) NOT NULL COMMENT '会话ID',
  message_type VARCHAR(32) NOT NULL COMMENT 'USER/ASSISTANT/SYSTEM',
  content TEXT NOT NULL,
  create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
  INDEX idx_user_conversation (user_id, conversation_id)
);
```

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1772774231826-c17ff50a-113e-41af-8c18-da0e5ce041de.png" width="1189.6" title="" crop="0,0,1,1" id="FFwVY" class="ne-image">

### <font style="color:#07787E;">编写实体类</font>
```java
package com.msb.vo;


import java.time.LocalDateTime;


public class AIChatMemory {

    private Long id;
    private String userId;
    private String conversationId;
    private String messageType;
    private String content;
    private LocalDateTime createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public AIChatMemory() {
    }
}

```

### <font style="color:#07787E;">创建Mapper层</font>
<font style="color:rgb(52, 73, 94);">com.msb.mapper下创建ChatMemoryMapper接口：</font>



```java
package com.msb.mapper;

import com.msb.sqlprovider.ChatMemorySqlProvider;
import com.msb.vo.AIChatMemory;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ChatMemoryMapper {
    /**
     * 批量插入会话消息。
     */
    @InsertProvider(type = ChatMemorySqlProvider.class, method = "batchInsert")
    void batchInsert(@Param("list") List<AIChatMemory> list);

    /**
     * 根据会话ID查询消息列表（按创建时间升序）
     */
    @Select("SELECT id, conversation_id, content, message_type AS messageType, create_time, user_id " +
            "FROM ai_chat_memory WHERE conversation_id = #{conversationId} ORDER BY create_time ASC")
    List<AIChatMemory> selectByConversationId(@Param("conversationId") String conversationId);

    /**
     * 根据会话ID删除所有消息
     */
    @Delete("DELETE FROM ai_chat_memory WHERE conversation_id = #{conversationId}")
    void deleteByConversationId(@Param("conversationId") String conversationId);
}

```



### <font style="color:#07787E;">创建sql提供层</font>


```java
package com.msb.sqlprovider;

import com.msb.vo.AIChatMemory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

public class ChatMemorySqlProvider {
    /**
     * 构建批量插入 SQL
     * 正确逻辑：字段列表只写一次，VALUES 后面循环拼接多组数据
     */
    public String batchInsert(@Param("list") List<AIChatMemory> list) {
        if (list == null || list.isEmpty()) {
            return ""; // 或者抛异常
        }

        StringBuilder sql = new StringBuilder();
        // 1. 固定部分：INSERT INTO 表名 (字段列表)
        // 注意：字段列表只写一次！
        sql.append("INSERT INTO ai_chat_memory (conversation_id, user_id, message_type, content, create_time) VALUES ");

        // 2. 循环部分：只拼接 values 的具体值
        for (int i = 0; i < list.size(); i++) {
            sql.append("(#{list[").append(i).append("].conversationId},");
            sql.append("#{list[").append(i).append("].userId},");
            sql.append("#{list[").append(i).append("].messageType},");
            sql.append("#{list[").append(i).append("].content},");
            sql.append("#{list[").append(i).append("].createTime})");

            // 如果不是最后一个，加逗号
            if (i < list.size() - 1) {
                sql.append(",");
            }
        }

        return sql.toString();
    }
}

```



### <font style="color:#07787E;">编写配置类</font>


```java
package com.msb.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LLMConfig {
    @Bean
    public ChatClient chatClient(ChatModel dashscopeChatModel){
        return ChatClient.builder(dashscopeChatModel).build();
    }
}

```

### <font style="color:#07787E;">编写会话记忆管理器</font>


```java
package com.msb.memory;

import com.msb.mapper.ChatMemoryMapper;
import com.msb.vo.AIChatMemory;
import jakarta.annotation.Resource;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.messages.SystemMessage;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 基于MySQL+原生MyBatis实现的聊天记忆存储
 * 实现Spring AI的ChatMemory接口
 */
@Component
public class MysqlChatMemory implements ChatMemory {

    @Resource
    private ChatMemoryMapper chatMemoryMapper;

    /**
     * 批量添加消息到会话记忆
     * @param conversationId 会话ID
     * @param messages 消息列表
     */
    @Override
    public void add(String conversationId, List<Message> messages) {
        // 参数校验
        if (conversationId == null || conversationId.isBlank()) {
            throw new IllegalArgumentException("会话ID不能为空");
        }
        if (messages == null || messages.isEmpty()) {
            return;
        }

        /*
         批量转换Message到PO对象
         */
        List<AIChatMemory> poList = messages.stream()
                .filter(Objects::nonNull)
                .map(message -> {
                    AIChatMemory memoryPO = new AIChatMemory();
                    memoryPO.setConversationId(conversationId);
                    memoryPO.setContent(message.getText());
                    memoryPO.setMessageType(message.getMessageType().name());
                    memoryPO.setCreateTime(LocalDateTime.now());
                    memoryPO.setUserId(conversationId);
                    return memoryPO;
                })
                .collect(Collectors.toList());

        // 批量插入
        if (!poList.isEmpty()) {
            chatMemoryMapper.batchInsert(poList);
        }
    }

    /**
     * 获取指定会话的历史消息
     * @param conversationId 会话ID
     * @return 按时间排序的消息列表
     */
    @Override
    public List<Message> get(String conversationId) {
        System.out.println(">>> [Step 1] 准备查询 conversationId: [" + conversationId + "]");

        if (conversationId == null || conversationId.isBlank()) {
            throw new IllegalArgumentException("会话ID不能为空");
        }

        // 执行查询
        List<AIChatMemory> memoryPOList = chatMemoryMapper.selectByConversationId(conversationId);

        // 打印数据库到底返回了几条
        System.out.println(">>> [Step 2] 数据库查询返回记录数: " + memoryPOList.size());

        if (memoryPOList.isEmpty()) {
            System.out.println(">>> [警告] 数据库里没找到数据！请检查 userId 是否完全一致（有无空格）。");
            return List.of();
        }

        // 打印第一条数据的详情，确认字段值
        AIChatMemory first = memoryPOList.get(0);
        System.out.println(">>> [调试] 第一条数据详情 -> ID:" + first.getId()
                + ", Type:[" + first.getMessageType() + "]"
                + ", Content:[" + first.getContent() + "]");

        // 继续转换...
        List<Message> result = memoryPOList.stream()
                .map(this::convertPOToMessage)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println(">>> [Step 3] 转换后的 Message 数量: " + result.size());

        return result;
    }

    /**
     * 清空指定会话的所有历史消息
     * @param conversationId 会话ID
     */
    @Override
    public void clear(String conversationId) {
        // 参数校验
        if (conversationId == null || conversationId.isBlank()) {
            throw new IllegalArgumentException("会话ID不能为空");
        }

        chatMemoryMapper.deleteByConversationId(conversationId);
    }

    /**
     * 将数据库PO对象转换为Spring AI的Message对象
     * @param po 数据库实体对象
     * @return Message对象
     */
    private Message convertPOToMessage(AIChatMemory po) {
        if (po == null || po.getMessageType() == null) {
            return null;
        }

        return switch (po.getMessageType()) {
            case "USER" -> new UserMessage(po.getContent());
            case "ASSISTANT" -> new AssistantMessage(po.getContent());
            case "SYSTEM" -> new SystemMessage(po.getContent());
            default -> null;
        };
    }

    // 兼容单个消息添加的重载方法（可选）
    public void add(String conversationId, Message message) {
        this.add(conversationId, List.of(message));
    }
}
```

### <font style="color:#07787E;">编写控制层</font>
```java
package com.msb.controller;


import com.msb.memory.MysqlChatMemory;
import jakarta.annotation.Resource;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class ChatMemoryController {

    // 注入ChatClient
    @Resource
    private ChatClient chatClient;

    // 注入并持有一个自定义的会话记忆管理器实例，用于实现大模型对话的上下文持久化存储。
    @Resource
    private MysqlChatMemory mysqlChatMemory;

    /**
     * 简化版问答接口：参数为用户ID + 用户问题
     * @param userId 用户ID（必传）
     * @param question 用户问题（必传）
     * @return 包含会话ID和大模型回答的结果
     */
    @GetMapping("/ask")
    public String chat(
            @RequestParam("userId") String userId,  // 第一个参数：用户ID
            @RequestParam("question") String question  // 第二个参数：用户问题
    ) {

        // 读取该会话的历史上下文（首次调用为空）
        List<Message> historyMessages = mysqlChatMemory.get(userId);
        System.out.println(">>> 读取到的历史消息数量: " + historyMessages.size());
        // 构造本次用户提问消息
        UserMessage currentUserMessage = new UserMessage(question);

        // 调用大模型（结合历史上下文）
        ChatResponse response = chatClient.prompt()
                .messages(historyMessages) 
                .user(question)        
                .call()                   
                .chatResponse();          

        // 解析结果
        String assistantAnswer = response.getResult().getOutput().getText();
        // 直接通过构造函数创建 AssistantMessage
        AssistantMessage assistantMessage = new AssistantMessage(assistantAnswer);


        // 保存本次问答记录到MySQL（用户提问+AI回答）
        mysqlChatMemory.add(userId, List.of(currentUserMessage, assistantMessage));


        // 返回结果（包含会话ID、用户ID、回答）
        return String.format("用户ID：%s\n会话ID：%s\n回答：%s", userId, userId, assistantAnswer);
    }
}
```



注意：我们的代码中将用户id和会话id设置为一个了，同一个值了，可以自行处理会话id，方式：

【1】参数传递：

```java
@GetMapping("/ask")
    public String chat(
            @RequestParam("userId") String userId,  // 用户ID（标识用户）
            @RequestParam("question") String question,  // 用户问题
            @RequestParam(value = "conversationId", required = false) String conversationId  // 会话ID（可选）
    ) 
```

【2】 UUID（通用唯一识别码）是最常用的会话 ID 生成方式，优点是全局唯一、无需依赖外部组件、实现简单，适合绝大多数场景。

### <font style="color:#07787E;">编写主启动类</font>
```java
package com.msb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("com.msb.mapper")  // 在启动类上添加注解，表示mapper接口所在位置
public class App {
    public static void main(String[] args)    {
        SpringApplication.run(App.class, args);
    }
}


```

### <font style="color:#07787E;">访问测试</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773839282148-de89a38b-50b1-4d58-b58c-2d366cbfddcc.png" width="1528.8" title="" crop="0,0,1,1" id="u63a43931" class="ne-image">



<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773839292624-15b780a1-3424-4d5f-8ec6-3e92aa20aebe.png" width="1087.2" title="" crop="0,0,1,1" id="u6e5b747e" class="ne-image">

### <font style="color:#07787E;">以上实现方式的特点</font>
| 特性 | 你的实现方式 (手动管理) |
| --- | --- |
| 核心模式 | 手动编排 (Manual Orchestration) |
| 代码位置 | 在 Controller 业务逻辑中显式调用 `get()`<br/> 和 `add()` |
| 灵活性 | ⭐⭐⭐⭐⭐    你可以随意决定何时存、存什么、怎么改数据 |
| 耦合度 | 高    Controller 强依赖 `MysqlChatMemory`<br/> 的具体实现 |
| 适用场景 | 需要复杂逻辑（如：敏感词过滤后不存、只存特定类型的对话、手动清理） |
| 代码侵入性 | 高    每个接口都要写 `get` -> `call` -> `add` |




## <font style="color:#ECAA04;">代码实现【Advisor 自动管理 - 官方推荐】</font>
Spring AI Alibaba 为你封装了上面方式 1 这类 “手动实现会话记忆” 的核心逻辑，方式 2 是框架提供的标准化、开箱即用的方案，而方式 1 是你自己从零实现的等价逻辑。



代码实现：

### <font style="color:#07787E;">创建微服务</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773842433512-fbf62d37-cd56-4eae-8d96-472bd9a7e151.png" width="785.6" title="" crop="0,0,1,1" id="YlcHE" class="ne-image">

### <font style="color:#07787E;">修改pom.xml</font>
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>com.msb</groupId>
    <artifactId>SpringAIAlibabaPro</artifactId>
    <version>1.0-SNAPSHOT</version>
  </parent>

  <artifactId>SpringAliAlibabaChatMemory2</artifactId>

  <properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <!-- 【关键】强制指定 Spring Framework 版本与 Spring Boot 3.4.5 匹配的 6.2.6 -->
    <spring-framework.version>6.2.6</spring-framework.version>
  </properties>

  <dependencies>
    <!--web启动器-->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!--springai alibaba DashScope 模型适配的 Starter-->
    <dependency>
      <groupId>com.alibaba.cloud.ai</groupId>
      <artifactId>spring-ai-alibaba-starter-dashscope</artifactId>
    </dependency>
    <!--将 ChatMemory 存储到关系数据库 依赖包
    Spring AI 框架中用于实现对话记忆（Chat Memory）持久化的核心依赖，
    专门解决大模型对话场景中「上下文记忆」的存储问题-->
    <dependency>
      <groupId>org.springframework.ai</groupId>
      <artifactId>spring-ai-starter-model-chat-memory-repository-jdbc</artifactId>
    </dependency>
    <!-- 引入 MySQL 驱动包-->
    <dependency>
      <groupId>com.mysql</groupId>
      <artifactId>mysql-connector-j</artifactId>
      <version>8.0.33</version>
    </dependency>
  </dependencies>

</project>
```

### <font style="color:#07787E;">编写配置文件</font>
```yaml
server:
  port: 8006  # 指定当前服务的端口
  servlet:
    encoding:
      enabled: true # 大模型对话中文乱码处理
      force: true
      charset: utf-8
spring:
  application:
    name: springaialibabachatmemory2 # 微服务名称
  ai:
    dashscope:
      api-key: ${qwennodel}     # 大模型三件套指定
      base-url: https://dashscope.aliyuncs.com/compatible-mode/v1
      chat:
        options:
          model: qwen3-max
    chat:
      memory:
        repository:
          jdbc:
            initialize-schema: always #自动创建ChatMemory存储的表结构 - 持久化对应的数据库表
            platform: mariadb #告诉框架当前数据库是 MariaDB/MySQL，

  datasource:
    url: jdbc:mysql://localhost:3306/msbsys?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Shanghai
    username: root
    password: root
    driver-class-name: com.mysql.cj.jdbc.Driver
    hikari: #确保每条 JDBC 连接都使用 utf8mb4 字符集并指定 utf8mb4_unicode_ci 排序
      connection-init-sql: SET NAMES utf8mb4 COLLATE utf8mb4_unicode_ci


```



### <font style="color:#07787E;">编写配置类</font>




```java
package com.msb.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.MessageWindowChatMemory;
import org.springframework.ai.chat.memory.repository.jdbc.JdbcChatMemoryRepository;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LLMConfig {

    @Bean
    public ChatMemory chatMemory(JdbcChatMemoryRepository repo){
        return MessageWindowChatMemory.builder() 
        .chatMemoryRepository(repo)
        .maxMessages(20)
        .build();
    }

    @Bean
    public ChatClient chatClient(ChatModel chatModel,ChatMemory memory){
        ChatClient client = ChatClient.builder(chatModel)
        .defaultAdvisors(MessageChatMemoryAdvisor.builder(memory).build())
        .build();

        return client;

    }
}
```



### <font style="color:#07787E;">编写控制单元</font>
```java
package com.msb.controller;



import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatMemoryController {

    @Autowired
    private ChatClient chatClient;

    @GetMapping("/chatMemory")
    public String chatMemory(
            @RequestParam(value = "uid") String userId, // 用户ID
            @RequestParam(value = "cid") String conversationID,// 会话ID
            @RequestParam(value="message",defaultValue = "你是谁？") String message
    ){

        // 核心：拼接用户ID和会话ID，生成全局唯一的会话标识
        // 格式：用户ID + 分隔符 + 会话ID（分隔符用下划线/竖线，避免和ID本身冲突）
        String uniqueConversationId = userId + "_" + conversationID;

        String result = chatClient.prompt()
                .user(message)
                .advisors(advisorSpec -> advisorSpec.param(ChatMemory.CONVERSATION_ID, uniqueConversationId))
                .call()
                .content();
        return result;
    }
}
```

### <font style="color:#07787E;">主启动类</font>
```java
package com.msb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

public class App {
    public static void main(String[] args)    {
        SpringApplication.run(App.class, args);
    }
}


```

### <font style="color:#07787E;">测试</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773843864909-3ffae776-39fd-4f66-9dd0-fccd1a5df7c9.png" width="1228" title="" crop="0,0,1,1" id="mDqYq" class="ne-image">

### <font style="color:#07787E;">介绍</font>
官网示例使用的是 Spring AI 的 Advisor (顾问/拦截器) 机制。

+ 原理：`<font style="color:rgb(6, 10, 38);">MessageChatMemoryAdvisor</font>` 是一个拦截器。当你调用 `<font style="color:rgb(6, 10, 38);">chatClient.prompt()...call()</font>` 时：
    1. Before: Advisor 拦截请求，根据 `<font style="color:rgb(6, 10, 38);">conversantId</font>` 自动调用 `<font style="color:rgb(6, 10, 38);">ChatMemory.get()</font>` 获取历史消息，并拼接到 Prompt 中。
    2. Call: 发送增强后的 Prompt 给大模型。
    3. After: 拿到响应后，Advisor 自动调用 `<font style="color:rgb(6, 10, 38);">ChatMemory.add()</font>` 把新的一轮对话存进去。
+ 优点：
    - 业务代码极其干净：Controller 里只需要关心“问什么”，不需要关心“记忆怎么存”。
    - 统一治理：所有通过该 `<font style="color:rgb(6, 10, 38);">ChatClient</font>` 发出的请求都会自动拥有记忆功能，不会漏掉。
    - 符合 Spring 哲学：利用 AOP 思想解耦横切关注点（记忆）和核心业务（聊天）。



| 特性 | 你的实现方式 (手动管理) | 官网示例方式 (Advisor 自动管理) |
| --- | --- | --- |
| 核心模式 | 手动编排 (Manual Orchestration) | AOP/拦截器模式 (Interceptor/Advisor) |
| 代码位置 | 在 Controller 业务逻辑中显式调用 `get()`<br/> 和 `add()` | 在 `ChatClient`<br/> 构建时配置 |
| 灵活性 | ⭐⭐⭐⭐⭐    你可以随意决定何时存、存什么、怎么改数据 | ⭐⭐⭐    流程固定：请求前自动查，响应后自动存 |
| 耦合度 | 高    Controller 强依赖 `MysqlChatMemory`<br/> 的具体实现 | 低    Controller 只依赖 `ChatClient`<br/>，不感知记忆存在 |
| 适用场景 | 需要复杂逻辑（如：敏感词过滤后不存、只存特定类型的对话、手动清理） | 标准的“一问一答”全量记录场景 |
| 代码侵入性 | 高    每个接口都要写 `get`<br/> -> `call`<br/> -> `add` | 无    业务代码里完全看不到记忆相关的代码 |






# <font style="color:#7E45E8;">多模态模型</font>
## <font style="color:#ECAA04;">概念解析</font>
+ 模态：指信息的不同表现形式，比如文本是文字模态，图片是视觉模态，语音是听觉模态。
+ 多模态：意味着模型不局限于处理单一模态，而是可以同时理解和生成多种模态的内容，实现跨模态的转换和融合。

常见能力举例：

1. 图文理解
    - 给模型一张照片，它能生成一段描述照片内容的文字（图文转文字）。
    - 输入一段文字描述，它能生成对应的图片或插画（文字转图文）。
2. 语音与文本转换
    - 能将一段语音实时转写成准确的文字（语音转文本）。
    - 也能将任意文字转换为自然流畅、带有情感的语音（文本转语音）。
3. 视觉与语言交互
    - 针对视频内容进行问答，比如询问视频中某个场景的细节。
    - 根据文字指令对图片进行编辑，比如修改图片背景、替换物体。

传统的 AI 模型通常只擅长单一任务，比如只识别图片、只处理文本。而多模态模型就像一个拥有综合感官的智能体，它可以把看到的、听到的、读到的信息整合起来，进行更深度的认知和创造，这也是它目前非常热门的原因。

打破了单一文本的界限，具备“多模态”能力  ， 而不是只能懂文字的 “纯文本模型”。

## <font style="color:#ECAA04;">通义万相模型</font>
案例：文生图，感受多模态模型。

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773392702073-29940590-8736-4127-9638-a8d78d90d428.png" width="1250.4" title="" crop="0,0,1,1" id="u2b7963e7" class="ne-image">



代码实现：

### <font style="color:#07787E;">创建微服务</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773387830440-0b4d8249-524d-4757-a954-ffc6dcd552c5.png" width="785.6" title="" crop="0,0,1,1" id="u3038d22e" class="ne-image">

### <font style="color:#07787E;">修改pom.xml</font>
```javascript
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>com.msb</groupId>
        <artifactId>SpringAIAlibabaPro</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <artifactId>SpringAIAlibabaTextToImage</artifactId>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!--
        引入 springai alibaba DashScope 模型适配的 Starter

        开发者开通 DashScope 灵积服务后，就能借助平台提供的接口调用阿里云生态内的各类大模型，还能享受模型微调、部署管理等配套服务，它是衔接开发者与阿里云大模型生态的桥梁。
        DashScope本质是面向 AI 开发者的模型服务接口层。
        DashScope（灵积）的核心价值就是为开发者搭建起对接阿里云大模型生态的桥梁。
        阿里云百炼，它是一个更大范围的大模型服务平台，而DashScope提供的模型服务API是其底层能力之一
        -->
        <dependency>
            <groupId>com.alibaba.cloud.ai</groupId>
            <artifactId>spring-ai-alibaba-starter-dashscope</artifactId>
        </dependency>
    </dependencies>

</project>
```

### <font style="color:#07787E;">编写配置文件</font>


```javascript
server:
  port: 8006  # 指定当前服务的端口
  servlet:
    encoding:
      enabled: true # 大模型对话中文乱码处理
      force: true
      charset: utf-8
spring:
  application:
    name: springaialibabatexttoimage # 微服务名称
  ai:
    dashscope:
      api-key: ${qwennodel}    # 大模型三件套指定
      image:
        options:
          model: wanx-v1

```

### <font style="color:#07787E;">编写控制层</font>


```javascript
package com.msb.controller;

import com.alibaba.cloud.ai.dashscope.image.DashScopeImageOptions;
import jakarta.annotation.Resource;
import org.springframework.ai.image.ImageGeneration;
import org.springframework.ai.image.ImageModel;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // 从配置文件读取模型名（自动绑定yml中的配置）
    @Value("${spring.ai.dashscope.image.options.model}")
    private String imageModelName;

    @Resource
    private ImageModel imageModel; // ImageModel 是 Spring AI 框架 中定义的文生图模型核心接口,不用以前的ChatModel了

    @GetMapping(value = "/toimage")
    public String image(@RequestParam(name = "prompt") String prompt)
    {
        DashScopeImageOptions build = DashScopeImageOptions.builder()
                .withModel(imageModelName)
                .build();

        ImageResponse response = imageModel.call(new ImagePrompt(prompt, build));

        return response.getResult().getOutput().getUrl();
    }
}

```

### <font style="color:#07787E;">编写配置类</font>


```javascript
package com.msb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.backoff.FixedBackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;


@Configuration
public class AiConfig {

    /**
     * 覆盖默认的 RetryTemplate 配置
     * 针对通义万相生成图片较慢的情况，增加重试次数和间隔
     */
    @Bean
    public RetryTemplate imageRetryTemplate() {
        RetryTemplate retryTemplate = new RetryTemplate();

        // 1. 设置重试策略：最多重试 30 次（可根据需求调整）
        // 总等待时间 = 重试次数 * 每次间隔时间
        SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy();
        retryPolicy.setMaxAttempts(30); // 最大重试次数
        retryTemplate.setRetryPolicy(retryPolicy);

        // 2. 设置退避策略：每次重试间隔 2 秒（2000 毫秒）
        // 使用 Spring Retry 正确的 FixedBackOffPolicy 类
        FixedBackOffPolicy backOffPolicy = new FixedBackOffPolicy();
        backOffPolicy.setBackOffPeriod(2000L); // 每次重试间隔2秒
        retryTemplate.setBackOffPolicy(backOffPolicy);

        return retryTemplate;
    }
}
```

### <font style="color:#07787E;">编写主启动类</font>


```javascript
package com.msb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}

```

### <font style="color:#07787E;">访问测试</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773398142314-afcc4f22-7291-4476-8339-159753b20ff0.png" width="1472" title="" crop="0,0,1,1" id="ue45717f7" class="ne-image">

生成URL路径，可通过URL查看图片：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773398195532-a1ba5062-2b59-4be1-8405-edb6b16ce487.png" width="722.4" title="" crop="0,0,1,1" id="uc45ce166" class="ne-image">

# <font style="color:#7E45E8;">向量化</font>
## <font style="color:#C99103;">什么是向量</font>
向量，就是一串有序的数字。比如：`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">[1, 2, 3]</font>``<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">[0.1, 0.5, -0.2]</font>`

只要是一排数字，就叫向量。

你可以把它看成：

+ 一个点的坐标
+ 或者一个箭头

比如平面上：

+ 向量 `<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">(3, 4)</font>`：就是从原点出发，向右 3，向上 4。

在大模型里，向量不是人编的，是模型算出来的。

比如：“猫” 这个词，模型会算出一串数字：`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">[0.23, -0.56, 0.81, ...]</font>`（可能有 768 个、1024 个）

每一个数字，都代表一个 “隐藏特征”：

+ 是不是动物
+ 有没有毛
+ 会不会叫
+ 大还是小
+ 可爱程度
+ 能不能家养……

这些特征人不用定义，是模型自己学出来的。

## <font style="color:#C99103;">什么是向量化</font>
向量化需要 embedding模型。

就是把原始数据（文字、图片，音频等），通过embedding大模型 | embedding的算法，变成向量，每个数据对应一个向量，这么多向量会组成一个庞大的向量空间。每个向量就是向量空间中的一个点。---》这个过程叫embedding化 | 向量化

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770712133656-2a17e162-e47e-47e6-9883-36d4fb8b55aa.png" width="1208" title="" crop="0,0,1,1" id="ufc0e4d9d" class="ne-image">

## <font style="color:#C99103;">为什么要向量化</font>
详细理解向量化的含义，理解为什么要这样做？为啥要把数据转为向量呢？

先说计算机：

+ 计算机能存文字、图片、声音
+ 计算机能显示它们
+ 但计算机不懂含义



比如文字：`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">"苹果"</font>`，计算机看到的是：`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">UTF-8 编码：E8 8B B9 E6 9E 9C</font>`

它知道这是两个字，也可以帮你显示这两个字，但不知道这是水果，也不知道它和 `<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">"香蕉"</font>` 是一类，和 `<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">"汽车"</font>` 不是一类。

embedding 做的不是 “识别”，是 “语义编码”。

+ 文字 → 编码（只是存字形）
+ 文字 → embedding（才存意思）

进一步理解：举例：

**<font style="color:rgb(0, 0, 0);background-color:#FBF5CB;">例子 1：先从生活类比（最容易懂）</font>**

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">假设你是一个 “只能看懂数字” 的机器人，我要让你区分：</font>

+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">苹果、香蕉、汽车</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">第一步：原始信息（你 “看得见但看不懂”）</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">你能看到这三个词的字形，但不知道：</font>

+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">苹果 ≈ 香蕉（都是水果）</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">苹果 ≠ 汽车（一个吃的，一个交通工具）</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">第二步：用 embedding 给 “含义” 编数字</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">我给你一套 “语义数字规则”（这就是 embedding 模型干的事）：</font>

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770718198964-ea1a7659-4eb6-4ee4-b97d-8b7e2a2adf58.png" width="566.4" title="" crop="0,0,1,1" id="u74149b89" class="ne-image">

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">第三步：你（模型）终于能 “理解” 了</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">你虽然还是只懂数字，但能算：</font>

+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">苹果和香蕉的数字差距：(99-98)+(1-2)=0 → 几乎一样（都是水果）</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">苹果和汽车的数字差距：(99-3)+(1-97)=100 → 完全不同</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">👉</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> 结论：embedding 不是让你 “认出”“苹果” 这两个字，而是让你通过数字，</font>**<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">理解 “苹果” 代表的含义类别</font>**<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">。</font>



**<font style="color:rgb(0, 0, 0);background-color:#FBF5CB;">例子 2：文字 embedding（实战中最常用）</font>**

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">用真实场景：判断两句话是不是一个意思（大模型核心需求）</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">原始文本（模型看得见但看不懂）</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">句子 1：“我想吃甜甜的水果”</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">句子 2：“我想品尝甜的苹果”</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">句子 3：“我想买辆黑色的汽车”</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">模型能看到每个字的编码（比如 “我”=251，“想”=368），但光看这些零散数字，它不知道：</font>

+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">句子 1 和句子 2 是 “想吃甜水果” 的核心语义</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">句子 3 和前两句完全不相关</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">embedding 处理后（变成语义向量）</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">我用真实的 embedding 模型（比如 OpenAI 的 text-embedding-3-small）处理后，会得到一串长数字（简化成 5 维举例）：</font>

+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">句子 1 向量：[0.89, 0.76, 0.12, 0.05, 0.01]</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">句子 2 向量：[0.87, 0.78, 0.11, 0.04, 0.02]</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">句子 3 向量：[0.03, 0.01, 0.92, 0.88, 0.79]</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">模型计算相似度（懂了语义）</font>

+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">句子 1 </font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">↔</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> 句子 2：相似度 0.98（几乎一样）</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">句子 1 </font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">↔</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> 句子 3：相似度 0.05（完全不同）</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">👉</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> 关键：模型不是靠 “字面上有没有水果 / 汽车” 判断，而是靠 embedding 向量的</font>**<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">数字相似度</font>**<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">，理解了句子的</font>**<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">核心语义</font>**<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">—— 哪怕句子 2 没提 “水果” 只提 “苹果”，模型也知道是一个意思。</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"></font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">总结：有了向量化，模型才可以真正能用来：</font>

+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">相似度计算</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">语义理解</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">分类、检索、问答</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">靠的不是原始文字，而是 </font>**<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">embedding 向量</font>**<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">。</font>

## <font style="color:#C99103;">相似度计算  </font>
<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">✅</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> 简化版（例子 1）：</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">我用了</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">(99-98)+(1-2)=0</font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">这种简单减法求和，是为了让你快速理解 “差距小 = 语义近”。</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">✅</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> 真实场景：</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">模型计算相似度用的是</font>**<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">余弦相似度（Cosine Similarity）</font>**<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"> —— 核心逻辑是 “计算两个向量的夹角”：</font>

+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">夹角越小 → 相似度越高（0°= 相似度 1，完全一样；90°= 相似度 0，无关；180°= 相似度 - 1，完全相反）；</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">公式：</font><img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770718498611-5498236e-6622-465d-a168-67e6274e32d5.png" width="365.6" title="" crop="0,0,1,1" id="u5c5c429a" class="ne-image">

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770719421168-1cf9e2b8-8e3a-465c-97c1-9bc3c098605e.png" width="588" title="" crop="0,0,1,1" id="u7821d71b" class="ne-image">

向量为什么有夹角？  在二维平面里，我们可以很直观地看到：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1770720697702-c838ea5b-c52f-4163-9b50-d1ad5cd94fa5.png" width="488.8" title="" crop="0,0,1,1" id="u198ce961" class="ne-image">

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">当把它们的起点都放在原点时，这两条线段之间就形成了一个夹角 </font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">θ</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">。</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">在高维空间（比如 1024 维的 embedding 向量），虽然我们无法直接画出这个角，但数学上的定义是完全一样的：</font>**<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">两个向量之间的夹角，就是它们方向差异的度量</font>**<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">。</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">再利用余弦相似度的公式 去计算夹角的相似度。 模型通过计算余弦相似度，本质上就是在计算两个向量的夹角，从而判断它们语义的远近。  </font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);"></font>

## <font style="color:#C99103;">向量化模型选择</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773726049349-0773f60a-b486-4a8a-8cb9-fd2747370443.png" width="1476" title="" crop="0,0,1,1" id="u48572577" class="ne-image">

## <font style="color:#C99103;">代码实现</font>
### <font style="color:#07787E;">创建微服务</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773727528184-3a3ba1c5-4148-4619-b868-5f0d1c80b688.png" width="785.6" title="" crop="0,0,1,1" id="u04448a13" class="ne-image">

### <font style="color:#07787E;">修改pom.xml</font>
```javascript
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>com.msb</groupId>
        <artifactId>SpringAIAlibabaPro</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>

    <artifactId>SpringAiAlibabaEmbedding1</artifactId>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!--
        引入 springai alibaba DashScope 模型适配的 Starter
        -->
        <dependency>
            <groupId>com.alibaba.cloud.ai</groupId>
            <artifactId>spring-ai-alibaba-starter-dashscope</artifactId>
        </dependency>

    </dependencies>

</project>
```

### <font style="color:#07787E;">编写配置文件</font>
```javascript
server:
  port: 8007  # 指定当前服务的端口
  servlet:
    encoding:
      enabled: true # 大模型对话中文乱码处理
      force: true
      charset: utf-8
spring:
  application:
    name: springaialibabaembedding1 # 微服务名称
  ai:
    dashscope:
      api-key: ${qwennodel}     # 大模型三件套指定
#      base-url: https://dashscope.aliyuncs.com/compatible-mode/v1 不指定了，用底层的
      chat:
        options:
          model: qwen3-max  # 指定文本模型
      embedding:
        options:
          model: text-embedding-v4  # 指定向量化模型
```

### <font style="color:#07787E;">编写控制类</font>
```javascript
package com.msb.controller;

import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.embedding.EmbeddingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.cloud.ai.dashscope.embedding.DashScopeEmbeddingOptions;
import org.springframework.ai.embedding.EmbeddingRequest;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class DemoController {
    @Autowired
    private EmbeddingModel embeddingModel;

    @Value("${spring.ai.dashscope.embedding.options.model}")
    private String embeddingModelName;

    @GetMapping("/embedding")
    public EmbeddingResponse text2Embed(@RequestParam("msg") String msg){

        // EmbeddingResponse 是文本向量化接口的完整响应对象，它包含了所有返回信息（元数据、向量结果、用量等）
        EmbeddingResponse embeddingResponse = embeddingModel.call(new EmbeddingRequest(List.of(msg),
                DashScopeEmbeddingOptions.builder().withModel(embeddingModelName).build()));

        // 只提取向量（最简洁写法）
        System.out.println(Arrays.toString(embeddingResponse.getResult().getOutput()));


        return embeddingResponse;
    }
}

```

### <font style="color:#07787E;">编写主启动类</font>


```java
package com.msb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args)    {
        SpringApplication.run(App.class, args);
    }
}
```

### <font style="color:#07787E;">运行测试</font>
结果：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773729950144-10de51f7-6972-4dc1-bdfd-8391f453e13f.png" width="1515.2" title="" crop="0,0,1,1" id="ufdf28d42" class="ne-image">

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773729960600-a55940f3-54df-44ef-962c-73e4ee21f5db.png" width="1516.8" title="" crop="0,0,1,1" id="u8005cdde" class="ne-image">



# <font style="color:#7E45E8;">向量数据库</font>
## <font style="color:#C99103;">向量数据库作用</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">向量的存储</font>
+ <font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">向量检索</font>

## <font style="color:#C99103;">常用向量数据库 Milvus</font>
<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">Milvus 是一个开源的高性能向量数据库（Vector Database），专为存储、索引和检索高维向量数据而设计，它能够处理图像、音频、视频、自然语言等嵌入表示（embeddings），支持海量向量（万亿级）毫秒级相似搜索。</font>

Milvus 由 Zilliz 开发，并捐赠给了 Linux 基金会下的 LF AI & Data 基金会，现已成为世界领先的开源向量数据库项目之一。

## <font style="color:#C99103;">安装Milvus - 前置技能点</font>
+ Linux
+ Docker

## <font style="color:#C99103;">Milvus Standalone搭建</font>
<font style="color:rgb(36, 41, 46);">Milvus Standalone（单机版）: Docker 中运行，所有组件（Milvus + etcd）打包在一台主机内，支持10亿向量存储，适合中小型生产环境。</font>

### <font style="color:#07787E;">【1】虚拟机启动</font>
### <font style="color:#07787E;">【2】确保docker已经安装并启动，测试：</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773990323685-4b458799-a609-4ea1-9bc9-aa6b7993715c.png" width="700" title="" crop="0,0,1,1" id="u048b3bfa" class="ne-image">

### <font style="color:#07787E;">【3】使用docker compose 安装Milvus</font>
Docker Compose 通过一个 `<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">docker-compose.yml</font>` 文件，将所有 Milvus 组件的配置（镜像版本、网络、卷、环境变量、依赖关系）集中管理。只需 2 条核心命令即可完成部署：

```plain
#创建目录并进入【创建目录，然后一会docker-compose.yml就会下载在这里】
mkdir -p /software/milvus && cd /software/milvus

#下载compose 配置,或者直接将资料中 docker-compose.yml上传至目录下
wget https://github.com/milvus-io/milvus/releases/download/v2.5.14/milvus-standalone-docker-compose.yml -O docker-compose.yml

#启动 Milvus
docker compose up -d

#停止Milvus
docker compose down

```

我们把所有依赖的镜像打了一个包：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773996292761-17bf298d-61ab-452c-9db1-1c12ad32ce91.png" width="318.4" title="" crop="0,0,1,1" id="u38bd35c3" class="ne-image">

把这个tar包上传到linux下：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773996674189-3195afca-c868-4a61-a50b-afaa48d652a4.png" width="980.8" title="" crop="0,0,1,1" id="u65e32c70" class="ne-image">

执行如下命令，它会自动向docker中加载milvus所需的镜像依赖：就相当于load到当前的docker环境中了

```plain
docker load -i all_milvus_images.tar
```

加载后启动启动 Milvus：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773997810345-6096a1a0-84ae-44c0-a21b-d8a0e13017c6.png" width="1122.4" title="" crop="0,0,1,1" id="ua32a4103" class="ne-image">



### <font style="color:#07787E;">【4】启动成功后，打开浏览器，访问milvus WebUI：</font>
[http://你的ip:9091/webui/](http://192.168.0.107:9091/webui/)

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1773998472610-31f9ba13-ecde-437a-bf9d-57a454168c75.png" width="1064.8" title="" crop="0,0,1,1" id="u924ac693" class="ne-image">

PS : 9091端口仅用于状态检测

### <font style="color:#07787E;">【5】安装 attu可视化工具来操作Milvus</font>
<font style="color:rgb(36, 41, 46);">Attu是一款专为Milvus向量数据库打造的开源数据库管理工具，提供了便捷的图形化界面，极大地简化了对Milvus数据库的操作与管理流程。</font>

<font style="color:rgb(36, 41, 46);">双击资料中“attu-Setup-2.5.12.exe”进行Attu安装，安装完成后进入Attu并连接Milvus：</font>

<font style="color:rgb(36, 41, 46);">default为默认数据库</font>

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1774007960690-dde09c88-e80a-4a29-b247-5e8d3cf61e0c.png" width="1048" title="" crop="0,0,1,1" id="u604e7c74" class="ne-image">

点击连接后：

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1774007989638-30186942-a3d2-4093-9e7e-4c0be115a097.png" width="1048" title="" crop="0,0,1,1" id="ua54226de" class="ne-image">



## <font style="color:#C99103;">Milvus核心概念介绍</font>
<font style="color:rgb(36, 41, 46);">Milvus核心概念有数据库、Collections、Schema，下面分别介绍。</font>

+ **<font style="color:rgb(36, 41, 46);">数据库</font>**

<font style="color:rgb(36, 41, 46);">在 Milvus 中，数据库是组织和管理数据的逻辑单元。为了提高数据安全性并实现多租户，你可以</font>**<font style="color:rgb(36, 41, 46);">创建多个数据库</font>**<font style="color:rgb(36, 41, 46);">，为不同的应用程序或租户从逻辑上隔离数据。例如，创建一个数据库用于存储用户 A 的数据，另一个数据库用于存储用户 B 的数据。与关系型数据库中所说的数据库一个概念。</font>

+ **<font style="color:rgb(36, 41, 46);">Collections</font>**

<font style="color:rgb(36, 41, 46);">在 Milvus 中，Collection 可以比作关系存储系统中的表。Collections 是 Milvus 中最大的数据单元，在 Milvus 中，所有数据都是按 Collections（集合）、shard（分片）、partition（分区）、segment（数据片段） 和 entity （数据实体，一行数据就是一个实体）组织的。</font>

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1774521619237-ad651bfc-79d6-4105-b86f-21dc0df7e62c.png" width="1012.8" title="" crop="0,0,1,1" id="u87d33182" class="ne-image">

<font style="color:rgb(36, 41, 46);">Collection 是一个二维表，有行和列的概念。每列代表一个字段，每行代表一个实体。下图显示了一个有 8 列和 6 个实体的 Collection。</font>

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1774522032665-fc5c0595-ebb9-429e-817a-85c31d078fb4.png" width="1049.6" title="" crop="0,0,1,1" id="ub93458aa" class="ne-image">

+ **<font style="color:rgb(36, 41, 46);">Schema  /ˈskiːmə/  </font>**

<font style="color:rgb(36, 41, 46);">Schema 定义了 Collections 的数据结构。在创建一个 Collection 之前，你需要设计出它的 Schema，定义如何组织 Collection 中的数据。</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">Milvus Schema 必须包含的 3 类字段，一个 Schema 固定由这几部分组成：</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">① 主键字段（必须有，且只能 1 个）</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">唯一标识一条数据</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">like MySQL 的 </font>`<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">id</font>`

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">类型：int /varchar</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">② 向量字段（必须有，最多 4 个）</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">存</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">向量 embedding</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">（比如文章、图片、音频转成的向量）</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">这是 Milvus 最核心的字段，</font><font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">用来做相似度检索</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">必须指定：向量维度（dim）</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">③ 标量字段（可选，任意多个）</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">存普通数据：文本、数字、布尔、JSON</font>

<font style="color:rgb(0, 0, 0);background-color:rgba(0, 0, 0, 0);">用来过滤、筛选（比如：分类、时间、作者、状态）</font>



## <font style="color:#C99103;">代码实操</font>
需求：向milvus中插入数据

### <font style="color:#07787E;">【1】创建基本java项目即可</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1774530517195-955b7762-222d-4522-a0c6-a0585d378831.png" width="941.6" title="" crop="0,0,1,1" id="u3c41ede1" class="ne-image">

### <font style="color:#07787E;">【2】导入依赖</font>
```xml
<dependency>
  <groupId>org.slf4j</groupId>
  <artifactId>slf4j-api</artifactId>
  <version>2.0.9</version>
</dependency>
<dependency>
  <groupId>io.milvus</groupId>
  <artifactId>milvus-sdk-java</artifactId>
  <version>2.6.0</version>
</dependency>
```

### <font style="color:#07787E;">【3】创建Collection和Schema</font>
```java
package com.allyun.controller;

import io.milvus.v2.client.ConnectConfig;
import io.milvus.v2.client.MilvusClientV2;
import io.milvus.v2.common.DataType;
import io.milvus.v2.common.IndexParam;
import io.milvus.v2.service.collection.request.AddFieldReq;
import io.milvus.v2.service.collection.request.CreateCollectionReq;
import java.util.ArrayList;
import java.util.List;

public class TestMilvusCollection {
    static String MILVUS_URI = "http://192.168.1.3:19530";
    static String TOKEN = "root:Milvus";


    public static void main(String[] args) {

        //1.连接到Milvus
        ConnectConfig connectConfig = ConnectConfig.builder()
                .uri(MILVUS_URI)
                .token(TOKEN)
                .build();
        MilvusClientV2 client = new MilvusClientV2(connectConfig);


        //2.创建 Collection
        String collectionName = "testCollection";

        createCollection(client,collectionName);

        //3.列出collection
        List<String> collectionNames = client.listCollections().getCollectionNames();
        System.out.println("collectionNames:"+collectionNames);

    }


    private static void createCollection(MilvusClientV2 client, String collectionName) {
        //1.创建schema
        CreateCollectionReq.CollectionSchema schema = MilvusClientV2.CreateSchema()
                .addField(
                        AddFieldReq.builder()
                                .fieldName("id")
                                .dataType(DataType.Int64)
                                .isPrimaryKey(true)
                                .autoID(false)
                                .build()
                )
                .addField(
                        AddFieldReq.builder()
                                .fieldName("vector")
                                .dataType(DataType.FloatVector)
                                .dimension(5)
                                .build()
                )
                .addField(
                        AddFieldReq.builder()
                                .fieldName("color")
                                .dataType(DataType.VarChar)
                                .maxLength(512)
                                .build()
                );

        //2. 构建索引
        ArrayList<IndexParam> indexParams = new ArrayList<IndexParam>();

        IndexParam vector = IndexParam.builder()
                .fieldName("vector")
                .indexType(IndexParam.IndexType.IVF_FLAT)
                .metricType(IndexParam.MetricType.COSINE)/
                .build();
        indexParams.add(vector);

        //创建collection
        client.createCollection(
                CreateCollectionReq.builder()
                        .collectionName(collectionName)
                        .collectionSchema(schema)
                        .indexParams(indexParams)
                        .build()
        );

    }
}


```

### <font style="color:#07787E;">【4】插入数据</font>
```java
package com.allyun.controller;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.milvus.v2.client.ConnectConfig;
import io.milvus.v2.client.MilvusClientV2;
import io.milvus.v2.common.DataType;
import io.milvus.v2.common.IndexParam;
import io.milvus.v2.service.collection.request.AddFieldReq;
import io.milvus.v2.service.collection.request.CreateCollectionReq;
import io.milvus.v2.service.utility.request.FlushReq;
import io.milvus.v2.service.vector.request.InsertReq;
import io.milvus.v2.service.vector.response.InsertResp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMilvusCollection {
    static String MILVUS_URI = "http://192.168.0.168:19530";
    static String TOKEN = "root:Milvus";


    public static void main(String[] args) {

        //1.连接到Milvus
        ConnectConfig connectConfig = ConnectConfig.builder()
        .uri(MILVUS_URI)
        .token(TOKEN)
        .build();

        MilvusClientV2 client = new MilvusClientV2(connectConfig);


        //2.向collection插入数据
        String collectionName = "testCollection";
        inserDataIntoCollection(client,collectionName);

    }

    private static void inserDataIntoCollection(MilvusClientV2 client, String collectionName) {
        //准备数据
        Gson gson = new Gson();
        List<JsonObject> data = Arrays.asList(
            // fromJson是 Google Gson 库的核心方法，作用就是把 JSON 字符串 → 转换成 Java对象
            // 第二个参数：把 JSON 转成一个「通用的 JSON 对象」
            gson.fromJson("{\"id\": 0, \"vector\": [0.3580376395471989, -0.6023495712049978, 0.18414012509913835, -0.26286205330961354, 0.9029438446296592], \"color\": \"pink_1111\"}", JsonObject.class),
            gson.fromJson("{\"id\": 1, \"vector\": [0.19886812562848388, 0.06023560599112088, 0.6976963061752597, 0.2614474506242501, 0.838729485096104], \"color\": \"red_7025\"}", JsonObject.class),
            gson.fromJson("{\"id\": 2, \"vector\": [0.43742130801983836, -0.5597502546264526, 0.6457887650909682, 0.7894058910881185, 0.20785793220625592], \"color\": \"orange_6781\"}", JsonObject.class),
            gson.fromJson("{\"id\": 3, \"vector\": [0.3172005263489739, 0.9719044792798428, -0.36981146090600725, -0.4860894583077995, 0.95791889146345], \"color\": \"pink_9298\"}", JsonObject.class),
            gson.fromJson("{\"id\": 4, \"vector\": [0.4452349528804562, -0.8757026943054742, 0.8220779437047674, 0.46406290649483184, 0.30337481143159106], \"color\": \"red_4794\"}", JsonObject.class),
            gson.fromJson("{\"id\": 5, \"vector\": [0.985825131989184, -0.8144651566660419, 0.6299267002202009, 0.1206906911183383, -0.1446277761879955], \"color\": \"yellow_4222\"}", JsonObject.class),
            gson.fromJson("{\"id\": 6, \"vector\": [0.8371977790571115, -0.015764369584852833, -0.31062937026679327, -0.562666951622192, -0.8984947637863987], \"color\": \"red_9392\"}", JsonObject.class),
            gson.fromJson("{\"id\": 7, \"vector\": [-0.33445148015177995, -0.2567135004164067, 0.8987539745369246, 0.9402995886420709, 0.5378064918413052], \"color\": \"grey_8510\"}", JsonObject.class),
                gson.fromJson("{\"id\": 8, \"vector\": [0.39524717779832685, 0.4000257286739164, -0.5890507376891594, -0.8650502298996872, -0.6140360785406336], \"color\": \"white_9381\"}", JsonObject.class),
                gson.fromJson("{\"id\": 9, \"vector\": [0.5718280481994695, 0.24070317428066512, -0.3737913482606834, -0.06726932177492717, -0.6980531615588608], \"color\": \"purple_4976\"}", JsonObject.class)
        );

        //插入数据
        InsertResp insert = client.insert(
                InsertReq.builder()
                        .collectionName(collectionName)
                        .data(data)
                        .build()
        );

        //刷新数据，否则查询不到数据
        client.flush(
                FlushReq.builder()
                        .collectionNames(List.of(collectionName))
                        .build()
        );

        System.out.println("插入数据成功");



    }

    private static void createCollection(MilvusClientV2 client, String collectionName) {
        //1.创建schema
        CreateCollectionReq.CollectionSchema schema = MilvusClientV2.CreateSchema()
                .addField(
                        AddFieldReq.builder()
                                .fieldName("id")
                                .dataType(DataType.Int64)
                                .isPrimaryKey(true)
                                .autoID(false)
                                .build()
                )
                .addField(
                        AddFieldReq.builder()
                                .fieldName("vector")
                                .dataType(DataType.FloatVector)
                                .dimension(5)
                                .build()
                )
                .addField(
                        AddFieldReq.builder()
                                .fieldName("color")
                                .dataType(DataType.VarChar)
                                .maxLength(512)
                                .build()
                );

        //构建索引
        ArrayList<IndexParam> indexParams = new ArrayList<IndexParam>();

        IndexParam vector = IndexParam.builder()
                .fieldName("vector")
                .indexType(IndexParam.IndexType.IVF_FLAT)
                .metricType(IndexParam.MetricType.COSINE)
                .build();
        indexParams.add(vector);

        //创建collection
        client.createCollection(
                CreateCollectionReq.builder()
                        .collectionName(collectionName)
                        .collectionSchema(schema)
                        .indexParams(indexParams)
                        .build()
        );

    }
}


```

### <font style="color:#07787E;">【5】查询数据</font>
```java
package com.allyun.controller;



import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.milvus.v2.client.ConnectConfig;
import io.milvus.v2.client.MilvusClientV2;
import io.milvus.v2.common.DataType;
import io.milvus.v2.common.IndexParam;
import io.milvus.v2.service.collection.request.AddFieldReq;
import io.milvus.v2.service.collection.request.CreateCollectionReq;
import io.milvus.v2.service.utility.request.FlushReq;
import io.milvus.v2.service.vector.request.GetReq;
import io.milvus.v2.service.vector.request.InsertReq;
import io.milvus.v2.service.vector.response.GetResp;
import io.milvus.v2.service.vector.response.InsertResp;
import io.milvus.v2.service.vector.response.QueryResp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMilvusCollection4 {
    static String MILVUS_URI = "http://192.168.0.108:19530";
    static String TOKEN = "root:Milvus";


    public static void main(String[] args) {

        //1.连接到Milvus
        ConnectConfig connectConfig = ConnectConfig.builder()
                .uri(MILVUS_URI)
                .token(TOKEN)
                .build();

        MilvusClientV2 client = new MilvusClientV2(connectConfig);


        //2.查询数据
        String collectionName = "testCollection";

        GetResp getResp = client.get(
                GetReq.builder()
                        .collectionName(collectionName)
                        .ids(List.of(1, 2, 3))
                        .outputFields(List.of("id", "color"))
                        .build()
        );

        for (QueryResp.QueryResult getResult : getResp.getResults) {
            System.out.println("数据："+getResult.toString());
        }
    }

    private static void inserDataIntoCollection(MilvusClientV2 client, String collectionName) {
        //准备数据
        Gson gson = new Gson();
        List<JsonObject> data = Arrays.asList(
                gson.fromJson("{\"id\": 0, \"vector\": [0.3580376395471989, -0.6023495712049978, 0.18414012509913835, -0.26286205330961354, 0.9029438446296592], \"color\": \"pink_1111\"}", JsonObject.class),
                gson.fromJson("{\"id\": 1, \"vector\": [0.19886812562848388, 0.06023560599112088, 0.6976963061752597, 0.2614474506242501, 0.838729485096104], \"color\": \"red_7025\"}", JsonObject.class),
                gson.fromJson("{\"id\": 2, \"vector\": [0.43742130801983836, -0.5597502546264526, 0.6457887650909682, 0.7894058910881185, 0.20785793220625592], \"color\": \"orange_6781\"}", JsonObject.class),
                gson.fromJson("{\"id\": 3, \"vector\": [0.3172005263489739, 0.9719044792798428, -0.36981146090600725, -0.4860894583077995, 0.95791889146345], \"color\": \"pink_9298\"}", JsonObject.class),
                gson.fromJson("{\"id\": 4, \"vector\": [0.4452349528804562, -0.8757026943054742, 0.8220779437047674, 0.46406290649483184, 0.30337481143159106], \"color\": \"red_4794\"}", JsonObject.class),
                gson.fromJson("{\"id\": 5, \"vector\": [0.985825131989184, -0.8144651566660419, 0.6299267002202009, 0.1206906911183383, -0.1446277761879955], \"color\": \"yellow_4222\"}", JsonObject.class),
                gson.fromJson("{\"id\": 6, \"vector\": [0.8371977790571115, -0.015764369584852833, -0.31062937026679327, -0.562666951622192, -0.8984947637863987], \"color\": \"red_9392\"}", JsonObject.class),
                gson.fromJson("{\"id\": 7, \"vector\": [-0.33445148015177995, -0.2567135004164067, 0.8987539745369246, 0.9402995886420709, 0.5378064918413052], \"color\": \"grey_8510\"}", JsonObject.class),
                gson.fromJson("{\"id\": 8, \"vector\": [0.39524717779832685, 0.4000257286739164, -0.5890507376891594, -0.8650502298996872, -0.6140360785406336], \"color\": \"white_9381\"}", JsonObject.class),
                gson.fromJson("{\"id\": 9, \"vector\": [0.5718280481994695, 0.24070317428066512, -0.3737913482606834, -0.06726932177492717, -0.6980531615588608], \"color\": \"purple_4976\"}", JsonObject.class)
        );

        //插入数据
        InsertResp insert = client.insert(
                InsertReq.builder()
                        .collectionName(collectionName)
                        .data(data)
                        .build()
        );

        //刷新数据，否则查询不到数据
        client.flush(
                FlushReq.builder()
                        .collectionNames(List.of(collectionName))
                        .build()
        );

        System.out.println("插入数据成功");



    }

    private static void createCollection(MilvusClientV2 client, String collectionName) {
        //1.创建schema
        CreateCollectionReq.CollectionSchema schema = MilvusClientV2.CreateSchema()
                .addField(
                        AddFieldReq.builder()
                                .fieldName("id")
                                .dataType(DataType.Int64)
                                .isPrimaryKey(true)
                                .autoID(false)
                                .build()
                )
                .addField(
                        AddFieldReq.builder()
                                .fieldName("vector")
                                .dataType(DataType.FloatVector)
                                .dimension(5)
                                .build()
                )
                .addField(
                        AddFieldReq.builder()
                                .fieldName("color")
                                .dataType(DataType.VarChar)
                                .maxLength(512)
                                .build()
                );

        //构建索引
        ArrayList<IndexParam> indexParams = new ArrayList<IndexParam>();

        IndexParam vector = IndexParam.builder()
                .fieldName("vector")
                .indexType(IndexParam.IndexType.IVF_FLAT)
                .metricType(IndexParam.MetricType.COSINE)
                .build();
        indexParams.add(vector);

        //创建collection
        client.createCollection(
                CreateCollectionReq.builder()
                        .collectionName(collectionName)
                        .collectionSchema(schema)
                        .indexParams(indexParams)
                        .build()
        );

    }
}


```



### <font style="color:#07787E;">【6】删除数据</font>
```java
package com.allyun.controller;



import com.google.gson.Gson;
import com.google.gson.JsonObject;
import io.milvus.v2.client.ConnectConfig;
import io.milvus.v2.client.MilvusClientV2;
import io.milvus.v2.common.DataType;
import io.milvus.v2.common.IndexParam;
import io.milvus.v2.service.collection.request.AddFieldReq;
import io.milvus.v2.service.collection.request.CreateCollectionReq;
import io.milvus.v2.service.utility.request.FlushReq;
import io.milvus.v2.service.vector.request.DeleteReq;
import io.milvus.v2.service.vector.request.GetReq;
import io.milvus.v2.service.vector.request.InsertReq;
import io.milvus.v2.service.vector.response.DeleteResp;
import io.milvus.v2.service.vector.response.GetResp;
import io.milvus.v2.service.vector.response.InsertResp;
import io.milvus.v2.service.vector.response.QueryResp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMilvusCollection4 {
    static String MILVUS_URI = "http://192.168.0.108:19530";
    static String TOKEN = "root:Milvus";


    public static void main(String[] args) {

        //1.连接到Milvus
        ConnectConfig connectConfig = ConnectConfig.builder()
                .uri(MILVUS_URI)
                .token(TOKEN)
                .build();

        MilvusClientV2 client = new MilvusClientV2(connectConfig);


        //2.删除数据
        String collectionName = "testCollection";

        DeleteResp delete = client.delete(DeleteReq.builder().collectionName(collectionName).ids(List.of(0, 1)).build());
        System.out.println("delete:"+delete);
    }

    private static void inserDataIntoCollection(MilvusClientV2 client, String collectionName) {
        //准备数据
        Gson gson = new Gson();
        List<JsonObject> data = Arrays.asList(
                gson.fromJson("{\"id\": 0, \"vector\": [0.3580376395471989, -0.6023495712049978, 0.18414012509913835, -0.26286205330961354, 0.9029438446296592], \"color\": \"pink_1111\"}", JsonObject.class),
                gson.fromJson("{\"id\": 1, \"vector\": [0.19886812562848388, 0.06023560599112088, 0.6976963061752597, 0.2614474506242501, 0.838729485096104], \"color\": \"red_7025\"}", JsonObject.class),
                gson.fromJson("{\"id\": 2, \"vector\": [0.43742130801983836, -0.5597502546264526, 0.6457887650909682, 0.7894058910881185, 0.20785793220625592], \"color\": \"orange_6781\"}", JsonObject.class),
                gson.fromJson("{\"id\": 3, \"vector\": [0.3172005263489739, 0.9719044792798428, -0.36981146090600725, -0.4860894583077995, 0.95791889146345], \"color\": \"pink_9298\"}", JsonObject.class),
                gson.fromJson("{\"id\": 4, \"vector\": [0.4452349528804562, -0.8757026943054742, 0.8220779437047674, 0.46406290649483184, 0.30337481143159106], \"color\": \"red_4794\"}", JsonObject.class),
                gson.fromJson("{\"id\": 5, \"vector\": [0.985825131989184, -0.8144651566660419, 0.6299267002202009, 0.1206906911183383, -0.1446277761879955], \"color\": \"yellow_4222\"}", JsonObject.class),
                gson.fromJson("{\"id\": 6, \"vector\": [0.8371977790571115, -0.015764369584852833, -0.31062937026679327, -0.562666951622192, -0.8984947637863987], \"color\": \"red_9392\"}", JsonObject.class),
                gson.fromJson("{\"id\": 7, \"vector\": [-0.33445148015177995, -0.2567135004164067, 0.8987539745369246, 0.9402995886420709, 0.5378064918413052], \"color\": \"grey_8510\"}", JsonObject.class),
                gson.fromJson("{\"id\": 8, \"vector\": [0.39524717779832685, 0.4000257286739164, -0.5890507376891594, -0.8650502298996872, -0.6140360785406336], \"color\": \"white_9381\"}", JsonObject.class),
                gson.fromJson("{\"id\": 9, \"vector\": [0.5718280481994695, 0.24070317428066512, -0.3737913482606834, -0.06726932177492717, -0.6980531615588608], \"color\": \"purple_4976\"}", JsonObject.class)
        );

        //插入数据
        InsertResp insert = client.insert(
                InsertReq.builder()
                        .collectionName(collectionName)
                        .data(data)
                        .build()
        );

        //刷新数据，否则查询不到数据
        client.flush(
                FlushReq.builder()
                        .collectionNames(List.of(collectionName))
                        .build()
        );

        System.out.println("插入数据成功");



    }

    private static void createCollection(MilvusClientV2 client, String collectionName) {
        //1.创建schema
        CreateCollectionReq.CollectionSchema schema = MilvusClientV2.CreateSchema()
                .addField(
                        AddFieldReq.builder()
                                .fieldName("id")
                                .dataType(DataType.Int64)
                                .isPrimaryKey(true)
                                .autoID(false)
                                .build()
                )
                .addField(
                        AddFieldReq.builder()
                                .fieldName("vector")
                                .dataType(DataType.FloatVector)
                                .dimension(5)
                                .build()
                )
                .addField(
                        AddFieldReq.builder()
                                .fieldName("color")
                                .dataType(DataType.VarChar)
                                .maxLength(512)
                                .build()
                );

        //构建索引
        ArrayList<IndexParam> indexParams = new ArrayList<IndexParam>();

        IndexParam vector = IndexParam.builder()
                .fieldName("vector")
                .indexType(IndexParam.IndexType.IVF_FLAT)
                .metricType(IndexParam.MetricType.COSINE)
                .build();
        indexParams.add(vector);

        //创建collection
        client.createCollection(
                CreateCollectionReq.builder()
                        .collectionName(collectionName)
                        .collectionSchema(schema)
                        .indexParams(indexParams)
                        .build()
        );

    }
}


```

# <font style="color:#7E45E8;">RAG</font>
## <font style="color:#C99103;">什么是RAG</font>
RAG：Retrieval-Augmented Generation 检索增强生成式人工智能，<font style="color:rgb(36, 41, 46);">是一种将大型语言模型（LLM）与外部知识源相结合的人工智能技术。通过在生成响应前检索相关信息，RAG 能够为模型提供最新且特定领域的知识，从而提高回答的准确性和相关性。</font>

## <font style="color:#C99103;">如何构建知识库</font>
文档 → 解析 → chunks → Embedding → 向量 → 存入向量库

最终结果形成知识库，整个过程叫indexing

## <font style="color:#C99103;">RAG 系统全流程架构图  </font>
<img src="https://cdn.nlark.com/yuque/0/2026/jpeg/39281619/1774870344808-18049cce-3ff8-4e88-9fa1-f02dbfb7d077.jpeg" width="1268" title="" crop="0,0,1,1" id="u8398781e" class="ne-image">

## <font style="color:#C99103;">导游考试RAG案例 - 代码实现 </font>
代码实现前，确保向量数据库连接成功。

### <font style="color:#07787E;">【1】创建微服务</font>
<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1774932929099-18207338-0798-46c5-b077-a6cf30702aec.png" width="785.6" title="" crop="0,0,1,1" id="uf80d435a" class="ne-image">

### <font style="color:#07787E;">【2】导入依赖</font>
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>com.msb</groupId>
    <artifactId>SpringAIAlibabaPro</artifactId>
    <version>1.0-SNAPSHOT</version>
  </parent>

  <artifactId>SpringAiAlibabaRAGDemo</artifactId>

  <properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

  <dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!--引入 springai alibaba DashScope 模型适配的 Starter-->
    <dependency>
      <groupId>com.alibaba.cloud.ai</groupId>
      <artifactId>spring-ai-alibaba-starter-dashscope</artifactId>
    </dependency>
    <!--  RetrievalAugmentationAdvisor  依赖包-->
    <dependency>
      <groupId>org.springframework.ai</groupId>
      <artifactId>spring-ai-rag</artifactId>
    </dependency>

    <!--  Milvus VectorStore 依赖包-->
        <dependency>
            <groupId>org.springframework.ai</groupId>
            <artifactId>spring-ai-starter-vector-store-milvus</artifactId>
        </dependency>

        <!-- Tika DocumentReader 依赖包-->
        <dependency>
            <groupId>org.springframework.ai</groupId>
            <artifactId>spring-ai-tika-document-reader</artifactId>
        </dependency>

    </dependencies>

</project>
```

### <font style="color:#07787E;">【3】添加企业文档</font>
添加文档到resources目录下。

<img src="https://cdn.nlark.com/yuque/0/2026/png/39281619/1774933109379-6f82ae7a-21a9-4b49-ae13-8bbbf0d1a3fe.png" width="389.6" title="" crop="0,0,1,1" id="u69da9398" class="ne-image">

### <font style="color:#07787E;">【4】配置文件</font>
```xml
server:
  port: 8009  # 指定当前服务的端口
  servlet:
    encoding:
      enabled: true # 大模型对话中文乱码处理
      force: true
      charset: utf-8
spring:
  application:
    name: springaialibabaragdemo # 微服务名称
  ai:
    dashscope:
      api-key: ${qwennodel}     # 大模型三件套指定
      #      base-url: https://dashscope.aliyuncs.com/compatible-mode/v1 不指定了，用底层的
      chat:
        options:
          model: qwen3-max  # 指定文本模型
      embedding:
        options:
          model: text-embedding-v4  # 指定向量化模型
    vectorstore:
      milvus:
        client:
          host: 192.168.0.108
          port: 19530
          token: root:Milvus
        database-name: default
        collection-name: guide_store
        initialize-schema: true
        embedding-dimension: 1024
logging:
  pattern:
    console: "%-5level %logger - %msg%n" # 设置日志格式
```



### <font style="color:#07787E;">【5】配置类编写</font>
```java
package com.msb.config;

import io.milvus.client.MilvusServiceClient;
import io.milvus.grpc.GetCollectionStatisticsResponse;
import io.milvus.param.R;
import io.milvus.param.collection.FlushParam;
import io.milvus.param.collection.GetCollectionStatisticsParam;
import io.milvus.response.GetCollStatResponseWrapper;
import jakarta.annotation.PostConstruct;
import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.document.Document;
import org.springframework.ai.rag.advisor.RetrievalAugmentationAdvisor;
import org.springframework.ai.rag.generation.augmentation.ContextualQueryAugmenter;
import org.springframework.ai.rag.retrieval.search.VectorStoreDocumentRetriever;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.milvus.MilvusVectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.List;


@Configuration
public class LLMConfig {
    @Autowired
    private MilvusVectorStore vectorStore;

    @Value("${spring.ai.vectorstore.milvus.collection-name}")
    private String collectionName;

    @Bean
    public ChatClient chatClient(ChatModel dashscopeChatModel){
        return ChatClient.builder(dashscopeChatModel).build();
    }


    //配置 RetrievalAugmentationAdvisor
    @Bean
    public RetrievalAugmentationAdvisor retrievalAugmentationAdvisor(){

        VectorStoreDocumentRetriever retriver = VectorStoreDocumentRetriever.builder()
        .vectorStore(vectorStore)
        .similarityThreshold(0.2)
        .topK(6)
        .build();

        ContextualQueryAugmenter cqa = ContextualQueryAugmenter.builder()
        .allowEmptyContext(true)
        .build();

        return RetrievalAugmentationAdvisor.builder()
        .documentRetriever(retriver)
        .queryAugmenter(cqa)
        .build();
    }



    //初始化向量数据库
    @PostConstruct
    public void initVectorData() throws TikaException, IOException {
        System.out.println("初始化向量数据，写入到Milvus 中...");

        //获取 Milvus 客户端
        MilvusServiceClient client = (MilvusServiceClient) vectorStore.getNativeClient().get();

        //先获取 collection 数据条数，如果大于0 ，就不再写入，否则写入
        R<GetCollectionStatisticsResponse> resp = client.getCollectionStatistics(
            GetCollectionStatisticsParam.newBuilder()
                        .withCollectionName(collectionName)
                        .build());

        long rowCount = new GetCollStatResponseWrapper(resp.getData()).getRowCount();

        System.out.println("milvus vector store 中的数量："+rowCount);

        if(rowCount==0){
            System.out.println("milvus 中没有数据，写入...");

            //加载文档数据到向量数据库
            loadAndStoreDocumentData();

            client.flush(FlushParam.newBuilder()
                    .withCollectionNames(List.of(collectionName))
                    .build());

        }


    }

    /**
     * 读取 WORD 文档内容存入 Milvus 中
     */
    private void loadAndStoreDocumentData() throws IOException, TikaException {

        ClassPathResource resource = new ClassPathResource("导游面试问答.doc");

        Tika tika = new Tika();
        String text = tika.parseToString(resource.getFile());

        //拆分文档，写入向量数据库
        //使用TokenTextSplitter 拆分文本
        TokenTextSplitter splitter = TokenTextSplitter.builder()
                .withChunkSize(800)
                .withMinChunkSizeChars(400)
                .withKeepSeparator(true)
                .build();

        List<Document> chunks = splitter.apply(List.of(new Document(text)));

        //写入向量数据库
        vectorStore.add(chunks);


    }
}

```



### <font style="color:#07787E;">【6】控制器编写</font>
```java
package com.msb.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.rag.advisor.RetrievalAugmentationAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RagController {
    @Autowired
    private ChatClient chatClient;

    @Autowired
    private RetrievalAugmentationAdvisor retrievalAugmentationAdvisor;

    @GetMapping("/chat")
    public String chat2(@RequestParam(value = "message") String message){
        String resp = chatClient.prompt()
                .user(message)
                .advisors(retrievalAugmentationAdvisor)
                .call()
                .content();

        return resp;
    }
}


```

### <font style="color:#07787E;">【7】主启动器编写</font>
```java
package com.msb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RagApp {
    public static void main(String[] args) {
        SpringApplication.run(RagApp.class, args);
    }
}

```

## 
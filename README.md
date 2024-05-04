# Revenium Metering JVM SDK 

This is a Java SDK for the Revenium Metering API. It is a simple way to send metering data to the Revenium Metering API.

## Installation

Add this dependency to your project's POM:

### Maven Users

```xml
<dependency>
  <groupId>io.revenium</groupId>
  <artifactId>revenium-metering</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle Users

Add this dependency to your project's build file:

```groovy
compile "io.revenium:revenium-metering:1.0.0"
```

## Getting Started

The following demonstrates how to use the SDK to send metering data to the Revenium Metering API from a Spring Boot API.

### Configuring the Metering API Client
```java
@Configuration
public class GreetingConfiguration {

  String apiKey;
  String meteringHost = "https://api.revenium.io/meter/v1/api";

  GreetingConfiguration(@Value("${revenium.api.key:") String apiKey) {
    this.apiKey = apiKey;
  }

  @Bean
  @Scope("singleton")
  MeteringApi metering() {
    ApiClient client = new ApiClient();
    client.setBasePath(meteringHost);
    client.setApiKey(apiKey);
    return new MeteringApi(client);
  }
}
```

### Sending Metering Data
```java
@RestController
public class GreetingController {

    MeteringApi meteringApi;

    GreetingController(@Autowired MeteringApi meteringApi) {
        this.meteringApi = meteringApi;
    }

    @GetMapping("/hello")
    public GreetingResponse sayHello(@RequestHeader(value = "clientId") String clientId) {
        try {
            return new GreetingResponse("Hello, Revenium.");
        } finally {
            meter(clientId, "GET", "/hello");
        }
    }

    private void meter(String clientId, String method, String url) {
        MeteringRequestDTO request = new MeteringRequestDTO();
        request.method(method); //required
        request.url(url); //required
        request.application(clientId); //required
        request.setResponseCode(200); //required
        request.setRequestHeaders(Collections.emptyList());
        request.setResponseHeaders(Collections.emptyList());
        try {
            meteringApi.meter(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
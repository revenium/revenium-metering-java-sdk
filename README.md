# revenium-metering

Revenium Metering API
- API version: 1.14.0-SNAPSHOT
  - Build date: 2024-03-05T14:57:18.128456-05:00[America/New_York]

Revenium Metering API

  For more information, please visit [https://revenium.io](https://revenium.io)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.revenium</groupId>
  <artifactId>revenium-metering</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.revenium:revenium-metering:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/revenium-metering-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
package org.example;
import io.swagger.client.*;
import io.swagger.client.model.*;
import io.swagger.client.api.MeteringApi;

import java.util.Collections;

public class Main {
    public static void main(String[] args)  {
        ApiClient client = new ApiClient();
        client.setBasePath("https://api.revenium.io/meter/v1/api");
        client.setApiKey("your_api_key");
        MetringApi meterApi = new MeteringApi(client);

        MeteringRequestDTO request = new MeteringRequestDTO();
        request.method("GET"); //required
        request.url("/api/1"); //required
        request.application("77273cd5-02be-46da-8022-87e237f25393"); //required
        request.setResponseCode(200); //required
        request.remoteHost("65.89.56.105"); //optional
        request.setRequestHeaders(Collections.emptyList()); //required but can be empty
        request.setResponseHeaders(Collections.emptyList()); //required but can be empty
        request.metadata("5"); //required
        request.backendLatency(100.0); //optional
        request.gatewayLatency(14.0); //optional
        request.timedOut(false); //optional
        request.requestMessageSize(1024L); //optional
        request.responseMessageSize(4096L); //optional
        request.remoteUser("foo@gmail.com"); //optional
        request.contentType("application/json"); //optional
        request.correlationId("3b3e9685-99e9-4f2d-9cd7-6c8de3cff2ae"); //optional
        request.httpProtocol("https"); //optional
        
        try {
            meterApi.meter(request);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.revenium.io/meter/v1/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EventsApi* | [**saveEvent**](docs/EventsApi.md#saveEvent) | **POST** /event | Save can API event
*MetringApi* | [**meter**](docs/MetringApi.md#meter) | **POST** /meter | Insert API metering data
*MetringApi* | [**valid**](docs/MetringApi.md#valid) | **GET** /meter/product-key | Determine if a ProductKey is valid or not

## Documentation for Models

 - [ApiEventDTO](docs/ApiEventDTO.md)
 - [ElementDTO](docs/ElementDTO.md)
 - [MeteringRequestDTO](docs/MeteringRequestDTO.md)
 - [Unit](docs/Unit.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### x-api-key

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@revenium.io

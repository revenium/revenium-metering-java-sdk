# revenium-metering-sdk

Revenium Metering API
- API version: 1.16.0-SNAPSHOT
  - Build date: 2024-07-24T15:37:29.173088-04:00[America/New_York]

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
  <groupId>io.revenium.metering</groupId>
  <artifactId>revenium-metering-sdk</artifactId>
  <version>1.0.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.revenium.metering:revenium-metering-sdk:1.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/revenium-metering-sdk-1.0.1-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.revenium.metering.invoker.*;
import io.revenium.metering.invoker.auth.*;
import io.revenium.metering.model.*;
import io.revenium.metering.api.EventsApi;

import java.io.File;
import java.util.*;

public class EventsApiExample {

    public static void main(String[] args) {
        
        EventsApi apiInstance = new EventsApi();
        ApiEventDTO body = new ApiEventDTO(); // ApiEventDTO | 
        try {
            apiInstance.saveEvent(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#saveEvent");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.revenium.io/meter/v1/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EventsApi* | [**saveEvent**](docs/EventsApi.md#saveEvent) | **POST** /event | Save an API event
*MeteringApi* | [**ingest**](docs/MeteringApi.md#ingest) | **POST** /meter/ingest | 
*MeteringApi* | [**meter**](docs/MeteringApi.md#meter) | **POST** /meter | Insert API metering data
*MeteringApi* | [**valid**](docs/MeteringApi.md#valid) | **GET** /meter/product-key | Determine if a ProductKey is valid or not

## Documentation for Models

 - [ApiEventDTO](docs/ApiEventDTO.md)
 - [ElementDTO](docs/ElementDTO.md)
 - [MeteringRequestDTO](docs/MeteringRequestDTO.md)

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

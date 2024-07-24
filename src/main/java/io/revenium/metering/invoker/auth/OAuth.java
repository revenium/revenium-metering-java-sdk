/*
 * Revenium Metering API
 * Revenium Metering API
 *
 * OpenAPI spec version: 1.16.0-SNAPSHOT
 * Contact: info@revenium.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.revenium.metering.invoker.auth;

import io.revenium.metering.invoker.Pair;

import javax.annotation.processing.Generated;
import java.util.Map;
import java.util.List;

@Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-07-24T15:37:29.173088-04:00[America/New_York]")
public class OAuth implements Authentication {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (accessToken != null) {
      headerParams.put("Authorization", "Bearer " + accessToken);
    }
  }
}

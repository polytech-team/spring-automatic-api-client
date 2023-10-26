/*
 * FastAPI
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package team.polytech.automatic.webui.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import team.polytech.automatic.webui.model.EmbeddingItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EmbeddingsResponse
 */
@JsonPropertyOrder({
  EmbeddingsResponse.JSON_PROPERTY_LOADED,
  EmbeddingsResponse.JSON_PROPERTY_SKIPPED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-27T02:28:26.857180667+03:00[Europe/Moscow]")
public class EmbeddingsResponse {
  public static final String JSON_PROPERTY_LOADED = "loaded";
  private Map<String, EmbeddingItem> loaded = new HashMap<>();

  public static final String JSON_PROPERTY_SKIPPED = "skipped";
  private Map<String, EmbeddingItem> skipped = new HashMap<>();

  public EmbeddingsResponse() {
  }

  public EmbeddingsResponse loaded(Map<String, EmbeddingItem> loaded) {
    
    this.loaded = loaded;
    return this;
  }

  public EmbeddingsResponse putLoadedItem(String key, EmbeddingItem loadedItem) {
    this.loaded.put(key, loadedItem);
    return this;
  }

   /**
   * Embeddings loaded for the current model
   * @return loaded
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOADED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, EmbeddingItem> getLoaded() {
    return loaded;
  }


  @JsonProperty(JSON_PROPERTY_LOADED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLoaded(Map<String, EmbeddingItem> loaded) {
    this.loaded = loaded;
  }


  public EmbeddingsResponse skipped(Map<String, EmbeddingItem> skipped) {
    
    this.skipped = skipped;
    return this;
  }

  public EmbeddingsResponse putSkippedItem(String key, EmbeddingItem skippedItem) {
    this.skipped.put(key, skippedItem);
    return this;
  }

   /**
   * Embeddings skipped for the current model (likely due to architecture incompatibility)
   * @return skipped
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SKIPPED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, EmbeddingItem> getSkipped() {
    return skipped;
  }


  @JsonProperty(JSON_PROPERTY_SKIPPED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSkipped(Map<String, EmbeddingItem> skipped) {
    this.skipped = skipped;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddingsResponse embeddingsResponse = (EmbeddingsResponse) o;
    return Objects.equals(this.loaded, embeddingsResponse.loaded) &&
        Objects.equals(this.skipped, embeddingsResponse.skipped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loaded, skipped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddingsResponse {\n");
    sb.append("    loaded: ").append(toIndentedString(loaded)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


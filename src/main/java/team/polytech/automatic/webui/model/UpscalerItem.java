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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpscalerItem
 */
@JsonPropertyOrder({
  UpscalerItem.JSON_PROPERTY_NAME,
  UpscalerItem.JSON_PROPERTY_MODEL_NAME,
  UpscalerItem.JSON_PROPERTY_MODEL_PATH,
  UpscalerItem.JSON_PROPERTY_MODEL_URL,
  UpscalerItem.JSON_PROPERTY_SCALE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-27T02:28:26.857180667+03:00[Europe/Moscow]")
public class UpscalerItem {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MODEL_NAME = "model_name";
  private String modelName;

  public static final String JSON_PROPERTY_MODEL_PATH = "model_path";
  private String modelPath;

  public static final String JSON_PROPERTY_MODEL_URL = "model_url";
  private String modelUrl;

  public static final String JSON_PROPERTY_SCALE = "scale";
  private BigDecimal scale;

  public UpscalerItem() {
  }

  public UpscalerItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public UpscalerItem modelName(String modelName) {
    
    this.modelName = modelName;
    return this;
  }

   /**
   * Get modelName
   * @return modelName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModelName() {
    return modelName;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModelName(String modelName) {
    this.modelName = modelName;
  }


  public UpscalerItem modelPath(String modelPath) {
    
    this.modelPath = modelPath;
    return this;
  }

   /**
   * Get modelPath
   * @return modelPath
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModelPath() {
    return modelPath;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModelPath(String modelPath) {
    this.modelPath = modelPath;
  }


  public UpscalerItem modelUrl(String modelUrl) {
    
    this.modelUrl = modelUrl;
    return this;
  }

   /**
   * Get modelUrl
   * @return modelUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModelUrl() {
    return modelUrl;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModelUrl(String modelUrl) {
    this.modelUrl = modelUrl;
  }


  public UpscalerItem scale(BigDecimal scale) {
    
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getScale() {
    return scale;
  }


  @JsonProperty(JSON_PROPERTY_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScale(BigDecimal scale) {
    this.scale = scale;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpscalerItem upscalerItem = (UpscalerItem) o;
    return Objects.equals(this.name, upscalerItem.name) &&
        Objects.equals(this.modelName, upscalerItem.modelName) &&
        Objects.equals(this.modelPath, upscalerItem.modelPath) &&
        Objects.equals(this.modelUrl, upscalerItem.modelUrl) &&
        Objects.equals(this.scale, upscalerItem.scale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, modelName, modelPath, modelUrl, scale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpscalerItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelPath: ").append(toIndentedString(modelPath)).append("\n");
    sb.append("    modelUrl: ").append(toIndentedString(modelUrl)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
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


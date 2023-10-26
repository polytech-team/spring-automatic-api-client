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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TextToImageResponse
 */
@JsonPropertyOrder({
  TextToImageResponse.JSON_PROPERTY_IMAGES,
  TextToImageResponse.JSON_PROPERTY_PARAMETERS,
  TextToImageResponse.JSON_PROPERTY_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-27T01:31:55.639766089+03:00[Europe/Moscow]")
public class TextToImageResponse {
  public static final String JSON_PROPERTY_IMAGES = "images";
  private List<String> images;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private Object parameters;

  public static final String JSON_PROPERTY_INFO = "info";
  private String info;

  public TextToImageResponse() {
  }

  public TextToImageResponse images(List<String> images) {
    
    this.images = images;
    return this;
  }

  public TextToImageResponse addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * The generated image in base64 format.
   * @return images
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getImages() {
    return images;
  }


  @JsonProperty(JSON_PROPERTY_IMAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImages(List<String> images) {
    this.images = images;
  }


  public TextToImageResponse parameters(Object parameters) {
    
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getParameters() {
    return parameters;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParameters(Object parameters) {
    this.parameters = parameters;
  }


  public TextToImageResponse info(String info) {
    
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInfo() {
    return info;
  }


  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInfo(String info) {
    this.info = info;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextToImageResponse textToImageResponse = (TextToImageResponse) o;
    return Objects.equals(this.images, textToImageResponse.images) &&
        Objects.equals(this.parameters, textToImageResponse.parameters) &&
        Objects.equals(this.info, textToImageResponse.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, parameters, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextToImageResponse {\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

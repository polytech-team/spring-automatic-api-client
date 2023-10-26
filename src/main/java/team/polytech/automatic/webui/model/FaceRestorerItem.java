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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FaceRestorerItem
 */
@JsonPropertyOrder({
  FaceRestorerItem.JSON_PROPERTY_NAME,
  FaceRestorerItem.JSON_PROPERTY_CMD_DIR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-27T01:31:55.639766089+03:00[Europe/Moscow]")
public class FaceRestorerItem {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CMD_DIR = "cmd_dir";
  private String cmdDir;

  public FaceRestorerItem() {
  }

  public FaceRestorerItem name(String name) {
    
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


  public FaceRestorerItem cmdDir(String cmdDir) {
    
    this.cmdDir = cmdDir;
    return this;
  }

   /**
   * Get cmdDir
   * @return cmdDir
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CMD_DIR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCmdDir() {
    return cmdDir;
  }


  @JsonProperty(JSON_PROPERTY_CMD_DIR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCmdDir(String cmdDir) {
    this.cmdDir = cmdDir;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceRestorerItem faceRestorerItem = (FaceRestorerItem) o;
    return Objects.equals(this.name, faceRestorerItem.name) &&
        Objects.equals(this.cmdDir, faceRestorerItem.cmdDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, cmdDir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceRestorerItem {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cmdDir: ").append(toIndentedString(cmdDir)).append("\n");
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

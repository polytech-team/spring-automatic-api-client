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
import org.openapitools.jackson.nullable.JsonNullable;
import team.polytech.automatic.webui.model.Request;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PredictBody
 */
@JsonPropertyOrder({
  PredictBody.JSON_PROPERTY_SESSION_HASH,
  PredictBody.JSON_PROPERTY_EVENT_ID,
  PredictBody.JSON_PROPERTY_DATA,
  PredictBody.JSON_PROPERTY_EVENT_DATA,
  PredictBody.JSON_PROPERTY_FN_INDEX,
  PredictBody.JSON_PROPERTY_BATCHED,
  PredictBody.JSON_PROPERTY_REQUEST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-27T02:28:26.857180667+03:00[Europe/Moscow]")
public class PredictBody {
  public static final String JSON_PROPERTY_SESSION_HASH = "session_hash";
  private String sessionHash;

  public static final String JSON_PROPERTY_EVENT_ID = "event_id";
  private String eventId;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<Object> data = new ArrayList<>();

  public static final String JSON_PROPERTY_EVENT_DATA = "event_data";
  private JsonNullable<Object> eventData = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_FN_INDEX = "fn_index";
  private Integer fnIndex;

  public static final String JSON_PROPERTY_BATCHED = "batched";
  private Boolean batched = false;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private Request request;

  public PredictBody() {
  }

  public PredictBody sessionHash(String sessionHash) {
    
    this.sessionHash = sessionHash;
    return this;
  }

   /**
   * Get sessionHash
   * @return sessionHash
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSessionHash() {
    return sessionHash;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionHash(String sessionHash) {
    this.sessionHash = sessionHash;
  }


  public PredictBody eventId(String eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventId() {
    return eventId;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public PredictBody data(List<Object> data) {
    
    this.data = data;
    return this;
  }

  public PredictBody addDataItem(Object dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Object> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(List<Object> data) {
    this.data = data;
  }


  public PredictBody eventData(Object eventData) {
    this.eventData = JsonNullable.<Object>of(eventData);
    
    return this;
  }

   /**
   * Get eventData
   * @return eventData
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEventData() {
        return eventData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEventData_JsonNullable() {
    return eventData;
  }
  
  @JsonProperty(JSON_PROPERTY_EVENT_DATA)
  public void setEventData_JsonNullable(JsonNullable<Object> eventData) {
    this.eventData = eventData;
  }

  public void setEventData(Object eventData) {
    this.eventData = JsonNullable.<Object>of(eventData);
  }


  public PredictBody fnIndex(Integer fnIndex) {
    
    this.fnIndex = fnIndex;
    return this;
  }

   /**
   * Get fnIndex
   * @return fnIndex
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FN_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFnIndex() {
    return fnIndex;
  }


  @JsonProperty(JSON_PROPERTY_FN_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFnIndex(Integer fnIndex) {
    this.fnIndex = fnIndex;
  }


  public PredictBody batched(Boolean batched) {
    
    this.batched = batched;
    return this;
  }

   /**
   * Get batched
   * @return batched
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBatched() {
    return batched;
  }


  @JsonProperty(JSON_PROPERTY_BATCHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatched(Boolean batched) {
    this.batched = batched;
  }


  public PredictBody request(Request request) {
    
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Request getRequest() {
    return request;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequest(Request request) {
    this.request = request;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictBody predictBody = (PredictBody) o;
    return Objects.equals(this.sessionHash, predictBody.sessionHash) &&
        Objects.equals(this.eventId, predictBody.eventId) &&
        Objects.equals(this.data, predictBody.data) &&
        equalsNullable(this.eventData, predictBody.eventData) &&
        Objects.equals(this.fnIndex, predictBody.fnIndex) &&
        Objects.equals(this.batched, predictBody.batched) &&
        Objects.equals(this.request, predictBody.request);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionHash, eventId, data, hashCodeNullable(eventData), fnIndex, batched, request);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictBody {\n");
    sb.append("    sessionHash: ").append(toIndentedString(sessionHash)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
    sb.append("    fnIndex: ").append(toIndentedString(fnIndex)).append("\n");
    sb.append("    batched: ").append(toIndentedString(batched)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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


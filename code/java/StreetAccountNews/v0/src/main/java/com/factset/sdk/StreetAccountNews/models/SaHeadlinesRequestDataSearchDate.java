/*
 * StreetAccount API
 * Collection of endpoints for retrieving StreetAccount headlines and filters
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StreetAccountNews.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StreetAccountNews.JSON;


/**
 * SaHeadlinesRequestDataSearchDate
 */
@JsonPropertyOrder({
  SaHeadlinesRequestDataSearchDate.JSON_PROPERTY_START,
  SaHeadlinesRequestDataSearchDate.JSON_PROPERTY_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SaHeadlinesRequestDataSearchDate implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public static final String JSON_PROPERTY_END = "end";
  private String end;

  public SaHeadlinesRequestDataSearchDate() { 
  }

  public SaHeadlinesRequestDataSearchDate start(String start) {
    this.start = start;
    return this;
  }

   /**
   * Start time for custom search. startTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm]
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-08-21T12:35:45Z", value = "Start time for custom search. startTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm]")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(String start) {
    this.start = start;
  }


  public SaHeadlinesRequestDataSearchDate end(String end) {
    this.end = end;
    return this;
  }

   /**
   * End time for custom search. If end time is not present end time is automatically set to the time of the search. endTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm]
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-08-29T08:10:30Z", value = "End time for custom search. If end time is not present end time is automatically set to the time of the search. endTime must follow the ISO 8601 standard format, YYYY-MM-DDTHH:mm:ssZ (UTC). It also supports offsets ±[hh]:[mm]")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(String end) {
    this.end = end;
  }


  /**
   * Return true if this saHeadlinesRequest_data_searchDate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaHeadlinesRequestDataSearchDate saHeadlinesRequestDataSearchDate = (SaHeadlinesRequestDataSearchDate) o;
    return Objects.equals(this.start, saHeadlinesRequestDataSearchDate.start) &&
        Objects.equals(this.end, saHeadlinesRequestDataSearchDate.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaHeadlinesRequestDataSearchDate {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

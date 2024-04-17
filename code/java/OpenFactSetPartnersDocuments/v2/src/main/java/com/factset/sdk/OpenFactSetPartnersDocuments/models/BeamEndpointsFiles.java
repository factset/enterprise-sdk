/*
 * Open:FactSet - Partners
 * This service provides the capability to search and download unstructured content provided by <a href=\"https://open.factset.com/catalog/en-us\">Open:FactSet Partners</a>.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenFactSetPartnersDocuments.models;

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
import com.factset.sdk.OpenFactSetPartnersDocuments.JSON;


/**
 * Returns Beam Endpoints Response
 */
@ApiModel(description = "Returns Beam Endpoints Response")
@JsonPropertyOrder({
  BeamEndpointsFiles.JSON_PROPERTY_NAME,
  BeamEndpointsFiles.JSON_PROPERTY_FILE_NAME,
  BeamEndpointsFiles.JSON_PROPERTY_CLINICAL_TRIAL_ID,
  BeamEndpointsFiles.JSON_PROPERTY_FULL_FORM,
  BeamEndpointsFiles.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class BeamEndpointsFiles implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_CLINICAL_TRIAL_ID = "clinicalTrialId";
  private String clinicalTrialId;

  public static final String JSON_PROPERTY_FULL_FORM = "fullForm";
  private String fullForm;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public BeamEndpointsFiles() { 
  }

  public BeamEndpointsFiles name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Cleaned and standardized abbreviations of primary endpoints that are common or of key interest
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "OS", value = "Cleaned and standardized abbreviations of primary endpoints that are common or of key interest")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public BeamEndpointsFiles fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The filename of the trial data
   * @return fileName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "NCT02126371_002.json", value = "The filename of the trial data")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public BeamEndpointsFiles clinicalTrialId(String clinicalTrialId) {
    this.clinicalTrialId = clinicalTrialId;
    return this;
  }

   /**
   * Specifies OZMOSI unique ID for each historical version of a trial
   * @return clinicalTrialId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "NCT02126371_005", value = "Specifies OZMOSI unique ID for each historical version of a trial")
  @JsonProperty(JSON_PROPERTY_CLINICAL_TRIAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClinicalTrialId() {
    return clinicalTrialId;
  }


  @JsonProperty(JSON_PROPERTY_CLINICAL_TRIAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClinicalTrialId(String clinicalTrialId) {
    this.clinicalTrialId = clinicalTrialId;
  }


  public BeamEndpointsFiles fullForm(String fullForm) {
    this.fullForm = fullForm;
    return this;
  }

   /**
   * Cleaned and standardized full names of primary endpoints that are common or of key interest
   * @return fullForm
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Area Under The Curve", value = "Cleaned and standardized full names of primary endpoints that are common or of key interest")
  @JsonProperty(JSON_PROPERTY_FULL_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullForm() {
    return fullForm;
  }


  @JsonProperty(JSON_PROPERTY_FULL_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullForm(String fullForm) {
    this.fullForm = fullForm;
  }


  public BeamEndpointsFiles url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Download link for the clinical trials provided by the Ozmosi feed
   * @return url
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://fdss3-unstructured-data-delivery-ozmosi-prod.s3.amazonaws.com/ozmosi_v2/NCT02126371_005.json?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIA6B6XG7VEYODKETS6%2F20221017%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20221017T132236Z&X-Amz-Expires=1800&X-Amz-SignedHeaders=host&X-Amz-Security-Token=IQoJb3JpZ2luX2VjED0aCXVzLWVhc3QtMSJIMEYCIQDzGmRWCkwvfl8WKsZ3rektfXyQa551ht8wkggj29qufwIhALaFsXrpyISV%2B6A3hASCdStEUtlzUEaBL9Bs0%2BSP3wUaKu4CCBYQARoMOTY2MjgyMTE2NDI1IgxkKPBJ4cINLlvTEkIqywKmD%2BMhpGDpCzI8LfS13Rvs%2FnCQ5S5khGdpMUk8j0kQ4%2F6xoX7SYyXjkn8VFk2OSJkfPpu6XBADJ3H6BmuJvAM5ovraQqQXjx8iuB7LPgYAHoIJNvZDivb8HV%2BmBSwbEoOyCIslX%2FFrlYNU6KmfpvKUZqJRPmpSVdb%2F2%2BwG6rw3WHO6qBxWjwPga2b9U7DvU0LCke0myB8cRhdimWuONNendFNuwm9KnvhrUbszsLT4dIxufiYQarCqQvx0FuMG21%2FPTKWXbpvHbSSG663qqBi2xYmIP%2BmvQ9JvZMkWN%2FOtVhkDqT8YcyaaLshDVv0xDvzdsP6h4YYjDohaABooNIuP1OVJ9fzzUe4F4ZlP5eZDAKKCPOU%2FfG9UitWHxm3feQDe460sVVbiGow7is85fhQsoeHQEfqqLifPXwxo2s72bwaxd2ZJOTYh7ra7MJeTtZoGOp0BJqQMDoOIol1WSTKBI02ne6rUGKfvR6ksj%2BjEQR9OURvMj843tnJketh6IUBNG%2Be0q7Y0YcV2AAKj1Q7nloa%2B6LoRFOyvKwy4SAfNh%2F1KGM8%2F%2FitZfxzOAwI%2BtlEPKuHWL3OWAyusy6VSXaw4PYtJrS9lual9O%2Brz3kK2au4JZnkeZH3KJsIefE4tJ2GcL%2FT3IOt7htI%2BGRZZDGNCHQ%3D%3D&X-Amz-Signature=9422d5ecb1460cedb3fb21ace5ee152ec4eacfc6d2fcd96f433c1b91e6d93dfa", value = "Download link for the clinical trials provided by the Ozmosi feed")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this BeamEndpointsFiles object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeamEndpointsFiles beamEndpointsFiles = (BeamEndpointsFiles) o;
    return Objects.equals(this.name, beamEndpointsFiles.name) &&
        Objects.equals(this.fileName, beamEndpointsFiles.fileName) &&
        Objects.equals(this.clinicalTrialId, beamEndpointsFiles.clinicalTrialId) &&
        Objects.equals(this.fullForm, beamEndpointsFiles.fullForm) &&
        Objects.equals(this.url, beamEndpointsFiles.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fileName, clinicalTrialId, fullForm, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeamEndpointsFiles {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    clinicalTrialId: ").append(toIndentedString(clinicalTrialId)).append("\n");
    sb.append("    fullForm: ").append(toIndentedString(fullForm)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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


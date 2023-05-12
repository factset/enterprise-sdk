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
 * Returns Biomarkers Response
 */
@ApiModel(description = "Returns Biomarkers Response")
@JsonPropertyOrder({
  BiomarkersFiles.JSON_PROPERTY_ORGAN,
  BiomarkersFiles.JSON_PROPERTY_FILE_NAME,
  BiomarkersFiles.JSON_PROPERTY_CLINICAL_TRIAL_ID,
  BiomarkersFiles.JSON_PROPERTY_BIOMARKER_NAME,
  BiomarkersFiles.JSON_PROPERTY_BIOMARKER_FULL_NAME,
  BiomarkersFiles.JSON_PROPERTY_BIOMARKER_TYPE,
  BiomarkersFiles.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BiomarkersFiles implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ORGAN = "organ";
  private String organ;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_CLINICAL_TRIAL_ID = "clinicalTrialId";
  private String clinicalTrialId;

  public static final String JSON_PROPERTY_BIOMARKER_NAME = "biomarkerName";
  private String biomarkerName;

  public static final String JSON_PROPERTY_BIOMARKER_FULL_NAME = "biomarkerFullName";
  private String biomarkerFullName;

  public static final String JSON_PROPERTY_BIOMARKER_TYPE = "biomarkerType";
  private String biomarkerType;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public BiomarkersFiles() { 
  }

  public BiomarkersFiles organ(String organ) {
    this.organ = organ;
    return this;
  }

   /**
   * Related organ where applicable.
   * @return organ
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Lung", value = "Related organ where applicable.")
  @JsonProperty(JSON_PROPERTY_ORGAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrgan() {
    return organ;
  }


  @JsonProperty(JSON_PROPERTY_ORGAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrgan(String organ) {
    this.organ = organ;
  }


  public BiomarkersFiles fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The filename of the trial data.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NCT00845832_036.json", value = "The filename of the trial data.")
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


  public BiomarkersFiles clinicalTrialId(String clinicalTrialId) {
    this.clinicalTrialId = clinicalTrialId;
    return this;
  }

   /**
   * Specifies Ozmosi unique ID for each historical version of a trial.
   * @return clinicalTrialId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NCT00845832_036", value = "Specifies Ozmosi unique ID for each historical version of a trial.")
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


  public BiomarkersFiles biomarkerName(String biomarkerName) {
    this.biomarkerName = biomarkerName;
    return this;
  }

   /**
   * Abbreviated name of any patient biomarkers being targeted for research in the trial.
   * @return biomarkerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TNF", value = "Abbreviated name of any patient biomarkers being targeted for research in the trial.")
  @JsonProperty(JSON_PROPERTY_BIOMARKER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBiomarkerName() {
    return biomarkerName;
  }


  @JsonProperty(JSON_PROPERTY_BIOMARKER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiomarkerName(String biomarkerName) {
    this.biomarkerName = biomarkerName;
  }


  public BiomarkersFiles biomarkerFullName(String biomarkerFullName) {
    this.biomarkerFullName = biomarkerFullName;
    return this;
  }

   /**
   * Full name of the biomarker.
   * @return biomarkerFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tumor necrosis factor", value = "Full name of the biomarker.")
  @JsonProperty(JSON_PROPERTY_BIOMARKER_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBiomarkerFullName() {
    return biomarkerFullName;
  }


  @JsonProperty(JSON_PROPERTY_BIOMARKER_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiomarkerFullName(String biomarkerFullName) {
    this.biomarkerFullName = biomarkerFullName;
  }


  public BiomarkersFiles biomarkerType(String biomarkerType) {
    this.biomarkerType = biomarkerType;
    return this;
  }

   /**
   * Defines the Biomarker type.
   * @return biomarkerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Protein", value = "Defines the Biomarker type.")
  @JsonProperty(JSON_PROPERTY_BIOMARKER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBiomarkerType() {
    return biomarkerType;
  }


  @JsonProperty(JSON_PROPERTY_BIOMARKER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiomarkerType(String biomarkerType) {
    this.biomarkerType = biomarkerType;
  }


  public BiomarkersFiles url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Download link for the clinical trials provided by the Ozmosi feed.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://fdss3-unstructured-data-delivery-ozmosi-prod.s3.amazonaws.com/ozmosi_v2/NCT00845832_036.json?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIA6B6XG7VEYODKETS6%2F20221017%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20221017T132642Z&X-Amz-Expires=1800&X-Amz-SignedHeaders=host&X-Amz-Security-Token=IQoJb3JpZ2luX2VjED0aCXVzLWVhc3QtMSJIMEYCIQDzGmRWCkwvfl8WKsZ3rektfXyQa551ht8wkggj29qufwIhALaFsXrpyISV%2B6A3hASCdStEUtlzUEaBL9Bs0%2BSP3wUaKu4CCBYQARoMOTY2MjgyMTE2NDI1IgxkKPBJ4cINLlvTEkIqywKmD%2BMhpGDpCzI8LfS13Rvs%2FnCQ5S5khGdpMUk8j0kQ4%2F6xoX7SYyXjkn8VFk2OSJkfPpu6XBADJ3H6BmuJvAM5ovraQqQXjx8iuB7LPgYAHoIJNvZDivb8HV%2BmBSwbEoOyCIslX%2FFrlYNU6KmfpvKUZqJRPmpSVdb%2F2%2BwG6rw3WHO6qBxWjwPga2b9U7DvU0LCke0myB8cRhdimWuONNendFNuwm9KnvhrUbszsLT4dIxufiYQarCqQvx0FuMG21%2FPTKWXbpvHbSSG663qqBi2xYmIP%2BmvQ9JvZMkWN%2FOtVhkDqT8YcyaaLshDVv0xDvzdsP6h4YYjDohaABooNIuP1OVJ9fzzUe4F4ZlP5eZDAKKCPOU%2FfG9UitWHxm3feQDe460sVVbiGow7is85fhQsoeHQEfqqLifPXwxo2s72bwaxd2ZJOTYh7ra7MJeTtZoGOp0BJqQMDoOIol1WSTKBI02ne6rUGKfvR6ksj%2BjEQR9OURvMj843tnJketh6IUBNG%2Be0q7Y0YcV2AAKj1Q7nloa%2B6LoRFOyvKwy4SAfNh%2F1KGM8%2F%2FitZfxzOAwI%2BtlEPKuHWL3OWAyusy6VSXaw4PYtJrS9lual9O%2Brz3kK2au4JZnkeZH3KJsIefE4tJ2GcL%2FT3IOt7htI%2BGRZZDGNCHQ%3D%3D&X-Amz-Signature=8e8ac7c3616ed9ebfb8b08f70579caf68f347670438ee41df0cfde369e1e0ee9", value = "Download link for the clinical trials provided by the Ozmosi feed.")
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
   * Return true if this BiomarkersFiles object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiomarkersFiles biomarkersFiles = (BiomarkersFiles) o;
    return Objects.equals(this.organ, biomarkersFiles.organ) &&
        Objects.equals(this.fileName, biomarkersFiles.fileName) &&
        Objects.equals(this.clinicalTrialId, biomarkersFiles.clinicalTrialId) &&
        Objects.equals(this.biomarkerName, biomarkersFiles.biomarkerName) &&
        Objects.equals(this.biomarkerFullName, biomarkersFiles.biomarkerFullName) &&
        Objects.equals(this.biomarkerType, biomarkersFiles.biomarkerType) &&
        Objects.equals(this.url, biomarkersFiles.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organ, fileName, clinicalTrialId, biomarkerName, biomarkerFullName, biomarkerType, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiomarkersFiles {\n");
    sb.append("    organ: ").append(toIndentedString(organ)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    clinicalTrialId: ").append(toIndentedString(clinicalTrialId)).append("\n");
    sb.append("    biomarkerName: ").append(toIndentedString(biomarkerName)).append("\n");
    sb.append("    biomarkerFullName: ").append(toIndentedString(biomarkerFullName)).append("\n");
    sb.append("    biomarkerType: ").append(toIndentedString(biomarkerType)).append("\n");
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

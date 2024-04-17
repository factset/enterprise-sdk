/*
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetGlobalPrices.models;

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
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetGlobalPrices.JSON;


/**
 * SharesOutstandingResponseObject
 */
@JsonPropertyOrder({
  SharesOutstandingResponseObject.JSON_PROPERTY_FSYM_ID,
  SharesOutstandingResponseObject.JSON_PROPERTY_DATE,
  SharesOutstandingResponseObject.JSON_PROPERTY_DOCUMENT_ID,
  SharesOutstandingResponseObject.JSON_PROPERTY_REQUEST_ID,
  SharesOutstandingResponseObject.JSON_PROPERTY_REPORT_DATE,
  SharesOutstandingResponseObject.JSON_PROPERTY_PUBLICATION_DATE,
  SharesOutstandingResponseObject.JSON_PROPERTY_FISCAL_YEAR,
  SharesOutstandingResponseObject.JSON_PROPERTY_REPORTING_PERIOD_DESCRIPTION,
  SharesOutstandingResponseObject.JSON_PROPERTY_REPORTING_PERIOD,
  SharesOutstandingResponseObject.JSON_PROPERTY_DESCRIPTION,
  SharesOutstandingResponseObject.JSON_PROPERTY_ADR_DESCRIPTION,
  SharesOutstandingResponseObject.JSON_PROPERTY_ADR_RATIO,
  SharesOutstandingResponseObject.JSON_PROPERTY_ADR_FSYM_ID,
  SharesOutstandingResponseObject.JSON_PROPERTY_TOTAL_OUTSTANDING,
  SharesOutstandingResponseObject.JSON_PROPERTY_ADR_TOTAL_OUTSTANDING
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SharesOutstandingResponseObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<LocalDate> date = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_DOCUMENT_ID = "documentId";
  private JsonNullable<String> documentId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private JsonNullable<String> requestId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REPORT_DATE = "reportDate";
  private JsonNullable<LocalDate> reportDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_PUBLICATION_DATE = "publicationDate";
  private JsonNullable<LocalDate> publicationDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_FISCAL_YEAR = "fiscalYear";
  private JsonNullable<Integer> fiscalYear = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_REPORTING_PERIOD_DESCRIPTION = "reportingPeriodDescription";
  private JsonNullable<String> reportingPeriodDescription = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REPORTING_PERIOD = "reportingPeriod";
  private JsonNullable<Integer> reportingPeriod = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ADR_DESCRIPTION = "adrDescription";
  private JsonNullable<String> adrDescription = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ADR_RATIO = "adrRatio";
  private JsonNullable<BigDecimal> adrRatio = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_ADR_FSYM_ID = "adrFsymId";
  private JsonNullable<String> adrFsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TOTAL_OUTSTANDING = "totalOutstanding";
  private JsonNullable<BigDecimal> totalOutstanding = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_ADR_TOTAL_OUTSTANDING = "adrTotalOutstanding";
  private JsonNullable<BigDecimal> adrTotalOutstanding = JsonNullable.<BigDecimal>undefined();

  public SharesOutstandingResponseObject() { 
  }

  public SharesOutstandingResponseObject fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * Security-level FactSet Permanent Identifier associated with the identifier.
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "C6J726-S", value = "Security-level FactSet Permanent Identifier associated with the identifier.")
  @JsonIgnore

  public String getFsymId() {
        return fsymId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFsymId_JsonNullable() {
    return fsymId;
  }
  
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  public void setFsymId_JsonNullable(JsonNullable<String> fsymId) {
    this.fsymId = fsymId;
  }

  public void setFsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
  }


  public SharesOutstandingResponseObject date(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
    return this;
  }

   /**
   * Date of the record in YYYY-MM-DD format.
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Wed Aug 10 00:00:00 UTC 2022", value = "Date of the record in YYYY-MM-DD format.")
  @JsonIgnore

  public LocalDate getDate() {
        return date.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getDate_JsonNullable() {
    return date;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE)
  public void setDate_JsonNullable(JsonNullable<LocalDate> date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
  }


  public SharesOutstandingResponseObject documentId(String documentId) {
    this.documentId = JsonNullable.<String>of(documentId);
    return this;
  }

   /**
   * Unique Identifier for each document or filing which contains the outstanding shares position.
   * @return documentId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "956881", value = "Unique Identifier for each document or filing which contains the outstanding shares position.")
  @JsonIgnore

  public String getDocumentId() {
        return documentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDocumentId_JsonNullable() {
    return documentId;
  }
  
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  public void setDocumentId_JsonNullable(JsonNullable<String> documentId) {
    this.documentId = documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = JsonNullable.<String>of(documentId);
  }


  public SharesOutstandingResponseObject requestId(String requestId) {
    this.requestId = JsonNullable.<String>of(requestId);
    return this;
  }

   /**
   * FactSet Security Permanent Identifier that was used for the request.
   * @return requestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "C6J726-S", value = "FactSet Security Permanent Identifier that was used for the request.")
  @JsonIgnore

  public String getRequestId() {
        return requestId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRequestId_JsonNullable() {
    return requestId;
  }
  
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  public void setRequestId_JsonNullable(JsonNullable<String> requestId) {
    this.requestId = requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = JsonNullable.<String>of(requestId);
  }


  public SharesOutstandingResponseObject reportDate(LocalDate reportDate) {
    this.reportDate = JsonNullable.<LocalDate>of(reportDate);
    return this;
  }

   /**
   * Reporting date of the position.
   * @return reportDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Tue Aug 02 00:00:00 UTC 2022", value = "Reporting date of the position.")
  @JsonIgnore

  public LocalDate getReportDate() {
        return reportDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getReportDate_JsonNullable() {
    return reportDate;
  }
  
  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  public void setReportDate_JsonNullable(JsonNullable<LocalDate> reportDate) {
    this.reportDate = reportDate;
  }

  public void setReportDate(LocalDate reportDate) {
    this.reportDate = JsonNullable.<LocalDate>of(reportDate);
  }


  public SharesOutstandingResponseObject publicationDate(LocalDate publicationDate) {
    this.publicationDate = JsonNullable.<LocalDate>of(publicationDate);
    return this;
  }

   /**
   * Exact date that results have been communicated to the market.
   * @return publicationDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Thu Aug 04 00:00:00 UTC 2022", value = "Exact date that results have been communicated to the market.")
  @JsonIgnore

  public LocalDate getPublicationDate() {
        return publicationDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PUBLICATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getPublicationDate_JsonNullable() {
    return publicationDate;
  }
  
  @JsonProperty(JSON_PROPERTY_PUBLICATION_DATE)
  public void setPublicationDate_JsonNullable(JsonNullable<LocalDate> publicationDate) {
    this.publicationDate = publicationDate;
  }

  public void setPublicationDate(LocalDate publicationDate) {
    this.publicationDate = JsonNullable.<LocalDate>of(publicationDate);
  }


  public SharesOutstandingResponseObject fiscalYear(Integer fiscalYear) {
    this.fiscalYear = JsonNullable.<Integer>of(fiscalYear);
    return this;
  }

   /**
   * The company&#39;s fiscal year corresponding to the report.
   * @return fiscalYear
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022", value = "The company's fiscal year corresponding to the report.")
  @JsonIgnore

  public Integer getFiscalYear() {
        return fiscalYear.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getFiscalYear_JsonNullable() {
    return fiscalYear;
  }
  
  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  public void setFiscalYear_JsonNullable(JsonNullable<Integer> fiscalYear) {
    this.fiscalYear = fiscalYear;
  }

  public void setFiscalYear(Integer fiscalYear) {
    this.fiscalYear = JsonNullable.<Integer>of(fiscalYear);
  }


  public SharesOutstandingResponseObject reportingPeriodDescription(String reportingPeriodDescription) {
    this.reportingPeriodDescription = JsonNullable.<String>of(reportingPeriodDescription);
    return this;
  }

   /**
   * Textual description of the reporting period.
   * @return reportingPeriodDescription
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2nd Quarter", value = "Textual description of the reporting period.")
  @JsonIgnore

  public String getReportingPeriodDescription() {
        return reportingPeriodDescription.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPORTING_PERIOD_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReportingPeriodDescription_JsonNullable() {
    return reportingPeriodDescription;
  }
  
  @JsonProperty(JSON_PROPERTY_REPORTING_PERIOD_DESCRIPTION)
  public void setReportingPeriodDescription_JsonNullable(JsonNullable<String> reportingPeriodDescription) {
    this.reportingPeriodDescription = reportingPeriodDescription;
  }

  public void setReportingPeriodDescription(String reportingPeriodDescription) {
    this.reportingPeriodDescription = JsonNullable.<String>of(reportingPeriodDescription);
  }


  public SharesOutstandingResponseObject reportingPeriod(Integer reportingPeriod) {
    this.reportingPeriod = JsonNullable.<Integer>of(reportingPeriod);
    return this;
  }

   /**
   * Code representing the unique reporting period. Options are as follows: - 1 - 1st Quarter - 2 - 2nd Quarter - 3 - 3rd Quarter - 4 - 4th Quarter - 6 - Mid-Year 
   * @return reportingPeriod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Code representing the unique reporting period. Options are as follows: - 1 - 1st Quarter - 2 - 2nd Quarter - 3 - 3rd Quarter - 4 - 4th Quarter - 6 - Mid-Year ")
  @JsonIgnore

  public Integer getReportingPeriod() {
        return reportingPeriod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REPORTING_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getReportingPeriod_JsonNullable() {
    return reportingPeriod;
  }
  
  @JsonProperty(JSON_PROPERTY_REPORTING_PERIOD)
  public void setReportingPeriod_JsonNullable(JsonNullable<Integer> reportingPeriod) {
    this.reportingPeriod = reportingPeriod;
  }

  public void setReportingPeriod(Integer reportingPeriod) {
    this.reportingPeriod = JsonNullable.<Integer>of(reportingPeriod);
  }


  public SharesOutstandingResponseObject description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Different stock types based on the rights and benefits from ownership.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Class A Shares", value = "Different stock types based on the rights and benefits from ownership.")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public SharesOutstandingResponseObject adrDescription(String adrDescription) {
    this.adrDescription = JsonNullable.<String>of(adrDescription);
    return this;
  }

   /**
   * Different stock types based on the rights and benefits from ownership for the ADR.
   * @return adrDescription
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Class A Shares", value = "Different stock types based on the rights and benefits from ownership for the ADR.")
  @JsonIgnore

  public String getAdrDescription() {
        return adrDescription.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAdrDescription_JsonNullable() {
    return adrDescription;
  }
  
  @JsonProperty(JSON_PROPERTY_ADR_DESCRIPTION)
  public void setAdrDescription_JsonNullable(JsonNullable<String> adrDescription) {
    this.adrDescription = adrDescription;
  }

  public void setAdrDescription(String adrDescription) {
    this.adrDescription = JsonNullable.<String>of(adrDescription);
  }


  public SharesOutstandingResponseObject adrRatio(BigDecimal adrRatio) {
    this.adrRatio = JsonNullable.<BigDecimal>of(adrRatio);
    return this;
  }

   /**
   * Number of common or ordinary shares that are equivalent to one American Depositary Receipt (ADR).
   * @return adrRatio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.5", value = "Number of common or ordinary shares that are equivalent to one American Depositary Receipt (ADR).")
  @JsonIgnore

  public BigDecimal getAdrRatio() {
        return adrRatio.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADR_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getAdrRatio_JsonNullable() {
    return adrRatio;
  }
  
  @JsonProperty(JSON_PROPERTY_ADR_RATIO)
  public void setAdrRatio_JsonNullable(JsonNullable<BigDecimal> adrRatio) {
    this.adrRatio = adrRatio;
  }

  public void setAdrRatio(BigDecimal adrRatio) {
    this.adrRatio = JsonNullable.<BigDecimal>of(adrRatio);
  }


  public SharesOutstandingResponseObject adrFsymId(String adrFsymId) {
    this.adrFsymId = JsonNullable.<String>of(adrFsymId);
    return this;
  }

   /**
   * Unique FactSet generated identifier assigned to a security, representing the ADR security.
   * @return adrFsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "V9GGRZ-S", value = "Unique FactSet generated identifier assigned to a security, representing the ADR security.")
  @JsonIgnore

  public String getAdrFsymId() {
        return adrFsymId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADR_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAdrFsymId_JsonNullable() {
    return adrFsymId;
  }
  
  @JsonProperty(JSON_PROPERTY_ADR_FSYM_ID)
  public void setAdrFsymId_JsonNullable(JsonNullable<String> adrFsymId) {
    this.adrFsymId = adrFsymId;
  }

  public void setAdrFsymId(String adrFsymId) {
    this.adrFsymId = JsonNullable.<String>of(adrFsymId);
  }


  public SharesOutstandingResponseObject totalOutstanding(BigDecimal totalOutstanding) {
    this.totalOutstanding = JsonNullable.<BigDecimal>of(totalOutstanding);
    return this;
  }

   /**
   * Number of shares outstanding as of &#x60;date&#x60;.
   * @return totalOutstanding
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1351.828", value = "Number of shares outstanding as of `date`.")
  @JsonIgnore

  public BigDecimal getTotalOutstanding() {
        return totalOutstanding.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_OUTSTANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getTotalOutstanding_JsonNullable() {
    return totalOutstanding;
  }
  
  @JsonProperty(JSON_PROPERTY_TOTAL_OUTSTANDING)
  public void setTotalOutstanding_JsonNullable(JsonNullable<BigDecimal> totalOutstanding) {
    this.totalOutstanding = totalOutstanding;
  }

  public void setTotalOutstanding(BigDecimal totalOutstanding) {
    this.totalOutstanding = JsonNullable.<BigDecimal>of(totalOutstanding);
  }


  public SharesOutstandingResponseObject adrTotalOutstanding(BigDecimal adrTotalOutstanding) {
    this.adrTotalOutstanding = JsonNullable.<BigDecimal>of(adrTotalOutstanding);
    return this;
  }

   /**
   * Number of shares outstanding for the ADR as of &#x60;date&#x60;.
   * @return adrTotalOutstanding
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "980.22284", value = "Number of shares outstanding for the ADR as of `date`.")
  @JsonIgnore

  public BigDecimal getAdrTotalOutstanding() {
        return adrTotalOutstanding.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADR_TOTAL_OUTSTANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getAdrTotalOutstanding_JsonNullable() {
    return adrTotalOutstanding;
  }
  
  @JsonProperty(JSON_PROPERTY_ADR_TOTAL_OUTSTANDING)
  public void setAdrTotalOutstanding_JsonNullable(JsonNullable<BigDecimal> adrTotalOutstanding) {
    this.adrTotalOutstanding = adrTotalOutstanding;
  }

  public void setAdrTotalOutstanding(BigDecimal adrTotalOutstanding) {
    this.adrTotalOutstanding = JsonNullable.<BigDecimal>of(adrTotalOutstanding);
  }


  /**
   * Return true if this sharesOutstandingResponseObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharesOutstandingResponseObject sharesOutstandingResponseObject = (SharesOutstandingResponseObject) o;
    return equalsNullable(this.fsymId, sharesOutstandingResponseObject.fsymId) &&
        equalsNullable(this.date, sharesOutstandingResponseObject.date) &&
        equalsNullable(this.documentId, sharesOutstandingResponseObject.documentId) &&
        equalsNullable(this.requestId, sharesOutstandingResponseObject.requestId) &&
        equalsNullable(this.reportDate, sharesOutstandingResponseObject.reportDate) &&
        equalsNullable(this.publicationDate, sharesOutstandingResponseObject.publicationDate) &&
        equalsNullable(this.fiscalYear, sharesOutstandingResponseObject.fiscalYear) &&
        equalsNullable(this.reportingPeriodDescription, sharesOutstandingResponseObject.reportingPeriodDescription) &&
        equalsNullable(this.reportingPeriod, sharesOutstandingResponseObject.reportingPeriod) &&
        equalsNullable(this.description, sharesOutstandingResponseObject.description) &&
        equalsNullable(this.adrDescription, sharesOutstandingResponseObject.adrDescription) &&
        equalsNullable(this.adrRatio, sharesOutstandingResponseObject.adrRatio) &&
        equalsNullable(this.adrFsymId, sharesOutstandingResponseObject.adrFsymId) &&
        equalsNullable(this.totalOutstanding, sharesOutstandingResponseObject.totalOutstanding) &&
        equalsNullable(this.adrTotalOutstanding, sharesOutstandingResponseObject.adrTotalOutstanding);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fsymId), hashCodeNullable(date), hashCodeNullable(documentId), hashCodeNullable(requestId), hashCodeNullable(reportDate), hashCodeNullable(publicationDate), hashCodeNullable(fiscalYear), hashCodeNullable(reportingPeriodDescription), hashCodeNullable(reportingPeriod), hashCodeNullable(description), hashCodeNullable(adrDescription), hashCodeNullable(adrRatio), hashCodeNullable(adrFsymId), hashCodeNullable(totalOutstanding), hashCodeNullable(adrTotalOutstanding));
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
    sb.append("class SharesOutstandingResponseObject {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    reportingPeriodDescription: ").append(toIndentedString(reportingPeriodDescription)).append("\n");
    sb.append("    reportingPeriod: ").append(toIndentedString(reportingPeriod)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    adrDescription: ").append(toIndentedString(adrDescription)).append("\n");
    sb.append("    adrRatio: ").append(toIndentedString(adrRatio)).append("\n");
    sb.append("    adrFsymId: ").append(toIndentedString(adrFsymId)).append("\n");
    sb.append("    totalOutstanding: ").append(toIndentedString(totalOutstanding)).append("\n");
    sb.append("    adrTotalOutstanding: ").append(toIndentedString(adrTotalOutstanding)).append("\n");
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


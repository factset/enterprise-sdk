/*
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 2.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.UniversalScreening.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.UniversalScreening.JSON;


/**
 * Archive-specific parameters
 */
@ApiModel(description = "Archive-specific parameters")
@JsonPropertyOrder({
  ScreenArchiveOFDBParametersDataArchiveOptions.JSON_PROPERTY_ARCHIVE_DATE,
  ScreenArchiveOFDBParametersDataArchiveOptions.JSON_PROPERTY_ARCHIVE_TYPE,
  ScreenArchiveOFDBParametersDataArchiveOptions.JSON_PROPERTY_AUTO_SYMBOL_UPDATES,
  ScreenArchiveOFDBParametersDataArchiveOptions.JSON_PROPERTY_EXISTED,
  ScreenArchiveOFDBParametersDataArchiveOptions.JSON_PROPERTY_FILENAME,
  ScreenArchiveOFDBParametersDataArchiveOptions.JSON_PROPERTY_OVERWRITE_DATA,
  ScreenArchiveOFDBParametersDataArchiveOptions.JSON_PROPERTY_QUICK_COLUMNS,
  ScreenArchiveOFDBParametersDataArchiveOptions.JSON_PROPERTY_SYMBOL_TYPE,
  ScreenArchiveOFDBParametersDataArchiveOptions.JSON_PROPERTY_TIME_SERIES,
  ScreenArchiveOFDBParametersDataArchiveOptions.JSON_PROPERTY_UNSPLIT_HISTORY,
  ScreenArchiveOFDBParametersDataArchiveOptions.JSON_PROPERTY_USE_REPORT_ORDER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ScreenArchiveOFDBParametersDataArchiveOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ARCHIVE_DATE = "archiveDate";
  private JsonNullable<String> archiveDate = JsonNullable.<String>undefined();

  /**
   * Type of archive.\\ &#x60;ofdbSymbols&#x60;: Archives the list of identifiers that passed the screen to an OFDB file.\\ &#x60;ofdb&#x60;: Archives the results of the screen to a time series OFDB. A mapping between Universal Screening and the OFDB must be created and saved in the screen.\\ &#x60;ofdbNts&#x60;: Archives the results of the screen to a non-time series OFDB. A mapping between Universal Screening and the OFDB database must be created and saved in the screen.\\ &#x60;ofdbQuickNts&#x60;: Archives the results of the screen to a non-time series OFDB without requiring a Universal Screening-to-OFDB map. By default, all columns in the screen will be archived to the OFDB. Each column&#39;s parameter reference name will be used as the OFDB field name. Use the &#x60;quickColumns&#x60; property to specify which parameters to archive.
   */
  public enum ArchiveTypeEnum {
    OFDBSYMBOLS("ofdbSymbols"),
    
    OFDB("ofdb"),
    
    OFDBNTS("ofdbNts"),
    
    OFDBQUICKNTS("ofdbQuickNts");

    private String value;

    ArchiveTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ArchiveTypeEnum fromValue(String value) {
      for (ArchiveTypeEnum b : ArchiveTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ARCHIVE_TYPE = "archiveType";
  private ArchiveTypeEnum archiveType;

  public static final String JSON_PROPERTY_AUTO_SYMBOL_UPDATES = "autoSymbolUpdates";
  private Boolean autoSymbolUpdates;

  public static final String JSON_PROPERTY_EXISTED = "existed";
  private Boolean existed;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public static final String JSON_PROPERTY_OVERWRITE_DATA = "overwriteData";
  private Boolean overwriteData;

  public static final String JSON_PROPERTY_QUICK_COLUMNS = "quickColumns";
  private JsonNullable<String> quickColumns = JsonNullable.<String>undefined();

  /**
   * The type of symbol to be saved to the SYMBOL field of the OFDB\\ &#x60;cusip&#x60;: Recommended. Primarily CUSIP for North American listed securities and SEDOL for the rest of the world.\\ &#x60;ticker&#x60;: Should only be used when writing to an existing OFDB that uses Tickers in the symbol column. Primarily Tickers for North American listed securities, QUICK Codes for Japanese listed securities, and SEDOL for the rest of the world. Applicable for equity screen archives.\\ &#x60;isin&#x60;: International Securities Identification Number (ISIN). Applicable for debt screen archives.
   */
  public enum SymbolTypeEnum {
    CUSIP("cusip"),
    
    TICKER("ticker"),
    
    ISIN("isin");

    private String value;

    SymbolTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SymbolTypeEnum fromValue(String value) {
      for (SymbolTypeEnum b : SymbolTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SYMBOL_TYPE = "symbolType";
  private JsonNullable<SymbolTypeEnum> symbolType = JsonNullable.<SymbolTypeEnum>undefined();

  public static final String JSON_PROPERTY_TIME_SERIES = "timeSeries";
  private Boolean timeSeries;

  public static final String JSON_PROPERTY_UNSPLIT_HISTORY = "unsplitHistory";
  private Boolean unsplitHistory;

  public static final String JSON_PROPERTY_USE_REPORT_ORDER = "useReportOrder";
  private Boolean useReportOrder;

  public ScreenArchiveOFDBParametersDataArchiveOptions() { 
  }

  @JsonCreator
  public ScreenArchiveOFDBParametersDataArchiveOptions(
    @JsonProperty(value=JSON_PROPERTY_ARCHIVE_TYPE, required=true) ArchiveTypeEnum archiveType, 
    @JsonProperty(value=JSON_PROPERTY_FILENAME, required=true) String filename
  ) {
    this();
    this.archiveType = archiveType;
    this.filename = filename;
  }

  public ScreenArchiveOFDBParametersDataArchiveOptions archiveDate(String archiveDate) {
    this.archiveDate = JsonNullable.<String>of(archiveDate);
    return this;
  }

   /**
   * YYYYMMDD date to archive to
   * @return archiveDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "20201231", value = "YYYYMMDD date to archive to")
  @JsonIgnore

  public String getArchiveDate() {
        return archiveDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARCHIVE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getArchiveDate_JsonNullable() {
    return archiveDate;
  }
  
  @JsonProperty(JSON_PROPERTY_ARCHIVE_DATE)
  public void setArchiveDate_JsonNullable(JsonNullable<String> archiveDate) {
    this.archiveDate = archiveDate;
  }

  public void setArchiveDate(String archiveDate) {
    this.archiveDate = JsonNullable.<String>of(archiveDate);
  }


  public ScreenArchiveOFDBParametersDataArchiveOptions archiveType(ArchiveTypeEnum archiveType) {
    this.archiveType = archiveType;
    return this;
  }

   /**
   * Type of archive.\\ &#x60;ofdbSymbols&#x60;: Archives the list of identifiers that passed the screen to an OFDB file.\\ &#x60;ofdb&#x60;: Archives the results of the screen to a time series OFDB. A mapping between Universal Screening and the OFDB must be created and saved in the screen.\\ &#x60;ofdbNts&#x60;: Archives the results of the screen to a non-time series OFDB. A mapping between Universal Screening and the OFDB database must be created and saved in the screen.\\ &#x60;ofdbQuickNts&#x60;: Archives the results of the screen to a non-time series OFDB without requiring a Universal Screening-to-OFDB map. By default, all columns in the screen will be archived to the OFDB. Each column&#39;s parameter reference name will be used as the OFDB field name. Use the &#x60;quickColumns&#x60; property to specify which parameters to archive.
   * @return archiveType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ofdbSymbols", required = true, value = "Type of archive.\\ `ofdbSymbols`: Archives the list of identifiers that passed the screen to an OFDB file.\\ `ofdb`: Archives the results of the screen to a time series OFDB. A mapping between Universal Screening and the OFDB must be created and saved in the screen.\\ `ofdbNts`: Archives the results of the screen to a non-time series OFDB. A mapping between Universal Screening and the OFDB database must be created and saved in the screen.\\ `ofdbQuickNts`: Archives the results of the screen to a non-time series OFDB without requiring a Universal Screening-to-OFDB map. By default, all columns in the screen will be archived to the OFDB. Each column's parameter reference name will be used as the OFDB field name. Use the `quickColumns` property to specify which parameters to archive.")
  @JsonProperty(JSON_PROPERTY_ARCHIVE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ArchiveTypeEnum getArchiveType() {
    return archiveType;
  }


  @JsonProperty(JSON_PROPERTY_ARCHIVE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArchiveType(ArchiveTypeEnum archiveType) {
    this.archiveType = archiveType;
  }


  public ScreenArchiveOFDBParametersDataArchiveOptions autoSymbolUpdates(Boolean autoSymbolUpdates) {
    this.autoSymbolUpdates = autoSymbolUpdates;
    return this;
  }

   /**
   * Flag to enable automatic symbol updates
   * @return autoSymbolUpdates
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Flag to enable automatic symbol updates")
  @JsonProperty(JSON_PROPERTY_AUTO_SYMBOL_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoSymbolUpdates() {
    return autoSymbolUpdates;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_SYMBOL_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoSymbolUpdates(Boolean autoSymbolUpdates) {
    this.autoSymbolUpdates = autoSymbolUpdates;
  }


  public ScreenArchiveOFDBParametersDataArchiveOptions existed(Boolean existed) {
    this.existed = existed;
    return this;
  }

   /**
   * Indicates that the output file exists
   * @return existed
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicates that the output file exists")
  @JsonProperty(JSON_PROPERTY_EXISTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExisted() {
    return existed;
  }


  @JsonProperty(JSON_PROPERTY_EXISTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExisted(Boolean existed) {
    this.existed = existed;
  }


  public ScreenArchiveOFDBParametersDataArchiveOptions filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * OFDB Filename to archive to
   * @return filename
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "personal:/screening_api_example_file.ofdb", required = true, value = "OFDB Filename to archive to")
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFilename() {
    return filename;
  }


  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilename(String filename) {
    this.filename = filename;
  }


  public ScreenArchiveOFDBParametersDataArchiveOptions overwriteData(Boolean overwriteData) {
    this.overwriteData = overwriteData;
    return this;
  }

   /**
   * If true and target file (or date for a time series file) exists, it will be cleared before archiving
   * @return overwriteData
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If true and target file (or date for a time series file) exists, it will be cleared before archiving")
  @JsonProperty(JSON_PROPERTY_OVERWRITE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOverwriteData() {
    return overwriteData;
  }


  @JsonProperty(JSON_PROPERTY_OVERWRITE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverwriteData(Boolean overwriteData) {
    this.overwriteData = overwriteData;
  }


  public ScreenArchiveOFDBParametersDataArchiveOptions quickColumns(String quickColumns) {
    this.quickColumns = JsonNullable.<String>of(quickColumns);
    return this;
  }

   /**
   * Space delimited list of parameter references to be archived, which are UPPERCASED with the #P. omitted
   * @return quickColumns
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "PARAM1 PARAM2", value = "Space delimited list of parameter references to be archived, which are UPPERCASED with the #P. omitted")
  @JsonIgnore

  public String getQuickColumns() {
        return quickColumns.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUICK_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getQuickColumns_JsonNullable() {
    return quickColumns;
  }
  
  @JsonProperty(JSON_PROPERTY_QUICK_COLUMNS)
  public void setQuickColumns_JsonNullable(JsonNullable<String> quickColumns) {
    this.quickColumns = quickColumns;
  }

  public void setQuickColumns(String quickColumns) {
    this.quickColumns = JsonNullable.<String>of(quickColumns);
  }


  public ScreenArchiveOFDBParametersDataArchiveOptions symbolType(SymbolTypeEnum symbolType) {
    this.symbolType = JsonNullable.<SymbolTypeEnum>of(symbolType);
    return this;
  }

   /**
   * The type of symbol to be saved to the SYMBOL field of the OFDB\\ &#x60;cusip&#x60;: Recommended. Primarily CUSIP for North American listed securities and SEDOL for the rest of the world.\\ &#x60;ticker&#x60;: Should only be used when writing to an existing OFDB that uses Tickers in the symbol column. Primarily Tickers for North American listed securities, QUICK Codes for Japanese listed securities, and SEDOL for the rest of the world. Applicable for equity screen archives.\\ &#x60;isin&#x60;: International Securities Identification Number (ISIN). Applicable for debt screen archives.
   * @return symbolType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "cusip", value = "The type of symbol to be saved to the SYMBOL field of the OFDB\\ `cusip`: Recommended. Primarily CUSIP for North American listed securities and SEDOL for the rest of the world.\\ `ticker`: Should only be used when writing to an existing OFDB that uses Tickers in the symbol column. Primarily Tickers for North American listed securities, QUICK Codes for Japanese listed securities, and SEDOL for the rest of the world. Applicable for equity screen archives.\\ `isin`: International Securities Identification Number (ISIN). Applicable for debt screen archives.")
  @JsonIgnore

  public SymbolTypeEnum getSymbolType() {
        return symbolType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SYMBOL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<SymbolTypeEnum> getSymbolType_JsonNullable() {
    return symbolType;
  }
  
  @JsonProperty(JSON_PROPERTY_SYMBOL_TYPE)
  public void setSymbolType_JsonNullable(JsonNullable<SymbolTypeEnum> symbolType) {
    this.symbolType = symbolType;
  }

  public void setSymbolType(SymbolTypeEnum symbolType) {
    this.symbolType = JsonNullable.<SymbolTypeEnum>of(symbolType);
  }


  public ScreenArchiveOFDBParametersDataArchiveOptions timeSeries(Boolean timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

   /**
   * Has no effect. Use the &#x60;archiveType&#x60; property.
   * @return timeSeries
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Has no effect. Use the `archiveType` property.")
  @JsonProperty(JSON_PROPERTY_TIME_SERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTimeSeries() {
    return timeSeries;
  }


  @JsonProperty(JSON_PROPERTY_TIME_SERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeSeries(Boolean timeSeries) {
    this.timeSeries = timeSeries;
  }


  public ScreenArchiveOFDBParametersDataArchiveOptions unsplitHistory(Boolean unsplitHistory) {
    this.unsplitHistory = unsplitHistory;
    return this;
  }

   /**
   * Flag indicating split adjust
   * @return unsplitHistory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Flag indicating split adjust")
  @JsonProperty(JSON_PROPERTY_UNSPLIT_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUnsplitHistory() {
    return unsplitHistory;
  }


  @JsonProperty(JSON_PROPERTY_UNSPLIT_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnsplitHistory(Boolean unsplitHistory) {
    this.unsplitHistory = unsplitHistory;
  }


  public ScreenArchiveOFDBParametersDataArchiveOptions useReportOrder(Boolean useReportOrder) {
    this.useReportOrder = useReportOrder;
    return this;
  }

   /**
   * If true, archive in report order
   * @return useReportOrder
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If true, archive in report order")
  @JsonProperty(JSON_PROPERTY_USE_REPORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseReportOrder() {
    return useReportOrder;
  }


  @JsonProperty(JSON_PROPERTY_USE_REPORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseReportOrder(Boolean useReportOrder) {
    this.useReportOrder = useReportOrder;
  }


  /**
   * Return true if this ScreenArchiveOFDBParameters_data_archiveOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenArchiveOFDBParametersDataArchiveOptions screenArchiveOFDBParametersDataArchiveOptions = (ScreenArchiveOFDBParametersDataArchiveOptions) o;
    return equalsNullable(this.archiveDate, screenArchiveOFDBParametersDataArchiveOptions.archiveDate) &&
        Objects.equals(this.archiveType, screenArchiveOFDBParametersDataArchiveOptions.archiveType) &&
        Objects.equals(this.autoSymbolUpdates, screenArchiveOFDBParametersDataArchiveOptions.autoSymbolUpdates) &&
        Objects.equals(this.existed, screenArchiveOFDBParametersDataArchiveOptions.existed) &&
        Objects.equals(this.filename, screenArchiveOFDBParametersDataArchiveOptions.filename) &&
        Objects.equals(this.overwriteData, screenArchiveOFDBParametersDataArchiveOptions.overwriteData) &&
        equalsNullable(this.quickColumns, screenArchiveOFDBParametersDataArchiveOptions.quickColumns) &&
        equalsNullable(this.symbolType, screenArchiveOFDBParametersDataArchiveOptions.symbolType) &&
        Objects.equals(this.timeSeries, screenArchiveOFDBParametersDataArchiveOptions.timeSeries) &&
        Objects.equals(this.unsplitHistory, screenArchiveOFDBParametersDataArchiveOptions.unsplitHistory) &&
        Objects.equals(this.useReportOrder, screenArchiveOFDBParametersDataArchiveOptions.useReportOrder);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(archiveDate), archiveType, autoSymbolUpdates, existed, filename, overwriteData, hashCodeNullable(quickColumns), hashCodeNullable(symbolType), timeSeries, unsplitHistory, useReportOrder);
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
    sb.append("class ScreenArchiveOFDBParametersDataArchiveOptions {\n");
    sb.append("    archiveDate: ").append(toIndentedString(archiveDate)).append("\n");
    sb.append("    archiveType: ").append(toIndentedString(archiveType)).append("\n");
    sb.append("    autoSymbolUpdates: ").append(toIndentedString(autoSymbolUpdates)).append("\n");
    sb.append("    existed: ").append(toIndentedString(existed)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    overwriteData: ").append(toIndentedString(overwriteData)).append("\n");
    sb.append("    quickColumns: ").append(toIndentedString(quickColumns)).append("\n");
    sb.append("    symbolType: ").append(toIndentedString(symbolType)).append("\n");
    sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
    sb.append("    unsplitHistory: ").append(toIndentedString(unsplitHistory)).append("\n");
    sb.append("    useReportOrder: ").append(toIndentedString(useReportOrder)).append("\n");
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


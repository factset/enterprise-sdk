/*
 * FactSet Formula API
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  You can download the FactSet Formula API Specification File in .yaml. using the \"Download Spec\" button to the right of the version number. This specification can then be used for Codegen to create your own SDKs. 
 *
 * The version of the OpenAPI document: 1.7.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Formula.models;

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
import com.factset.sdk.Formula.JSON;


/**
 * TimeSeriesRequestData
 */
@JsonPropertyOrder({
  TimeSeriesRequestData.JSON_PROPERTY_IDS,
  TimeSeriesRequestData.JSON_PROPERTY_SYMBOL_TYPE,
  TimeSeriesRequestData.JSON_PROPERTY_UNIVERSE,
  TimeSeriesRequestData.JSON_PROPERTY_UNIVERSE_TYPE,
  TimeSeriesRequestData.JSON_PROPERTY_FORMULAS,
  TimeSeriesRequestData.JSON_PROPERTY_CALENDAR,
  TimeSeriesRequestData.JSON_PROPERTY_FSYM_ID,
  TimeSeriesRequestData.JSON_PROPERTY_DISPLAY_NAME,
  TimeSeriesRequestData.JSON_PROPERTY_FLATTEN,
  TimeSeriesRequestData.JSON_PROPERTY_DATES,
  TimeSeriesRequestData.JSON_PROPERTY_BATCH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TimeSeriesRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = null;

  public static final String JSON_PROPERTY_SYMBOL_TYPE = "symbolType";
  private String symbolType;

  public static final String JSON_PROPERTY_UNIVERSE = "universe";
  private String universe;

  /**
   * Specify the universe type to calculate the &#x60;universe&#x60; in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  This parameter may only be used in conjunction with the &#x60;universe&#x60; parameter. 
   */
  public enum UniverseTypeEnum {
    EQUITY("EQUITY"),
    
    DEBT("DEBT"),
    
    FUND("FUND");

    private String value;

    UniverseTypeEnum(String value) {
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
    public static UniverseTypeEnum fromValue(String value) {
      for (UniverseTypeEnum b : UniverseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_UNIVERSE_TYPE = "universeType";
  private UniverseTypeEnum universeType = UniverseTypeEnum.EQUITY;

  public static final String JSON_PROPERTY_FORMULAS = "formulas";
  private java.util.List<String> formulas = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_CALENDAR = "calendar";
  private String calendar = "FIVEDAY";

  /**
   * Specify **Y** for the &#x60;fsymId&#x60; parameter to return the **fsymId** (FactSet Default Permanent Identifier) of the &#x60;requestId&#x60;, in addition to the **requestId** field, in each response object. The default value for the &#x60;fsymId&#x60; parameter is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). 
   */
  public enum FsymIdEnum {
    Y("Y"),
    
    N("N");

    private String value;

    FsymIdEnum(String value) {
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
    public static FsymIdEnum fromValue(String value) {
      for (FsymIdEnum b : FsymIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private FsymIdEnum fsymId = FsymIdEnum.N;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private java.util.List<String> displayName = null;

  /**
   * Specify **Y** for &#x60;flatten&#x60; to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for &#x60;flatten&#x60; is **N**.  See the **Time-Series Result Object Flattened** schema for more detail on the response structure for flattened output. 
   */
  public enum FlattenEnum {
    Y("Y"),
    
    N("N");

    private String value;

    FlattenEnum(String value) {
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
    public static FlattenEnum fromValue(String value) {
      for (FlattenEnum b : FlattenEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FLATTEN = "flatten";
  private FlattenEnum flatten = FlattenEnum.N;

  /**
   * Specify **N** for the &#x60;dates&#x60; parameter to suppress the **dates** of the response. The default value for the &#x60;dates&#x60; parameter is **Y**.  In the non-flattened response model, setting dates to **N** will remove the \&quot;dates\&quot; array from the TIMESERIES objectType, meaning that the results will be returned as an ARRAY objectType.  In the flattened response mode, setting dates to **N** will remove the \&quot;dates\&quot; attribute from the response objects. The flatten parameter first attempts to flatten the response by dates. Removing the dates can make it easier to align multiple data items when the date definition differs from the desired alignment. 
   */
  public enum DatesEnum {
    Y("Y"),
    
    N("N");

    private String value;

    DatesEnum(String value) {
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
    public static DatesEnum fromValue(String value) {
      for (DatesEnum b : DatesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DATES = "dates";
  private DatesEnum dates = DatesEnum.Y;

  /**
   * Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request up to **20 minutes**. Upon requesting \&quot;batch\&quot;: \&quot;Y\&quot;, the service will respond back with an HTTP Status Code of 202.  Individual users are allowed 5 concurrent Batch Requests, while Production users are allowed 10 concurrent Batch Requests.  *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  Once a batch request is submitted, use &#x60;/batch-status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;/batch-result&#x60;. See the endpoints listed under *Batch Processing* for more information. 
   */
  public enum BatchEnum {
    Y("Y"),
    
    N("N");

    private String value;

    BatchEnum(String value) {
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
    public static BatchEnum fromValue(String value) {
      for (BatchEnum b : BatchEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BATCH = "batch";
  private BatchEnum batch = BatchEnum.N;

  public TimeSeriesRequestData() { 
  }

  @JsonCreator
  public TimeSeriesRequestData(
    @JsonProperty(value=JSON_PROPERTY_FORMULAS, required=true) java.util.List<String> formulas
  ) {
    this();
    this.formulas = formulas;
  }

  public TimeSeriesRequestData ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public TimeSeriesRequestData addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new java.util.ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Array of entity identifiers.  The &#x60;ids&#x60; and &#x60;universe&#x60; parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter. 
   * @return ids
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"FDS-US\",\"IBM-US\",\"XOM-US\"]", value = "Array of entity identifiers.  The `ids` and `universe` parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the `ids` or `universe` parameter. ")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  public TimeSeriesRequestData symbolType(String symbolType) {
    this.symbolType = symbolType;
    return this;
  }

   /**
   * Specify the type of symbols submitted in the &#x60;ids&#x60; parameter. This is only required when submitting ids that are not supported by default.   Available symbol types - * DEFAULT - Accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids.  * BLOOMBERG - Accepted symbol types include Bloomberg Tickers and Bloomberg FIGIs.    * When submitting Bloomberg symbols, the Bloomberg symbol is translated to a FactSet Permanent Identifier which is then used to retrieve the requested FQL and Screening formulas. The Bloomberg symbol submitted will be returned in the response in the field *requestId*. To see the FactSet Permanent Identifer that the Bloomberg symbol resolved to, use the &#x60;fsymId&#x60; parameter in addition to the &#x60;   &#x60; parameter.   * Bloomberg symbols can not be submitted with other symbol types.    * Bloomberg Symbol Resolution is not available via Batch Requests.  Bloomberg Symbol Resolution is included with the Individual User subscription. Users with a Production User subscription require additional access to submit Bloomberg symbols. If you would like to gain access to Bloomberg Symbol Resolution, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist. 
   * @return symbolType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specify the type of symbols submitted in the `ids` parameter. This is only required when submitting ids that are not supported by default.   Available symbol types - * DEFAULT - Accepted symbol types include Market Tickers, SEDOLs, ISINs, CUSIPs, or FactSet Permanent Ids.  * BLOOMBERG - Accepted symbol types include Bloomberg Tickers and Bloomberg FIGIs.    * When submitting Bloomberg symbols, the Bloomberg symbol is translated to a FactSet Permanent Identifier which is then used to retrieve the requested FQL and Screening formulas. The Bloomberg symbol submitted will be returned in the response in the field *requestId*. To see the FactSet Permanent Identifer that the Bloomberg symbol resolved to, use the `fsymId` parameter in addition to the `   ` parameter.   * Bloomberg symbols can not be submitted with other symbol types.    * Bloomberg Symbol Resolution is not available via Batch Requests.  Bloomberg Symbol Resolution is included with the Individual User subscription. Users with a Production User subscription require additional access to submit Bloomberg symbols. If you would like to gain access to Bloomberg Symbol Resolution, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist. ")
  @JsonProperty(JSON_PROPERTY_SYMBOL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSymbolType() {
    return symbolType;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbolType(String symbolType) {
    this.symbolType = symbolType;
  }


  public TimeSeriesRequestData universe(String universe) {
    this.universe = universe;
    return this;
  }

   /**
   * Screening expression to limit the universe  Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter. 
   * @return universe
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FG_CONSTITUENTS(SP50,0,CLOSE)", value = "Screening expression to limit the universe  Please enter either the `ids` or `universe` parameter. ")
  @JsonProperty(JSON_PROPERTY_UNIVERSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniverse() {
    return universe;
  }


  @JsonProperty(JSON_PROPERTY_UNIVERSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniverse(String universe) {
    this.universe = universe;
  }


  public TimeSeriesRequestData universeType(UniverseTypeEnum universeType) {
    this.universeType = universeType;
    return this;
  }

   /**
   * Specify the universe type to calculate the &#x60;universe&#x60; in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  This parameter may only be used in conjunction with the &#x60;universe&#x60; parameter. 
   * @return universeType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "DEBT", value = "Specify the universe type to calculate the `universe` in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  This parameter may only be used in conjunction with the `universe` parameter. ")
  @JsonProperty(JSON_PROPERTY_UNIVERSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UniverseTypeEnum getUniverseType() {
    return universeType;
  }


  @JsonProperty(JSON_PROPERTY_UNIVERSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniverseType(UniverseTypeEnum universeType) {
    this.universeType = universeType;
  }


  public TimeSeriesRequestData formulas(java.util.List<String> formulas) {
    this.formulas = formulas;
    return this;
  }

  public TimeSeriesRequestData addFormulasItem(String formulasItem) {
    this.formulas.add(formulasItem);
    return this;
  }

   /**
   * Array of FQL formulas
   * @return formulas
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"P_PRICE(0,-2,D)\",\"FG_COMPANY_NAME\"]", required = true, value = "Array of FQL formulas")
  @JsonProperty(JSON_PROPERTY_FORMULAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getFormulas() {
    return formulas;
  }


  @JsonProperty(JSON_PROPERTY_FORMULAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormulas(java.util.List<String> formulas) {
    this.formulas = formulas;
  }


  public TimeSeriesRequestData calendar(String calendar) {
    this.calendar = calendar;
    return this;
  }

   /**
   * Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays.
   * @return calendar
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "SEVENDAY", value = "Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays.")
  @JsonProperty(JSON_PROPERTY_CALENDAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCalendar() {
    return calendar;
  }


  @JsonProperty(JSON_PROPERTY_CALENDAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalendar(String calendar) {
    this.calendar = calendar;
  }


  public TimeSeriesRequestData fsymId(FsymIdEnum fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * Specify **Y** for the &#x60;fsymId&#x60; parameter to return the **fsymId** (FactSet Default Permanent Identifier) of the &#x60;requestId&#x60;, in addition to the **requestId** field, in each response object. The default value for the &#x60;fsymId&#x60; parameter is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). 
   * @return fsymId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "Specify **Y** for the `fsymId` parameter to return the **fsymId** (FactSet Default Permanent Identifier) of the `requestId`, in addition to the **requestId** field, in each response object. The default value for the `fsymId` parameter is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the `requestId`. For all supported `requestId` symbol types, the `fsymId` parameter will return the Regional Level PermId '-R' which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted `requestId` symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). ")
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FsymIdEnum getFsymId() {
    return fsymId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsymId(FsymIdEnum fsymId) {
    this.fsymId = fsymId;
  }


  public TimeSeriesRequestData displayName(java.util.List<String> displayName) {
    this.displayName = displayName;
    return this;
  }

  public TimeSeriesRequestData addDisplayNameItem(String displayNameItem) {
    if (this.displayName == null) {
      this.displayName = new java.util.ArrayList<>();
    }
    this.displayName.add(displayNameItem);
    return this;
  }

   /**
   * Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won&#39;t be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName&#x3D;FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted. 
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"PRICE\",\"COMPANY_NAME\"]", value = "Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won't be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName=FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted. ")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(java.util.List<String> displayName) {
    this.displayName = displayName;
  }


  public TimeSeriesRequestData flatten(FlattenEnum flatten) {
    this.flatten = flatten;
    return this;
  }

   /**
   * Specify **Y** for &#x60;flatten&#x60; to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for &#x60;flatten&#x60; is **N**.  See the **Time-Series Result Object Flattened** schema for more detail on the response structure for flattened output. 
   * @return flatten
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "Specify **Y** for `flatten` to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for `flatten` is **N**.  See the **Time-Series Result Object Flattened** schema for more detail on the response structure for flattened output. ")
  @JsonProperty(JSON_PROPERTY_FLATTEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FlattenEnum getFlatten() {
    return flatten;
  }


  @JsonProperty(JSON_PROPERTY_FLATTEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlatten(FlattenEnum flatten) {
    this.flatten = flatten;
  }


  public TimeSeriesRequestData dates(DatesEnum dates) {
    this.dates = dates;
    return this;
  }

   /**
   * Specify **N** for the &#x60;dates&#x60; parameter to suppress the **dates** of the response. The default value for the &#x60;dates&#x60; parameter is **Y**.  In the non-flattened response model, setting dates to **N** will remove the \&quot;dates\&quot; array from the TIMESERIES objectType, meaning that the results will be returned as an ARRAY objectType.  In the flattened response mode, setting dates to **N** will remove the \&quot;dates\&quot; attribute from the response objects. The flatten parameter first attempts to flatten the response by dates. Removing the dates can make it easier to align multiple data items when the date definition differs from the desired alignment. 
   * @return dates
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "N", value = "Specify **N** for the `dates` parameter to suppress the **dates** of the response. The default value for the `dates` parameter is **Y**.  In the non-flattened response model, setting dates to **N** will remove the \"dates\" array from the TIMESERIES objectType, meaning that the results will be returned as an ARRAY objectType.  In the flattened response mode, setting dates to **N** will remove the \"dates\" attribute from the response objects. The flatten parameter first attempts to flatten the response by dates. Removing the dates can make it easier to align multiple data items when the date definition differs from the desired alignment. ")
  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DatesEnum getDates() {
    return dates;
  }


  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDates(DatesEnum dates) {
    this.dates = dates;
  }


  public TimeSeriesRequestData batch(BatchEnum batch) {
    this.batch = batch;
    return this;
  }

   /**
   * Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request up to **20 minutes**. Upon requesting \&quot;batch\&quot;: \&quot;Y\&quot;, the service will respond back with an HTTP Status Code of 202.  Individual users are allowed 5 concurrent Batch Requests, while Production users are allowed 10 concurrent Batch Requests.  *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  Once a batch request is submitted, use &#x60;/batch-status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;/batch-result&#x60;. See the endpoints listed under *Batch Processing* for more information. 
   * @return batch
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "Enables the ability to asynchronously \"batch\" the request, supporting a long-running request up to **20 minutes**. Upon requesting \"batch\": \"Y\", the service will respond back with an HTTP Status Code of 202.  Individual users are allowed 5 concurrent Batch Requests, while Production users are allowed 10 concurrent Batch Requests.  *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.*  Once a batch request is submitted, use `/batch-status` to see if the job has completed. Once completed, retrieve the results of the request via `/batch-result`. See the endpoints listed under *Batch Processing* for more information. ")
  @JsonProperty(JSON_PROPERTY_BATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BatchEnum getBatch() {
    return batch;
  }


  @JsonProperty(JSON_PROPERTY_BATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatch(BatchEnum batch) {
    this.batch = batch;
  }


  /**
   * Return true if this time_series_request_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesRequestData timeSeriesRequestData = (TimeSeriesRequestData) o;
    return Objects.equals(this.ids, timeSeriesRequestData.ids) &&
        Objects.equals(this.symbolType, timeSeriesRequestData.symbolType) &&
        Objects.equals(this.universe, timeSeriesRequestData.universe) &&
        Objects.equals(this.universeType, timeSeriesRequestData.universeType) &&
        Objects.equals(this.formulas, timeSeriesRequestData.formulas) &&
        Objects.equals(this.calendar, timeSeriesRequestData.calendar) &&
        Objects.equals(this.fsymId, timeSeriesRequestData.fsymId) &&
        Objects.equals(this.displayName, timeSeriesRequestData.displayName) &&
        Objects.equals(this.flatten, timeSeriesRequestData.flatten) &&
        Objects.equals(this.dates, timeSeriesRequestData.dates) &&
        Objects.equals(this.batch, timeSeriesRequestData.batch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, symbolType, universe, universeType, formulas, calendar, fsymId, displayName, flatten, dates, batch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesRequestData {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    symbolType: ").append(toIndentedString(symbolType)).append("\n");
    sb.append("    universe: ").append(toIndentedString(universe)).append("\n");
    sb.append("    universeType: ").append(toIndentedString(universeType)).append("\n");
    sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    flatten: ").append(toIndentedString(flatten)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
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


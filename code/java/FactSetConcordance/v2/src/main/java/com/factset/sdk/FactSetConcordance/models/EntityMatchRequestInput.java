/*
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request. With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p><p><b>Rate limit is set to 10 requests per second</b>.</p>    Methodology Guide link:   [https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d](https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d)    
 *
 * The version of the OpenAPI document: 2.10.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetConcordance.models;

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
import com.factset.sdk.FactSetConcordance.JSON;


/**
 * EntityMatchRequestInput
 */
@JsonPropertyOrder({
  EntityMatchRequestInput.JSON_PROPERTY_NAME,
  EntityMatchRequestInput.JSON_PROPERTY_CLIENT_ID,
  EntityMatchRequestInput.JSON_PROPERTY_COUNTRY,
  EntityMatchRequestInput.JSON_PROPERTY_STATE,
  EntityMatchRequestInput.JSON_PROPERTY_URL,
  EntityMatchRequestInput.JSON_PROPERTY_PRIORITY,
  EntityMatchRequestInput.JSON_PROPERTY_BBG_FIGI,
  EntityMatchRequestInput.JSON_PROPERTY_BBG_TICKER,
  EntityMatchRequestInput.JSON_PROPERTY_BIC,
  EntityMatchRequestInput.JSON_PROPERTY_CIK,
  EntityMatchRequestInput.JSON_PROPERTY_CRD,
  EntityMatchRequestInput.JSON_PROPERTY_CUSIP,
  EntityMatchRequestInput.JSON_PROPERTY_EIN,
  EntityMatchRequestInput.JSON_PROPERTY_FACTSET_ID,
  EntityMatchRequestInput.JSON_PROPERTY_FITCH,
  EntityMatchRequestInput.JSON_PROPERTY_GVKEY,
  EntityMatchRequestInput.JSON_PROPERTY_GVKEY_IID,
  EntityMatchRequestInput.JSON_PROPERTY_ISIN,
  EntityMatchRequestInput.JSON_PROPERTY_JCN,
  EntityMatchRequestInput.JSON_PROPERTY_LEI,
  EntityMatchRequestInput.JSON_PROPERTY_LXID,
  EntityMatchRequestInput.JSON_PROPERTY_MD,
  EntityMatchRequestInput.JSON_PROPERTY_RED_CODE,
  EntityMatchRequestInput.JSON_PROPERTY_RSSD,
  EntityMatchRequestInput.JSON_PROPERTY_SEDOL,
  EntityMatchRequestInput.JSON_PROPERTY_SPR,
  EntityMatchRequestInput.JSON_PROPERTY_TICKER,
  EntityMatchRequestInput.JSON_PROPERTY_TICKER_EXCHANGE,
  EntityMatchRequestInput.JSON_PROPERTY_TICKER_REGION,
  EntityMatchRequestInput.JSON_PROPERTY_UKCH,
  EntityMatchRequestInput.JSON_PROPERTY_VALOREN,
  EntityMatchRequestInput.JSON_PROPERTY_WKN,
  EntityMatchRequestInput.JSON_PROPERTY_ADDITIONAL_CONTEXT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EntityMatchRequestInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  private String clientId;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  /**
   * Priority associated to the id.
   */
  public enum PriorityEnum {
    CRITICAL("CRITICAL"),
    
    HIGH("HIGH"),
    
    MEDIUM("MEDIUM"),
    
    LOW("LOW");

    private String value;

    PriorityEnum(String value) {
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
    public static PriorityEnum fromValue(String value) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private PriorityEnum priority;

  public static final String JSON_PROPERTY_BBG_FIGI = "bbgFigi";
  private String bbgFigi;

  public static final String JSON_PROPERTY_BBG_TICKER = "bbgTicker";
  private String bbgTicker;

  public static final String JSON_PROPERTY_BIC = "bic";
  private String bic;

  public static final String JSON_PROPERTY_CIK = "cik";
  private String cik;

  public static final String JSON_PROPERTY_CRD = "crd";
  private String crd;

  public static final String JSON_PROPERTY_CUSIP = "cusip";
  private String cusip;

  public static final String JSON_PROPERTY_EIN = "ein";
  private String ein;

  public static final String JSON_PROPERTY_FACTSET_ID = "factsetId";
  private String factsetId;

  public static final String JSON_PROPERTY_FITCH = "fitch";
  private String fitch;

  public static final String JSON_PROPERTY_GVKEY = "gvkey";
  private String gvkey;

  public static final String JSON_PROPERTY_GVKEY_IID = "gvkeyIid";
  private String gvkeyIid;

  public static final String JSON_PROPERTY_ISIN = "isin";
  private String isin;

  public static final String JSON_PROPERTY_JCN = "jcn";
  private String jcn;

  public static final String JSON_PROPERTY_LEI = "lei";
  private String lei;

  public static final String JSON_PROPERTY_LXID = "lxid";
  private String lxid;

  public static final String JSON_PROPERTY_MD = "md";
  private String md;

  public static final String JSON_PROPERTY_RED_CODE = "redCode";
  private String redCode;

  public static final String JSON_PROPERTY_RSSD = "rssd";
  private String rssd;

  public static final String JSON_PROPERTY_SEDOL = "sedol";
  private String sedol;

  public static final String JSON_PROPERTY_SPR = "spr";
  private String spr;

  public static final String JSON_PROPERTY_TICKER = "ticker";
  private String ticker;

  public static final String JSON_PROPERTY_TICKER_EXCHANGE = "tickerExchange";
  private String tickerExchange;

  public static final String JSON_PROPERTY_TICKER_REGION = "tickerRegion";
  private String tickerRegion;

  public static final String JSON_PROPERTY_UKCH = "ukch";
  private String ukch;

  public static final String JSON_PROPERTY_VALOREN = "valoren";
  private String valoren;

  public static final String JSON_PROPERTY_WKN = "wkn";
  private String wkn;

  public static final String JSON_PROPERTY_ADDITIONAL_CONTEXT = "additionalContext";
  private java.util.Map<String, String> additionalContext = null;

  public EntityMatchRequestInput() { 
  }

  @JsonCreator
  public EntityMatchRequestInput(
    @JsonProperty(value=JSON_PROPERTY_NAME, required=true) String name
  ) {
    this();
    this.name = name;
  }

  public EntityMatchRequestInput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The Name of the entity to match.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Tesla", required = true, value = "The Name of the entity to match.")
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


  public EntityMatchRequestInput clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. 
   * @return clientId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "abc-123", value = "A unique identifier supplied by the user. ClientId is saved to the user's Concordance universe and will be used as the identifier for that entity within the universe. ")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public EntityMatchRequestInput country(String country) {
    this.country = country;
    return this;
  }

   /**
   * ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754#country). 
   * @return country
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "US", value = "ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754#country). ")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public EntityMatchRequestInput state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported.Two character state or province code to filter on. 
   * @return state
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "TX", value = "Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported.Two character state or province code to filter on. ")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public EntityMatchRequestInput url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL corresponding to the entity name that is used when evaluating candidates for a match. 
   * @return url
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "www.tesla.com", value = "URL corresponding to the entity name that is used when evaluating candidates for a match. ")
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


  public EntityMatchRequestInput priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Priority associated to the id.
   * @return priority
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "HIGH", value = "Priority associated to the id.")
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PriorityEnum getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }


  public EntityMatchRequestInput bbgFigi(String bbgFigi) {
    this.bbgFigi = bbgFigi;
    return this;
  }

   /**
   * Name for the type Bloomberg Listing/Regional/Security ID.
   * @return bbgFigi
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "BBG000N9P426", value = "Name for the type Bloomberg Listing/Regional/Security ID.")
  @JsonProperty(JSON_PROPERTY_BBG_FIGI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBbgFigi() {
    return bbgFigi;
  }


  @JsonProperty(JSON_PROPERTY_BBG_FIGI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBbgFigi(String bbgFigi) {
    this.bbgFigi = bbgFigi;
  }


  public EntityMatchRequestInput bbgTicker(String bbgTicker) {
    this.bbgTicker = bbgTicker;
    return this;
  }

   /**
   * Name for the type Bloomberg Listing and Regional Ticker.
   * @return bbgTicker
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "TSLA UW", value = "Name for the type Bloomberg Listing and Regional Ticker.")
  @JsonProperty(JSON_PROPERTY_BBG_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBbgTicker() {
    return bbgTicker;
  }


  @JsonProperty(JSON_PROPERTY_BBG_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBbgTicker(String bbgTicker) {
    this.bbgTicker = bbgTicker;
  }


  public EntityMatchRequestInput bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Name for type BICCode, bank indentification code
   * @return bic
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "TSLAUS66", value = "Name for type BICCode, bank indentification code")
  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBic() {
    return bic;
  }


  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBic(String bic) {
    this.bic = bic;
  }


  public EntityMatchRequestInput cik(String cik) {
    this.cik = cik;
    return this;
  }

   /**
   * Name for the type CIK, Edgar Central Index Keys
   * @return cik
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0001318605", value = "Name for the type CIK, Edgar Central Index Keys")
  @JsonProperty(JSON_PROPERTY_CIK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCik() {
    return cik;
  }


  @JsonProperty(JSON_PROPERTY_CIK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCik(String cik) {
    this.cik = cik;
  }


  public EntityMatchRequestInput crd(String crd) {
    this.crd = crd;
    return this;
  }

   /**
   * Name for the type CRD, Central Registration Depository
   * @return crd
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "", value = "Name for the type CRD, Central Registration Depository")
  @JsonProperty(JSON_PROPERTY_CRD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCrd() {
    return crd;
  }


  @JsonProperty(JSON_PROPERTY_CRD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrd(String crd) {
    this.crd = crd;
  }


  public EntityMatchRequestInput cusip(String cusip) {
    this.cusip = cusip;
    return this;
  }

   /**
   * Name for the type CUSIP.
   * @return cusip
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "88160R101", value = "Name for the type CUSIP.")
  @JsonProperty(JSON_PROPERTY_CUSIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCusip() {
    return cusip;
  }


  @JsonProperty(JSON_PROPERTY_CUSIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCusip(String cusip) {
    this.cusip = cusip;
  }


  public EntityMatchRequestInput ein(String ein) {
    this.ein = ein;
    return this;
  }

   /**
   * Name for the type EmployerIdentificationNumber, EIN.
   * @return ein
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "", value = "Name for the type EmployerIdentificationNumber, EIN.")
  @JsonProperty(JSON_PROPERTY_EIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEin() {
    return ein;
  }


  @JsonProperty(JSON_PROPERTY_EIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEin(String ein) {
    this.ein = ein;
  }


  public EntityMatchRequestInput factsetId(String factsetId) {
    this.factsetId = factsetId;
    return this;
  }

   /**
   * Name for the type FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier.
   * @return factsetId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "006XY7-E", value = "Name for the type FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier.")
  @JsonProperty(JSON_PROPERTY_FACTSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFactsetId() {
    return factsetId;
  }


  @JsonProperty(JSON_PROPERTY_FACTSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactsetId(String factsetId) {
    this.factsetId = factsetId;
  }


  public EntityMatchRequestInput fitch(String fitch) {
    this.fitch = fitch;
    return this;
  }

   /**
   * Name for the type FitchCreditRating, Fitch Ratings Identifier.
   * @return fitch
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "", value = "Name for the type FitchCreditRating, Fitch Ratings Identifier.")
  @JsonProperty(JSON_PROPERTY_FITCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFitch() {
    return fitch;
  }


  @JsonProperty(JSON_PROPERTY_FITCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFitch(String fitch) {
    this.fitch = fitch;
  }


  public EntityMatchRequestInput gvkey(String gvkey) {
    this.gvkey = gvkey;
    return this;
  }

   /**
   * Name for the type GVKEY, Compustat Global Company Key.
   * @return gvkey
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "", value = "Name for the type GVKEY, Compustat Global Company Key.")
  @JsonProperty(JSON_PROPERTY_GVKEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGvkey() {
    return gvkey;
  }


  @JsonProperty(JSON_PROPERTY_GVKEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGvkey(String gvkey) {
    this.gvkey = gvkey;
  }


  public EntityMatchRequestInput gvkeyIid(String gvkeyIid) {
    this.gvkeyIid = gvkeyIid;
    return this;
  }

   /**
   * Name for the type GVKEY+IID, Compustat Global Company Key and Issue Identifier.
   * @return gvkeyIid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "", value = "Name for the type GVKEY+IID, Compustat Global Company Key and Issue Identifier.")
  @JsonProperty(JSON_PROPERTY_GVKEY_IID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGvkeyIid() {
    return gvkeyIid;
  }


  @JsonProperty(JSON_PROPERTY_GVKEY_IID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGvkeyIid(String gvkeyIid) {
    this.gvkeyIid = gvkeyIid;
  }


  public EntityMatchRequestInput isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * Name for the type ISIN.
   * @return isin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "US88160R1014", value = "Name for the type ISIN.")
  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsin() {
    return isin;
  }


  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsin(String isin) {
    this.isin = isin;
  }


  public EntityMatchRequestInput jcn(String jcn) {
    this.jcn = jcn;
    return this;
  }

   /**
   * Name for the type JCN , Japanese Corporate Number.
   * @return jcn
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "", value = "Name for the type JCN , Japanese Corporate Number.")
  @JsonProperty(JSON_PROPERTY_JCN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJcn() {
    return jcn;
  }


  @JsonProperty(JSON_PROPERTY_JCN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJcn(String jcn) {
    this.jcn = jcn;
  }


  public EntityMatchRequestInput lei(String lei) {
    this.lei = lei;
    return this;
  }

   /**
   * Name for the type LegalEntityIdentifier, LEI.
   * @return lei
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "54930043XZGB27CTOV49", value = "Name for the type LegalEntityIdentifier, LEI.")
  @JsonProperty(JSON_PROPERTY_LEI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLei() {
    return lei;
  }


  @JsonProperty(JSON_PROPERTY_LEI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLei(String lei) {
    this.lei = lei;
  }


  public EntityMatchRequestInput lxid(String lxid) {
    this.lxid = lxid;
    return this;
  }

   /**
   * Name for the type LXID, Markit Syndicated Loan Identifier.
   * @return lxid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "", value = "Name for the type LXID, Markit Syndicated Loan Identifier.")
  @JsonProperty(JSON_PROPERTY_LXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLxid() {
    return lxid;
  }


  @JsonProperty(JSON_PROPERTY_LXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLxid(String lxid) {
    this.lxid = lxid;
  }


  public EntityMatchRequestInput md(String md) {
    this.md = md;
    return this;
  }

   /**
   * Name for the type MoodysIssuer, Moody&#39;s Ratings Identifier.
   * @return md
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "823642219", value = "Name for the type MoodysIssuer, Moody's Ratings Identifier.")
  @JsonProperty(JSON_PROPERTY_MD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMd() {
    return md;
  }


  @JsonProperty(JSON_PROPERTY_MD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMd(String md) {
    this.md = md;
  }


  public EntityMatchRequestInput redCode(String redCode) {
    this.redCode = redCode;
    return this;
  }

   /**
   * Name for the type RedCode, Markit Reference Entity Identifier.
   * @return redCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "", value = "Name for the type RedCode, Markit Reference Entity Identifier.")
  @JsonProperty(JSON_PROPERTY_RED_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRedCode() {
    return redCode;
  }


  @JsonProperty(JSON_PROPERTY_RED_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedCode(String redCode) {
    this.redCode = redCode;
  }


  public EntityMatchRequestInput rssd(String rssd) {
    this.rssd = rssd;
    return this;
  }

   /**
   * Name for the type FederalReserveRSSDIdentifier, RSSD.
   * @return rssd
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "", value = "Name for the type FederalReserveRSSDIdentifier, RSSD.")
  @JsonProperty(JSON_PROPERTY_RSSD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRssd() {
    return rssd;
  }


  @JsonProperty(JSON_PROPERTY_RSSD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRssd(String rssd) {
    this.rssd = rssd;
  }


  public EntityMatchRequestInput sedol(String sedol) {
    this.sedol = sedol;
    return this;
  }

   /**
   * Name for the type SEDOL.
   * @return sedol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "B616C79", value = "Name for the type SEDOL.")
  @JsonProperty(JSON_PROPERTY_SEDOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSedol() {
    return sedol;
  }


  @JsonProperty(JSON_PROPERTY_SEDOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSedol(String sedol) {
    this.sedol = sedol;
  }


  public EntityMatchRequestInput spr(String spr) {
    this.spr = spr;
    return this;
  }

   /**
   * Name for the type S&amp;PRating, S&amp;P Ratings Identifier.
   * @return spr
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "562703", value = "Name for the type S&PRating, S&P Ratings Identifier.")
  @JsonProperty(JSON_PROPERTY_SPR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpr() {
    return spr;
  }


  @JsonProperty(JSON_PROPERTY_SPR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpr(String spr) {
    this.spr = spr;
  }


  public EntityMatchRequestInput ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * Name for the type PriceTicker.
   * @return ticker
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "PriceTicker", value = "Name for the type PriceTicker.")
  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTicker() {
    return ticker;
  }


  @JsonProperty(JSON_PROPERTY_TICKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTicker(String ticker) {
    this.ticker = ticker;
  }


  public EntityMatchRequestInput tickerExchange(String tickerExchange) {
    this.tickerExchange = tickerExchange;
    return this;
  }

   /**
   * Name for the type TickerExch.
   * @return tickerExchange
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "TSLA-NAS", value = "Name for the type TickerExch.")
  @JsonProperty(JSON_PROPERTY_TICKER_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTickerExchange() {
    return tickerExchange;
  }


  @JsonProperty(JSON_PROPERTY_TICKER_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTickerExchange(String tickerExchange) {
    this.tickerExchange = tickerExchange;
  }


  public EntityMatchRequestInput tickerRegion(String tickerRegion) {
    this.tickerRegion = tickerRegion;
    return this;
  }

   /**
   * Name for the type TickerRegion
   * @return tickerRegion
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "TSLA-US", value = "Name for the type TickerRegion")
  @JsonProperty(JSON_PROPERTY_TICKER_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTickerRegion() {
    return tickerRegion;
  }


  @JsonProperty(JSON_PROPERTY_TICKER_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTickerRegion(String tickerRegion) {
    this.tickerRegion = tickerRegion;
  }


  public EntityMatchRequestInput ukch(String ukch) {
    this.ukch = ukch;
    return this;
  }

   /**
   * Name for the type UKCompanyHouse
   * @return ukch
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "CE012494", value = "Name for the type UKCompanyHouse")
  @JsonProperty(JSON_PROPERTY_UKCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUkch() {
    return ukch;
  }


  @JsonProperty(JSON_PROPERTY_UKCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUkch(String ukch) {
    this.ukch = ukch;
  }


  public EntityMatchRequestInput valoren(String valoren) {
    this.valoren = valoren;
    return this;
  }

   /**
   * Name for the type VALOR, Valoren (\&quot;Valor\&quot;) Identification.
   * @return valoren
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "", value = "Name for the type VALOR, Valoren (\"Valor\") Identification.")
  @JsonProperty(JSON_PROPERTY_VALOREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValoren() {
    return valoren;
  }


  @JsonProperty(JSON_PROPERTY_VALOREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValoren(String valoren) {
    this.valoren = valoren;
  }


  public EntityMatchRequestInput wkn(String wkn) {
    this.wkn = wkn;
    return this;
  }

   /**
   * Name for the type WKN, German Securities Identification.
   * @return wkn
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "A1CX3T", value = "Name for the type WKN, German Securities Identification.")
  @JsonProperty(JSON_PROPERTY_WKN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWkn() {
    return wkn;
  }


  @JsonProperty(JSON_PROPERTY_WKN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWkn(String wkn) {
    this.wkn = wkn;
  }


  public EntityMatchRequestInput additionalContext(java.util.Map<String, String> additionalContext) {
    this.additionalContext = additionalContext;
    return this;
  }

  public EntityMatchRequestInput putAdditionalContextItem(String key, String additionalContextItem) {
    if (this.additionalContext == null) {
      this.additionalContext = new java.util.HashMap<>();
    }
    this.additionalContext.put(key, additionalContextItem);
    return this;
  }

   /**
   * Any additional context information along with other input values that need to be saved for an entity during search.  To be used by Managed Service for any unmapped records.  This is applicable when saving the records with clientId and universeId specified. 
   * @return additionalContext
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "{\"Address\":\"1 Tesla Road\",\"Phone\":\"1-800 662 7232\",\"City\":\"Austin\"}", value = "Any additional context information along with other input values that need to be saved for an entity during search.  To be used by Managed Service for any unmapped records.  This is applicable when saving the records with clientId and universeId specified. ")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, String> getAdditionalContext() {
    return additionalContext;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalContext(java.util.Map<String, String> additionalContext) {
    this.additionalContext = additionalContext;
  }


  /**
   * Return true if this EntityMatchRequest_input object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityMatchRequestInput entityMatchRequestInput = (EntityMatchRequestInput) o;
    return Objects.equals(this.name, entityMatchRequestInput.name) &&
        Objects.equals(this.clientId, entityMatchRequestInput.clientId) &&
        Objects.equals(this.country, entityMatchRequestInput.country) &&
        Objects.equals(this.state, entityMatchRequestInput.state) &&
        Objects.equals(this.url, entityMatchRequestInput.url) &&
        Objects.equals(this.priority, entityMatchRequestInput.priority) &&
        Objects.equals(this.bbgFigi, entityMatchRequestInput.bbgFigi) &&
        Objects.equals(this.bbgTicker, entityMatchRequestInput.bbgTicker) &&
        Objects.equals(this.bic, entityMatchRequestInput.bic) &&
        Objects.equals(this.cik, entityMatchRequestInput.cik) &&
        Objects.equals(this.crd, entityMatchRequestInput.crd) &&
        Objects.equals(this.cusip, entityMatchRequestInput.cusip) &&
        Objects.equals(this.ein, entityMatchRequestInput.ein) &&
        Objects.equals(this.factsetId, entityMatchRequestInput.factsetId) &&
        Objects.equals(this.fitch, entityMatchRequestInput.fitch) &&
        Objects.equals(this.gvkey, entityMatchRequestInput.gvkey) &&
        Objects.equals(this.gvkeyIid, entityMatchRequestInput.gvkeyIid) &&
        Objects.equals(this.isin, entityMatchRequestInput.isin) &&
        Objects.equals(this.jcn, entityMatchRequestInput.jcn) &&
        Objects.equals(this.lei, entityMatchRequestInput.lei) &&
        Objects.equals(this.lxid, entityMatchRequestInput.lxid) &&
        Objects.equals(this.md, entityMatchRequestInput.md) &&
        Objects.equals(this.redCode, entityMatchRequestInput.redCode) &&
        Objects.equals(this.rssd, entityMatchRequestInput.rssd) &&
        Objects.equals(this.sedol, entityMatchRequestInput.sedol) &&
        Objects.equals(this.spr, entityMatchRequestInput.spr) &&
        Objects.equals(this.ticker, entityMatchRequestInput.ticker) &&
        Objects.equals(this.tickerExchange, entityMatchRequestInput.tickerExchange) &&
        Objects.equals(this.tickerRegion, entityMatchRequestInput.tickerRegion) &&
        Objects.equals(this.ukch, entityMatchRequestInput.ukch) &&
        Objects.equals(this.valoren, entityMatchRequestInput.valoren) &&
        Objects.equals(this.wkn, entityMatchRequestInput.wkn) &&
        Objects.equals(this.additionalContext, entityMatchRequestInput.additionalContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, clientId, country, state, url, priority, bbgFigi, bbgTicker, bic, cik, crd, cusip, ein, factsetId, fitch, gvkey, gvkeyIid, isin, jcn, lei, lxid, md, redCode, rssd, sedol, spr, ticker, tickerExchange, tickerRegion, ukch, valoren, wkn, additionalContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityMatchRequestInput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    bbgFigi: ").append(toIndentedString(bbgFigi)).append("\n");
    sb.append("    bbgTicker: ").append(toIndentedString(bbgTicker)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    cik: ").append(toIndentedString(cik)).append("\n");
    sb.append("    crd: ").append(toIndentedString(crd)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    factsetId: ").append(toIndentedString(factsetId)).append("\n");
    sb.append("    fitch: ").append(toIndentedString(fitch)).append("\n");
    sb.append("    gvkey: ").append(toIndentedString(gvkey)).append("\n");
    sb.append("    gvkeyIid: ").append(toIndentedString(gvkeyIid)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    jcn: ").append(toIndentedString(jcn)).append("\n");
    sb.append("    lei: ").append(toIndentedString(lei)).append("\n");
    sb.append("    lxid: ").append(toIndentedString(lxid)).append("\n");
    sb.append("    md: ").append(toIndentedString(md)).append("\n");
    sb.append("    redCode: ").append(toIndentedString(redCode)).append("\n");
    sb.append("    rssd: ").append(toIndentedString(rssd)).append("\n");
    sb.append("    sedol: ").append(toIndentedString(sedol)).append("\n");
    sb.append("    spr: ").append(toIndentedString(spr)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    tickerExchange: ").append(toIndentedString(tickerExchange)).append("\n");
    sb.append("    tickerRegion: ").append(toIndentedString(tickerRegion)).append("\n");
    sb.append("    ukch: ").append(toIndentedString(ukch)).append("\n");
    sb.append("    valoren: ").append(toIndentedString(valoren)).append("\n");
    sb.append("    wkn: ").append(toIndentedString(wkn)).append("\n");
    sb.append("    additionalContext: ").append(toIndentedString(additionalContext)).append("\n");
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


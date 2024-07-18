/*
 * FactSet Concordance API
 *
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p><p><b>Rate limit is set to 10 requests per second</b>.</p>    Methodology Guide link:   [https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d](https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d)    
 *
 * The version of the OpenAPI document: 2.8.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = FactSet.SDK.FactSetConcordance.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetConcordance.Model
{
    /// <summary>
    /// EntityMatchRequestInput
    /// </summary>
    [DataContract(Name = "EntityMatchRequest_input")]
    public partial class EntityMatchRequestInput : IEquatable<EntityMatchRequestInput>, IValidatableObject
    {
        /// <summary>
        /// Priority associated to the id.
        /// </summary>
        /// <value>Priority associated to the id.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum PriorityEnum
        {
            /// <summary>
            /// Enum CRITICAL for value: CRITICAL
            /// </summary>
            [EnumMember(Value = "CRITICAL")]
            CRITICAL = 1,

            /// <summary>
            /// Enum HIGH for value: HIGH
            /// </summary>
            [EnumMember(Value = "HIGH")]
            HIGH = 2,

            /// <summary>
            /// Enum MEDIUM for value: MEDIUM
            /// </summary>
            [EnumMember(Value = "MEDIUM")]
            MEDIUM = 3,

            /// <summary>
            /// Enum LOW for value: LOW
            /// </summary>
            [EnumMember(Value = "LOW")]
            LOW = 4

        }


        /// <summary>
        /// Priority associated to the id.
        /// </summary>
        /// <value>Priority associated to the id.</value>
        [DataMember(Name = "priority", EmitDefaultValue = false)]
        public PriorityEnum? Priority { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityMatchRequestInput" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EntityMatchRequestInput() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityMatchRequestInput" /> class.
        /// </summary>
        /// <param name="name">The Name of the entity to match. (required).</param>
        /// <param name="clientId">A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. .</param>
        /// <param name="country">ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). .</param>
        /// <param name="state">Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported.Two character state or province code to filter on. .</param>
        /// <param name="url">URL corresponding to the entity name that is used when evaluating candidates for a match. .</param>
        /// <param name="priority">Priority associated to the id..</param>
        /// <param name="bbgFigi">Name for the type Bloomberg Listing/Regional/Security ID..</param>
        /// <param name="bbgTicker">Name for the type Bloomberg Listing and Regional Ticker..</param>
        /// <param name="bic">Name for type BICCode, bank indentification code.</param>
        /// <param name="cik">Name for the type CIK, Edgar Central Index Keys.</param>
        /// <param name="crd">Name for the type CRD, Central Registration Depository.</param>
        /// <param name="cusip">Name for the type CUSIP..</param>
        /// <param name="duns">Name for the type DUNS, Dun&amp;Bradstreet..</param>
        /// <param name="ein">Name for the type EmployerIdentificationNumber, EIN..</param>
        /// <param name="factsetId">Name for the type FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier..</param>
        /// <param name="fitch">Name for the type FitchCreditRating, Fitch Ratings Identifier..</param>
        /// <param name="gvkey">Name for the type GVKEY, Compustat Global Company Key..</param>
        /// <param name="gvkeyIid">Name for the type GVKEY+IID, Compustat Global Company Key and Issue Identifier..</param>
        /// <param name="isin">Name for the type ISIN..</param>
        /// <param name="jcn">Name for the type JCN , Japanese Corporate Number..</param>
        /// <param name="lei">Name for the type LegalEntityIdentifier, LEI..</param>
        /// <param name="lxid">Name for the type LXID, Markit Syndicated Loan Identifier..</param>
        /// <param name="md">Name for the type MoodysIssuer, Moody&#39;s Ratings Identifier..</param>
        /// <param name="redCode">Name for the type RedCode, Markit Reference Entity Identifier..</param>
        /// <param name="rssd">Name for the type FederalReserveRSSDIdentifier, RSSD..</param>
        /// <param name="sedol">Name for the type SEDOL..</param>
        /// <param name="spr">Name for the type S&amp;PRating, S&amp;P Ratings Identifier..</param>
        /// <param name="ticker">Name for the type PriceTicker..</param>
        /// <param name="tickerExchange">Name for the type TickerExch..</param>
        /// <param name="tickerRegion">Name for the type TickerRegion.</param>
        /// <param name="ukch">Name for the type UKCompanyHouse.</param>
        /// <param name="valoren">Name for the type VALOR, Valoren (\&quot;Valor\&quot;) Identification..</param>
        /// <param name="wkn">Name for the type WKN, German Securities Identification..</param>
        /// <param name="additionalContext">Any additional context information along with other input values that need to be saved for an entity during search.  To be used by Managed Service for any unmapped records.  This is applicable when saving the records with clientId and universeId specified. .</param>
        public EntityMatchRequestInput(string name,string clientId = default(string), string country = default(string), string state = default(string), string url = default(string), PriorityEnum? priority = default(PriorityEnum?), string bbgFigi = default(string), string bbgTicker = default(string), string bic = default(string), string cik = default(string), string crd = default(string), string cusip = default(string), string duns = default(string), string ein = default(string), string factsetId = default(string), string fitch = default(string), string gvkey = default(string), string gvkeyIid = default(string), string isin = default(string), string jcn = default(string), string lei = default(string), string lxid = default(string), string md = default(string), string redCode = default(string), string rssd = default(string), string sedol = default(string), string spr = default(string), string ticker = default(string), string tickerExchange = default(string), string tickerRegion = default(string), string ukch = default(string), string valoren = default(string), string wkn = default(string), Dictionary<string, string> additionalContext = default(Dictionary<string, string>))
        {
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for EntityMatchRequestInput and cannot be null");
            }
            this.Name = name;
            this.ClientId = clientId;
            this.Country = country;
            this.State = state;
            this.Url = url;
            this.Priority = priority;
            this.BbgFigi = bbgFigi;
            this.BbgTicker = bbgTicker;
            this.Bic = bic;
            this.Cik = cik;
            this.Crd = crd;
            this.Cusip = cusip;
            this.Duns = duns;
            this.Ein = ein;
            this.FactsetId = factsetId;
            this.Fitch = fitch;
            this.Gvkey = gvkey;
            this.GvkeyIid = gvkeyIid;
            this.Isin = isin;
            this.Jcn = jcn;
            this.Lei = lei;
            this.Lxid = lxid;
            this.Md = md;
            this.RedCode = redCode;
            this.Rssd = rssd;
            this.Sedol = sedol;
            this.Spr = spr;
            this.Ticker = ticker;
            this.TickerExchange = tickerExchange;
            this.TickerRegion = tickerRegion;
            this.Ukch = ukch;
            this.Valoren = valoren;
            this.Wkn = wkn;
            this.AdditionalContext = additionalContext;
        }

        /// <summary>
        /// The Name of the entity to match.
        /// </summary>
        /// <value>The Name of the entity to match.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. 
        /// </summary>
        /// <value>A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. </value>
        [DataMember(Name = "clientId", EmitDefaultValue = false)]
        public string ClientId { get; set; }

        /// <summary>
        /// ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). 
        /// </summary>
        /// <value>ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). </value>
        [DataMember(Name = "country", EmitDefaultValue = false)]
        public string Country { get; set; }

        /// <summary>
        /// Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported.Two character state or province code to filter on. 
        /// </summary>
        /// <value>Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported.Two character state or province code to filter on. </value>
        [DataMember(Name = "state", EmitDefaultValue = false)]
        public string State { get; set; }

        /// <summary>
        /// URL corresponding to the entity name that is used when evaluating candidates for a match. 
        /// </summary>
        /// <value>URL corresponding to the entity name that is used when evaluating candidates for a match. </value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// Name for the type Bloomberg Listing/Regional/Security ID.
        /// </summary>
        /// <value>Name for the type Bloomberg Listing/Regional/Security ID.</value>
        [DataMember(Name = "bbgFigi", EmitDefaultValue = false)]
        public string BbgFigi { get; set; }

        /// <summary>
        /// Name for the type Bloomberg Listing and Regional Ticker.
        /// </summary>
        /// <value>Name for the type Bloomberg Listing and Regional Ticker.</value>
        [DataMember(Name = "bbgTicker", EmitDefaultValue = false)]
        public string BbgTicker { get; set; }

        /// <summary>
        /// Name for type BICCode, bank indentification code
        /// </summary>
        /// <value>Name for type BICCode, bank indentification code</value>
        [DataMember(Name = "bic", EmitDefaultValue = false)]
        public string Bic { get; set; }

        /// <summary>
        /// Name for the type CIK, Edgar Central Index Keys
        /// </summary>
        /// <value>Name for the type CIK, Edgar Central Index Keys</value>
        [DataMember(Name = "cik", EmitDefaultValue = false)]
        public string Cik { get; set; }

        /// <summary>
        /// Name for the type CRD, Central Registration Depository
        /// </summary>
        /// <value>Name for the type CRD, Central Registration Depository</value>
        [DataMember(Name = "crd", EmitDefaultValue = false)]
        public string Crd { get; set; }

        /// <summary>
        /// Name for the type CUSIP.
        /// </summary>
        /// <value>Name for the type CUSIP.</value>
        [DataMember(Name = "cusip", EmitDefaultValue = false)]
        public string Cusip { get; set; }

        /// <summary>
        /// Name for the type DUNS, Dun&amp;Bradstreet.
        /// </summary>
        /// <value>Name for the type DUNS, Dun&amp;Bradstreet.</value>
        [DataMember(Name = "duns", EmitDefaultValue = false)]
        public string Duns { get; set; }

        /// <summary>
        /// Name for the type EmployerIdentificationNumber, EIN.
        /// </summary>
        /// <value>Name for the type EmployerIdentificationNumber, EIN.</value>
        [DataMember(Name = "ein", EmitDefaultValue = false)]
        public string Ein { get; set; }

        /// <summary>
        /// Name for the type FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier.
        /// </summary>
        /// <value>Name for the type FactSet Identifier, FactSet -E,-S,-R, -L Permanent Identifier.</value>
        [DataMember(Name = "factsetId", EmitDefaultValue = false)]
        public string FactsetId { get; set; }

        /// <summary>
        /// Name for the type FitchCreditRating, Fitch Ratings Identifier.
        /// </summary>
        /// <value>Name for the type FitchCreditRating, Fitch Ratings Identifier.</value>
        [DataMember(Name = "fitch", EmitDefaultValue = false)]
        public string Fitch { get; set; }

        /// <summary>
        /// Name for the type GVKEY, Compustat Global Company Key.
        /// </summary>
        /// <value>Name for the type GVKEY, Compustat Global Company Key.</value>
        [DataMember(Name = "gvkey", EmitDefaultValue = false)]
        public string Gvkey { get; set; }

        /// <summary>
        /// Name for the type GVKEY+IID, Compustat Global Company Key and Issue Identifier.
        /// </summary>
        /// <value>Name for the type GVKEY+IID, Compustat Global Company Key and Issue Identifier.</value>
        [DataMember(Name = "gvkeyIid", EmitDefaultValue = false)]
        public string GvkeyIid { get; set; }

        /// <summary>
        /// Name for the type ISIN.
        /// </summary>
        /// <value>Name for the type ISIN.</value>
        [DataMember(Name = "isin", EmitDefaultValue = false)]
        public string Isin { get; set; }

        /// <summary>
        /// Name for the type JCN , Japanese Corporate Number.
        /// </summary>
        /// <value>Name for the type JCN , Japanese Corporate Number.</value>
        [DataMember(Name = "jcn", EmitDefaultValue = false)]
        public string Jcn { get; set; }

        /// <summary>
        /// Name for the type LegalEntityIdentifier, LEI.
        /// </summary>
        /// <value>Name for the type LegalEntityIdentifier, LEI.</value>
        [DataMember(Name = "lei", EmitDefaultValue = false)]
        public string Lei { get; set; }

        /// <summary>
        /// Name for the type LXID, Markit Syndicated Loan Identifier.
        /// </summary>
        /// <value>Name for the type LXID, Markit Syndicated Loan Identifier.</value>
        [DataMember(Name = "lxid", EmitDefaultValue = false)]
        public string Lxid { get; set; }

        /// <summary>
        /// Name for the type MoodysIssuer, Moody&#39;s Ratings Identifier.
        /// </summary>
        /// <value>Name for the type MoodysIssuer, Moody&#39;s Ratings Identifier.</value>
        [DataMember(Name = "md", EmitDefaultValue = false)]
        public string Md { get; set; }

        /// <summary>
        /// Name for the type RedCode, Markit Reference Entity Identifier.
        /// </summary>
        /// <value>Name for the type RedCode, Markit Reference Entity Identifier.</value>
        [DataMember(Name = "redCode", EmitDefaultValue = false)]
        public string RedCode { get; set; }

        /// <summary>
        /// Name for the type FederalReserveRSSDIdentifier, RSSD.
        /// </summary>
        /// <value>Name for the type FederalReserveRSSDIdentifier, RSSD.</value>
        [DataMember(Name = "rssd", EmitDefaultValue = false)]
        public string Rssd { get; set; }

        /// <summary>
        /// Name for the type SEDOL.
        /// </summary>
        /// <value>Name for the type SEDOL.</value>
        [DataMember(Name = "sedol", EmitDefaultValue = false)]
        public string Sedol { get; set; }

        /// <summary>
        /// Name for the type S&amp;PRating, S&amp;P Ratings Identifier.
        /// </summary>
        /// <value>Name for the type S&amp;PRating, S&amp;P Ratings Identifier.</value>
        [DataMember(Name = "spr", EmitDefaultValue = false)]
        public string Spr { get; set; }

        /// <summary>
        /// Name for the type PriceTicker.
        /// </summary>
        /// <value>Name for the type PriceTicker.</value>
        [DataMember(Name = "ticker", EmitDefaultValue = false)]
        public string Ticker { get; set; }

        /// <summary>
        /// Name for the type TickerExch.
        /// </summary>
        /// <value>Name for the type TickerExch.</value>
        [DataMember(Name = "tickerExchange", EmitDefaultValue = false)]
        public string TickerExchange { get; set; }

        /// <summary>
        /// Name for the type TickerRegion
        /// </summary>
        /// <value>Name for the type TickerRegion</value>
        [DataMember(Name = "tickerRegion", EmitDefaultValue = false)]
        public string TickerRegion { get; set; }

        /// <summary>
        /// Name for the type UKCompanyHouse
        /// </summary>
        /// <value>Name for the type UKCompanyHouse</value>
        [DataMember(Name = "ukch", EmitDefaultValue = false)]
        public string Ukch { get; set; }

        /// <summary>
        /// Name for the type VALOR, Valoren (\&quot;Valor\&quot;) Identification.
        /// </summary>
        /// <value>Name for the type VALOR, Valoren (\&quot;Valor\&quot;) Identification.</value>
        [DataMember(Name = "valoren", EmitDefaultValue = false)]
        public string Valoren { get; set; }

        /// <summary>
        /// Name for the type WKN, German Securities Identification.
        /// </summary>
        /// <value>Name for the type WKN, German Securities Identification.</value>
        [DataMember(Name = "wkn", EmitDefaultValue = false)]
        public string Wkn { get; set; }

        /// <summary>
        /// Any additional context information along with other input values that need to be saved for an entity during search.  To be used by Managed Service for any unmapped records.  This is applicable when saving the records with clientId and universeId specified. 
        /// </summary>
        /// <value>Any additional context information along with other input values that need to be saved for an entity during search.  To be used by Managed Service for any unmapped records.  This is applicable when saving the records with clientId and universeId specified. </value>
        [DataMember(Name = "additionalContext", EmitDefaultValue = false)]
        public Dictionary<string, string> AdditionalContext { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EntityMatchRequestInput {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Priority: ").Append(Priority).Append("\n");
            sb.Append("  BbgFigi: ").Append(BbgFigi).Append("\n");
            sb.Append("  BbgTicker: ").Append(BbgTicker).Append("\n");
            sb.Append("  Bic: ").Append(Bic).Append("\n");
            sb.Append("  Cik: ").Append(Cik).Append("\n");
            sb.Append("  Crd: ").Append(Crd).Append("\n");
            sb.Append("  Cusip: ").Append(Cusip).Append("\n");
            sb.Append("  Duns: ").Append(Duns).Append("\n");
            sb.Append("  Ein: ").Append(Ein).Append("\n");
            sb.Append("  FactsetId: ").Append(FactsetId).Append("\n");
            sb.Append("  Fitch: ").Append(Fitch).Append("\n");
            sb.Append("  Gvkey: ").Append(Gvkey).Append("\n");
            sb.Append("  GvkeyIid: ").Append(GvkeyIid).Append("\n");
            sb.Append("  Isin: ").Append(Isin).Append("\n");
            sb.Append("  Jcn: ").Append(Jcn).Append("\n");
            sb.Append("  Lei: ").Append(Lei).Append("\n");
            sb.Append("  Lxid: ").Append(Lxid).Append("\n");
            sb.Append("  Md: ").Append(Md).Append("\n");
            sb.Append("  RedCode: ").Append(RedCode).Append("\n");
            sb.Append("  Rssd: ").Append(Rssd).Append("\n");
            sb.Append("  Sedol: ").Append(Sedol).Append("\n");
            sb.Append("  Spr: ").Append(Spr).Append("\n");
            sb.Append("  Ticker: ").Append(Ticker).Append("\n");
            sb.Append("  TickerExchange: ").Append(TickerExchange).Append("\n");
            sb.Append("  TickerRegion: ").Append(TickerRegion).Append("\n");
            sb.Append("  Ukch: ").Append(Ukch).Append("\n");
            sb.Append("  Valoren: ").Append(Valoren).Append("\n");
            sb.Append("  Wkn: ").Append(Wkn).Append("\n");
            sb.Append("  AdditionalContext: ").Append(AdditionalContext).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as EntityMatchRequestInput);
        }

        /// <summary>
        /// Returns true if EntityMatchRequestInput instances are equal
        /// </summary>
        /// <param name="input">Instance of EntityMatchRequestInput to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntityMatchRequestInput input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
                ) && 
                (
                    this.Country == input.Country ||
                    (this.Country != null &&
                    this.Country.Equals(input.Country))
                ) && 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.Priority == input.Priority ||
                    this.Priority.Equals(input.Priority)
                ) && 
                (
                    this.BbgFigi == input.BbgFigi ||
                    (this.BbgFigi != null &&
                    this.BbgFigi.Equals(input.BbgFigi))
                ) && 
                (
                    this.BbgTicker == input.BbgTicker ||
                    (this.BbgTicker != null &&
                    this.BbgTicker.Equals(input.BbgTicker))
                ) && 
                (
                    this.Bic == input.Bic ||
                    (this.Bic != null &&
                    this.Bic.Equals(input.Bic))
                ) && 
                (
                    this.Cik == input.Cik ||
                    (this.Cik != null &&
                    this.Cik.Equals(input.Cik))
                ) && 
                (
                    this.Crd == input.Crd ||
                    (this.Crd != null &&
                    this.Crd.Equals(input.Crd))
                ) && 
                (
                    this.Cusip == input.Cusip ||
                    (this.Cusip != null &&
                    this.Cusip.Equals(input.Cusip))
                ) && 
                (
                    this.Duns == input.Duns ||
                    (this.Duns != null &&
                    this.Duns.Equals(input.Duns))
                ) && 
                (
                    this.Ein == input.Ein ||
                    (this.Ein != null &&
                    this.Ein.Equals(input.Ein))
                ) && 
                (
                    this.FactsetId == input.FactsetId ||
                    (this.FactsetId != null &&
                    this.FactsetId.Equals(input.FactsetId))
                ) && 
                (
                    this.Fitch == input.Fitch ||
                    (this.Fitch != null &&
                    this.Fitch.Equals(input.Fitch))
                ) && 
                (
                    this.Gvkey == input.Gvkey ||
                    (this.Gvkey != null &&
                    this.Gvkey.Equals(input.Gvkey))
                ) && 
                (
                    this.GvkeyIid == input.GvkeyIid ||
                    (this.GvkeyIid != null &&
                    this.GvkeyIid.Equals(input.GvkeyIid))
                ) && 
                (
                    this.Isin == input.Isin ||
                    (this.Isin != null &&
                    this.Isin.Equals(input.Isin))
                ) && 
                (
                    this.Jcn == input.Jcn ||
                    (this.Jcn != null &&
                    this.Jcn.Equals(input.Jcn))
                ) && 
                (
                    this.Lei == input.Lei ||
                    (this.Lei != null &&
                    this.Lei.Equals(input.Lei))
                ) && 
                (
                    this.Lxid == input.Lxid ||
                    (this.Lxid != null &&
                    this.Lxid.Equals(input.Lxid))
                ) && 
                (
                    this.Md == input.Md ||
                    (this.Md != null &&
                    this.Md.Equals(input.Md))
                ) && 
                (
                    this.RedCode == input.RedCode ||
                    (this.RedCode != null &&
                    this.RedCode.Equals(input.RedCode))
                ) && 
                (
                    this.Rssd == input.Rssd ||
                    (this.Rssd != null &&
                    this.Rssd.Equals(input.Rssd))
                ) && 
                (
                    this.Sedol == input.Sedol ||
                    (this.Sedol != null &&
                    this.Sedol.Equals(input.Sedol))
                ) && 
                (
                    this.Spr == input.Spr ||
                    (this.Spr != null &&
                    this.Spr.Equals(input.Spr))
                ) && 
                (
                    this.Ticker == input.Ticker ||
                    (this.Ticker != null &&
                    this.Ticker.Equals(input.Ticker))
                ) && 
                (
                    this.TickerExchange == input.TickerExchange ||
                    (this.TickerExchange != null &&
                    this.TickerExchange.Equals(input.TickerExchange))
                ) && 
                (
                    this.TickerRegion == input.TickerRegion ||
                    (this.TickerRegion != null &&
                    this.TickerRegion.Equals(input.TickerRegion))
                ) && 
                (
                    this.Ukch == input.Ukch ||
                    (this.Ukch != null &&
                    this.Ukch.Equals(input.Ukch))
                ) && 
                (
                    this.Valoren == input.Valoren ||
                    (this.Valoren != null &&
                    this.Valoren.Equals(input.Valoren))
                ) && 
                (
                    this.Wkn == input.Wkn ||
                    (this.Wkn != null &&
                    this.Wkn.Equals(input.Wkn))
                ) && 
                (
                    this.AdditionalContext == input.AdditionalContext ||
                    this.AdditionalContext != null &&
                    input.AdditionalContext != null &&
                    this.AdditionalContext.SequenceEqual(input.AdditionalContext)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.ClientId != null)
                {
                    hashCode = (hashCode * 59) + this.ClientId.GetHashCode();
                }
                if (this.Country != null)
                {
                    hashCode = (hashCode * 59) + this.Country.GetHashCode();
                }
                if (this.State != null)
                {
                    hashCode = (hashCode * 59) + this.State.GetHashCode();
                }
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Priority.GetHashCode();
                if (this.BbgFigi != null)
                {
                    hashCode = (hashCode * 59) + this.BbgFigi.GetHashCode();
                }
                if (this.BbgTicker != null)
                {
                    hashCode = (hashCode * 59) + this.BbgTicker.GetHashCode();
                }
                if (this.Bic != null)
                {
                    hashCode = (hashCode * 59) + this.Bic.GetHashCode();
                }
                if (this.Cik != null)
                {
                    hashCode = (hashCode * 59) + this.Cik.GetHashCode();
                }
                if (this.Crd != null)
                {
                    hashCode = (hashCode * 59) + this.Crd.GetHashCode();
                }
                if (this.Cusip != null)
                {
                    hashCode = (hashCode * 59) + this.Cusip.GetHashCode();
                }
                if (this.Duns != null)
                {
                    hashCode = (hashCode * 59) + this.Duns.GetHashCode();
                }
                if (this.Ein != null)
                {
                    hashCode = (hashCode * 59) + this.Ein.GetHashCode();
                }
                if (this.FactsetId != null)
                {
                    hashCode = (hashCode * 59) + this.FactsetId.GetHashCode();
                }
                if (this.Fitch != null)
                {
                    hashCode = (hashCode * 59) + this.Fitch.GetHashCode();
                }
                if (this.Gvkey != null)
                {
                    hashCode = (hashCode * 59) + this.Gvkey.GetHashCode();
                }
                if (this.GvkeyIid != null)
                {
                    hashCode = (hashCode * 59) + this.GvkeyIid.GetHashCode();
                }
                if (this.Isin != null)
                {
                    hashCode = (hashCode * 59) + this.Isin.GetHashCode();
                }
                if (this.Jcn != null)
                {
                    hashCode = (hashCode * 59) + this.Jcn.GetHashCode();
                }
                if (this.Lei != null)
                {
                    hashCode = (hashCode * 59) + this.Lei.GetHashCode();
                }
                if (this.Lxid != null)
                {
                    hashCode = (hashCode * 59) + this.Lxid.GetHashCode();
                }
                if (this.Md != null)
                {
                    hashCode = (hashCode * 59) + this.Md.GetHashCode();
                }
                if (this.RedCode != null)
                {
                    hashCode = (hashCode * 59) + this.RedCode.GetHashCode();
                }
                if (this.Rssd != null)
                {
                    hashCode = (hashCode * 59) + this.Rssd.GetHashCode();
                }
                if (this.Sedol != null)
                {
                    hashCode = (hashCode * 59) + this.Sedol.GetHashCode();
                }
                if (this.Spr != null)
                {
                    hashCode = (hashCode * 59) + this.Spr.GetHashCode();
                }
                if (this.Ticker != null)
                {
                    hashCode = (hashCode * 59) + this.Ticker.GetHashCode();
                }
                if (this.TickerExchange != null)
                {
                    hashCode = (hashCode * 59) + this.TickerExchange.GetHashCode();
                }
                if (this.TickerRegion != null)
                {
                    hashCode = (hashCode * 59) + this.TickerRegion.GetHashCode();
                }
                if (this.Ukch != null)
                {
                    hashCode = (hashCode * 59) + this.Ukch.GetHashCode();
                }
                if (this.Valoren != null)
                {
                    hashCode = (hashCode * 59) + this.Valoren.GetHashCode();
                }
                if (this.Wkn != null)
                {
                    hashCode = (hashCode * 59) + this.Wkn.GetHashCode();
                }
                if (this.AdditionalContext != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalContext.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            // Country (string) maxLength
            if (this.Country != null && this.Country.Length > 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Country, length must be less than 2.", new [] { "Country" });
            }

            // Country (string) minLength
            if (this.Country != null && this.Country.Length < 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Country, length must be greater than 2.", new [] { "Country" });
            }

            // State (string) maxLength
            if (this.State != null && this.State.Length > 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for State, length must be less than 2.", new [] { "State" });
            }

            // State (string) minLength
            if (this.State != null && this.State.Length < 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for State, length must be greater than 2.", new [] { "State" });
            }

            yield break;
        }
    }

}

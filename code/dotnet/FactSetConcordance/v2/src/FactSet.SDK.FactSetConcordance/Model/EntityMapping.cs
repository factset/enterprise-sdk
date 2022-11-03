/*
 * FactSet Concordance API
 *
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are two types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
 *
 * The version of the OpenAPI document: 2.4.0
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
    /// Concordance Company Entity Mapping object. Shows the mapping detail related to user&#39;s universe. 
    /// </summary>
    [DataContract(Name = "EntityMapping")]
    public partial class EntityMapping : IEquatable<EntityMapping>, IValidatableObject
    {
        /// <summary>
        /// Current status of the entity mapping.
        /// </summary>
        /// <value>Current status of the entity mapping.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum MapStatusEnum
        {
            /// <summary>
            /// Enum MAPPED for value: MAPPED
            /// </summary>
            [EnumMember(Value = "MAPPED")]
            MAPPED = 1,

            /// <summary>
            /// Enum UNMAPPED for value: UNMAPPED
            /// </summary>
            [EnumMember(Value = "UNMAPPED")]
            UNMAPPED = 2,

            /// <summary>
            /// Enum INDETERMINATE for value: INDETERMINATE
            /// </summary>
            [EnumMember(Value = "INDETERMINATE")]
            INDETERMINATE = 3

        }


        /// <summary>
        /// Current status of the entity mapping.
        /// </summary>
        /// <value>Current status of the entity mapping.</value>
        [DataMember(Name = "mapStatus", EmitDefaultValue = true)]
        public MapStatusEnum? MapStatus { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityMapping" /> class.
        /// </summary>
        /// <param name="entityId">FactSet Entity Identifier of the entity matched to the submitted entity.</param>
        /// <param name="entityName">Full name corresponding to the matched entity..</param>
        /// <param name="clientId">User-defined unique identifier provided by the user in the request.</param>
        /// <param name="clientName">Name of the entity to match as specified in the request..</param>
        /// <param name="clientCountry">ISO2 country code specified in the request.</param>
        /// <param name="clientState">State code specified in the request.</param>
        /// <param name="clientPriority">Priority associated to the id..</param>
        /// <param name="clientBbgFigi">Name as provided by the user for the type Bloomberg listing/regional/security id..</param>
        /// <param name="clientBbgTicker">Name as provided by the user for the type Bloomberg listing and regional ticker..</param>
        /// <param name="clientBic">Name as provided by the user for the type BIC - Bank Indentification Code..</param>
        /// <param name="clientCik">Name as provided by the user for the type CIK - Edgar Central Index Keys..</param>
        /// <param name="clientCrd">Name as provided by the user for the type CRD - Central Registration Depository..</param>
        /// <param name="clientCusip">Name as provided by the user for the type CUSIP..</param>
        /// <param name="clientDuns">Name as provided by the user for the type DUNS - Dun &amp; Bradstreet Data Universal Numbering System..</param>
        /// <param name="clientEin">Name as provided by the user for the type EIN - Employer Identification Number..</param>
        /// <param name="clientFitch">Name as provided by the user for the type Fitch - Fitch Ratings Identifier..</param>
        /// <param name="clientIsin">Name as provided by the user for the type ISIN - International Securities Identification Number..</param>
        /// <param name="clientLei">Name as provided by the user for the type LEI - Legal Entity Identifier..</param>
        /// <param name="clientMd">Name as provided by the user for the type Moody&#39;s ratings identifier..</param>
        /// <param name="clientRssd">Name as provided by the user for the type RSSD - Federal Reserve RSSD Identifier..</param>
        /// <param name="clientSedol">Name as provided by the user for the type SEDOL..</param>
        /// <param name="clientSpr">Name as provided by the user for the type S&amp;P ratings identifier..</param>
        /// <param name="clientTicker">Name as provided by the user for the type price ticker..</param>
        /// <param name="clientTickerExchange">Name as provided by the user for the type ticker exchange..</param>
        /// <param name="clientTickerRegion">Name as provided by the user for the type ticker region..</param>
        /// <param name="clientUkch">Name as provided by the user for the type UK company house identifier..</param>
        /// <param name="clientValoren">Name as provided by the user for the type Valoren - Valor Identification..</param>
        /// <param name="clientWkn">Name as provided by the user for the type WKN - German Securities Identification..</param>
        /// <param name="clientUrl">URL specified in the request.</param>
        /// <param name="createdTime">Time when entity was created in UTC..</param>
        /// <param name="updatedTime">Time when the submitted entity was last updated in UTC..</param>
        /// <param name="mapStatus">Current status of the entity mapping..</param>
        /// <param name="universeId">The universe this mapping belongs to. Only set in v2 endpoints .</param>
        public EntityMapping(string entityId = default(string), string entityName = default(string), string clientId = default(string), string clientName = default(string), string clientCountry = default(string), string clientState = default(string), string clientPriority = default(string), string clientBbgFigi = default(string), string clientBbgTicker = default(string), string clientBic = default(string), string clientCik = default(string), string clientCrd = default(string), string clientCusip = default(string), string clientDuns = default(string), string clientEin = default(string), string clientFitch = default(string), string clientIsin = default(string), string clientLei = default(string), string clientMd = default(string), string clientRssd = default(string), string clientSedol = default(string), string clientSpr = default(string), string clientTicker = default(string), string clientTickerExchange = default(string), string clientTickerRegion = default(string), string clientUkch = default(string), string clientValoren = default(string), string clientWkn = default(string), string clientUrl = default(string), DateTime? createdTime = default(DateTime?), DateTime? updatedTime = default(DateTime?), MapStatusEnum? mapStatus = default(MapStatusEnum?), int? universeId = default(int?))
        {
            this.EntityId = entityId;
            this.EntityName = entityName;
            this.ClientId = clientId;
            this.ClientName = clientName;
            this.ClientCountry = clientCountry;
            this.ClientState = clientState;
            this.ClientPriority = clientPriority;
            this.ClientBbgFigi = clientBbgFigi;
            this.ClientBbgTicker = clientBbgTicker;
            this.ClientBic = clientBic;
            this.ClientCik = clientCik;
            this.ClientCrd = clientCrd;
            this.ClientCusip = clientCusip;
            this.ClientDuns = clientDuns;
            this.ClientEin = clientEin;
            this.ClientFitch = clientFitch;
            this.ClientIsin = clientIsin;
            this.ClientLei = clientLei;
            this.ClientMd = clientMd;
            this.ClientRssd = clientRssd;
            this.ClientSedol = clientSedol;
            this.ClientSpr = clientSpr;
            this.ClientTicker = clientTicker;
            this.ClientTickerExchange = clientTickerExchange;
            this.ClientTickerRegion = clientTickerRegion;
            this.ClientUkch = clientUkch;
            this.ClientValoren = clientValoren;
            this.ClientWkn = clientWkn;
            this.ClientUrl = clientUrl;
            this.CreatedTime = createdTime;
            this.UpdatedTime = updatedTime;
            this.MapStatus = mapStatus;
            this.UniverseId = universeId;
        }

        /// <summary>
        /// FactSet Entity Identifier of the entity matched to the submitted entity
        /// </summary>
        /// <value>FactSet Entity Identifier of the entity matched to the submitted entity</value>
        [DataMember(Name = "entityId", EmitDefaultValue = true)]
        public string EntityId { get; set; }

        /// <summary>
        /// Full name corresponding to the matched entity.
        /// </summary>
        /// <value>Full name corresponding to the matched entity.</value>
        [DataMember(Name = "entityName", EmitDefaultValue = true)]
        public string EntityName { get; set; }

        /// <summary>
        /// User-defined unique identifier provided by the user in the request
        /// </summary>
        /// <value>User-defined unique identifier provided by the user in the request</value>
        [DataMember(Name = "clientId", EmitDefaultValue = true)]
        public string ClientId { get; set; }

        /// <summary>
        /// Name of the entity to match as specified in the request.
        /// </summary>
        /// <value>Name of the entity to match as specified in the request.</value>
        [DataMember(Name = "clientName", EmitDefaultValue = true)]
        public string ClientName { get; set; }

        /// <summary>
        /// ISO2 country code specified in the request
        /// </summary>
        /// <value>ISO2 country code specified in the request</value>
        [DataMember(Name = "clientCountry", EmitDefaultValue = true)]
        public string ClientCountry { get; set; }

        /// <summary>
        /// State code specified in the request
        /// </summary>
        /// <value>State code specified in the request</value>
        [DataMember(Name = "clientState", EmitDefaultValue = true)]
        public string ClientState { get; set; }

        /// <summary>
        /// Priority associated to the id.
        /// </summary>
        /// <value>Priority associated to the id.</value>
        [DataMember(Name = "clientPriority", EmitDefaultValue = true)]
        public string ClientPriority { get; set; }

        /// <summary>
        /// Name as provided by the user for the type Bloomberg listing/regional/security id.
        /// </summary>
        /// <value>Name as provided by the user for the type Bloomberg listing/regional/security id.</value>
        [DataMember(Name = "clientBbgFigi", EmitDefaultValue = true)]
        public string ClientBbgFigi { get; set; }

        /// <summary>
        /// Name as provided by the user for the type Bloomberg listing and regional ticker.
        /// </summary>
        /// <value>Name as provided by the user for the type Bloomberg listing and regional ticker.</value>
        [DataMember(Name = "clientBbgTicker", EmitDefaultValue = true)]
        public string ClientBbgTicker { get; set; }

        /// <summary>
        /// Name as provided by the user for the type BIC - Bank Indentification Code.
        /// </summary>
        /// <value>Name as provided by the user for the type BIC - Bank Indentification Code.</value>
        [DataMember(Name = "clientBic", EmitDefaultValue = true)]
        public string ClientBic { get; set; }

        /// <summary>
        /// Name as provided by the user for the type CIK - Edgar Central Index Keys.
        /// </summary>
        /// <value>Name as provided by the user for the type CIK - Edgar Central Index Keys.</value>
        [DataMember(Name = "clientCik", EmitDefaultValue = true)]
        public string ClientCik { get; set; }

        /// <summary>
        /// Name as provided by the user for the type CRD - Central Registration Depository.
        /// </summary>
        /// <value>Name as provided by the user for the type CRD - Central Registration Depository.</value>
        [DataMember(Name = "clientCrd", EmitDefaultValue = true)]
        public string ClientCrd { get; set; }

        /// <summary>
        /// Name as provided by the user for the type CUSIP.
        /// </summary>
        /// <value>Name as provided by the user for the type CUSIP.</value>
        [DataMember(Name = "clientCusip", EmitDefaultValue = true)]
        public string ClientCusip { get; set; }

        /// <summary>
        /// Name as provided by the user for the type DUNS - Dun &amp; Bradstreet Data Universal Numbering System.
        /// </summary>
        /// <value>Name as provided by the user for the type DUNS - Dun &amp; Bradstreet Data Universal Numbering System.</value>
        [DataMember(Name = "clientDuns", EmitDefaultValue = true)]
        public string ClientDuns { get; set; }

        /// <summary>
        /// Name as provided by the user for the type EIN - Employer Identification Number.
        /// </summary>
        /// <value>Name as provided by the user for the type EIN - Employer Identification Number.</value>
        [DataMember(Name = "clientEin", EmitDefaultValue = true)]
        public string ClientEin { get; set; }

        /// <summary>
        /// Name as provided by the user for the type Fitch - Fitch Ratings Identifier.
        /// </summary>
        /// <value>Name as provided by the user for the type Fitch - Fitch Ratings Identifier.</value>
        [DataMember(Name = "clientFitch", EmitDefaultValue = true)]
        public string ClientFitch { get; set; }

        /// <summary>
        /// Name as provided by the user for the type ISIN - International Securities Identification Number.
        /// </summary>
        /// <value>Name as provided by the user for the type ISIN - International Securities Identification Number.</value>
        [DataMember(Name = "clientIsin", EmitDefaultValue = true)]
        public string ClientIsin { get; set; }

        /// <summary>
        /// Name as provided by the user for the type LEI - Legal Entity Identifier.
        /// </summary>
        /// <value>Name as provided by the user for the type LEI - Legal Entity Identifier.</value>
        [DataMember(Name = "clientLei", EmitDefaultValue = true)]
        public string ClientLei { get; set; }

        /// <summary>
        /// Name as provided by the user for the type Moody&#39;s ratings identifier.
        /// </summary>
        /// <value>Name as provided by the user for the type Moody&#39;s ratings identifier.</value>
        [DataMember(Name = "clientMd", EmitDefaultValue = true)]
        public string ClientMd { get; set; }

        /// <summary>
        /// Name as provided by the user for the type RSSD - Federal Reserve RSSD Identifier.
        /// </summary>
        /// <value>Name as provided by the user for the type RSSD - Federal Reserve RSSD Identifier.</value>
        [DataMember(Name = "clientRssd", EmitDefaultValue = true)]
        public string ClientRssd { get; set; }

        /// <summary>
        /// Name as provided by the user for the type SEDOL.
        /// </summary>
        /// <value>Name as provided by the user for the type SEDOL.</value>
        [DataMember(Name = "clientSedol", EmitDefaultValue = true)]
        public string ClientSedol { get; set; }

        /// <summary>
        /// Name as provided by the user for the type S&amp;P ratings identifier.
        /// </summary>
        /// <value>Name as provided by the user for the type S&amp;P ratings identifier.</value>
        [DataMember(Name = "clientSpr", EmitDefaultValue = true)]
        public string ClientSpr { get; set; }

        /// <summary>
        /// Name as provided by the user for the type price ticker.
        /// </summary>
        /// <value>Name as provided by the user for the type price ticker.</value>
        [DataMember(Name = "clientTicker", EmitDefaultValue = true)]
        public string ClientTicker { get; set; }

        /// <summary>
        /// Name as provided by the user for the type ticker exchange.
        /// </summary>
        /// <value>Name as provided by the user for the type ticker exchange.</value>
        [DataMember(Name = "clientTickerExchange", EmitDefaultValue = true)]
        public string ClientTickerExchange { get; set; }

        /// <summary>
        /// Name as provided by the user for the type ticker region.
        /// </summary>
        /// <value>Name as provided by the user for the type ticker region.</value>
        [DataMember(Name = "clientTickerRegion", EmitDefaultValue = true)]
        public string ClientTickerRegion { get; set; }

        /// <summary>
        /// Name as provided by the user for the type UK company house identifier.
        /// </summary>
        /// <value>Name as provided by the user for the type UK company house identifier.</value>
        [DataMember(Name = "clientUkch", EmitDefaultValue = true)]
        public string ClientUkch { get; set; }

        /// <summary>
        /// Name as provided by the user for the type Valoren - Valor Identification.
        /// </summary>
        /// <value>Name as provided by the user for the type Valoren - Valor Identification.</value>
        [DataMember(Name = "clientValoren", EmitDefaultValue = true)]
        public string ClientValoren { get; set; }

        /// <summary>
        /// Name as provided by the user for the type WKN - German Securities Identification.
        /// </summary>
        /// <value>Name as provided by the user for the type WKN - German Securities Identification.</value>
        [DataMember(Name = "clientWkn", EmitDefaultValue = true)]
        public string ClientWkn { get; set; }

        /// <summary>
        /// URL specified in the request
        /// </summary>
        /// <value>URL specified in the request</value>
        [DataMember(Name = "clientUrl", EmitDefaultValue = true)]
        public string ClientUrl { get; set; }

        /// <summary>
        /// Time when entity was created in UTC.
        /// </summary>
        /// <value>Time when entity was created in UTC.</value>
        [DataMember(Name = "createdTime", EmitDefaultValue = true)]
        public DateTime? CreatedTime { get; set; }

        /// <summary>
        /// Time when the submitted entity was last updated in UTC.
        /// </summary>
        /// <value>Time when the submitted entity was last updated in UTC.</value>
        [DataMember(Name = "updatedTime", EmitDefaultValue = true)]
        public DateTime? UpdatedTime { get; set; }

        /// <summary>
        /// The universe this mapping belongs to. Only set in v2 endpoints 
        /// </summary>
        /// <value>The universe this mapping belongs to. Only set in v2 endpoints </value>
        [DataMember(Name = "universeId", EmitDefaultValue = true)]
        public int? UniverseId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EntityMapping {\n");
            sb.Append("  EntityId: ").Append(EntityId).Append("\n");
            sb.Append("  EntityName: ").Append(EntityName).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  ClientName: ").Append(ClientName).Append("\n");
            sb.Append("  ClientCountry: ").Append(ClientCountry).Append("\n");
            sb.Append("  ClientState: ").Append(ClientState).Append("\n");
            sb.Append("  ClientPriority: ").Append(ClientPriority).Append("\n");
            sb.Append("  ClientBbgFigi: ").Append(ClientBbgFigi).Append("\n");
            sb.Append("  ClientBbgTicker: ").Append(ClientBbgTicker).Append("\n");
            sb.Append("  ClientBic: ").Append(ClientBic).Append("\n");
            sb.Append("  ClientCik: ").Append(ClientCik).Append("\n");
            sb.Append("  ClientCrd: ").Append(ClientCrd).Append("\n");
            sb.Append("  ClientCusip: ").Append(ClientCusip).Append("\n");
            sb.Append("  ClientDuns: ").Append(ClientDuns).Append("\n");
            sb.Append("  ClientEin: ").Append(ClientEin).Append("\n");
            sb.Append("  ClientFitch: ").Append(ClientFitch).Append("\n");
            sb.Append("  ClientIsin: ").Append(ClientIsin).Append("\n");
            sb.Append("  ClientLei: ").Append(ClientLei).Append("\n");
            sb.Append("  ClientMd: ").Append(ClientMd).Append("\n");
            sb.Append("  ClientRssd: ").Append(ClientRssd).Append("\n");
            sb.Append("  ClientSedol: ").Append(ClientSedol).Append("\n");
            sb.Append("  ClientSpr: ").Append(ClientSpr).Append("\n");
            sb.Append("  ClientTicker: ").Append(ClientTicker).Append("\n");
            sb.Append("  ClientTickerExchange: ").Append(ClientTickerExchange).Append("\n");
            sb.Append("  ClientTickerRegion: ").Append(ClientTickerRegion).Append("\n");
            sb.Append("  ClientUkch: ").Append(ClientUkch).Append("\n");
            sb.Append("  ClientValoren: ").Append(ClientValoren).Append("\n");
            sb.Append("  ClientWkn: ").Append(ClientWkn).Append("\n");
            sb.Append("  ClientUrl: ").Append(ClientUrl).Append("\n");
            sb.Append("  CreatedTime: ").Append(CreatedTime).Append("\n");
            sb.Append("  UpdatedTime: ").Append(UpdatedTime).Append("\n");
            sb.Append("  MapStatus: ").Append(MapStatus).Append("\n");
            sb.Append("  UniverseId: ").Append(UniverseId).Append("\n");
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
            return this.Equals(input as EntityMapping);
        }

        /// <summary>
        /// Returns true if EntityMapping instances are equal
        /// </summary>
        /// <param name="input">Instance of EntityMapping to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntityMapping input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.EntityId == input.EntityId ||
                    (this.EntityId != null &&
                    this.EntityId.Equals(input.EntityId))
                ) && 
                (
                    this.EntityName == input.EntityName ||
                    (this.EntityName != null &&
                    this.EntityName.Equals(input.EntityName))
                ) && 
                (
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
                ) && 
                (
                    this.ClientName == input.ClientName ||
                    (this.ClientName != null &&
                    this.ClientName.Equals(input.ClientName))
                ) && 
                (
                    this.ClientCountry == input.ClientCountry ||
                    (this.ClientCountry != null &&
                    this.ClientCountry.Equals(input.ClientCountry))
                ) && 
                (
                    this.ClientState == input.ClientState ||
                    (this.ClientState != null &&
                    this.ClientState.Equals(input.ClientState))
                ) && 
                (
                    this.ClientPriority == input.ClientPriority ||
                    (this.ClientPriority != null &&
                    this.ClientPriority.Equals(input.ClientPriority))
                ) && 
                (
                    this.ClientBbgFigi == input.ClientBbgFigi ||
                    (this.ClientBbgFigi != null &&
                    this.ClientBbgFigi.Equals(input.ClientBbgFigi))
                ) && 
                (
                    this.ClientBbgTicker == input.ClientBbgTicker ||
                    (this.ClientBbgTicker != null &&
                    this.ClientBbgTicker.Equals(input.ClientBbgTicker))
                ) && 
                (
                    this.ClientBic == input.ClientBic ||
                    (this.ClientBic != null &&
                    this.ClientBic.Equals(input.ClientBic))
                ) && 
                (
                    this.ClientCik == input.ClientCik ||
                    (this.ClientCik != null &&
                    this.ClientCik.Equals(input.ClientCik))
                ) && 
                (
                    this.ClientCrd == input.ClientCrd ||
                    (this.ClientCrd != null &&
                    this.ClientCrd.Equals(input.ClientCrd))
                ) && 
                (
                    this.ClientCusip == input.ClientCusip ||
                    (this.ClientCusip != null &&
                    this.ClientCusip.Equals(input.ClientCusip))
                ) && 
                (
                    this.ClientDuns == input.ClientDuns ||
                    (this.ClientDuns != null &&
                    this.ClientDuns.Equals(input.ClientDuns))
                ) && 
                (
                    this.ClientEin == input.ClientEin ||
                    (this.ClientEin != null &&
                    this.ClientEin.Equals(input.ClientEin))
                ) && 
                (
                    this.ClientFitch == input.ClientFitch ||
                    (this.ClientFitch != null &&
                    this.ClientFitch.Equals(input.ClientFitch))
                ) && 
                (
                    this.ClientIsin == input.ClientIsin ||
                    (this.ClientIsin != null &&
                    this.ClientIsin.Equals(input.ClientIsin))
                ) && 
                (
                    this.ClientLei == input.ClientLei ||
                    (this.ClientLei != null &&
                    this.ClientLei.Equals(input.ClientLei))
                ) && 
                (
                    this.ClientMd == input.ClientMd ||
                    (this.ClientMd != null &&
                    this.ClientMd.Equals(input.ClientMd))
                ) && 
                (
                    this.ClientRssd == input.ClientRssd ||
                    (this.ClientRssd != null &&
                    this.ClientRssd.Equals(input.ClientRssd))
                ) && 
                (
                    this.ClientSedol == input.ClientSedol ||
                    (this.ClientSedol != null &&
                    this.ClientSedol.Equals(input.ClientSedol))
                ) && 
                (
                    this.ClientSpr == input.ClientSpr ||
                    (this.ClientSpr != null &&
                    this.ClientSpr.Equals(input.ClientSpr))
                ) && 
                (
                    this.ClientTicker == input.ClientTicker ||
                    (this.ClientTicker != null &&
                    this.ClientTicker.Equals(input.ClientTicker))
                ) && 
                (
                    this.ClientTickerExchange == input.ClientTickerExchange ||
                    (this.ClientTickerExchange != null &&
                    this.ClientTickerExchange.Equals(input.ClientTickerExchange))
                ) && 
                (
                    this.ClientTickerRegion == input.ClientTickerRegion ||
                    (this.ClientTickerRegion != null &&
                    this.ClientTickerRegion.Equals(input.ClientTickerRegion))
                ) && 
                (
                    this.ClientUkch == input.ClientUkch ||
                    (this.ClientUkch != null &&
                    this.ClientUkch.Equals(input.ClientUkch))
                ) && 
                (
                    this.ClientValoren == input.ClientValoren ||
                    (this.ClientValoren != null &&
                    this.ClientValoren.Equals(input.ClientValoren))
                ) && 
                (
                    this.ClientWkn == input.ClientWkn ||
                    (this.ClientWkn != null &&
                    this.ClientWkn.Equals(input.ClientWkn))
                ) && 
                (
                    this.ClientUrl == input.ClientUrl ||
                    (this.ClientUrl != null &&
                    this.ClientUrl.Equals(input.ClientUrl))
                ) && 
                (
                    this.CreatedTime == input.CreatedTime ||
                    (this.CreatedTime != null &&
                    this.CreatedTime.Equals(input.CreatedTime))
                ) && 
                (
                    this.UpdatedTime == input.UpdatedTime ||
                    (this.UpdatedTime != null &&
                    this.UpdatedTime.Equals(input.UpdatedTime))
                ) && 
                (
                    this.MapStatus == input.MapStatus ||
                    this.MapStatus.Equals(input.MapStatus)
                ) && 
                (
                    this.UniverseId == input.UniverseId ||
                    (this.UniverseId != null &&
                    this.UniverseId.Equals(input.UniverseId))
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
                if (this.EntityId != null)
                {
                    hashCode = (hashCode * 59) + this.EntityId.GetHashCode();
                }
                if (this.EntityName != null)
                {
                    hashCode = (hashCode * 59) + this.EntityName.GetHashCode();
                }
                if (this.ClientId != null)
                {
                    hashCode = (hashCode * 59) + this.ClientId.GetHashCode();
                }
                if (this.ClientName != null)
                {
                    hashCode = (hashCode * 59) + this.ClientName.GetHashCode();
                }
                if (this.ClientCountry != null)
                {
                    hashCode = (hashCode * 59) + this.ClientCountry.GetHashCode();
                }
                if (this.ClientState != null)
                {
                    hashCode = (hashCode * 59) + this.ClientState.GetHashCode();
                }
                if (this.ClientPriority != null)
                {
                    hashCode = (hashCode * 59) + this.ClientPriority.GetHashCode();
                }
                if (this.ClientBbgFigi != null)
                {
                    hashCode = (hashCode * 59) + this.ClientBbgFigi.GetHashCode();
                }
                if (this.ClientBbgTicker != null)
                {
                    hashCode = (hashCode * 59) + this.ClientBbgTicker.GetHashCode();
                }
                if (this.ClientBic != null)
                {
                    hashCode = (hashCode * 59) + this.ClientBic.GetHashCode();
                }
                if (this.ClientCik != null)
                {
                    hashCode = (hashCode * 59) + this.ClientCik.GetHashCode();
                }
                if (this.ClientCrd != null)
                {
                    hashCode = (hashCode * 59) + this.ClientCrd.GetHashCode();
                }
                if (this.ClientCusip != null)
                {
                    hashCode = (hashCode * 59) + this.ClientCusip.GetHashCode();
                }
                if (this.ClientDuns != null)
                {
                    hashCode = (hashCode * 59) + this.ClientDuns.GetHashCode();
                }
                if (this.ClientEin != null)
                {
                    hashCode = (hashCode * 59) + this.ClientEin.GetHashCode();
                }
                if (this.ClientFitch != null)
                {
                    hashCode = (hashCode * 59) + this.ClientFitch.GetHashCode();
                }
                if (this.ClientIsin != null)
                {
                    hashCode = (hashCode * 59) + this.ClientIsin.GetHashCode();
                }
                if (this.ClientLei != null)
                {
                    hashCode = (hashCode * 59) + this.ClientLei.GetHashCode();
                }
                if (this.ClientMd != null)
                {
                    hashCode = (hashCode * 59) + this.ClientMd.GetHashCode();
                }
                if (this.ClientRssd != null)
                {
                    hashCode = (hashCode * 59) + this.ClientRssd.GetHashCode();
                }
                if (this.ClientSedol != null)
                {
                    hashCode = (hashCode * 59) + this.ClientSedol.GetHashCode();
                }
                if (this.ClientSpr != null)
                {
                    hashCode = (hashCode * 59) + this.ClientSpr.GetHashCode();
                }
                if (this.ClientTicker != null)
                {
                    hashCode = (hashCode * 59) + this.ClientTicker.GetHashCode();
                }
                if (this.ClientTickerExchange != null)
                {
                    hashCode = (hashCode * 59) + this.ClientTickerExchange.GetHashCode();
                }
                if (this.ClientTickerRegion != null)
                {
                    hashCode = (hashCode * 59) + this.ClientTickerRegion.GetHashCode();
                }
                if (this.ClientUkch != null)
                {
                    hashCode = (hashCode * 59) + this.ClientUkch.GetHashCode();
                }
                if (this.ClientValoren != null)
                {
                    hashCode = (hashCode * 59) + this.ClientValoren.GetHashCode();
                }
                if (this.ClientWkn != null)
                {
                    hashCode = (hashCode * 59) + this.ClientWkn.GetHashCode();
                }
                if (this.ClientUrl != null)
                {
                    hashCode = (hashCode * 59) + this.ClientUrl.GetHashCode();
                }
                if (this.CreatedTime != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedTime.GetHashCode();
                }
                if (this.UpdatedTime != null)
                {
                    hashCode = (hashCode * 59) + this.UpdatedTime.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.MapStatus.GetHashCode();
                if (this.UniverseId != null)
                {
                    hashCode = (hashCode * 59) + this.UniverseId.GetHashCode();
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
            yield break;
        }
    }

}

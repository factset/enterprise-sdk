/*
 * FactSet Concordance API
 *
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
 *
 * The version of the OpenAPI document: 1.1.0
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
    /// Entity Match object showing the decision reached for each Entity. 
    /// </summary>
    [DataContract(Name = "EntityMatch")]
    public partial class EntityMatch : IEquatable<EntityMatch>, IValidatableObject
    {
        /// <summary>
        /// Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping. 
        /// </summary>
        /// <value>Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping. </value>
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
        /// Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping. 
        /// </summary>
        /// <value>Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping. </value>
        [DataMember(Name = "mapStatus", EmitDefaultValue = false)]
        public MapStatusEnum? MapStatus { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityMatch" /> class.
        /// </summary>
        /// <param name="taskId">Identifier denoting a specific Concordance task submitted by the user. This value will be null for /entity-match endpoint responses and is only available when using the \&quot;Bulk\&quot; workflow. .</param>
        /// <param name="rowIndex">Row number for match in the request or input file..</param>
        /// <param name="matchFlag">Flag denoting if the row is a match..</param>
        /// <param name="entityId">FactSet Entity Identifier of the entity matched respective to the requested Name submitted. For more detail, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) .</param>
        /// <param name="entityName">Full name corresponding to the matched entity..</param>
        /// <param name="url">URL of the matched entity..</param>
        /// <param name="mapStatus">Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping. .</param>
        /// <param name="similarityScore">Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. .</param>
        /// <param name="confidenceScore">Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence. .</param>
        /// <param name="countryCode">ISO2 country code corresponding to the location of the matched entity..</param>
        /// <param name="countryName">Country name corresponding to the location of the matched entity.</param>
        /// <param name="stateCode">Two character state code corresponding to the location of the matched entity..</param>
        /// <param name="stateName">State name corresponding to the location of the matched entity..</param>
        /// <param name="sicCode">Standard Industrial Classification (SIC) Code of the matched entity..</param>
        /// <param name="entityTypeCode">Code representing the entity type of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions..</param>
        /// <param name="entityTypeDescription">Description of of the matched entity&#39;s type..</param>
        /// <param name="entitySubTypeCode">Code representing the entity subtype of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions..</param>
        /// <param name="locationCity">City where the matched entity is located..</param>
        /// <param name="regionName">Region where the matched entity is located..</param>
        /// <param name="factsetIndustryCode">FactSet Industry Classification Code of the matched entity..</param>
        /// <param name="factsetIndustryName">Name of the matched entity&#39;s FactSet Industry Classification..</param>
        /// <param name="factsetSectorCode">Name of the matched entity&#39;s FactSet Sector Classification Code..</param>
        /// <param name="factsetSectorName">Name of the matched entity&#39;s FactSet Sector Classification..</param>
        /// <param name="parentName">Name of the matched entity&#39;s parent entity..</param>
        /// <param name="parentMatchFlag">Flag denoting that the matched entity is the parent of another match..</param>
        /// <param name="clientId">Unique Identifer provided by the user in the request to represent the entity Name being requested..</param>
        /// <param name="clientName">Name of the entity to match as specified in the request.</param>
        /// <param name="clientCountry">ISO2 country code specified in the request..</param>
        /// <param name="clientState">State code specified in the request..</param>
        /// <param name="clientUrl">URL specified in the request..</param>
        /// <param name="nameMatchString">String on which the Concordance algorithm mapped the submitted entity..</param>
        /// <param name="nameMatchSource">Type of name that the nameMatchString matched..</param>
        public EntityMatch(int taskId = default(int), int rowIndex = default(int), bool matchFlag = default(bool), string entityId = default(string), string entityName = default(string), string url = default(string), MapStatusEnum? mapStatus = default(MapStatusEnum?), double similarityScore = default(double), double confidenceScore = default(double), string countryCode = default(string), string countryName = default(string), string stateCode = default(string), string stateName = default(string), string sicCode = default(string), string entityTypeCode = default(string), string entityTypeDescription = default(string), string entitySubTypeCode = default(string), string locationCity = default(string), string regionName = default(string), string factsetIndustryCode = default(string), string factsetIndustryName = default(string), string factsetSectorCode = default(string), string factsetSectorName = default(string), string parentName = default(string), bool parentMatchFlag = default(bool), string clientId = default(string), string clientName = default(string), string clientCountry = default(string), string clientState = default(string), string clientUrl = default(string), string nameMatchString = default(string), string nameMatchSource = default(string))
        {
            this.TaskId = taskId;
            this.RowIndex = rowIndex;
            this.MatchFlag = matchFlag;
            this.EntityId = entityId;
            this.EntityName = entityName;
            this.Url = url;
            this.MapStatus = mapStatus;
            this.SimilarityScore = similarityScore;
            this.ConfidenceScore = confidenceScore;
            this.CountryCode = countryCode;
            this.CountryName = countryName;
            this.StateCode = stateCode;
            this.StateName = stateName;
            this.SicCode = sicCode;
            this.EntityTypeCode = entityTypeCode;
            this.EntityTypeDescription = entityTypeDescription;
            this.EntitySubTypeCode = entitySubTypeCode;
            this.LocationCity = locationCity;
            this.RegionName = regionName;
            this.FactsetIndustryCode = factsetIndustryCode;
            this.FactsetIndustryName = factsetIndustryName;
            this.FactsetSectorCode = factsetSectorCode;
            this.FactsetSectorName = factsetSectorName;
            this.ParentName = parentName;
            this.ParentMatchFlag = parentMatchFlag;
            this.ClientId = clientId;
            this.ClientName = clientName;
            this.ClientCountry = clientCountry;
            this.ClientState = clientState;
            this.ClientUrl = clientUrl;
            this.NameMatchString = nameMatchString;
            this.NameMatchSource = nameMatchSource;
        }

        /// <summary>
        /// Identifier denoting a specific Concordance task submitted by the user. This value will be null for /entity-match endpoint responses and is only available when using the \&quot;Bulk\&quot; workflow. 
        /// </summary>
        /// <value>Identifier denoting a specific Concordance task submitted by the user. This value will be null for /entity-match endpoint responses and is only available when using the \&quot;Bulk\&quot; workflow. </value>
        [DataMember(Name = "taskId", EmitDefaultValue = false)]
        public int TaskId { get; set; }

        /// <summary>
        /// Row number for match in the request or input file.
        /// </summary>
        /// <value>Row number for match in the request or input file.</value>
        [DataMember(Name = "rowIndex", EmitDefaultValue = false)]
        public int RowIndex { get; set; }

        /// <summary>
        /// Flag denoting if the row is a match.
        /// </summary>
        /// <value>Flag denoting if the row is a match.</value>
        [DataMember(Name = "matchFlag", EmitDefaultValue = true)]
        public bool MatchFlag { get; set; }

        /// <summary>
        /// FactSet Entity Identifier of the entity matched respective to the requested Name submitted. For more detail, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) 
        /// </summary>
        /// <value>FactSet Entity Identifier of the entity matched respective to the requested Name submitted. For more detail, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881) </value>
        [DataMember(Name = "entityId", EmitDefaultValue = false)]
        public string EntityId { get; set; }

        /// <summary>
        /// Full name corresponding to the matched entity.
        /// </summary>
        /// <value>Full name corresponding to the matched entity.</value>
        [DataMember(Name = "entityName", EmitDefaultValue = false)]
        public string EntityName { get; set; }

        /// <summary>
        /// URL of the matched entity.
        /// </summary>
        /// <value>URL of the matched entity.</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. 
        /// </summary>
        /// <value>Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. </value>
        [DataMember(Name = "similarityScore", EmitDefaultValue = false)]
        public double SimilarityScore { get; set; }

        /// <summary>
        /// Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence. 
        /// </summary>
        /// <value>Additional statistic calculated by the algorithm that is used to ensure the validity of the match result. A confidenceScore of 1 is the highest level of confidence. </value>
        [DataMember(Name = "confidenceScore", EmitDefaultValue = false)]
        public double ConfidenceScore { get; set; }

        /// <summary>
        /// ISO2 country code corresponding to the location of the matched entity.
        /// </summary>
        /// <value>ISO2 country code corresponding to the location of the matched entity.</value>
        [DataMember(Name = "countryCode", EmitDefaultValue = false)]
        public string CountryCode { get; set; }

        /// <summary>
        /// Country name corresponding to the location of the matched entity
        /// </summary>
        /// <value>Country name corresponding to the location of the matched entity</value>
        [DataMember(Name = "countryName", EmitDefaultValue = false)]
        public string CountryName { get; set; }

        /// <summary>
        /// Two character state code corresponding to the location of the matched entity.
        /// </summary>
        /// <value>Two character state code corresponding to the location of the matched entity.</value>
        [DataMember(Name = "stateCode", EmitDefaultValue = false)]
        public string StateCode { get; set; }

        /// <summary>
        /// State name corresponding to the location of the matched entity.
        /// </summary>
        /// <value>State name corresponding to the location of the matched entity.</value>
        [DataMember(Name = "stateName", EmitDefaultValue = false)]
        public string StateName { get; set; }

        /// <summary>
        /// Standard Industrial Classification (SIC) Code of the matched entity.
        /// </summary>
        /// <value>Standard Industrial Classification (SIC) Code of the matched entity.</value>
        [DataMember(Name = "sicCode", EmitDefaultValue = false)]
        public string SicCode { get; set; }

        /// <summary>
        /// Code representing the entity type of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions.
        /// </summary>
        /// <value>Code representing the entity type of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions.</value>
        [DataMember(Name = "entityTypeCode", EmitDefaultValue = false)]
        public string EntityTypeCode { get; set; }

        /// <summary>
        /// Description of of the matched entity&#39;s type.
        /// </summary>
        /// <value>Description of of the matched entity&#39;s type.</value>
        [DataMember(Name = "entityTypeDescription", EmitDefaultValue = false)]
        public string EntityTypeDescription { get; set; }

        /// <summary>
        /// Code representing the entity subtype of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions.
        /// </summary>
        /// <value>Code representing the entity subtype of the matched entity. See the related request parameter for a table of all Codes and their respective descriptions.</value>
        [DataMember(Name = "entitySubTypeCode", EmitDefaultValue = false)]
        public string EntitySubTypeCode { get; set; }

        /// <summary>
        /// City where the matched entity is located.
        /// </summary>
        /// <value>City where the matched entity is located.</value>
        [DataMember(Name = "locationCity", EmitDefaultValue = false)]
        public string LocationCity { get; set; }

        /// <summary>
        /// Region where the matched entity is located.
        /// </summary>
        /// <value>Region where the matched entity is located.</value>
        [DataMember(Name = "regionName", EmitDefaultValue = false)]
        public string RegionName { get; set; }

        /// <summary>
        /// FactSet Industry Classification Code of the matched entity.
        /// </summary>
        /// <value>FactSet Industry Classification Code of the matched entity.</value>
        [DataMember(Name = "factsetIndustryCode", EmitDefaultValue = false)]
        public string FactsetIndustryCode { get; set; }

        /// <summary>
        /// Name of the matched entity&#39;s FactSet Industry Classification.
        /// </summary>
        /// <value>Name of the matched entity&#39;s FactSet Industry Classification.</value>
        [DataMember(Name = "factsetIndustryName", EmitDefaultValue = false)]
        public string FactsetIndustryName { get; set; }

        /// <summary>
        /// Name of the matched entity&#39;s FactSet Sector Classification Code.
        /// </summary>
        /// <value>Name of the matched entity&#39;s FactSet Sector Classification Code.</value>
        [DataMember(Name = "factsetSectorCode", EmitDefaultValue = false)]
        public string FactsetSectorCode { get; set; }

        /// <summary>
        /// Name of the matched entity&#39;s FactSet Sector Classification.
        /// </summary>
        /// <value>Name of the matched entity&#39;s FactSet Sector Classification.</value>
        [DataMember(Name = "factsetSectorName", EmitDefaultValue = false)]
        public string FactsetSectorName { get; set; }

        /// <summary>
        /// Name of the matched entity&#39;s parent entity.
        /// </summary>
        /// <value>Name of the matched entity&#39;s parent entity.</value>
        [DataMember(Name = "parentName", EmitDefaultValue = false)]
        public string ParentName { get; set; }

        /// <summary>
        /// Flag denoting that the matched entity is the parent of another match.
        /// </summary>
        /// <value>Flag denoting that the matched entity is the parent of another match.</value>
        [DataMember(Name = "parentMatchFlag", EmitDefaultValue = true)]
        public bool ParentMatchFlag { get; set; }

        /// <summary>
        /// Unique Identifer provided by the user in the request to represent the entity Name being requested.
        /// </summary>
        /// <value>Unique Identifer provided by the user in the request to represent the entity Name being requested.</value>
        [DataMember(Name = "clientId", EmitDefaultValue = false)]
        public string ClientId { get; set; }

        /// <summary>
        /// Name of the entity to match as specified in the request
        /// </summary>
        /// <value>Name of the entity to match as specified in the request</value>
        [DataMember(Name = "clientName", EmitDefaultValue = false)]
        public string ClientName { get; set; }

        /// <summary>
        /// ISO2 country code specified in the request.
        /// </summary>
        /// <value>ISO2 country code specified in the request.</value>
        [DataMember(Name = "clientCountry", EmitDefaultValue = false)]
        public string ClientCountry { get; set; }

        /// <summary>
        /// State code specified in the request.
        /// </summary>
        /// <value>State code specified in the request.</value>
        [DataMember(Name = "clientState", EmitDefaultValue = false)]
        public string ClientState { get; set; }

        /// <summary>
        /// URL specified in the request.
        /// </summary>
        /// <value>URL specified in the request.</value>
        [DataMember(Name = "clientUrl", EmitDefaultValue = false)]
        public string ClientUrl { get; set; }

        /// <summary>
        /// String on which the Concordance algorithm mapped the submitted entity.
        /// </summary>
        /// <value>String on which the Concordance algorithm mapped the submitted entity.</value>
        [DataMember(Name = "nameMatchString", EmitDefaultValue = false)]
        public string NameMatchString { get; set; }

        /// <summary>
        /// Type of name that the nameMatchString matched.
        /// </summary>
        /// <value>Type of name that the nameMatchString matched.</value>
        [DataMember(Name = "nameMatchSource", EmitDefaultValue = false)]
        public string NameMatchSource { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EntityMatch {\n");
            sb.Append("  TaskId: ").Append(TaskId).Append("\n");
            sb.Append("  RowIndex: ").Append(RowIndex).Append("\n");
            sb.Append("  MatchFlag: ").Append(MatchFlag).Append("\n");
            sb.Append("  EntityId: ").Append(EntityId).Append("\n");
            sb.Append("  EntityName: ").Append(EntityName).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  MapStatus: ").Append(MapStatus).Append("\n");
            sb.Append("  SimilarityScore: ").Append(SimilarityScore).Append("\n");
            sb.Append("  ConfidenceScore: ").Append(ConfidenceScore).Append("\n");
            sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
            sb.Append("  CountryName: ").Append(CountryName).Append("\n");
            sb.Append("  StateCode: ").Append(StateCode).Append("\n");
            sb.Append("  StateName: ").Append(StateName).Append("\n");
            sb.Append("  SicCode: ").Append(SicCode).Append("\n");
            sb.Append("  EntityTypeCode: ").Append(EntityTypeCode).Append("\n");
            sb.Append("  EntityTypeDescription: ").Append(EntityTypeDescription).Append("\n");
            sb.Append("  EntitySubTypeCode: ").Append(EntitySubTypeCode).Append("\n");
            sb.Append("  LocationCity: ").Append(LocationCity).Append("\n");
            sb.Append("  RegionName: ").Append(RegionName).Append("\n");
            sb.Append("  FactsetIndustryCode: ").Append(FactsetIndustryCode).Append("\n");
            sb.Append("  FactsetIndustryName: ").Append(FactsetIndustryName).Append("\n");
            sb.Append("  FactsetSectorCode: ").Append(FactsetSectorCode).Append("\n");
            sb.Append("  FactsetSectorName: ").Append(FactsetSectorName).Append("\n");
            sb.Append("  ParentName: ").Append(ParentName).Append("\n");
            sb.Append("  ParentMatchFlag: ").Append(ParentMatchFlag).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  ClientName: ").Append(ClientName).Append("\n");
            sb.Append("  ClientCountry: ").Append(ClientCountry).Append("\n");
            sb.Append("  ClientState: ").Append(ClientState).Append("\n");
            sb.Append("  ClientUrl: ").Append(ClientUrl).Append("\n");
            sb.Append("  NameMatchString: ").Append(NameMatchString).Append("\n");
            sb.Append("  NameMatchSource: ").Append(NameMatchSource).Append("\n");
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
            return this.Equals(input as EntityMatch);
        }

        /// <summary>
        /// Returns true if EntityMatch instances are equal
        /// </summary>
        /// <param name="input">Instance of EntityMatch to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntityMatch input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TaskId == input.TaskId ||
                    this.TaskId.Equals(input.TaskId)
                ) && 
                (
                    this.RowIndex == input.RowIndex ||
                    this.RowIndex.Equals(input.RowIndex)
                ) && 
                (
                    this.MatchFlag == input.MatchFlag ||
                    this.MatchFlag.Equals(input.MatchFlag)
                ) && 
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
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.MapStatus == input.MapStatus ||
                    this.MapStatus.Equals(input.MapStatus)
                ) && 
                (
                    this.SimilarityScore == input.SimilarityScore ||
                    this.SimilarityScore.Equals(input.SimilarityScore)
                ) && 
                (
                    this.ConfidenceScore == input.ConfidenceScore ||
                    this.ConfidenceScore.Equals(input.ConfidenceScore)
                ) && 
                (
                    this.CountryCode == input.CountryCode ||
                    (this.CountryCode != null &&
                    this.CountryCode.Equals(input.CountryCode))
                ) && 
                (
                    this.CountryName == input.CountryName ||
                    (this.CountryName != null &&
                    this.CountryName.Equals(input.CountryName))
                ) && 
                (
                    this.StateCode == input.StateCode ||
                    (this.StateCode != null &&
                    this.StateCode.Equals(input.StateCode))
                ) && 
                (
                    this.StateName == input.StateName ||
                    (this.StateName != null &&
                    this.StateName.Equals(input.StateName))
                ) && 
                (
                    this.SicCode == input.SicCode ||
                    (this.SicCode != null &&
                    this.SicCode.Equals(input.SicCode))
                ) && 
                (
                    this.EntityTypeCode == input.EntityTypeCode ||
                    (this.EntityTypeCode != null &&
                    this.EntityTypeCode.Equals(input.EntityTypeCode))
                ) && 
                (
                    this.EntityTypeDescription == input.EntityTypeDescription ||
                    (this.EntityTypeDescription != null &&
                    this.EntityTypeDescription.Equals(input.EntityTypeDescription))
                ) && 
                (
                    this.EntitySubTypeCode == input.EntitySubTypeCode ||
                    (this.EntitySubTypeCode != null &&
                    this.EntitySubTypeCode.Equals(input.EntitySubTypeCode))
                ) && 
                (
                    this.LocationCity == input.LocationCity ||
                    (this.LocationCity != null &&
                    this.LocationCity.Equals(input.LocationCity))
                ) && 
                (
                    this.RegionName == input.RegionName ||
                    (this.RegionName != null &&
                    this.RegionName.Equals(input.RegionName))
                ) && 
                (
                    this.FactsetIndustryCode == input.FactsetIndustryCode ||
                    (this.FactsetIndustryCode != null &&
                    this.FactsetIndustryCode.Equals(input.FactsetIndustryCode))
                ) && 
                (
                    this.FactsetIndustryName == input.FactsetIndustryName ||
                    (this.FactsetIndustryName != null &&
                    this.FactsetIndustryName.Equals(input.FactsetIndustryName))
                ) && 
                (
                    this.FactsetSectorCode == input.FactsetSectorCode ||
                    (this.FactsetSectorCode != null &&
                    this.FactsetSectorCode.Equals(input.FactsetSectorCode))
                ) && 
                (
                    this.FactsetSectorName == input.FactsetSectorName ||
                    (this.FactsetSectorName != null &&
                    this.FactsetSectorName.Equals(input.FactsetSectorName))
                ) && 
                (
                    this.ParentName == input.ParentName ||
                    (this.ParentName != null &&
                    this.ParentName.Equals(input.ParentName))
                ) && 
                (
                    this.ParentMatchFlag == input.ParentMatchFlag ||
                    this.ParentMatchFlag.Equals(input.ParentMatchFlag)
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
                    this.ClientUrl == input.ClientUrl ||
                    (this.ClientUrl != null &&
                    this.ClientUrl.Equals(input.ClientUrl))
                ) && 
                (
                    this.NameMatchString == input.NameMatchString ||
                    (this.NameMatchString != null &&
                    this.NameMatchString.Equals(input.NameMatchString))
                ) && 
                (
                    this.NameMatchSource == input.NameMatchSource ||
                    (this.NameMatchSource != null &&
                    this.NameMatchSource.Equals(input.NameMatchSource))
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
                hashCode = (hashCode * 59) + this.TaskId.GetHashCode();
                hashCode = (hashCode * 59) + this.RowIndex.GetHashCode();
                hashCode = (hashCode * 59) + this.MatchFlag.GetHashCode();
                if (this.EntityId != null)
                {
                    hashCode = (hashCode * 59) + this.EntityId.GetHashCode();
                }
                if (this.EntityName != null)
                {
                    hashCode = (hashCode * 59) + this.EntityName.GetHashCode();
                }
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.MapStatus.GetHashCode();
                hashCode = (hashCode * 59) + this.SimilarityScore.GetHashCode();
                hashCode = (hashCode * 59) + this.ConfidenceScore.GetHashCode();
                if (this.CountryCode != null)
                {
                    hashCode = (hashCode * 59) + this.CountryCode.GetHashCode();
                }
                if (this.CountryName != null)
                {
                    hashCode = (hashCode * 59) + this.CountryName.GetHashCode();
                }
                if (this.StateCode != null)
                {
                    hashCode = (hashCode * 59) + this.StateCode.GetHashCode();
                }
                if (this.StateName != null)
                {
                    hashCode = (hashCode * 59) + this.StateName.GetHashCode();
                }
                if (this.SicCode != null)
                {
                    hashCode = (hashCode * 59) + this.SicCode.GetHashCode();
                }
                if (this.EntityTypeCode != null)
                {
                    hashCode = (hashCode * 59) + this.EntityTypeCode.GetHashCode();
                }
                if (this.EntityTypeDescription != null)
                {
                    hashCode = (hashCode * 59) + this.EntityTypeDescription.GetHashCode();
                }
                if (this.EntitySubTypeCode != null)
                {
                    hashCode = (hashCode * 59) + this.EntitySubTypeCode.GetHashCode();
                }
                if (this.LocationCity != null)
                {
                    hashCode = (hashCode * 59) + this.LocationCity.GetHashCode();
                }
                if (this.RegionName != null)
                {
                    hashCode = (hashCode * 59) + this.RegionName.GetHashCode();
                }
                if (this.FactsetIndustryCode != null)
                {
                    hashCode = (hashCode * 59) + this.FactsetIndustryCode.GetHashCode();
                }
                if (this.FactsetIndustryName != null)
                {
                    hashCode = (hashCode * 59) + this.FactsetIndustryName.GetHashCode();
                }
                if (this.FactsetSectorCode != null)
                {
                    hashCode = (hashCode * 59) + this.FactsetSectorCode.GetHashCode();
                }
                if (this.FactsetSectorName != null)
                {
                    hashCode = (hashCode * 59) + this.FactsetSectorName.GetHashCode();
                }
                if (this.ParentName != null)
                {
                    hashCode = (hashCode * 59) + this.ParentName.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ParentMatchFlag.GetHashCode();
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
                if (this.ClientUrl != null)
                {
                    hashCode = (hashCode * 59) + this.ClientUrl.GetHashCode();
                }
                if (this.NameMatchString != null)
                {
                    hashCode = (hashCode * 59) + this.NameMatchString.GetHashCode();
                }
                if (this.NameMatchSource != null)
                {
                    hashCode = (hashCode * 59) + this.NameMatchSource.GetHashCode();
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

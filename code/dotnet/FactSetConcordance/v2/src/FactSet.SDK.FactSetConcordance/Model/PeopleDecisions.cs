/*
 * FactSet Concordance API
 *
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request. With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p><p><b>Rate limit is set to 10 requests per second</b>.</p>    Methodology Guide link:   [https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d](https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d)    
 *
 * The version of the OpenAPI document: 2.10.0
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
    /// Concordance People Decisions object. Returned to show the Decision reached for each Entity. 
    /// </summary>
    [DataContract(Name = "PeopleDecisions")]
    public partial class PeopleDecisions : IEquatable<PeopleDecisions>, IValidatableObject
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
        [DataMember(Name = "mapStatus", EmitDefaultValue = true)]
        public MapStatusEnum? MapStatus { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PeopleDecisions" /> class.
        /// </summary>
        /// <param name="activeRole">If the role is active or not of the person..</param>
        /// <param name="clientEntity">Name of the entity of the client. .</param>
        /// <param name="clientId">Name of the column in the input file that contains a unique identifier supplied by the user..</param>
        /// <param name="clientFirstName">First Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint.</param>
        /// <param name="clientLastName">Last Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint.</param>
        /// <param name="clientMiddleName">Middle Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint.</param>
        /// <param name="clientSalutation">Salutation provided in the input file which is used in the &#x60;people-task&#x60; endpoint.</param>
        /// <param name="clientSuffix">Suffix provided in the input file which is used in the &#x60;people-task&#x60; endpoint.</param>
        /// <param name="clientPriority">Priority provided in the input file which is used in the &#x60;people-task&#x60; endpoint.</param>
        /// <param name="clientPersonName">The name provided by the client..</param>
        /// <param name="clientAdditionalContext">Any additional context column along with their values in the input file or single search.  To be used by Managed Service for any unmapped records. .</param>
        /// <param name="email">The email address of the client..</param>
        /// <param name="entity">Full name corresponding to the matched entity..</param>
        /// <param name="mapStatus">Concordance status of the submitted, where -    * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name has unable to make a mapping. .</param>
        /// <param name="firstName">Name of the column in the input file that contains the first name..</param>
        /// <param name="lastName">Name of the column in the input file that contains the first name. .</param>
        /// <param name="middleName">Name of the column in the input file that contains the middle name. .</param>
        /// <param name="personId">The id of the person..</param>
        /// <param name="salutation">The salutation is same as the normal salutation we use .The salutation can be Mr, Mrs.The salutation should not be given along with personName. .</param>
        /// <param name="nameMatchSource">Type of name that the nameMatchString matched. .</param>
        /// <param name="nameMatchString">String on which the Concordance algorithm mapped the submitted entity..</param>
        /// <param name="personName">Name of the column in the input file that contains the person name. .</param>
        /// <param name="suffix">Name of the column in the input file that contains the person&#39;s suffix. .</param>
        /// <param name="similarityScore">Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. .</param>
        /// <param name="matchFlag">Flag denoting if the row is a match. .</param>
        /// <param name="rowIndex">Row number for match in the request or input file..</param>
        /// <param name="taskId">Identifier denoting a specific Concordance task submitted by the user..</param>
        /// <param name="title">The title of the person..</param>
        /// <param name="universeId">The universe identifier.</param>
        public PeopleDecisions(bool? activeRole = default(bool?), string clientEntity = default(string), string clientId = default(string), string clientFirstName = default(string), string clientLastName = default(string), string clientMiddleName = default(string), string clientSalutation = default(string), string clientSuffix = default(string), string clientPriority = default(string), string clientPersonName = default(string), Dictionary<string, string> clientAdditionalContext = default(Dictionary<string, string>), string email = default(string), string entity = default(string), MapStatusEnum? mapStatus = default(MapStatusEnum?), string firstName = default(string), string lastName = default(string), string middleName = default(string), string personId = default(string), string salutation = default(string), string nameMatchSource = default(string), string nameMatchString = default(string), string personName = default(string), string suffix = default(string), double? similarityScore = default(double?), bool matchFlag = default(bool), int? rowIndex = default(int?), int? taskId = default(int?), string title = default(string), int? universeId = default(int?))
        {
            this.ActiveRole = activeRole;
            this.ClientEntity = clientEntity;
            this.ClientId = clientId;
            this.ClientFirstName = clientFirstName;
            this.ClientLastName = clientLastName;
            this.ClientMiddleName = clientMiddleName;
            this.ClientSalutation = clientSalutation;
            this.ClientSuffix = clientSuffix;
            this.ClientPriority = clientPriority;
            this.ClientPersonName = clientPersonName;
            this.ClientAdditionalContext = clientAdditionalContext;
            this.Email = email;
            this.Entity = entity;
            this.MapStatus = mapStatus;
            this.FirstName = firstName;
            this.LastName = lastName;
            this.MiddleName = middleName;
            this.PersonId = personId;
            this.Salutation = salutation;
            this.NameMatchSource = nameMatchSource;
            this.NameMatchString = nameMatchString;
            this.PersonName = personName;
            this.Suffix = suffix;
            this.SimilarityScore = similarityScore;
            this.MatchFlag = matchFlag;
            this.RowIndex = rowIndex;
            this.TaskId = taskId;
            this.Title = title;
            this.UniverseId = universeId;
        }

        /// <summary>
        /// If the role is active or not of the person.
        /// </summary>
        /// <value>If the role is active or not of the person.</value>
        [DataMember(Name = "activeRole", EmitDefaultValue = true)]
        public bool? ActiveRole { get; set; }

        /// <summary>
        /// Name of the entity of the client. 
        /// </summary>
        /// <value>Name of the entity of the client. </value>
        [DataMember(Name = "clientEntity", EmitDefaultValue = true)]
        public string ClientEntity { get; set; }

        /// <summary>
        /// Name of the column in the input file that contains a unique identifier supplied by the user.
        /// </summary>
        /// <value>Name of the column in the input file that contains a unique identifier supplied by the user.</value>
        [DataMember(Name = "clientId", EmitDefaultValue = true)]
        public string ClientId { get; set; }

        /// <summary>
        /// First Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint
        /// </summary>
        /// <value>First Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint</value>
        [DataMember(Name = "clientFirstName", EmitDefaultValue = true)]
        public string ClientFirstName { get; set; }

        /// <summary>
        /// Last Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint
        /// </summary>
        /// <value>Last Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint</value>
        [DataMember(Name = "clientLastName", EmitDefaultValue = true)]
        public string ClientLastName { get; set; }

        /// <summary>
        /// Middle Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint
        /// </summary>
        /// <value>Middle Name provided in the input file which is used in the &#x60;people-task&#x60; endpoint</value>
        [DataMember(Name = "clientMiddleName", EmitDefaultValue = true)]
        public string ClientMiddleName { get; set; }

        /// <summary>
        /// Salutation provided in the input file which is used in the &#x60;people-task&#x60; endpoint
        /// </summary>
        /// <value>Salutation provided in the input file which is used in the &#x60;people-task&#x60; endpoint</value>
        [DataMember(Name = "clientSalutation", EmitDefaultValue = true)]
        public string ClientSalutation { get; set; }

        /// <summary>
        /// Suffix provided in the input file which is used in the &#x60;people-task&#x60; endpoint
        /// </summary>
        /// <value>Suffix provided in the input file which is used in the &#x60;people-task&#x60; endpoint</value>
        [DataMember(Name = "clientSuffix", EmitDefaultValue = true)]
        public string ClientSuffix { get; set; }

        /// <summary>
        /// Priority provided in the input file which is used in the &#x60;people-task&#x60; endpoint
        /// </summary>
        /// <value>Priority provided in the input file which is used in the &#x60;people-task&#x60; endpoint</value>
        [DataMember(Name = "clientPriority", EmitDefaultValue = true)]
        public string ClientPriority { get; set; }

        /// <summary>
        /// The name provided by the client.
        /// </summary>
        /// <value>The name provided by the client.</value>
        [DataMember(Name = "clientPersonName", EmitDefaultValue = true)]
        public string ClientPersonName { get; set; }

        /// <summary>
        /// Any additional context column along with their values in the input file or single search.  To be used by Managed Service for any unmapped records. 
        /// </summary>
        /// <value>Any additional context column along with their values in the input file or single search.  To be used by Managed Service for any unmapped records. </value>
        [DataMember(Name = "clientAdditionalContext", EmitDefaultValue = false)]
        public Dictionary<string, string> ClientAdditionalContext { get; set; }

        /// <summary>
        /// The email address of the client.
        /// </summary>
        /// <value>The email address of the client.</value>
        [DataMember(Name = "email", EmitDefaultValue = true)]
        public string Email { get; set; }

        /// <summary>
        /// Full name corresponding to the matched entity.
        /// </summary>
        /// <value>Full name corresponding to the matched entity.</value>
        [DataMember(Name = "entity", EmitDefaultValue = true)]
        public string Entity { get; set; }

        /// <summary>
        /// Name of the column in the input file that contains the first name.
        /// </summary>
        /// <value>Name of the column in the input file that contains the first name.</value>
        [DataMember(Name = "firstName", EmitDefaultValue = true)]
        public string FirstName { get; set; }

        /// <summary>
        /// Name of the column in the input file that contains the first name. 
        /// </summary>
        /// <value>Name of the column in the input file that contains the first name. </value>
        [DataMember(Name = "lastName", EmitDefaultValue = true)]
        public string LastName { get; set; }

        /// <summary>
        /// Name of the column in the input file that contains the middle name. 
        /// </summary>
        /// <value>Name of the column in the input file that contains the middle name. </value>
        [DataMember(Name = "middleName", EmitDefaultValue = true)]
        public string MiddleName { get; set; }

        /// <summary>
        /// The id of the person.
        /// </summary>
        /// <value>The id of the person.</value>
        [DataMember(Name = "personId", EmitDefaultValue = true)]
        public string PersonId { get; set; }

        /// <summary>
        /// The salutation is same as the normal salutation we use .The salutation can be Mr, Mrs.The salutation should not be given along with personName. 
        /// </summary>
        /// <value>The salutation is same as the normal salutation we use .The salutation can be Mr, Mrs.The salutation should not be given along with personName. </value>
        [DataMember(Name = "salutation", EmitDefaultValue = false)]
        public string Salutation { get; set; }

        /// <summary>
        /// Type of name that the nameMatchString matched. 
        /// </summary>
        /// <value>Type of name that the nameMatchString matched. </value>
        [DataMember(Name = "nameMatchSource", EmitDefaultValue = true)]
        public string NameMatchSource { get; set; }

        /// <summary>
        /// String on which the Concordance algorithm mapped the submitted entity.
        /// </summary>
        /// <value>String on which the Concordance algorithm mapped the submitted entity.</value>
        [DataMember(Name = "nameMatchString", EmitDefaultValue = true)]
        public string NameMatchString { get; set; }

        /// <summary>
        /// Name of the column in the input file that contains the person name. 
        /// </summary>
        /// <value>Name of the column in the input file that contains the person name. </value>
        [DataMember(Name = "personName", EmitDefaultValue = true)]
        public string PersonName { get; set; }

        /// <summary>
        /// Name of the column in the input file that contains the person&#39;s suffix. 
        /// </summary>
        /// <value>Name of the column in the input file that contains the person&#39;s suffix. </value>
        [DataMember(Name = "suffix", EmitDefaultValue = true)]
        public string Suffix { get; set; }

        /// <summary>
        /// Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. 
        /// </summary>
        /// <value>Probability of the match being similar to the entity requested as determined by the Concordance algorithm. A similarityScore of 1 is the highest level of similarity. </value>
        [DataMember(Name = "similarityScore", EmitDefaultValue = true)]
        public double? SimilarityScore { get; set; }

        /// <summary>
        /// Flag denoting if the row is a match. 
        /// </summary>
        /// <value>Flag denoting if the row is a match. </value>
        [DataMember(Name = "matchFlag", EmitDefaultValue = true)]
        public bool MatchFlag { get; set; }

        /// <summary>
        /// Row number for match in the request or input file.
        /// </summary>
        /// <value>Row number for match in the request or input file.</value>
        [DataMember(Name = "rowIndex", EmitDefaultValue = true)]
        public int? RowIndex { get; set; }

        /// <summary>
        /// Identifier denoting a specific Concordance task submitted by the user.
        /// </summary>
        /// <value>Identifier denoting a specific Concordance task submitted by the user.</value>
        [DataMember(Name = "taskId", EmitDefaultValue = true)]
        public int? TaskId { get; set; }

        /// <summary>
        /// The title of the person.
        /// </summary>
        /// <value>The title of the person.</value>
        [DataMember(Name = "title", EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// The universe identifier
        /// </summary>
        /// <value>The universe identifier</value>
        [DataMember(Name = "universeId", EmitDefaultValue = true)]
        public int? UniverseId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PeopleDecisions {\n");
            sb.Append("  ActiveRole: ").Append(ActiveRole).Append("\n");
            sb.Append("  ClientEntity: ").Append(ClientEntity).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  ClientFirstName: ").Append(ClientFirstName).Append("\n");
            sb.Append("  ClientLastName: ").Append(ClientLastName).Append("\n");
            sb.Append("  ClientMiddleName: ").Append(ClientMiddleName).Append("\n");
            sb.Append("  ClientSalutation: ").Append(ClientSalutation).Append("\n");
            sb.Append("  ClientSuffix: ").Append(ClientSuffix).Append("\n");
            sb.Append("  ClientPriority: ").Append(ClientPriority).Append("\n");
            sb.Append("  ClientPersonName: ").Append(ClientPersonName).Append("\n");
            sb.Append("  ClientAdditionalContext: ").Append(ClientAdditionalContext).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Entity: ").Append(Entity).Append("\n");
            sb.Append("  MapStatus: ").Append(MapStatus).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  MiddleName: ").Append(MiddleName).Append("\n");
            sb.Append("  PersonId: ").Append(PersonId).Append("\n");
            sb.Append("  Salutation: ").Append(Salutation).Append("\n");
            sb.Append("  NameMatchSource: ").Append(NameMatchSource).Append("\n");
            sb.Append("  NameMatchString: ").Append(NameMatchString).Append("\n");
            sb.Append("  PersonName: ").Append(PersonName).Append("\n");
            sb.Append("  Suffix: ").Append(Suffix).Append("\n");
            sb.Append("  SimilarityScore: ").Append(SimilarityScore).Append("\n");
            sb.Append("  MatchFlag: ").Append(MatchFlag).Append("\n");
            sb.Append("  RowIndex: ").Append(RowIndex).Append("\n");
            sb.Append("  TaskId: ").Append(TaskId).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
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
            return this.Equals(input as PeopleDecisions);
        }

        /// <summary>
        /// Returns true if PeopleDecisions instances are equal
        /// </summary>
        /// <param name="input">Instance of PeopleDecisions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PeopleDecisions input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ActiveRole == input.ActiveRole ||
                    (this.ActiveRole != null &&
                    this.ActiveRole.Equals(input.ActiveRole))
                ) && 
                (
                    this.ClientEntity == input.ClientEntity ||
                    (this.ClientEntity != null &&
                    this.ClientEntity.Equals(input.ClientEntity))
                ) && 
                (
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
                ) && 
                (
                    this.ClientFirstName == input.ClientFirstName ||
                    (this.ClientFirstName != null &&
                    this.ClientFirstName.Equals(input.ClientFirstName))
                ) && 
                (
                    this.ClientLastName == input.ClientLastName ||
                    (this.ClientLastName != null &&
                    this.ClientLastName.Equals(input.ClientLastName))
                ) && 
                (
                    this.ClientMiddleName == input.ClientMiddleName ||
                    (this.ClientMiddleName != null &&
                    this.ClientMiddleName.Equals(input.ClientMiddleName))
                ) && 
                (
                    this.ClientSalutation == input.ClientSalutation ||
                    (this.ClientSalutation != null &&
                    this.ClientSalutation.Equals(input.ClientSalutation))
                ) && 
                (
                    this.ClientSuffix == input.ClientSuffix ||
                    (this.ClientSuffix != null &&
                    this.ClientSuffix.Equals(input.ClientSuffix))
                ) && 
                (
                    this.ClientPriority == input.ClientPriority ||
                    (this.ClientPriority != null &&
                    this.ClientPriority.Equals(input.ClientPriority))
                ) && 
                (
                    this.ClientPersonName == input.ClientPersonName ||
                    (this.ClientPersonName != null &&
                    this.ClientPersonName.Equals(input.ClientPersonName))
                ) && 
                (
                    this.ClientAdditionalContext == input.ClientAdditionalContext ||
                    this.ClientAdditionalContext != null &&
                    input.ClientAdditionalContext != null &&
                    this.ClientAdditionalContext.SequenceEqual(input.ClientAdditionalContext)
                ) && 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.Entity == input.Entity ||
                    (this.Entity != null &&
                    this.Entity.Equals(input.Entity))
                ) && 
                (
                    this.MapStatus == input.MapStatus ||
                    this.MapStatus.Equals(input.MapStatus)
                ) && 
                (
                    this.FirstName == input.FirstName ||
                    (this.FirstName != null &&
                    this.FirstName.Equals(input.FirstName))
                ) && 
                (
                    this.LastName == input.LastName ||
                    (this.LastName != null &&
                    this.LastName.Equals(input.LastName))
                ) && 
                (
                    this.MiddleName == input.MiddleName ||
                    (this.MiddleName != null &&
                    this.MiddleName.Equals(input.MiddleName))
                ) && 
                (
                    this.PersonId == input.PersonId ||
                    (this.PersonId != null &&
                    this.PersonId.Equals(input.PersonId))
                ) && 
                (
                    this.Salutation == input.Salutation ||
                    (this.Salutation != null &&
                    this.Salutation.Equals(input.Salutation))
                ) && 
                (
                    this.NameMatchSource == input.NameMatchSource ||
                    (this.NameMatchSource != null &&
                    this.NameMatchSource.Equals(input.NameMatchSource))
                ) && 
                (
                    this.NameMatchString == input.NameMatchString ||
                    (this.NameMatchString != null &&
                    this.NameMatchString.Equals(input.NameMatchString))
                ) && 
                (
                    this.PersonName == input.PersonName ||
                    (this.PersonName != null &&
                    this.PersonName.Equals(input.PersonName))
                ) && 
                (
                    this.Suffix == input.Suffix ||
                    (this.Suffix != null &&
                    this.Suffix.Equals(input.Suffix))
                ) && 
                (
                    this.SimilarityScore == input.SimilarityScore ||
                    (this.SimilarityScore != null &&
                    this.SimilarityScore.Equals(input.SimilarityScore))
                ) && 
                (
                    this.MatchFlag == input.MatchFlag ||
                    this.MatchFlag.Equals(input.MatchFlag)
                ) && 
                (
                    this.RowIndex == input.RowIndex ||
                    (this.RowIndex != null &&
                    this.RowIndex.Equals(input.RowIndex))
                ) && 
                (
                    this.TaskId == input.TaskId ||
                    (this.TaskId != null &&
                    this.TaskId.Equals(input.TaskId))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
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
                if (this.ActiveRole != null)
                {
                    hashCode = (hashCode * 59) + this.ActiveRole.GetHashCode();
                }
                if (this.ClientEntity != null)
                {
                    hashCode = (hashCode * 59) + this.ClientEntity.GetHashCode();
                }
                if (this.ClientId != null)
                {
                    hashCode = (hashCode * 59) + this.ClientId.GetHashCode();
                }
                if (this.ClientFirstName != null)
                {
                    hashCode = (hashCode * 59) + this.ClientFirstName.GetHashCode();
                }
                if (this.ClientLastName != null)
                {
                    hashCode = (hashCode * 59) + this.ClientLastName.GetHashCode();
                }
                if (this.ClientMiddleName != null)
                {
                    hashCode = (hashCode * 59) + this.ClientMiddleName.GetHashCode();
                }
                if (this.ClientSalutation != null)
                {
                    hashCode = (hashCode * 59) + this.ClientSalutation.GetHashCode();
                }
                if (this.ClientSuffix != null)
                {
                    hashCode = (hashCode * 59) + this.ClientSuffix.GetHashCode();
                }
                if (this.ClientPriority != null)
                {
                    hashCode = (hashCode * 59) + this.ClientPriority.GetHashCode();
                }
                if (this.ClientPersonName != null)
                {
                    hashCode = (hashCode * 59) + this.ClientPersonName.GetHashCode();
                }
                if (this.ClientAdditionalContext != null)
                {
                    hashCode = (hashCode * 59) + this.ClientAdditionalContext.GetHashCode();
                }
                if (this.Email != null)
                {
                    hashCode = (hashCode * 59) + this.Email.GetHashCode();
                }
                if (this.Entity != null)
                {
                    hashCode = (hashCode * 59) + this.Entity.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.MapStatus.GetHashCode();
                if (this.FirstName != null)
                {
                    hashCode = (hashCode * 59) + this.FirstName.GetHashCode();
                }
                if (this.LastName != null)
                {
                    hashCode = (hashCode * 59) + this.LastName.GetHashCode();
                }
                if (this.MiddleName != null)
                {
                    hashCode = (hashCode * 59) + this.MiddleName.GetHashCode();
                }
                if (this.PersonId != null)
                {
                    hashCode = (hashCode * 59) + this.PersonId.GetHashCode();
                }
                if (this.Salutation != null)
                {
                    hashCode = (hashCode * 59) + this.Salutation.GetHashCode();
                }
                if (this.NameMatchSource != null)
                {
                    hashCode = (hashCode * 59) + this.NameMatchSource.GetHashCode();
                }
                if (this.NameMatchString != null)
                {
                    hashCode = (hashCode * 59) + this.NameMatchString.GetHashCode();
                }
                if (this.PersonName != null)
                {
                    hashCode = (hashCode * 59) + this.PersonName.GetHashCode();
                }
                if (this.Suffix != null)
                {
                    hashCode = (hashCode * 59) + this.Suffix.GetHashCode();
                }
                if (this.SimilarityScore != null)
                {
                    hashCode = (hashCode * 59) + this.SimilarityScore.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.MatchFlag.GetHashCode();
                if (this.RowIndex != null)
                {
                    hashCode = (hashCode * 59) + this.RowIndex.GetHashCode();
                }
                if (this.TaskId != null)
                {
                    hashCode = (hashCode * 59) + this.TaskId.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
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

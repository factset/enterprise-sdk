/*
 * Conversational API Powered by FactSet Mercury
 *
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   #### Receive updates on changes to the Conversational API Subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API  #### FAQ & Troubleshooting Please find FAQs and troubleshooting tips in the [FAQs section](https://my.apps.factset.com/oa/pages/23440) of the Conversational API OA page  ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support. 
 *
 * The version of the OpenAPI document: 1.0.8
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
using OpenAPIDateConverter = FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model
{
    /// <summary>
    /// Action containing a file ID to download a file associated with the response. Files will be available for download from the &#x60;/download/file&#x60; endpoint for 24 hours after generation.  If there was an error while generating the downloadable file, it will be detailed in the &#x60;error&#x60; field for the specific download action. Please reach out to your FactSet Support Team representative if you are seeing this error persistently.  
    /// </summary>
    [DataContract(Name = "Download")]
    public partial class Download : IEquatable<Download>, IValidatableObject
    {
        /// <summary>
        /// Type of action
        /// </summary>
        /// <value>Type of action</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ActionEnum
        {
            /// <summary>
            /// Enum Download for value: Download
            /// </summary>
            [EnumMember(Value = "Download")]
            Download = 1

        }


        /// <summary>
        /// Type of action
        /// </summary>
        /// <value>Type of action</value>
        [DataMember(Name = "action", IsRequired = true, EmitDefaultValue = false)]
        public ActionEnum Action { get; set; }
        /// <summary>
        /// Endpoint where file can be found
        /// </summary>
        /// <value>Endpoint where file can be found</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum LocationEnum
        {
            /// <summary>
            /// Enum DownloadFile for value: /download/file
            /// </summary>
            [EnumMember(Value = "/download/file")]
            DownloadFile = 1

        }


        /// <summary>
        /// Endpoint where file can be found
        /// </summary>
        /// <value>Endpoint where file can be found</value>
        [DataMember(Name = "location", EmitDefaultValue = false)]
        public LocationEnum? Location { get; set; }
        /// <summary>
        /// ContentType of associated file
        /// </summary>
        /// <value>ContentType of associated file</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ContentTypeEnum
        {
            /// <summary>
            /// Enum ApplicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet for value: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
            /// </summary>
            [EnumMember(Value = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")]
            ApplicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet = 1

        }


        /// <summary>
        /// ContentType of associated file
        /// </summary>
        /// <value>ContentType of associated file</value>
        [DataMember(Name = "contentType", EmitDefaultValue = false)]
        public ContentTypeEnum? ContentType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Download" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Download() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Download" /> class.
        /// </summary>
        /// <param name="action">Type of action (required).</param>
        /// <param name="name">Name of the download type (required).</param>
        /// <param name="label">Label associated with the download (required).</param>
        /// <param name="category">Category of associated file.</param>
        /// <param name="location">Endpoint where file can be found.</param>
        /// <param name="fileId">Id of associated file.</param>
        /// <param name="contentType">ContentType of associated file.</param>
        /// <param name="fileName">Name of associated file.</param>
        /// <param name="error">error (required).</param>
        public Download(ActionEnum action, string name, string label, FileGenerationErrorObject error,string category = default(string), LocationEnum? location = default(LocationEnum?), Guid fileId = default(Guid), ContentTypeEnum? contentType = default(ContentTypeEnum?), string fileName = default(string))
        {
            this.Action = action;
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for Download and cannot be null");
            }
            this.Name = name;
            // to ensure "label" is required (not null)
            if (label == null) {
                throw new ArgumentNullException("label is a required property for Download and cannot be null");
            }
            this.Label = label;
            // to ensure "error" is required (not null)
            if (error == null) {
                throw new ArgumentNullException("error is a required property for Download and cannot be null");
            }
            this.Error = error;
            this.Category = category;
            this.Location = location;
            this.FileId = fileId;
            this.ContentType = contentType;
            this.FileName = fileName;
        }

        /// <summary>
        /// Name of the download type
        /// </summary>
        /// <value>Name of the download type</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Label associated with the download
        /// </summary>
        /// <value>Label associated with the download</value>
        [DataMember(Name = "label", IsRequired = true, EmitDefaultValue = false)]
        public string Label { get; set; }

        /// <summary>
        /// Category of associated file
        /// </summary>
        /// <value>Category of associated file</value>
        [DataMember(Name = "category", EmitDefaultValue = true)]
        public string Category { get; set; }

        /// <summary>
        /// Id of associated file
        /// </summary>
        /// <value>Id of associated file</value>
        [DataMember(Name = "fileId", EmitDefaultValue = false)]
        public Guid FileId { get; set; }

        /// <summary>
        /// Name of associated file
        /// </summary>
        /// <value>Name of associated file</value>
        [DataMember(Name = "fileName", EmitDefaultValue = false)]
        public string FileName { get; set; }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [DataMember(Name = "error", IsRequired = true, EmitDefaultValue = true)]
        public FileGenerationErrorObject Error { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Download {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  Location: ").Append(Location).Append("\n");
            sb.Append("  FileId: ").Append(FileId).Append("\n");
            sb.Append("  ContentType: ").Append(ContentType).Append("\n");
            sb.Append("  FileName: ").Append(FileName).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
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
            return this.Equals(input as Download);
        }

        /// <summary>
        /// Returns true if Download instances are equal
        /// </summary>
        /// <param name="input">Instance of Download to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Download input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Action == input.Action ||
                    this.Action.Equals(input.Action)
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Label == input.Label ||
                    (this.Label != null &&
                    this.Label.Equals(input.Label))
                ) && 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
                ) && 
                (
                    this.Location == input.Location ||
                    this.Location.Equals(input.Location)
                ) && 
                (
                    this.FileId == input.FileId ||
                    (this.FileId != null &&
                    this.FileId.Equals(input.FileId))
                ) && 
                (
                    this.ContentType == input.ContentType ||
                    this.ContentType.Equals(input.ContentType)
                ) && 
                (
                    this.FileName == input.FileName ||
                    (this.FileName != null &&
                    this.FileName.Equals(input.FileName))
                ) && 
                (
                    this.Error == input.Error ||
                    (this.Error != null &&
                    this.Error.Equals(input.Error))
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
                hashCode = (hashCode * 59) + this.Action.GetHashCode();
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Label != null)
                {
                    hashCode = (hashCode * 59) + this.Label.GetHashCode();
                }
                if (this.Category != null)
                {
                    hashCode = (hashCode * 59) + this.Category.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Location.GetHashCode();
                if (this.FileId != null)
                {
                    hashCode = (hashCode * 59) + this.FileId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ContentType.GetHashCode();
                if (this.FileName != null)
                {
                    hashCode = (hashCode * 59) + this.FileName.GetHashCode();
                }
                if (this.Error != null)
                {
                    hashCode = (hashCode * 59) + this.Error.GetHashCode();
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

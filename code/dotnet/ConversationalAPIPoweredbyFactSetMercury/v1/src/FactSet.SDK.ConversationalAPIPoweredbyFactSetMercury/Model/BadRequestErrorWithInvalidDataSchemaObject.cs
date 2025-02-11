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
    /// Represents a single error from a bad query request, with error name and identifiers
    /// </summary>
    [DataContract(Name = "BadRequestErrorWithInvalidDataSchemaObject")]
    public partial class BadRequestErrorWithInvalidDataSchemaObject : IEquatable<BadRequestErrorWithInvalidDataSchemaObject>, IValidatableObject
    {
        /// <summary>
        /// Title of error
        /// </summary>
        /// <value>Title of error</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TitleEnum
        {
            /// <summary>
            /// Enum NoData for value: No Data
            /// </summary>
            [EnumMember(Value = "No Data")]
            NoData = 1,

            /// <summary>
            /// Enum ParameterError for value: Parameter Error
            /// </summary>
            [EnumMember(Value = "Parameter Error")]
            ParameterError = 2,

            /// <summary>
            /// Enum InvalidRequestBody for value: Invalid Request Body
            /// </summary>
            [EnumMember(Value = "Invalid Request Body")]
            InvalidRequestBody = 3,

            /// <summary>
            /// Enum InvalidURI for value: Invalid URI
            /// </summary>
            [EnumMember(Value = "Invalid URI")]
            InvalidURI = 4,

            /// <summary>
            /// Enum InvalidDataSchema for value: Invalid Data Schema
            /// </summary>
            [EnumMember(Value = "Invalid Data Schema")]
            InvalidDataSchema = 5

        }


        /// <summary>
        /// Title of error
        /// </summary>
        /// <value>Title of error</value>
        [DataMember(Name = "title", IsRequired = true, EmitDefaultValue = false)]
        public TitleEnum Title { get; set; }
        /// <summary>
        /// Code of error
        /// </summary>
        /// <value>Code of error</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CodeEnum
        {
            /// <summary>
            /// Enum NotFound for value: notFound
            /// </summary>
            [EnumMember(Value = "notFound")]
            NotFound = 1,

            /// <summary>
            /// Enum ParameterError for value: parameterError
            /// </summary>
            [EnumMember(Value = "parameterError")]
            ParameterError = 2,

            /// <summary>
            /// Enum RequestBodyInvalid for value: requestBodyInvalid
            /// </summary>
            [EnumMember(Value = "requestBodyInvalid")]
            RequestBodyInvalid = 3,

            /// <summary>
            /// Enum ConversationalApiInvalidUri for value: conversational_api_invalidUri
            /// </summary>
            [EnumMember(Value = "conversational_api_invalidUri")]
            ConversationalApiInvalidUri = 4,

            /// <summary>
            /// Enum ConversationalApiInvalidDataSchema for value: conversational_api_invalidDataSchema
            /// </summary>
            [EnumMember(Value = "conversational_api_invalidDataSchema")]
            ConversationalApiInvalidDataSchema = 5

        }


        /// <summary>
        /// Code of error
        /// </summary>
        /// <value>Code of error</value>
        [DataMember(Name = "code", IsRequired = true, EmitDefaultValue = false)]
        public CodeEnum Code { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="BadRequestErrorWithInvalidDataSchemaObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BadRequestErrorWithInvalidDataSchemaObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BadRequestErrorWithInvalidDataSchemaObject" /> class.
        /// </summary>
        /// <param name="id">Id of error (required).</param>
        /// <param name="title">Title of error (required).</param>
        /// <param name="code">Code of error (required).</param>
        /// <param name="detail">Details of error (required).</param>
        public BadRequestErrorWithInvalidDataSchemaObject(Guid id, TitleEnum title, CodeEnum code, string detail)
        {
            this.Id = id;
            this.Title = title;
            this.Code = code;
            // to ensure "detail" is required (not null)
            if (detail == null) {
                throw new ArgumentNullException("detail is a required property for BadRequestErrorWithInvalidDataSchemaObject and cannot be null");
            }
            this.Detail = detail;
        }

        /// <summary>
        /// Id of error
        /// </summary>
        /// <value>Id of error</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public Guid Id { get; set; }

        /// <summary>
        /// Details of error
        /// </summary>
        /// <value>Details of error</value>
        [DataMember(Name = "detail", IsRequired = true, EmitDefaultValue = false)]
        public string Detail { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BadRequestErrorWithInvalidDataSchemaObject {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Detail: ").Append(Detail).Append("\n");
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
            return this.Equals(input as BadRequestErrorWithInvalidDataSchemaObject);
        }

        /// <summary>
        /// Returns true if BadRequestErrorWithInvalidDataSchemaObject instances are equal
        /// </summary>
        /// <param name="input">Instance of BadRequestErrorWithInvalidDataSchemaObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BadRequestErrorWithInvalidDataSchemaObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Title == input.Title ||
                    this.Title.Equals(input.Title)
                ) && 
                (
                    this.Code == input.Code ||
                    this.Code.Equals(input.Code)
                ) && 
                (
                    this.Detail == input.Detail ||
                    (this.Detail != null &&
                    this.Detail.Equals(input.Detail))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Title.GetHashCode();
                hashCode = (hashCode * 59) + this.Code.GetHashCode();
                if (this.Detail != null)
                {
                    hashCode = (hashCode * 59) + this.Detail.GetHashCode();
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

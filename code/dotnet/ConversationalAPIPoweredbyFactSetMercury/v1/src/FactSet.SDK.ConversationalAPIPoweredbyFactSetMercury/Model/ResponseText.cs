/*
 * Conversational API Powered by FactSet Mercury
 *
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client's chatbot experience.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  **Conversational API Consumer Workflow**  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   **FAQ and Limitations**  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FatSet Support. 
 *
 * The version of the OpenAPI document: 1.0.2
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
    /// LLM natural language response to the query. Provides an answer to the question or references further attached data. &#x60;Value&#x60; property contains the response text represented in markdown format.   Response text from the Conversational API may contain &#x60;citations&#x60; which provide references to the source of the data in the textual response. If provided, phrases within the response text will be mapped to a data item in the &#x60;citations&#x60; object via a bracketed ID (e.g. &#x60;[1]&#x60;). Citations may be used to provide additional context or to verify the source of the data; in some cases, a single phrase within the response may be supported by multiple data sources. Links to the source data are provided as links to FactSet&#39;s Document Viewer (see OA page [here](https://my.apps.factset.com/oa/pages/17390)). If available, the link URL will directly point to the excerpted content highlighted within the document.  For an example of a response with citations, see the example labeled &#x60;ResponseWithCitationsExample&#x60;. 
    /// </summary>
    [DataContract(Name = "ResponseText")]
    public partial class ResponseText : IEquatable<ResponseText>, IValidatableObject
    {
        /// <summary>
        /// Datatype contained in this data object
        /// </summary>
        /// <value>Datatype contained in this data object</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum String for value: string
            /// </summary>
            [EnumMember(Value = "string")]
            String = 1

        }


        /// <summary>
        /// Datatype contained in this data object
        /// </summary>
        /// <value>Datatype contained in this data object</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ResponseText" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ResponseText() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ResponseText" /> class.
        /// </summary>
        /// <param name="type">Datatype contained in this data object (required).</param>
        /// <param name="value">String containing LLM natural language response to the query (required).</param>
        /// <param name="citations">A map of citations, where the keys are the citation IDs and the values are the citation schema objects..</param>
        public ResponseText(TypeEnum type, string value,Dictionary<string, List<Phrase>> citations = default(Dictionary<string, List<Phrase>>))
        {
            this.Type = type;
            // to ensure "value" is required (not null)
            if (value == null) {
                throw new ArgumentNullException("value is a required property for ResponseText and cannot be null");
            }
            this.Value = value;
            this.Citations = citations;
        }

        /// <summary>
        /// String containing LLM natural language response to the query
        /// </summary>
        /// <value>String containing LLM natural language response to the query</value>
        [DataMember(Name = "value", IsRequired = true, EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// A map of citations, where the keys are the citation IDs and the values are the citation schema objects.
        /// </summary>
        /// <value>A map of citations, where the keys are the citation IDs and the values are the citation schema objects.</value>
        [DataMember(Name = "citations", EmitDefaultValue = false)]
        public Dictionary<string, List<Phrase>> Citations { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ResponseText {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Citations: ").Append(Citations).Append("\n");
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
            return this.Equals(input as ResponseText);
        }

        /// <summary>
        /// Returns true if ResponseText instances are equal
        /// </summary>
        /// <param name="input">Instance of ResponseText to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ResponseText input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.Citations == input.Citations ||
                    this.Citations != null &&
                    input.Citations != null &&
                    this.Citations.SequenceEqual(input.Citations)
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
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                if (this.Citations != null)
                {
                    hashCode = (hashCode * 59) + this.Citations.GetHashCode();
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

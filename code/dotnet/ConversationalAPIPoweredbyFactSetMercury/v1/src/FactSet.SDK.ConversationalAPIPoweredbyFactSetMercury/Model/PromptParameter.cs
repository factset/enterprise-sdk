/*
 * Conversational API Powered by FactSet Mercury
 *
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   #### Receive updates on changes to the Conversational API Subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API  #### FAQ & Troubleshooting Please find FAQs and troubleshooting tips in the [FAQs section](https://my.apps.factset.com/oa/pages/23440) of the Conversational API OA page  ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support. 
 *
 * The version of the OpenAPI document: 1.0.7
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
    /// prompt parameter object
    /// </summary>
    [DataContract(Name = "PromptParameter")]
    public partial class PromptParameter : IEquatable<PromptParameter>, IValidatableObject
    {
        /// <summary>
        /// Selection type, currently only support single selection
        /// </summary>
        /// <value>Selection type, currently only support single selection</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SelectionTypeEnum
        {
            /// <summary>
            /// Enum Single for value: single
            /// </summary>
            [EnumMember(Value = "single")]
            Single = 1

        }


        /// <summary>
        /// Selection type, currently only support single selection
        /// </summary>
        /// <value>Selection type, currently only support single selection</value>
        [DataMember(Name = "selectionType", IsRequired = true, EmitDefaultValue = false)]
        public SelectionTypeEnum SelectionType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PromptParameter" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PromptParameter() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PromptParameter" /> class.
        /// </summary>
        /// <param name="selectionType">Selection type, currently only support single selection (required).</param>
        /// <param name="placeHolder">PlaceHolder value used in the prompt template (required).</param>
        /// <param name="value">Selection option values can be used to replace the placeHolder in the prompt template (required).</param>
        public PromptParameter(SelectionTypeEnum selectionType, string placeHolder, List<string> value)
        {
            this.SelectionType = selectionType;
            // to ensure "placeHolder" is required (not null)
            if (placeHolder == null) {
                throw new ArgumentNullException("placeHolder is a required property for PromptParameter and cannot be null");
            }
            this.PlaceHolder = placeHolder;
            // to ensure "value" is required (not null)
            if (value == null) {
                throw new ArgumentNullException("value is a required property for PromptParameter and cannot be null");
            }
            this.Value = value;
        }

        /// <summary>
        /// PlaceHolder value used in the prompt template
        /// </summary>
        /// <value>PlaceHolder value used in the prompt template</value>
        [DataMember(Name = "placeHolder", IsRequired = true, EmitDefaultValue = false)]
        public string PlaceHolder { get; set; }

        /// <summary>
        /// Selection option values can be used to replace the placeHolder in the prompt template
        /// </summary>
        /// <value>Selection option values can be used to replace the placeHolder in the prompt template</value>
        [DataMember(Name = "value", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PromptParameter {\n");
            sb.Append("  SelectionType: ").Append(SelectionType).Append("\n");
            sb.Append("  PlaceHolder: ").Append(PlaceHolder).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as PromptParameter);
        }

        /// <summary>
        /// Returns true if PromptParameter instances are equal
        /// </summary>
        /// <param name="input">Instance of PromptParameter to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PromptParameter input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.SelectionType == input.SelectionType ||
                    this.SelectionType.Equals(input.SelectionType)
                ) && 
                (
                    this.PlaceHolder == input.PlaceHolder ||
                    (this.PlaceHolder != null &&
                    this.PlaceHolder.Equals(input.PlaceHolder))
                ) && 
                (
                    this.Value == input.Value ||
                    this.Value != null &&
                    input.Value != null &&
                    this.Value.SequenceEqual(input.Value)
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
                hashCode = (hashCode * 59) + this.SelectionType.GetHashCode();
                if (this.PlaceHolder != null)
                {
                    hashCode = (hashCode * 59) + this.PlaceHolder.GetHashCode();
                }
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
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

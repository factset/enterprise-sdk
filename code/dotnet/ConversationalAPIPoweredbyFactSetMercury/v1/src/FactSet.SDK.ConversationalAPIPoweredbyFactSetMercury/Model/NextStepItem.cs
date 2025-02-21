/*
 * Conversational API Powered by FactSet Mercury
 *
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   #### Receive updates on changes to the Conversational API Subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API  #### FAQ & Troubleshooting Please find FAQs and troubleshooting tips in the [FAQs section](https://my.apps.factset.com/oa/pages/23440) of the Conversational API OA page  ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support. 
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
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model
{
    /// <summary>
    /// A single action item associated with the query response. The current supported actions are as below: * OpenUrl: Contains a URL to open relevant supporting content in the FactSet Workstation or other FactSet applications * Download: Contains a file ID to download a file associated with the response 
    /// </summary>
    [JsonConverter(typeof(NextStepItemJsonConverter))]
    [DataContract(Name = "NextStepItem")]
    public partial class NextStepItem : AbstractOpenAPISchema, IEquatable<NextStepItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NextStepItem" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of OpenUrl.</param>
        public NextStepItem(OpenUrl actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="NextStepItem" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Download.</param>
        public NextStepItem(Download actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value is OpenUrl)
                {
                    this._actualInstance = value;
                }
                else if (value is Download)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: OpenUrl, Download");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `OpenUrl`. If the actual instance is not `OpenUrl`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of OpenUrl</returns>
        public OpenUrl GetOpenUrl()
        {
            return (OpenUrl)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `Download`. If the actual instance is not `Download`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Download</returns>
        public Download GetDownload()
        {
            return (Download)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NextStepItem {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, NextStepItem.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of NextStepItem
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of NextStepItem</returns>
        public static NextStepItem FromJson(string jsonString)
        {
            NextStepItem newNextStepItem = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newNextStepItem;
            }

            try
            {
                var hasAdditionalProperties = !(typeof(OpenUrl).GetProperty("AdditionalProperties") is null);
                newNextStepItem = new NextStepItem(JsonConvert.DeserializeObject<OpenUrl>(
                    jsonString,
                    hasAdditionalProperties ? NextStepItem.AdditionalPropertiesSerializerSettings : NextStepItem.SerializerSettings
                ));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newNextStepItem;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into OpenUrl: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(Download).GetProperty("AdditionalProperties") is null);
                newNextStepItem = new NextStepItem(JsonConvert.DeserializeObject<Download>(
                    jsonString,
                    hasAdditionalProperties ? NextStepItem.AdditionalPropertiesSerializerSettings : NextStepItem.SerializerSettings
                ));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newNextStepItem;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Download: {1}", jsonString, exception.ToString()));
            }

            // no match found, throw an exception
            throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as NextStepItem);
        }

        /// <summary>
        /// Returns true if NextStepItem instances are equal
        /// </summary>
        /// <param name="input">Instance of NextStepItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NextStepItem input)
        {
            if (input == null)
                return false;

            return this.ActualInstance.Equals(input.ActualInstance);
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
                if (this.ActualInstance != null)
                    hashCode = hashCode * 59 + this.ActualInstance.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// Custom JSON converter for NextStepItem
    /// </summary>
    public class NextStepItemJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(NextStepItem).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            if(reader.TokenType != JsonToken.Null)
            {
                return NextStepItem.FromJson(JToken.Load(reader).ToString(Formatting.None));
            }
            return null;
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}

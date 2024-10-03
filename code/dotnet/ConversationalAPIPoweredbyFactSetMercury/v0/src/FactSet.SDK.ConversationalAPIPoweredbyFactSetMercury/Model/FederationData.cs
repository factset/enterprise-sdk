/*
 * Conversational API Powered by FactSet Mercury
 *
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client’s chatbot experience.  Request data from FactSet using natural language queries. Start the response generation using the `/query` endpoint, poll the status using `/status`. Once the result is ready, retrieve it using `/result`.  If your response contains a file ID, such as for an Excel chart or a FactSet ActiveGraph, retrieve it using the file ID at the `/download/file` endpoint.  We also encourage you to provide feedback on your responses using the `/feedback` endpoint!  **Please note:** \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable.  **Try the Conversational API and view Available Content**  In the [Using the Conversational API Online Assistant](https://my.apps.factset.com/oa/pages/23209) you can find instructions on how to start using the Conversational API, and the full list of content available.  Some of the prompts supported are:  - What is Tesla's enterprise value? - Create a chart showing CME price relative to the S&P 500 - What were the highlights from Palantir's recent earnings call?  **Adaptive Card Format**  The Conversational API uses the Microsoft Adaptive Card format for response data surfaced from FactSet content sets. `Value` property of parent FederationData contains a JSON serialized presentation of a Microsoft Adaptive Card. See [Microsoft docs](https://learn.microsoft.com/en-us/adaptive-cards/) for Adaptive Card documentation, and the [Adaptive Card schema explorer](https://adaptivecards.io/explorer/) for schema details. **Please note**: \"The adaptive card may contain actions, which represent functionality within the card itself. In order to execute these actions, a handler must be implemented in your Adaptive Card rendering process. See [handling actions](https://learn.microsoft.com/en-us/adaptive-cards/sdk/rendering-cards/javascript/actions) for an example implementation.  **STACH Format**  The Conversational API may use Factset's STACH V3 format to represent tabular data in JSON. Please refer to the [STACH V3 documentation](https://factset.github.io/stachschema/#/v3/README) on column organized data for more information on how to process STACH-organized data. <details>   <summary><u>**STACH Example**</u></summary>   ```json   {     \"version\": \"3.1\",     \"table\": {       \"primaryKeys\": [         \"Insider Holders\",         \"MV (M,$)\",         \"% O/S\"       ],       \"totalNumRows\": 5     },     \"views\": [       {         \"name\": \"view\",         \"displayName\": \"who are the suppliers of nike\",         \"table\": {           \"columns\": [             \"Insider Holders\",             \"MV (M,$)\",             \"% O/S\"           ],           \"headers\": {             \"Insider Holders\": \"Insider Holders\",             \"MV (M,$)\": \"MV (M,$)\",             \"% O/S\": \"% O/S\"           }         }       }     ],     \"columns\": [       {         \"name\": \"Insider Holders\",         \"contextualType\": \"string\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 100           }         }       },       {         \"name\": \"MV (M,$)\",         \"contextualType\": \"real\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 67           }         }       },       {         \"name\": \"% O/S\",         \"contextualType\": \"real\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 34           }         }       }     ],     \"rows\": [       {         \"Insider Holders\": \"Knight Philip Hampson\",         \"MV (M,$)\": 3156.8,         \"% O/S\": 1.531       },       {         \"Insider Holders\": \"Knight Travis A\",         \"MV (M,$)\": 601.6,         \"% O/S\": 0.496       },       {         \"Insider Holders\": \"Wellcome Trust Ltd. (Direct Investments)\",         \"MV (M,$)\": 225.5,         \"% O/S\": 0.105       },       {         \"Insider Holders\": \"Parker Mark G\",         \"MV (M,$)\": 100.1,         \"% O/S\": 0.056       },       {         \"Insider Holders\": \"Donahoe John J Ii\",         \"MV (M,$)\": 19.8,         \"% O/S\": 0.018       }     ]   }   ``` </details>  **Citations**  Responses from the Conversational API may contain `citations` which provide references to the source of the data directly within the textual response. Phrases within the response text are mapped to a data item in the `citations` object via a bracketed ID (e.g. `[1]`). Citations may be used to provide additional context or to verify the source of the data; in some cases, a single phrase within the response may be supported by multiple data sources. **Please note**: Links to the source data are provided as links to FactSet's Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). The link will direct you to the entire document; you may need to search for the specific phrase within the document. We are currently working on providing direct links to the specific section or excerpt of the document. <details>   <summary><u>**Citation Example**</u></summary>   ```json   {     \"type\": \"string\",     \"value\": \"FactSet has expressed optimism about the potential of generative AI (GenAI) to enhance their product offerings and drive efficiency[1].\"     \"citations\": {       \"[1]\": [         \"phraseId\": \"aba1d533-08b3-4d3e-8961-5d37bb2caff6\",         \"content\": \"At the same time, expectations are high around the effect generative AI will have on our industry.\",         \"speakerInfo\": {           \"companyId\": \"0016YD-E\",           \"companyName\": \"FactSet Research Systems, Inc.\",           \"speakerId\": \"0DPHLH-E\",           \"speakerName\": \"Philip Snow\",           \"speakerTitle\": \"Chief Executive Officer & Director\"         },         \"sourceURL\": \"https://my.apps.factset.com/viewer-fusion/?_doc_id=2948302-t&_doc_date=20231219&_doc_product=FCST&_doc_docfn=/home/docs/fcst/8/302/2948302-t.pdf&e=false\"       ]     }   }   ``` </details> 
 *
 * The version of the OpenAPI document: 0.6.0
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
using System.Reflection;

namespace FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model
{
    /// <summary>
    /// Data surfaced by processing the query through FactSet Mercury. Contains financial data, if accessible and available, as well as natural language answer to the query
    /// </summary>
    [JsonConverter(typeof(FederationDataJsonConverter))]
    [DataContract(Name = "FederationData")]
    public partial class FederationData : AbstractOpenAPISchema, IEquatable<FederationData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FederationData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ResponseString.</param>
        public FederationData(ResponseString actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FederationData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of AdaptiveCard.</param>
        public FederationData(AdaptiveCard actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FederationData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Table.</param>
        public FederationData(Table actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FederationData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of NextStep.</param>
        public FederationData(NextStep actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FederationData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of SuggestedPrompts.</param>
        public FederationData(SuggestedPrompts actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
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
                if (value is ResponseString)
                {
                    this._actualInstance = value;
                }
                else if (value is AdaptiveCard)
                {
                    this._actualInstance = value;
                }
                else if (value is Table)
                {
                    this._actualInstance = value;
                }
                else if (value is NextStep)
                {
                    this._actualInstance = value;
                }
                else if (value is SuggestedPrompts)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: ResponseString, AdaptiveCard, Table, NextStep, SuggestedPrompts");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `ResponseString`. If the actual instance is not `ResponseString`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ResponseString</returns>
        public ResponseString GetResponseString()
        {
            return (ResponseString)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `AdaptiveCard`. If the actual instance is not `AdaptiveCard`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of AdaptiveCard</returns>
        public AdaptiveCard GetAdaptiveCard()
        {
            return (AdaptiveCard)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `Table`. If the actual instance is not `Table`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Table</returns>
        public Table GetTable()
        {
            return (Table)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `NextStep`. If the actual instance is not `NextStep`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of NextStep</returns>
        public NextStep GetNextStep()
        {
            return (NextStep)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `SuggestedPrompts`. If the actual instance is not `SuggestedPrompts`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of SuggestedPrompts</returns>
        public SuggestedPrompts GetSuggestedPrompts()
        {
            return (SuggestedPrompts)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FederationData {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, FederationData.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of FederationData
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of FederationData</returns>
        public static FederationData FromJson(string jsonString)
        {
            FederationData newFederationData = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newFederationData;
            }

            try
            {
                var discriminatorObj = JObject.Parse(jsonString)["type"];
                string discriminatorValue =  discriminatorObj == null ?string.Empty :discriminatorObj.ToString();
                switch (discriminatorValue)
                {
                    case "AdaptiveCard":
                        newFederationData = new FederationData(JsonConvert.DeserializeObject<AdaptiveCard>(jsonString, FederationData.AdditionalPropertiesSerializerSettings));
                        return newFederationData;
                    case "NextStep":
                        newFederationData = new FederationData(JsonConvert.DeserializeObject<NextStep>(jsonString, FederationData.AdditionalPropertiesSerializerSettings));
                        return newFederationData;
                    case "ResponseString":
                        newFederationData = new FederationData(JsonConvert.DeserializeObject<ResponseString>(jsonString, FederationData.AdditionalPropertiesSerializerSettings));
                        return newFederationData;
                    case "SuggestedPrompts":
                        newFederationData = new FederationData(JsonConvert.DeserializeObject<SuggestedPrompts>(jsonString, FederationData.AdditionalPropertiesSerializerSettings));
                        return newFederationData;
                    case "Table":
                        newFederationData = new FederationData(JsonConvert.DeserializeObject<Table>(jsonString, FederationData.AdditionalPropertiesSerializerSettings));
                        return newFederationData;
                    case "string":
                        newFederationData = new FederationData(JsonConvert.DeserializeObject<ResponseString>(jsonString, FederationData.AdditionalPropertiesSerializerSettings));
                        return newFederationData;
                    default:
                        System.Diagnostics.Debug.WriteLine(string.Format("Failed to lookup discriminator value `{0}` for FederationData. Possible values: AdaptiveCard NextStep ResponseString SuggestedPrompts Table string", discriminatorValue));
                        break;
                }
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to parse the json data : `{0}` {1}", jsonString, ex.ToString()));
            }

            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                var hasAdditionalProperties = !(typeof(ResponseString).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<ResponseString>(
                    jsonString,
                    hasAdditionalProperties ? FederationData.AdditionalPropertiesSerializerSettings : FederationData.SerializerSettings
                );
                newFederationData = new FederationData(parsedValue);
                matchedTypes.Add("ResponseString");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into ResponseString: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(AdaptiveCard).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<AdaptiveCard>(
                    jsonString,
                    hasAdditionalProperties ? FederationData.AdditionalPropertiesSerializerSettings : FederationData.SerializerSettings
                );
                newFederationData = new FederationData(parsedValue);
                matchedTypes.Add("AdaptiveCard");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into AdaptiveCard: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(Table).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<Table>(
                    jsonString,
                    hasAdditionalProperties ? FederationData.AdditionalPropertiesSerializerSettings : FederationData.SerializerSettings
                );
                newFederationData = new FederationData(parsedValue);
                matchedTypes.Add("Table");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Table: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(NextStep).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<NextStep>(
                    jsonString,
                    hasAdditionalProperties ? FederationData.AdditionalPropertiesSerializerSettings : FederationData.SerializerSettings
                );
                newFederationData = new FederationData(parsedValue);
                matchedTypes.Add("NextStep");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into NextStep: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(SuggestedPrompts).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<SuggestedPrompts>(
                    jsonString,
                    hasAdditionalProperties ? FederationData.AdditionalPropertiesSerializerSettings : FederationData.SerializerSettings
                );
                newFederationData = new FederationData(parsedValue);
                matchedTypes.Add("SuggestedPrompts");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into SuggestedPrompts: {1}", jsonString, exception.ToString()));
            }

            if (match == 0)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
            }
            else if (match > 1)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + matchedTypes);
            }

            // deserialization is considered successful at this point if no exception has been thrown.
            return newFederationData;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as FederationData);
        }

        /// <summary>
        /// Returns true if FederationData instances are equal
        /// </summary>
        /// <param name="input">Instance of FederationData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FederationData input)
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
    /// Custom JSON converter for FederationData
    /// </summary>
    public class FederationDataJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(FederationData).GetMethod("ToJson").Invoke(value, null)));
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
                return FederationData.FromJson(JToken.Load(reader).ToString(Formatting.None));
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

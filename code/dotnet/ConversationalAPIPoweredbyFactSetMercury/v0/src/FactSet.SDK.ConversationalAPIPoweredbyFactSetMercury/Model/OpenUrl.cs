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
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model
{
    /// <summary>
    /// Directive to open a FactSet Url. 
    /// </summary>
    [DataContract(Name = "OpenUrl")]
    public partial class OpenUrl : IEquatable<OpenUrl>, IValidatableObject
    {
        /// <summary>
        /// Type of action
        /// </summary>
        /// <value>Type of action</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ActionEnum
        {
            /// <summary>
            /// Enum OpenUrl for value: OpenUrl
            /// </summary>
            [EnumMember(Value = "OpenUrl")]
            OpenUrl = 1

        }


        /// <summary>
        /// Type of action
        /// </summary>
        /// <value>Type of action</value>
        [DataMember(Name = "action", EmitDefaultValue = false)]
        public ActionEnum? Action { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OpenUrl" /> class.
        /// </summary>
        /// <param name="action">Type of action.</param>
        /// <param name="name">Name of associated url.</param>
        /// <param name="label">Label of associated url.</param>
        /// <param name="category">Category of associated url.</param>
        /// <param name="url">url.</param>
        public OpenUrl(ActionEnum? action = default(ActionEnum?), string name = default(string), string label = default(string), string category = default(string), OpenUrlUrl url = default(OpenUrlUrl))
        {
            this.Action = action;
            this.Name = name;
            this.Label = label;
            this.Category = category;
            this.Url = url;
        }

        /// <summary>
        /// Name of associated url
        /// </summary>
        /// <value>Name of associated url</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Label of associated url
        /// </summary>
        /// <value>Label of associated url</value>
        [DataMember(Name = "label", EmitDefaultValue = false)]
        public string Label { get; set; }

        /// <summary>
        /// Category of associated url
        /// </summary>
        /// <value>Category of associated url</value>
        [DataMember(Name = "category", EmitDefaultValue = false)]
        public string Category { get; set; }

        /// <summary>
        /// Gets or Sets Url
        /// </summary>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public OpenUrlUrl Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OpenUrl {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
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
            return this.Equals(input as OpenUrl);
        }

        /// <summary>
        /// Returns true if OpenUrl instances are equal
        /// </summary>
        /// <param name="input">Instance of OpenUrl to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OpenUrl input)
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
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
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
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
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

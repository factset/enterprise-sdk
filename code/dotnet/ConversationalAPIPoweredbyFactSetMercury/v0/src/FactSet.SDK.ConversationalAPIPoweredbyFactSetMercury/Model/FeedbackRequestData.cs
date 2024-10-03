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
    /// Data object
    /// </summary>
    [DataContract(Name = "FeedbackRequest_data")]
    public partial class FeedbackRequestData : IEquatable<FeedbackRequestData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FeedbackRequestData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FeedbackRequestData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FeedbackRequestData" /> class.
        /// </summary>
        /// <param name="responseId">Response ID received from the &#x60;/result&#x60; endpoint, representing the response for which you are providing feedback. (required).</param>
        /// <param name="helpful">Boolean representing whether the response was helpful (true) or not helpful (false). If the response left out any requested information, please mark as not helpful. (required).</param>
        /// <param name="comment">Optional field for additional feedback. If you would like to provide natural language feedback, include comments here. Comments are limited to 4000 characters; if you need to provide more feedback, please reach out to your FactSet Support Team representative. .</param>
        public FeedbackRequestData(Guid responseId, bool helpful,string comment = default(string))
        {
            this.ResponseId = responseId;
            this.Helpful = helpful;
            this.Comment = comment;
        }

        /// <summary>
        /// Response ID received from the &#x60;/result&#x60; endpoint, representing the response for which you are providing feedback.
        /// </summary>
        /// <value>Response ID received from the &#x60;/result&#x60; endpoint, representing the response for which you are providing feedback.</value>
        [DataMember(Name = "responseId", IsRequired = true, EmitDefaultValue = false)]
        public Guid ResponseId { get; set; }

        /// <summary>
        /// Boolean representing whether the response was helpful (true) or not helpful (false). If the response left out any requested information, please mark as not helpful.
        /// </summary>
        /// <value>Boolean representing whether the response was helpful (true) or not helpful (false). If the response left out any requested information, please mark as not helpful.</value>
        [DataMember(Name = "helpful", IsRequired = true, EmitDefaultValue = true)]
        public bool Helpful { get; set; }

        /// <summary>
        /// Optional field for additional feedback. If you would like to provide natural language feedback, include comments here. Comments are limited to 4000 characters; if you need to provide more feedback, please reach out to your FactSet Support Team representative. 
        /// </summary>
        /// <value>Optional field for additional feedback. If you would like to provide natural language feedback, include comments here. Comments are limited to 4000 characters; if you need to provide more feedback, please reach out to your FactSet Support Team representative. </value>
        [DataMember(Name = "comment", EmitDefaultValue = true)]
        public string Comment { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FeedbackRequestData {\n");
            sb.Append("  ResponseId: ").Append(ResponseId).Append("\n");
            sb.Append("  Helpful: ").Append(Helpful).Append("\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
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
            return this.Equals(input as FeedbackRequestData);
        }

        /// <summary>
        /// Returns true if FeedbackRequestData instances are equal
        /// </summary>
        /// <param name="input">Instance of FeedbackRequestData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FeedbackRequestData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ResponseId == input.ResponseId ||
                    (this.ResponseId != null &&
                    this.ResponseId.Equals(input.ResponseId))
                ) && 
                (
                    this.Helpful == input.Helpful ||
                    this.Helpful.Equals(input.Helpful)
                ) && 
                (
                    this.Comment == input.Comment ||
                    (this.Comment != null &&
                    this.Comment.Equals(input.Comment))
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
                if (this.ResponseId != null)
                {
                    hashCode = (hashCode * 59) + this.ResponseId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Helpful.GetHashCode();
                if (this.Comment != null)
                {
                    hashCode = (hashCode * 59) + this.Comment.GetHashCode();
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
            // Comment (string) maxLength
            if (this.Comment != null && this.Comment.Length > 4000)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Comment, length must be less than 4000.", new [] { "Comment" });
            }

            // Comment (string) minLength
            if (this.Comment != null && this.Comment.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Comment, length must be greater than 1.", new [] { "Comment" });
            }

            yield break;
        }
    }

}

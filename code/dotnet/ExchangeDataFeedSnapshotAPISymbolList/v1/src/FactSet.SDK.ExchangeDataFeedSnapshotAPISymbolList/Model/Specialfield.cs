/*
 * Exchange DataFeed Snapshot
 *
 * FactSet’s Exchange DataFeed Snapshot API provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 300 global exchanges and 150+ data fields. Asset types integrated include equities, futures, options, warrants, fixed income, mutual funds, ETFs, indices, commodities, and FX rates. <p>Cutting-edge technology ensures reliability and provides scalability that allow applications to request multiple items at a time. To simplify client-side development an entire response can be placed in a matrix or table for effortless integration into internal and external applications. Using specified output formats (CSV, XML, JSON) receive all standard fields by default or customize the list based on specific needs.</p></p>Below are the current hosts:</p><p>Production: api.factset.com<p>Sandbox: api-sandbox.factset.com</p>
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.ExchangeDataFeedSnapshotAPISymbolList.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ExchangeDataFeedSnapshotAPISymbolList.Model
{
    /// <summary>
    /// Specialfield
    /// </summary>
    [DataContract(Name = "specialfield")]
    public partial class Specialfield : IEquatable<Specialfield>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Specialfield" /> class.
        /// </summary>
        /// <param name="nF">**#NF#** - Not found. The requested symbol could not be found by the service..</param>
        /// <param name="nA">**#NA#** - Not Applicable. The requested field could not be found for the requested symbol. This usually means that the field is not applicable for this type of record..</param>
        /// <param name="nE">**#NE#** - Not Entitled. The supplied username and password are not entitled to the data requested..</param>
        public Specialfield(string nF = default(string), string nA = default(string), Object nE = default(Object))
        {
            this.NF = nF;
            this.NA = nA;
            this.NE = nE;
        }

        /// <summary>
        /// **#NF#** - Not found. The requested symbol could not be found by the service.
        /// </summary>
        /// <value>**#NF#** - Not found. The requested symbol could not be found by the service.</value>
        [DataMember(Name = "NF", EmitDefaultValue = false)]
        public string NF { get; set; }

        /// <summary>
        /// **#NA#** - Not Applicable. The requested field could not be found for the requested symbol. This usually means that the field is not applicable for this type of record.
        /// </summary>
        /// <value>**#NA#** - Not Applicable. The requested field could not be found for the requested symbol. This usually means that the field is not applicable for this type of record.</value>
        [DataMember(Name = "NA", EmitDefaultValue = false)]
        public string NA { get; set; }

        /// <summary>
        /// **#NE#** - Not Entitled. The supplied username and password are not entitled to the data requested.
        /// </summary>
        /// <value>**#NE#** - Not Entitled. The supplied username and password are not entitled to the data requested.</value>
        [DataMember(Name = "NE", EmitDefaultValue = true)]
        public Object NE { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Specialfield {\n");
            sb.Append("  NF: ").Append(NF).Append("\n");
            sb.Append("  NA: ").Append(NA).Append("\n");
            sb.Append("  NE: ").Append(NE).Append("\n");
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
            return this.Equals(input as Specialfield);
        }

        /// <summary>
        /// Returns true if Specialfield instances are equal
        /// </summary>
        /// <param name="input">Instance of Specialfield to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Specialfield input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.NF == input.NF ||
                    (this.NF != null &&
                    this.NF.Equals(input.NF))
                ) && 
                (
                    this.NA == input.NA ||
                    (this.NA != null &&
                    this.NA.Equals(input.NA))
                ) && 
                (
                    this.NE == input.NE ||
                    (this.NE != null &&
                    this.NE.Equals(input.NE))
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
                if (this.NF != null)
                {
                    hashCode = (hashCode * 59) + this.NF.GetHashCode();
                }
                if (this.NA != null)
                {
                    hashCode = (hashCode * 59) + this.NA.GetHashCode();
                }
                if (this.NE != null)
                {
                    hashCode = (hashCode * 59) + this.NE.GetHashCode();
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

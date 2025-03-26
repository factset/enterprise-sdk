/*
 * Tick History
 *
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.4.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTickHistory.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTickHistory.Model
{
    /// <summary>
    ///  NOTE:       - Using start and end parameters within dateTimeRange will fetch the data on particular days in between the timestamps given.      - The start and end times are processed as the local time of the factsetExchangeCode provided. Please refer to the **Data Model User Guide** for time zone to exchange mappings.      - Supports milliseconds, YYYY-MM-DDTHH:MM:SS.SSSZ where .SSS represents the milliseconds which is optional. 
    /// </summary>
    [DataContract(Name = "DateTimePeriod")]
    public partial class DateTimePeriod : IEquatable<DateTimePeriod>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DateTimePeriod" /> class.
        /// </summary>
        /// <param name="start">The date for (or from which) the data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.  .</param>
        /// <param name="end">The date to which data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.  .</param>
        public DateTimePeriod(DateTime start = default(DateTime), DateTime end = default(DateTime))
        {
            this.Start = start;
            this.End = end;
        }

        /// <summary>
        /// The date for (or from which) the data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.  
        /// </summary>
        /// <value>The date for (or from which) the data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.  </value>
        [DataMember(Name = "start", EmitDefaultValue = false)]
        public DateTime Start { get; set; }

        /// <summary>
        /// The date to which data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.  
        /// </summary>
        /// <value>The date to which data is required. Supports in YYYY-MM-DDTHH:MM:SSZ format.  </value>
        [DataMember(Name = "end", EmitDefaultValue = false)]
        public DateTime End { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DateTimePeriod {\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
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
            return this.Equals(input as DateTimePeriod);
        }

        /// <summary>
        /// Returns true if DateTimePeriod instances are equal
        /// </summary>
        /// <param name="input">Instance of DateTimePeriod to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DateTimePeriod input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
                ) && 
                (
                    this.End == input.End ||
                    (this.End != null &&
                    this.End.Equals(input.End))
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
                if (this.Start != null)
                {
                    hashCode = (hashCode * 59) + this.Start.GetHashCode();
                }
                if (this.End != null)
                {
                    hashCode = (hashCode * 59) + this.End.GetHashCode();
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

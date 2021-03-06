/*
 * Classifications API
 *
 * The Classifications API gives access to various Industry Classifications for a given list of securities. Beginning first with GICS Direct, the service will then expand to offering NAICS, SIC, RBICS, and more.  
 *
 * The version of the OpenAPI document: 1.0.1
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
using OpenAPIDateConverter = FactSet.SDK.Classifications.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Classifications.Model
{
    /// <summary>
    /// Gics
    /// </summary>
    [DataContract(Name = "gics")]
    public partial class Gics : IEquatable<Gics>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Gics" /> class.
        /// </summary>
        /// <param name="fsymId">FactSet Entity Identifier by default, otherwise returns FactSet Regional Identifier. This is a six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E)..</param>
        /// <param name="date">Date in YYYY-MM-DD for the classification record from GICS Direct.</param>
        /// <param name="gicsSectorName">GICS Sector Name in Proper Format..</param>
        /// <param name="gicsSectorNumber">GICS Sector Number.</param>
        /// <param name="gicsIndustryGroupName">GICS Industry Group Name in Proper Format..</param>
        /// <param name="gicsIndustryGroupNumber">GICS Industry Group Number.</param>
        /// <param name="gicsIndustryName">GICS Industry Name in Proper Format..</param>
        /// <param name="gicsIndustryNumber">GICS Industry Number.</param>
        /// <param name="gicsSubIndustryName">GICS Sub-Industry Name in Proper Format..</param>
        /// <param name="gicsSubIndustryNumber">GICS Industry Number..</param>
        /// <param name="requestId">Identifier specified in the request.</param>
        public Gics(string fsymId = default(string), DateTime date = default(DateTime), string gicsSectorName = default(string), string gicsSectorNumber = default(string), string gicsIndustryGroupName = default(string), string gicsIndustryGroupNumber = default(string), string gicsIndustryName = default(string), string gicsIndustryNumber = default(string), string gicsSubIndustryName = default(string), string gicsSubIndustryNumber = default(string), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.Date = date;
            this.GicsSectorName = gicsSectorName;
            this.GicsSectorNumber = gicsSectorNumber;
            this.GicsIndustryGroupName = gicsIndustryGroupName;
            this.GicsIndustryGroupNumber = gicsIndustryGroupNumber;
            this.GicsIndustryName = gicsIndustryName;
            this.GicsIndustryNumber = gicsIndustryNumber;
            this.GicsSubIndustryName = gicsSubIndustryName;
            this.GicsSubIndustryNumber = gicsSubIndustryNumber;
            this.RequestId = requestId;
        }

        /// <summary>
        /// FactSet Entity Identifier by default, otherwise returns FactSet Regional Identifier. This is a six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E).
        /// </summary>
        /// <value>FactSet Entity Identifier by default, otherwise returns FactSet Regional Identifier. This is a six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E).</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// Date in YYYY-MM-DD for the classification record from GICS Direct
        /// </summary>
        /// <value>Date in YYYY-MM-DD for the classification record from GICS Direct</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Date { get; set; }

        /// <summary>
        /// GICS Sector Name in Proper Format.
        /// </summary>
        /// <value>GICS Sector Name in Proper Format.</value>
        [DataMember(Name = "gicsSectorName", EmitDefaultValue = false)]
        public string GicsSectorName { get; set; }

        /// <summary>
        /// GICS Sector Number
        /// </summary>
        /// <value>GICS Sector Number</value>
        [DataMember(Name = "gicsSectorNumber", EmitDefaultValue = false)]
        public string GicsSectorNumber { get; set; }

        /// <summary>
        /// GICS Industry Group Name in Proper Format.
        /// </summary>
        /// <value>GICS Industry Group Name in Proper Format.</value>
        [DataMember(Name = "gicsIndustryGroupName", EmitDefaultValue = false)]
        public string GicsIndustryGroupName { get; set; }

        /// <summary>
        /// GICS Industry Group Number
        /// </summary>
        /// <value>GICS Industry Group Number</value>
        [DataMember(Name = "gicsIndustryGroupNumber", EmitDefaultValue = false)]
        public string GicsIndustryGroupNumber { get; set; }

        /// <summary>
        /// GICS Industry Name in Proper Format.
        /// </summary>
        /// <value>GICS Industry Name in Proper Format.</value>
        [DataMember(Name = "gicsIndustryName", EmitDefaultValue = false)]
        public string GicsIndustryName { get; set; }

        /// <summary>
        /// GICS Industry Number
        /// </summary>
        /// <value>GICS Industry Number</value>
        [DataMember(Name = "gicsIndustryNumber", EmitDefaultValue = false)]
        public string GicsIndustryNumber { get; set; }

        /// <summary>
        /// GICS Sub-Industry Name in Proper Format.
        /// </summary>
        /// <value>GICS Sub-Industry Name in Proper Format.</value>
        [DataMember(Name = "gicsSubIndustryName", EmitDefaultValue = false)]
        public string GicsSubIndustryName { get; set; }

        /// <summary>
        /// GICS Industry Number.
        /// </summary>
        /// <value>GICS Industry Number.</value>
        [DataMember(Name = "gicsSubIndustryNumber", EmitDefaultValue = false)]
        public string GicsSubIndustryNumber { get; set; }

        /// <summary>
        /// Identifier specified in the request
        /// </summary>
        /// <value>Identifier specified in the request</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Gics {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  GicsSectorName: ").Append(GicsSectorName).Append("\n");
            sb.Append("  GicsSectorNumber: ").Append(GicsSectorNumber).Append("\n");
            sb.Append("  GicsIndustryGroupName: ").Append(GicsIndustryGroupName).Append("\n");
            sb.Append("  GicsIndustryGroupNumber: ").Append(GicsIndustryGroupNumber).Append("\n");
            sb.Append("  GicsIndustryName: ").Append(GicsIndustryName).Append("\n");
            sb.Append("  GicsIndustryNumber: ").Append(GicsIndustryNumber).Append("\n");
            sb.Append("  GicsSubIndustryName: ").Append(GicsSubIndustryName).Append("\n");
            sb.Append("  GicsSubIndustryNumber: ").Append(GicsSubIndustryNumber).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
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
            return this.Equals(input as Gics);
        }

        /// <summary>
        /// Returns true if Gics instances are equal
        /// </summary>
        /// <param name="input">Instance of Gics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Gics input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.GicsSectorName == input.GicsSectorName ||
                    (this.GicsSectorName != null &&
                    this.GicsSectorName.Equals(input.GicsSectorName))
                ) && 
                (
                    this.GicsSectorNumber == input.GicsSectorNumber ||
                    (this.GicsSectorNumber != null &&
                    this.GicsSectorNumber.Equals(input.GicsSectorNumber))
                ) && 
                (
                    this.GicsIndustryGroupName == input.GicsIndustryGroupName ||
                    (this.GicsIndustryGroupName != null &&
                    this.GicsIndustryGroupName.Equals(input.GicsIndustryGroupName))
                ) && 
                (
                    this.GicsIndustryGroupNumber == input.GicsIndustryGroupNumber ||
                    (this.GicsIndustryGroupNumber != null &&
                    this.GicsIndustryGroupNumber.Equals(input.GicsIndustryGroupNumber))
                ) && 
                (
                    this.GicsIndustryName == input.GicsIndustryName ||
                    (this.GicsIndustryName != null &&
                    this.GicsIndustryName.Equals(input.GicsIndustryName))
                ) && 
                (
                    this.GicsIndustryNumber == input.GicsIndustryNumber ||
                    (this.GicsIndustryNumber != null &&
                    this.GicsIndustryNumber.Equals(input.GicsIndustryNumber))
                ) && 
                (
                    this.GicsSubIndustryName == input.GicsSubIndustryName ||
                    (this.GicsSubIndustryName != null &&
                    this.GicsSubIndustryName.Equals(input.GicsSubIndustryName))
                ) && 
                (
                    this.GicsSubIndustryNumber == input.GicsSubIndustryNumber ||
                    (this.GicsSubIndustryNumber != null &&
                    this.GicsSubIndustryNumber.Equals(input.GicsSubIndustryNumber))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
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
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.GicsSectorName != null)
                {
                    hashCode = (hashCode * 59) + this.GicsSectorName.GetHashCode();
                }
                if (this.GicsSectorNumber != null)
                {
                    hashCode = (hashCode * 59) + this.GicsSectorNumber.GetHashCode();
                }
                if (this.GicsIndustryGroupName != null)
                {
                    hashCode = (hashCode * 59) + this.GicsIndustryGroupName.GetHashCode();
                }
                if (this.GicsIndustryGroupNumber != null)
                {
                    hashCode = (hashCode * 59) + this.GicsIndustryGroupNumber.GetHashCode();
                }
                if (this.GicsIndustryName != null)
                {
                    hashCode = (hashCode * 59) + this.GicsIndustryName.GetHashCode();
                }
                if (this.GicsIndustryNumber != null)
                {
                    hashCode = (hashCode * 59) + this.GicsIndustryNumber.GetHashCode();
                }
                if (this.GicsSubIndustryName != null)
                {
                    hashCode = (hashCode * 59) + this.GicsSubIndustryName.GetHashCode();
                }
                if (this.GicsSubIndustryNumber != null)
                {
                    hashCode = (hashCode * 59) + this.GicsSubIndustryNumber.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
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

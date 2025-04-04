/*
 * Best Execution Analytics for Smarter Trading (BEAST) API
 *
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 2.0.0
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
using OpenAPIDateConverter = FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Model
{
    /// <summary>
    /// Price Time Trade object
    /// </summary>
    [DataContract(Name = "PriceTimeTrade")]
    public partial class PriceTimeTrade : IEquatable<PriceTimeTrade>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PriceTimeTrade" /> class.
        /// </summary>
        /// <param name="time">Time.</param>
        /// <param name="price">Price.</param>
        /// <param name="venue">Venue.</param>
        /// <param name="volume">Volume.</param>
        /// <param name="conditionCodes">Condition Codes.</param>
        /// <param name="venueCode">Venue Code.</param>
        /// <param name="cumVwap">cumVwap.</param>
        public PriceTimeTrade(long time = default(long), double price = default(double), string venue = default(string), double volume = default(double), string conditionCodes = default(string), int venueCode = default(int), double cumVwap = default(double))
        {
            this.Time = time;
            this.Price = price;
            this.Venue = venue;
            this.Volume = volume;
            this.ConditionCodes = conditionCodes;
            this.VenueCode = venueCode;
            this.CumVwap = cumVwap;
        }

        /// <summary>
        /// Time
        /// </summary>
        /// <value>Time</value>
        [DataMember(Name = "time", EmitDefaultValue = false)]
        public long Time { get; set; }

        /// <summary>
        /// Price
        /// </summary>
        /// <value>Price</value>
        [DataMember(Name = "price", EmitDefaultValue = false)]
        public double Price { get; set; }

        /// <summary>
        /// Venue
        /// </summary>
        /// <value>Venue</value>
        [DataMember(Name = "venue", EmitDefaultValue = false)]
        public string Venue { get; set; }

        /// <summary>
        /// Volume
        /// </summary>
        /// <value>Volume</value>
        [DataMember(Name = "volume", EmitDefaultValue = false)]
        public double Volume { get; set; }

        /// <summary>
        /// Condition Codes
        /// </summary>
        /// <value>Condition Codes</value>
        [DataMember(Name = "conditionCodes", EmitDefaultValue = false)]
        public string ConditionCodes { get; set; }

        /// <summary>
        /// Venue Code
        /// </summary>
        /// <value>Venue Code</value>
        [DataMember(Name = "venueCode", EmitDefaultValue = false)]
        public int VenueCode { get; set; }

        /// <summary>
        /// cumVwap
        /// </summary>
        /// <value>cumVwap</value>
        [DataMember(Name = "cumVwap", EmitDefaultValue = false)]
        public double CumVwap { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PriceTimeTrade {\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Venue: ").Append(Venue).Append("\n");
            sb.Append("  Volume: ").Append(Volume).Append("\n");
            sb.Append("  ConditionCodes: ").Append(ConditionCodes).Append("\n");
            sb.Append("  VenueCode: ").Append(VenueCode).Append("\n");
            sb.Append("  CumVwap: ").Append(CumVwap).Append("\n");
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
            return this.Equals(input as PriceTimeTrade);
        }

        /// <summary>
        /// Returns true if PriceTimeTrade instances are equal
        /// </summary>
        /// <param name="input">Instance of PriceTimeTrade to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PriceTimeTrade input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Time == input.Time ||
                    this.Time.Equals(input.Time)
                ) && 
                (
                    this.Price == input.Price ||
                    this.Price.Equals(input.Price)
                ) && 
                (
                    this.Venue == input.Venue ||
                    (this.Venue != null &&
                    this.Venue.Equals(input.Venue))
                ) && 
                (
                    this.Volume == input.Volume ||
                    this.Volume.Equals(input.Volume)
                ) && 
                (
                    this.ConditionCodes == input.ConditionCodes ||
                    (this.ConditionCodes != null &&
                    this.ConditionCodes.Equals(input.ConditionCodes))
                ) && 
                (
                    this.VenueCode == input.VenueCode ||
                    this.VenueCode.Equals(input.VenueCode)
                ) && 
                (
                    this.CumVwap == input.CumVwap ||
                    this.CumVwap.Equals(input.CumVwap)
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
                hashCode = (hashCode * 59) + this.Time.GetHashCode();
                hashCode = (hashCode * 59) + this.Price.GetHashCode();
                if (this.Venue != null)
                {
                    hashCode = (hashCode * 59) + this.Venue.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Volume.GetHashCode();
                if (this.ConditionCodes != null)
                {
                    hashCode = (hashCode * 59) + this.ConditionCodes.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.VenueCode.GetHashCode();
                hashCode = (hashCode * 59) + this.CumVwap.GetHashCode();
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

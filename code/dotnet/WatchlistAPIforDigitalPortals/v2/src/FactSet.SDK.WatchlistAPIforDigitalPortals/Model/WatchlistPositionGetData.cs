/*
 * Watchlist API For Digital Portals
 *
 * Watchlists keeps track of users' individual investment objectives. They are meant to support the self-directed business of wealth management firms.  The Watchlist API for Digital Portals is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments in a watchlist. This also supports basic security identifier cross-reference. To complement the Watchlist API with direct access to price histories, please refer to the Time Series API for Digital Portals.
 *
 * The version of the OpenAPI document: 2
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
using OpenAPIDateConverter = FactSet.SDK.WatchlistAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.WatchlistAPIforDigitalPortals.Model
{
    /// <summary>
    /// The data member contains the request&#39;s primary data.
    /// </summary>
    [DataContract(Name = "_watchlist_position_get_data")]
    public partial class WatchlistPositionGetData : IEquatable<WatchlistPositionGetData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WatchlistPositionGetData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected WatchlistPositionGetData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="WatchlistPositionGetData" /> class.
        /// </summary>
        /// <param name="id">Identifier of the watchlist. (required).</param>
        /// <param name="position">position (required).</param>
        public WatchlistPositionGetData(string id, WatchlistPositionGetDataPosition position)
        {
            // to ensure "id" is required (not null)
            if (id == null) {
                throw new ArgumentNullException("id is a required property for WatchlistPositionGetData and cannot be null");
            }
            this.Id = id;
            // to ensure "position" is required (not null)
            if (position == null) {
                throw new ArgumentNullException("position is a required property for WatchlistPositionGetData and cannot be null");
            }
            this.Position = position;
        }

        /// <summary>
        /// Identifier of the watchlist.
        /// </summary>
        /// <value>Identifier of the watchlist.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Position
        /// </summary>
        [DataMember(Name = "position", IsRequired = true, EmitDefaultValue = false)]
        public WatchlistPositionGetDataPosition Position { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class WatchlistPositionGetData {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
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
            return this.Equals(input as WatchlistPositionGetData);
        }

        /// <summary>
        /// Returns true if WatchlistPositionGetData instances are equal
        /// </summary>
        /// <param name="input">Instance of WatchlistPositionGetData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WatchlistPositionGetData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Position == input.Position ||
                    (this.Position != null &&
                    this.Position.Equals(input.Position))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Position != null)
                {
                    hashCode = (hashCode * 59) + this.Position.GetHashCode();
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

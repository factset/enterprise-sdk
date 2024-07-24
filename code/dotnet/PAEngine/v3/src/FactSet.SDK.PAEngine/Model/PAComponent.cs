/*
 * PA Engine API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.15.6
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
using OpenAPIDateConverter = FactSet.SDK.PAEngine.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PAEngine.Model
{
    /// <summary>
    /// PAComponent
    /// </summary>
    [DataContract(Name = "PAComponent")]
    public partial class PAComponent : IEquatable<PAComponent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PAComponent" /> class.
        /// </summary>
        /// <param name="id">Component identifier..</param>
        /// <param name="accounts">List of accounts saved in the PA document..</param>
        /// <param name="benchmarks">List of benchmarks saved in the PA document..</param>
        /// <param name="currencyisocode">currencyisocode.</param>
        /// <param name="dates">dates.</param>
        /// <param name="snapshot">Is the component type snapshot or subperiod..</param>
        /// <param name="path">The path to the document.</param>
        /// <param name="name">Component name..</param>
        /// <param name="category">Component category..</param>
        public PAComponent(string id = default(string), List<PAIdentifier> accounts = default(List<PAIdentifier>), List<PAIdentifier> benchmarks = default(List<PAIdentifier>), string currencyisocode = default(string), PADateParameters dates = default(PADateParameters), bool snapshot = default(bool), string path = default(string), string name = default(string), string category = default(string))
        {
            this.Id = id;
            this.Accounts = accounts;
            this.Benchmarks = benchmarks;
            this.Currencyisocode = currencyisocode;
            this.Dates = dates;
            this.Snapshot = snapshot;
            this.Path = path;
            this.Name = name;
            this.Category = category;
        }

        /// <summary>
        /// Component identifier.
        /// </summary>
        /// <value>Component identifier.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// List of accounts saved in the PA document.
        /// </summary>
        /// <value>List of accounts saved in the PA document.</value>
        [DataMember(Name = "accounts", EmitDefaultValue = true)]
        public List<PAIdentifier> Accounts { get; set; }

        /// <summary>
        /// List of benchmarks saved in the PA document.
        /// </summary>
        /// <value>List of benchmarks saved in the PA document.</value>
        [DataMember(Name = "benchmarks", EmitDefaultValue = true)]
        public List<PAIdentifier> Benchmarks { get; set; }

        /// <summary>
        /// Gets or Sets Currencyisocode
        /// </summary>
        [DataMember(Name = "currencyisocode", EmitDefaultValue = true)]
        public string Currencyisocode { get; set; }

        /// <summary>
        /// Gets or Sets Dates
        /// </summary>
        [DataMember(Name = "dates", EmitDefaultValue = false)]
        public PADateParameters Dates { get; set; }

        /// <summary>
        /// Is the component type snapshot or subperiod.
        /// </summary>
        /// <value>Is the component type snapshot or subperiod.</value>
        [DataMember(Name = "snapshot", EmitDefaultValue = true)]
        public bool Snapshot { get; set; }

        /// <summary>
        /// The path to the document
        /// </summary>
        /// <value>The path to the document</value>
        [DataMember(Name = "path", EmitDefaultValue = true)]
        public string Path { get; set; }

        /// <summary>
        /// Component name.
        /// </summary>
        /// <value>Component name.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Component category.
        /// </summary>
        /// <value>Component category.</value>
        [DataMember(Name = "category", EmitDefaultValue = true)]
        public string Category { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PAComponent {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Accounts: ").Append(Accounts).Append("\n");
            sb.Append("  Benchmarks: ").Append(Benchmarks).Append("\n");
            sb.Append("  Currencyisocode: ").Append(Currencyisocode).Append("\n");
            sb.Append("  Dates: ").Append(Dates).Append("\n");
            sb.Append("  Snapshot: ").Append(Snapshot).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
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
            return this.Equals(input as PAComponent);
        }

        /// <summary>
        /// Returns true if PAComponent instances are equal
        /// </summary>
        /// <param name="input">Instance of PAComponent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PAComponent input)
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
                    this.Accounts == input.Accounts ||
                    this.Accounts != null &&
                    input.Accounts != null &&
                    this.Accounts.SequenceEqual(input.Accounts)
                ) && 
                (
                    this.Benchmarks == input.Benchmarks ||
                    this.Benchmarks != null &&
                    input.Benchmarks != null &&
                    this.Benchmarks.SequenceEqual(input.Benchmarks)
                ) && 
                (
                    this.Currencyisocode == input.Currencyisocode ||
                    (this.Currencyisocode != null &&
                    this.Currencyisocode.Equals(input.Currencyisocode))
                ) && 
                (
                    this.Dates == input.Dates ||
                    (this.Dates != null &&
                    this.Dates.Equals(input.Dates))
                ) && 
                (
                    this.Snapshot == input.Snapshot ||
                    this.Snapshot.Equals(input.Snapshot)
                ) && 
                (
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
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
                if (this.Accounts != null)
                {
                    hashCode = (hashCode * 59) + this.Accounts.GetHashCode();
                }
                if (this.Benchmarks != null)
                {
                    hashCode = (hashCode * 59) + this.Benchmarks.GetHashCode();
                }
                if (this.Currencyisocode != null)
                {
                    hashCode = (hashCode * 59) + this.Currencyisocode.GetHashCode();
                }
                if (this.Dates != null)
                {
                    hashCode = (hashCode * 59) + this.Dates.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Snapshot.GetHashCode();
                if (this.Path != null)
                {
                    hashCode = (hashCode * 59) + this.Path.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Category != null)
                {
                    hashCode = (hashCode * 59) + this.Category.GetHashCode();
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

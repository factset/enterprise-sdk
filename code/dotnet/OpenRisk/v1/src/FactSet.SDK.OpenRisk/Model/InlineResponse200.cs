/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.21.0
 * Contact: ParametricRiskAnalyticsDevelopment@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.OpenRisk.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OpenRisk.Model
{
    /// <summary>
    /// InlineResponse200
    /// </summary>
    [DataContract(Name = "inline_response_200")]
    public partial class InlineResponse200 : IEquatable<InlineResponse200>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected InlineResponse200() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200" /> class.
        /// </summary>
        /// <param name="openapi">OpenAPI Specification version (required).</param>
        /// <param name="info">info (required).</param>
        /// <param name="servers">servers (required).</param>
        /// <param name="paths">paths (required).</param>
        /// <param name="components">components (required).</param>
        /// <param name="security">security (required).</param>
        public InlineResponse200(string openapi, InlineResponse200Info info, List<InlineResponse200Servers> servers, Object paths, InlineResponse200Components components, List<Object> security)
        {
            // to ensure "openapi" is required (not null)
            if (openapi == null) {
                throw new ArgumentNullException("openapi is a required property for InlineResponse200 and cannot be null");
            }
            this.Openapi = openapi;
            // to ensure "info" is required (not null)
            if (info == null) {
                throw new ArgumentNullException("info is a required property for InlineResponse200 and cannot be null");
            }
            this.Info = info;
            // to ensure "servers" is required (not null)
            if (servers == null) {
                throw new ArgumentNullException("servers is a required property for InlineResponse200 and cannot be null");
            }
            this.Servers = servers;
            // to ensure "paths" is required (not null)
            if (paths == null) {
                throw new ArgumentNullException("paths is a required property for InlineResponse200 and cannot be null");
            }
            this.Paths = paths;
            // to ensure "components" is required (not null)
            if (components == null) {
                throw new ArgumentNullException("components is a required property for InlineResponse200 and cannot be null");
            }
            this.Components = components;
            // to ensure "security" is required (not null)
            if (security == null) {
                throw new ArgumentNullException("security is a required property for InlineResponse200 and cannot be null");
            }
            this.Security = security;
        }

        /// <summary>
        /// OpenAPI Specification version
        /// </summary>
        /// <value>OpenAPI Specification version</value>
        [DataMember(Name = "openapi", IsRequired = true, EmitDefaultValue = false)]
        public string Openapi { get; set; }

        /// <summary>
        /// Gets or Sets Info
        /// </summary>
        [DataMember(Name = "info", IsRequired = true, EmitDefaultValue = false)]
        public InlineResponse200Info Info { get; set; }

        /// <summary>
        /// Gets or Sets Servers
        /// </summary>
        [DataMember(Name = "servers", IsRequired = true, EmitDefaultValue = false)]
        public List<InlineResponse200Servers> Servers { get; set; }

        /// <summary>
        /// Gets or Sets Paths
        /// </summary>
        [DataMember(Name = "paths", IsRequired = true, EmitDefaultValue = false)]
        public Object Paths { get; set; }

        /// <summary>
        /// Gets or Sets Components
        /// </summary>
        [DataMember(Name = "components", IsRequired = true, EmitDefaultValue = false)]
        public InlineResponse200Components Components { get; set; }

        /// <summary>
        /// Gets or Sets Security
        /// </summary>
        [DataMember(Name = "security", IsRequired = true, EmitDefaultValue = false)]
        public List<Object> Security { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse200 {\n");
            sb.Append("  Openapi: ").Append(Openapi).Append("\n");
            sb.Append("  Info: ").Append(Info).Append("\n");
            sb.Append("  Servers: ").Append(Servers).Append("\n");
            sb.Append("  Paths: ").Append(Paths).Append("\n");
            sb.Append("  Components: ").Append(Components).Append("\n");
            sb.Append("  Security: ").Append(Security).Append("\n");
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
            return this.Equals(input as InlineResponse200);
        }

        /// <summary>
        /// Returns true if InlineResponse200 instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200 input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Openapi == input.Openapi ||
                    (this.Openapi != null &&
                    this.Openapi.Equals(input.Openapi))
                ) && 
                (
                    this.Info == input.Info ||
                    (this.Info != null &&
                    this.Info.Equals(input.Info))
                ) && 
                (
                    this.Servers == input.Servers ||
                    this.Servers != null &&
                    input.Servers != null &&
                    this.Servers.SequenceEqual(input.Servers)
                ) && 
                (
                    this.Paths == input.Paths ||
                    (this.Paths != null &&
                    this.Paths.Equals(input.Paths))
                ) && 
                (
                    this.Components == input.Components ||
                    (this.Components != null &&
                    this.Components.Equals(input.Components))
                ) && 
                (
                    this.Security == input.Security ||
                    this.Security != null &&
                    input.Security != null &&
                    this.Security.SequenceEqual(input.Security)
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
                if (this.Openapi != null)
                {
                    hashCode = (hashCode * 59) + this.Openapi.GetHashCode();
                }
                if (this.Info != null)
                {
                    hashCode = (hashCode * 59) + this.Info.GetHashCode();
                }
                if (this.Servers != null)
                {
                    hashCode = (hashCode * 59) + this.Servers.GetHashCode();
                }
                if (this.Paths != null)
                {
                    hashCode = (hashCode * 59) + this.Paths.GetHashCode();
                }
                if (this.Components != null)
                {
                    hashCode = (hashCode * 59) + this.Components.GetHashCode();
                }
                if (this.Security != null)
                {
                    hashCode = (hashCode * 59) + this.Security.GetHashCode();
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
            // Openapi (string) minLength
            if (this.Openapi != null && this.Openapi.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Openapi, length must be greater than 1.", new [] { "Openapi" });
            }

            yield break;
        }
    }

}
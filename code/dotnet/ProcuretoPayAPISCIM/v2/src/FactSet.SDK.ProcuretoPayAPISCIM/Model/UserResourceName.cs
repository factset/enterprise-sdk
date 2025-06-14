/*
 * FactSet SCIM API
 *
 * FactSet's SCIM API implementation.
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
using OpenAPIDateConverter = FactSet.SDK.ProcuretoPayAPISCIM.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ProcuretoPayAPISCIM.Model
{
    /// <summary>
    /// The components of the user&#39;s real name. Providers MAY return just the full name as a single string in the formatted sub-attribute, or they MAY return just the individual component attributes using the other sub-attributes, or they MAY return both.  If both variants are returned, they SHOULD be describing the same name, with the formatted name indicating how the component attributes should be combined.
    /// </summary>
    [DataContract(Name = "UserResource_name")]
    public partial class UserResourceName : IEquatable<UserResourceName>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UserResourceName" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected UserResourceName() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="UserResourceName" /> class.
        /// </summary>
        /// <param name="familyName">The family name of the User, or last name in most Western languages (e.g., &#39;Jensen&#39; given the full name &#39;Ms. Barbara J Jensen, III&#39;). (required).</param>
        /// <param name="givenName">The given name of the User, or first name in most Western languages (e.g., &#39;Barbara&#39; given the full name &#39;Ms. Barbara J Jensen, III&#39;). (required).</param>
        public UserResourceName(string familyName, string givenName)
        {
            // to ensure "familyName" is required (not null)
            if (familyName == null) {
                throw new ArgumentNullException("familyName is a required property for UserResourceName and cannot be null");
            }
            this.FamilyName = familyName;
            // to ensure "givenName" is required (not null)
            if (givenName == null) {
                throw new ArgumentNullException("givenName is a required property for UserResourceName and cannot be null");
            }
            this.GivenName = givenName;
        }

        /// <summary>
        /// The family name of the User, or last name in most Western languages (e.g., &#39;Jensen&#39; given the full name &#39;Ms. Barbara J Jensen, III&#39;).
        /// </summary>
        /// <value>The family name of the User, or last name in most Western languages (e.g., &#39;Jensen&#39; given the full name &#39;Ms. Barbara J Jensen, III&#39;).</value>
        [DataMember(Name = "familyName", IsRequired = true, EmitDefaultValue = false)]
        public string FamilyName { get; set; }

        /// <summary>
        /// The given name of the User, or first name in most Western languages (e.g., &#39;Barbara&#39; given the full name &#39;Ms. Barbara J Jensen, III&#39;).
        /// </summary>
        /// <value>The given name of the User, or first name in most Western languages (e.g., &#39;Barbara&#39; given the full name &#39;Ms. Barbara J Jensen, III&#39;).</value>
        [DataMember(Name = "givenName", IsRequired = true, EmitDefaultValue = false)]
        public string GivenName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UserResourceName {\n");
            sb.Append("  FamilyName: ").Append(FamilyName).Append("\n");
            sb.Append("  GivenName: ").Append(GivenName).Append("\n");
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
            return this.Equals(input as UserResourceName);
        }

        /// <summary>
        /// Returns true if UserResourceName instances are equal
        /// </summary>
        /// <param name="input">Instance of UserResourceName to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UserResourceName input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FamilyName == input.FamilyName ||
                    (this.FamilyName != null &&
                    this.FamilyName.Equals(input.FamilyName))
                ) && 
                (
                    this.GivenName == input.GivenName ||
                    (this.GivenName != null &&
                    this.GivenName.Equals(input.GivenName))
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
                if (this.FamilyName != null)
                {
                    hashCode = (hashCode * 59) + this.FamilyName.GetHashCode();
                }
                if (this.GivenName != null)
                {
                    hashCode = (hashCode * 59) + this.GivenName.GetHashCode();
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

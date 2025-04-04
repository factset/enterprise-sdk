/*
 * BookBuilder
 *
 * The BookBuilder API is a powerful tool that combines detailed reports for companies of interest. Save time by using a single source of knowledge instead of relying on multiple APIs to create a presentation ready PDF, also known as a Public Information Book(PIB). </br></br> Consistently create books with the same content/reports for different companies by defining templates with the set of reports saved for re-use. Or, use templates that are created by FactSet for quick use. </br></br> With our powerful API endpoints, you can get the information on companies of interest quickly where and when you need it. </br></br> 
 *
 * The version of the OpenAPI document: 1.13.0
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
using OpenAPIDateConverter = FactSet.SDK.BookBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BookBuilder.Model
{
    /// <summary>
    /// BookInfo
    /// </summary>
    [DataContract(Name = "BookInfo")]
    public partial class BookInfo : IEquatable<BookInfo>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BookInfo" /> class.
        /// </summary>
        /// <param name="bookId">Book ID.</param>
        /// <param name="bookName">Book Name.</param>
        /// <param name="createdOn">Date on which the book was created.</param>
        public BookInfo(string bookId = default(string), string bookName = default(string), string createdOn = default(string))
        {
            this.BookId = bookId;
            this.BookName = bookName;
            this.CreatedOn = createdOn;
        }

        /// <summary>
        /// Book ID
        /// </summary>
        /// <value>Book ID</value>
        [DataMember(Name = "book_id", EmitDefaultValue = false)]
        public string BookId { get; set; }

        /// <summary>
        /// Book Name
        /// </summary>
        /// <value>Book Name</value>
        [DataMember(Name = "book_name", EmitDefaultValue = false)]
        public string BookName { get; set; }

        /// <summary>
        /// Date on which the book was created
        /// </summary>
        /// <value>Date on which the book was created</value>
        [DataMember(Name = "created_on", EmitDefaultValue = false)]
        public string CreatedOn { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BookInfo {\n");
            sb.Append("  BookId: ").Append(BookId).Append("\n");
            sb.Append("  BookName: ").Append(BookName).Append("\n");
            sb.Append("  CreatedOn: ").Append(CreatedOn).Append("\n");
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
            return this.Equals(input as BookInfo);
        }

        /// <summary>
        /// Returns true if BookInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of BookInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BookInfo input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.BookId == input.BookId ||
                    (this.BookId != null &&
                    this.BookId.Equals(input.BookId))
                ) && 
                (
                    this.BookName == input.BookName ||
                    (this.BookName != null &&
                    this.BookName.Equals(input.BookName))
                ) && 
                (
                    this.CreatedOn == input.CreatedOn ||
                    (this.CreatedOn != null &&
                    this.CreatedOn.Equals(input.CreatedOn))
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
                if (this.BookId != null)
                {
                    hashCode = (hashCode * 59) + this.BookId.GetHashCode();
                }
                if (this.BookName != null)
                {
                    hashCode = (hashCode * 59) + this.BookName.GetHashCode();
                }
                if (this.CreatedOn != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedOn.GetHashCode();
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

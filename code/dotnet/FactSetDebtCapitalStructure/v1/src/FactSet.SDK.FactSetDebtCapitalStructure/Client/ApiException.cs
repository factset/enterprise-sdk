/*
 * FactSet Debt Capital Structure API
 *
 * The FactSet Debt Capital Structure API offers insights into public and private company debt financing for 69,000+ entities globally. Analyze at the individual-instrument level through summary and detailed information of the debt structure with history available back through 2006. Instrument types covered include Revolving Credit, Term Loans, Notes, and Bonds.   **How to Programmatically Download API Specification file:**  Please use the below link to download the FactSet Debt Capital Structure API Specification file in .yaml. You must be authorized for this API to extract. This specification can then be used for Codegen to create your own SDKs. You can also access by selecting the \"Download Spec\" button to the right of the version below.  [https://api.factset.com/content/factset-dcs/v1/spec/swagger.yaml](https://api.factset.com/content/factset-dcs/v1/spec/swagger.yaml)  This API is rate-limited to 10 requests per second and 10 concurrent requests per user. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;

namespace FactSet.SDK.FactSetDebtCapitalStructure.Client
{
    /// <summary>
    /// API Exception
    /// </summary>
    public class ApiException : Exception
    {
        /// <summary>
        /// Gets or sets the error code (HTTP status code)
        /// </summary>
        /// <value>The error code (HTTP status code).</value>
        public int ErrorCode { get; set; }

        /// <summary>
        /// Gets or sets the error content (body json object)
        /// </summary>
        /// <value>The error content (Http response body).</value>
        public object ErrorContent { get; private set; }

        /// <summary>
        /// Gets or sets the HTTP headers
        /// </summary>
        /// <value>HTTP headers</value>
        public Multimap<string, string> Headers { get; private set; }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiException"/> class.
        /// </summary>
        public ApiException() { }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiException"/> class.
        /// </summary>
        /// <param name="errorCode">HTTP status code.</param>
        /// <param name="message">Error message.</param>
        public ApiException(int errorCode, string message) : base(message)
        {
            this.ErrorCode = errorCode;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiException"/> class.
        /// </summary>
        /// <param name="errorCode">HTTP status code.</param>
        /// <param name="message">Error message.</param>
        /// <param name="errorContent">Error content.</param>
        /// <param name="headers">HTTP Headers.</param>
        public ApiException(int errorCode, string message, object errorContent = null, Multimap<string, string> headers = null) : base(message)
        {
            this.ErrorCode = errorCode;
            this.ErrorContent = errorContent;
            this.Headers = headers;
        }
    }

}

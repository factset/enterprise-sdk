/*
 * Bonds API For Digital Portals
 *
 * Search for fixed income instruments, using a criteria-based screener. The API provides also fundamental data and key figures, basic interest rate information and derived coupon lists.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * important dates in and features of the life cycle of the fixed income instruments * filter by issuer, its country of registration and the issued volume * coupon data: occurrence and frequency of coupon payments, current interest rate range * yield and yield to maturity range, spread * Macaulay duration * sensitivity ranges: base point value, modified duration, elasticity, convexity * cash flow for all transactions over a certain time range: sum or average * country-specific attributes: for Germany: is eligible for trustees        The key figures are calculated using delayed prices with an additional delay of 10 minutes after an update of the debt instrument's price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.IO;
using System.Net;

namespace FactSet.SDK.BondsAPIforDigitalPortals.Client
{
    /// <summary>
    /// A container for generalized request inputs. This type allows consumers to extend the request functionality
    /// by abstracting away from the default (built-in) request framework (e.g. RestSharp).
    /// </summary>
    public class RequestOptions
    {
        /// <summary>
        /// Parameters to be bound to path parts of the Request's URL
        /// </summary>
        public Dictionary<string, string> PathParameters { get; set; }

        /// <summary>
        /// Query parameters to be applied to the request.
        /// Keys may have 1 or more values associated.
        /// </summary>
        public Multimap<string, string> QueryParameters { get; set; }

        /// <summary>
        /// Header parameters to be applied to to the request.
        /// Keys may have 1 or more values associated.
        /// </summary>
        public Multimap<string, string> HeaderParameters { get; set; }

        /// <summary>
        /// Form parameters to be sent along with the request.
        /// </summary>
        public Dictionary<string, string> FormParameters { get; set; }

        /// <summary>
        /// File parameters to be sent along with the request.
        /// </summary>
        public Dictionary<string, Stream> FileParameters { get; set; }

        /// <summary>
        /// Cookies to be sent along with the request.
        /// </summary>
        public List<Cookie> Cookies { get; set; }

        /// <summary>
        /// Response type dictionary for each status code.
        /// </summary>
        public Dictionary<HttpStatusCode, Type> ResponseTypeDictionary { get; set; }

        /// <summary>
        /// Any data associated with a request body.
        /// </summary>
        public Object Data { get; set; }

        /// <summary>
        /// Constructs a new instance of <see cref="RequestOptions"/>
        /// </summary>
        public RequestOptions()
        {
            PathParameters = new Dictionary<string, string>();
            QueryParameters = new Multimap<string, string>();
            HeaderParameters = new Multimap<string, string>();
            FormParameters = new Dictionary<string, string>();
            FileParameters = new Dictionary<string, Stream>();
            Cookies = new List<Cookie>();
        }
    }
}

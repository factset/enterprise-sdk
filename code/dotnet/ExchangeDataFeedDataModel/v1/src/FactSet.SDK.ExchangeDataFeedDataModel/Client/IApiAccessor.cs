/*
 * Exchange DataFeed Data Model API
 *
 * FactSet’s Exchange DataFeed products provide access to consolidated real-time and delayed global exchange data. Proprietary technology normalizes over 250 global venues, 18+ million instruments, and 150+ data fields. Asset types integrated include equities, futures, options, warrants, fixed income, mutual funds, ETFs, indices, commodities, and FX rates. Innovative technology ensures reliability and provides scalability that allows clients to make requests based on a symbol list or an exchange. Reduce development time by powering proprietary and third-party applications with exchange data from a unified data model. <p>The Exchange DataFeed Data Model API provides mappings for enumerations used in our Real-Time DataFeed products and should be used in conjunction with the DataFeed Data Model documentation available for each product. <p>The initial beta version of this API is limited to include mapping tables for the product codes only.
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;

namespace FactSet.SDK.ExchangeDataFeedDataModel.Client
{
    /// <summary>
    /// Represents configuration aspects required to interact with the API endpoints.
    /// </summary>
    public interface IApiAccessor
    {
        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        string GetBasePath();

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        ExceptionFactory ExceptionFactory { get; set; }
    }
}

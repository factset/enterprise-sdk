[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet Funds client library for .NET

[![API Version](https://img.shields.io/badge/api-v1.4.0-blue)](https://developer.factset.com/api-catalog/factset-funds-api)
[![Nuget](https://img.shields.io/badge/nuget-v2.0.0-orange)](https://www.nuget.org/packages/FactSet.SDK.FactSetFunds/2.0.0)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage 
  * Fund descriptions 
  * A seven-tier classification system
  * Leverage information
  * Fees and expenses 
  * Portfolio managers 
  
  FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage 
  * Net asset value
  * Fund flows 
  * Assets under management
  * Total return 
<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>


This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.4.0
- SDK version: 2.0.0
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.FactSetFunds -v 2.0.0
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.FactSetFunds -Version 2.0.0
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup [.NET Standard 2.0](https://docs.microsoft.com/en-us/dotnet/standard/net-standard?tabs=net-standard-2-0) compatible environment.
3. [Install dependencies](#installation).
4. Run the following:

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public static class GetFundsDistCurrentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new DistributionsApi(config);
            var ids = new List<string>(); // List<string> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
            var currency = "\"LOCAL\"";  // string | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  (optional)  (default to "LOCAL")

            try
            {
                // Get Most Recent Fund Distributions
                DistCurrentResponse result = apiInstance.GetFundsDistCurrent(ids, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling DistributionsApi.GetFundsDistCurrent: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Using a Proxy

To use the API client with a HTTP proxy, setup a `System.Net.WebProxy`

```csharp
Configuration c = new Configuration();
System.Net.WebProxy webProxy = new System.Net.WebProxy("http://myProxyUrl:80/");
webProxy.Credentials = System.Net.CredentialCache.DefaultCredentials;
c.Proxy = webProxy;
```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/content*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DistributionsApi* | [**GetFundsDistCurrent**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/DistributionsApi.md#getfundsdistcurrent) | **GET** /factset-funds/v1/distributions/current | Get Most Recent Fund Distributions
*DistributionsApi* | [**GetFundsDistCurrentForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/DistributionsApi.md#getfundsdistcurrentforlist) | **POST** /factset-funds/v1/distributions/current | Get Most Recent Fund Distributions
*DistributionsApi* | [**GetFundsDistHistorical**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/DistributionsApi.md#getfundsdisthistorical) | **GET** /factset-funds/v1/distributions/historical | Get Historical Fund Distributions
*DistributionsApi* | [**GetFundsDistHistoricalForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/DistributionsApi.md#getfundsdisthistoricalforlist) | **POST** /factset-funds/v1/distributions/historical | Get Historical Fund Distributions
*FundFlowsAUMApi* | [**GetFundsAum**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/FundFlowsAUMApi.md#getfundsaum) | **GET** /factset-funds/v1/aum | Get Fund AUM for a requested date range and list of ids
*FundFlowsAUMApi* | [**GetFundsAumForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/FundFlowsAUMApi.md#getfundsaumforlist) | **POST** /factset-funds/v1/aum | Get Fund AUM for a requested date range and large list of ids
*FundFlowsAUMApi* | [**GetFundsFlows**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/FundFlowsAUMApi.md#getfundsflows) | **GET** /factset-funds/v1/flows | Get Fund Flows for a requested date range and list of ids
*FundFlowsAUMApi* | [**GetFundsFlowsForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/FundFlowsAUMApi.md#getfundsflowsforlist) | **POST** /factset-funds/v1/flows | Get Fund Flows for a requested date range and large list of ids
*GroupHoldingsApi* | [**GetGroupHoldings**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/GroupHoldingsApi.md#getgroupholdings) | **GET** /factset-funds/v1/holdings/group | Get group holdings for a specific date and group.
*GroupHoldingsApi* | [**GetGroupHoldingsForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/GroupHoldingsApi.md#getgroupholdingsforlist) | **POST** /factset-funds/v1/holdings/group | Get group holdings for a specific date and group.
*HelperApi* | [**GetStatuses**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/HelperApi.md#getstatuses) | **GET** /factset-funds/v1/status | Get Fund's current status and database availability
*HelperApi* | [**GetStatusesForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/HelperApi.md#getstatusesforlist) | **POST** /factset-funds/v1/status | Get Fund's current status and database availability for large list of ids.
*MarketAggregatesApi* | [**GetMarketAggregates**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/MarketAggregatesApi.md#getmarketaggregates) | **GET** /factset-funds/v1/aggregates/market | Get market aggregates for a requested time series.
*MarketAggregatesApi* | [**GetMarketAggregatesForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/MarketAggregatesApi.md#getmarketaggregatesforlist) | **POST** /factset-funds/v1/aggregates/market | Get market aggregates for a requested time series.
*PricesReturnsApi* | [**GetFundsPrices**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/PricesReturnsApi.md#getfundsprices) | **GET** /factset-funds/v1/prices | Get Fund Prices (NAV) for a requested time-series
*PricesReturnsApi* | [**GetFundsPricesForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/PricesReturnsApi.md#getfundspricesforlist) | **POST** /factset-funds/v1/prices | Get Fund Prices (NAV) for a requested date range and large list of ids.
*PricesReturnsApi* | [**GetFundsReturns**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/PricesReturnsApi.md#getfundsreturns) | **GET** /factset-funds/v1/returns | Get Fund Returns for a requested time-series
*PricesReturnsApi* | [**GetFundsReturnsForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/PricesReturnsApi.md#getfundsreturnsforlist) | **POST** /factset-funds/v1/returns | Get Fund Returns for a requested time-series and large list of ids
*PricesReturnsApi* | [**GetFundsReturnsRange**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/PricesReturnsApi.md#getfundsreturnsrange) | **GET** /factset-funds/v1/returns-range | Get Fund Returns for a user-defined date range
*PricesReturnsApi* | [**GetFundsReturnsRangeForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/PricesReturnsApi.md#getfundsreturnsrangeforlist) | **POST** /factset-funds/v1/returns-range | Get Fund Returns over pre-defined time horizons as of a specific date for large list of ids.
*PricesReturnsApi* | [**GetFundsReturnsSnapshot**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/PricesReturnsApi.md#getfundsreturnssnapshot) | **GET** /factset-funds/v1/returns-snapshot | Get Fund Returns over pre-defined time horizons as of a specific date.
*PricesReturnsApi* | [**GetFundsReturnsSnapshotForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/PricesReturnsApi.md#getfundsreturnssnapshotforlist) | **POST** /factset-funds/v1/returns-snapshot | Get Fund Returns over pre-defined time horizons as of a specific date.
*ReferenceApi* | [**GetFundsBenchmarkDetails**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReferenceApi.md#getfundsbenchmarkdetails) | **GET** /factset-funds/v1/benchmark-details | Get the Fund's Primary and Segment Benchmark Details
*ReferenceApi* | [**GetFundsBenchmarkDetailsForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReferenceApi.md#getfundsbenchmarkdetailsforlist) | **POST** /factset-funds/v1/benchmark-details | Get the Fund's Primary and Segment Benchmark details for large list of ids.
*ReferenceApi* | [**GetFundsClassifications**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReferenceApi.md#getfundsclassifications) | **GET** /factset-funds/v1/classifications | Get basic Fund Classifications
*ReferenceApi* | [**GetFundsClassificationsForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReferenceApi.md#getfundsclassificationsforlist) | **POST** /factset-funds/v1/classifications | Get basic Fund Classifications for a large list of ids.
*ReferenceApi* | [**GetFundsCostsFees**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReferenceApi.md#getfundscostsfees) | **GET** /factset-funds/v1/costs-fees | Get the Fund's Costs, Investment minimums and Risk, and Fees.
*ReferenceApi* | [**GetFundsCostsFeesForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReferenceApi.md#getfundscostsfeesforlist) | **POST** /factset-funds/v1/costs-fees | Get the Fund's Costs, Investment minimums and Risk, and Fees for large list of ids.
*ReferenceApi* | [**GetFundsManagers**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReferenceApi.md#getfundsmanagers) | **GET** /factset-funds/v1/managers | Get a list of Fund Managers and related details for a list of ids.
*ReferenceApi* | [**GetFundsManagersForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReferenceApi.md#getfundsmanagersforlist) | **POST** /factset-funds/v1/managers | Get a list of Fund Managers and related details for a large list of ids.
*ReferenceApi* | [**GetFundsSummary**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReferenceApi.md#getfundssummary) | **GET** /factset-funds/v1/summary | Get basic reference summary data for a Fund.
*ReferenceApi* | [**GetFundsSummaryForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReferenceApi.md#getfundssummaryforlist) | **POST** /factset-funds/v1/summary | Get basic reference data for a large list of Fund ids.
*ReferenceApi* | [**GetRelatedFunds**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReferenceApi.md#getrelatedfunds) | **GET** /factset-funds/v1/related-funds | Get a list of Related Funds for a list of Fund ids.
*ReferenceApi* | [**GetRelatedFundsForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReferenceApi.md#getrelatedfundsforlist) | **POST** /factset-funds/v1/related-funds | Get a list of Related Funds for a large list of Fund ids.


## Documentation for Models

 - [Model.Aum](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/Aum.md)
 - [Model.AumRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/AumRequest.md)
 - [Model.AumResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/AumResponse.md)
 - [Model.BenchmarkDetails](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/BenchmarkDetails.md)
 - [Model.BenchmarkDetailsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/BenchmarkDetailsRequest.md)
 - [Model.BenchmarkDetailsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/BenchmarkDetailsResponse.md)
 - [Model.Classifications](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/Classifications.md)
 - [Model.ClassificationsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ClassificationsRequest.md)
 - [Model.ClassificationsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ClassificationsResponse.md)
 - [Model.CostsFees](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/CostsFees.md)
 - [Model.CostsFeesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/CostsFeesRequest.md)
 - [Model.CostsFeesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/CostsFeesResponse.md)
 - [Model.DataType](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/DataType.md)
 - [Model.DistCurrent](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/DistCurrent.md)
 - [Model.DistCurrentRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/DistCurrentRequest.md)
 - [Model.DistCurrentResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/DistCurrentResponse.md)
 - [Model.DistHistorical](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/DistHistorical.md)
 - [Model.DistHistoricalRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/DistHistoricalRequest.md)
 - [Model.DistHistoricalResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/DistHistoricalResponse.md)
 - [Model.DistributionOrYieldDist](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/DistributionOrYieldDist.md)
 - [Model.DividendAdjust](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/DividendAdjust.md)
 - [Model.ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ErrorResponse.md)
 - [Model.ErrorResponseSubErrors](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ErrorResponseSubErrors.md)
 - [Model.Flows](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/Flows.md)
 - [Model.FlowsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/FlowsRequest.md)
 - [Model.FlowsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/FlowsResponse.md)
 - [Model.Frequency](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/Frequency.md)
 - [Model.FrequencyAum](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/FrequencyAum.md)
 - [Model.FundsPricesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/FundsPricesRequest.md)
 - [Model.FundsPricesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/FundsPricesResponse.md)
 - [Model.FundsReturnsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/FundsReturnsRequest.md)
 - [Model.FundsReturnsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/FundsReturnsResponse.md)
 - [Model.FundsReturnsSnapshotRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/FundsReturnsSnapshotRequest.md)
 - [Model.FundsReturnsSnapshotResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/FundsReturnsSnapshotResponse.md)
 - [Model.Group](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/Group.md)
 - [Model.GroupHolding](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/GroupHolding.md)
 - [Model.GroupHoldingsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/GroupHoldingsRequest.md)
 - [Model.GroupHoldingsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/GroupHoldingsResponse.md)
 - [Model.Lang](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/Lang.md)
 - [Model.Managers](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/Managers.md)
 - [Model.ManagersRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ManagersRequest.md)
 - [Model.ManagersResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ManagersResponse.md)
 - [Model.MarketAggregate](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/MarketAggregate.md)
 - [Model.MarketAggregatesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/MarketAggregatesRequest.md)
 - [Model.MarketAggregatesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/MarketAggregatesResponse.md)
 - [Model.Prices](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/Prices.md)
 - [Model.RelatedFunds](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/RelatedFunds.md)
 - [Model.RelatedFundsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/RelatedFundsRequest.md)
 - [Model.RelatedFundsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/RelatedFundsResponse.md)
 - [Model.Returns](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/Returns.md)
 - [Model.ReturnsRange](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReturnsRange.md)
 - [Model.ReturnsRangeRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReturnsRangeRequest.md)
 - [Model.ReturnsRangeResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReturnsRangeResponse.md)
 - [Model.ReturnsSnapshot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/ReturnsSnapshot.md)
 - [Model.SplitAdjust](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/SplitAdjust.md)
 - [Model.Statuses](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/Statuses.md)
 - [Model.StatusesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/StatusesRequest.md)
 - [Model.StatusesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/StatusesResponse.md)
 - [Model.Summaries](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/Summaries.md)
 - [Model.SummariesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/SummariesRequest.md)
 - [Model.SummariesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFunds/v1/docs/SummariesResponse.md)


## Documentation for Authorization


### FactSetApiKey

- **Type**: HTTP basic authentication


### FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Contributing

Please refer to the [contributing guide](../../../../CONTRIBUTING.md).

## Copyright

Copyright 2025 FactSet Research Systems Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

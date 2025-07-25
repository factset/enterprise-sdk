[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Best Execution Analytics for Smarter Trading (BEAST) client library for .NET

[![API Version](https://img.shields.io/badge/api-v2.0.0-blue)](https://developer.factset.com/api-catalog/)
[![Nuget](https://img.shields.io/badge/nuget-v0.2.0-orange)](https://www.nuget.org/packages/FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST/0.2.0)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.

This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.0.0
- SDK version: 0.2.0
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST -v 0.2.0
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST -Version 0.2.0
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
using FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Api;
using FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Client;
using FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Model;

namespace Example
{
    public static class GetCostImpactExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.BestExecutionAnalyticsforSmarterTradingBEAST.Client.Configuration();

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

            var apiInstance = new MarketImpactApi(config);
            var securityId = "FDS-US";  // string | ISIN for European securities, otherwise TICKER
            var region = "US";  // string | The two character ISO country code of the trading region. EMEA is used for the European trading region
            var currency = "USD";  // string | The ISO 4217 currency code
            var orderVolume = 100000F;  // float | Order Volume
            var strategy = "vwap";  // string | Specify the strategy, choices are: Optimal, VWAP, TWAP, Custom (optional) 
            var date = "2024-08-29";  // string | Date in the format YYYY-MM-DD (optional) 
            var isin = "isin_example";  // string | International securities identification number (optional) 
            var startTime = "10:00:00";  // string | Start Time in the format HH:MM:SS (optional) 
            var endTime = "15:00:00";  // string | End Time in the format HH:MM:SS (optional) 
            var frontLoadHalfLife = 1000F;  // float? | Front Load Half Life (optional) 
            var rearLoadHalfLife = 0F;  // float? | Rear Load Half Life (optional) 
            var rearRatio = 1F;  // float? | Rear Ratio (optional) 
            var riskAversion = 0.3F;  // float? | Risk Aversion (optional) 
            var applyMomentum = false;  // bool? | Flag to apply stock momentum. Specify true to include momentum (optional) 
            var side = "side_example";  // string | Indicate whether a buyer or seller. Only applies when applyMomentum is true. Example: Buy or Sell. (optional) 

            try
            {
                // Get Cost Impact
                CostImpactResponseRoot result = apiInstance.GetCostImpact(securityId, region, currency, orderVolume, strategy, date, isin, startTime, endTime, frontLoadHalfLife, rearLoadHalfLife, rearRatio, riskAversion, applyMomentum, side);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling MarketImpactApi.GetCostImpact: " + e.Message );
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

All URIs are relative to *https://api.factset.com/analytics/beast/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MarketImpactApi* | [**GetCostImpact**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/MarketImpactApi.md#getcostimpact) | **GET** /tca/market-impact/cost-impact | Get Cost Impact
*OrderDetailsApi* | [**GetOrderFillCount**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#getorderfillcount) | **GET** /tca/order/fill-count | Get Order Fill Count
*OrderDetailsApi* | [**GetOrderIndexETF**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#getorderindexetf) | **GET** /tca/order/index-etf | Get Index ETF data
*OrderDetailsApi* | [**GetOrderInfo**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#getorderinfo) | **GET** /tca/order/order-info | Get Order Information
*OrderDetailsApi* | [**GetOrderIntraStats**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#getorderintrastats) | **GET** /tca/order/intra-order-stats | Get Intra Order Stats
*OrderDetailsApi* | [**GetOrderInvestmentTiming**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#getorderinvestmenttiming) | **GET** /tca/order/investment-timing | Get Order Investment Timings
*OrderDetailsApi* | [**GetOrderPriceTimeFills**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#getorderpricetimefills) | **GET** /tca/order/price-time-fills | Get Price Time Fills
*OrderDetailsApi* | [**GetOrderPriceTimeQuotes**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#getorderpricetimequotes) | **GET** /tca/order/price-time-quotes | Get Price Time Quotes
*OrderDetailsApi* | [**GetOrderPriceTimeTrades**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#getorderpricetimetrades) | **GET** /tca/order/price-time-trades | Get Price Time Trades
*OrderDetailsApi* | [**GetOrderVolumePrice**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#getordervolumeprice) | **GET** /tca/order/volume-price | Get Order Volume Prices
*OrderDetailsApi* | [**GetOrderVolumeTime**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#getordervolumetime) | **GET** /tca/order/volume-time | Get Order Volume Times
*OrderDetailsApi* | [**GetOrderVolumeVenue**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderDetailsApi.md#getordervolumevenue) | **GET** /tca/order/volume-venue | Get Order Volume Venues
*OrderSearchApi* | [**GetFieldValues**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderSearchApi.md#getfieldvalues) | **GET** /tca/search/field-values | Get Order field values
*OrderSearchApi* | [**GetOrders**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderSearchApi.md#getorders) | **GET** /tca/search/orders | Get Orders by field values
*OutliersApi* | [**GetOutlierMetricsByPercentile**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutliersApi.md#getoutliermetricsbypercentile) | **GET** /tca/outlier/metrics-by-percentile | Get Outlier Metrics by percentile
*OutliersApi* | [**GetOutlierMetricsStandard**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutliersApi.md#getoutliermetricsstandard) | **GET** /tca/outlier/metrics-standard | Get Outlier Metrics by standard deviation
*QuoteAnalyticsApi* | [**GetQuoteInsideSize**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/QuoteAnalyticsApi.md#getquoteinsidesize) | **GET** /la/quote/inside-size | Get Quote Analytics
*ReportsApi* | [**GetParentAggregateAnalysis**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ReportsApi.md#getparentaggregateanalysis) | **GET** /tca/report/parent-aggregate-analysis | Get Parent Aggregate Analysis
*TradeAnalyticsApi* | [**GetTradeAnalytics**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/TradeAnalyticsApi.md#gettradeanalytics) | **GET** /la/trade/trade-analytics | Get Trade Analytics
*TradeAnalyticsApi* | [**GetVolumeAnalytics**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/TradeAnalyticsApi.md#getvolumeanalytics) | **GET** /la/trade/volume-analytics | Get Volume Analytics
*ZScoreApi* | [**GetZScoreQuotes**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ZScoreApi.md#getzscorequotes) | **GET** /la/zscore/quotes | Get Quote Z-Scores
*ZScoreApi* | [**GetZScoreTrades**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ZScoreApi.md#getzscoretrades) | **GET** /la/zscore/trades | Get Trade Z-Scores


## Documentation for Models

 - [Model.CostImpact](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/CostImpact.md)
 - [Model.CostImpactResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/CostImpactResponseRoot.md)
 - [Model.Error](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/Error.md)
 - [Model.ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ErrorResponse.md)
 - [Model.FieldValuesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/FieldValuesResponse.md)
 - [Model.FieldValuesResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/FieldValuesResponseRoot.md)
 - [Model.IndexETF](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/IndexETF.md)
 - [Model.IndexETFResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/IndexETFResponse.md)
 - [Model.IndexETFResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/IndexETFResponseRoot.md)
 - [Model.IntraOrderStat](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/IntraOrderStat.md)
 - [Model.IntraOrderStatResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/IntraOrderStatResponse.md)
 - [Model.IntraOrderStatResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/IntraOrderStatResponseRoot.md)
 - [Model.InvestmentTiming](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/InvestmentTiming.md)
 - [Model.InvestmentTimingResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/InvestmentTimingResponse.md)
 - [Model.InvestmentTimingResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/InvestmentTimingResponseRoot.md)
 - [Model.MultiDayBenchmarks](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/MultiDayBenchmarks.md)
 - [Model.Order](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/Order.md)
 - [Model.OrderFillCountResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderFillCountResponse.md)
 - [Model.OrderFillCountResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderFillCountResponseRoot.md)
 - [Model.OrderInfoResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderInfoResponse.md)
 - [Model.OrderInfoResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrderInfoResponseRoot.md)
 - [Model.OrdersResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrdersResponse.md)
 - [Model.OrdersResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OrdersResponseRoot.md)
 - [Model.Outlier](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/Outlier.md)
 - [Model.OutlierData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutlierData.md)
 - [Model.OutlierDataResult](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutlierDataResult.md)
 - [Model.OutlierMetrics](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutlierMetrics.md)
 - [Model.OutlierResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutlierResponse.md)
 - [Model.OutlierResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutlierResponseRoot.md)
 - [Model.OutputStrategyBinData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/OutputStrategyBinData.md)
 - [Model.PriceTimeFill](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeFill.md)
 - [Model.PriceTimeFillResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeFillResponse.md)
 - [Model.PriceTimeFillResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeFillResponseRoot.md)
 - [Model.PriceTimeQuote](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeQuote.md)
 - [Model.PriceTimeQuoteResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeQuoteResponse.md)
 - [Model.PriceTimeQuoteResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeQuoteResponseRoot.md)
 - [Model.PriceTimeTrade](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeTrade.md)
 - [Model.PriceTimeTradeResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeTradeResponse.md)
 - [Model.PriceTimeTradeResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/PriceTimeTradeResponseRoot.md)
 - [Model.QuoteInsideSize](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/QuoteInsideSize.md)
 - [Model.QuoteInsideSizeResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/QuoteInsideSizeResponse.md)
 - [Model.QuoteInsideSizeResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/QuoteInsideSizeResponseRoot.md)
 - [Model.ReportRecord](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ReportRecord.md)
 - [Model.ReportResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ReportResponse.md)
 - [Model.ReportResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ReportResponseRoot.md)
 - [Model.TradeAnalytic](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/TradeAnalytic.md)
 - [Model.TradeAnalyticsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/TradeAnalyticsResponse.md)
 - [Model.TradeAnalyticsResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/TradeAnalyticsResponseRoot.md)
 - [Model.VolumeAnalytic](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeAnalytic.md)
 - [Model.VolumeAnalyticsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeAnalyticsResponse.md)
 - [Model.VolumeAnalyticsResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeAnalyticsResponseRoot.md)
 - [Model.VolumePrice](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumePrice.md)
 - [Model.VolumePriceBin](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumePriceBin.md)
 - [Model.VolumePriceMetrics](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumePriceMetrics.md)
 - [Model.VolumePriceResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumePriceResponse.md)
 - [Model.VolumePriceResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumePriceResponseRoot.md)
 - [Model.VolumeTime](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeTime.md)
 - [Model.VolumeTimeResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeTimeResponse.md)
 - [Model.VolumeTimeResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeTimeResponseRoot.md)
 - [Model.VolumeVenue](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeVenue.md)
 - [Model.VolumeVenueResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeVenueResponse.md)
 - [Model.VolumeVenueResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/VolumeVenueResponseRoot.md)
 - [Model.ZScore](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ZScore.md)
 - [Model.ZScoreResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ZScoreResponse.md)
 - [Model.ZScoreResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/BestExecutionAnalyticsforSmarterTradingBEAST/v2/docs/ZScoreResponseRoot.md)


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

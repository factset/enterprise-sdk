[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Symbology client library for .NET

[![Nuget](https://img.shields.io/nuget/v/FactSet.SDK.Symbology)](https://www.nuget.org/packages/FactSet.SDK.Symbology)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology
types. various market symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, 
SEDOL, Tickers, and Bloomberg FIGIs. 

Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly 
harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as a point in time or for the entire
history of the requested id allowing Data Management workflows to normalize ids over time. Additionally, the Symbology API provides 
translation of market ids into Bloomberg FIGI.


This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.0.0
- Package version: 0.8.10
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.Symbology -v 0.8.10
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.Symbology -Version 0.8.10
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup [.NET Standard 2.0](https://docs.microsoft.com/en-us/dotnet/standard/net-standard?tabs=net-standard-2-0) compatible environment.
3. [Install dependencies](#installation).
4. Run the following:

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Symbology.Api;
using FactSet.SDK.Symbology.Client;
using FactSet.SDK.Symbology.Model;

namespace Example
{
    public static class BatchTranslateBloombergExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Symbology.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new BloombergFIGIApi(config);
            var bloombergTranslationRequest = new BloombergTranslationRequest(); // BloombergTranslationRequest | Request Body for Bloomberg FIGIs.

            try
            {
                // Translate market security symbols into Bloomberg Identifiers.
                BloombergTranslationResponse result = apiInstance.BatchTranslateBloomberg(bloombergTranslationRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling BloombergFIGIApi.BatchTranslateBloomberg: " + e.Message );
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
*BloombergFIGIApi* | [**BatchTranslateBloomberg**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/BloombergFIGIApi.md#batchtranslatebloomberg) | **POST** /symbology/v1/bloomberg | Translate market security symbols into Bloomberg Identifiers.
*BloombergFIGIApi* | [**TranslateBloomberg**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/BloombergFIGIApi.md#translatebloomberg) | **GET** /symbology/v1/bloomberg | Translate FactSet symbols into Bloomberg Identifiers.
*CUSIPApi* | [**BatchCusipHistory**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/CUSIPApi.md#batchcusiphistory) | **POST** /symbology/v1/cusip-history | Retrieve the full history of CUSIP changes for the requested ID(s).
*CUSIPApi* | [**BatchTranslateCusips**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/CUSIPApi.md#batchtranslatecusips) | **POST** /symbology/v1/cusip | Translate market security symbols into CUSIP.
*CUSIPApi* | [**CusipHistory**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/CUSIPApi.md#cusiphistory) | **GET** /symbology/v1/cusip-history | Retrieve the full history of CUSIP changes for the requested ID(s).
*CUSIPApi* | [**TranslateCusip**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/CUSIPApi.md#translatecusip) | **GET** /symbology/v1/cusip | Translate market security symbols into CUSIP.
*FactSetApi* | [**BatchTranslateFactset**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/FactSetApi.md#batchtranslatefactset) | **POST** /symbology/v1/factset | Translate market security symbols into FactSet Permanent Identifiers.
*FactSetApi* | [**TranslateFactset**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/FactSetApi.md#translatefactset) | **GET** /symbology/v1/factset | Translate market security symbols into FactSet Permanent Identifiers.
*ISINApi* | [**BatchIsinHistory**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/ISINApi.md#batchisinhistory) | **POST** /symbology/v1/isin-history | Retrieve the full history or as of a specific date of ISIN changes for a requested ID.
*ISINApi* | [**BatchTranslateIsin**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/ISINApi.md#batchtranslateisin) | **POST** /symbology/v1/isin | Translate market security symbols into ISIN.
*ISINApi* | [**IsinHistory**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/ISINApi.md#isinhistory) | **GET** /symbology/v1/isin-history | Retrieve the full history or as of a specific date of ISIN changes for the requested ID(s).
*ISINApi* | [**TranslateIsin**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/ISINApi.md#translateisin) | **GET** /symbology/v1/isin | Translate market security symbols into ISIN.
*SEDOLApi* | [**BatchSedolHistory**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/SEDOLApi.md#batchsedolhistory) | **POST** /symbology/v1/sedol-history | Retrieve the full history SEDOL changes for a requested ID.
*SEDOLApi* | [**BatchTranslateSedol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/SEDOLApi.md#batchtranslatesedol) | **POST** /symbology/v1/sedol | Translate market security symbols into SEDOL.
*SEDOLApi* | [**SedolHistory**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/SEDOLApi.md#sedolhistory) | **GET** /symbology/v1/sedol-history | Retrieve the full history of SEDOL changes for the requested ID(s).
*SEDOLApi* | [**TranslateSedol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/SEDOLApi.md#translatesedol) | **GET** /symbology/v1/sedol | Translate market security symbols into SEDOL.
*TickerApi* | [**BatchTickerHistory**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/TickerApi.md#batchtickerhistory) | **POST** /symbology/v1/ticker-history | Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.
*TickerApi* | [**BatchTranslateTicker**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/TickerApi.md#batchtranslateticker) | **POST** /symbology/v1/ticker | Returns the Ticker-Exchange or Ticker-Region for a given security.
*TickerApi* | [**TickerHistory**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/TickerApi.md#tickerhistory) | **GET** /symbology/v1/ticker-history | Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.
*TickerApi* | [**TranslateTicker**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/TickerApi.md#translateticker) | **GET** /symbology/v1/ticker | Returns the Ticker-Exchange or Ticker-Region for a given security.


## Documentation for Models

 - [Model.BloombergTranslation](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/BloombergTranslation.md)
 - [Model.BloombergTranslationRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/BloombergTranslationRequest.md)
 - [Model.BloombergTranslationResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/BloombergTranslationResponse.md)
 - [Model.CusipHistoryTranslation](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/CusipHistoryTranslation.md)
 - [Model.CusipHistoryTranslationRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/CusipHistoryTranslationRequest.md)
 - [Model.CusipHistoryTranslationResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/CusipHistoryTranslationResponse.md)
 - [Model.CusipTranslation](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/CusipTranslation.md)
 - [Model.CusipTranslationRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/CusipTranslationRequest.md)
 - [Model.CusipTranslationResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/CusipTranslationResponse.md)
 - [Model.ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/ErrorResponse.md)
 - [Model.ErrorResponseSubErrors](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/ErrorResponseSubErrors.md)
 - [Model.FactsetTranslation](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/FactsetTranslation.md)
 - [Model.FactsetTranslationRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/FactsetTranslationRequest.md)
 - [Model.FactsetTranslationResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/FactsetTranslationResponse.md)
 - [Model.IsinHistoryTranslation](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/IsinHistoryTranslation.md)
 - [Model.IsinHistoryTranslationRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/IsinHistoryTranslationRequest.md)
 - [Model.IsinHistoryTranslationResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/IsinHistoryTranslationResponse.md)
 - [Model.IsinTranslation](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/IsinTranslation.md)
 - [Model.IsinTranslationRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/IsinTranslationRequest.md)
 - [Model.IsinTranslationResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/IsinTranslationResponse.md)
 - [Model.SedolHistoryTranslation](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/SedolHistoryTranslation.md)
 - [Model.SedolHistoryTranslationRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/SedolHistoryTranslationRequest.md)
 - [Model.SedolHistoryTranslationResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/SedolHistoryTranslationResponse.md)
 - [Model.SedolTranslation](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/SedolTranslation.md)
 - [Model.SedolTranslationRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/SedolTranslationRequest.md)
 - [Model.SedolTranslationResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/SedolTranslationResponse.md)
 - [Model.TickerHistoryTranslation](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/TickerHistoryTranslation.md)
 - [Model.TickerHistoryTranslationRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/TickerHistoryTranslationRequest.md)
 - [Model.TickerHistoryTranslationResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/TickerHistoryTranslationResponse.md)
 - [Model.TickerTranslation](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/TickerTranslation.md)
 - [Model.TickerTranslationRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/TickerTranslationRequest.md)
 - [Model.TickerTranslationResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Symbology/v1/docs/TickerTranslationResponse.md)


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

Copyright 2022 FactSet Research Systems Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

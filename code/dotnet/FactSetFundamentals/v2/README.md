[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet Fundamentals client library for .NET

[![API Version](https://img.shields.io/badge/api-v2.4.1-blue)](https://developer.factset.com/api-catalog/factset-fundamentals-api)
[![Nuget](https://img.shields.io/badge/nuget-v3.0.0-orange)](https://www.nuget.org/packages/FactSet.SDK.FactSetFundamentals/3.0.0)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>


This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.4.1
- SDK version: 3.0.0
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.FactSetFundamentals -v 3.0.0
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.FactSetFundamentals -Version 3.0.0
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
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFundamentals.Api;
using FactSet.SDK.FactSetFundamentals.Client;
using FactSet.SDK.FactSetFundamentals.Model;

namespace Example
{
    public static class GetBatchDataExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFundamentals.Client.Configuration();

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

            var apiInstance = new BatchProcessingApi(config);
            var id = "id_example";  // Guid | Batch Request identifier.

            try
            {
                // Returns the response for a Batch Request
                BatchProcessingApi.GetBatchDataResponseWrapper result = apiInstance.GetBatchData(id);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling BatchProcessingApi.GetBatchData: " + e.Message );
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

All URIs are relative to *https://api.factset.com/content/factset-fundamentals/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BatchProcessingApi* | [**GetBatchData**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/BatchProcessingApi.md#getbatchdata) | **GET** /batch-result | Returns the response for a Batch Request
*BatchProcessingApi* | [**GetBatchStatus**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/BatchProcessingApi.md#getbatchstatus) | **GET** /batch-status | Returns the status for a Batch Request
*CompanyReportsApi* | [**GetFdsProfiles**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/CompanyReportsApi.md#getfdsprofiles) | **GET** /company-reports/profile | Returns company profile information for a specified list of identifiers.
*CompanyReportsApi* | [**GetFinancials**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/CompanyReportsApi.md#getfinancials) | **GET** /company-reports/financial-statement | Returns company financial data.
*CompanyReportsApi* | [**GetFundamentals**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/CompanyReportsApi.md#getfundamentals) | **GET** /company-reports/fundamentals | Returns company fundamentals for a given list of identifiers.
*FactSetFundamentalsApi* | [**GetFdsFundamentalsForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/FactSetFundamentalsApi.md#getfdsfundamentalsforlist) | **POST** /fundamentals | Returns Company Fundamental Data.
*MetricsApi* | [**GetFdsFundamentalsMetrics**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/MetricsApi.md#getfdsfundamentalsmetrics) | **GET** /metrics | Returns available FactSet Fundamental metrics and ratios.
*SegmentsApi* | [**GetFdsSegmentsForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/SegmentsApi.md#getfdssegmentsforlist) | **POST** /segments | Returns Company Segment Data.


## Documentation for Models

 - [Model.Address](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/Address.md)
 - [Model.Batch](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/Batch.md)
 - [Model.BatchErrorObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/BatchErrorObject.md)
 - [Model.BatchResult](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/BatchResult.md)
 - [Model.BatchResultResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/BatchResultResponse.md)
 - [Model.BatchStatus](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/BatchStatus.md)
 - [Model.BatchStatusResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/BatchStatusResponse.md)
 - [Model.CompanyFundamentalsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/CompanyFundamentalsResponse.md)
 - [Model.CompanyReportErrorObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/CompanyReportErrorObject.md)
 - [Model.Dividend](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/Dividend.md)
 - [Model.ErrorObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/ErrorObject.md)
 - [Model.ErrorObjectLinks](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/ErrorObjectLinks.md)
 - [Model.ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/ErrorResponse.md)
 - [Model.Exchange](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/Exchange.md)
 - [Model.FinancialResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/FinancialResponse.md)
 - [Model.Financials](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/Financials.md)
 - [Model.FiscalPeriod](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/FiscalPeriod.md)
 - [Model.Fundamental](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/Fundamental.md)
 - [Model.FundamentalRequestBody](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/FundamentalRequestBody.md)
 - [Model.FundamentalValue](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/FundamentalValue.md)
 - [Model.Fundamentals](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/Fundamentals.md)
 - [Model.FundamentalsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/FundamentalsRequest.md)
 - [Model.FundamentalsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/FundamentalsResponse.md)
 - [Model.Item](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/Item.md)
 - [Model.Metric](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/Metric.md)
 - [Model.MetricsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/MetricsResponse.md)
 - [Model.PerShare](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/PerShare.md)
 - [Model.Periodicity](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/Periodicity.md)
 - [Model.Profile](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/Profile.md)
 - [Model.ProfileResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/ProfileResponse.md)
 - [Model.Ratios](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/Ratios.md)
 - [Model.Segment](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/Segment.md)
 - [Model.SegmentRequestBody](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/SegmentRequestBody.md)
 - [Model.SegmentType](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/SegmentType.md)
 - [Model.SegmentValue](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/SegmentValue.md)
 - [Model.SegmentsPeriodicity](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/SegmentsPeriodicity.md)
 - [Model.SegmentsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/SegmentsRequest.md)
 - [Model.SegmentsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/SegmentsResponse.md)
 - [Model.UpdateType](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/FactSetFundamentals/v2/docs/UpdateType.md)


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

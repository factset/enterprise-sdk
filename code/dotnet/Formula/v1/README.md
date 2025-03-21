[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Formula client library for .NET

[![API Version](https://img.shields.io/badge/api-v1.8.0-blue)](https://developer.factset.com/api-catalog/formula-api)
[![Nuget](https://img.shields.io/badge/nuget-v3.0.0-orange)](https://www.nuget.org/packages/FactSet.SDK.Formula/3.0.0)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)


**FactSet Formula API**

FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.

Leverage the power and flexibility of the Formula API to -
  * Pull data from across most content sets that a user has access to in a single request
  * Include business logic and mathematical operations in request
  * Submit a dynamic universe in both endpoints
  * Return the fsymId to easily combine with other FactSet content / products
  * Set the trading calendar
  * Define custom display names

**Formula API Request Builder**

The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.

The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.

**How to Check the Health and Availability of the Formula API**

Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.

[https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)

**How to Programmatically Download API Specification File**

You can download the FactSet Formula API Specification File in .yaml. using the \"Download Spec\" button to the right of the version number. This specification can then be used for Codegen to create your own SDKs.


This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.8.0
- SDK version: 3.0.0
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.Formula -v 3.0.0
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.Formula -Version 3.0.0
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
using FactSet.SDK.Formula.Api;
using FactSet.SDK.Formula.Client;
using FactSet.SDK.Formula.Model;

namespace Example
{
    public static class GetBatchDataExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Formula.Client.Configuration();

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

All URIs are relative to *https://api.factset.com/formula-api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BatchProcessingApi* | [**GetBatchData**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/BatchProcessingApi.md#getbatchdata) | **GET** /batch-result | Returns the response for a Batch Request
*BatchProcessingApi* | [**GetBatchDataWithPost**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/BatchProcessingApi.md#getbatchdatawithpost) | **POST** /batch-result | Returns the status for a Batch Request
*BatchProcessingApi* | [**GetBatchStatus**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/BatchProcessingApi.md#getbatchstatus) | **GET** /batch-status | Returns the status for a Batch Request
*BatchProcessingApi* | [**GetBatchStatusWithPost**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/BatchProcessingApi.md#getbatchstatuswithpost) | **POST** /batch-status | Returns the status for a Batch Request
*CrossSectionalApi* | [**GetCrossSectionalData**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/CrossSectionalApi.md#getcrosssectionaldata) | **GET** /cross-sectional | Retrieve data items (Screening formulas) for a list of identifiers or defined universe.
*CrossSectionalApi* | [**GetCrossSectionalDataForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/CrossSectionalApi.md#getcrosssectionaldataforlist) | **POST** /cross-sectional | Retrieve data items (Screening formulas) for a list of identifiers or defined universe.
*TimeSeriesApi* | [**GetTimeSeriesData**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesApi.md#gettimeseriesdata) | **GET** /time-series | Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
*TimeSeriesApi* | [**GetTimeSeriesDataForList**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesApi.md#gettimeseriesdataforlist) | **POST** /time-series | Retrieve data items (FQL formulas) for a list of identifiers or defined universe.


## Documentation for Models

 - [Model.BatchData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/BatchData.md)
 - [Model.BatchDataRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/BatchDataRequest.md)
 - [Model.BatchDataRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/BatchDataRequestData.md)
 - [Model.BatchDataResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/BatchDataResponse.md)
 - [Model.BatchStatus](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/BatchStatus.md)
 - [Model.BatchStatusResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/BatchStatusResponse.md)
 - [Model.CrossSectionalRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/CrossSectionalRequest.md)
 - [Model.CrossSectionalRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/CrossSectionalRequestData.md)
 - [Model.CrossSectionalResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/CrossSectionalResponse.md)
 - [Model.CrossSectionalResponseObjectItems](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/CrossSectionalResponseObjectItems.md)
 - [Model.CrossSectionalResultObjectFlattened](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/CrossSectionalResultObjectFlattened.md)
 - [Model.CrossSectionalResultObjectFlattenedAddl](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/CrossSectionalResultObjectFlattenedAddl.md)
 - [Model.CrossSectionalResultObjectNonflattened](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/CrossSectionalResultObjectNonflattened.md)
 - [Model.CrossSectionalResultObjectNonflattenedResultAttribute](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/CrossSectionalResultObjectNonflattenedResultAttribute.md)
 - [Model.ErrorDetail](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/ErrorDetail.md)
 - [Model.ErrorObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/ErrorObject.md)
 - [Model.TimeSeriesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesRequest.md)
 - [Model.TimeSeriesRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesRequestData.md)
 - [Model.TimeSeriesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesResponse.md)
 - [Model.TimeSeriesResponseObjectItems](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesResponseObjectItems.md)
 - [Model.TimeSeriesResultObjectFlattened](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesResultObjectFlattened.md)
 - [Model.TimeSeriesResultObjectFlattenedAddl](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesResultObjectFlattenedAddl.md)
 - [Model.TimeSeriesResultObjectNonflattened](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesResultObjectNonflattened.md)
 - [Model.TimeSeriesResultObjectNonflattenedArray](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesResultObjectNonflattenedArray.md)
 - [Model.TimeSeriesResultObjectNonflattenedBase](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesResultObjectNonflattenedBase.md)
 - [Model.TimeSeriesResultObjectNonflattenedMatrix](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesResultObjectNonflattenedMatrix.md)
 - [Model.TimeSeriesResultObjectNonflattenedScalar](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesResultObjectNonflattenedScalar.md)
 - [Model.TimeSeriesResultObjectNonflattenedTimeseriesObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesResultObjectNonflattenedTimeseriesObject.md)
 - [Model.TimeSeriesScalarValue](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesScalarValue.md)
 - [Model.TimeSeriesTimeseriesObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/TimeSeriesTimeseriesObject.md)
 - [Model.WarningsObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Formula/v1/docs/WarningsObject.md)


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

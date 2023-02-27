[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Quant Engine client library for .NET

[![Nuget](https://img.shields.io/nuget/v/FactSet.SDK.QuantEngine)](https://www.nuget.org/packages/FactSet.SDK.QuantEngine)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Allow clients to fetch Analytics through APIs.

This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 3
- Package version: 0.1.1
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.QuantEngine
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.QuantEngine
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
using FactSet.SDK.QuantEngine.Api;
using FactSet.SDK.QuantEngine.Client;
using FactSet.SDK.QuantEngine.Model;

namespace Example
{
    public static class CancelCalculationByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuantEngine.Client.Configuration();

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

            var apiInstance = new QuantCalculationsApi(config);
            var id = "id_example";  // string | from url, provided from the location header in the Create and Run Quant calculation endpoint

            try
            {
                // Cancel Quant calculation by id
                apiInstance.CancelCalculationById(id);
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling QuantCalculationsApi.CancelCalculationById: " + e.Message );
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

All URIs are relative to *https://api.factset.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*QuantCalculationsApi* | [**CancelCalculationById**](docs/QuantCalculationsApi.md#cancelcalculationbyid) | **DELETE** /analytics/engines/quant/v3/calculations/{id} | Cancel Quant calculation by id
*QuantCalculationsApi* | [**GetAllCalculations**](docs/QuantCalculationsApi.md#getallcalculations) | **GET** /analytics/engines/quant/v3/calculations | Get all calculations
*QuantCalculationsApi* | [**GetCalculationParameters**](docs/QuantCalculationsApi.md#getcalculationparameters) | **GET** /analytics/engines/quant/v3/calculations/{id} | Get Quant Engine calculation parameters by id
*QuantCalculationsApi* | [**GetCalculationStatusById**](docs/QuantCalculationsApi.md#getcalculationstatusbyid) | **GET** /analytics/engines/quant/v3/calculations/{id}/status | Get Quant Engine calculation status by id
*QuantCalculationsApi* | [**GetCalculationUnitInfoById**](docs/QuantCalculationsApi.md#getcalculationunitinfobyid) | **GET** /analytics/engines/quant/v3/calculations/{id}/units/{unitId}/info | Get Quant Engine calculation metadata information by id
*QuantCalculationsApi* | [**GetCalculationUnitResultById**](docs/QuantCalculationsApi.md#getcalculationunitresultbyid) | **GET** /analytics/engines/quant/v3/calculations/{id}/units/{unitId}/result | Get Quant Engine calculation result by id
*QuantCalculationsApi* | [**PostAndCalculate**](docs/QuantCalculationsApi.md#postandcalculate) | **POST** /analytics/engines/quant/v3/calculations | Create and Run Quant Engine calculation
*QuantCalculationsApi* | [**PutAndCalculate**](docs/QuantCalculationsApi.md#putandcalculate) | **PUT** /analytics/engines/quant/v3/calculations/{id} | Create or update Quant Engine calculation and run it.


## Documentation for Models

 - [Model.CalculationStatus](docs/CalculationStatus.md)
 - [Model.CalculationStatusMeta](docs/CalculationStatusMeta.md)
 - [Model.CalculationStatusRoot](docs/CalculationStatusRoot.md)
 - [Model.CalculationUnitStatus](docs/CalculationUnitStatus.md)
 - [Model.CalculationUnitStatusMeta](docs/CalculationUnitStatusMeta.md)
 - [Model.CalculationsSummary](docs/CalculationsSummary.md)
 - [Model.CalculationsSummaryRoot](docs/CalculationsSummaryRoot.md)
 - [Model.ClientErrorResponse](docs/ClientErrorResponse.md)
 - [Model.Error](docs/Error.md)
 - [Model.ErrorSource](docs/ErrorSource.md)
 - [Model.ObjectRoot](docs/ObjectRoot.md)
 - [Model.OneOfQuantDates](docs/OneOfQuantDates.md)
 - [Model.OneOfQuantFormulas](docs/OneOfQuantFormulas.md)
 - [Model.OneOfQuantUniverse](docs/OneOfQuantUniverse.md)
 - [Model.PaginationInfo](docs/PaginationInfo.md)
 - [Model.PaginationMeta](docs/PaginationMeta.md)
 - [Model.QuantAllUniversalScreenParameters](docs/QuantAllUniversalScreenParameters.md)
 - [Model.QuantCalculationMeta](docs/QuantCalculationMeta.md)
 - [Model.QuantCalculationParameters](docs/QuantCalculationParameters.md)
 - [Model.QuantCalculationParametersRoot](docs/QuantCalculationParametersRoot.md)
 - [Model.QuantDate](docs/QuantDate.md)
 - [Model.QuantDateList](docs/QuantDateList.md)
 - [Model.QuantDateListObsolete](docs/QuantDateListObsolete.md)
 - [Model.QuantFdsDate](docs/QuantFdsDate.md)
 - [Model.QuantFdsDateObsolete](docs/QuantFdsDateObsolete.md)
 - [Model.QuantFormula](docs/QuantFormula.md)
 - [Model.QuantFqlExpression](docs/QuantFqlExpression.md)
 - [Model.QuantFqlExpressionObsolete](docs/QuantFqlExpressionObsolete.md)
 - [Model.QuantIdentifierUniverse](docs/QuantIdentifierUniverse.md)
 - [Model.QuantIdentifierUniverseObsolete](docs/QuantIdentifierUniverseObsolete.md)
 - [Model.QuantScreeningExpression](docs/QuantScreeningExpression.md)
 - [Model.QuantScreeningExpressionObsolete](docs/QuantScreeningExpressionObsolete.md)
 - [Model.QuantScreeningExpressionUniverse](docs/QuantScreeningExpressionUniverse.md)
 - [Model.QuantScreeningExpressionUniverseObsolete](docs/QuantScreeningExpressionUniverseObsolete.md)
 - [Model.QuantUniversalScreenParameter](docs/QuantUniversalScreenParameter.md)
 - [Model.QuantUniversalScreenParameterObsolete](docs/QuantUniversalScreenParameterObsolete.md)
 - [Model.QuantUniversalScreenUniverse](docs/QuantUniversalScreenUniverse.md)
 - [Model.QuantUniversalScreenUniverseObsolete](docs/QuantUniversalScreenUniverseObsolete.md)
 - [Model.QuantUniverse](docs/QuantUniverse.md)


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
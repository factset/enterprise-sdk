[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Publisher client library for .NET

[![API Version](https://img.shields.io/badge/api-v3.12.6-blue)](https://developer.factset.com/api-catalog/)
[![Nuget](https://img.shields.io/badge/nuget-v1.0.0-orange)](https://www.nuget.org/packages/FactSet.SDK.Publisher/1.0.0)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Allow clients to fetch Analytics through APIs.

This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 3.12.6
- SDK version: 1.0.0
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.Publisher -v 1.0.0
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.Publisher -Version 1.0.0
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
using FactSet.SDK.Publisher.Api;
using FactSet.SDK.Publisher.Client;
using FactSet.SDK.Publisher.Model;

namespace Example
{
    public static class GetAccountsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Publisher.Client.Configuration();

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

            var apiInstance = new AccountsApi(config);
            var path = "Client:";  // string | The directory to get the accounts and sub-directories.

            try
            {
                // Get accounts and sub-directories in a directory
                AccountDirectoriesRoot result = apiInstance.GetAccounts(path);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling AccountsApi.GetAccounts: " + e.Message );
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
*AccountsApi* | [**GetAccounts**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/AccountsApi.md#getaccounts) | **GET** /analytics/lookups/v3/accounts/{path} | Get accounts and sub-directories in a directory
*CurrenciesApi* | [**GetCurrencies**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/CurrenciesApi.md#getcurrencies) | **GET** /analytics/lookups/v3/currencies | Get currencies
*DocumentsApi* | [**GetPubDocuments**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/DocumentsApi.md#getpubdocuments) | **GET** /analytics/engines/pub/v3/documents/{path} | Gets Publisher documents and sub-directories in a directory
*PubCalculationsApi* | [**CancelCalculationById**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/PubCalculationsApi.md#cancelcalculationbyid) | **DELETE** /analytics/engines/pub/v3/calculations/{id} | Cancel Pub calculation by id
*PubCalculationsApi* | [**GetAllCalculations**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/PubCalculationsApi.md#getallcalculations) | **GET** /analytics/engines/pub/v3/calculations | Get all calculations
*PubCalculationsApi* | [**GetCalculationParameters**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/PubCalculationsApi.md#getcalculationparameters) | **GET** /analytics/engines/pub/v3/calculations/{id} | Get Pub calculation parameters by id
*PubCalculationsApi* | [**GetCalculationStatusById**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/PubCalculationsApi.md#getcalculationstatusbyid) | **GET** /analytics/engines/pub/v3/calculations/{id}/status | Get Pub calculation status by id
*PubCalculationsApi* | [**GetCalculationUnitResultById**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/PubCalculationsApi.md#getcalculationunitresultbyid) | **GET** /analytics/engines/pub/v3/calculations/{id}/units/{unitId}/result | Get Pub calculation result by id
*PubCalculationsApi* | [**PostAndCalculate**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/PubCalculationsApi.md#postandcalculate) | **POST** /analytics/engines/pub/v3/calculations | Create and Run Pub calculation
*PubCalculationsApi* | [**PutAndCalculate**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/PubCalculationsApi.md#putandcalculate) | **PUT** /analytics/engines/pub/v3/calculations/{id} | Create or Update Pub calculation and run it.


## Documentation for Models

 - [Model.AccountDirectories](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/AccountDirectories.md)
 - [Model.AccountDirectoriesRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/AccountDirectoriesRoot.md)
 - [Model.CalculationStatus](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/CalculationStatus.md)
 - [Model.CalculationStatusMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/CalculationStatusMeta.md)
 - [Model.CalculationStatusRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/CalculationStatusRoot.md)
 - [Model.CalculationUnitStatus](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/CalculationUnitStatus.md)
 - [Model.CalculationUnitStatusMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/CalculationUnitStatusMeta.md)
 - [Model.CalculationsSummary](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/CalculationsSummary.md)
 - [Model.CalculationsSummaryRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/CalculationsSummaryRoot.md)
 - [Model.ClientErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/ClientErrorResponse.md)
 - [Model.Currency](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/Currency.md)
 - [Model.CurrencyRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/CurrencyRoot.md)
 - [Model.DocumentDirectories](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/DocumentDirectories.md)
 - [Model.DocumentDirectoriesRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/DocumentDirectoriesRoot.md)
 - [Model.Error](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/Error.md)
 - [Model.ErrorSource](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/ErrorSource.md)
 - [Model.PaginationInfo](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/PaginationInfo.md)
 - [Model.PaginationMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/PaginationMeta.md)
 - [Model.PubCalculationParameters](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/PubCalculationParameters.md)
 - [Model.PubCalculationParametersRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/PubCalculationParametersRoot.md)
 - [Model.PubDateParameters](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/PubDateParameters.md)
 - [Model.PubIdentifier](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Publisher/v3/docs/PubIdentifier.md)


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

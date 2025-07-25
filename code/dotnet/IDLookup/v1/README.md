[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# ID Lookup client library for .NET

[![API Version](https://img.shields.io/badge/api-v1.0.0-blue)]()
[![Nuget](https://img.shields.io/badge/nuget-v0.22.2-orange)](https://www.nuget.org/packages/FactSet.SDK.IDLookup/0.22.2)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The Factset Identifier Lookup API provides the ability to search for various identifier types based on keyword. The API returns tickers, entity names and other identifiers that Factset supports. In addition, the API offers filters that allows users to refine the results.


This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- SDK version: 0.22.2
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.IDLookup -v 0.22.2
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.IDLookup -Version 0.22.2
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
using FactSet.SDK.IDLookup.Api;
using FactSet.SDK.IDLookup.Client;
using FactSet.SDK.IDLookup.Model;

namespace Example
{
    public static class SearchCompanynameExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IDLookup.Client.Configuration();

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

            var apiInstance = new FactSetIDLookupApi(config);
            var lookupRequest = new LookupRequest(); // LookupRequest | Post body to lookup any FactSet identifiers

            try
            {
                // Search funtionality to return tickers, company names and unique identifiers for FactSet data
                LookupResponse result = apiInstance.SearchCompanyname(lookupRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling FactSetIDLookupApi.SearchCompanyname: " + e.Message );
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

All URIs are relative to *https://api.factset.com/idsearch*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FactSetIDLookupApi* | [**SearchCompanyname**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IDLookup/v1/docs/FactSetIDLookupApi.md#searchcompanyname) | **POST** /v1/idsearch | Search funtionality to return tickers, company names and unique identifiers for FactSet data


## Documentation for Models

 - [Model.ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IDLookup/v1/docs/ErrorResponse.md)
 - [Model.FilterParams](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IDLookup/v1/docs/FilterParams.md)
 - [Model.IncludeExcludeObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IDLookup/v1/docs/IncludeExcludeObject.md)
 - [Model.LookupAssettype](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IDLookup/v1/docs/LookupAssettype.md)
 - [Model.LookupCount](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IDLookup/v1/docs/LookupCount.md)
 - [Model.LookupLimit](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IDLookup/v1/docs/LookupLimit.md)
 - [Model.LookupObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IDLookup/v1/docs/LookupObject.md)
 - [Model.LookupRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IDLookup/v1/docs/LookupRequest.md)
 - [Model.LookupResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IDLookup/v1/docs/LookupResponse.md)
 - [Model.ResponseDetails](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/IDLookup/v1/docs/ResponseDetails.md)


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

[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# OFDB client library for .NET

[![Nuget](https://img.shields.io/nuget/v/FactSet.SDK.OFDB)](https://www.nuget.org/packages/FactSet.SDK.OFDB)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

OFDB API

This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.0.0
- Package version: 0.30.1
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.OFDB
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.OFDB
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
using FactSet.SDK.OFDB.Api;
using FactSet.SDK.OFDB.Client;
using FactSet.SDK.OFDB.Model;

namespace Example
{
    public static class AddDatesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OFDB.Client.Configuration();

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

            var apiInstance = new AddApi(config);
            var path = "path_example";  // string | Encode database path
            var addDates = new AddDates(); // AddDates | Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.

            try
            {
                SuccessPostResponse result = apiInstance.AddDates(path, addDates);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling AddApi.AddDates: " + e.Message );
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

All URIs are relative to *https://api.factset.com/analytics/ofdb/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddApi* | [**AddDates**](docs/AddApi.md#adddates) | **POST** /database/{path}/dates | 
*AddApi* | [**AddFields**](docs/AddApi.md#addfields) | **POST** /database/{path}/fields | 
*AddApi* | [**AddSymbols**](docs/AddApi.md#addsymbols) | **POST** /database/{path}/symbols | 
*CreateApi* | [**CreateDatabase**](docs/CreateApi.md#createdatabase) | **POST** /database | 
*DeleteApi* | [**DeleteDate**](docs/DeleteApi.md#deletedate) | **DELETE** /database/{path}/dates/{date} | 
*DeleteApi* | [**DeleteDateFromSymbol**](docs/DeleteApi.md#deletedatefromsymbol) | **DELETE** /database/{path}/dates/{date}/symbols/{symbol} | 
*DeleteApi* | [**DeleteSymbol**](docs/DeleteApi.md#deletesymbol) | **DELETE** /database/{path}/symbols/{symbol} | 
*GetApi* | [**GetAudit**](docs/GetApi.md#getaudit) | **GET** /database/{path}/audit | 
*GetApi* | [**GetData**](docs/GetApi.md#getdata) | **GET** /database/{path} | 
*GetApi* | [**GetDates**](docs/GetApi.md#getdates) | **GET** /database/{path}/dates | 
*GetApi* | [**GetFields**](docs/GetApi.md#getfields) | **GET** /database/{path}/fields | 
*GetApi* | [**GetStats**](docs/GetApi.md#getstats) | **GET** /database/{path}/stats | 
*GetApi* | [**GetSymbols**](docs/GetApi.md#getsymbols) | **GET** /database/{path}/symbols | 
*UpdateApi* | [**UpdateDate**](docs/UpdateApi.md#updatedate) | **PUT** /database/{path}/dates/{date} | 
*UpdateApi* | [**UpdateDates**](docs/UpdateApi.md#updatedates) | **PUT** /database/{path}/dates | 
*UpdateApi* | [**UpdateSymbol**](docs/UpdateApi.md#updatesymbol) | **PUT** /database/{path}/symbols/{symbol} | 
*UpdateApi* | [**UpdateSymbols**](docs/UpdateApi.md#updatesymbols) | **PUT** /database/{path}/symbols | 


## Documentation for Models

 - [Model.AddDates](docs/AddDates.md)
 - [Model.AddDatesContent](docs/AddDatesContent.md)
 - [Model.AddDatesData](docs/AddDatesData.md)
 - [Model.AddFields](docs/AddFields.md)
 - [Model.AddSymbols](docs/AddSymbols.md)
 - [Model.AddSymbolsContent](docs/AddSymbolsContent.md)
 - [Model.AddSymbolsData](docs/AddSymbolsData.md)
 - [Model.CreateDatabase](docs/CreateDatabase.md)
 - [Model.CreateDatabaseData](docs/CreateDatabaseData.md)
 - [Model.DatabaseSchema](docs/DatabaseSchema.md)
 - [Model.DatabaseSchemaData](docs/DatabaseSchemaData.md)
 - [Model.InlineResponse200](docs/InlineResponse200.md)
 - [Model.InlineResponse2001](docs/InlineResponse2001.md)
 - [Model.InlineResponse2001Data](docs/InlineResponse2001Data.md)
 - [Model.InlineResponse2002](docs/InlineResponse2002.md)
 - [Model.InlineResponse2003](docs/InlineResponse2003.md)
 - [Model.InlineResponse2004](docs/InlineResponse2004.md)
 - [Model.InlineResponse2005](docs/InlineResponse2005.md)
 - [Model.InlineResponse2005Data](docs/InlineResponse2005Data.md)
 - [Model.InlineResponse200Data](docs/InlineResponse200Data.md)
 - [Model.InlineResponse202](docs/InlineResponse202.md)
 - [Model.InlineResponse202Data](docs/InlineResponse202Data.md)
 - [Model.InlineResponse400](docs/InlineResponse400.md)
 - [Model.InlineResponse400Errors](docs/InlineResponse400Errors.md)
 - [Model.InlineResponse400Source](docs/InlineResponse400Source.md)
 - [Model.InlineResponse403](docs/InlineResponse403.md)
 - [Model.InlineResponse403Errors](docs/InlineResponse403Errors.md)
 - [Model.InlineResponse404](docs/InlineResponse404.md)
 - [Model.InlineResponse404Errors](docs/InlineResponse404Errors.md)
 - [Model.InlineResponse406](docs/InlineResponse406.md)
 - [Model.InlineResponse406Errors](docs/InlineResponse406Errors.md)
 - [Model.InlineResponse413](docs/InlineResponse413.md)
 - [Model.InlineResponse413Errors](docs/InlineResponse413Errors.md)
 - [Model.InlineResponse429](docs/InlineResponse429.md)
 - [Model.InlineResponse429Errors](docs/InlineResponse429Errors.md)
 - [Model.SuccessPostResponse](docs/SuccessPostResponse.md)
 - [Model.SuccessPostResponseData](docs/SuccessPostResponseData.md)
 - [Model.UpdateDate](docs/UpdateDate.md)
 - [Model.UpdateDateData](docs/UpdateDateData.md)
 - [Model.UpdateDates](docs/UpdateDates.md)
 - [Model.UpdateDatesData](docs/UpdateDatesData.md)
 - [Model.UpdateSymbol](docs/UpdateSymbol.md)
 - [Model.UpdateSymbolContent](docs/UpdateSymbolContent.md)
 - [Model.UpdateSymbolData](docs/UpdateSymbolData.md)
 - [Model.UpdateSymbols](docs/UpdateSymbols.md)
 - [Model.UpdateSymbolsData](docs/UpdateSymbolsData.md)


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
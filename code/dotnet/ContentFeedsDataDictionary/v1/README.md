[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Content Feeds Data Dictionary client library for .NET

[![API Version](https://img.shields.io/badge/api-v0.2-blue)]()
[![Nuget](https://img.shields.io/badge/nuget-v0.21.11-orange)](https://www.nuget.org/packages/FactSet.SDK.ContentFeedsDataDictionary/0.21.11)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

An API for interacting with CTS Data Dictionary.

This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.2
- SDK version: 0.21.11
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.ContentFeedsDataDictionary -v 0.21.11
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.ContentFeedsDataDictionary -Version 0.21.11
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
using FactSet.SDK.ContentFeedsDataDictionary.Api;
using FactSet.SDK.ContentFeedsDataDictionary.Client;
using FactSet.SDK.ContentFeedsDataDictionary.Model;

namespace Example
{
    public static class NavigatorBasicSearchPostExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ContentFeedsDataDictionary.Client.Configuration();

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

            var apiInstance = new NavigatorApi(config);
            var basicSearchRequest = new BasicSearchRequest(); // BasicSearchRequest | A list of search terms (each term must be at least two characters).

            try
            {
                // Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.
                BasicSearchResponse result = apiInstance.NavigatorBasicSearchPost(basicSearchRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling NavigatorApi.NavigatorBasicSearchPost: " + e.Message );
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

All URIs are relative to *https://api.factset.com/data-dictionary*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*NavigatorApi* | [**NavigatorBasicSearchPost**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/NavigatorApi.md#navigatorbasicsearchpost) | **POST** /navigator/basic_search | Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.
*NavigatorApi* | [**NavigatorDataItemsProductIdGet**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/NavigatorApi.md#navigatordataitemsproductidget) | **GET** /navigator/data_items/{Product_id} | Get the list of data items associated with a product for Navigator.
*NavigatorApi* | [**NavigatorProductsGet**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/NavigatorApi.md#navigatorproductsget) | **GET** /navigator/products | Get the list of products for Navigator.
*NavigatorApi* | [**NavigatorSourcesDataItemIdGet**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/NavigatorApi.md#navigatorsourcesdataitemidget) | **GET** /navigator/sources/{DataItem_id} | Get a list of sources where the specified data item can be found, for each delivery method, filtered to the appearances of the given data item within the specified product.
*NavigatorApi* | [**NavigatorSourcesGet**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/NavigatorApi.md#navigatorsourcesget) | **GET** /navigator/sources | Get a list of sources by delivery method for the given product_id
*NavigatorApi* | [**NavigatorTableFieldsTableIdGet**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/NavigatorApi.md#navigatortablefieldstableidget) | **GET** /navigator/table_fields/{Table_id} | Get the list of fields associated with a table for Navigator, and the code information for the specified data item, if applicable.


## Documentation for Models

 - [Model.ApiEndpoint](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/ApiEndpoint.md)
 - [Model.BasicSearchRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/BasicSearchRequest.md)
 - [Model.BasicSearchResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/BasicSearchResponse.md)
 - [Model.BasicSearchResponseResults](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/BasicSearchResponseResults.md)
 - [Model.DataItem](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/DataItem.md)
 - [Model.NavigatorSourcesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/NavigatorSourcesResponse.md)
 - [Model.Product](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/Product.md)
 - [Model.ReferenceGroup](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/ReferenceGroup.md)
 - [Model.Table](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/Table.md)
 - [Model.TableCodeFieldInfoResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/TableCodeFieldInfoResponse.md)
 - [Model.TableCodeInfo](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/TableCodeInfo.md)
 - [Model.TableField](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/ContentFeedsDataDictionary/v1/docs/TableField.md)


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

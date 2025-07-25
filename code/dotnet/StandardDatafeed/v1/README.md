[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Standard Datafeed client library for .NET

[![API Version](https://img.shields.io/badge/api-v1.2.0-blue)]()
[![Nuget](https://img.shields.io/badge/nuget-v0.21.13-orange)](https://www.nuget.org/packages/FactSet.SDK.StandardDatafeed/0.21.13)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The Standard DataFeed (SDF) Download API provides an alternative method for users to request and retrieve SDF packages (schemas & bundles). This service is not a direct replacement and does not have 100% feature parity with the Loader Application. This API provides an alternative for users who are unable to utilize the Loader application due to following reasons:
  - Inability to install 3rd party executables due to Corporate Security policies  
  - Inability to utilize the Loader application due to limitations or restrictions with the environment used to consume Standard Datafeed
  - Clients who are utilizing existing delivery method like FTP, who may want to use a more secured & modern solution  

 This API allows users to retrieve maximum of latest 30 days of data

 
 Additional parameters are available to filter requests to get the exact files users are looking for.
 
 QFL data is delivered through Content API & Bulk Data API (SDF API)
 - Content API : Provides direct access to FactSet-hosted QFL data.  Suitable for interactive, ad hoc QFL requests.  Constraints on large extracts.  Costs are based on consumption, i.e. more calls can result in more costs.
 - Bulk Data API : Provides access to download locations of zip files for client download. Suitable for production processes within a client environment. Cost is based on the use case and fixed unless scope changes (same as other SDFs).

This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.2.0
- SDK version: 0.21.13
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.StandardDatafeed -v 0.21.13
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.StandardDatafeed -Version 0.21.13
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
using FactSet.SDK.StandardDatafeed.Api;
using FactSet.SDK.StandardDatafeed.Client;
using FactSet.SDK.StandardDatafeed.Model;

namespace Example
{
    public static class GetV1ListFilesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StandardDatafeed.Client.Configuration();

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

            var apiInstance = new SDFAndQFLContentLibraryApi(config);
            var schema = "schema_example";  // string | schema name</p> </p> **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1**  (optional) 
            var bundle = "bundle_example";  // string | bundle name</p> If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families & factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups (optional) 
            var type = "full";  // string | file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files** (optional) 
            var startDate = "startDate_example";  // string | The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p>     - If the schema parameter is specified in the request, date range can be greater than 10 days maximum upto latest 30 days. - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday (optional) 
            var endDate = "endDate_example";  // string | The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today (optional) 
            var paginationLimit = 20;  // int? | Specifies the number of results to return per page. Default is 20 & Maximum is 500 results per page (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)  (default to 0)
            var sort = "startDate";  // string | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used (optional) 

            try
            {
                ListFiles200Response result = apiInstance.GetV1ListFiles(schema, bundle, type, startDate, endDate, paginationLimit, paginationOffset, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling SDFAndQFLContentLibraryApi.GetV1ListFiles: " + e.Message );
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

All URIs are relative to *https://api.factset.com/bulk-documents/sdf/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SDFAndQFLContentLibraryApi* | [**GetV1ListFiles**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/StandardDatafeed/v1/docs/SDFAndQFLContentLibraryApi.md#getv1listfiles) | **GET** /list-files | 
*SchemaApi* | [**GetV1ListSchemas**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/StandardDatafeed/v1/docs/SchemaApi.md#getv1listschemas) | **GET** /list-schemas | schemas


## Documentation for Models

 - [Model.Dataresponseitems](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/StandardDatafeed/v1/docs/Dataresponseitems.md)
 - [Model.DataresponseitemsRelatedBundles](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/StandardDatafeed/v1/docs/DataresponseitemsRelatedBundles.md)
 - [Model.ListFiles200Response](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/StandardDatafeed/v1/docs/ListFiles200Response.md)
 - [Model.ListFiles200ResponseMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/StandardDatafeed/v1/docs/ListFiles200ResponseMeta.md)
 - [Model.ListFiles400Response](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/StandardDatafeed/v1/docs/ListFiles400Response.md)
 - [Model.ListSchema400Response](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/StandardDatafeed/v1/docs/ListSchema400Response.md)
 - [Model.ListSchemas](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/StandardDatafeed/v1/docs/ListSchemas.md)
 - [Model.Meta](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/StandardDatafeed/v1/docs/Meta.md)
 - [Model.Pagination](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/StandardDatafeed/v1/docs/Pagination.md)
 - [Model.Partial](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/StandardDatafeed/v1/docs/Partial.md)
 - [Model.SchemaDetails](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/StandardDatafeed/v1/docs/SchemaDetails.md)


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

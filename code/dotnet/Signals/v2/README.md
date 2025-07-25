[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Signals client library for .NET

[![API Version](https://img.shields.io/badge/api-v2.6.0-blue)](https://developer.factset.com/api-catalog/signals-api)
[![Nuget](https://img.shields.io/badge/nuget-v1.0.0-orange)](https://www.nuget.org/packages/FactSet.SDK.Signals/1.0.0)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Collection of endpoints for providing Signal Events, Definitions and Metadata

This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.6.0
- SDK version: 1.0.0
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.Signals -v 1.0.0
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.Signals -Version 1.0.0
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
using FactSet.SDK.Signals.Api;
using FactSet.SDK.Signals.Client;
using FactSet.SDK.Signals.Model;

namespace Example
{
    public static class GetEventAdaptiveCardByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Signals.Client.Configuration();

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

            var apiInstance = new EventsApi(config);
            var eventId = "eventId_example";  // Guid | The UUID of the event to return.

            try
            {
                EventAdaptiveCard result = apiInstance.GetEventAdaptiveCardById(eventId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling EventsApi.GetEventAdaptiveCardById: " + e.Message );
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

All URIs are relative to *https://api.factset.com/signals/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EventsApi* | [**GetEventAdaptiveCardById**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventsApi.md#geteventadaptivecardbyid) | **GET** /events/adaptive-cards/{eventId} | 
*EventsApi* | [**GetEventDetailById**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventsApi.md#geteventdetailbyid) | **GET** /events/details/{eventId} | 
*EventsApi* | [**PostEventAdaptiveCards**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventsApi.md#posteventadaptivecards) | **POST** /events/adaptive-cards | 
*EventsApi* | [**PostEventDetails**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventsApi.md#posteventdetails) | **POST** /events/details | 
*EventsApi* | [**PostEventEntities**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventsApi.md#postevententities) | **POST** /events/entities | 
*EventsApi* | [**PostEventHeadlines**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventsApi.md#posteventheadlines) | **POST** /events/headlines | 
*MetadataApi* | [**GetCategories**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/MetadataApi.md#getcategories) | **GET** /categories | 
*MetadataApi* | [**GetDataDictionary**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/MetadataApi.md#getdatadictionary) | **GET** /data-dictionary | 
*MetadataApi* | [**GetDataDictionaryById**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/MetadataApi.md#getdatadictionarybyid) | **GET** /data-dictionary/{signalId} | 
*MetadataApi* | [**GetThemes**](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/MetadataApi.md#getthemes) | **GET** /themes | 


## Documentation for Models

 - [Model.Contract](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/Contract.md)
 - [Model.ContractFields](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/ContractFields.md)
 - [Model.ContractFieldsEventDate](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/ContractFieldsEventDate.md)
 - [Model.ContractFieldsSummary](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/ContractFieldsSummary.md)
 - [Model.ContractProperty](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/ContractProperty.md)
 - [Model.ContractPropertyItems](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/ContractPropertyItems.md)
 - [Model.DateTimeInterval](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/DateTimeInterval.md)
 - [Model.ErrorItem](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/ErrorItem.md)
 - [Model.ErrorItemSource](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/ErrorItemSource.md)
 - [Model.ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/ErrorResponse.md)
 - [Model.EventAdaptiveCard](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventAdaptiveCard.md)
 - [Model.EventAdaptiveCards](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventAdaptiveCards.md)
 - [Model.EventAdaptiveDataItem](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventAdaptiveDataItem.md)
 - [Model.EventDetail](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventDetail.md)
 - [Model.EventDetailDataItem](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventDetailDataItem.md)
 - [Model.EventDetailDataItemAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventDetailDataItemAllOf.md)
 - [Model.EventDetails](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventDetails.md)
 - [Model.EventHeadlineDataItem](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventHeadlineDataItem.md)
 - [Model.EventHeadlines](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventHeadlines.md)
 - [Model.EventMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventMeta.md)
 - [Model.EventRequestBody](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventRequestBody.md)
 - [Model.EventsEntities](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventsEntities.md)
 - [Model.EventsEntitiesPost](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventsEntitiesPost.md)
 - [Model.EventsMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventsMeta.md)
 - [Model.EventsMetaDateRange](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventsMetaDateRange.md)
 - [Model.EventsMetaPagination](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/EventsMetaPagination.md)
 - [Model.IdResolutionsMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/IdResolutionsMeta.md)
 - [Model.RateLimitResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/RateLimitResponse.md)
 - [Model.RelevanceScoreRange](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/RelevanceScoreRange.md)
 - [Model.ScreenMeta](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/ScreenMeta.md)
 - [Model.ScreenMetaPartial](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/ScreenMetaPartial.md)
 - [Model.SignalDefinition](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/SignalDefinition.md)
 - [Model.SignalDefinitionData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/SignalDefinitionData.md)
 - [Model.SignalMetaData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/SignalMetaData.md)
 - [Model.SignalMetaDataData](https://github.com/FactSet/enterprise-sdk/tree/main/code/dotnet/Signals/v2/docs/SignalMetaDataData.md)


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

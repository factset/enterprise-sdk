[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Price Alerting API for Digital Portals client library for .NET

[![Nuget](https://img.shields.io/nuget/v/FactSet.SDK.PriceAlertingAPIforDigitalPortals)](https://www.nuget.org/packages/FactSet.SDK.PriceAlertingAPIforDigitalPortals)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The Price Alerting API is designed to inform the users of an application directly about important changes in the data on the platform. The endpoint group *basic price alerting* deals with generation of alerts based on current price data. For notations, users can define an upper or lower limit and choose on which price type those limit conditions apply.

Alerting uses the concepts of triggers and alerts.

A trigger is an entity that is set up by an application to watch a certain condition in the market data around a financial instrument. The standard conditions that can be applied are lower limit and upper limit for the value of the price for a given financial instrument.

When the condition of a trigger is met, an alert is created. Each alert thus represents one event where a trigger condition was met.

An application can learn about the creation of alerts in two ways: The application can actively request the list of alerts (pull approach) or it can subscribe to the list of existing alerts. If a new alert is created, that list changes and the application is notified about the new alert with an update that contains the details on the new alert (push approach).

The API supports both approaches. The push approach is realized most easily by using the subscription support that the client libraries provide.

See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price information.


This .NET package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2
- Package version: 0.10.3
- Build package: com.factset.sdk.codegen.FactSetCSharpNetCoreClientCodegen

## Requirements

* .NET Standard >= 2.0

## Installation

### .NET CLI

```bash
dotnet add package FactSet.SDK.Utils
dotnet add package FactSet.SDK.PriceAlertingAPIforDigitalPortals
```

### NuGet

```bash
nuget install FactSet.SDK.Utils
nuget install FactSet.SDK.PriceAlertingAPIforDigitalPortals
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
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Api;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Client;
using FactSet.SDK.PriceAlertingAPIforDigitalPortals.Model;

namespace Example
{
    public static class GetAlertingPricesBasicAlertGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PriceAlertingAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new AlertingApi(config);
            var id = "id_example";  // string | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Details of an alert.
                InlineResponse200 result = apiInstance.GetAlertingPricesBasicAlertGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException e)
            {
                Console.WriteLine("Exception when calling AlertingApi.GetAlertingPricesBasicAlertGet: " + e.Message );
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

All URIs are relative to *https://api.factset.com/wealth/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AlertingApi* | [**GetAlertingPricesBasicAlertGet**](docs/AlertingApi.md#getalertingpricesbasicalertget) | **GET** /alerting/prices/basic/alert/get | Details of an alert.
*AlertingApi* | [**GetAlertingPricesBasicAlertList**](docs/AlertingApi.md#getalertingpricesbasicalertlist) | **GET** /alerting/prices/basic/alert/list | List of alerts.
*AlertingApi* | [**GetAlertingPricesBasicTriggerGet**](docs/AlertingApi.md#getalertingpricesbasictriggerget) | **GET** /alerting/prices/basic/trigger/get | Details of a trigger.
*AlertingApi* | [**PostAlertingPricesBasicTriggerList**](docs/AlertingApi.md#postalertingpricesbasictriggerlist) | **POST** /alerting/prices/basic/trigger/list | List of triggers.


## Documentation for Models

 - [Model.AlertingPricesBasicTriggerListData](docs/AlertingPricesBasicTriggerListData.md)
 - [Model.AlertingPricesBasicTriggerListDataFilter](docs/AlertingPricesBasicTriggerListDataFilter.md)
 - [Model.AlertingPricesBasicTriggerListDataFilterStatus](docs/AlertingPricesBasicTriggerListDataFilterStatus.md)
 - [Model.AlertingPricesBasicTriggerListMeta](docs/AlertingPricesBasicTriggerListMeta.md)
 - [Model.AlertingPricesBasicTriggerListMetaPagination](docs/AlertingPricesBasicTriggerListMetaPagination.md)
 - [Model.CursorBasedPaginationOutputObject](docs/CursorBasedPaginationOutputObject.md)
 - [Model.CursorBasedPaginationOutputObjectWithoutTotal](docs/CursorBasedPaginationOutputObjectWithoutTotal.md)
 - [Model.ErrorMetaObject](docs/ErrorMetaObject.md)
 - [Model.InlineObject](docs/InlineObject.md)
 - [Model.InlineResponse200](docs/InlineResponse200.md)
 - [Model.InlineResponse2001](docs/InlineResponse2001.md)
 - [Model.InlineResponse2001Data](docs/InlineResponse2001Data.md)
 - [Model.InlineResponse2001Meta](docs/InlineResponse2001Meta.md)
 - [Model.InlineResponse2001Trigger](docs/InlineResponse2001Trigger.md)
 - [Model.InlineResponse2001TriggerPrice](docs/InlineResponse2001TriggerPrice.md)
 - [Model.InlineResponse2001TriggerStatus](docs/InlineResponse2001TriggerStatus.md)
 - [Model.InlineResponse2002](docs/InlineResponse2002.md)
 - [Model.InlineResponse2002Data](docs/InlineResponse2002Data.md)
 - [Model.InlineResponse2003](docs/InlineResponse2003.md)
 - [Model.InlineResponse2003Data](docs/InlineResponse2003Data.md)
 - [Model.InlineResponse2003Range](docs/InlineResponse2003Range.md)
 - [Model.InlineResponse200Data](docs/InlineResponse200Data.md)
 - [Model.InlineResponse200DataPrice](docs/InlineResponse200DataPrice.md)
 - [Model.InlineResponse200DataTrigger](docs/InlineResponse200DataTrigger.md)
 - [Model.InlineResponse200DataTriggerNotation](docs/InlineResponse200DataTriggerNotation.md)
 - [Model.InlineResponse200DataTriggerPrice](docs/InlineResponse200DataTriggerPrice.md)
 - [Model.InlineResponse200DataTriggerRange](docs/InlineResponse200DataTriggerRange.md)
 - [Model.InlineResponse200DataTriggerStatus](docs/InlineResponse200DataTriggerStatus.md)
 - [Model.InlineResponse200Meta](docs/InlineResponse200Meta.md)
 - [Model.OffsetBasedPaginationOutputObject](docs/OffsetBasedPaginationOutputObject.md)
 - [Model.OffsetBasedPaginationOutputObjectWithoutTotal](docs/OffsetBasedPaginationOutputObjectWithoutTotal.md)
 - [Model.PartialOutputObject](docs/PartialOutputObject.md)
 - [Model.StatusObject](docs/StatusObject.md)


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

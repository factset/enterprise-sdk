[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# IRN Custom Symbols client library for Python

[![API Version](https://img.shields.io/badge/api-v1.1.0-blue)](https://developer.factset.com/api-catalog/#apiDocumentation)
[![PyPi](https://img.shields.io/pypi/v/fds.sdk.IRNCustomSymbols/1.1.1)](https://pypi.org/project/fds.sdk.IRNCustomSymbols/v/1.1.1)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Allows users to extract, create, update and configure IRN data.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.1.0
- SDK version: 1.1.1
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.IRNCustomSymbols==1.1.1
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.IRNCustomSymbols==1.1.1
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Python environment.
   1. Install and activate python 3.7+. If you're using [pyenv](https://github.com/pyenv/pyenv):

      ```sh
      pyenv install 3.9.7
      pyenv shell 3.9.7
      ```

   2. (optional) [Install poetry](https://python-poetry.org/docs/#installation).
3. [Install dependencies](#installation).
4. Run the following:

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient

import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.api import custom_symbols_api
from fds.sdk.IRNCustomSymbols.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNCustomSymbols.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNCustomSymbols.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNCustomSymbols.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = custom_symbols_api.CustomSymbolsApi(api_client)
    create_custom_symbol_dto = CreateCustomSymbolDto(
        code="code_example",
        name="name_example",
        description="description_example",
        type_id="type_id_example",
        sub_type_id="sub_type_id_example",
        google_maps_place_id="google_maps_place_id_example",
        formatted_address="formatted_address_example",
        city="city_example",
        state_province="state_province_example",
        postal_code="postal_code_example",
        country="country_example",
        custom_field_values=[
            CreateCustomSymbolCustomFieldValueDto(
                code="code_example",
                text_value="text_value_example",
                numeric_value=3.14,
                date_value="date_value_example",
                extended_text_value="extended_text_value_example",
                option_values=[
                    "option_values_example",
                ],
                contact_ids=[
                    "contact_ids_example",
                ],
            ),
        ],
    ) # CreateCustomSymbolDto | createCustomSymbolDto object to save (optional)

    try:
        # Create a custom symbol
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_custom_symbol(create_custom_symbol_dto=create_custom_symbol_dto)

        pprint(api_response)
    except fds.sdk.IRNCustomSymbols.ApiException as e:
        print("Exception when calling CustomSymbolsApi->create_custom_symbol: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Create a custom symbol
    #     api_response, http_status_code, response_headers = api_instance.create_custom_symbol_with_http_info(create_custom_symbol_dto=create_custom_symbol_dto)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.IRNCustomSymbols.ApiException as e:
    #     print("Exception when calling CustomSymbolsApi->create_custom_symbol: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Create a custom symbol
    #     async_result = api_instance.create_custom_symbol_async(create_custom_symbol_dto=create_custom_symbol_dto)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.IRNCustomSymbols.ApiException as e:
    #     print("Exception when calling CustomSymbolsApi->create_custom_symbol: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Create a custom symbol
    #     async_result = api_instance.create_custom_symbol_with_http_info_async(create_custom_symbol_dto=create_custom_symbol_dto)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.IRNCustomSymbols.ApiException as e:
    #     print("Exception when calling CustomSymbolsApi->create_custom_symbol: %s\n" % e)

```

### Using Pandas

To convert an API response to a Pandas DataFrame, it is necessary to transform it first to a dictionary.
```python
import pandas as pd

response_dict = api_response.to_dict()['data']

simple_json_response = pd.DataFrame(response_dict)
nested_json_response = pd.json_normalize(response_dict)
```

### Debugging

The SDK uses the standard library [`logging`](https://docs.python.org/3/library/logging.html#module-logging) module.

Setting `debug` to `True` on an instance of the `Configuration` class sets the log-level of related packages to `DEBUG`
and enables additional logging in Pythons [HTTP Client](https://docs.python.org/3/library/http.client.html).

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```python
import logging
import fds.sdk.IRNCustomSymbols

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.IRNCustomSymbols.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.IRNCustomSymbols

configuration = fds.sdk.IRNCustomSymbols.Configuration(
    # ...
    proxy="http://secret:password@localhost:5050",
    proxy_headers={
        "Custom-Proxy-Header": "Custom-Proxy-Header-Value"
    }
)
```

### Custom SSL Certificate

TLS/SSL certificate verification can be configured with the following Configuration parameters:

* `ssl_ca_cert`: a path to the certificate to use for verification in `PEM` format.
* `verify_ssl`: setting this to `False` disables the verification of certificates.
  Disabling the verification is not recommended, but it might be useful during
  local development or testing.

```python
import fds.sdk.IRNCustomSymbols

configuration = fds.sdk.IRNCustomSymbols.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```

### Request Retries

In case the request retry behaviour should be customized, it is possible to pass a `urllib3.Retry` object to the `retry` property of the Configuration.

```python
from urllib3 import Retry
import fds.sdk.IRNCustomSymbols

configuration = fds.sdk.IRNCustomSymbols.Configuration(
    # ...
)

configuration.retries = Retry(total=3, status_forcelist=[500, 502, 503, 504])
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/research/irn/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CustomSymbolsApi* | [**create_custom_symbol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolsApi.md#create_custom_symbol) | **POST** /custom-symbols | Create a custom symbol
*CustomSymbolsApi* | [**delete_custom_symbol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolsApi.md#delete_custom_symbol) | **DELETE** /custom-symbols/{customSymbolId} | Delete a custom symbol
*CustomSymbolsApi* | [**get_custom_symbol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolsApi.md#get_custom_symbol) | **GET** /custom-symbols/{customSymbolId} | Get all custom field and standard field details on a specific custom symbol
*CustomSymbolsApi* | [**get_custom_symbol_records**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolsApi.md#get_custom_symbol_records) | **GET** /custom-symbols/{customSymbolId}/records | Get all notes and meetings where a specific customSymbol was tagged as primary or related identifier
*CustomSymbolsApi* | [**get_custom_symbols**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolsApi.md#get_custom_symbols) | **GET** /custom-symbols | Get list of all custom symbols in your group along with some of their standard field and custom fields data
*CustomSymbolsApi* | [**link_custom_symbol_to_standard_symbol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolsApi.md#link_custom_symbol_to_standard_symbol) | **POST** /custom-symbols/{customSymbolId}/link-standard-symbol | Link custom symbol to standard symbol
*CustomSymbolsApi* | [**patch_custom_symbol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolsApi.md#patch_custom_symbol) | **PATCH** /custom-symbols/{customSymbolId} | Edit a custom symbol’s standard field and custom field data
*CustomSymbolsRelationshipsApi* | [**create_symbol_relationship**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolsRelationshipsApi.md#create_symbol_relationship) | **POST** /symbol-relationships | Create a symbol relationship
*CustomSymbolsRelationshipsApi* | [**delete_symbol_relationship**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolsRelationshipsApi.md#delete_symbol_relationship) | **DELETE** /symbol-relationships/{symbolRelationshipId} | Delete a symbol relationship
*CustomSymbolsRelationshipsApi* | [**edit_and_add_symbol_relationship**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolsRelationshipsApi.md#edit_and_add_symbol_relationship) | **PUT** /symbol-relationships/{symbol} | Edit a symbol relationship
*CustomSymbolsRelationshipsApi* | [**get_symbol_relationship**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolsRelationshipsApi.md#get_symbol_relationship) | **GET** /symbol-relationships/{symbolRelationshipId} | Get details on a specific symbol relationship
*CustomSymbolsRelationshipsApi* | [**get_symbol_relationships**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolsRelationshipsApi.md#get_symbol_relationships) | **GET** /symbol-relationships/{symbolId}/relationships | Returns a list of a symbol’s relationships
*CustomSymbolsRelationshipsApi* | [**get_symbols_relationships**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolsRelationshipsApi.md#get_symbols_relationships) | **GET** /symbol-relationships | Get list of all symbol relationships in your group
*HybridSymbolsApi* | [**create_standard_symbol_metadata**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/HybridSymbolsApi.md#create_standard_symbol_metadata) | **POST** /custom-symbols/standard-symbol-metadata | Create standard symbol metadata
*HybridSymbolsApi* | [**get_standard_symbol_metadata_guid**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/HybridSymbolsApi.md#get_standard_symbol_metadata_guid) | **GET** /custom-symbols/standard-symbol-metadata/{standardSymbol} | Get all custom field and standard field details on a specific standard symbol
*HybridSymbolsApi* | [**patch_standard_symbol**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/HybridSymbolsApi.md#patch_standard_symbol) | **PATCH** /custom-symbols/standard-symbol-metadata/{standardSymbolId} | Edit a standard symbol’s standard field and custom field data


## Documentation For Models

 - [CreateCustomSymbolCustomFieldValueDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CreateCustomSymbolCustomFieldValueDto.md)
 - [CreateCustomSymbolDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CreateCustomSymbolDto.md)
 - [CreateStandardSymbolMetadataDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CreateStandardSymbolMetadataDto.md)
 - [CustomSymbolAddressDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolAddressDto.md)
 - [CustomSymbolContact](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolContact.md)
 - [CustomSymbolCustomFieldValueDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolCustomFieldValueDto.md)
 - [CustomSymbolDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolDto.md)
 - [CustomSymbolSubTypeSummaryDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolSubTypeSummaryDto.md)
 - [CustomSymbolTypeSummaryDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/CustomSymbolTypeSummaryDto.md)
 - [InstrumentDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/InstrumentDto.md)
 - [NewItemDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/NewItemDto.md)
 - [Operation](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/Operation.md)
 - [OperationType](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/OperationType.md)
 - [ProblemDetails](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/ProblemDetails.md)
 - [RecordPreviewDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/RecordPreviewDto.md)
 - [StandardSymbolDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/StandardSymbolDto.md)
 - [SymbolIdNameDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/SymbolIdNameDto.md)
 - [SymbolRelationshipDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/SymbolRelationshipDto.md)
 - [SymbolRelationshipSaveDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/SymbolRelationshipSaveDto.md)
 - [SymbolRelationshipUpdateDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/SymbolRelationshipUpdateDto.md)
 - [SymbolsRelationshipIdNameDto](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/SymbolsRelationshipIdNameDto.md)
 - [SymbolsRelationshipType](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/IRNCustomSymbols/v1/docs/SymbolsRelationshipType.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.IRNCustomSymbols.apis and fds.sdk.IRNCustomSymbols.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.IRNCustomSymbols.api.default_api import DefaultApi`
- `from fds.sdk.IRNCustomSymbols.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.IRNCustomSymbols
from fds.sdk.IRNCustomSymbols.apis import *
from fds.sdk.IRNCustomSymbols.models import *
```

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


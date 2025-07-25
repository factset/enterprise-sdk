[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet Entity client library for Python

[![API Version](https://img.shields.io/badge/api-v1.5.0-blue)]()
[![PyPi](https://img.shields.io/pypi/v/fds.sdk.FactSetEntity/1.2.0)](https://pypi.org/project/fds.sdk.FactSetEntity/v/1.2.0)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Using an entity centric data model, FactSet's Entity API provides access to
FactSet's complete security and entity level symbology, comprehensive entity reference data, and all of the
necessary relationships and connections to create a foundation that tightly correlates disparate sources of
information to a master entity identifier. Use this API to quickly understand the full entity structure and related securities.<p><b>Rate limit is set to 10 requests per second</b>.</p>


This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.5.0
- SDK version: 1.2.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.FactSetEntity==1.2.0
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.FactSetEntity==1.2.0
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

import fds.sdk.FactSetEntity
from fds.sdk.FactSetEntity.api import entity_reference_api
from fds.sdk.FactSetEntity.models import *
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
configuration = fds.sdk.FactSetEntity.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEntity.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEntity.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_reference_api.EntityReferenceApi(api_client)
    ids = ["AAPL-US","0FPWZZ-E","TSLA-US"] # [str] | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 3000 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 

    try:
        # Returns an entity reference profiles for an individual entity
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_entity_references(ids)

        pprint(api_response)
    except fds.sdk.FactSetEntity.ApiException as e:
        print("Exception when calling EntityReferenceApi->get_entity_references: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Returns an entity reference profiles for an individual entity
    #     api_response, http_status_code, response_headers = api_instance.get_entity_references_with_http_info(ids)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.FactSetEntity.ApiException as e:
    #     print("Exception when calling EntityReferenceApi->get_entity_references: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Returns an entity reference profiles for an individual entity
    #     async_result = api_instance.get_entity_references_async(ids)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.FactSetEntity.ApiException as e:
    #     print("Exception when calling EntityReferenceApi->get_entity_references: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Returns an entity reference profiles for an individual entity
    #     async_result = api_instance.get_entity_references_with_http_info_async(ids)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.FactSetEntity.ApiException as e:
    #     print("Exception when calling EntityReferenceApi->get_entity_references: %s\n" % e)

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
import fds.sdk.FactSetEntity

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.FactSetEntity.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.FactSetEntity

configuration = fds.sdk.FactSetEntity.Configuration(
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
import fds.sdk.FactSetEntity

configuration = fds.sdk.FactSetEntity.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```

### Request Retries

In case the request retry behaviour should be customized, it is possible to pass a `urllib3.Retry` object to the `retry` property of the Configuration.

```python
from urllib3 import Retry
import fds.sdk.FactSetEntity

configuration = fds.sdk.FactSetEntity.Configuration(
    # ...
)

configuration.retries = Retry(total=3, status_forcelist=[500, 502, 503, 504])
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/content*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EntityReferenceApi* | [**get_entity_references**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityReferenceApi.md#get_entity_references) | **GET** /factset-entity/v1/entity-references | Returns an entity reference profiles for an individual entity
*EntityReferenceApi* | [**post_entity_references**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityReferenceApi.md#post_entity_references) | **POST** /factset-entity/v1/entity-references | Returns an entity reference data for a list of ids.
*EntityReferenceChineseApi* | [**get_entity_reference_chi**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityReferenceChineseApi.md#get_entity_reference_chi) | **GET** /factset-entity/v1/entity-reference-chi | Returns entity reference data in Chinese for an individual entity.
*EntityReferenceChineseApi* | [**get_entity_reference_chi_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityReferenceChineseApi.md#get_entity_reference_chi_for_list) | **POST** /factset-entity/v1/entity-reference-chi | Returns entity reference data in Chinese for an individual entity.
*EntitySecuritiesApi* | [**get_entity_securities**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntitySecuritiesApi.md#get_entity_securities) | **GET** /factset-entity/v1/entity-securities | Returns all Equity Exchange Listings and all debt instruments issued for the requested entity.
*EntitySecuritiesApi* | [**post_entity_securities**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntitySecuritiesApi.md#post_entity_securities) | **POST** /factset-entity/v1/entity-securities | Returns all Equity Exchange Listings and all debt instruments issued for the requested entity.
*EntityStructureApi* | [**get_entity_structure**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityStructureApi.md#get_entity_structure) | **GET** /factset-entity/v1/entity-structures | Returns all active or inactive entities and respective levels below the requested entity id.
*EntityStructureApi* | [**get_ultimate_entity_structure**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityStructureApi.md#get_ultimate_entity_structure) | **GET** /factset-entity/v1/ultimate-entity-structures | Returns the full ultimate parent entity hiearachy. Control levels and active status of underlying entities.
*EntityStructureApi* | [**post_entity_structure**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityStructureApi.md#post_entity_structure) | **POST** /factset-entity/v1/entity-structures | Returns all active or inactive entities below the requested entity id.
*EntityStructureApi* | [**post_ultimate_entity_structure**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityStructureApi.md#post_ultimate_entity_structure) | **POST** /factset-entity/v1/ultimate-entity-structures | Returns all active or inactive entities and respective levels below the requested entity id.
*HistoricalCreditParentApi* | [**get_hist_cred_parent**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/HistoricalCreditParentApi.md#get_hist_cred_parent) | **GET** /factset-entity/v1/hist-credit-parent | Returns historical credit parents for the requested id(s).
*HistoricalCreditParentApi* | [**post_hist_cred_parent**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/HistoricalCreditParentApi.md#post_hist_cred_parent) | **POST** /factset-entity/v1/hist-credit-parent | Returns historical credit parents for the requested id(s).


## Documentation For Models

 - [Active](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/Active.md)
 - [CreditParent](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/CreditParent.md)
 - [CreditParentRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/CreditParentRequest.md)
 - [CreditParentResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/CreditParentResponse.md)
 - [EntityReference](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityReference.md)
 - [EntityReferenceChi](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityReferenceChi.md)
 - [EntityReferenceChiRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityReferenceChiRequest.md)
 - [EntityReferenceChiResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityReferenceChiResponse.md)
 - [EntityReferenceRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityReferenceRequest.md)
 - [EntityReferenceResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityReferenceResponse.md)
 - [EntitySecurities](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntitySecurities.md)
 - [EntitySecuritiesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntitySecuritiesRequest.md)
 - [EntitySecuritiesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntitySecuritiesResponse.md)
 - [EntityStructure](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityStructure.md)
 - [EntityStructureRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityStructureRequest.md)
 - [EntityStructureResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/EntityStructureResponse.md)
 - [ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/ErrorResponse.md)
 - [ErrorResponseSubErrors](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/ErrorResponseSubErrors.md)
 - [HcpIds](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/HcpIds.md)
 - [Ids](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/Ids.md)
 - [IdsChi](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/IdsChi.md)
 - [SecurityType](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/SecurityType.md)
 - [StructureIds](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/StructureIds.md)
 - [UltimateEntityStructureRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/UltimateEntityStructureRequest.md)
 - [UltimateEntityStructureResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/UltimateEntityStructureResponse.md)
 - [UtlimateEntityStructure](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetEntity/v1/docs/UtlimateEntityStructure.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.FactSetEntity.apis and fds.sdk.FactSetEntity.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.FactSetEntity.api.default_api import DefaultApi`
- `from fds.sdk.FactSetEntity.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.FactSetEntity
from fds.sdk.FactSetEntity.apis import *
from fds.sdk.FactSetEntity.models import *
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


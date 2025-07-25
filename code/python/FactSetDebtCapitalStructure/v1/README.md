[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet Debt Capital Structure client library for Python

[![API Version](https://img.shields.io/badge/api-v1.0.0-blue)](https://developer.factset.com/api-catalog/factset-dcs-api)
[![PyPi](https://img.shields.io/pypi/v/fds.sdk.FactSetDebtCapitalStructure/1.0.1)](https://pypi.org/project/fds.sdk.FactSetDebtCapitalStructure/v/1.0.1)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The FactSet Debt Capital Structure API offers insights into public and private company debt financing for 69,000+ entities globally. Analyze at the individual-instrument level through summary and detailed information of the debt structure with history available back through 2006. Instrument types covered include Revolving Credit, Term Loans, Notes, and Bonds. 

**How to Programmatically Download API Specification file:**

Please use the below link to download the FactSet Debt Capital Structure API Specification file in .yaml. You must be authorized for this API to extract. This specification can then be used for Codegen to create your own SDKs. You can also access by selecting the \"Download Spec\" button to the right of the version below.

[https://api.factset.com/content/factset-dcs/v1/spec/swagger.yaml](https://api.factset.com/content/factset-dcs/v1/spec/swagger.yaml)

This API is rate-limited to 10 requests per second and 10 concurrent requests per user.


This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- SDK version: 1.0.1
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.FactSetDebtCapitalStructure==1.0.1
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.FactSetDebtCapitalStructure==1.0.1
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

import fds.sdk.FactSetDebtCapitalStructure
from fds.sdk.FactSetDebtCapitalStructure.api import reference_api
from fds.sdk.FactSetDebtCapitalStructure.models import *
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
configuration = fds.sdk.FactSetDebtCapitalStructure.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetDebtCapitalStructure.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetDebtCapitalStructure.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = reference_api.ReferenceApi(api_client)
    details_request = DetailsRequest(
        data=DetailsRequestBody(
            ids=Ids(["FDS-US"]),
            periodicity=Periodicity("QTR"),
            date=dateutil_parser('Fri Dec 01 00:00:00 UTC 2017').date(),
        ),
    ) # DetailsRequest | Request object for `Details`.

    try:
        # Returns debt instruments for a list of companies.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_details_list(details_request)

        pprint(api_response)
    except fds.sdk.FactSetDebtCapitalStructure.ApiException as e:
        print("Exception when calling ReferenceApi->get_details_list: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Returns debt instruments for a list of companies.
    #     api_response, http_status_code, response_headers = api_instance.get_details_list_with_http_info(details_request)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.FactSetDebtCapitalStructure.ApiException as e:
    #     print("Exception when calling ReferenceApi->get_details_list: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Returns debt instruments for a list of companies.
    #     async_result = api_instance.get_details_list_async(details_request)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.FactSetDebtCapitalStructure.ApiException as e:
    #     print("Exception when calling ReferenceApi->get_details_list: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Returns debt instruments for a list of companies.
    #     async_result = api_instance.get_details_list_with_http_info_async(details_request)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.FactSetDebtCapitalStructure.ApiException as e:
    #     print("Exception when calling ReferenceApi->get_details_list: %s\n" % e)

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
import fds.sdk.FactSetDebtCapitalStructure

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.FactSetDebtCapitalStructure.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.FactSetDebtCapitalStructure

configuration = fds.sdk.FactSetDebtCapitalStructure.Configuration(
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
import fds.sdk.FactSetDebtCapitalStructure

configuration = fds.sdk.FactSetDebtCapitalStructure.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```

### Request Retries

In case the request retry behaviour should be customized, it is possible to pass a `urllib3.Retry` object to the `retry` property of the Configuration.

```python
from urllib3 import Retry
import fds.sdk.FactSetDebtCapitalStructure

configuration = fds.sdk.FactSetDebtCapitalStructure.Configuration(
    # ...
)

configuration.retries = Retry(total=3, status_forcelist=[500, 502, 503, 504])
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/content/factset-dcs/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ReferenceApi* | [**get_details_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetDebtCapitalStructure/v1/docs/ReferenceApi.md#get_details_list) | **POST** /details | Returns debt instruments for a list of companies.
*ReferenceApi* | [**get_interim_details_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetDebtCapitalStructure/v1/docs/ReferenceApi.md#get_interim_details_list) | **POST** /details-interim | Returns most recently available debt instrument data for a list of companies.


## Documentation For Models

 - [Detail](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetDebtCapitalStructure/v1/docs/Detail.md)
 - [DetailsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetDebtCapitalStructure/v1/docs/DetailsRequest.md)
 - [DetailsRequestBody](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetDebtCapitalStructure/v1/docs/DetailsRequestBody.md)
 - [DetailsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetDebtCapitalStructure/v1/docs/DetailsResponse.md)
 - [ErrorObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetDebtCapitalStructure/v1/docs/ErrorObject.md)
 - [ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetDebtCapitalStructure/v1/docs/ErrorResponse.md)
 - [Ids](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetDebtCapitalStructure/v1/docs/Ids.md)
 - [InterimDetailsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetDebtCapitalStructure/v1/docs/InterimDetailsRequest.md)
 - [InterimDetailsRequestBody](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetDebtCapitalStructure/v1/docs/InterimDetailsRequestBody.md)
 - [Periodicity](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetDebtCapitalStructure/v1/docs/Periodicity.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.FactSetDebtCapitalStructure.apis and fds.sdk.FactSetDebtCapitalStructure.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.FactSetDebtCapitalStructure.api.default_api import DefaultApi`
- `from fds.sdk.FactSetDebtCapitalStructure.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.FactSetDebtCapitalStructure
from fds.sdk.FactSetDebtCapitalStructure.apis import *
from fds.sdk.FactSetDebtCapitalStructure.models import *
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


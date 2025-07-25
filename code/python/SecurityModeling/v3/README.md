[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Security Modeling client library for Python

[![API Version](https://img.shields.io/badge/api-v3-blue)](https://developer.factset.com/api-catalog/)
[![PyPi](https://img.shields.io/pypi/v/fds.sdk.SecurityModeling/0.20.16)](https://pypi.org/project/fds.sdk.SecurityModeling/v/0.20.16)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Allow clients to fetch Analytics through APIs.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 3
- SDK version: 0.20.16
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.SecurityModeling==0.20.16
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.SecurityModeling==0.20.16
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

import fds.sdk.SecurityModeling
from fds.sdk.SecurityModeling.api import security_modeling_api
from fds.sdk.SecurityModeling.models import *
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
configuration = fds.sdk.SecurityModeling.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecurityModeling.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecurityModeling.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = security_modeling_api.SecurityModelingApi(api_client)
    sm_delete_parameters_root = SMDeleteParametersRoot(
        data=[
            SMDeleteParameters(
                security_name="security_name_example",
                location="location_example",
                asofdate="asofdate_example",
                security_type="Bond",
            ),
        ],
        meta={},
    ) # SMDeleteParametersRoot |  (optional)

    try:
        # Delete existing securities
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.delete_securities(sm_delete_parameters_root=sm_delete_parameters_root)

        pprint(api_response)
    except fds.sdk.SecurityModeling.ApiException as e:
        print("Exception when calling SecurityModelingApi->delete_securities: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Delete existing securities
    #     api_response, http_status_code, response_headers = api_instance.delete_securities_with_http_info(sm_delete_parameters_root=sm_delete_parameters_root)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.SecurityModeling.ApiException as e:
    #     print("Exception when calling SecurityModelingApi->delete_securities: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Delete existing securities
    #     async_result = api_instance.delete_securities_async(sm_delete_parameters_root=sm_delete_parameters_root)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.SecurityModeling.ApiException as e:
    #     print("Exception when calling SecurityModelingApi->delete_securities: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Delete existing securities
    #     async_result = api_instance.delete_securities_with_http_info_async(sm_delete_parameters_root=sm_delete_parameters_root)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.SecurityModeling.ApiException as e:
    #     print("Exception when calling SecurityModelingApi->delete_securities: %s\n" % e)

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
import fds.sdk.SecurityModeling

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.SecurityModeling.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.SecurityModeling

configuration = fds.sdk.SecurityModeling.Configuration(
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
import fds.sdk.SecurityModeling

configuration = fds.sdk.SecurityModeling.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```

### Request Retries

In case the request retry behaviour should be customized, it is possible to pass a `urllib3.Retry` object to the `retry` property of the Configuration.

```python
from urllib3 import Retry
import fds.sdk.SecurityModeling

configuration = fds.sdk.SecurityModeling.Configuration(
    # ...
)

configuration.retries = Retry(total=3, status_forcelist=[500, 502, 503, 504])
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SecurityModelingApi* | [**delete_securities**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SecurityModelingApi.md#delete_securities) | **POST** /analytics/security-modeling/v3/securities/delete | Delete existing securities
*SecurityModelingApi* | [**get_securities**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SecurityModelingApi.md#get_securities) | **POST** /analytics/security-modeling/v3/securities/retrieve | Get existing securities
*SecurityModelingApi* | [**upsert_securities**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SecurityModelingApi.md#upsert_securities) | **POST** /analytics/security-modeling/v3/securities/upsert | Create or update securities


## Documentation For Models

 - [OneOfFieldsFields](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/OneOfFieldsFields.md)
 - [OneOfSMFields](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/OneOfSMFields.md)
 - [SMBondFields](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMBondFields.md)
 - [SMCreateParameters](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMCreateParameters.md)
 - [SMCreateParametersRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMCreateParametersRoot.md)
 - [SMCreateResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMCreateResponse.md)
 - [SMCreateResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMCreateResponseRoot.md)
 - [SMCustomCashFlowFields](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMCustomCashFlowFields.md)
 - [SMDeleteParameters](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMDeleteParameters.md)
 - [SMDeleteParametersRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMDeleteParametersRoot.md)
 - [SMDeleteResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMDeleteResponse.md)
 - [SMDeleteResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMDeleteResponseRoot.md)
 - [SMError](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMError.md)
 - [SMFields](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMFields.md)
 - [SMRetrieveParameters](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMRetrieveParameters.md)
 - [SMRetrieveParametersRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMRetrieveParametersRoot.md)
 - [SMRetrieveResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMRetrieveResponse.md)
 - [SMRetrieveResponseRoot](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMRetrieveResponseRoot.md)
 - [SMWarning](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/SecurityModeling/v3/docs/SMWarning.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.SecurityModeling.apis and fds.sdk.SecurityModeling.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.SecurityModeling.api.default_api import DefaultApi`
- `from fds.sdk.SecurityModeling.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.SecurityModeling
from fds.sdk.SecurityModeling.apis import *
from fds.sdk.SecurityModeling.models import *
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


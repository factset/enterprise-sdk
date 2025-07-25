[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Market Intelligence client library for Python

[![API Version](https://img.shields.io/badge/api-v1.0-blue)]()
[![PyPi](https://img.shields.io/pypi/v/fds.sdk.MarketIntelligence/0.21.14)](https://pypi.org/project/fds.sdk.MarketIntelligence/v/0.21.14)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Through the Market Intelligence API, stay up to date on the companies and sectors you care most about with ease. Request the templates you have made in Market Intelligence to receive news and data on your portfolio.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0
- SDK version: 0.21.14
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.MarketIntelligence==0.21.14
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.MarketIntelligence==0.21.14
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

import fds.sdk.MarketIntelligence
from fds.sdk.MarketIntelligence.api import create_report_api
from fds.sdk.MarketIntelligence.models import *
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
configuration = fds.sdk.MarketIntelligence.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.MarketIntelligence.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.MarketIntelligence.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = create_report_api.CreateReportApi(api_client)
    miapi_post_request = MIAPIPostRequest(
        report_name="Morning Portfolio Update",
        identifier="OEX",
        id_type="B",
        time_zone="EST5EDT",
        content=[
            PostRequestExample(
                section_id="top_news",
                filters="["MI_MARKET_SYNOPSIS","MI_TOP_STORIES","MI_ECONOMIC_CALENDAR","MI_WEB_STORIES"]",
            ),
        ],
    ) # MIAPIPostRequest | 

    try:
        # Create new report templates including portfolio or market news and data.
        # example passing only required values which don't have defaults set
        api_response = api_instance.create_post(miapi_post_request)

        pprint(api_response)
    except fds.sdk.MarketIntelligence.ApiException as e:
        print("Exception when calling CreateReportApi->create_post: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Create new report templates including portfolio or market news and data.
    #     api_response, http_status_code, response_headers = api_instance.create_post_with_http_info(miapi_post_request)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.MarketIntelligence.ApiException as e:
    #     print("Exception when calling CreateReportApi->create_post: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Create new report templates including portfolio or market news and data.
    #     async_result = api_instance.create_post_async(miapi_post_request)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.MarketIntelligence.ApiException as e:
    #     print("Exception when calling CreateReportApi->create_post: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Create new report templates including portfolio or market news and data.
    #     async_result = api_instance.create_post_with_http_info_async(miapi_post_request)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.MarketIntelligence.ApiException as e:
    #     print("Exception when calling CreateReportApi->create_post: %s\n" % e)

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
import fds.sdk.MarketIntelligence

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.MarketIntelligence.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.MarketIntelligence

configuration = fds.sdk.MarketIntelligence.Configuration(
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
import fds.sdk.MarketIntelligence

configuration = fds.sdk.MarketIntelligence.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```

### Request Retries

In case the request retry behaviour should be customized, it is possible to pass a `urllib3.Retry` object to the `retry` property of the Configuration.

```python
from urllib3 import Retry
import fds.sdk.MarketIntelligence

configuration = fds.sdk.MarketIntelligence.Configuration(
    # ...
)

configuration.retries = Retry(total=3, status_forcelist=[500, 502, 503, 504])
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/market-intelligence*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CreateReportApi* | [**create_post**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/MarketIntelligence/v1/docs/CreateReportApi.md#create_post) | **POST** /create | Create new report templates including portfolio or market news and data.
*RetrieveRefreshedDataApi* | [**get_data_poll_id_result_get**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/MarketIntelligence/v1/docs/RetrieveRefreshedDataApi.md#get_data_poll_id_result_get) | **GET** /get-data/{poll_id}/result | Retrieve data for desired report.
*RetrieveRefreshedReportApi* | [**get_data_report_id_get**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/MarketIntelligence/v1/docs/RetrieveRefreshedReportApi.md#get_data_report_id_get) | **GET** /get-data/{report_id} | Retrieve data for desired report.
*RetrieveReportListApi* | [**get_reports_get**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/MarketIntelligence/v1/docs/RetrieveReportListApi.md#get_reports_get) | **GET** /get-reports | Retrieve a list of previously created reports and associated report metadata.


## Documentation For Models

 - [FetchReportPollID](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/MarketIntelligence/v1/docs/FetchReportPollID.md)
 - [GetReportInfo](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/MarketIntelligence/v1/docs/GetReportInfo.md)
 - [MIAPIPostRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/MarketIntelligence/v1/docs/MIAPIPostRequest.md)
 - [PostRequestExample](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/MarketIntelligence/v1/docs/PostRequestExample.md)
 - [PostResponseInfo](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/MarketIntelligence/v1/docs/PostResponseInfo.md)
 - [ReportContent](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/MarketIntelligence/v1/docs/ReportContent.md)
 - [ReportDataHeader](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/MarketIntelligence/v1/docs/ReportDataHeader.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.MarketIntelligence.apis and fds.sdk.MarketIntelligence.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.MarketIntelligence.api.default_api import DefaultApi`
- `from fds.sdk.MarketIntelligence.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.MarketIntelligence
from fds.sdk.MarketIntelligence.apis import *
from fds.sdk.MarketIntelligence.models import *
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


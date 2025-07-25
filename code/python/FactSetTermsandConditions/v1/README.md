[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet Terms and Conditions client library for Python

[![API Version](https://img.shields.io/badge/api-v1.0.0-blue)]()
[![PyPi](https://img.shields.io/pypi/v/fds.sdk.FactSetTermsandConditions/1.0.13)](https://pypi.org/project/fds.sdk.FactSetTermsandConditions/v/1.0.13)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues.


This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- SDK version: 1.0.13
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

For more information, please visit [http://www.factset.com/api](http://www.factset.com/api)

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.FactSetTermsandConditions==1.0.13
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.FactSetTermsandConditions==1.0.13
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

import fds.sdk.FactSetTermsandConditions
from fds.sdk.FactSetTermsandConditions.api import agents_api
from fds.sdk.FactSetTermsandConditions.models import *
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
configuration = fds.sdk.FactSetTermsandConditions.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetTermsandConditions.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTermsandConditions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = agents_api.AgentsApi(api_client)
    ids = ["30231GBJ","88579EAA"] # [str] | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 

    try:
        # Return Agents items for a Fixed Income security.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_agents(ids)

        pprint(api_response)
    except fds.sdk.FactSetTermsandConditions.ApiException as e:
        print("Exception when calling AgentsApi->get_agents: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Return Agents items for a Fixed Income security.
    #     api_response, http_status_code, response_headers = api_instance.get_agents_with_http_info(ids)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.FactSetTermsandConditions.ApiException as e:
    #     print("Exception when calling AgentsApi->get_agents: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Return Agents items for a Fixed Income security.
    #     async_result = api_instance.get_agents_async(ids)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.FactSetTermsandConditions.ApiException as e:
    #     print("Exception when calling AgentsApi->get_agents: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Return Agents items for a Fixed Income security.
    #     async_result = api_instance.get_agents_with_http_info_async(ids)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.FactSetTermsandConditions.ApiException as e:
    #     print("Exception when calling AgentsApi->get_agents: %s\n" % e)

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
import fds.sdk.FactSetTermsandConditions

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.FactSetTermsandConditions.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.FactSetTermsandConditions

configuration = fds.sdk.FactSetTermsandConditions.Configuration(
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
import fds.sdk.FactSetTermsandConditions

configuration = fds.sdk.FactSetTermsandConditions.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```

### Request Retries

In case the request retry behaviour should be customized, it is possible to pass a `urllib3.Retry` object to the `retry` property of the Configuration.

```python
from urllib3 import Retry
import fds.sdk.FactSetTermsandConditions

configuration = fds.sdk.FactSetTermsandConditions.Configuration(
    # ...
)

configuration.retries = Retry(total=3, status_forcelist=[500, 502, 503, 504])
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/content*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AgentsApi* | [**get_agents**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/AgentsApi.md#get_agents) | **GET** /factset-terms-and-conditions/v1/agents | Return Agents items for a Fixed Income security.
*AgentsApi* | [**get_agents_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/AgentsApi.md#get_agents_for_list) | **POST** /factset-terms-and-conditions/v1/agents | Return Agents items for a list of Fixed Income securities.
*ConvertiblesApi* | [**get_convertible_details**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ConvertiblesApi.md#get_convertible_details) | **GET** /factset-terms-and-conditions/v1/convertible-details | Return Convertible Details for a list of Convertible Fixed Income securities.
*ConvertiblesApi* | [**get_convertible_details_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ConvertiblesApi.md#get_convertible_details_for_list) | **POST** /factset-terms-and-conditions/v1/convertible-details | Return Convertible Details data for a large list of Fixed Income securities.
*ConvertiblesApi* | [**get_convertible_history**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ConvertiblesApi.md#get_convertible_history) | **GET** /factset-terms-and-conditions/v1/convertible-history | Return Convertible History data for a list of Fixed Income securities.
*ConvertiblesApi* | [**get_convertible_history_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ConvertiblesApi.md#get_convertible_history_for_list) | **POST** /factset-terms-and-conditions/v1/convertible-history | Return Convertible History data for a large list of Fixed Income securities.
*ConvertiblesApi* | [**get_convertible_triggers**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ConvertiblesApi.md#get_convertible_triggers) | **GET** /factset-terms-and-conditions/v1/convertible-triggers | Return Convertible Triggers data for a list of Fixed Income securities.
*ConvertiblesApi* | [**get_convertible_triggers_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ConvertiblesApi.md#get_convertible_triggers_for_list) | **POST** /factset-terms-and-conditions/v1/convertible-triggers | Return Convertible Trigger data for a large list of Fixed Income securities.
*CouponsApi* | [**get_coupon_history**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/CouponsApi.md#get_coupon_history) | **GET** /factset-terms-and-conditions/v1/coupon-history | Return historical Coupon information for a Fixed Income security.
*CouponsApi* | [**get_coupon_history_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/CouponsApi.md#get_coupon_history_for_list) | **POST** /factset-terms-and-conditions/v1/coupon-history | Return historical Coupon information for a list of Fixed Income securities.
*CouponsApi* | [**get_coupon_schedules**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/CouponsApi.md#get_coupon_schedules) | **GET** /factset-terms-and-conditions/v1/coupon-schedules | Return Coupon Sechedules for a Fixed Income security.
*CouponsApi* | [**get_coupon_schedules_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/CouponsApi.md#get_coupon_schedules_for_list) | **POST** /factset-terms-and-conditions/v1/coupon-schedules | Return Coupon Schedules information for a list of Fixed Income securities.
*CovenantsApi* | [**get_covenant_details**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/CovenantsApi.md#get_covenant_details) | **GET** /factset-terms-and-conditions/v1/covenant-details | Return Covenant Details for a Fixed Income security.
*CovenantsApi* | [**get_covenant_details_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/CovenantsApi.md#get_covenant_details_for_list) | **POST** /factset-terms-and-conditions/v1/covenant-details | Return Covenant Details for a list of Fixed Income securities.
*IssueSizeApi* | [**get_issue_size**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/IssueSizeApi.md#get_issue_size) | **GET** /factset-terms-and-conditions/v1/issue-size | Return Issue Size data for a list of Fixed Income securities.
*IssueSizeApi* | [**get_issue_size_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/IssueSizeApi.md#get_issue_size_for_list) | **POST** /factset-terms-and-conditions/v1/issue-size | Return Issue Size data for a large list of Fixed Income securities.
*RedemptionsApi* | [**get_fixed_income_redemption_prices**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/RedemptionsApi.md#get_fixed_income_redemption_prices) | **GET** /factset-terms-and-conditions/v1/redemption-prices | Return Redemption Prices for a Fixed Income security.
*RedemptionsApi* | [**get_fixed_income_redemption_prices_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/RedemptionsApi.md#get_fixed_income_redemption_prices_for_list) | **POST** /factset-terms-and-conditions/v1/redemption-prices | Return Redemption Prices for a list of Fixed Income securities.
*TermsConditionsApi* | [**get_terms_and_conditions**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/TermsConditionsApi.md#get_terms_and_conditions) | **GET** /factset-terms-and-conditions/v1/terms-and-conditions | Return select Terms and Conditions items for a Fixed Income security.
*TermsConditionsApi* | [**get_terms_and_conditions_fields**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/TermsConditionsApi.md#get_terms_and_conditions_fields) | **GET** /factset-terms-and-conditions/v1/fields | Available fields for /terms-and-conditions endpoint
*TermsConditionsApi* | [**get_terms_and_conditions_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/TermsConditionsApi.md#get_terms_and_conditions_for_list) | **POST** /factset-terms-and-conditions/v1/terms-and-conditions | Return Terms and Conditions for a list of Fixed Income securities.
*UnderwritersApi* | [**get_lead_underwriters**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/UnderwritersApi.md#get_lead_underwriters) | **GET** /factset-terms-and-conditions/v1/lead-underwriters | Return Lead Underwriters for a Fixed Income security.
*UnderwritersApi* | [**get_lead_underwriters_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/UnderwritersApi.md#get_lead_underwriters_for_list) | **POST** /factset-terms-and-conditions/v1/lead-underwriters | Return Lead Underwriters for a list of Fixed Income securities.
*UseOfProceedsApi* | [**get_fixed_income_use_of_proceeds**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/UseOfProceedsApi.md#get_fixed_income_use_of_proceeds) | **GET** /factset-terms-and-conditions/v1/use-of-proceeds | Return Use of Proceeds for a Fixed Income security.
*UseOfProceedsApi* | [**get_fixed_income_use_of_proceeds_for_list**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/UseOfProceedsApi.md#get_fixed_income_use_of_proceeds_for_list) | **POST** /factset-terms-and-conditions/v1/use-of-proceeds | Return Use of Proceeds for a list of Fixed Income securities.


## Documentation For Models

 - [Agent](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/Agent.md)
 - [AgentsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/AgentsResponse.md)
 - [ConvertibleDetails](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ConvertibleDetails.md)
 - [ConvertibleDetailsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ConvertibleDetailsResponse.md)
 - [ConvertibleHistory](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ConvertibleHistory.md)
 - [ConvertibleHistoryResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ConvertibleHistoryResponse.md)
 - [ConvertibleTriggers](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ConvertibleTriggers.md)
 - [ConvertibleTriggersResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ConvertibleTriggersResponse.md)
 - [CouponHistory](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/CouponHistory.md)
 - [CouponHistoryResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/CouponHistoryResponse.md)
 - [CouponSchedules](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/CouponSchedules.md)
 - [CouponSchedulesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/CouponSchedulesResponse.md)
 - [CovenantDetail](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/CovenantDetail.md)
 - [CovenantDetailsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/CovenantDetailsResponse.md)
 - [ErrorResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ErrorResponse.md)
 - [ErrorResponseSubErrors](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/ErrorResponseSubErrors.md)
 - [Field](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/Field.md)
 - [FieldsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/FieldsResponse.md)
 - [IssueSize](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/IssueSize.md)
 - [IssueSizeResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/IssueSizeResponse.md)
 - [LeadUnderwriter](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/LeadUnderwriter.md)
 - [LeadUnderwritersResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/LeadUnderwritersResponse.md)
 - [NegativeCovenant](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/NegativeCovenant.md)
 - [NegativeCovenantsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/NegativeCovenantsResponse.md)
 - [RedemptionPrice](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/RedemptionPrice.md)
 - [RedemptionPricesRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/RedemptionPricesRequest.md)
 - [RedemptionPricesResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/RedemptionPricesResponse.md)
 - [TermsAndConditions](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/TermsAndConditions.md)
 - [TermsAndConditionsRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/TermsAndConditionsRequest.md)
 - [TermsAndConditionsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/TermsAndConditionsResponse.md)
 - [TermsAndConditionsScalarRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/TermsAndConditionsScalarRequest.md)
 - [UseOfProceeds](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/UseOfProceeds.md)
 - [UseOfProceedsResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetTermsandConditions/v1/docs/UseOfProceedsResponse.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.FactSetTermsandConditions.apis and fds.sdk.FactSetTermsandConditions.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.FactSetTermsandConditions.api.default_api import DefaultApi`
- `from fds.sdk.FactSetTermsandConditions.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.FactSetTermsandConditions
from fds.sdk.FactSetTermsandConditions.apis import *
from fds.sdk.FactSetTermsandConditions.models import *
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


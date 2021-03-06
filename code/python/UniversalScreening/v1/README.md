<img alt="FactSet" src="https://www.factset.com/hubfs/Assets/images/factset-logo.svg" height="56" width="290">

# Universal Screening client library for Python

[![PyPi](https://img.shields.io/pypi/v/fds.sdk.UniversalScreening)](https://pypi.org/project/fds.sdk.UniversalScreening/)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application.
Calculate and return the results of your saved Universal Screens.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.0.1
- Package version: 0.20.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

## Requirements

* Python >= 3.6

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.UniversalScreening
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.UniversalScreening
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Python environment.
   1. Install and activate python 3.6+. If you're using [pyenv](https://github.com/pyenv/pyenv):

      ```sh
      pyenv install 3.9.7
      pyenv shell 3.9.7
      ```

   2. (optional) [Install poetry](https://python-poetry.org/docs/#installation).
3. [Install dependencies](#installation).
4. Run the following:

```python

from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.api import default_api
from fds.sdk.UniversalScreening.model.error_array import ErrorArray
from fds.sdk.UniversalScreening.model.inline_response200 import InlineResponse200
from fds.sdk.UniversalScreening.model.resource_status_response import ResourceStatusResponse
from fds.sdk.UniversalScreening.model.screen_archive_ofdb_parameters import ScreenArchiveOFDBParameters
from fds.sdk.UniversalScreening.model.screen_calc_parameters import ScreenCalcParameters
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.UniversalScreening.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.UniversalScreening.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.UniversalScreening.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = default_api.DefaultApi(api_client)
    id = "id_example" # str | Unique identifier for a screen calculation job

    # Get response
    try:
        api_instance.delete_active_job(id)    except fds.sdk.UniversalScreening.ApiException as e:
        print("Exception when calling DefaultApi->delete_active_job: %s\n" % e)

    # Get response, http status code and response headers
    # try:
    #     api_response, http_status_code, response_headers = api_instance.delete_active_job_with_http_info(id)    # except fds.sdk.UniversalScreening.ApiException as e:
    #     print("Exception when calling DefaultApi->delete_active_job: %s\n" % e)

    # Get response asynchronous
    # try:
    #     async_result = api_instance.delete_active_job_async(id)    # except fds.sdk.UniversalScreening.ApiException as e:
    #     print("Exception when calling DefaultApi->delete_active_job: %s\n" % e)

    # Get response, http status code and response headers asynchronous
    # try:
    #     async_result = api_instance.delete_active_job_with_http_info_async(id)    # except fds.sdk.UniversalScreening.ApiException as e:
    #     print("Exception when calling DefaultApi->delete_active_job: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**delete_active_job**](docs/DefaultApi.md#delete_active_job) | **DELETE** /v1/calculations/{id} | 
*DefaultApi* | [**delete_all_active_jobs**](docs/DefaultApi.md#delete_all_active_jobs) | **DELETE** /v1/calculations | 
*DefaultApi* | [**get_all_active_jobs**](docs/DefaultApi.md#get_all_active_jobs) | **GET** /v1/calculations | 
*DefaultApi* | [**get_calculate_results**](docs/DefaultApi.md#get_calculate_results) | **GET** /v1/calculations/{id} | 
*DefaultApi* | [**poll_archive_ofdb**](docs/DefaultApi.md#poll_archive_ofdb) | **GET** /v1/archive/{id}/status | 
*DefaultApi* | [**poll_calculate**](docs/DefaultApi.md#poll_calculate) | **GET** /v1/calculations/{id}/status | 
*DefaultApi* | [**submit_archive_ofdb**](docs/DefaultApi.md#submit_archive_ofdb) | **POST** /v1/archive | 
*DefaultApi* | [**submit_calculate**](docs/DefaultApi.md#submit_calculate) | **POST** /v1/calculations | 


## Documentation For Models

 - [ErrorArray](docs/ErrorArray.md)
 - [ErrorCode](docs/ErrorCode.md)
 - [ErrorObject](docs/ErrorObject.md)
 - [ForErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo](docs/ForErrorsAndWarningsFoundInScreensContainsTheParamIDTheErrorWarningBelongsTo.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse200Data](docs/InlineResponse200Data.md)
 - [PaginationResponse](docs/PaginationResponse.md)
 - [ResourceStatusResponse](docs/ResourceStatusResponse.md)
 - [ResourceStatusResponseData](docs/ResourceStatusResponseData.md)
 - [ResultsMetadata](docs/ResultsMetadata.md)
 - [ScreenArchiveOFDBParameters](docs/ScreenArchiveOFDBParameters.md)
 - [ScreenArchiveOFDBParametersData](docs/ScreenArchiveOFDBParametersData.md)
 - [ScreenArchiveOFDBParametersDataArchiveOptions](docs/ScreenArchiveOFDBParametersDataArchiveOptions.md)
 - [ScreenCalcParameters](docs/ScreenCalcParameters.md)
 - [ScreenCalcParametersData](docs/ScreenCalcParametersData.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.UniversalScreening.apis and fds.sdk.UniversalScreening.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.UniversalScreening.api.default_api import DefaultApi`
- `from fds.sdk.UniversalScreening.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.UniversalScreening
from fds.sdk.UniversalScreening.apis import *
from fds.sdk.UniversalScreening.models import *
```

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


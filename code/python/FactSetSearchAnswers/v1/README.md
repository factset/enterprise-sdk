[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# FactSet Search Answers client library for Python

[![API Version](https://img.shields.io/badge/api-v1.1.0-blue)](https://developer.factset.com/api-catalog/factset-search-answers)
[![PyPi](https://img.shields.io/pypi/v/fds.sdk.FactSetSearchAnswers/1.1.7)](https://pypi.org/project/fds.sdk.FactSetSearchAnswers/v/1.1.7)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.1.0
- SDK version: 1.1.7
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.FactSetSearchAnswers==1.1.7
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.FactSetSearchAnswers==1.1.7
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

import fds.sdk.FactSetSearchAnswers
from fds.sdk.FactSetSearchAnswers.api import answers_api
from fds.sdk.FactSetSearchAnswers.models import *
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
configuration = fds.sdk.FactSetSearchAnswers.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetSearchAnswers.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetSearchAnswers.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = answers_api.AnswersApi(api_client)
    query = "query_example" # str | Query for desired answer (e.g., \"fds price\")
    include_thumbnail = False # bool | Includes thumbnail of Adaptive Card in response (optional) if omitted the server will use the default value of False
    disable_no_answer_responses = True # bool | Disables no-result answer responses (no-results and answer without data) (optional) if omitted the server will use the default value of True
    theme = "Light" # str | Theme for desired answer (e.g., \"Light\", \"Dark\") (optional) if omitted the server will use the default value of "Light"

    try:
        # Fetch FactSet answer in Adaptive Card format
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.search_for_adaptive_card_answer(query, include_thumbnail=include_thumbnail, disable_no_answer_responses=disable_no_answer_responses, theme=theme)

        pprint(api_response)
    except fds.sdk.FactSetSearchAnswers.ApiException as e:
        print("Exception when calling AnswersApi->search_for_adaptive_card_answer: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Fetch FactSet answer in Adaptive Card format
    #     api_response, http_status_code, response_headers = api_instance.search_for_adaptive_card_answer_with_http_info(query, include_thumbnail=include_thumbnail, disable_no_answer_responses=disable_no_answer_responses, theme=theme)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.FactSetSearchAnswers.ApiException as e:
    #     print("Exception when calling AnswersApi->search_for_adaptive_card_answer: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Fetch FactSet answer in Adaptive Card format
    #     async_result = api_instance.search_for_adaptive_card_answer_async(query, include_thumbnail=include_thumbnail, disable_no_answer_responses=disable_no_answer_responses, theme=theme)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.FactSetSearchAnswers.ApiException as e:
    #     print("Exception when calling AnswersApi->search_for_adaptive_card_answer: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Fetch FactSet answer in Adaptive Card format
    #     async_result = api_instance.search_for_adaptive_card_answer_with_http_info_async(query, include_thumbnail=include_thumbnail, disable_no_answer_responses=disable_no_answer_responses, theme=theme)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.FactSetSearchAnswers.ApiException as e:
    #     print("Exception when calling AnswersApi->search_for_adaptive_card_answer: %s\n" % e)

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
import fds.sdk.FactSetSearchAnswers

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.FactSetSearchAnswers.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.FactSetSearchAnswers

configuration = fds.sdk.FactSetSearchAnswers.Configuration(
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
import fds.sdk.FactSetSearchAnswers

configuration = fds.sdk.FactSetSearchAnswers.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```

### Request Retries

In case the request retry behaviour should be customized, it is possible to pass a `urllib3.Retry` object to the `retry` property of the Configuration.

```python
from urllib3 import Retry
import fds.sdk.FactSetSearchAnswers

configuration = fds.sdk.FactSetSearchAnswers.Configuration(
    # ...
)

configuration.retries = Retry(total=3, status_forcelist=[500, 502, 503, 504])
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnswersApi* | [**search_for_adaptive_card_answer**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/AnswersApi.md#search_for_adaptive_card_answer) | **GET** /search/answers/v1/adaptive-card | Fetch FactSet answer in Adaptive Card format
*AnswersApi* | [**search_for_data_answer**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/AnswersApi.md#search_for_data_answer) | **GET** /search/answers/v1/data | Fetch FactSet answer in data format


## Documentation For Models

 - [AdaptiveCardAnswerSuccessResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/AdaptiveCardAnswerSuccessResponse.md)
 - [AdaptiveCardDataItem](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/AdaptiveCardDataItem.md)
 - [AdaptiveCardWithThumbnail](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/AdaptiveCardWithThumbnail.md)
 - [AnswerFailureResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/AnswerFailureResponse.md)
 - [AnswerWithTitle](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/AnswerWithTitle.md)
 - [AnswerWithTitleAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/AnswerWithTitleAllOf.md)
 - [AnswerWithoutData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/AnswerWithoutData.md)
 - [AnswerWithoutDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/AnswerWithoutDataAllOf.md)
 - [AnswerWithoutDataAllOfTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/AnswerWithoutDataAllOfTemplateData.md)
 - [ApplicationLink](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ApplicationLink.md)
 - [ChangeColor](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ChangeColor.md)
 - [ColoredValue](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ColoredValue.md)
 - [ColoredValueLabelDateAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ColoredValueLabelDateAnswer.md)
 - [ColoredValueLabelDateAnswerAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ColoredValueLabelDateAnswerAllOf.md)
 - [ColoredValueLabelDateTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ColoredValueLabelDateTemplateData.md)
 - [ColoredValueLabelDateTemplateDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ColoredValueLabelDateTemplateDataAllOf.md)
 - [CountryID](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/CountryID.md)
 - [DataAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/DataAnswer.md)
 - [DataAnswerData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/DataAnswerData.md)
 - [DataAnswerSuccessResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/DataAnswerSuccessResponse.md)
 - [DataPair](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/DataPair.md)
 - [Error](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/Error.md)
 - [ErrorLink](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ErrorLink.md)
 - [ErrorSource](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ErrorSource.md)
 - [Fdc3Context](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/Fdc3Context.md)
 - [Fdc3Country](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/Fdc3Country.md)
 - [Fdc3Instrument](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/Fdc3Instrument.md)
 - [InstrumentID](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/InstrumentID.md)
 - [LabelValueChangeLabelValueChangeAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/LabelValueChangeLabelValueChangeAnswer.md)
 - [LabelValueChangeLabelValueChangeAnswerAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/LabelValueChangeLabelValueChangeAnswerAllOf.md)
 - [LabelValueChangeLabelValueChangeTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/LabelValueChangeLabelValueChangeTemplateData.md)
 - [LabelValueChangeLabelValueChangeTemplateDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/LabelValueChangeLabelValueChangeTemplateDataAllOf.md)
 - [LinkTextBlockAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/LinkTextBlockAnswer.md)
 - [LinkTextBlockAnswerAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/LinkTextBlockAnswerAllOf.md)
 - [LinkTextBlockTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/LinkTextBlockTemplateData.md)
 - [LinkTextBlockTemplateDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/LinkTextBlockTemplateDataAllOf.md)
 - [NoAnswersBase](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/NoAnswersBase.md)
 - [NoAnswersBaseAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/NoAnswersBaseAllOf.md)
 - [NoAnswersFound](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/NoAnswersFound.md)
 - [NoAnswersFoundAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/NoAnswersFoundAllOf.md)
 - [PercentChange](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/PercentChange.md)
 - [PercentChangeLabelAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/PercentChangeLabelAnswer.md)
 - [PercentChangeLabelAnswerAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/PercentChangeLabelAnswerAllOf.md)
 - [PercentChangeLabelTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/PercentChangeLabelTemplateData.md)
 - [PercentChangeLabelTemplateDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/PercentChangeLabelTemplateDataAllOf.md)
 - [RankedTable](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/RankedTable.md)
 - [RankedTableAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/RankedTableAnswer.md)
 - [RankedTableAnswerAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/RankedTableAnswerAllOf.md)
 - [RankedTableEntity](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/RankedTableEntity.md)
 - [RankedTableRow](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/RankedTableRow.md)
 - [RankedTableTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/RankedTableTemplateData.md)
 - [RankedTableTemplateDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/RankedTableTemplateDataAllOf.md)
 - [Table](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/Table.md)
 - [TableAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TableAnswer.md)
 - [TableAnswerAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TableAnswerAllOf.md)
 - [TableTableAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TableTableAnswer.md)
 - [TableTableAnswerAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TableTableAnswerAllOf.md)
 - [TableTableTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TableTableTemplateData.md)
 - [TableTableTemplateDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TableTableTemplateDataAllOf.md)
 - [TableTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TableTemplateData.md)
 - [TableTemplateDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TableTemplateDataAllOf.md)
 - [Template](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/Template.md)
 - [TemplateWithLinks](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TemplateWithLinks.md)
 - [TemplateWithLinksAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TemplateWithLinksAllOf.md)
 - [TextBlockFootingAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TextBlockFootingAnswer.md)
 - [TextBlockFootingAnswerAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TextBlockFootingAnswerAllOf.md)
 - [TextBlockFootingTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TextBlockFootingTemplateData.md)
 - [TextBlockFootingTemplateDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TextBlockFootingTemplateDataAllOf.md)
 - [TitledTextBlock](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/TitledTextBlock.md)
 - [ValueChange](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueChange.md)
 - [ValueChangeDateLabelAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueChangeDateLabelAnswer.md)
 - [ValueChangeDateLabelAnswerAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueChangeDateLabelAnswerAllOf.md)
 - [ValueChangeDateLabelTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueChangeDateLabelTemplateData.md)
 - [ValueChangeDateLabelTemplateDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueChangeDateLabelTemplateDataAllOf.md)
 - [ValueColor](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueColor.md)
 - [ValueLabelAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelAnswer.md)
 - [ValueLabelAnswerAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelAnswerAllOf.md)
 - [ValueLabelDateAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelDateAnswer.md)
 - [ValueLabelDateAnswerAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelDateAnswerAllOf.md)
 - [ValueLabelDateDataPairListAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelDateDataPairListAnswer.md)
 - [ValueLabelDateDataPairListAnswerAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelDateDataPairListAnswerAllOf.md)
 - [ValueLabelDateDataPairListTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelDateDataPairListTemplateData.md)
 - [ValueLabelDateDataPairListTemplateDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelDateDataPairListTemplateDataAllOf.md)
 - [ValueLabelDateTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelDateTemplateData.md)
 - [ValueLabelDateTemplateDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelDateTemplateDataAllOf.md)
 - [ValueLabelDateTextBlockAnswer](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelDateTextBlockAnswer.md)
 - [ValueLabelDateTextBlockAnswerAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelDateTextBlockAnswerAllOf.md)
 - [ValueLabelDateTextBlockTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelDateTextBlockTemplateData.md)
 - [ValueLabelDateTextBlockTemplateDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelDateTextBlockTemplateDataAllOf.md)
 - [ValueLabelTemplateData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelTemplateData.md)
 - [ValueLabelTemplateDataAllOf](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetSearchAnswers/v1/docs/ValueLabelTemplateDataAllOf.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.FactSetSearchAnswers.apis and fds.sdk.FactSetSearchAnswers.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.FactSetSearchAnswers.api.default_api import DefaultApi`
- `from fds.sdk.FactSetSearchAnswers.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.FactSetSearchAnswers
from fds.sdk.FactSetSearchAnswers.apis import *
from fds.sdk.FactSetSearchAnswers.models import *
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


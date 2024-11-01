[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Conversational API Powered by FactSet Mercury client library for Python

[![API Version](https://img.shields.io/badge/api-v0.6.0-blue)](https://developer.factset.com/api-catalog/conversational-api-powered-factset-mercury)
[![PyPi](https://img.shields.io/pypi/v/fds.sdk.ConversationalAPIPoweredbyFactSetMercury)](https://pypi.org/project/fds.sdk.ConversationalAPIPoweredbyFactSetMercury/)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

### OVERVIEW

The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client’s chatbot experience.

Request data from FactSet using natural language queries. Start the response generation using the `/query` endpoint, poll the status using `/status`. Once the result is ready, retrieve it using `/result`.

If your response contains a file ID, such as for an Excel chart or a FactSet ActiveGraph, retrieve it using the file ID at the `/download/file` endpoint.

We also encourage you to provide feedback on your responses using the `/feedback` endpoint!

**Please note:** \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable.

**Try the Conversational API and view Available Content**

In the [Using the Conversational API Online Assistant](https://my.apps.factset.com/oa/pages/23209) you can find instructions on how to start using the Conversational API, and the full list of content available.

Some of the prompts supported are:

- What is Tesla's enterprise value?
- Create a chart showing CME price relative to the S&P 500
- What were the highlights from Palantir's recent earnings call?

**Adaptive Card Format**

The Conversational API uses the Microsoft Adaptive Card format for response data surfaced from FactSet content sets. `Value` property of parent FederationData contains a JSON serialized presentation of a Microsoft Adaptive Card. See [Microsoft docs](https://learn.microsoft.com/en-us/adaptive-cards/) for Adaptive Card documentation, and the [Adaptive Card schema explorer](https://adaptivecards.io/explorer/) for schema details. **Please note**: \"The adaptive card may contain actions, which represent functionality within the card itself. In order to execute these actions, a handler must be implemented in your Adaptive Card rendering process. See [handling actions](https://learn.microsoft.com/en-us/adaptive-cards/sdk/rendering-cards/javascript/actions) for an example implementation.

**STACH Format**

The Conversational API may use Factset's STACH V3 format to represent tabular data in JSON. Please refer to the [STACH V3 documentation](https://factset.github.io/stachschema/#/v3/README) on column organized data for more information on how to process STACH-organized data.
<details>
  <summary><u>**STACH Example**</u></summary>
  ```json
  {
    \"version\": \"3.1\",
    \"table\": {
      \"primaryKeys\": [
        \"Insider Holders\",
        \"MV (M,$)\",
        \"% O/S\"
      ],
      \"totalNumRows\": 5
    },
    \"views\": [
      {
        \"name\": \"view\",
        \"displayName\": \"who are the suppliers of nike\",
        \"table\": {
          \"columns\": [
            \"Insider Holders\",
            \"MV (M,$)\",
            \"% O/S\"
          ],
          \"headers\": {
            \"Insider Holders\": \"Insider Holders\",
            \"MV (M,$)\": \"MV (M,$)\",
            \"% O/S\": \"% O/S\"
          }
        }
      }
    ],
    \"columns\": [
      {
        \"name\": \"Insider Holders\",
        \"contextualType\": \"string\",
        \"customMetadata\": {
          \"relevancy\": {
            \"contextualType\": \"int32\",
            \"value\": 100
          }
        }
      },
      {
        \"name\": \"MV (M,$)\",
        \"contextualType\": \"real\",
        \"customMetadata\": {
          \"relevancy\": {
            \"contextualType\": \"int32\",
            \"value\": 67
          }
        }
      },
      {
        \"name\": \"% O/S\",
        \"contextualType\": \"real\",
        \"customMetadata\": {
          \"relevancy\": {
            \"contextualType\": \"int32\",
            \"value\": 34
          }
        }
      }
    ],
    \"rows\": [
      {
        \"Insider Holders\": \"Knight Philip Hampson\",
        \"MV (M,$)\": 3156.8,
        \"% O/S\": 1.531
      },
      {
        \"Insider Holders\": \"Knight Travis A\",
        \"MV (M,$)\": 601.6,
        \"% O/S\": 0.496
      },
      {
        \"Insider Holders\": \"Wellcome Trust Ltd. (Direct Investments)\",
        \"MV (M,$)\": 225.5,
        \"% O/S\": 0.105
      },
      {
        \"Insider Holders\": \"Parker Mark G\",
        \"MV (M,$)\": 100.1,
        \"% O/S\": 0.056
      },
      {
        \"Insider Holders\": \"Donahoe John J Ii\",
        \"MV (M,$)\": 19.8,
        \"% O/S\": 0.018
      }
    ]
  }
  ```
</details>

**Citations**

Responses from the Conversational API may contain `citations` which provide references to the source of the data directly within the textual response. Phrases within the response text are mapped to a data item in the `citations` object via a bracketed ID (e.g. `[1]`). Citations may be used to provide additional context or to verify the source of the data; in some cases, a single phrase within the response may be supported by multiple data sources.
**Please note**: Links to the source data are provided as links to FactSet's Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). The link will direct you to the entire document; you may need to search for the specific phrase within the document. We are currently working on providing direct links to the specific section or excerpt of the document.
<details>
  <summary><u>**Citation Example**</u></summary>
  ```json
  {
    \"type\": \"string\",
    \"value\": \"FactSet has expressed optimism about the potential of generative AI (GenAI) to enhance their product offerings and drive efficiency[1].\"
    \"citations\": {
      \"[1]\": [
        \"phraseId\": \"aba1d533-08b3-4d3e-8961-5d37bb2caff6\",
        \"content\": \"At the same time, expectations are high around the effect generative AI will have on our industry.\",
        \"speakerInfo\": {
          \"companyId\": \"0016YD-E\",
          \"companyName\": \"FactSet Research Systems, Inc.\",
          \"speakerId\": \"0DPHLH-E\",
          \"speakerName\": \"Philip Snow\",
          \"speakerTitle\": \"Chief Executive Officer & Director\"
        },
        \"sourceURL\": \"https://my.apps.factset.com/viewer-fusion/?_doc_id=2948302-t&_doc_date=20231219&_doc_product=FCST&_doc_docfn=/home/docs/fcst/8/302/2948302-t.pdf&e=false\"
      ]
    }
  }
  ```
</details>


This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.6.0
- SDK version: 0.1.1
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.ConversationalAPIPoweredbyFactSetMercury==0.1.1
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.ConversationalAPIPoweredbyFactSetMercury==0.1.1
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

import fds.sdk.ConversationalAPIPoweredbyFactSetMercury
from fds.sdk.ConversationalAPIPoweredbyFactSetMercury.api import download_api
from fds.sdk.ConversationalAPIPoweredbyFactSetMercury.models import *
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
configuration = fds.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = download_api.DownloadApi(api_client)
    file_download_request = FileDownloadRequest(
        data=FileDownloadRequestData(
            file_id="file_id_example",
        ),
    ) # FileDownloadRequest | ID refers to the file ID in the NextStep action returned from the `/result` endpoint

    try:
        # Retrieve data file based on file ID.
        # example passing only required values which don't have defaults set
        api_response = api_instance.download_file(file_download_request)

        pprint(api_response)
    except fds.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiException as e:
        print("Exception when calling DownloadApi->download_file: %s\n" % e)

    # # Get response, http status code and response headers
    # try:
    #     # Retrieve data file based on file ID.
    #     api_response, http_status_code, response_headers = api_instance.download_file_with_http_info(file_download_request)


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiException as e:
    #     print("Exception when calling DownloadApi->download_file: %s\n" % e)

    # # Get response asynchronous
    # try:
    #     # Retrieve data file based on file ID.
    #     async_result = api_instance.download_file_async(file_download_request)
    #     api_response = async_result.get()


    #     pprint(api_response)
    # except fds.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiException as e:
    #     print("Exception when calling DownloadApi->download_file: %s\n" % e)

    # # Get response, http status code and response headers asynchronous
    # try:
    #     # Retrieve data file based on file ID.
    #     async_result = api_instance.download_file_with_http_info_async(file_download_request)
    #     api_response, http_status_code, response_headers = async_result.get()


    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiException as e:
    #     print("Exception when calling DownloadApi->download_file: %s\n" % e)

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
import fds.sdk.ConversationalAPIPoweredbyFactSetMercury

logging.basicConfig(level=logging.DEBUG)

configuration = fds.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration(...)
configuration.debug = True
```

### Configure a Proxy

You can pass proxy settings to the Configuration class:

* `proxy`: The URL of the proxy to use.
* `proxy_headers`: a dictionary to pass additional headers to the proxy (e.g. `Proxy-Authorization`).

```python
import fds.sdk.ConversationalAPIPoweredbyFactSetMercury

configuration = fds.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration(
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
import fds.sdk.ConversationalAPIPoweredbyFactSetMercury

configuration = fds.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration(
    # ...
    ssl_ca_cert='/path/to/ca.pem'
)
```

### Request Retries

In case the request retry behaviour should be customized, it is possible to pass a `urllib3.Retry` object to the `retry` property of the Configuration.

```python
from urllib3 import Retry
import fds.sdk.ConversationalAPIPoweredbyFactSetMercury

configuration = fds.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration(
    # ...
)

configuration.retries = Retry(total=3, status_forcelist=[500, 502, 503, 504])
```


## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com/conversational/v0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DownloadApi* | [**download_file**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/DownloadApi.md#download_file) | **POST** /download/file | Retrieve data file based on file ID.
*FeedbackApi* | [**send_feedback**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/FeedbackApi.md#send_feedback) | **POST** /feedback | Send feedback on the response to a query.
*MultipleQuestionChatApi* | [**get_chat_result**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/MultipleQuestionChatApi.md#get_chat_result) | **POST** /result | Retrieve the completed response for your query.
*MultipleQuestionChatApi* | [**get_chat_status**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/MultipleQuestionChatApi.md#get_chat_status) | **POST** /status | Retrieve the status of a chat response process.
*MultipleQuestionChatApi* | [**query_chat**](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/MultipleQuestionChatApi.md#query_chat) | **POST** /query | Create a query request for a given natural language query.


## Documentation For Models

 - [AdaptiveCard](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/AdaptiveCard.md)
 - [AdaptiveCardBodyElement](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/AdaptiveCardBodyElement.md)
 - [AdaptiveCardBodyElements](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/AdaptiveCardBodyElements.md)
 - [AdaptiveCardData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/AdaptiveCardData.md)
 - [ChatPollingRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/ChatPollingRequest.md)
 - [ChatPollingRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/ChatPollingRequestData.md)
 - [Citations](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/Citations.md)
 - [Download](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/Download.md)
 - [Error](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/Error.md)
 - [ErrorObject](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/ErrorObject.md)
 - [FederationData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/FederationData.md)
 - [FeedbackRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/FeedbackRequest.md)
 - [FeedbackRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/FeedbackRequestData.md)
 - [FileDownloadRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/FileDownloadRequest.md)
 - [FileDownloadRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/FileDownloadRequestData.md)
 - [NextStep](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/NextStep.md)
 - [NextStepItem](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/NextStepItem.md)
 - [OpenUrl](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/OpenUrl.md)
 - [OpenUrlUrl](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/OpenUrlUrl.md)
 - [Phrase](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/Phrase.md)
 - [PromptItem](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/PromptItem.md)
 - [PromptParameter](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/PromptParameter.md)
 - [PromptParameters](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/PromptParameters.md)
 - [QueryChatRequest](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/QueryChatRequest.md)
 - [QueryChatRequestData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/QueryChatRequestData.md)
 - [QueryChatResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/QueryChatResponse.md)
 - [QueryChatResponseData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/QueryChatResponseData.md)
 - [QueryResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/QueryResponse.md)
 - [QueryResponseData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/QueryResponseData.md)
 - [RateLimitExceededError](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/RateLimitExceededError.md)
 - [ResponseString](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/ResponseString.md)
 - [SpeakerInfo](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/SpeakerInfo.md)
 - [StatusPollResponse](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/StatusPollResponse.md)
 - [StatusPollResponseData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/StatusPollResponseData.md)
 - [SuggestedPrompts](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/SuggestedPrompts.md)
 - [Table](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/Table.md)
 - [TableData](https://github.com/FactSet/enterprise-sdk/tree/main/code/python/ConversationalAPIPoweredbyFactSetMercury/v0/docs/TableData.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.ConversationalAPIPoweredbyFactSetMercury.apis and fds.sdk.ConversationalAPIPoweredbyFactSetMercury.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.ConversationalAPIPoweredbyFactSetMercury.api.default_api import DefaultApi`
- `from fds.sdk.ConversationalAPIPoweredbyFactSetMercury.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.ConversationalAPIPoweredbyFactSetMercury
from fds.sdk.ConversationalAPIPoweredbyFactSetMercury.apis import *
from fds.sdk.ConversationalAPIPoweredbyFactSetMercury.models import *
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


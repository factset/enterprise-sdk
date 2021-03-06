<img alt="FactSet" src="https://www.factset.com/hubfs/Assets/images/factset-logo.svg" height="56" width="290">

# Documents Distributor - CallStreet Events client library for Python

[![PyPi](https://img.shields.io/pypi/v/fds.sdk.DocumentsDistributorCallStreetEvents)](https://pypi.org/project/fds.sdk.DocumentsDistributorCallStreetEvents/)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

CallStreet Events contains all the Documents Distributor APIs that provide events data such as Events Audio and Near Real-Time Transcripts

The  Events Audio API provides access to all audio recordings to various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. 

This API also provides relevant metadata such as timestamps and identifiers around each audio file.

The Documents Distributor - Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models.

Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 0.21.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen

## Requirements

* Python >= 3.7

## Installation

### Poetry

```shell
poetry add fds.sdk.utils fds.sdk.DocumentsDistributorCallStreetEvents
```

### pip

```shell
pip install fds.sdk.utils fds.sdk.DocumentsDistributorCallStreetEvents
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

```python

from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorCallStreetEvents
from fds.sdk.DocumentsDistributorCallStreetEvents.api import events_audio_api
from fds.sdk.DocumentsDistributorCallStreetEvents.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.DocumentsDistributorCallStreetEvents.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorCallStreetEvents.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = events_audio_api.EventsAudioApi(api_client)
    sort = "-startDate" # str | Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default. (optional) if omitted the server will use the default value of "-startDate"
    pagination_limit = 0 # int | Specifies the number of results to return per page. [ Min=0 ; Max=500 ] (optional)
    start_date = dateutil_parser('1970-01-01').date() # date | Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: -1 for yesterday)' (optional)
    pagination_offset = 1 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
    end_date = dateutil_parser('1970-01-01').date() # date | Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: 0 for today) (optional)
    report_id = 1 # int | Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event (optional)
    audio_source_id = 1 # int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSource ids. (optional)
    ids = "ids_example" # str | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier (optional)
    source_code = "P" # str | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P = Phone * W = Webcast * V = Vendor * I = Webcast Replay * F = Flash - identical to webcast; can merge with \"W\" in the future * R = Replay (Phone Replay) (optional)
    file_name = "fileName_example" # str | This parameter is used to filter the data on based on the file name. (optional)
    trimmed = True # bool | This parameters helps to search trimmed audio files (optional)
    upload_time = -168 # int | This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime = -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime= -1  Maximum is 1 week/168 hours i.e., uploadTime=-168  While using uploadTime, the startDate and endDate parameters will be ignored (optional)

    try:
        # Retrieve audio recordings and metadata within FactSet coverage
        api_response = api_instance.get_docs_distributor_audio_v1_list_files(sort=sort, pagination_limit=pagination_limit, start_date=start_date, pagination_offset=pagination_offset, end_date=end_date, report_id=report_id, audio_source_id=audio_source_id, ids=ids, source_code=source_code, file_name=file_name, trimmed=trimmed, upload_time=upload_time)
        pprint(api_response)
    except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
        print("Exception when calling EventsAudioApi->get_docs_distributor_audio_v1_list_files: %s\n" % e)

    # Get response, http status code and response headers
    # try:
    #     # Retrieve audio recordings and metadata within FactSet coverage
    #     api_response, http_status_code, response_headers = api_instance.get_docs_distributor_audio_v1_list_files_with_http_info(sort=sort, pagination_limit=pagination_limit, start_date=start_date, pagination_offset=pagination_offset, end_date=end_date, report_id=report_id, audio_source_id=audio_source_id, ids=ids, source_code=source_code, file_name=file_name, trimmed=trimmed, upload_time=upload_time)
    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
    #     print("Exception when calling EventsAudioApi->get_docs_distributor_audio_v1_list_files: %s\n" % e)

    # Get response asynchronous
    # try:
    #     # Retrieve audio recordings and metadata within FactSet coverage
    #     async_result = api_instance.get_docs_distributor_audio_v1_list_files_async(sort=sort, pagination_limit=pagination_limit, start_date=start_date, pagination_offset=pagination_offset, end_date=end_date, report_id=report_id, audio_source_id=audio_source_id, ids=ids, source_code=source_code, file_name=file_name, trimmed=trimmed, upload_time=upload_time)
    #     api_response = async_result.get()
    #     pprint(api_response)
    # except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
    #     print("Exception when calling EventsAudioApi->get_docs_distributor_audio_v1_list_files: %s\n" % e)

    # Get response, http status code and response headers asynchronous
    # try:
    #     # Retrieve audio recordings and metadata within FactSet coverage
    #     async_result = api_instance.get_docs_distributor_audio_v1_list_files_with_http_info_async(sort=sort, pagination_limit=pagination_limit, start_date=start_date, pagination_offset=pagination_offset, end_date=end_date, report_id=report_id, audio_source_id=audio_source_id, ids=ids, source_code=source_code, file_name=file_name, trimmed=trimmed, upload_time=upload_time)
    #     api_response, http_status_code, response_headers = async_result.get()
    #     pprint(api_response)
    #     pprint(http_status_code)
    #     pprint(response_headers)
    # except fds.sdk.DocumentsDistributorCallStreetEvents.ApiException as e:
    #     print("Exception when calling EventsAudioApi->get_docs_distributor_audio_v1_list_files: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *https://api.factset.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EventsAudioApi* | [**get_docs_distributor_audio_v1_list_files**](docs/EventsAudioApi.md#get_docs_distributor_audio_v1_list_files) | **GET** /docs-distributor/audio/v1/list-files | Retrieve audio recordings and metadata within FactSet coverage
*NearRealTimeTranscriptsApi* | [**get_bulk_documents_nrt_v1_calls**](docs/NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_calls) | **GET** /bulk-documents/nrt/v1/calls | Returns the active calls happening at the moment
*NearRealTimeTranscriptsApi* | [**get_bulk_documents_nrt_v1_indexed_nrt**](docs/NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_indexed_nrt) | **GET** /bulk-documents/nrt/v1/indexed-nrt | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
*NearRealTimeTranscriptsApi* | [**get_bulk_documents_nrt_v1_list_snippets**](docs/NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_list_snippets) | **GET** /bulk-documents/nrt/v1/list-snippets | Returns the latest transcript snippets from an active call
*NearRealTimeTranscriptsApi* | [**get_bulk_documents_nrt_v1_speakerids**](docs/NearRealTimeTranscriptsApi.md#get_bulk_documents_nrt_v1_speakerids) | **GET** /bulk-documents/nrt/v1/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.


## Documentation For Models

 - [Error](docs/Error.md)
 - [EventsAudio](docs/EventsAudio.md)
 - [EventsAudio400Response](docs/EventsAudio400Response.md)
 - [EventsAudio400ResponseDetails](docs/EventsAudio400ResponseDetails.md)
 - [EventsAudio400ResponseDetailsValidParameters](docs/EventsAudio400ResponseDetailsValidParameters.md)
 - [EventsAudioData](docs/EventsAudioData.md)
 - [EventsAudioMeta](docs/EventsAudioMeta.md)
 - [EventsAudioMetaPagination](docs/EventsAudioMetaPagination.md)
 - [IndexedNRT](docs/IndexedNRT.md)
 - [NRTCalls](docs/NRTCalls.md)
 - [NRTCalls400Response](docs/NRTCalls400Response.md)
 - [NRTCalls400ResponseDetails](docs/NRTCalls400ResponseDetails.md)
 - [NRTCalls400ResponseDetailsValidParameters](docs/NRTCalls400ResponseDetailsValidParameters.md)
 - [NRTCallsData](docs/NRTCallsData.md)
 - [NRTCallsMeta](docs/NRTCallsMeta.md)
 - [NRTSnippets](docs/NRTSnippets.md)
 - [NRTSnippets400Response](docs/NRTSnippets400Response.md)
 - [NRTSnippets400ResponseDetails](docs/NRTSnippets400ResponseDetails.md)
 - [NRTSnippets400ResponseDetailsValidParameters](docs/NRTSnippets400ResponseDetailsValidParameters.md)
 - [NRTSnippetsData](docs/NRTSnippetsData.md)
 - [NRTSnippetsMeta](docs/NRTSnippetsMeta.md)
 - [NRTSnippetsMetaPagination](docs/NRTSnippetsMetaPagination.md)
 - [NRTSnippetsMetaPartial](docs/NRTSnippetsMetaPartial.md)
 - [NRTSnippetsSnippetData](docs/NRTSnippetsSnippetData.md)
 - [NRTSnippetsTranscriptData](docs/NRTSnippetsTranscriptData.md)
 - [NRTSpeakerids](docs/NRTSpeakerids.md)
 - [NRTSpeakerids400Response](docs/NRTSpeakerids400Response.md)
 - [NRTSpeakerids400ResponseDetails](docs/NRTSpeakerids400ResponseDetails.md)
 - [NRTSpeakerids400ResponseDetailsValidParameters](docs/NRTSpeakerids400ResponseDetailsValidParameters.md)
 - [NRTSpeakeridsData](docs/NRTSpeakeridsData.md)
 - [NRTSpeakeridsMeta](docs/NRTSpeakeridsMeta.md)
 - [NRTSpeakeridsMetaPagination](docs/NRTSpeakeridsMetaPagination.md)


## Documentation For Authorization


## FactSetApiKey

- **Type**: HTTP basic authentication


## FactSetOAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Notes for Large OpenAPI documents
If the OpenAPI document is large, imports in fds.sdk.DocumentsDistributorCallStreetEvents.apis and fds.sdk.DocumentsDistributorCallStreetEvents.models may fail with a
RecursionError indicating the maximum recursion limit has been exceeded. In that case, there are a couple of solutions:

Solution 1:
Use specific imports for apis and models like:
- `from fds.sdk.DocumentsDistributorCallStreetEvents.api.default_api import DefaultApi`
- `from fds.sdk.DocumentsDistributorCallStreetEvents.model.pet import Pet`

Solution 2:
Before importing the package, adjust the maximum recursion limit as shown below:
```
import sys
sys.setrecursionlimit(1500)
import fds.sdk.DocumentsDistributorCallStreetEvents
from fds.sdk.DocumentsDistributorCallStreetEvents.apis import *
from fds.sdk.DocumentsDistributorCallStreetEvents.models import *
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


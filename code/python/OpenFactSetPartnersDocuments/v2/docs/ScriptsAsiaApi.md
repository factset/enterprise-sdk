# fds.sdk.OpenFactSetPartnersDocuments.ScriptsAsiaApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_scripts_asia_files**](ScriptsAsiaApi.md#get_scripts_asia_files) | **GET** /scripts-asia/transcripts | Returns the daily files from Open:FactSet Partner - Scripts Asia.



# **get_scripts_asia_files**
> ScriptsAsiaResponse get_scripts_asia_files()

Returns the daily files from Open:FactSet Partner - Scripts Asia.

Returns XML files and relevant metadata provided by Open: FactSet Partner – Scripts Asia. - type=delta returns the files from March 1st 2023 to current date. - type=full will returns the files from start of date until Feb 28th 2023.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetPartnersDocuments
from fds.sdk.OpenFactSetPartnersDocuments.api import scripts_asia_api
from fds.sdk.OpenFactSetPartnersDocuments.models import *
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
configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenFactSetPartnersDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenFactSetPartnersDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = scripts_asia_api.ScriptsAsiaApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sort = "-startDate" # str | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional) if omitted the server will use the default value of "-startDate"
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per result. (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    tracking_id = "431eb8d0-cc45-11ed-8609-0f67251fe7a4" # str | Unique Scripts Asia identifier assigned to an event.  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sa_id = "SA002220_2023Mar27_a_02" # str | This parameter filters the results based on saId of the Transcript.  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    start_date = dateutil_parser('2023-03-20').date() # date | The earliest date of the Scripts Asia file the API should return based on date.  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    end_date = dateutil_parser('2023-03-28').date() # date | The latest date of the Scripts Asia file the API should return based on date.           (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    company_name = "Beijing Shunxin Agriculture Co Ltd" # str | This parameter filters the results based on Company Name of the Transcript.  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    event_type = "01" # str | This parameter filters the results based on eventType of the Transcript.  * 01 = Shareholders Meeting * 02 = Earnings Announcement * 03 = Medium-term Management Plan Announcement * 04 = Analyst Meeting * 05 = Special Announcement * 06 = Investor Conference  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    language_type = "local" # str | This parameter filters the results based on language type(either English or local) of the Transcript.  (optional) if omitted the server will use the default value of "local"
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    file_name = "SA002220_2023Mar27_a_02_fds_xml_local.xml" # str | This parameter is used to filters the results based on file name. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    type = "delta" # str | Specifies the type of the file. (optional) if omitted the server will use the default value of "delta"

    try:
        # Returns the daily files from Open:FactSet Partner - Scripts Asia.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_scripts_asia_files(sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset, tracking_id=tracking_id, sa_id=sa_id, start_date=start_date, end_date=end_date, company_name=company_name, event_type=event_type, language_type=language_type, file_name=file_name, type=type)

        pprint(api_response)

    except fds.sdk.OpenFactSetPartnersDocuments.ApiException as e:
        print("Exception when calling ScriptsAsiaApi->get_scripts_asia_files: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **str**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. | [optional] if omitted the server will use the default value of "-startDate"
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] if omitted the server will use the default value of 0
 **tracking_id** | **str**| Unique Scripts Asia identifier assigned to an event.  | [optional]
 **sa_id** | **str**| This parameter filters the results based on saId of the Transcript.  | [optional]
 **start_date** | **date**| The earliest date of the Scripts Asia file the API should return based on date.  | [optional]
 **end_date** | **date**| The latest date of the Scripts Asia file the API should return based on date.           | [optional]
 **company_name** | **str**| This parameter filters the results based on Company Name of the Transcript.  | [optional]
 **event_type** | **str**| This parameter filters the results based on eventType of the Transcript.  * 01 &#x3D; Shareholders Meeting * 02 &#x3D; Earnings Announcement * 03 &#x3D; Medium-term Management Plan Announcement * 04 &#x3D; Analyst Meeting * 05 &#x3D; Special Announcement * 06 &#x3D; Investor Conference  | [optional]
 **language_type** | **str**| This parameter filters the results based on language type(either English or local) of the Transcript.  | [optional] if omitted the server will use the default value of "local"
 **file_name** | **str**| This parameter is used to filters the results based on file name. | [optional]
 **type** | **str**| Specifies the type of the file. | [optional] if omitted the server will use the default value of "delta"

### Return type

[**ScriptsAsiaResponse**](ScriptsAsiaResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download link &amp; metadata for Scripts Asia files. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


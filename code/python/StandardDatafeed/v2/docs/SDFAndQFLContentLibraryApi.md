# fds.sdk.StandardDatafeed.SDFAndQFLContentLibraryApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_list_files**](SDFAndQFLContentLibraryApi.md#get_list_files) | **GET** /list-files | Returns delta &amp; full files for the schemas.
[**gethistorical_files**](SDFAndQFLContentLibraryApi.md#gethistorical_files) | **GET** /historical-files | Returns full historic data of specified schema and bundle.



# **get_list_files**
> ListFile get_list_files()

Returns delta & full files for the schemas.

This endpoint returns delta and full files for all the schemas subscribed by the client.  - If the request does not include a date range filter, this endpoint returns the past 10 days of data by default.  - If filtered by a date range, the data is limited to maximum of latest 30 days.                

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StandardDatafeed
from fds.sdk.StandardDatafeed.api import sdf_and_qfl_content_library_api
from fds.sdk.StandardDatafeed.models import *
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
configuration = fds.sdk.StandardDatafeed.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StandardDatafeed.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StandardDatafeed.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = sdf_and_qfl_content_library_api.SDFAndQFLContentLibraryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    schema = "fgp_v1" # str | Name of the schema. (optional)
    bundle = "fgp_global_prices_am_v1" # str | Name of the bundle. (optional)
    type = "delta" # str | Type of the file.  Note: - Full files are snapshots of the bundle capturing the most recent version of the bundle generated every weekend. When requesting 'Full' files, ensure that the date range includes weekend dates. - Delta files include the incremental changes (inserts, updates, deletes), since the last file and have incremental sequence numbers.    (optional) if omitted the server will use the default value of "delta"
    start_date = "2023-01-01" # str | The earliest date of the feed file the API should fetch based on the file timestamp. Consider the following points:   - Dates provided in `startDate` and `endDate` along with `schema` parameter: The returned dataset is limited to a maximum of latest 30 days' worth of records. - Format: Should be absolute (YYYY-MM-DD).  (optional)
    start_date_relative = 1 # int | The earliest date of the feed file the API should fetch based on the file timestamp. Consider the following points:  - Dates provided in `startDate` and `endDate` along with `schema` parameter: The returned dataset is limited to a maximum of latest 30 days' worth of records. - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either `startDate` or `startDateRelative` should be used, but not both.* - *If both `startDate` and `startDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `startDate` or `startDateRelative`, the API will not return any data.*  (optional)
    end_date = "2023-01-28T00:00:00.000Z" # str | The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Should be absolute - YYYY-MM-DD.  (optional)
    end_date_relative = 1 # int | The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either `endDate` or `endDateRelative` should be used, but not both.* - *If both `endDate` and `endDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `endDate` or `endDateRelative`, the API will not return any data.*  (optional)
    pagination_limit = 20 # int | Specifies the number of results to return per page. (optional) if omitted the server will use the default value of 20
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0
    sort = ["-startDate"] # [str] | Enables sorting data in ascending or descending chronological order based on startDate.  (optional) if omitted the server will use the default value of ["-startDate"]

    try:
        # Returns delta & full files for the schemas.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_list_files(schema=schema, bundle=bundle, type=type, start_date=start_date, start_date_relative=start_date_relative, end_date=end_date, end_date_relative=end_date_relative, pagination_limit=pagination_limit, pagination_offset=pagination_offset, sort=sort)

        pprint(api_response)

    except fds.sdk.StandardDatafeed.ApiException as e:
        print("Exception when calling SDFAndQFLContentLibraryApi->get_list_files: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schema** | **str**| Name of the schema. | [optional]
 **bundle** | **str**| Name of the bundle. | [optional]
 **type** | **str**| Type of the file.  Note: - Full files are snapshots of the bundle capturing the most recent version of the bundle generated every weekend. When requesting &#39;Full&#39; files, ensure that the date range includes weekend dates. - Delta files include the incremental changes (inserts, updates, deletes), since the last file and have incremental sequence numbers.    | [optional] if omitted the server will use the default value of "delta"
 **start_date** | **str**| The earliest date of the feed file the API should fetch based on the file timestamp. Consider the following points:   - Dates provided in &#x60;startDate&#x60; and &#x60;endDate&#x60; along with &#x60;schema&#x60; parameter: The returned dataset is limited to a maximum of latest 30 days&#39; worth of records. - Format: Should be absolute (YYYY-MM-DD).  | [optional]
 **start_date_relative** | **int**| The earliest date of the feed file the API should fetch based on the file timestamp. Consider the following points:  - Dates provided in &#x60;startDate&#x60; and &#x60;endDate&#x60; along with &#x60;schema&#x60; parameter: The returned dataset is limited to a maximum of latest 30 days&#39; worth of records. - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional]
 **end_date** | **str**| The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Should be absolute - YYYY-MM-DD.  | [optional]
 **end_date_relative** | **int**| The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  | [optional]
 **pagination_limit** | **int**| Specifies the number of results to return per page. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on startDate.  | [optional] if omitted the server will use the default value of ["-startDate"]

### Return type

[**ListFile**](ListFile.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  |  -  |
**429** | Quantity Limits Exceeded |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **gethistorical_files**
> HistoricalFile gethistorical_files()

Returns full historic data of specified schema and bundle.

This endpoint returns historical data for the specified schema and bundle.  - If no date range is specified, this endpoint grants access to all archived records back to the first full. - If filtered by a date range, the endpoint provides records within the specified date range; if it precedes the first full, all available records are included. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StandardDatafeed
from fds.sdk.StandardDatafeed.api import sdf_and_qfl_content_library_api
from fds.sdk.StandardDatafeed.models import *
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
configuration = fds.sdk.StandardDatafeed.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StandardDatafeed.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StandardDatafeed.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = sdf_and_qfl_content_library_api.SDFAndQFLContentLibraryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    schema = "fgp_v1" # str | Name of the schema. (optional)
    bundle = "fgp_global_prices_am_v1" # str | Name of the bundle. (optional)
    type = "delta" # str | Type of the file.  Note: - Full files are snapshots of the bundle capturing the most recent version of the bundle generated every weekend. When requesting 'Full' files, ensure that the date range includes weekend dates. - Delta files include the incremental changes (inserts, updates, deletes), since the last file and have incremental sequence numbers.    (optional) if omitted the server will use the default value of "delta"
    start_date = "2021-01-25" # str | The earliest date of the feed file the API should fetch based on the file timestamp.    - Format: Should be absolute (YYYY-MM-DD).  (optional)
    start_date_relative = 1 # int | The earliest date of the feed file the API should fetch based on the file timestamp.    - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either `startDate` or `startDateRelative` should be used, but not both.* - *If both `startDate` and `startDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `startDate` or `startDateRelative`, the API will not return any data.*  (optional)
    end_date = "2023-01-28T00:00:00.000Z" # str | The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Should be absolute - YYYY-MM-DD.  (optional)
    end_date_relative = 1 # int | The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either `endDate` or `endDateRelative` should be used, but not both.* - *If both `endDate` and `endDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `endDate` or `endDateRelative`, the API will not return any data.*  (optional)
    pagination_limit = 20 # int | Specifies the number of results to return per page. (optional) if omitted the server will use the default value of 20
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0
    sort = ["-startDate"] # [str] | Enables sorting data in ascending or descending chronological order based on startDate.  (optional) if omitted the server will use the default value of ["-startDate"]

    try:
        # Returns full historic data of specified schema and bundle.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.gethistorical_files(schema=schema, bundle=bundle, type=type, start_date=start_date, start_date_relative=start_date_relative, end_date=end_date, end_date_relative=end_date_relative, pagination_limit=pagination_limit, pagination_offset=pagination_offset, sort=sort)

        pprint(api_response)

    except fds.sdk.StandardDatafeed.ApiException as e:
        print("Exception when calling SDFAndQFLContentLibraryApi->gethistorical_files: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schema** | **str**| Name of the schema. | [optional]
 **bundle** | **str**| Name of the bundle. | [optional]
 **type** | **str**| Type of the file.  Note: - Full files are snapshots of the bundle capturing the most recent version of the bundle generated every weekend. When requesting &#39;Full&#39; files, ensure that the date range includes weekend dates. - Delta files include the incremental changes (inserts, updates, deletes), since the last file and have incremental sequence numbers.    | [optional] if omitted the server will use the default value of "delta"
 **start_date** | **str**| The earliest date of the feed file the API should fetch based on the file timestamp.    - Format: Should be absolute (YYYY-MM-DD).  | [optional]
 **start_date_relative** | **int**| The earliest date of the feed file the API should fetch based on the file timestamp.    - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional]
 **end_date** | **str**| The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Should be absolute - YYYY-MM-DD.  | [optional]
 **end_date_relative** | **int**| The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  | [optional]
 **pagination_limit** | **int**| Specifies the number of results to return per page. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0
 **sort** | **[str]**| Enables sorting data in ascending or descending chronological order based on startDate.  | [optional] if omitted the server will use the default value of ["-startDate"]

### Return type

[**HistoricalFile**](HistoricalFile.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  |  -  |
**429** | Quantity Limits Exceeded |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


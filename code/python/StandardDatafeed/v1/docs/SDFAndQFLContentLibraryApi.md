# fds.sdk.StandardDatafeed.SDFAndQFLContentLibraryApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_v1_list_files**](SDFAndQFLContentLibraryApi.md#get_v1_list_files) | **GET** /list-files | 



# **get_v1_list_files**
> ListFiles200Response get_v1_list_files()



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
    schema = "schema_example" # str | schema name</p> </p> **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1**  (optional)
    bundle = "bundle_example" # str | bundle name</p> If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families & factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups (optional)
    type = "full" # str | file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files** (optional)
    start_date = "startDate_example" # str | The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p>     - If the schema parameter is specified in the request, date range can be greater than 10 days maximum upto latest 30 days. - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday (optional)
    end_date = "endDate_example" # str | The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today (optional)
    pagination_limit = 20 # int | Specifies the number of results to return per page. Default is 20 & Maximum is 500 results per page (optional) if omitted the server will use the default value of 20
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional) if omitted the server will use the default value of 0
    sort = "startDate" # str | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used (optional) if omitted the server will use the default value of "startDate"

    try:
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_v1_list_files(schema=schema, bundle=bundle, type=type, start_date=start_date, end_date=end_date, pagination_limit=pagination_limit, pagination_offset=pagination_offset, sort=sort)

        pprint(api_response)

    except fds.sdk.StandardDatafeed.ApiException as e:
        print("Exception when calling SDFAndQFLContentLibraryApi->get_v1_list_files: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schema** | **str**| schema name&lt;/p&gt; &lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1**  | [optional]
 **bundle** | **str**| bundle name&lt;/p&gt; If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families &amp; factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups | [optional]
 **type** | **str**| file type &#x3D; Full or Delta&lt;/p&gt; Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \&quot;Full\&quot; files** | [optional]
 **start_date** | **str**| The earliest date of the feed file the API should fetch for based on the fileTimestamp.&lt;/p&gt;     - If the schema parameter is specified in the request, date range can be greater than 10 days maximum upto latest 30 days. - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday | [optional]
 **end_date** | **str**| The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today | [optional]
 **pagination_limit** | **int**| Specifies the number of results to return per page. Default is 20 &amp; Maximum is 500 results per page | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] if omitted the server will use the default value of 0
 **sort** | **str**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used | [optional] if omitted the server will use the default value of "startDate"

### Return type

[**ListFiles200Response**](ListFiles200Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


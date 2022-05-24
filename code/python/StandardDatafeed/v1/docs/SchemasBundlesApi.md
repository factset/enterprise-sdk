# fds.sdk.StandardDatafeed.SchemasBundlesApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_v1_list_files**](SchemasBundlesApi.md#get_v1_list_files) | **GET** /v1/list-files | 


# **get_v1_list_files**
> ListFiles200Response get_v1_list_files()



<a href=https://api.factset.com/bulk-documents/sdf/v1/list-files>List-Files</a> end point provides the delta & full files in a reverse chronological order for all the schemas & bundles subscribed by the client 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StandardDatafeed
from fds.sdk.StandardDatafeed.api import schemas__bundles_api
from fds.sdk.StandardDatafeed.model.list_files200_response import ListFiles200Response
from fds.sdk.StandardDatafeed.model.list_files400_response import ListFiles400Response
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
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
    api_instance = schemas__bundles_api.SchemasBundlesApi(api_client)

    schema = "schema_example" # str | schema name</p> Default is all schemas & bundles subscribed by the client</p> **Example: acta_v1, fgp_v1, yn_v1** (optional)
    bundle = "bundle_example" # str | bundle name</p> Default is all the bundles client is subscribed to</p> **Do not use \"schema\" parameter** when searching for a specific bundle (optional)
    type = "full" # str | file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files** (optional)
    start_date = "startDate_example" # str | The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p> Data requested should be in batches of 10days **(Date range should be less than or equal to 10)**</p>**Date format -  YYYY-MM-DD** (optional)
    end_date = "endDate_example" # str | The latest date of the feed file the API should fetch for based on the fileTimestamp</p>**Date format -  YYYY-MM-DD** (optional)
    pagination_limit = 20 # int | Specifies the number of results to return per page. Default is 20 & Maximum is 500 results per page (optional) (default to 20)
    pagination_offset = 1 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)
    sort = "startDate" # str | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used (optional) (default to "startDate")

    try:
        api_response = api_instance.get_v1_list_files(schema=schema, bundle=bundle, type=type, start_date=start_date, end_date=end_date, pagination_limit=pagination_limit, pagination_offset=pagination_offset, sort=sort)
        pprint(api_response)

    except fds.sdk.StandardDatafeed.ApiException as e:
        print("Exception when calling SchemasBundlesApi->get_v1_list_files: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schema** | **str**| schema name&lt;/p&gt; Default is all schemas &amp; bundles subscribed by the client&lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1** | [optional]
 **bundle** | **str**| bundle name&lt;/p&gt; Default is all the bundles client is subscribed to&lt;/p&gt; **Do not use \&quot;schema\&quot; parameter** when searching for a specific bundle | [optional]
 **type** | **str**| file type &#x3D; Full or Delta&lt;/p&gt; Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \&quot;Full\&quot; files** | [optional]
 **start_date** | **str**| The earliest date of the feed file the API should fetch for based on the fileTimestamp.&lt;/p&gt; Data requested should be in batches of 10days **(Date range should be less than or equal to 10)**&lt;/p&gt;**Date format -  YYYY-MM-DD** | [optional]
 **end_date** | **str**| The latest date of the feed file the API should fetch for based on the fileTimestamp&lt;/p&gt;**Date format -  YYYY-MM-DD** | [optional]
 **pagination_limit** | **int**| Specifies the number of results to return per page. Default is 20 &amp; Maximum is 500 results per page | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional]
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


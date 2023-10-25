# fds.sdk.OpenFactSetPartnersDocuments.LuxembourgApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_luxembourg_greenbonds_daily**](LuxembourgApi.md#get_luxembourg_greenbonds_daily) | **GET** /luxembourg/green-bonds/daily | Returns daily files from Open:FactSet Partner - Luxembourg



# **get_luxembourg_greenbonds_daily**
> LuxResponse get_luxembourg_greenbonds_daily()

Returns daily files from Open:FactSet Partner - Luxembourg

Returns XML files and relevant metadata provided by Open: FactSet Partner – Luxembourg. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetPartnersDocuments
from fds.sdk.OpenFactSetPartnersDocuments.api import luxembourg_api
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
    api_instance = luxembourg_api.LuxembourgApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    sort = "-startDate" # str | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional) if omitted the server will use the default value of "-startDate"
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per result. (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional) if omitted the server will use the default value of 0
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    isin = "XS2486610541" # str | Specifies the ISIN of the record.  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    preissuance_pub_date = dateutil_parser('2022-08-26').date() # date | The pre-issuance date of the record.  (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    type = "type_example" # str | Please input the value as **idMap** to get the symbology files     (optional)

    try:
        # Returns daily files from Open:FactSet Partner - Luxembourg
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_luxembourg_greenbonds_daily(sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset, isin=isin, preissuance_pub_date=preissuance_pub_date, type=type)

        pprint(api_response)

    except fds.sdk.OpenFactSetPartnersDocuments.ApiException as e:
        print("Exception when calling LuxembourgApi->get_luxembourg_greenbonds_daily: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **str**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. | [optional] if omitted the server will use the default value of "-startDate"
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] if omitted the server will use the default value of 0
 **isin** | **str**| Specifies the ISIN of the record.  | [optional]
 **preissuance_pub_date** | **date**| The pre-issuance date of the record.  | [optional]
 **type** | **str**| Please input the value as **idMap** to get the symbology files     | [optional]

### Return type

[**LuxResponse**](LuxResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Download link &amp; metadata for luxembourg files. |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


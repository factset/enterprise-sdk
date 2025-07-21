# fds.sdk.FactSetPrivateCompany.FinancialsApi

All URIs are relative to *https://api.factset.com/content/private-company/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_financials**](FinancialsApi.md#get_financials) | **GET** /financials | Returns Private Company Financial Data.
[**get_financials_for_list**](FinancialsApi.md#get_financials_for_list) | **POST** /financials | Returns Private Company Financial Data.



# **get_financials**
> FinancialsResponse get_financials(ids, metrics, start_date)

Returns Private Company Financial Data.

Retrieves Financial Data for specified Private Companies. Use the ```/universe``` endpoint to retrieve valid Private Company  identifiers. Use the ```/metrics``` endpoint to retrieve a full list of valid metrics or data items.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateCompany
from fds.sdk.FactSetPrivateCompany.api import financials_api
from fds.sdk.FactSetPrivateCompany.models import *
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
configuration = fds.sdk.FactSetPrivateCompany.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPrivateCompany.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrivateCompany.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = financials_api.FinancialsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["0H3R4Y-E"] # [str] | The requested FactSet Private Company Entity Identifier in XXXXXX-E format.<br/><br/> *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it's advised for any requests with large request lines to be requested through the respective \\\"POST\\\" method.* 
    metrics = ["FPC_EBIT"] # [str] | Requested list of Private Company Financial items 
    start_date = dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date() # date | The start date requested for a given date range in YYYY-MM-DD format. <br/> Future dates (T+1) are not accepted in this endpoint. 
    end_date = dateutil_parser('Tue Dec 31 00:00:00 UTC 2024').date() # date | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close. <br/> Future dates (T+1) are not accepted in this endpoint.  (optional)

    try:
        # Returns Private Company Financial Data.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_financials(ids, metrics, start_date, end_date=end_date)

        pprint(api_response)

    except fds.sdk.FactSetPrivateCompany.ApiException as e:
        print("Exception when calling FinancialsApi->get_financials: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested FactSet Private Company Entity Identifier in XXXXXX-E format.&lt;br/&gt;&lt;br/&gt; *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it&#39;s advised for any requests with large request lines to be requested through the respective \\\&quot;POST\\\&quot; method.*  |
 **metrics** | **[str]**| Requested list of Private Company Financial items  |
 **start_date** | **date**| The start date requested for a given date range in YYYY-MM-DD format. &lt;br/&gt; Future dates (T+1) are not accepted in this endpoint.  |
 **end_date** | **date**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close. &lt;br/&gt; Future dates (T+1) are not accepted in this endpoint.  | [optional]

### Return type

[**FinancialsResponse**](FinancialsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetches Private Company Financials for a list of ids. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_financials_for_list**
> FinancialsResponse get_financials_for_list(financials_request)

Returns Private Company Financial Data.

Retrieves Financial Data for specified Private Companies. Use the ```/universe``` endpoint to retrieve valid Private Company  identifiers. Use the ```/metrics``` endpoint to retrieve a full list of valid metrics or data items.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateCompany
from fds.sdk.FactSetPrivateCompany.api import financials_api
from fds.sdk.FactSetPrivateCompany.models import *
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
configuration = fds.sdk.FactSetPrivateCompany.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPrivateCompany.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrivateCompany.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = financials_api.FinancialsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    financials_request = FinancialsRequest(
        data=FinancialsRequestBody(
            ids=PrivateMarketIds({"oneId":{"summary":"One security or entity identifier","value":["0H3R4Y-E"]},"multipleIds":{"summary":"Multiple security or entity identifiers","value":["0H3R4Y-E","0G3F5Z-E","00DK61-E"]}}),
            metrics=FinancialsMetrics({"oneFinancialMetric":{"summary":"One financials metric","value":["FPC_ASSETS"]},"multipleFinancialMetrics":{"summary":"Multiple financial metrics","value":["FPC_ASSETS","FPC_EBIT"]}}),
            start_date=dateutil_parser('Tue Jan 01 00:00:00 UTC 2019').date(),
            end_date=dateutil_parser('Tue Dec 31 00:00:00 UTC 2019').date(),
        ),
    ) # FinancialsRequest | Request Body to request a list of Private Company financials objects.

    try:
        # Returns Private Company Financial Data.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_financials_for_list(financials_request)

        pprint(api_response)

    except fds.sdk.FactSetPrivateCompany.ApiException as e:
        print("Exception when calling FinancialsApi->get_financials_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financials_request** | [**FinancialsRequest**](FinancialsRequest.md)| Request Body to request a list of Private Company financials objects. |

### Return type

[**FinancialsResponse**](FinancialsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Private Company financials data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# fds.sdk.FactSetEntity.HistoricalCreditParentApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_hist_cred_parent**](HistoricalCreditParentApi.md#get_hist_cred_parent) | **GET** /factset-entity/v1/hist-credit-parent | Returns historical credit parents for the requested id(s).
[**post_hist_cred_parent**](HistoricalCreditParentApi.md#post_hist_cred_parent) | **POST** /factset-entity/v1/hist-credit-parent | Returns historical credit parents for the requested id(s).



# **get_hist_cred_parent**
> CreditParentResponse get_hist_cred_parent(ids)

Returns historical credit parents for the requested id(s).

Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEntity
from fds.sdk.FactSetEntity.api import historical_credit_parent_api
from fds.sdk.FactSetEntity.models import *
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
configuration = fds.sdk.FactSetEntity.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEntity.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEntity.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = historical_credit_parent_api.HistoricalCreditParentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ids = ["CYQYNL-S","G17920AA0","US40434YTB38"] # [str] | The requested security level Market Identifiers. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet -S Permanent Ids.<p>**Max Ids Limit set to 50 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    as_of_date = "2020-01-01" # str | The date requested for credit parent calculation. Represented in **YYYY-MM-DD** format. If left blank or not specified, the full credit parent history will be returned.  (optional)

    try:
        # Returns historical credit parents for the requested id(s).
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_hist_cred_parent(ids, as_of_date=as_of_date)

        pprint(api_response)

    except fds.sdk.FactSetEntity.ApiException as e:
        print("Exception when calling HistoricalCreditParentApi->get_hist_cred_parent: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested security level Market Identifiers. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet -S Permanent Ids.&lt;p&gt;**Max Ids Limit set to 50 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  |
 **as_of_date** | **str**| The date requested for credit parent calculation. Represented in **YYYY-MM-DD** format. If left blank or not specified, the full credit parent history will be returned.  | [optional]

### Return type

[**CreditParentResponse**](CreditParentResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetches Credit Parents |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_hist_cred_parent**
> CreditParentResponse post_hist_cred_parent(credit_parent_request)

Returns historical credit parents for the requested id(s).

Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is also available if an asOfDate is provided. The full credit parent history of a security is returned if no asOfDate is provided.  This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEntity
from fds.sdk.FactSetEntity.api import historical_credit_parent_api
from fds.sdk.FactSetEntity.models import *
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
configuration = fds.sdk.FactSetEntity.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEntity.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEntity.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = historical_credit_parent_api.HistoricalCreditParentApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    credit_parent_request = CreditParentRequest(
        ids=HcpIds(["CYQYNL-S","G17920AA0","US40434YTB38"]),
        as_of_date="2020-06-30",
    ) # CreditParentRequest | Request Body to request a list of credit parent objects.

    try:
        # Returns historical credit parents for the requested id(s).
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_hist_cred_parent(credit_parent_request)

        pprint(api_response)

    except fds.sdk.FactSetEntity.ApiException as e:
        print("Exception when calling HistoricalCreditParentApi->post_hist_cred_parent: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credit_parent_request** | [**CreditParentRequest**](CreditParentRequest.md)| Request Body to request a list of credit parent objects. |

### Return type

[**CreditParentResponse**](CreditParentResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Credit parent data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


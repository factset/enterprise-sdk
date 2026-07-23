# fds.sdk.FactSetPrivateEquityandVentureCapital.IPOsApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ipo**](IPOsApi.md#get_ipo) | **GET** /ipos | Retrieve details of an Initial Public Offering (IPO) related to a portfolio company exit.
[**search_ipos**](IPOsApi.md#search_ipos) | **POST** /ipos/search | Search and filter the universe of portfolio company IPOs by status, size, and date range.



# **get_ipo**
> IPODetailsResponse get_ipo(ids)

Retrieve details of an Initial Public Offering (IPO) related to a portfolio company exit.

Provides comprehensive details on the **Initial Public Offering (IPO)** process for portfolio companies, typically representing an exit for a fund. Information includes the **IPO size**, **pricing**, date, and other relevant capital markets data.  Use the `/transactions/ma-activity` endpoint to find fund deal ids for your request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateEquityandVentureCapital
from fds.sdk.FactSetPrivateEquityandVentureCapital.api import ipos_api
from fds.sdk.FactSetPrivateEquityandVentureCapital.models import *
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
configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrivateEquityandVentureCapital.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ipos_api.IPOsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = [23682] # [int] | A list of unique FactSet-generated identifiers (Deal IDs) assigned to a **Merger & Acquisition (M&A) or Venture Capital (VC) deal**. This ID represents the main event being tracked.

    try:
        # Retrieve details of an Initial Public Offering (IPO) related to a portfolio company exit.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_ipo(ids)

        pprint(api_response)

    except fds.sdk.FactSetPrivateEquityandVentureCapital.ApiException as e:
        print("Exception when calling IPOsApi->get_ipo: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[int]**| A list of unique FactSet-generated identifiers (Deal IDs) assigned to a **Merger &amp; Acquisition (M&amp;A) or Venture Capital (VC) deal**. This ID represents the main event being tracked. |

### Return type

[**IPODetailsResponse**](IPODetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_ipos**
> IPOSearchResponse search_ipos(ipo_search_request)

Search and filter the universe of portfolio company IPOs by status, size, and date range.

Enables filtering of the IPO universe by criteria such as **IPO status** (e.g., Completed, Withdrawn), the **date range** of the IPO, and the minimum or maximum **offering size** in USD.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateEquityandVentureCapital
from fds.sdk.FactSetPrivateEquityandVentureCapital.api import ipos_api
from fds.sdk.FactSetPrivateEquityandVentureCapital.models import *
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
configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrivateEquityandVentureCapital.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ipos_api.IPOsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ipo_search_request = IPOSearchRequest(
        data=IPOSearchRequestData(
            status="Closed",
            start_date=dateutil_parser('1970-01-01').date(),
            end_date=dateutil_parser('1970-01-01').date(),
            min_size_usd=3.14,
            max_size_usd=3.14,
        ),
    ) # IPOSearchRequest | 

    try:
        # Search and filter the universe of portfolio company IPOs by status, size, and date range.
        # example passing only required values which don't have defaults set
        api_response = api_instance.search_ipos(ipo_search_request)

        pprint(api_response)

    except fds.sdk.FactSetPrivateEquityandVentureCapital.ApiException as e:
        print("Exception when calling IPOsApi->search_ipos: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipo_search_request** | [**IPOSearchRequest**](IPOSearchRequest.md)|  |

### Return type

[**IPOSearchResponse**](IPOSearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


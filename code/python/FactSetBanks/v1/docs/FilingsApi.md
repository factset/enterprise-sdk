# fds.sdk.FactSetBanks.FilingsApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ten_d_filings**](FilingsApi.md#get_ten_d_filings) | **POST** /ten-d | Returns Form 10-D distribution reports
[**get_ucc1_filings**](FilingsApi.md#get_ucc1_filings) | **POST** /ucc1 | Returns UCC-1 filings data



# **get_ten_d_filings**
> Filings10DResponse get_ten_d_filings(ten_d_filings_request)

Returns Form 10-D distribution reports

Returns SEC Form 10-D distribution reports for bank-issued asset-backed securities — pool performance and credit enhancement data including payments received, delinquencies, defaults, and cash flow distributions. Offers more frequent (monthly) insight into credit card receivables than 8-K/10-K filings.  Covers credit cards (110 data items) and auto loans (254 data items). History since 2017. Updated monthly.  Find available metrics via [`/metrics`](#operation/getMetrics) with:  * **category**: `FILINGS` * **subcategory**: `TEN_D` 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBanks
from fds.sdk.FactSetBanks.api import filings_api
from fds.sdk.FactSetBanks.models import *
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
configuration = fds.sdk.FactSetBanks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBanks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBanks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = filings_api.FilingsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ten_d_filings_request = TenDFilingsRequest(
        data=TenDFilingsRequestData(
            ids=Ids(["000BDX-E"]),
            start_date=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
            end_date=dateutil_parser('Tue Dec 31 00:00:00 UTC 2024').date(),
            currency=CurrencyCode("USD"),
            metrics=["PRIN_RECEIV_END","RECEIV_CURR","RECEIV_DELQ_30_OVER"],
        ),
        meta=RequestMeta(
            pagination=PaginationRequest(
                limit=100,
                offset=0,
            ),
        ),
    ) # TenDFilingsRequest | 

    try:
        # Returns Form 10-D distribution reports
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_ten_d_filings(ten_d_filings_request)

        pprint(api_response)

    except fds.sdk.FactSetBanks.ApiException as e:
        print("Exception when calling FilingsApi->get_ten_d_filings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ten_d_filings_request** | [**TenDFilingsRequest**](TenDFilingsRequest.md)|  |

### Return type

[**Filings10DResponse**](Filings10DResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | 10-D filing data |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ucc1_filings**
> FilingsUCC1Response get_ucc1_filings(ucc1_filings_request)

Returns UCC-1 filings data

Returns UCC-1 financing statement filings — notices filed by creditors of an interest in a debtor's personal property. Includes secured party (banking institution), debtor name, and filing details such as expiration date.  Covers 4,500+ banking institutions; history since 2002. Updated monthly. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBanks
from fds.sdk.FactSetBanks.api import filings_api
from fds.sdk.FactSetBanks.models import *
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
configuration = fds.sdk.FactSetBanks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBanks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBanks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = filings_api.FilingsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ucc1_filings_request = Ucc1FilingsRequest(
        data=Ucc1FilingsRequestData(
            ids=Ids(["000BDX-E"]),
            start_date=dateutil_parser('Mon Jan 01 00:00:00 UTC 2024').date(),
            end_date=dateutil_parser('Tue Dec 31 00:00:00 UTC 2024').date(),
            filing_state="VA",
            debtor_name="Jas Realty LLC",
        ),
        meta=RequestMeta(
            pagination=PaginationRequest(
                limit=100,
                offset=0,
            ),
        ),
    ) # Ucc1FilingsRequest | 

    try:
        # Returns UCC-1 filings data
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_ucc1_filings(ucc1_filings_request)

        pprint(api_response)

    except fds.sdk.FactSetBanks.ApiException as e:
        print("Exception when calling FilingsApi->get_ucc1_filings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ucc1_filings_request** | [**Ucc1FilingsRequest**](Ucc1FilingsRequest.md)|  |

### Return type

[**FilingsUCC1Response**](FilingsUCC1Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | UCC-1 filing data |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


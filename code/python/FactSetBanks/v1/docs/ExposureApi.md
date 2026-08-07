# fds.sdk.FactSetBanks.ExposureApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_country_exposure**](ExposureApi.md#get_country_exposure) | **POST** /country-exposure | Returns country exposure data (Form 009a)



# **get_country_exposure**
> ExposureResponse get_country_exposure(exposure_request)

Returns country exposure data (Form 009a)

Returns Form 009a country exposure data — the distribution by country of claims on foreigners held by US banks — for screening countries and assessing risks in US bank lending activities. Viewable by metric and by country.  Covers ~100 US commercial banks; history since 2013. Updated quarterly.  Find available metrics via [`/metrics`](#operation/getMetrics) with:  * **category**: `EXPOSURE` * **subcategory**: `COUNTRY` 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBanks
from fds.sdk.FactSetBanks.api import exposure_api
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
    api_instance = exposure_api.ExposureApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    exposure_request = ExposureRequest(
        data=ExposureRequestData(
            ids=Ids(["000BDX-E"]),
            start_date=dateutil_parser('Sun Jan 01 00:00:00 UTC 2023').date(),
            end_date=dateutil_parser('Sun Dec 31 00:00:00 UTC 2023').date(),
            country="AU",
            currency=CurrencyCode("USD"),
            metrics=["CB_CLAIMS_EXCL_DERIV_GT","CLAIMS_DERIV_GT","CLAIMS_GT"],
        ),
        meta=RequestMeta(
            pagination=PaginationRequest(
                limit=100,
                offset=0,
            ),
        ),
    ) # ExposureRequest | 

    try:
        # Returns country exposure data (Form 009a)
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_country_exposure(exposure_request)

        pprint(api_response)

    except fds.sdk.FactSetBanks.ApiException as e:
        print("Exception when calling ExposureApi->get_country_exposure: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exposure_request** | [**ExposureRequest**](ExposureRequest.md)|  |

### Return type

[**ExposureResponse**](ExposureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Country exposure data |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


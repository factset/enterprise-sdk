# fds.sdk.FactSetTermsandConditions.RedemptionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fixed_income_redemption_prices**](RedemptionsApi.md#get_fixed_income_redemption_prices) | **GET** /factset-terms-and-conditions/v1/redemption-prices | Return Redemption Prices for a Fixed Income security.
[**get_fixed_income_redemption_prices_for_list**](RedemptionsApi.md#get_fixed_income_redemption_prices_for_list) | **POST** /factset-terms-and-conditions/v1/redemption-prices | Return Redemption Prices for a list of Fixed Income securities.



# **get_fixed_income_redemption_prices**
> RedemptionPricesResponse get_fixed_income_redemption_prices(ids, )

Return Redemption Prices for a Fixed Income security.

Returns Redemption Prices for the Fixed Income security. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTermsandConditions
from fds.sdk.FactSetTermsandConditions.api import redemptions_api
from fds.sdk.FactSetTermsandConditions.models import *
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
configuration = fds.sdk.FactSetTermsandConditions.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetTermsandConditions.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTermsandConditions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = redemptions_api.RedemptionsApi(api_client)

    ids = ["30231GBJ","88579EAA"] # [str] | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 

    try:
        # Return Redemption Prices for a Fixed Income security.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_fixed_income_redemption_prices(ids, )
        pprint(api_response)

    except fds.sdk.FactSetTermsandConditions.ApiException as e:
        print("Exception when calling RedemptionsApi->get_fixed_income_redemption_prices: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  |
 **categories** | **str**| Filters the list of Redemption Prices Categories -   * **CALL** &#x3D; Call prices.   * **PUT** &#x3D; Put prices.   * **SF** &#x3D; Sinking Fund prices.  | defaults to "ALL"

### Return type

[**RedemptionPricesResponse**](RedemptionPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fixed Income Negative Redemption Prices Response |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fixed_income_redemption_prices_for_list**
> RedemptionPricesResponse get_fixed_income_redemption_prices_for_list(redemption_prices_request)

Return Redemption Prices for a list of Fixed Income securities.

Returns Redemption Prices for a list of Fixed Income securities. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTermsandConditions
from fds.sdk.FactSetTermsandConditions.api import redemptions_api
from fds.sdk.FactSetTermsandConditions.models import *
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
configuration = fds.sdk.FactSetTermsandConditions.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetTermsandConditions.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTermsandConditions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = redemptions_api.RedemptionsApi(api_client)

    redemption_prices_request = RedemptionPricesRequest(
        ids=[
            "ids_example",
        ],
        categories="ALL",
    ) # RedemptionPricesRequest | Request object for Fixed Income Redemption Prices.

    try:
        # Return Redemption Prices for a list of Fixed Income securities.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_fixed_income_redemption_prices_for_list(redemption_prices_request)
        pprint(api_response)

    except fds.sdk.FactSetTermsandConditions.ApiException as e:
        print("Exception when calling RedemptionsApi->get_fixed_income_redemption_prices_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **redemption_prices_request** | [**RedemptionPricesRequest**](RedemptionPricesRequest.md)| Request object for Fixed Income Redemption Prices. |

### Return type

[**RedemptionPricesResponse**](RedemptionPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fixed Income Negative Redemption Prices Response |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# fds.sdk.FactSetMergersandAcquisitions.DealsApi

All URIs are relative to *https://api.factset.com/content/factset-mergers-acquisitions/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_deals_by_company_list**](DealsApi.md#get_deals_by_company_list) | **POST** /deals/by-company | Returns details for a list of companies.
[**get_deals_details_list**](DealsApi.md#get_deals_details_list) | **POST** /deals/details | Returns details for specified deals.
[**get_public_target_deals_list**](DealsApi.md#get_public_target_deals_list) | **POST** /deals/public-targets | Returns a list of deals in which the target is a public company.



# **get_deals_by_company_list**
> DealsResponse get_deals_by_company_list(deals_request)

Returns details for a list of companies.

Gets deals for a specified list of companies within a date range. Deals returned are any in which the requested company is involved as either the buyer, seller, or target. The start and end date parameters will find deals based on their announcement date. The response of this endpoint includes `dealId` which can be sent to the `/deals/details` endpoint for more information about the deal. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetMergersandAcquisitions
from fds.sdk.FactSetMergersandAcquisitions.api import deals_api
from fds.sdk.FactSetMergersandAcquisitions.models import *
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
configuration = fds.sdk.FactSetMergersandAcquisitions.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetMergersandAcquisitions.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetMergersandAcquisitions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = deals_api.DealsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    deals_request = DealsRequest(
        data=DealsRequestBody(
            ids=Ids(["FDS-US"]),
            start_date="2017-12-01",
            end_date="2017-12-31",
        ),
    ) # DealsRequest | Request object for `Deals`.

    try:
        # Returns details for a list of companies.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_deals_by_company_list(deals_request)

        pprint(api_response)

    except fds.sdk.FactSetMergersandAcquisitions.ApiException as e:
        print("Exception when calling DealsApi->get_deals_by_company_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deals_request** | [**DealsRequest**](DealsRequest.md)| Request object for &#x60;Deals&#x60;. |

### Return type

[**DealsResponse**](DealsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of deals |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_deals_details_list**
> DetailsResponse get_deals_details_list(details_request)

Returns details for specified deals.

Gets deal details for a specified list of FactSet deal identifiers. Monetary values returned by this API are converted and represented in USD. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetMergersandAcquisitions
from fds.sdk.FactSetMergersandAcquisitions.api import deals_api
from fds.sdk.FactSetMergersandAcquisitions.models import *
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
configuration = fds.sdk.FactSetMergersandAcquisitions.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetMergersandAcquisitions.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetMergersandAcquisitions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = deals_api.DealsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    details_request = DetailsRequest(
        data=DetailsRequestBody(
            deal_ids=DealIds(["4143886MM"]),
        ),
    ) # DetailsRequest | Request object for `Deal Details`.

    try:
        # Returns details for specified deals.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_deals_details_list(details_request)

        pprint(api_response)

    except fds.sdk.FactSetMergersandAcquisitions.ApiException as e:
        print("Exception when calling DealsApi->get_deals_details_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **details_request** | [**DetailsRequest**](DetailsRequest.md)| Request object for &#x60;Deal Details&#x60;. |

### Return type

[**DetailsResponse**](DetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of deal details |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_public_target_deals_list**
> DealsPublicResponse get_public_target_deals_list(deals_public_request)

Returns a list of deals in which the target is a public company.

Gets deals in which the target is a public company for a specified date range and status. The start and end date parameters will find deals based on their announcement date. The response of this endpoint includes `dealId` which can be sent to the `/deals/details` endpoint for more information about the deal. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetMergersandAcquisitions
from fds.sdk.FactSetMergersandAcquisitions.api import deals_api
from fds.sdk.FactSetMergersandAcquisitions.models import *
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
configuration = fds.sdk.FactSetMergersandAcquisitions.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetMergersandAcquisitions.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetMergersandAcquisitions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = deals_api.DealsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    deals_public_request = DealsPublicRequest(
        data=DealsPublicRequestBody(
            start_date="2017-12-01",
            end_date="2017-12-31",
            status=Status("All"),
        ),
    ) # DealsPublicRequest | Request object for `Deals`.

    try:
        # Returns a list of deals in which the target is a public company.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_public_target_deals_list(deals_public_request)

        pprint(api_response)

    except fds.sdk.FactSetMergersandAcquisitions.ApiException as e:
        print("Exception when calling DealsApi->get_public_target_deals_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deals_public_request** | [**DealsPublicRequest**](DealsPublicRequest.md)| Request object for &#x60;Deals&#x60;. |

### Return type

[**DealsPublicResponse**](DealsPublicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of deals |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


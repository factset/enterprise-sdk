# fds.sdk.FactSetDebtCapitalStructure.ReferenceApi

All URIs are relative to *https://api.factset.com/content/factset-dcs/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_details_list**](ReferenceApi.md#get_details_list) | **POST** /details | Returns debt instruments for a list of companies.
[**get_interim_details_list**](ReferenceApi.md#get_interim_details_list) | **POST** /details-interim | Returns most recently available debt instrument data for a list of companies.



# **get_details_list**
> DetailsResponse get_details_list(details_request)

Returns debt instruments for a list of companies.

Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetDebtCapitalStructure
from fds.sdk.FactSetDebtCapitalStructure.api import reference_api
from fds.sdk.FactSetDebtCapitalStructure.models import *
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
configuration = fds.sdk.FactSetDebtCapitalStructure.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetDebtCapitalStructure.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetDebtCapitalStructure.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = reference_api.ReferenceApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    details_request = DetailsRequest(
        data=DetailsRequestBody(
            ids=Ids(["FDS-US"]),
            periodicity=Periodicity("QTR"),
            date=dateutil_parser('Fri Dec 01 00:00:00 UTC 2017').date(),
        ),
    ) # DetailsRequest | Request object for `Details`.

    try:
        # Returns debt instruments for a list of companies.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_details_list(details_request)

        pprint(api_response)

    except fds.sdk.FactSetDebtCapitalStructure.ApiException as e:
        print("Exception when calling ReferenceApi->get_details_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **details_request** | [**DetailsRequest**](DetailsRequest.md)| Request object for &#x60;Details&#x60;. |

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
**200** | Array of details |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_interim_details_list**
> DetailsResponse get_interim_details_list(interim_details_request)

Returns most recently available debt instrument data for a list of companies.

Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other. The data returned by this endpoint is for the interim period and only returns the most recently available value. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetDebtCapitalStructure
from fds.sdk.FactSetDebtCapitalStructure.api import reference_api
from fds.sdk.FactSetDebtCapitalStructure.models import *
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
configuration = fds.sdk.FactSetDebtCapitalStructure.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetDebtCapitalStructure.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetDebtCapitalStructure.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = reference_api.ReferenceApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    interim_details_request = InterimDetailsRequest(
        data=InterimDetailsRequestBody(
            ids=Ids(["FDS-US"]),
        ),
    ) # InterimDetailsRequest | Request object for `Details`.

    try:
        # Returns most recently available debt instrument data for a list of companies.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_interim_details_list(interim_details_request)

        pprint(api_response)

    except fds.sdk.FactSetDebtCapitalStructure.ApiException as e:
        print("Exception when calling ReferenceApi->get_interim_details_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interim_details_request** | [**InterimDetailsRequest**](InterimDetailsRequest.md)| Request object for &#x60;Details&#x60;. |

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
**200** | Array of interim details |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


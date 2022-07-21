# fds.sdk.FactSetOwnership.SecurityHoldersApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_security_holders**](SecurityHoldersApi.md#get_security_holders) | **GET** /factset-ownership/v1/security-holders | Get security ownership data for requested security identifers.
[**post_security_holders**](SecurityHoldersApi.md#post_security_holders) | **POST** /factset-ownership/v1/security-holders | Get security ownership data for a list of requested securities.


# **get_security_holders**
> SecurityHoldersResponse get_security_holders(ids)

Get security ownership data for requested security identifers.

Gets security ownership details and activity for the requested security identifiers. The services allows filtering by \"Topn\" holders and by holder \"type\", such as Institutions, Insiders, and Stakeholders. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnership
from fds.sdk.FactSetOwnership.api import security_holders_api
from fds.sdk.FactSetOwnership.models import *
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
configuration = fds.sdk.FactSetOwnership.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOwnership.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOwnership.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = security_holders_api.SecurityHoldersApi(api_client)

    ids = ["FDS-US"] # [str] | Requested list of security identifiers. <p>***ids limit** =  1 per request*</p>.
    holder_type = "F" # str | Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** = Institutions   * **M** = Mutual Funds   * **S** =  Insiders/Stakeholders   * **FS** = Institutions/Insiders   * **B** = Beneficial Owners  (optional) if omitted the server will use the default value of "F"
    topn = "5" # str | Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. (optional) if omitted the server will use the default value of "ALL"
    date = "2019-12-31" # str | Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. (optional)
    currency = "USD" # str | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)

    try:
        # Get security ownership data for requested security identifers.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_security_holders(ids, holder_type=holder_type, topn=topn, date=date, currency=currency)
        pprint(api_response)

    except fds.sdk.FactSetOwnership.ApiException as e:
        print("Exception when calling SecurityHoldersApi->get_security_holders: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt;. |
 **holder_type** | **str**| Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** &#x3D; Institutions   * **M** &#x3D; Mutual Funds   * **S** &#x3D;  Insiders/Stakeholders   * **FS** &#x3D; Institutions/Insiders   * **B** &#x3D; Beneficial Owners  | [optional] if omitted the server will use the default value of "F"
 **topn** | **str**| Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. | [optional] if omitted the server will use the default value of "ALL"
 **date** | **str**| Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. | [optional]
 **currency** | **str**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional]

### Return type

[**SecurityHoldersResponse**](SecurityHoldersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Security Holders Response. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_security_holders**
> SecurityHoldersResponse post_security_holders(security_holders_request)

Get security ownership data for a list of requested securities.

Gets security ownership details and activity for the requested security identifiers. The services allows filtering by \"Topn\" holders and by holder \"type\", such as Institutions, Insiders, and Stakeholders. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnership
from fds.sdk.FactSetOwnership.api import security_holders_api
from fds.sdk.FactSetOwnership.models import *
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
configuration = fds.sdk.FactSetOwnership.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOwnership.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOwnership.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = security_holders_api.SecurityHoldersApi(api_client)

    security_holders_request = SecurityHoldersRequest(
        ids=IdHolders(["FDS-US"]),
        holder_type=HolderType("F"),
        date="2019-09-30",
        topn="5",
        currency="USD",
    ) # SecurityHoldersRequest | Requesting Security Holders for a list of Fund Identifiers.

    try:
        # Get security ownership data for a list of requested securities.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_security_holders(security_holders_request)
        pprint(api_response)

    except fds.sdk.FactSetOwnership.ApiException as e:
        print("Exception when calling SecurityHoldersApi->post_security_holders: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_holders_request** | [**SecurityHoldersRequest**](SecurityHoldersRequest.md)| Requesting Security Holders for a list of Fund Identifiers. |

### Return type

[**SecurityHoldersResponse**](SecurityHoldersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Security Holders Response. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


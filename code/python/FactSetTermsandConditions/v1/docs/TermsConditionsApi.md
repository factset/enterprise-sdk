# fds.sdk.FactSetTermsandConditions.TermsConditionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_terms_and_conditions**](TermsConditionsApi.md#get_terms_and_conditions) | **GET** /factset-terms-and-conditions/v1/terms-and-conditions | Return select Terms and Conditions items for a Fixed Income security.
[**get_terms_and_conditions_fields**](TermsConditionsApi.md#get_terms_and_conditions_fields) | **GET** /factset-terms-and-conditions/v1/fields | Available fields for /terms-and-conditions endpoint
[**get_terms_and_conditions_for_list**](TermsConditionsApi.md#get_terms_and_conditions_for_list) | **POST** /factset-terms-and-conditions/v1/terms-and-conditions | Return Terms and Conditions for a list of Fixed Income securities.


# **get_terms_and_conditions**
> TermsAndConditionsResponse get_terms_and_conditions(ids)

Return select Terms and Conditions items for a Fixed Income security.

Returns Terms and Conditions data items for the Fixed Income security. Includes items for Conditional Redemptions, Redemption Options, Security Details, and Coupon Details. Use the `fields` parameter to request specific items only or request an entire category of items to fetch all available fields matching that category(s). <p>*For T&C data related to Agency, Coupon History, Issue Size, Negative Covenants, or Redemption Prices, Lead Underwriters, and Use of Proceeds, please use respective endpoints optimized for that content.*</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTermsandConditions
from fds.sdk.FactSetTermsandConditions.api import terms__conditions_api
from fds.sdk.FactSetTermsandConditions.model.terms_and_conditions_response import TermsAndConditionsResponse
from fds.sdk.FactSetTermsandConditions.model.error_response import ErrorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetTermsandConditions.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetTermsandConditions.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetTermsandConditions.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTermsandConditions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = terms__conditions_api.TermsConditionsApi(api_client)
    ids = ["30231GBJ","88579EAA"] # [str] | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
    fields = ["principalAmt","issueDesc","denomMin","maturityDate"] # [str] | List of data items for Terms and Conditions. For a full list of available fields, definitions, and category assignments, use the `/fields` endpoint. (optional)
    categories = [
        "SECURITY_DETAILS",
    ] # [str] | Selects the Fixed Income metrics by major category. Use the `/fields` endpoint to get a list of all fields associated with each category.   * **SECURITY_DETAILS** = Detailed information about the security.   * **COUPON_DETAILS** = Coupon details.   * **CONVERTIBLE_FEATURES** = Features of convertible instruments.   * **REDEMPTION_OPTIONS** = Redemption options.  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Return select Terms and Conditions items for a Fixed Income security.
        api_response = api_instance.get_terms_and_conditions(ids)
        pprint(api_response)
    except fds.sdk.FactSetTermsandConditions.ApiException as e:
        print("Exception when calling TermsConditionsApi->get_terms_and_conditions: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Return select Terms and Conditions items for a Fixed Income security.
        api_response = api_instance.get_terms_and_conditions(ids, fields=fields, categories=categories)
        pprint(api_response)
    except fds.sdk.FactSetTermsandConditions.ApiException as e:
        print("Exception when calling TermsConditionsApi->get_terms_and_conditions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  |
 **fields** | **[str]**| List of data items for Terms and Conditions. For a full list of available fields, definitions, and category assignments, use the &#x60;/fields&#x60; endpoint. | [optional]
 **categories** | **[str]**| Selects the Fixed Income metrics by major category. Use the &#x60;/fields&#x60; endpoint to get a list of all fields associated with each category.   * **SECURITY_DETAILS** &#x3D; Detailed information about the security.   * **COUPON_DETAILS** &#x3D; Coupon details.   * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments.   * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  | [optional]

### Return type

[**TermsAndConditionsResponse**](TermsAndConditionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Terms And Conditions Response |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_terms_and_conditions_fields**
> FieldsResponse get_terms_and_conditions_fields()

Available fields for /terms-and-conditions endpoint

Returns a list of available fields that can be used in the `fields` parameter of the **/terms-and-conditions** endpoint. Leave _category_ blank to request all available items. Make Note, this does not represent all available fields within the Terms and Conditions API and all other endpoints. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTermsandConditions
from fds.sdk.FactSetTermsandConditions.api import terms__conditions_api
from fds.sdk.FactSetTermsandConditions.model.fields_response import FieldsResponse
from fds.sdk.FactSetTermsandConditions.model.error_response import ErrorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetTermsandConditions.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetTermsandConditions.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetTermsandConditions.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTermsandConditions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = terms__conditions_api.TermsConditionsApi(api_client)
    category = "SECURITY_DETAILS" # str | Filters the list of Fixed Income metrics by major category -   * **SECURITY_DETAILS** = Detailed information about the security.   * **COUPON_DETAILS** = Coupon details.   * **CONVERTIBLE_FEATURES** = Features of convertible instruments.   * **REDEMPTION_OPTIONS** = Redemption options.  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Available fields for /terms-and-conditions endpoint
        api_response = api_instance.get_terms_and_conditions_fields(category=category)
        pprint(api_response)
    except fds.sdk.FactSetTermsandConditions.ApiException as e:
        print("Exception when calling TermsConditionsApi->get_terms_and_conditions_fields: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **str**| Filters the list of Fixed Income metrics by major category -   * **SECURITY_DETAILS** &#x3D; Detailed information about the security.   * **COUPON_DETAILS** &#x3D; Coupon details.   * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments.   * **REDEMPTION_OPTIONS** &#x3D; Redemption options.  | [optional]

### Return type

[**FieldsResponse**](FieldsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Terms And Conditions Fields Response |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_terms_and_conditions_for_list**
> TermsAndConditionsResponse get_terms_and_conditions_for_list(terms_and_conditions_request)

Return Terms and Conditions for a list of Fixed Income securities.

Returns Terms and Conditions data items for the Fixed Income security. Includes reference items for Conditional Redemptions, Redemption Options, Security Details, Convertible Features, and Coupon Details. Use the `fields` parameter to request specific items only or request an entire category of items to fetch all available fields matching that category(s). <p>*For T&C data related to Agency, Coupon History, Issue Size, Negative Covenants, or Redemption Prices, Lead Underwriters, and Use of Proceeds, please use respective endpoints optimized for that content.*</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTermsandConditions
from fds.sdk.FactSetTermsandConditions.api import terms__conditions_api
from fds.sdk.FactSetTermsandConditions.model.terms_and_conditions_request import TermsAndConditionsRequest
from fds.sdk.FactSetTermsandConditions.model.terms_and_conditions_response import TermsAndConditionsResponse
from fds.sdk.FactSetTermsandConditions.model.error_response import ErrorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetTermsandConditions.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetTermsandConditions.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetTermsandConditions.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTermsandConditions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = terms__conditions_api.TermsConditionsApi(api_client)
    terms_and_conditions_request = TermsAndConditionsRequest(
        ids=[
            "ids_example",
        ],
        fields=[
            "fields_example",
        ],
        categories=[
            "SECURITY_DETAILS",
        ],
    ) # TermsAndConditionsRequest | Request object for Terms And Conditions

    # example passing only required values which don't have defaults set
    try:
        # Return Terms and Conditions for a list of Fixed Income securities.
        api_response = api_instance.get_terms_and_conditions_for_list(terms_and_conditions_request)
        pprint(api_response)
    except fds.sdk.FactSetTermsandConditions.ApiException as e:
        print("Exception when calling TermsConditionsApi->get_terms_and_conditions_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terms_and_conditions_request** | [**TermsAndConditionsRequest**](TermsAndConditionsRequest.md)| Request object for Terms And Conditions |

### Return type

[**TermsAndConditionsResponse**](TermsAndConditionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Terms and Conditions Response |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


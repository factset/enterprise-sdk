# fds.sdk.FactSetOwnershipReportBuilder.OwnershipApi

All URIs are relative to *https://api.factset.com/report/ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ownership_holders**](OwnershipApi.md#get_ownership_holders) | **GET** /holders | Holders of a company or fund


# **get_ownership_holders**
> Response get_ownership_holders(id)

Holders of a company or fund

Holders of a company or fund

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnershipReportBuilder
from fds.sdk.FactSetOwnershipReportBuilder.api import ownership_api
from fds.sdk.FactSetOwnershipReportBuilder.model.response import Response
from fds.sdk.FactSetOwnershipReportBuilder.model.error_response import ErrorResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetOwnershipReportBuilder.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOwnershipReportBuilder.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOwnershipReportBuilder.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ownership_api.OwnershipApi(api_client)

    id = "FDS" # str | Company or Fund Identifier
    asset_type = "EQUITY" # str | Controls the Asset Type of the data returned (optional) (default to "EQUITY")
    holder_type = "INSTITUTIONS" # str | Controls the Holder Type of the data returned (optional) (default to "INSTITUTIONS")
    topn = "ALL" # str | Limits the number of holders returned based on their Market Value position in the security.   Default is ALL, otherwise use a valid number above 0.  (optional)
    date = "2019-12-31" # str | Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. (optional)

    try:
        # Holders of a company or fund
        api_response = api_instance.get_ownership_holders(id, asset_type=asset_type, holder_type=holder_type, topn=topn, date=date)
        pprint(api_response)

    except fds.sdk.FactSetOwnershipReportBuilder.ApiException as e:
        print("Exception when calling OwnershipApi->get_ownership_holders: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Company or Fund Identifier |
 **asset_type** | **str**| Controls the Asset Type of the data returned | [optional] if omitted the server will use the default value of "EQUITY"
 **holder_type** | **str**| Controls the Holder Type of the data returned | [optional] if omitted the server will use the default value of "INSTITUTIONS"
 **topn** | **str**| Limits the number of holders returned based on their Market Value position in the security.   Default is ALL, otherwise use a valid number above 0.  | [optional]
 **date** | **str**| Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response; returns JSON data containing STACH 2.0 row organized package format |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  |
**400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  |
**401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
**403** | User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
**404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
**429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
**500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
**503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


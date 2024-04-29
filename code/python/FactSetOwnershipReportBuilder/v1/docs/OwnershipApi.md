# fds.sdk.FactSetOwnershipReportBuilder.OwnershipApi

All URIs are relative to *https://api.factset.com/report/ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ownership_holders**](OwnershipApi.md#get_ownership_holders) | **GET** /holders | Holders of a company or fund
[**get_ownership_ultimate_parent**](OwnershipApi.md#get_ownership_ultimate_parent) | **GET** /ultimate-parent | Get FactSet&#39;s ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.



# **get_ownership_holders**
> ResponseHolders get_ownership_holders(id)

Holders of a company or fund

Holders of a company or fund

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnershipReportBuilder
from fds.sdk.FactSetOwnershipReportBuilder.api import ownership_api
from fds.sdk.FactSetOwnershipReportBuilder.models import *
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

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "FDS-US" # str | Company or Fund Identifier
    asset_type = "EQUITY" # str | Controls the Asset Type of the data returned (optional) if omitted the server will use the default value of "EQUITY"
    holder_type = "INSTITUTIONS" # str | Controls the Holder Type of the data returned (optional) if omitted the server will use the default value of "INSTITUTIONS"
    entity_type = "SECURITY" # str | Controls the type of Entity data returned. Defaults to Security data, but can also be used to display Company data. (optional) if omitted the server will use the default value of "SECURITY"
    topn = "ALL" # str | Limits the number of holders returned based on their Market Value position in the security. Default is ALL, otherwise use a valid number above 0.  (optional)
    date = dateutil_parser('Tue Dec 31 00:00:00 UTC 2019').date() # date | Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. (optional)

    try:
        # Holders of a company or fund
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ownership_holders(id, asset_type=asset_type, holder_type=holder_type, entity_type=entity_type, topn=topn, date=date)

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
 **entity_type** | **str**| Controls the type of Entity data returned. Defaults to Security data, but can also be used to display Company data. | [optional] if omitted the server will use the default value of "SECURITY"
 **topn** | **str**| Limits the number of holders returned based on their Market Value position in the security. Default is ALL, otherwise use a valid number above 0.  | [optional]
 **date** | **date**| Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. | [optional]

### Return type

[**ResponseHolders**](ResponseHolders.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response; returns JSON data containing STACH 2.0 row organized package format |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
**400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
**401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
**403** | User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
**404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
**429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
**500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
**503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ownership_ultimate_parent**
> ResponseUltimateParent get_ownership_ultimate_parent(id)

Get FactSet's ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.

Get FactSet's ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnershipReportBuilder
from fds.sdk.FactSetOwnershipReportBuilder.api import ownership_api
from fds.sdk.FactSetOwnershipReportBuilder.models import *
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

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "FDS-US" # str | Any valid FactSet identifier which points to a security.  This could be Ticker Region, Entity ID, CUSIP, or SEDOL. 
    currency = "LOCAL" # str | Currency ISO code that any currency-based data should be returned in.  If excluded, the value will default to the special keyword \"LOCAL\" which will cause the currency-based values to be calculated in currency which is local to the exchange it is traded on.  (optional)
    attributes = ["percentOwnership","position","positionChange","marketValue","marketValueChange","percentPortfolio","reportDate","source","holderId"] # [str] | The columns to be returned in the resulting table (optional) if omitted the server will use the default value of ["percentOwnership","position","positionChange","marketValue","marketValueChange","percentPortfolio","reportDate","source","holderId"]
    period = "6m" # str | The period over which we should return holdings for. (optional) if omitted the server will use the default value of "6m"
    holder_type = "institutions" # str | The holder types which should be included in this table (optional) if omitted the server will use the default value of "institutions"
    date = dateutil_parser('Tue Dec 31 00:00:00 UTC 2019').date() # date | The date as of which this data should be returned. YYYY-MM-DD format. Defaults to current date. (optional)

    try:
        # Get FactSet's ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ownership_ultimate_parent(id, currency=currency, attributes=attributes, period=period, holder_type=holder_type, date=date)

        pprint(api_response)

    except fds.sdk.FactSetOwnershipReportBuilder.ApiException as e:
        print("Exception when calling OwnershipApi->get_ownership_ultimate_parent: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Any valid FactSet identifier which points to a security.  This could be Ticker Region, Entity ID, CUSIP, or SEDOL.  |
 **currency** | **str**| Currency ISO code that any currency-based data should be returned in.  If excluded, the value will default to the special keyword \&quot;LOCAL\&quot; which will cause the currency-based values to be calculated in currency which is local to the exchange it is traded on.  | [optional]
 **attributes** | **[str]**| The columns to be returned in the resulting table | [optional] if omitted the server will use the default value of ["percentOwnership","position","positionChange","marketValue","marketValueChange","percentPortfolio","reportDate","source","holderId"]
 **period** | **str**| The period over which we should return holdings for. | [optional] if omitted the server will use the default value of "6m"
 **holder_type** | **str**| The holder types which should be included in this table | [optional] if omitted the server will use the default value of "institutions"
 **date** | **date**| The date as of which this data should be returned. YYYY-MM-DD format. Defaults to current date. | [optional]

### Return type

[**ResponseUltimateParent**](ResponseUltimateParent.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response; returns JSON data containing STACH 3.1 table format |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
**400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
**401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
**403** | User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
**404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
**429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
**500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
**503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


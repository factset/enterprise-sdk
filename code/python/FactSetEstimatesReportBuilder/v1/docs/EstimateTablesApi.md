# fds.sdk.FactSetEstimatesReportBuilder.EstimateTablesApi

All URIs are relative to *https://api.factset.com/report/estimates/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_estimate_tables_table**](EstimateTablesApi.md#get_estimate_tables_table) | **GET** /table | Interim/Annual Estimate Table


# **get_estimate_tables_table**
> Response get_estimate_tables_table(id)

Interim/Annual Estimate Table

Returns a timeseries grid of Interim and Annual data for a single line item

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimatesReportBuilder
from fds.sdk.FactSetEstimatesReportBuilder.api import estimate_tables_api
from fds.sdk.FactSetEstimatesReportBuilder.model.response import Response
from fds.sdk.FactSetEstimatesReportBuilder.model.error_response import ErrorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/report/estimates/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetEstimatesReportBuilder.Configuration(
    host = "https://api.factset.com/report/estimates/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetEstimatesReportBuilder.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetEstimatesReportBuilder.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimatesReportBuilder.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = estimate_tables_api.EstimateTablesApi(api_client)
    id = "FDS" # str | Company Ticker
    metric = "EPS" # str | Requested metric. For more details, visit [Online Assitant Page #15034](https://oa.apps.factset.com/pages/15034). (optional)

    # example passing only required values which don't have defaults set
    try:
        # Interim/Annual Estimate Table
        api_response = api_instance.get_estimate_tables_table(id)
        pprint(api_response)
    except fds.sdk.FactSetEstimatesReportBuilder.ApiException as e:
        print("Exception when calling EstimateTablesApi->get_estimate_tables_table: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Interim/Annual Estimate Table
        api_response = api_instance.get_estimate_tables_table(id, metric=metric)
        pprint(api_response)
    except fds.sdk.FactSetEstimatesReportBuilder.ApiException as e:
        print("Exception when calling EstimateTablesApi->get_estimate_tables_table: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Company Ticker |
 **metric** | **str**| Requested metric. For more details, visit [Online Assitant Page #15034](https://oa.apps.factset.com/pages/15034). | [optional]

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


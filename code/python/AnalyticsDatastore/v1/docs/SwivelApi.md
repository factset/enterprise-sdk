# fds.sdk.AnalyticsDatastore.SwivelApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_swivel_endpoint**](SwivelApi.md#get_swivel_endpoint) | **GET** /analytics/pub-datastore/swivel/v1/{pubDoc}/{assetName}/{reportId}/{tileId}/{accountId} | Get Swivel endpoint, takes report parameter inputs and returns the Cargo location for the specified report via a 302 redirect.


# **get_swivel_endpoint**
> [str] get_swivel_endpoint()

Get Swivel endpoint, takes report parameter inputs and returns the Cargo location for the specified report via a 302 redirect.

Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AnalyticsDatastore
from fds.sdk.AnalyticsDatastore.api import swivel_api
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.AnalyticsDatastore.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AnalyticsDatastore.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AnalyticsDatastore.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swivel_api.SwivelApi(api_client)

    pub_doc = "Analytics_Datastore" # str | The publisher document containing the report (default to "Analytics_Datastore")
    asset_name = "ADS_Demo.PA3" # str | The PA/SPAR asset name and extension (default to "ADS_Demo.PA3")
    report_id = "report7" # str | The PA/SPAR report ID (default to "report7")
    tile_id = "tile0" # str | The PA/SPAR tile ID (default to "tile0")
    account_id = "LARGE_CORE" # str | The account ID (default to "LARGE_CORE")

    try:
        # Get Swivel endpoint, takes report parameter inputs and returns the Cargo location for the specified report via a 302 redirect.
        api_response = api_instance.get_swivel_endpoint(pub_doc, asset_name, report_id, tile_id, account_id)
        pprint(api_response)

    except fds.sdk.AnalyticsDatastore.ApiException as e:
        print("Exception when calling SwivelApi->get_swivel_endpoint: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pub_doc** | **str**| The publisher document containing the report | defaults to "Analytics_Datastore"
 **asset_name** | **str**| The PA/SPAR asset name and extension | defaults to "ADS_Demo.PA3"
 **report_id** | **str**| The PA/SPAR report ID | defaults to "report7"
 **tile_id** | **str**| The PA/SPAR tile ID | defaults to "tile0"
 **account_id** | **str**| The account ID | defaults to "LARGE_CORE"

### Return type

**[str]**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: headers


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response (when redirect followed), returns json response body of the report. |  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/pub-datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


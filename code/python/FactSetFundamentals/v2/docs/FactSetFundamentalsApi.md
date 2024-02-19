# fds.sdk.FactSetFundamentals.FactSetFundamentalsApi

All URIs are relative to *https://api.factset.com/content/factset-fundamentals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fds_fundamentals_for_list**](FactSetFundamentalsApi.md#get_fds_fundamentals_for_list) | **POST** /fundamentals | Returns Company Fundamental Data.



# **get_fds_fundamentals_for_list**
> FundamentalsResponse get_fds_fundamentals_for_list(fundamentals_request)

Returns Company Fundamental Data.

Retrieves FactSet Fundamental standardized data for specified securities. Use the ```/metrics``` endpoint to retrieve a full list of valid metrics or data items.   The ```/fundamentals``` endpoint currently supports Long Running asynchronous requests up to **20 minutes** via batch parameter. Id limits are increased to 30000 ids per request when using batch capability. This 30000 id limit has been derived based on single metric for one day. This feature is available for all users.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFundamentals
from fds.sdk.FactSetFundamentals.api import fact_set_fundamentals_api
from fds.sdk.FactSetFundamentals.models import *
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
configuration = fds.sdk.FactSetFundamentals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFundamentals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFundamentals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fact_set_fundamentals_api.FactSetFundamentalsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    fundamentals_request = FundamentalsRequest(
        data=FundamentalRequestBody(
            ids=IdsBatchMax30000(["FDS-US"]),
            periodicity=Periodicity("QTR"),
            fiscal_period=FiscalPeriod(
                start="2012-01-01",
                end="2014-01-01",
            ),
            metrics=Metrics(["FF_SALES"]),
            currency="USD",
            update_type=UpdateType("RP"),
            batch=Batch("N"),
        ),
    ) # FundamentalsRequest | Request object for requesting fundamentals data

    try:
        # Returns Company Fundamental Data.
        # example passing only required values which don't have defaults set
        api_response_wrapper = api_instance.get_fds_fundamentals_for_list(fundamentals_request)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.FactSetFundamentals.ApiException as e:
        print("Exception when calling FactSetFundamentalsApi->get_fds_fundamentals_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundamentals_request** | [**FundamentalsRequest**](FundamentalsRequest.md)| Request object for requesting fundamentals data |

### Return type

[**FundamentalsResponse**](FundamentalsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fundamental data items |  -  |
**202** | Batch request has been accepted. |  * Location - Path to Batch Request result. <br>  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


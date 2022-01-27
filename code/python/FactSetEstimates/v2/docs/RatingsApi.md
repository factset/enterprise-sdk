# fds.sdk.FactSetEstimates.RatingsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_consensus_ratings**](RatingsApi.md#get_consensus_ratings) | **GET** /factset-estimates/v2/consensus-ratings | Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
[**get_consensus_ratings_for_list**](RatingsApi.md#get_consensus_ratings_for_list) | **POST** /factset-estimates/v2/consensus-ratings | Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
[**get_detail_ratings**](RatingsApi.md#get_detail_ratings) | **GET** /factset-estimates/v2/detail-ratings | Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
[**get_detail_ratings_for_list**](RatingsApi.md#get_detail_ratings_for_list) | **POST** /factset-estimates/v2/detail-ratings | Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.


# **get_consensus_ratings**
> ConsensusRatingsResponse get_consensus_ratings(ids)

Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.

Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import ratings_api
from fds.sdk.FactSetEstimates.model.consensus_ratings_response import ConsensusRatingsResponse
from fds.sdk.FactSetEstimates.model.error_response import ErrorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetEstimates.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetEstimates.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ratings_api.RatingsApi(api_client)
    ids = ["AAPL-USA"] # [str] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
    start_date = "2019-07-30" # str | Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
    end_date = "2020-07-30" # str | End date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
    frequency = "D" # str | Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.   (optional) if omitted the server will use the default value of "D"

    # example passing only required values which don't have defaults set
    try:
        # Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
        api_response = api_instance.get_consensus_ratings(ids)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling RatingsApi->get_consensus_ratings: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
        api_response = api_instance.get_consensus_ratings(ids, start_date=start_date, end_date=end_date, frequency=frequency)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling RatingsApi->get_consensus_ratings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  |
 **start_date** | **str**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]
 **end_date** | **str**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]
 **frequency** | **str**| Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.   | [optional] if omitted the server will use the default value of "D"

### Return type

[**ConsensusRatingsResponse**](ConsensusRatingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Estimate data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_consensus_ratings_for_list**
> ConsensusRatingsResponse get_consensus_ratings_for_list(consensus_ratings_request)

Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.

Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import ratings_api
from fds.sdk.FactSetEstimates.model.consensus_ratings_request import ConsensusRatingsRequest
from fds.sdk.FactSetEstimates.model.consensus_ratings_response import ConsensusRatingsResponse
from fds.sdk.FactSetEstimates.model.error_response import ErrorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetEstimates.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetEstimates.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ratings_api.RatingsApi(api_client)
    consensus_ratings_request = ConsensusRatingsRequest(
        ids=Ids(["FDS-US"]),
        start_date="2019-01-01",
        end_date="2019-12-31",
        frequency=Frequency("AM"),
    ) # ConsensusRatingsRequest | Request object for Estimate Data Items.

    # example passing only required values which don't have defaults set
    try:
        # Ratings consensus estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
        api_response = api_instance.get_consensus_ratings_for_list(consensus_ratings_request)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling RatingsApi->get_consensus_ratings_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consensus_ratings_request** | [**ConsensusRatingsRequest**](ConsensusRatingsRequest.md)| Request object for Estimate Data Items. |

### Return type

[**ConsensusRatingsResponse**](ConsensusRatingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Estimate data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_detail_ratings**
> DetailRatingsResponse get_detail_ratings(ids)

Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.

Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, Overweight, and Underweight. <p>The `startDate` and `endDate` parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company's reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import ratings_api
from fds.sdk.FactSetEstimates.model.detail_ratings_response import DetailRatingsResponse
from fds.sdk.FactSetEstimates.model.error_response import ErrorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetEstimates.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetEstimates.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ratings_api.RatingsApi(api_client)
    ids = ["AAPL-USA"] # [str] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
    start_date = "2019-07-30" # str | Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
    end_date = "2020-07-30" # str | End date for point in time of estimates expressed in YYYY-MM-DD format. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
        api_response = api_instance.get_detail_ratings(ids)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling RatingsApi->get_detail_ratings: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
        api_response = api_instance.get_detail_ratings(ids, start_date=start_date, end_date=end_date)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling RatingsApi->get_detail_ratings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  |
 **start_date** | **str**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]
 **end_date** | **str**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]

### Return type

[**DetailRatingsResponse**](DetailRatingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Estimate Ratings data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_detail_ratings_for_list**
> DetailRatingsResponse get_detail_ratings_for_list(detail_ratings_request)

Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.

Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, Overweight, and Underweight. <p>The `startDate` and `endDate` parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company's reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import ratings_api
from fds.sdk.FactSetEstimates.model.detail_ratings_response import DetailRatingsResponse
from fds.sdk.FactSetEstimates.model.error_response import ErrorResponse
from fds.sdk.FactSetEstimates.model.detail_ratings_request import DetailRatingsRequest
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetEstimates.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetEstimates.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ratings_api.RatingsApi(api_client)
    detail_ratings_request = DetailRatingsRequest(
        ids=Ids(["FDS-US"]),
        start_date="2019-01-01",
        end_date="2019-12-31",
    ) # DetailRatingsRequest | Request object for Detail Reatings Data Items.

    # example passing only required values which don't have defaults set
    try:
        # Broker Detail estimates to fetch Buy, Overweight, Hold, Underweight, and Sell.
        api_response = api_instance.get_detail_ratings_for_list(detail_ratings_request)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling RatingsApi->get_detail_ratings_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **detail_ratings_request** | [**DetailRatingsRequest**](DetailRatingsRequest.md)| Request object for Detail Reatings Data Items. |

### Return type

[**DetailRatingsResponse**](DetailRatingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Estimate Detail Ratings data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


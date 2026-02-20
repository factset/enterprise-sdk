# fds.sdk.FactSetEstimates.RatingsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_consensus_ratings**](RatingsApi.md#get_consensus_ratings) | **GET** /factset-estimates/v2/consensus-ratings | Ratings consensus estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
[**get_consensus_ratings_for_list**](RatingsApi.md#get_consensus_ratings_for_list) | **POST** /factset-estimates/v2/consensus-ratings | Ratings consensus estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
[**get_detail_ratings**](RatingsApi.md#get_detail_ratings) | **GET** /factset-estimates/v2/detail-ratings | Broker Detail estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
[**get_detail_ratings_for_list**](RatingsApi.md#get_detail_ratings_for_list) | **POST** /factset-estimates/v2/detail-ratings | Broker Detail estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.



# **get_consensus_ratings**
> ConsensusRatingsResponse get_consensus_ratings(ids)

Ratings consensus estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.

Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import ratings_api
from fds.sdk.FactSetEstimates.models import *
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
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ratings_api.RatingsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AAPL-USA"] # [str] | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. <p><b>Performance Note:</b> Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.</p> <p>If requesting long historical data, limit the history to <b>10 years per metric per ID</b>.</p> 
    start_date = dateutil_parser('2019-07-30').date() # date | Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
    end_date = dateutil_parser('2019-08-30').date() # date | End date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
    frequency = "D" # str | Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.  (optional) if omitted the server will use the default value of "D"

    try:
        # Ratings consensus estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_consensus_ratings(ids, start_date=start_date, end_date=end_date, frequency=frequency)

        pprint(api_response)

    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling RatingsApi->get_consensus_ratings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  |
 **start_date** | **date**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]
 **end_date** | **date**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]
 **frequency** | **str**| Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.  | [optional] if omitted the server will use the default value of "D"

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

Ratings consensus estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.

Returns ratings from the FactSet Estimates database for current and historical for an individual security using rolling fiscal dates as of a specific date. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import ratings_api
from fds.sdk.FactSetEstimates.models import *
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
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ratings_api.RatingsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    consensus_ratings_request = ConsensusRatingsRequest(
        ids=Ids(["FDS-US"]),
        start_date=dateutil_parser('Tue Jan 01 00:00:00 UTC 2019').date(),
        end_date=dateutil_parser('Tue Dec 31 00:00:00 UTC 2019').date(),
        frequency=Frequency("AM"),
    ) # ConsensusRatingsRequest | Request object for Estimate Data Items.

    try:
        # Ratings consensus estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
        # example passing only required values which don't have defaults set
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

Broker Detail estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.

Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, overWeight, and underWeight. <p>The `startDate` and `endDate` parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company's reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.</p> 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import ratings_api
from fds.sdk.FactSetEstimates.models import *
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
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ratings_api.RatingsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AAPL-USA"] # [str] | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. <p><b>Performance Note:</b> Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.</p> <p>If requesting long historical data, limit the history to <b>10 years per metric per ID</b>.</p> 
    start_date = dateutil_parser('2019-07-30').date() # date | Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
    end_date = dateutil_parser('2019-08-30').date() # date | End date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
    include_all = False # bool | Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** = Returns all the brokers included and excluded in the consensus   * **FALSE** = Returns only the broker details included in the consensus  (optional) if omitted the server will use the default value of False
    broker_names = ["Morningstar Equity Research"] # [str] | Filter to return estimate data from specific brokers only. Accepts broker names as input.  The endpoint returns data from all available brokers if this parameter is not specified. For a list of available brokers, visit [Online Assistant Page #14706](https://oa.apps.factset.com/pages/14706). (optional)
    updates_only = False # bool | When set to 'true', the endpoint returns the first reported estimates during this period and any subsequent changes reported by the brokers. When set to 'false', data is returned for all dates in the requested date range based on the selected frequency. If unspecified, it is treated as 'false' by default. (optional) if omitted the server will use the default value of False

    try:
        # Broker Detail estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_detail_ratings(ids, start_date=start_date, end_date=end_date, include_all=include_all, broker_names=broker_names, updates_only=updates_only)

        pprint(api_response)

    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling RatingsApi->get_detail_ratings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  |
 **start_date** | **date**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]
 **end_date** | **date**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]
 **include_all** | **bool**| Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** &#x3D; Returns all the brokers included and excluded in the consensus   * **FALSE** &#x3D; Returns only the broker details included in the consensus  | [optional] if omitted the server will use the default value of False
 **broker_names** | **[str]**| Filter to return estimate data from specific brokers only. Accepts broker names as input.  The endpoint returns data from all available brokers if this parameter is not specified. For a list of available brokers, visit [Online Assistant Page #14706](https://oa.apps.factset.com/pages/14706). | [optional]
 **updates_only** | **bool**| When set to &#39;true&#39;, the endpoint returns the first reported estimates during this period and any subsequent changes reported by the brokers. When set to &#39;false&#39;, data is returned for all dates in the requested date range based on the selected frequency. If unspecified, it is treated as &#39;false&#39; by default. | [optional] if omitted the server will use the default value of False

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

Broker Detail estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.

Retrieves the Broker Level ratings for the requested Id and date range. Ratings include Buy, Hold, Sell, overWeight, and underWeight. <p>The `startDate` and `endDate` parameters controls the range of perspective dates. By default, the service will return the range of estimateDates within the latest company's reporting period. As you expand the date range, additional full historical reporting periods and all ratings estimateDates per broker will be returned.</p> 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import ratings_api
from fds.sdk.FactSetEstimates.models import *
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
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ratings_api.RatingsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    detail_ratings_request = DetailRatingsRequest(
        ids=Ids(["FDS-US"]),
        start_date=dateutil_parser('Tue Jan 01 00:00:00 UTC 2019').date(),
        end_date=dateutil_parser('Tue Dec 31 00:00:00 UTC 2019').date(),
        include_all=False,
        broker_names=BrokerNames(["Morningstar Equity Research"]),
        updates_only=False,
    ) # DetailRatingsRequest | Request object for Detail Reatings Data Items.

    try:
        # Broker Detail estimates to fetch Buy, overWeight, Hold, underWeight, and Sell.
        # example passing only required values which don't have defaults set
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


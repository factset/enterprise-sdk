# fds.sdk.Signals.EventsApi

All URIs are relative to *https://api.factset.com/signals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_event_adaptive_card_by_id**](EventsApi.md#get_event_adaptive_card_by_id) | **GET** /events/adaptive-cards/{eventId} | 
[**get_event_adaptive_cards**](EventsApi.md#get_event_adaptive_cards) | **GET** /events/adaptive-cards | 
[**get_event_detail_by_id**](EventsApi.md#get_event_detail_by_id) | **GET** /events/details/{eventId} | 
[**get_event_details**](EventsApi.md#get_event_details) | **GET** /events/details | 
[**get_event_entities**](EventsApi.md#get_event_entities) | **GET** /events/entities | 
[**get_event_headlines**](EventsApi.md#get_event_headlines) | **GET** /events/headlines | 
[**post_event_details**](EventsApi.md#post_event_details) | **POST** /events/details | 
[**post_event_headlines**](EventsApi.md#post_event_headlines) | **POST** /events/headlines | 


# **get_event_adaptive_card_by_id**
> EventAdaptiveCard get_event_adaptive_card_by_id(event_id)



Fetch Microsoft's Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, for a single requested Signal event

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Signals
from fds.sdk.Signals.api import events_api
from fds.sdk.Signals.model.error_response import ErrorResponse
from fds.sdk.Signals.model.event_adaptive_card import EventAdaptiveCard
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Signals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Signals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Signals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = events_api.EventsApi(api_client)

    event_id = "eventId_example" # str | The UUID of the event to return.

    try:
        api_response = api_instance.get_event_adaptive_card_by_id(event_id)
        pprint(api_response)

    except fds.sdk.Signals.ApiException as e:
        print("Exception when calling EventsApi->get_event_adaptive_card_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_id** | **str**| The UUID of the event to return. |

### Return type

[**EventAdaptiveCard**](EventAdaptiveCard.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_event_adaptive_cards**
> EventAdaptiveCards get_event_adaptive_cards()



Fetch Microsoft's Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, based on the filtering criteria

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Signals
from fds.sdk.Signals.api import events_api
from fds.sdk.Signals.model.event_adaptive_cards import EventAdaptiveCards
from fds.sdk.Signals.model.relevance_score_range import RelevanceScoreRange
from fds.sdk.Signals.model.date_time_interval import DateTimeInterval
from fds.sdk.Signals.model.error_response import ErrorResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Signals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Signals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Signals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = events_api.EventsApi(api_client)

    created = DateTimeInterval(
        gt=dateutil_parser('2021-01-01T00:00:00Z'),
        gte=dateutil_parser('2021-01-01T00:00:00Z'),
        lt=dateutil_parser('2021-01-01T00:00:00Z'),
        lte=dateutil_parser('2021-01-01T00:00:00Z'),
    ) # DateTimeInterval | A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional)
    updated = DateTimeInterval(
        gt=dateutil_parser('2021-01-01T00:00:00Z'),
        gte=dateutil_parser('2021-01-01T00:00:00Z'),
        lt=dateutil_parser('2021-01-01T00:00:00Z'),
        lte=dateutil_parser('2021-01-01T00:00:00Z'),
    ) # DateTimeInterval | A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional)
    signal_ids = "dilutionTrigger,freeCashFlow" # str |  (optional)
    ids = "FDS-US,AMZN-US" # str | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. (optional)
    portfolios = "portfolios_example" # str | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb (optional)
    themes = "themes_example" # str | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional)
    categories = "categories_example" # str | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional)
    user_relevance_score = RelevanceScoreRange(
        gt=3.14,
        gte=3.14,
        lt=3.14,
        lte=3.14,
    ) # RelevanceScoreRange | A range for filtering signal events based on their relevancy score. (optional)
    sort = "-userRelevanceScore,-eventDate" # str | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). (optional)

    try:
        api_response = api_instance.get_event_adaptive_cards(created=created, updated=updated, signal_ids=signal_ids, ids=ids, portfolios=portfolios, themes=themes, categories=categories, user_relevance_score=user_relevance_score, sort=sort)
        pprint(api_response)

    except fds.sdk.Signals.ApiException as e:
        print("Exception when calling EventsApi->get_event_adaptive_cards: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **created** | **DateTimeInterval**| A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional]
 **updated** | **DateTimeInterval**| A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional]
 **signal_ids** | **str**|  | [optional]
 **ids** | **str**| Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional]
 **portfolios** | **str**| Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional]
 **themes** | **str**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional]
 **categories** | **str**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional]
 **user_relevance_score** | **RelevanceScoreRange**| A range for filtering signal events based on their relevancy score. | [optional]
 **sort** | **str**| Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). | [optional]

### Return type

[**EventAdaptiveCards**](EventAdaptiveCards.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_event_detail_by_id**
> EventDetail get_event_detail_by_id(event_id)



Fetch Signals event headlines plus all additional event details for a single requested Signal event

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Signals
from fds.sdk.Signals.api import events_api
from fds.sdk.Signals.model.event_detail import EventDetail
from fds.sdk.Signals.model.error_response import ErrorResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Signals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Signals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Signals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = events_api.EventsApi(api_client)

    event_id = "eventId_example" # str | The UUID of the event to return.

    try:
        api_response = api_instance.get_event_detail_by_id(event_id)
        pprint(api_response)

    except fds.sdk.Signals.ApiException as e:
        print("Exception when calling EventsApi->get_event_detail_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_id** | **str**| The UUID of the event to return. |

### Return type

[**EventDetail**](EventDetail.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_event_details**
> EventDetails get_event_details()



Fetch Signals event headlines plus all additional event details based on the filtering criteria

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Signals
from fds.sdk.Signals.api import events_api
from fds.sdk.Signals.model.relevance_score_range import RelevanceScoreRange
from fds.sdk.Signals.model.date_time_interval import DateTimeInterval
from fds.sdk.Signals.model.event_details import EventDetails
from fds.sdk.Signals.model.error_response import ErrorResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Signals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Signals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Signals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = events_api.EventsApi(api_client)

    created = DateTimeInterval(
        gt=dateutil_parser('2021-01-01T00:00:00Z'),
        gte=dateutil_parser('2021-01-01T00:00:00Z'),
        lt=dateutil_parser('2021-01-01T00:00:00Z'),
        lte=dateutil_parser('2021-01-01T00:00:00Z'),
    ) # DateTimeInterval | A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional)
    updated = DateTimeInterval(
        gt=dateutil_parser('2021-01-01T00:00:00Z'),
        gte=dateutil_parser('2021-01-01T00:00:00Z'),
        lt=dateutil_parser('2021-01-01T00:00:00Z'),
        lte=dateutil_parser('2021-01-01T00:00:00Z'),
    ) # DateTimeInterval | A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional)
    signal_ids = "dilutionTrigger,freeCashFlow" # str |  (optional)
    ids = "FDS-US,AMZN-US" # str | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. (optional)
    portfolios = "portfolios_example" # str | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb (optional)
    themes = "themes_example" # str | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional)
    categories = "categories_example" # str | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional)
    user_relevance_score = RelevanceScoreRange(
        gt=3.14,
        gte=3.14,
        lt=3.14,
        lte=3.14,
    ) # RelevanceScoreRange | A range for filtering signal events based on their relevancy score. (optional)
    sort = "-userRelevanceScore,-eventDate" # str | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). (optional)

    try:
        api_response = api_instance.get_event_details(created=created, updated=updated, signal_ids=signal_ids, ids=ids, portfolios=portfolios, themes=themes, categories=categories, user_relevance_score=user_relevance_score, sort=sort)
        pprint(api_response)

    except fds.sdk.Signals.ApiException as e:
        print("Exception when calling EventsApi->get_event_details: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **created** | **DateTimeInterval**| A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional]
 **updated** | **DateTimeInterval**| A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional]
 **signal_ids** | **str**|  | [optional]
 **ids** | **str**| Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional]
 **portfolios** | **str**| Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional]
 **themes** | **str**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional]
 **categories** | **str**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional]
 **user_relevance_score** | **RelevanceScoreRange**| A range for filtering signal events based on their relevancy score. | [optional]
 **sort** | **str**| Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). | [optional]

### Return type

[**EventDetails**](EventDetails.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_event_entities**
> EventsEntities get_event_entities()



Fetch FactSet entity IDs for events that match the filtering criteria

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Signals
from fds.sdk.Signals.api import events_api
from fds.sdk.Signals.model.relevance_score_range import RelevanceScoreRange
from fds.sdk.Signals.model.events_entities import EventsEntities
from fds.sdk.Signals.model.date_time_interval import DateTimeInterval
from fds.sdk.Signals.model.error_response import ErrorResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Signals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Signals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Signals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = events_api.EventsApi(api_client)

    created = DateTimeInterval(
        gt=dateutil_parser('2021-01-01T00:00:00Z'),
        gte=dateutil_parser('2021-01-01T00:00:00Z'),
        lt=dateutil_parser('2021-01-01T00:00:00Z'),
        lte=dateutil_parser('2021-01-01T00:00:00Z'),
    ) # DateTimeInterval | A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional)
    updated = DateTimeInterval(
        gt=dateutil_parser('2021-01-01T00:00:00Z'),
        gte=dateutil_parser('2021-01-01T00:00:00Z'),
        lt=dateutil_parser('2021-01-01T00:00:00Z'),
        lte=dateutil_parser('2021-01-01T00:00:00Z'),
    ) # DateTimeInterval | A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional)
    signal_ids = "dilutionTrigger,freeCashFlow" # str |  (optional)
    themes = "themes_example" # str | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional)
    categories = "categories_example" # str | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional)
    user_relevance_score = RelevanceScoreRange(
        gt=3.14,
        gte=3.14,
        lt=3.14,
        lte=3.14,
    ) # RelevanceScoreRange | A range for filtering signal events based on their relevancy score. (optional)

    try:
        api_response = api_instance.get_event_entities(created=created, updated=updated, signal_ids=signal_ids, themes=themes, categories=categories, user_relevance_score=user_relevance_score)
        pprint(api_response)

    except fds.sdk.Signals.ApiException as e:
        print("Exception when calling EventsApi->get_event_entities: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **created** | **DateTimeInterval**| A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional]
 **updated** | **DateTimeInterval**| A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional]
 **signal_ids** | **str**|  | [optional]
 **themes** | **str**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional]
 **categories** | **str**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional]
 **user_relevance_score** | **RelevanceScoreRange**| A range for filtering signal events based on their relevancy score. | [optional]

### Return type

[**EventsEntities**](EventsEntities.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_event_headlines**
> EventHeadlines get_event_headlines()



Fetch Signals event headlines based on the filtering criteria

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Signals
from fds.sdk.Signals.api import events_api
from fds.sdk.Signals.model.relevance_score_range import RelevanceScoreRange
from fds.sdk.Signals.model.date_time_interval import DateTimeInterval
from fds.sdk.Signals.model.error_response import ErrorResponse
from fds.sdk.Signals.model.event_headlines import EventHeadlines
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Signals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Signals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Signals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = events_api.EventsApi(api_client)

    created = DateTimeInterval(
        gt=dateutil_parser('2021-01-01T00:00:00Z'),
        gte=dateutil_parser('2021-01-01T00:00:00Z'),
        lt=dateutil_parser('2021-01-01T00:00:00Z'),
        lte=dateutil_parser('2021-01-01T00:00:00Z'),
    ) # DateTimeInterval | A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional)
    updated = DateTimeInterval(
        gt=dateutil_parser('2021-01-01T00:00:00Z'),
        gte=dateutil_parser('2021-01-01T00:00:00Z'),
        lt=dateutil_parser('2021-01-01T00:00:00Z'),
        lte=dateutil_parser('2021-01-01T00:00:00Z'),
    ) # DateTimeInterval | A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional)
    signal_ids = "dilutionTrigger,freeCashFlow" # str |  (optional)
    ids = "FDS-US,AMZN-US" # str | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. (optional)
    portfolios = "portfolios_example" # str | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb (optional)
    themes = "themes_example" # str | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional)
    categories = "categories_example" # str | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional)
    user_relevance_score = RelevanceScoreRange(
        gt=3.14,
        gte=3.14,
        lt=3.14,
        lte=3.14,
    ) # RelevanceScoreRange | A range for filtering signal events based on their relevancy score. (optional)
    sort = "-userRelevanceScore,-eventDate" # str | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). (optional)

    try:
        api_response = api_instance.get_event_headlines(created=created, updated=updated, signal_ids=signal_ids, ids=ids, portfolios=portfolios, themes=themes, categories=categories, user_relevance_score=user_relevance_score, sort=sort)
        pprint(api_response)

    except fds.sdk.Signals.ApiException as e:
        print("Exception when calling EventsApi->get_event_headlines: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **created** | **DateTimeInterval**| A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional]
 **updated** | **DateTimeInterval**| A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional]
 **signal_ids** | **str**|  | [optional]
 **ids** | **str**| Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional]
 **portfolios** | **str**| Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional]
 **themes** | **str**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional]
 **categories** | **str**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional]
 **user_relevance_score** | **RelevanceScoreRange**| A range for filtering signal events based on their relevancy score. | [optional]
 **sort** | **str**| Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). | [optional]

### Return type

[**EventHeadlines**](EventHeadlines.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_event_details**
> EventDetails post_event_details(event_request_body)



Fetch Signals event headlines plus all additional event details for up to 1000 identifiers

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Signals
from fds.sdk.Signals.api import events_api
from fds.sdk.Signals.model.event_details import EventDetails
from fds.sdk.Signals.model.event_request_body import EventRequestBody
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Signals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Signals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Signals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = events_api.EventsApi(api_client)

    event_request_body = EventRequestBody(
        created=None,
        updated=None,
        signal_ids="dilutionTrigger,freeCashFlow",
        ids="FDS-US,AMZN-US",
        portfolios="portfolios_example",
        themes="themes_example",
        categories="categories_example",
        user_relevance_score=None,
        sort="sort_example",
    ) # EventRequestBody | 

    try:
        api_response = api_instance.post_event_details(event_request_body)
        pprint(api_response)

    except fds.sdk.Signals.ApiException as e:
        print("Exception when calling EventsApi->post_event_details: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_request_body** | [**EventRequestBody**](EventRequestBody.md)|  |

### Return type

[**EventDetails**](EventDetails.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_event_headlines**
> EventHeadlines post_event_headlines(event_request_body)



Fetch Signals event headlines based on the filtering criteria for up to 1000 identifiers

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Signals
from fds.sdk.Signals.api import events_api
from fds.sdk.Signals.model.event_request_body import EventRequestBody
from fds.sdk.Signals.model.event_headlines import EventHeadlines
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Signals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Signals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Signals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = events_api.EventsApi(api_client)

    event_request_body = EventRequestBody(
        created=None,
        updated=None,
        signal_ids="dilutionTrigger,freeCashFlow",
        ids="FDS-US,AMZN-US",
        portfolios="portfolios_example",
        themes="themes_example",
        categories="categories_example",
        user_relevance_score=None,
        sort="sort_example",
    ) # EventRequestBody | 

    try:
        api_response = api_instance.post_event_headlines(event_request_body)
        pprint(api_response)

    except fds.sdk.Signals.ApiException as e:
        print("Exception when calling EventsApi->post_event_headlines: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_request_body** | [**EventRequestBody**](EventRequestBody.md)|  |

### Return type

[**EventHeadlines**](EventHeadlines.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


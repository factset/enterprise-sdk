# fds.sdk.EventsContribution.EventsContributionApi

All URIs are relative to *https://api.factset.com/events-contribution/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_event**](EventsContributionApi.md#delete_event) | **DELETE** /events/{eventId} | Delete Event data
[**insert_event**](EventsContributionApi.md#insert_event) | **POST** /events | Insert Event data
[**update_event**](EventsContributionApi.md#update_event) | **PUT** /events/{eventId} | Update Event data



# **delete_event**
> DeleteResponse delete_event(event_id)

Delete Event data

This endpoint allows you to delete a previously inserted event with the corresponding event id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsContribution
from fds.sdk.EventsContribution.api import events_contribution_api
from fds.sdk.EventsContribution.models import *
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
configuration = fds.sdk.EventsContribution.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.EventsContribution.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.EventsContribution.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = events_contribution_api.EventsContributionApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    event_id = "1234" # str | Id of event to be deleted

    try:
        # Delete Event data
        # example passing only required values which don't have defaults set
        api_response = api_instance.delete_event(event_id)

        pprint(api_response)

    except fds.sdk.EventsContribution.ApiException as e:
        print("Exception when calling EventsContributionApi->delete_event: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_id** | **str**| Id of event to be deleted |

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **insert_event**
> InsertResponse insert_event(insert_request)

Insert Event data

This endpoint inserts an event. Once the event is inserted, it will show up immediately among FactSet’s own event calendar apps, for display within FactSet’s applications.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsContribution
from fds.sdk.EventsContribution.api import events_contribution_api
from fds.sdk.EventsContribution.models import *
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
configuration = fds.sdk.EventsContribution.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.EventsContribution.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.EventsContribution.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = events_contribution_api.EventsContributionApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    insert_request = InsertRequest(
        data=InsertRequestData(
            event_data=EventData(
                event_id="1234",
                title="the event title",
                start_datetime=dateutil_parser('2024-01-16T08:00:00Z'),
                agenda_url="http://www.factset.com",
                participants=[
                    ParticipantsData(
                        first_name="Jane",
                        last_name="Doe",
                        title="CEO",
                    ),
                ],
                location=LocationData(
                    country="US",
                    state="New York",
                    city="New York",
                ),
                symbols=[
                    SymbolData(
                        type="ticker",
                        value="FDS",
                        name="FactSet System Research Inc.",
                    ),
                ],
                registration_info=RegistrationInfoData(
                    contact_email_address="factset@factset.com",
                    contact_name="FactSet",
                    extra_info="this field can be used to display extra information regarding registration",
                ),
            ),
        ),
    ) # InsertRequest | INSERT request body which needs to be sent with request

    try:
        # Insert Event data
        # example passing only required values which don't have defaults set
        api_response = api_instance.insert_event(insert_request)

        pprint(api_response)

    except fds.sdk.EventsContribution.ApiException as e:
        print("Exception when calling EventsContributionApi->insert_event: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insert_request** | [**InsertRequest**](InsertRequest.md)| INSERT request body which needs to be sent with request |

### Return type

[**InsertResponse**](InsertResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_event**
> UpdateResponse update_event(event_id, update_request)

Update Event data

This endpoint allows you to update a previously inserted event. Existing event will be replaced with the event data provided in the request body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsContribution
from fds.sdk.EventsContribution.api import events_contribution_api
from fds.sdk.EventsContribution.models import *
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
configuration = fds.sdk.EventsContribution.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.EventsContribution.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.EventsContribution.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = events_contribution_api.EventsContributionApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    event_id = "1234" # str | Id of event to be updated
    update_request = UpdateRequest(
        data=UpdateRequestData(
            event_data=EventUpdateData(
                title="the event title",
                start_datetime=dateutil_parser('2024-01-16T08:00:00Z'),
                agenda_url="http://www.factset.com",
                participants=[
                    ParticipantsData(
                        first_name="Jane",
                        last_name="Doe",
                        title="CEO",
                    ),
                ],
                location=LocationData(
                    country="US",
                    state="New York",
                    city="New York",
                ),
                symbols=[
                    SymbolData(
                        type="ticker",
                        value="FDS",
                        name="FactSet System Research Inc.",
                    ),
                ],
                registration_info=RegistrationInfoData(
                    contact_email_address="factset@factset.com",
                    contact_name="FactSet",
                    extra_info="this field can be used to display extra information regarding registration",
                ),
            ),
        ),
    ) # UpdateRequest | UPDATE request body which needs to be sent with request

    try:
        # Update Event data
        # example passing only required values which don't have defaults set
        api_response = api_instance.update_event(event_id, update_request)

        pprint(api_response)

    except fds.sdk.EventsContribution.ApiException as e:
        print("Exception when calling EventsContributionApi->update_event: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **event_id** | **str**| Id of event to be updated |
 **update_request** | [**UpdateRequest**](UpdateRequest.md)| UPDATE request body which needs to be sent with request |

### Return type

[**UpdateResponse**](UpdateResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


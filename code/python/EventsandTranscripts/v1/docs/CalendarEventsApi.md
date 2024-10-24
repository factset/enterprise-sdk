# fds.sdk.EventsandTranscripts.CalendarEventsApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_company_event**](CalendarEventsApi.md#get_company_event) | **POST** /calendar/events | Retrieve Company Event data



# **get_company_event**
> CompanyEventResponse get_company_event(company_event_request)

Retrieve Company Event data

This endpoint returns all company events with filters from the request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventsandTranscripts
from fds.sdk.EventsandTranscripts.api import calendar_events_api
from fds.sdk.EventsandTranscripts.models import *
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
configuration = fds.sdk.EventsandTranscripts.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.EventsandTranscripts.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.EventsandTranscripts.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = calendar_events_api.CalendarEventsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    company_event_request = CompanyEventRequest(
        data=CompanyEventRequestData(
            date_time=CompanyEventRequestDataDateTime(
                start=dateutil_parser('2022-12-01T00:00:00Z'),
                end=dateutil_parser('2022-12-31T22:59:02Z'),
            ),
            universe=CompanyEventRequestDataUniverse(
                symbols=["AAPL-US","MSFT-US","FDS-US"],
                type="Tickers",
            ),
            event_types=[
                "Earnings",
            ],
            last_modified_within="Today",
        ),
    ) # CompanyEventRequest | Company Event request body

    try:
        # Retrieve Company Event data
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_company_event(company_event_request)

        pprint(api_response)

    except fds.sdk.EventsandTranscripts.ApiException as e:
        print("Exception when calling CalendarEventsApi->get_company_event: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_event_request** | [**CompanyEventRequest**](CompanyEventRequest.md)| Company Event request body |

### Return type

[**CompanyEventResponse**](CompanyEventResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The company events based on provided filters from the request. |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# fds.sdk.EventCalendar.CompanyApi

All URIs are relative to *https://api.factset.com/event-calendar/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_company_event**](CompanyApi.md#get_company_event) | **POST** /company/event/list | Retrieve Company Event data



# **get_company_event**
> CompanyEventResponse get_company_event(company_event_request)

Retrieve Company Event data

This endpoint returns all company events with filters from the request.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.EventCalendar
from fds.sdk.EventCalendar.api import company_api
from fds.sdk.EventCalendar.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.EventCalendar.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.EventCalendar.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.EventCalendar.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_api.CompanyApi(api_client)

    company_event_request = CompanyEventRequest(
        data=CompanyEventRequestData(
            date=CompanyEventRequestDataDate(
                start=dateutil_parser('2022-12-01T00:00:00Z'),
                end=dateutil_parser('2022-12-31T22:59:02Z'),
            ),
            universe=CompanyEventRequestDataUniverse(
                symbols=["AAPL-US","MSFT-US","FDS-US"],
                type="tickers",
            ),
            types=[
                "E",
            ],
        ),
    ) # CompanyEventRequest | Company Event request body

    try:
        # Retrieve Company Event data
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_company_event(company_event_request)
        pprint(api_response)

    except fds.sdk.EventCalendar.ApiException as e:
        print("Exception when calling CompanyApi->get_company_event: %s\n" % e)
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
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# fds.sdk.FactSetBanks.SearchEntitiesApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_search_entities**](SearchEntitiesApi.md#get_search_entities) | **POST** /search-entities | Returns subsidiary and private affiliate entities for a parent ticker, entity ID, or name



# **get_search_entities**
> SearchEntitiesResponse get_search_entities(search_entities_request)

Returns subsidiary and private affiliate entities for a parent ticker, entity ID, or name

Finds the subsidiary or private affiliate entity IDs needed to query other Banks API endpoints from a given parent ticker, ultimate parent entity ID, or entity name. Several endpoints require an entity ID that differs from the parent's public ticker:  * `/financials`, `/branches`, and `/country-exposure` require bank entities from the parent company. * `/ubpr`, `/ucc1`, and `/deposit-rates` require the **subsidiary** bank entity, not the holding company. * `/ten-d` requires the **asset-backed trust** entity, not the subsidiary bank or holding company. For auto loan securitizations, the trust's ultimate parent may itself be a non-bank company (e.g., an auto manufacturer's finance arm like GM Financial, Toyota Financial, or Harley-Davidson Financial). * `/aum/ria` requires the **private Registered Investment Adviser** entity. * `/focus` requires the **private broker-dealer** entity.  Use `reportType` to select which of these destination endpoints you're resolving entities for; only entities eligible for that report type are returned, and the response's `reportType` field echoes back your selection. Pass the resulting `factsetEntityId` values into the `ids` field of the corresponding endpoint.  Not every bank has a holding company above it with its own ticker — for those, use `searchText` to look the entity up by (partial) name instead of `ids`. At least one of `ids` or `searchText` is required.  **Date filtering behavior:** * **No dates entered**: Returns only currently active subsidiaries (those with no end date). * **Dates entered**: Returns only subsidiaries active during the specified time period. * **End date is null**: The end date defaults to today's date for filtering purposes. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBanks
from fds.sdk.FactSetBanks.api import search_entities_api
from fds.sdk.FactSetBanks.models import *
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
configuration = fds.sdk.FactSetBanks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBanks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBanks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = search_entities_api.SearchEntitiesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    search_entities_request = SearchEntitiesRequest(
        data=SearchEntitiesRequestData(
            ids=["FITB-US"],
            report_type="DEPOSIT_RATES",
            start_date=dateutil_parser('Wed Jan 01 00:00:00 UTC 2020').date(),
            end_date=dateutil_parser('Tue Dec 31 00:00:00 UTC 2024').date(),
            search_text="Fifth Third",
        ),
        meta=RequestMeta(
            pagination=PaginationRequest(
                limit=100,
                offset=0,
            ),
        ),
    ) # SearchEntitiesRequest | 

    try:
        # Returns subsidiary and private affiliate entities for a parent ticker, entity ID, or name
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_search_entities(search_entities_request)

        pprint(api_response)

    except fds.sdk.FactSetBanks.ApiException as e:
        print("Exception when calling SearchEntitiesApi->get_search_entities: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_entities_request** | [**SearchEntitiesRequest**](SearchEntitiesRequest.md)|  |

### Return type

[**SearchEntitiesResponse**](SearchEntitiesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Search entity data |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested endpoint could not be found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


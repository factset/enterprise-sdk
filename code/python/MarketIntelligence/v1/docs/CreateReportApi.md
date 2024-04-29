# fds.sdk.MarketIntelligence.CreateReportApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_post**](CreateReportApi.md#create_post) | **POST** /create | Create new report templates including portfolio or market news and data.



# **create_post**
> PostResponseInfo create_post(miapi_post_request)

Create new report templates including portfolio or market news and data.

Endpoint to create a new Market Intelligence report. If you want to retrieve a report you created, use get-reports call mentioned below.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.MarketIntelligence
from fds.sdk.MarketIntelligence.api import create_report_api
from fds.sdk.MarketIntelligence.models import *
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
configuration = fds.sdk.MarketIntelligence.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.MarketIntelligence.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.MarketIntelligence.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = create_report_api.CreateReportApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    miapi_post_request = MIAPIPostRequest(
        report_name="Morning Portfolio Update",
        identifier="OEX",
        id_type="B",
        time_zone="EST5EDT",
        content=[
            PostRequestExample(
                section_id="top_news",
                filters="["MI_MARKET_SYNOPSIS","MI_TOP_STORIES","MI_ECONOMIC_CALENDAR","MI_WEB_STORIES"]",
            ),
        ],
    ) # MIAPIPostRequest | 

    try:
        # Create new report templates including portfolio or market news and data.
        # example passing only required values which don't have defaults set
        api_response = api_instance.create_post(miapi_post_request)

        pprint(api_response)

    except fds.sdk.MarketIntelligence.ApiException as e:
        print("Exception when calling CreateReportApi->create_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miapi_post_request** | [**MIAPIPostRequest**](MIAPIPostRequest.md)|  |

### Return type

[**PostResponseInfo**](PostResponseInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response, report created. |  -  |
**400** | Invalid identifier or Unknown error |  -  |
**401** | Missing/invalid Credentials or Authentication failure |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


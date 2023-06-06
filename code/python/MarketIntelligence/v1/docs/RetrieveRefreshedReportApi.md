# fds.sdk.MarketIntelligence.RetrieveRefreshedReportApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_data_report_id_get**](RetrieveRefreshedReportApi.md#get_data_report_id_get) | **GET** /get-data/{report_id} | Retrieve data for desired report.



# **get_data_report_id_get**
> FetchReportPollID get_data_report_id_get(report_id)

Retrieve data for desired report.

Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. If the report has been refreshed within 1 hour, the report data from the most recent refresh will be returned.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.MarketIntelligence
from fds.sdk.MarketIntelligence.api import retrieve_refreshed_report_api
from fds.sdk.MarketIntelligence.models import *
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
    api_instance = retrieve_refreshed_report_api.RetrieveRefreshedReportApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    report_id = "report_id_example" # str | example: 65ba6dd63fb366464646426d0b

    try:
        # Retrieve data for desired report.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_data_report_id_get(report_id)

        pprint(api_response)

    except fds.sdk.MarketIntelligence.ApiException as e:
        print("Exception when calling RetrieveRefreshedReportApi->get_data_report_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **str**| example: 65ba6dd63fb366464646426d0b |

### Return type

[**FetchReportPollID**](FetchReportPollID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. If the report requested has been refreshed within an hour, the report data will be returned. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. |  -  |
**202** | Your report is being processed. Please Check again after sometime. |  -  |
**400** | Unknown Error. |  -  |
**401** | Missing/invalid Credentials or authentication failure |  -  |
**503** | Unrecognized report_id |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# fds.sdk.ProposalGenerationEngine.LookupApi

All URIs are relative to *https://api.factset.com/analytics/engines/proposal-generation/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_securities**](LookupApi.md#get_securities) | **GET** /securities | 



# **get_securities**
> PagedSecurities get_securities()



search for securities within the security universe for the user/client

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProposalGenerationEngine
from fds.sdk.ProposalGenerationEngine.api import lookup_api
from fds.sdk.ProposalGenerationEngine.models import *
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
configuration = fds.sdk.ProposalGenerationEngine.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProposalGenerationEngine.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProposalGenerationEngine.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = lookup_api.LookupApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    name = "Amazon" # str | search by (part of) security name (optional)
    identifier = "AMZN" # str | search by security identifier (e.g. cusip or tradingSymbol). (optional)
    as_of_date = "latestMonthEnd" # str | search only within valid securities for the specified asOfDate. The value should be in YYYY-MM-DD format. A special wildcard value 'latestMonthEnd' is supported as well (optional)
    udfs = "maxFrontLoad,assetAllocation" # str | specify list of UDFs to retrieve for every security in the result (optional)
    pagination_offset = 500 # int | Specifies the starting index for pagination. (optional)
    pagination_limit = 1 # int | Specifies the maximum number of results to return (optional)

    try:
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_securities(name=name, identifier=identifier, as_of_date=as_of_date, udfs=udfs, pagination_offset=pagination_offset, pagination_limit=pagination_limit)

        pprint(api_response)

    except fds.sdk.ProposalGenerationEngine.ApiException as e:
        print("Exception when calling LookupApi->get_securities: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| search by (part of) security name | [optional]
 **identifier** | **str**| search by security identifier (e.g. cusip or tradingSymbol). | [optional]
 **as_of_date** | **str**| search only within valid securities for the specified asOfDate. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well | [optional]
 **udfs** | **str**| specify list of UDFs to retrieve for every security in the result | [optional]
 **pagination_offset** | **int**| Specifies the starting index for pagination. | [optional]
 **pagination_limit** | **int**| Specifies the maximum number of results to return | [optional]

### Return type

[**PagedSecurities**](PagedSecurities.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of investments |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


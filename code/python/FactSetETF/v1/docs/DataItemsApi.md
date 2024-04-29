# fds.sdk.FactSetETF.DataItemsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_etf_metrics**](DataItemsApi.md#get_etf_metrics) | **GET** /factset-etf/v1/metrics | Available ETF metrics



# **get_etf_metrics**
> MetricsResponse get_etf_metrics()

Available ETF metrics

Returns a list of available metrics that can be used in the `metrics` parameter of related endpoints. Leave _category_ blank to request all available items. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetETF
from fds.sdk.FactSetETF.api import data_items_api
from fds.sdk.FactSetETF.models import *
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
configuration = fds.sdk.FactSetETF.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetETF.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetETF.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = data_items_api.DataItemsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    category = Category("BENCHMARK_DETAILS") # Category | The available categories that can be used to select collections of metrics for use within the ETF endpoints. |category|description| |---|---| |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark| |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.| |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.| |COUNTERPARTY|Credit and Swap Counterparty details| |CREATE_REDEEM|Creation and Redemption Sizes| |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.| |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains| |DOCUMENTATION|Details surrounding reporting information.| |GEARING|Leverage factors, inverse flags, and more.| |HEDGE|Hedging Information| |RISK|CIFSC Risk Ratings| |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details| |STATUS|Actively Managed Flags| |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.| |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.| |TAX|Tax Types, distribution takes, K1 Flags, and more.|  (optional)

    try:
        # Available ETF metrics
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_etf_metrics(category=category)

        pprint(api_response)

    except fds.sdk.FactSetETF.ApiException as e:
        print("Exception when calling DataItemsApi->get_etf_metrics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **Category**| The available categories that can be used to select collections of metrics for use within the ETF endpoints. |category|description| |---|---| |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark| |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.| |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.| |COUNTERPARTY|Credit and Swap Counterparty details| |CREATE_REDEEM|Creation and Redemption Sizes| |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.| |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains| |DOCUMENTATION|Details surrounding reporting information.| |GEARING|Leverage factors, inverse flags, and more.| |HEDGE|Hedging Information| |RISK|CIFSC Risk Ratings| |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details| |STATUS|Actively Managed Flags| |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.| |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.| |TAX|Tax Types, distribution takes, K1 Flags, and more.|  | [optional]

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Metrics Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


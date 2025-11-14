# fds.sdk.FactSetPartnerFunds.CanadianMutualFundDataFromFundataApi

All URIs are relative to *https://api.factset.com/content/partner-funds/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_asset_allocations**](CanadianMutualFundDataFromFundataApi.md#get_asset_allocations) | **GET** /fundata/asset-allocations | Fund asset allocations
[**get_distribution**](CanadianMutualFundDataFromFundataApi.md#get_distribution) | **GET** /fundata/distribution | Fund distributions
[**get_fees**](CanadianMutualFundDataFromFundataApi.md#get_fees) | **GET** /fundata/fees | Fund fees
[**get_geographic_allocations**](CanadianMutualFundDataFromFundataApi.md#get_geographic_allocations) | **GET** /fundata/geographic-allocations | Fund geographic allocations
[**get_growth_of_ten_k**](CanadianMutualFundDataFromFundataApi.md#get_growth_of_ten_k) | **GET** /fundata/growth-of-10k | Fund growth of 10K
[**get_holdings**](CanadianMutualFundDataFromFundataApi.md#get_holdings) | **GET** /fundata/holdings | Fund holdings
[**get_profile**](CanadianMutualFundDataFromFundataApi.md#get_profile) | **GET** /fundata/profile | Fund profile
[**get_rankings**](CanadianMutualFundDataFromFundataApi.md#get_rankings) | **GET** /fundata/rankings | Fund rankings
[**get_returns**](CanadianMutualFundDataFromFundataApi.md#get_returns) | **GET** /fundata/returns | Fund returns
[**get_risk**](CanadianMutualFundDataFromFundataApi.md#get_risk) | **GET** /fundata/risk | Fund risk
[**get_sector_allocations**](CanadianMutualFundDataFromFundataApi.md#get_sector_allocations) | **GET** /fundata/sector-allocations | Fund sector allocations



# **get_asset_allocations**
> AssetAllocationsResponse get_asset_allocations(ids)

Fund asset allocations

This endpoint provides asset allocations for Canadian mutual fund aggregated by asset. The result is default sorted in descending order of asset weight of the fund.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPartnerFunds
from fds.sdk.FactSetPartnerFunds.api import canadian_mutual_fund_data_from_fundata_api
from fds.sdk.FactSetPartnerFunds.models import *
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
configuration = fds.sdk.FactSetPartnerFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPartnerFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPartnerFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = canadian_mutual_fund_data_from_fundata_api.CanadianMutualFundDataFromFundataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AGF10450"] # [str] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
    language = "EN" # str | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English. (optional) if omitted the server will use the default value of "EN"
    sort = ["weight"] # [str] | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order. (optional) if omitted the server will use the default value of ["-weight"]

    try:
        # Fund asset allocations
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_asset_allocations(ids, language=language, sort=sort)

        pprint(api_response)

    except fds.sdk.FactSetPartnerFunds.ApiException as e:
        print("Exception when calling CanadianMutualFundDataFromFundataApi->get_asset_allocations: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **language** | **str**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] if omitted the server will use the default value of "EN"
 **sort** | **[str]**| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional] if omitted the server will use the default value of ["-weight"]

### Return type

[**AssetAllocationsResponse**](AssetAllocationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The asset allocation response object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_distribution**
> DistributionsResponse get_distribution(ids)

Fund distributions

This endpoint provides distribution data for Canadian mutual funds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPartnerFunds
from fds.sdk.FactSetPartnerFunds.api import canadian_mutual_fund_data_from_fundata_api
from fds.sdk.FactSetPartnerFunds.models import *
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
configuration = fds.sdk.FactSetPartnerFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPartnerFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPartnerFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = canadian_mutual_fund_data_from_fundata_api.CanadianMutualFundDataFromFundataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AGF10450"] # [str] | The fund identifiers. <p>***ids limit** = 10 per request*</p>

    try:
        # Fund distributions
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_distribution(ids)

        pprint(api_response)

    except fds.sdk.FactSetPartnerFunds.ApiException as e:
        print("Exception when calling CanadianMutualFundDataFromFundataApi->get_distribution: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |

### Return type

[**DistributionsResponse**](DistributionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The distribution response object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fees**
> FeesResponse get_fees(ids)

Fund fees

This endpoint provides fees data for Canadian mutual funds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPartnerFunds
from fds.sdk.FactSetPartnerFunds.api import canadian_mutual_fund_data_from_fundata_api
from fds.sdk.FactSetPartnerFunds.models import *
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
configuration = fds.sdk.FactSetPartnerFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPartnerFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPartnerFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = canadian_mutual_fund_data_from_fundata_api.CanadianMutualFundDataFromFundataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AGF10450"] # [str] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
    language = "EN" # str | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English. (optional) if omitted the server will use the default value of "EN"

    try:
        # Fund fees
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fees(ids, language=language)

        pprint(api_response)

    except fds.sdk.FactSetPartnerFunds.ApiException as e:
        print("Exception when calling CanadianMutualFundDataFromFundataApi->get_fees: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **language** | **str**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] if omitted the server will use the default value of "EN"

### Return type

[**FeesResponse**](FeesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The fees response object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_geographic_allocations**
> GeoAllocationsResponse get_geographic_allocations(ids)

Fund geographic allocations

This endpoint provides geographic allocations (which can be countries or regions) of the holdings within Canadian mutual funds. The result is default sorted in descending order of geographic weight of the fund.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPartnerFunds
from fds.sdk.FactSetPartnerFunds.api import canadian_mutual_fund_data_from_fundata_api
from fds.sdk.FactSetPartnerFunds.models import *
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
configuration = fds.sdk.FactSetPartnerFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPartnerFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPartnerFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = canadian_mutual_fund_data_from_fundata_api.CanadianMutualFundDataFromFundataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AGF10450"] # [str] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
    language = "EN" # str | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English. (optional) if omitted the server will use the default value of "EN"
    sort = ["weight"] # [str] | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order. (optional) if omitted the server will use the default value of ["-weight"]

    try:
        # Fund geographic allocations
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_geographic_allocations(ids, language=language, sort=sort)

        pprint(api_response)

    except fds.sdk.FactSetPartnerFunds.ApiException as e:
        print("Exception when calling CanadianMutualFundDataFromFundataApi->get_geographic_allocations: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **language** | **str**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] if omitted the server will use the default value of "EN"
 **sort** | **[str]**| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional] if omitted the server will use the default value of ["-weight"]

### Return type

[**GeoAllocationsResponse**](GeoAllocationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The geographic allocation response object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_growth_of_ten_k**
> GrowthOfTenKResponse get_growth_of_ten_k(ids)

Fund growth of 10K

This endpoint provides growth of 10K data for Canadian mutual funds. The result is default sorted in descending order of asOfDate.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPartnerFunds
from fds.sdk.FactSetPartnerFunds.api import canadian_mutual_fund_data_from_fundata_api
from fds.sdk.FactSetPartnerFunds.models import *
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
configuration = fds.sdk.FactSetPartnerFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPartnerFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPartnerFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = canadian_mutual_fund_data_from_fundata_api.CanadianMutualFundDataFromFundataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AGF10450"] # [str] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
    time_period = "1Y" # str | Periodicity or frequency of the fiscal period. (optional) if omitted the server will use the default value of "1Y"
    sort = ["weight"] # [str] | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order. (optional) if omitted the server will use the default value of ["-weight"]

    try:
        # Fund growth of 10K
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_growth_of_ten_k(ids, time_period=time_period, sort=sort)

        pprint(api_response)

    except fds.sdk.FactSetPartnerFunds.ApiException as e:
        print("Exception when calling CanadianMutualFundDataFromFundataApi->get_growth_of_ten_k: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **time_period** | **str**| Periodicity or frequency of the fiscal period. | [optional] if omitted the server will use the default value of "1Y"
 **sort** | **[str]**| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional] if omitted the server will use the default value of ["-weight"]

### Return type

[**GrowthOfTenKResponse**](GrowthOfTenKResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The growth of 10K response object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_holdings**
> HoldingsResponse get_holdings(ids)

Fund holdings

This endpoint provides top 10 holdings for Canadian mutual funds. The result is default sorted in descending order of weight of the holdings.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPartnerFunds
from fds.sdk.FactSetPartnerFunds.api import canadian_mutual_fund_data_from_fundata_api
from fds.sdk.FactSetPartnerFunds.models import *
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
configuration = fds.sdk.FactSetPartnerFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPartnerFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPartnerFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = canadian_mutual_fund_data_from_fundata_api.CanadianMutualFundDataFromFundataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AGF10450"] # [str] | The fund identifiers. <p>***ids limit** = 10 per request*</p>

    try:
        # Fund holdings
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_holdings(ids)

        pprint(api_response)

    except fds.sdk.FactSetPartnerFunds.ApiException as e:
        print("Exception when calling CanadianMutualFundDataFromFundataApi->get_holdings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |

### Return type

[**HoldingsResponse**](HoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The holdings response object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_profile**
> ProfileResponse get_profile(ids)

Fund profile

This endpoint provides profile information for Canadian mutual funds such as objective, manager, and basic returns.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPartnerFunds
from fds.sdk.FactSetPartnerFunds.api import canadian_mutual_fund_data_from_fundata_api
from fds.sdk.FactSetPartnerFunds.models import *
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
configuration = fds.sdk.FactSetPartnerFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPartnerFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPartnerFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = canadian_mutual_fund_data_from_fundata_api.CanadianMutualFundDataFromFundataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AGF10450"] # [str] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
    language = "EN" # str | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English. (optional) if omitted the server will use the default value of "EN"

    try:
        # Fund profile
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_profile(ids, language=language)

        pprint(api_response)

    except fds.sdk.FactSetPartnerFunds.ApiException as e:
        print("Exception when calling CanadianMutualFundDataFromFundataApi->get_profile: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **language** | **str**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] if omitted the server will use the default value of "EN"

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The fund profile response object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rankings**
> PerformanceRankingsResponse get_rankings(ids)

Fund rankings

This endpoint provides rankings for Canadian mutual funds as compared to benchmarks and peers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPartnerFunds
from fds.sdk.FactSetPartnerFunds.api import canadian_mutual_fund_data_from_fundata_api
from fds.sdk.FactSetPartnerFunds.models import *
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
configuration = fds.sdk.FactSetPartnerFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPartnerFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPartnerFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = canadian_mutual_fund_data_from_fundata_api.CanadianMutualFundDataFromFundataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AGF10450"] # [str] | The fund identifiers. <p>***ids limit** = 10 per request*</p>

    try:
        # Fund rankings
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_rankings(ids)

        pprint(api_response)

    except fds.sdk.FactSetPartnerFunds.ApiException as e:
        print("Exception when calling CanadianMutualFundDataFromFundataApi->get_rankings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |

### Return type

[**PerformanceRankingsResponse**](PerformanceRankingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The fund rankings response object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_returns**
> PerformanceReturnsResponse get_returns(ids)

Fund returns

This endpoint provides all the comparative performance values for Canadian mutual funds and their respective benchmark indices. Please note: all periods greater than one year are annualized. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPartnerFunds
from fds.sdk.FactSetPartnerFunds.api import canadian_mutual_fund_data_from_fundata_api
from fds.sdk.FactSetPartnerFunds.models import *
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
configuration = fds.sdk.FactSetPartnerFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPartnerFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPartnerFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = canadian_mutual_fund_data_from_fundata_api.CanadianMutualFundDataFromFundataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AGF10450"] # [str] | The fund identifiers. <p>***ids limit** = 10 per request*</p>

    try:
        # Fund returns
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_returns(ids)

        pprint(api_response)

    except fds.sdk.FactSetPartnerFunds.ApiException as e:
        print("Exception when calling CanadianMutualFundDataFromFundataApi->get_returns: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |

### Return type

[**PerformanceReturnsResponse**](PerformanceReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The fund returns response object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_risk**
> RiskResponse get_risk(ids)

Fund risk

This endpoint provides risk data for Canadian mutual funds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPartnerFunds
from fds.sdk.FactSetPartnerFunds.api import canadian_mutual_fund_data_from_fundata_api
from fds.sdk.FactSetPartnerFunds.models import *
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
configuration = fds.sdk.FactSetPartnerFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPartnerFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPartnerFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = canadian_mutual_fund_data_from_fundata_api.CanadianMutualFundDataFromFundataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AGF10450"] # [str] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
    language = "EN" # str | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English. (optional) if omitted the server will use the default value of "EN"
    num_years = 5 # int | Number of years of risk data to return.  (optional) if omitted the server will use the default value of 5

    try:
        # Fund risk
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_risk(ids, language=language, num_years=num_years)

        pprint(api_response)

    except fds.sdk.FactSetPartnerFunds.ApiException as e:
        print("Exception when calling CanadianMutualFundDataFromFundataApi->get_risk: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **language** | **str**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] if omitted the server will use the default value of "EN"
 **num_years** | **int**| Number of years of risk data to return.  | [optional] if omitted the server will use the default value of 5

### Return type

[**RiskResponse**](RiskResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The risk response object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sector_allocations**
> SectorAllocationsResponse get_sector_allocations(ids)

Fund sector allocations

This endpoint provides Canadian mutual fund data aggregated by sector. The result is default sorted in descending order of sector weight of the fund.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPartnerFunds
from fds.sdk.FactSetPartnerFunds.api import canadian_mutual_fund_data_from_fundata_api
from fds.sdk.FactSetPartnerFunds.models import *
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
configuration = fds.sdk.FactSetPartnerFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPartnerFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPartnerFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = canadian_mutual_fund_data_from_fundata_api.CanadianMutualFundDataFromFundataApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AGF10450"] # [str] | The fund identifiers. <p>***ids limit** = 10 per request*</p>
    language = "EN" # str | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English. (optional) if omitted the server will use the default value of "EN"
    sort = ["weight"] # [str] | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order. (optional) if omitted the server will use the default value of ["-weight"]

    try:
        # Fund sector allocations
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_sector_allocations(ids, language=language, sort=sort)

        pprint(api_response)

    except fds.sdk.FactSetPartnerFunds.ApiException as e:
        print("Exception when calling CanadianMutualFundDataFromFundataApi->get_sector_allocations: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; |
 **language** | **str**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] if omitted the server will use the default value of "EN"
 **sort** | **[str]**| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional] if omitted the server will use the default value of ["-weight"]

### Return type

[**SectorAllocationsResponse**](SectorAllocationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The fund sector allocation response object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


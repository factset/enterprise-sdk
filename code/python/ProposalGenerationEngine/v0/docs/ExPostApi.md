# fds.sdk.ProposalGenerationEngine.ExPostApi

All URIs are relative to *https://api.factset.com/analytics/engines/proposal-generation/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculate_ex_post_correlations_stats**](ExPostApi.md#calculate_ex_post_correlations_stats) | **POST** /portfolios/ex-post/stats/correlations | calculate portfolio vs benchmark correlation and correlation between portfolio holdings
[**calculate_ex_post_factor_exposure_stats**](ExPostApi.md#calculate_ex_post_factor_exposure_stats) | **POST** /portfolios/ex-post/stats/factor-exposure | Create portfolio and return risk factor contribution
[**calculate_ex_post_rolling_series**](ExPostApi.md#calculate_ex_post_rolling_series) | **POST** /portfolios/ex-post/series/rolling | retrieve series of rolling stats for the portfolio
[**calculate_ex_post_rolling_stats**](ExPostApi.md#calculate_ex_post_rolling_stats) | **POST** /portfolios/ex-post/stats/rolling | calculate rolling stats (for ex-post data)
[**calculate_ex_post_series**](ExPostApi.md#calculate_ex_post_series) | **POST** /portfolios/ex-post/series | retrieve portfolio and benchmark data series, generated from the underlying holdings data series
[**calculate_ex_post_stats**](ExPostApi.md#calculate_ex_post_stats) | **POST** /portfolios/ex-post/stats | calculate ex-post stats (on portfolio or holdings level)



# **calculate_ex_post_correlations_stats**
> ExPostStatsCorrelationsResponse calculate_ex_post_correlations_stats()

calculate portfolio vs benchmark correlation and correlation between portfolio holdings

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProposalGenerationEngine
from fds.sdk.ProposalGenerationEngine.api import ex_post_api
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
    api_instance = ex_post_api.ExPostApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ex_post_stats_correlations = ExPostStatsCorrelations(
        data=ExPostStatsCorrelationsData(
            portfolio=ExPostPortfolio(None),
            benchmark=ExPostPortfolio(None),
            settings=ExPostStatsCorrelationsSettings(None),
        ),
    ) # ExPostStatsCorrelations |  (optional)

    try:
        # calculate portfolio vs benchmark correlation and correlation between portfolio holdings
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.calculate_ex_post_correlations_stats(ex_post_stats_correlations=ex_post_stats_correlations)

        pprint(api_response)

    except fds.sdk.ProposalGenerationEngine.ApiException as e:
        print("Exception when calling ExPostApi->calculate_ex_post_correlations_stats: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ex_post_stats_correlations** | [**ExPostStatsCorrelations**](ExPostStatsCorrelations.md)|  | [optional]

### Return type

[**ExPostStatsCorrelationsResponse**](ExPostStatsCorrelationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Status 200 |  -  |
**501** | Server is unable to process your request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculate_ex_post_factor_exposure_stats**
> ExPostStatsFactorExposureResponse calculate_ex_post_factor_exposure_stats()

Create portfolio and return risk factor contribution

Ex-Post factor-exposure Stats

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProposalGenerationEngine
from fds.sdk.ProposalGenerationEngine.api import ex_post_api
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
    api_instance = ex_post_api.ExPostApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ex_post_stats_factor_exposure = ExPostStatsFactorExposure(
        data=ExPostStatsFactorExposureData(
            portfolio=ExPostPortfolio(None),
            benchmark=ExPostPortfolio(None),
            settings=ExPostStatsFactorExposureSettings(None),
        ),
    ) # ExPostStatsFactorExposure |  (optional)

    try:
        # Create portfolio and return risk factor contribution
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.calculate_ex_post_factor_exposure_stats(ex_post_stats_factor_exposure=ex_post_stats_factor_exposure)

        pprint(api_response)

    except fds.sdk.ProposalGenerationEngine.ApiException as e:
        print("Exception when calling ExPostApi->calculate_ex_post_factor_exposure_stats: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ex_post_stats_factor_exposure** | [**ExPostStatsFactorExposure**](ExPostStatsFactorExposure.md)|  | [optional]

### Return type

[**ExPostStatsFactorExposureResponse**](ExPostStatsFactorExposureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Status 200 |  -  |
**501** | Server is unable to process your request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculate_ex_post_rolling_series**
> ExPostSeriesRollingResponse calculate_ex_post_rolling_series()

retrieve series of rolling stats for the portfolio

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProposalGenerationEngine
from fds.sdk.ProposalGenerationEngine.api import ex_post_api
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
    api_instance = ex_post_api.ExPostApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ex_post_series_rolling = ExPostSeriesRolling(
        data=ExPostSeriesRollingData(
            portfolio=Portfolio(None),
            benchmark=Portfolio(None),
            settings=ExPostSeriesRollingSettings(None),
        ),
    ) # ExPostSeriesRolling |  (optional)

    try:
        # retrieve series of rolling stats for the portfolio
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.calculate_ex_post_rolling_series(ex_post_series_rolling=ex_post_series_rolling)

        pprint(api_response)

    except fds.sdk.ProposalGenerationEngine.ApiException as e:
        print("Exception when calling ExPostApi->calculate_ex_post_rolling_series: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ex_post_series_rolling** | [**ExPostSeriesRolling**](ExPostSeriesRolling.md)|  | [optional]

### Return type

[**ExPostSeriesRollingResponse**](ExPostSeriesRollingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Status 200 |  -  |
**501** | Server is unable to process your request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculate_ex_post_rolling_stats**
> ExPostStatsRollingResponse calculate_ex_post_rolling_stats()

calculate rolling stats (for ex-post data)

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProposalGenerationEngine
from fds.sdk.ProposalGenerationEngine.api import ex_post_api
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
    api_instance = ex_post_api.ExPostApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ex_post_stats_rolling = ExPostStatsRolling(
        data=ExPostStatsRollingData(
            portfolio=ExPostPortfolio(None),
            benchmark=ExPostPortfolio(None),
            settings=ExPostStatsRollingSettings(None),
        ),
    ) # ExPostStatsRolling |  (optional)

    try:
        # calculate rolling stats (for ex-post data)
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.calculate_ex_post_rolling_stats(ex_post_stats_rolling=ex_post_stats_rolling)

        pprint(api_response)

    except fds.sdk.ProposalGenerationEngine.ApiException as e:
        print("Exception when calling ExPostApi->calculate_ex_post_rolling_stats: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ex_post_stats_rolling** | [**ExPostStatsRolling**](ExPostStatsRolling.md)|  | [optional]

### Return type

[**ExPostStatsRollingResponse**](ExPostStatsRollingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Status 200 |  -  |
**501** | Server is unable to process your request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculate_ex_post_series**
> ExPostSeriesResponse calculate_ex_post_series()

retrieve portfolio and benchmark data series, generated from the underlying holdings data series

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProposalGenerationEngine
from fds.sdk.ProposalGenerationEngine.api import ex_post_api
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
    api_instance = ex_post_api.ExPostApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ex_post_series = ExPostSeries(
        data=ExPostSeriesData(
            portfolio=ExPostPortfolio(None),
            benchmark=ExPostPortfolio(None),
            settings=ExPostSeriesSettings(None),
        ),
    ) # ExPostSeries |  (optional)

    try:
        # retrieve portfolio and benchmark data series, generated from the underlying holdings data series
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.calculate_ex_post_series(ex_post_series=ex_post_series)

        pprint(api_response)

    except fds.sdk.ProposalGenerationEngine.ApiException as e:
        print("Exception when calling ExPostApi->calculate_ex_post_series: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ex_post_series** | [**ExPostSeries**](ExPostSeries.md)|  | [optional]

### Return type

[**ExPostSeriesResponse**](ExPostSeriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful request |  -  |
**400** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **calculate_ex_post_stats**
> ExPostStatsResponse calculate_ex_post_stats()

calculate ex-post stats (on portfolio or holdings level)

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProposalGenerationEngine
from fds.sdk.ProposalGenerationEngine.api import ex_post_api
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
    api_instance = ex_post_api.ExPostApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ex_post_stats = ExPostStats(
        data=ExPostStatsData(
            portfolio=ExPostPortfolio(None),
            benchmark=ExPostPortfolio(None),
            settings=ExPostStatsSettings(None),
        ),
    ) # ExPostStats |  (optional)

    try:
        # calculate ex-post stats (on portfolio or holdings level)
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.calculate_ex_post_stats(ex_post_stats=ex_post_stats)

        pprint(api_response)

    except fds.sdk.ProposalGenerationEngine.ApiException as e:
        print("Exception when calling ExPostApi->calculate_ex_post_stats: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ex_post_stats** | [**ExPostStats**](ExPostStats.md)|  | [optional]

### Return type

[**ExPostStatsResponse**](ExPostStatsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Status 200 |  -  |
**400** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


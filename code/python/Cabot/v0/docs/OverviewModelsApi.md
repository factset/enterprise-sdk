# fds.sdk.Cabot.OverviewModelsApi

All URIs are relative to *https://api.factset.com/analytics/cabot/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_construction_model_analytic**](OverviewModelsApi.md#get_construction_model_analytic) | **GET** /models/construction | Cabot main path for Construction API
[**get_hit_rate_model_analytic**](OverviewModelsApi.md#get_hit_rate_model_analytic) | **GET** /models/hit-rate | Cabot main path for Hit Rate API
[**get_results_model_analytic**](OverviewModelsApi.md#get_results_model_analytic) | **GET** /models/results | Cabot main path for Results API
[**get_skills_model_analytic**](OverviewModelsApi.md#get_skills_model_analytic) | **GET** /models/skills | Cabot main path for Skills API



# **get_construction_model_analytic**
> ConstructionResponseRoot get_construction_model_analytic(account_path, benchmark_path, period)

Cabot main path for Construction API

Cabot main path for Construction API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Cabot
from fds.sdk.Cabot.api import overview_models_api
from fds.sdk.Cabot.models import *
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
configuration = fds.sdk.Cabot.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Cabot.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Cabot.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = overview_models_api.OverviewModelsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    account_path = "accountPath_example" # str | The account path of the portfolio you want to retrieve the data for.<br /><br />
    benchmark_path = "benchmarkPath_example" # str | The path of the benchmark you want to retrieve the data for.<br /><br />
    period = "2015-2017" # str | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />

    try:
        # Cabot main path for Construction API
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_construction_model_analytic(account_path, benchmark_path, period)

        pprint(api_response)

    except fds.sdk.Cabot.ApiException as e:
        print("Exception when calling OverviewModelsApi->get_construction_model_analytic: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_path** | **str**| The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; |
 **benchmark_path** | **str**| The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; |
 **period** | **str**| For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; |

### Return type

[**ConstructionResponseRoot**](ConstructionResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**400** | Bad request, invalid query parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**408** | Request timeout. Retry the request in sometime. |  -  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**500** | Server error. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_hit_rate_model_analytic**
> HitRateResponseRoot get_hit_rate_model_analytic(account_path, benchmark_path, period, sector, region)

Cabot main path for Hit Rate API

Cabot main path for Hit Rate API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Cabot
from fds.sdk.Cabot.api import overview_models_api
from fds.sdk.Cabot.models import *
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
configuration = fds.sdk.Cabot.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Cabot.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Cabot.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = overview_models_api.OverviewModelsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    account_path = "accountPath_example" # str | The account path of the portfolio you want to retrieve the data for.<br /><br />
    benchmark_path = "benchmarkPath_example" # str | The path of the benchmark you want to retrieve the data for.<br /><br />
    period = "2015-2017" # str | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
    sector = Sectors("energy") # Sectors | Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
    region = Regions("northAmerica") # Regions | Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />

    try:
        # Cabot main path for Hit Rate API
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_hit_rate_model_analytic(account_path, benchmark_path, period, sector, region)

        pprint(api_response)

    except fds.sdk.Cabot.ApiException as e:
        print("Exception when calling OverviewModelsApi->get_hit_rate_model_analytic: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_path** | **str**| The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; |
 **benchmark_path** | **str**| The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; |
 **period** | **str**| For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; |
 **sector** | **Sectors**| Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; |
 **region** | **Regions**| Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; |

### Return type

[**HitRateResponseRoot**](HitRateResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**400** | Bad request, invalid query parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**408** | Request timeout. Retry the request in sometime. |  -  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**500** | Server error. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_results_model_analytic**
> ResultsResponseRoot get_results_model_analytic(account_path, benchmark_path, period)

Cabot main path for Results API

Cabot main path for Results API.     Describes portfolio returns in comparison to its benchmark. A positive value indicates excess returns while a negative value indicates underperformance.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Cabot
from fds.sdk.Cabot.api import overview_models_api
from fds.sdk.Cabot.models import *
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
configuration = fds.sdk.Cabot.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Cabot.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Cabot.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = overview_models_api.OverviewModelsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    account_path = "accountPath_example" # str | The account path of the portfolio you want to retrieve the data for.<br /><br />
    benchmark_path = "benchmarkPath_example" # str | The path of the benchmark you want to retrieve the data for.<br /><br />
    period = "2015-2017" # str | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
    currency = Currency("USD") # Currency | In which currency you want to see the data. By default the API uses USD.<br /><br /> (optional)

    try:
        # Cabot main path for Results API
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_results_model_analytic(account_path, benchmark_path, period, currency=currency)

        pprint(api_response)

    except fds.sdk.Cabot.ApiException as e:
        print("Exception when calling OverviewModelsApi->get_results_model_analytic: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_path** | **str**| The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; |
 **benchmark_path** | **str**| The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; |
 **period** | **str**| For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; |
 **currency** | **Currency**| In which currency you want to see the data. By default the API uses USD.&lt;br /&gt;&lt;br /&gt; | [optional]

### Return type

[**ResultsResponseRoot**](ResultsResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**400** | Bad request, invalid query parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**408** | Request timeout. Retry the request in sometime. |  -  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**500** | Server error. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_skills_model_analytic**
> SkillsResponseRoot get_skills_model_analytic(account_path, benchmark_path, period)

Cabot main path for Skills API

Cabot main path for Skills API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Cabot
from fds.sdk.Cabot.api import overview_models_api
from fds.sdk.Cabot.models import *
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
configuration = fds.sdk.Cabot.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Cabot.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Cabot.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = overview_models_api.OverviewModelsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    account_path = "accountPath_example" # str | The account path of the portfolio you want to retrieve the data for.
    benchmark_path = "BENCH:SP50" # str | The path of the benchmark you want to retrieve the data for.<br /><br />
    period = "period_example" # str | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
    attribute = Attributes("QFL_EY") # Attributes | The attribute represents the different factors.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />If provided, the API response will contain both \"LOW\" and \"HIGH\" values for it.<br /><br /> (optional)
    sector = Sectors("energy") # Sectors | Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br /> (optional)
    region = Regions("northAmerica") # Regions | Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br /> (optional)
    holdings = SkillsHoldings("buySkill") # SkillsHoldings | If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).<br /><br /> (optional)

    try:
        # Cabot main path for Skills API
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_skills_model_analytic(account_path, benchmark_path, period, attribute=attribute, sector=sector, region=region, holdings=holdings)

        pprint(api_response)

    except fds.sdk.Cabot.ApiException as e:
        print("Exception when calling OverviewModelsApi->get_skills_model_analytic: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_path** | **str**| The account path of the portfolio you want to retrieve the data for. |
 **benchmark_path** | **str**| The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; |
 **period** | **str**| For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; |
 **attribute** | **Attributes**| The attribute represents the different factors.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt;If provided, the API response will contain both \&quot;LOW\&quot; and \&quot;HIGH\&quot; values for it.&lt;br /&gt;&lt;br /&gt; | [optional]
 **sector** | **Sectors**| Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional]
 **region** | **Regions**| Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional]
 **holdings** | **SkillsHoldings**| If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).&lt;br /&gt;&lt;br /&gt; | [optional]

### Return type

[**SkillsResponseRoot**](SkillsResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**400** | Bad request, invalid query parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**408** | Request timeout. Retry the request in sometime. |  -  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**500** | Server error. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


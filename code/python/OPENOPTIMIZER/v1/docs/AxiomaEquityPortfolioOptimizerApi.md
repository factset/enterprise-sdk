# fds.sdk.OPENOPTIMIZER.AxiomaEquityPortfolioOptimizerApi

All URIs are relative to *https://api.factset.com/open-optimizer/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_global_variables_axp**](AxiomaEquityPortfolioOptimizerApi.md#get_global_variables_axp) | **GET** /axp/settings/global-variables | Returns a dictionary with the name-value pairs for all global variables.
[**get_optimization_result_by_id_axp**](AxiomaEquityPortfolioOptimizerApi.md#get_optimization_result_by_id_axp) | **GET** /axp/{id} | Get AXP optimization result by id
[**get_optimization_status_by_id_axp**](AxiomaEquityPortfolioOptimizerApi.md#get_optimization_status_by_id_axp) | **GET** /axp/{id}/status | Get AXP optimization status by id
[**post_and_optimize_axp**](AxiomaEquityPortfolioOptimizerApi.md#post_and_optimize_axp) | **POST** /axp/optimize | Create and Run AXP optimization
[**post_components_axp**](AxiomaEquityPortfolioOptimizerApi.md#post_components_axp) | **POST** /axp/settings/components | Returns a dictionary with individually-filtered metadata for each component type.
[**post_strategies_axp**](AxiomaEquityPortfolioOptimizerApi.md#post_strategies_axp) | **POST** /axp/settings/strategies | Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.



# **get_global_variables_axp**
> SettingsGlobalVarsResponse get_global_variables_axp()

Returns a dictionary with the name-value pairs for all global variables.

Fetch all available global variables

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OPENOPTIMIZER
from fds.sdk.OPENOPTIMIZER.api import axioma_equity_portfolio_optimizer_api
from fds.sdk.OPENOPTIMIZER.models import *
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
configuration = fds.sdk.OPENOPTIMIZER.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OPENOPTIMIZER.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OPENOPTIMIZER.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = axioma_equity_portfolio_optimizer_api.AxiomaEquityPortfolioOptimizerApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    cache_control = "Cache-Control_example" # str | Standard HTTP header.  Accepts max-stale. (optional)

    try:
        # Returns a dictionary with the name-value pairs for all global variables.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_global_variables_axp(cache_control=cache_control)

        pprint(api_response)

    except fds.sdk.OPENOPTIMIZER.ApiException as e:
        print("Exception when calling AxiomaEquityPortfolioOptimizerApi->get_global_variables_axp: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cache_control** | **str**| Standard HTTP header.  Accepts max-stale. | [optional]

### Return type

[**SettingsGlobalVarsResponse**](SettingsGlobalVarsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Name-value pairs for each global variable. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**400** | Invalid identifier provided. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**417** | Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_optimization_result_by_id_axp**
> ResultResponse get_optimization_result_by_id_axp(id)

Get AXP optimization result by id

This is the endpoint to get optimization result.  If the optimization result is available, a 200 is returned.   Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OPENOPTIMIZER
from fds.sdk.OPENOPTIMIZER.api import axioma_equity_portfolio_optimizer_api
from fds.sdk.OPENOPTIMIZER.models import *
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
configuration = fds.sdk.OPENOPTIMIZER.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OPENOPTIMIZER.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OPENOPTIMIZER.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = axioma_equity_portfolio_optimizer_api.AxiomaEquityPortfolioOptimizerApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | from url, provided from the location header in the Create and Run FPO optimization endpoint

    try:
        # Get AXP optimization result by id
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_optimization_result_by_id_axp(id)

        pprint(api_response)

    except fds.sdk.OPENOPTIMIZER.ApiException as e:
        print("Exception when calling AxiomaEquityPortfolioOptimizerApi->get_optimization_result_by_id_axp: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| from url, provided from the location header in the Create and Run FPO optimization endpoint |

### Return type

[**ResultResponse**](ResultResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Gets the optimization result. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**202** | The request to run an optimization has been accepted. The response includes a 202 Accepted status code, the ID of the new resource, and a Location header with the URL to check the status of the optimization. |  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**400** | Invalid identifier provided. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**417** | Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_optimization_status_by_id_axp**
> OptimizationStatus get_optimization_status_by_id_axp(id)

Get AXP optimization status by id

This is the endpoint to check on the progress of a previously requested optimization.  If the optimization has finished computing, a 201 is returned and the result can be fetched using /axp/{id} endpoint.   Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OPENOPTIMIZER
from fds.sdk.OPENOPTIMIZER.api import axioma_equity_portfolio_optimizer_api
from fds.sdk.OPENOPTIMIZER.models import *
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
configuration = fds.sdk.OPENOPTIMIZER.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OPENOPTIMIZER.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OPENOPTIMIZER.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = axioma_equity_portfolio_optimizer_api.AxiomaEquityPortfolioOptimizerApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | from url, provided from the location header in the Create and Run AXP optimization endpoint

    try:
        # Get AXP optimization status by id
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_optimization_status_by_id_axp(id)

        pprint(api_response)

    except fds.sdk.OPENOPTIMIZER.ApiException as e:
        print("Exception when calling AxiomaEquityPortfolioOptimizerApi->get_optimization_status_by_id_axp: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| from url, provided from the location header in the Create and Run AXP optimization endpoint |

### Return type

[**OptimizationStatus**](OptimizationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | This indicates that the optimization is complete and the result is now available. |  * Location - URL to fetch the optimization result <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**202** | Indicates optimization is in progress. The response body contains the detailed status. |  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**400** | Invalid identifier provided. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**417** | Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_and_optimize_axp**
> OptimizationStatus post_and_optimize_axp()

Create and Run AXP optimization

This endpoint runs AXP optimization specified in the POST body parameters.                Remarks:                * Any settings in POST body will act as a one-time override over the settings saved in the strategy document.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OPENOPTIMIZER
from fds.sdk.OPENOPTIMIZER.api import axioma_equity_portfolio_optimizer_api
from fds.sdk.OPENOPTIMIZER.models import *
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
configuration = fds.sdk.OPENOPTIMIZER.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OPENOPTIMIZER.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OPENOPTIMIZER.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = axioma_equity_portfolio_optimizer_api.AxiomaEquityPortfolioOptimizerApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    cache_control = "Cache-Control_example" # str | Standard HTTP header.  Accepts max-stale. (optional)
    axp_optimization_parameters_request = AXPOptimizationParametersRequest(
        data=AXPOptimizationParameters(
            account=AXPAccountInput(
                id="Client:/folder1/InitialPortfolio1.ACCT",
                overrides=OptimizerAccountOverridesInput(
                    portfolio="portfolio_example",
                    benchmark="benchmark_example",
                    risk_model_id="risk_model_id_example",
                    currency="currency_example",
                ),
            ),
            strategy=AXPOptimizerStrategyInput(
                overrides=AXPOptimizerStrategyOverridesInput(
                    objective="AXO_OBJECTIVE_FUNCTION_KEY_20120101_",
                    tax="AXO_TAX_KEY_20120101_",
                    constraints={
                        "key": EnabledEnum("disable"),
                    },
                    alpha="P(0)/100",
                    transaction_cost="AXO_TRANS_COST_MODEL_KEY_20130612_",
                ),
                id="Client:/folder1/AXP_Model",
            ),
            optimization=OptimizationInput(
                risk_model_date="2024-01-21",
                backtest_date="2024-01-21",
                cash_flow="5000000",
                buy_list="BENCH:SP50",
                global_variables={
                    "key": "key_example",
                },
            ),
            output_types=OptimizerOutputTypes(
                trades=TradesListOutputType(
                    identifier_type="asset",
                    include_cash=True,
                ),
                optimal=OptimalHoldingsOutputType(
                    identifier_type="asset",
                    include_cash=True,
                    exclude_zero_shares=True,
                ),
                archive=ArchivePortfolioOutputType(
                    account_name="Client:/folder1/fpo_archived_optimal1.ACCT",
                    exclude_zero_shares=True,
                    archive_date="2024-01-21",
                    if_account_exists="abort",
                    if_ofdb_date_exists="abort",
                ),
                stats=True,
                reports=OptimizerReportsOutputType(
                    workspace=ReportOutputTypeObject(
                        identifier_type="asset",
                    ),
                    trade_list=ReportOutputTypeObject(
                        identifier_type="asset",
                    ),
                    objective_summary=ReportOutputTypeObject(
                        identifier_type="asset",
                    ),
                    factor_exposure=ReportOutputTypeObject(
                        identifier_type="asset",
                    ),
                    constraint_summary=ReportOutputTypeObject(
                        identifier_type="asset",
                    ),
                    excluded_securities=ReportOutputTypeObject(
                        identifier_type="asset",
                    ),
                    optimizer_log=True,
                ),
            ),
        ),
    ) # AXPOptimizationParametersRequest | Optimization Parameters (optional)

    try:
        # Create and Run AXP optimization
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_and_optimize_axp(cache_control=cache_control, axp_optimization_parameters_request=axp_optimization_parameters_request)

        pprint(api_response)

    except fds.sdk.OPENOPTIMIZER.ApiException as e:
        print("Exception when calling AxiomaEquityPortfolioOptimizerApi->post_and_optimize_axp: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cache_control** | **str**| Standard HTTP header.  Accepts max-stale. | [optional]
 **axp_optimization_parameters_request** | [**AXPOptimizationParametersRequest**](AXPOptimizationParametersRequest.md)| Optimization Parameters | [optional]

### Return type

[**OptimizationStatus**](OptimizationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | The request to run an optimization has been accepted. The response includes a 202 Accepted status code, the ID of the new resource, and a Location header with the URL to check the status of the optimization. |  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**400** | Invalid identifier provided. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**417** | Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_components_axp**
> AvailableComponentsResponse post_components_axp()

Returns a dictionary with individually-filtered metadata for each component type.

Fetch metadata for all FPO component types. Output is individually-filtered for each component type.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OPENOPTIMIZER
from fds.sdk.OPENOPTIMIZER.api import axioma_equity_portfolio_optimizer_api
from fds.sdk.OPENOPTIMIZER.models import *
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
configuration = fds.sdk.OPENOPTIMIZER.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OPENOPTIMIZER.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OPENOPTIMIZER.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = axioma_equity_portfolio_optimizer_api.AxiomaEquityPortfolioOptimizerApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    axp_available_components_input = AXPAvailableComponentsInput(
        data=AXPAvailableComponentsInputData(
            components=["constraints","objectives","transactionCosts"],
            document_level=FPOAvailableComponentsInputDataDocumentLevel(
                strategy="Client:/Folder1/MyStrategy1",
                document_level_only=True,
            ),
            filters=AXPAvailableComponentsInputDataFilters(
                constraints=AXPAvailableComponentsInputDataFiltersConstraints(
                    directory="Personal:/MyConstraints/",
                    category="trading",
                    type="limitHolding",
                    tags=["custom_constraint_tag1","custom_constraint_tag2"],
                ),
                objectives=AXPAvailableComponentsInputDataFiltersObjectives(
                    directory="Personal:/MyObjectives/",
                    category=["risk","linear"],
                    type=["marketImpact","transactionCost"],
                    tags=["custom_obj_tag1","custom_obj_tag2"],
                ),
                transaction_costs=FPOAvailableComponentsInputDataFiltersTransactionCosts(
                    directory="Personal:/MyTransCosts/",
                    tags=["custom_tcost_tag1","custom_tcost_tag2"],
                ),
            ),
        ),
    ) # AXPAvailableComponentsInput |  (optional)

    try:
        # Returns a dictionary with individually-filtered metadata for each component type.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_components_axp(axp_available_components_input=axp_available_components_input)

        pprint(api_response)

    except fds.sdk.OPENOPTIMIZER.ApiException as e:
        print("Exception when calling AxiomaEquityPortfolioOptimizerApi->post_components_axp: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **axp_available_components_input** | [**AXPAvailableComponentsInput**](AXPAvailableComponentsInput.md)|  | [optional]

### Return type

[**AvailableComponentsResponse**](AvailableComponentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A JSON object with filtered metadata for all requested components |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**417** | Expectation Failed |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_strategies_axp**
> AvailableStrategiesResponse post_strategies_axp()

Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.

Fetch available FPO Strategies

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OPENOPTIMIZER
from fds.sdk.OPENOPTIMIZER.api import axioma_equity_portfolio_optimizer_api
from fds.sdk.OPENOPTIMIZER.models import *
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
configuration = fds.sdk.OPENOPTIMIZER.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OPENOPTIMIZER.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OPENOPTIMIZER.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = axioma_equity_portfolio_optimizer_api.AxiomaEquityPortfolioOptimizerApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    cache_control = "Cache-Control_example" # str | Standard HTTP header.  Accepts max-stale. (optional)
    available_strategies_input = AvailableStrategiesInput(
        data=AvailableStrategiesInputData(
            directory=["Personal:/","Client:/Folder1/Subfolder1/"],
        ),
    ) # AvailableStrategiesInput |  (optional)

    try:
        # Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_strategies_axp(cache_control=cache_control, available_strategies_input=available_strategies_input)

        pprint(api_response)

    except fds.sdk.OPENOPTIMIZER.ApiException as e:
        print("Exception when calling AxiomaEquityPortfolioOptimizerApi->post_strategies_axp: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cache_control** | **str**| Standard HTTP header.  Accepts max-stale. | [optional]
 **available_strategies_input** | [**AvailableStrategiesInput**](AvailableStrategiesInput.md)|  | [optional]

### Return type

[**AvailableStrategiesResponse**](AvailableStrategiesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, contains the requested strategies. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**417** | Expectation Failed |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


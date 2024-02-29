# fds.sdk.OpenRisk.OperationsApi

All URIs are relative to *https://api.factset.com/analytics/openrisk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculate_from_holdings**](OperationsApi.md#calculate_from_holdings) | **POST** /linear/{version}/calculate/from-holdings | Calculate risk statistics
[**generate_id_mapping**](OperationsApi.md#generate_id_mapping) | **POST** /linear/{version}/generate/id-mapping | Generate risk model ID mapping



# **calculate_from_holdings**
> InlineResponse2003 calculate_from_holdings(version, calculate_from_holdings_request_body)

Calculate risk statistics

Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenRisk
from fds.sdk.OpenRisk.api import operations_api
from fds.sdk.OpenRisk.models import *
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
configuration = fds.sdk.OpenRisk.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenRisk.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenRisk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = operations_api.OperationsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    version = "v1" # str | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    calculate_from_holdings_request_body = CalculateFromHoldingsRequestBody(
        data=CalculateFromHoldingsRequestData(
            additional_calc_inputs=AdditionalCalculationInputs(
                market_excess=AdditionalCalculationInputsMarketExcess(
                    _return=3.14,
                    risk_free_rate=3.14,
                    risk_premium=3.14,
                    risk_premium_periods_per_year=1,
                ),
                calculation_periods_per_year=1,
            ),
            allow_forced_riskless_assets=False,
            asset_types=AssetTypes(
                key="key_example",
            ),
            calendar=CalendarCode("FJH"),
            composite_assets=CompositeAssetDefinitions(
                key=IDsAndMarketValues(
                    ids=[
                        "ids_example",
                    ],
                    market_values=[
                        3.14,
                    ],
                ),
            ),
            currency=CurrencyISOCode("EUR"),
            date=Date(None),
            factor_grouping=FactorGroup(
                name="name_example",
                nodes=[
                    FactorGroupNodes(None),
                ],
            ),
            factors_visible=FactorsVisible(
                list=[
                    "list_example",
                ],
                type="Whitelist",
            ),
            holdings=Holdings(
                portfolio=Holding(),
                benchmark=Holding(),
                market=Holding(),
            ),
            index_mapping=SecurityIndexMapping("InputToResult"),
            lagging_dates=LaggingDates(
                exposure_date=ExposureDateFormatConvention(None),
                covariance_date=CovarianceDateFormatConvention(None),
                ssr_date_is="ExposureDate",
            ),
            remove_currency_risk=RemoveCurrencyRisk(None),
            requires_factor_returns=RequiresFactorReturns("Daily"),
            risk_model=RiskModelCode("FDS:GLOBAL_EQUITY_M_V1"),
            risk_model_append_data=RiskModelAppendData(
                data=[{"0":2.5,"1":"SYMBOL_1","2":23.1},{"1":"SYMBOL_2","2":7.2}],
                fields=["FACTOR_1","SYMBOL","STDERR"],
            ),
            stats=Stats([
                Stat(
                    name="name_example",
                    level=StatCalculationLevel("Portfolio"),
                    settings=StatCalculationSettings(
                        use_absolute_weights_for_lot_expansion=True,
                        covariance_times_two=False,
                        covariance_times_two_term=False,
                        correlated_specific_risk=False,
                        sparse=False,
                        horizon=3.14,
                        days_per_year=3.14,
                        confidence_level=3.14,
                        lamda=3.14,
                        specific_to_factor_ratio=3.14,
                        rap_sys=3.14,
                        rap_unsys=3.14,
                    ),
                ),
            ]),
            underlying_ids=UnderlyingIDs(
                key="key_example",
            ),
        ),
    ) # CalculateFromHoldingsRequestBody | 

    try:
        # Calculate risk statistics
        # example passing only required values which don't have defaults set
        api_response = api_instance.calculate_from_holdings(version, calculate_from_holdings_request_body)

        pprint(api_response)

    except fds.sdk.OpenRisk.ApiException as e:
        print("Exception when calling OperationsApi->calculate_from_holdings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. |
 **calculate_from_holdings_request_body** | [**CalculateFromHoldingsRequestBody**](CalculateFromHoldingsRequestBody.md)|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required. |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**400** | Request was malformed or the requested data is not available |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**401** | Missing or invalid authentication |  -  |
**403** | Access forbidden for the requested data |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**500** | Internal server error occurred |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_id_mapping**
> InlineResponse2004 generate_id_mapping(version, generate_id_mapping_request_body)

Generate risk model ID mapping

Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenRisk
from fds.sdk.OpenRisk.api import operations_api
from fds.sdk.OpenRisk.models import *
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
configuration = fds.sdk.OpenRisk.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenRisk.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenRisk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = operations_api.OperationsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    version = "v1" # str | Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    generate_id_mapping_request_body = GenerateIDMappingRequestBody(
        data=GenerateIDMappingRequestData(
            allow_forced_riskless_assets=False,
            asset_types=AssetTypes(
                key="key_example",
            ),
            calendar=CalendarCode("FJH"),
            composite_assets=CompositeAssetDefinitions(
                key=IDsAndMarketValues(
                    ids=[
                        "ids_example",
                    ],
                    market_values=[
                        3.14,
                    ],
                ),
            ),
            currency=CurrencyISOCode("EUR"),
            date=Date(None),
            holdings=Holdings(
                portfolio=Holding(),
                benchmark=Holding(),
                market=Holding(),
            ),
            index_mapping=SecurityIndexMapping("InputToResult"),
            lagging_dates=LaggingDates(
                exposure_date=ExposureDateFormatConvention(None),
                covariance_date=CovarianceDateFormatConvention(None),
                ssr_date_is="ExposureDate",
            ),
            risk_model=RiskModelCode("FDS:GLOBAL_EQUITY_M_V1"),
            risk_model_append_data=RiskModelAppendData(
                data=[{"0":2.5,"1":"SYMBOL_1","2":23.1},{"1":"SYMBOL_2","2":7.2}],
                fields=["FACTOR_1","SYMBOL","STDERR"],
            ),
            underlying_ids=UnderlyingIDs(
                key="key_example",
            ),
        ),
    ) # GenerateIDMappingRequestBody | 

    try:
        # Generate risk model ID mapping
        # example passing only required values which don't have defaults set
        api_response = api_instance.generate_id_mapping(version, generate_id_mapping_request_body)

        pprint(api_response)

    except fds.sdk.OpenRisk.ApiException as e:
        print("Exception when calling OperationsApi->generate_id_mapping: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| Semantic version number. See [this link here](https://regexr.com/47b7t) to test validate patterns. |
 **generate_id_mapping_request_body** | [**GenerateIDMappingRequestBody**](GenerateIDMappingRequestBody.md)|  |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Provides a mapping to security indices in the risk model or the reason for exclusion |  -  |
**400** | Request was malformed or the requested data is not available |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**403** | Access forbidden for the requested data |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
**500** | Internal server error occurred |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


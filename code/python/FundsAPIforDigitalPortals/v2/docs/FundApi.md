# fds.sdk.FundsAPIforDigitalPortals.FundApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fund_holding_list_by_instrument**](FundApi.md#get_fund_holding_list_by_instrument) | **GET** /fund/holding/listByInstrument | Holdings of a fund.
[**get_fund_notation_key_figures_benchmark_month_1_get**](FundApi.md#get_fund_notation_key_figures_benchmark_month_1_get) | **GET** /fund/notation/keyFigures/benchmark/month/1/get | End-of-day (EOD) benchmark key figures of a fund for the time range of one month.
[**get_fund_notation_key_figures_benchmark_month_3_get**](FundApi.md#get_fund_notation_key_figures_benchmark_month_3_get) | **GET** /fund/notation/keyFigures/benchmark/month/3/get | End-of-day (EOD) benchmark key figures of a fund for the time range of three months.
[**get_fund_notation_key_figures_benchmark_week_1_get**](FundApi.md#get_fund_notation_key_figures_benchmark_week_1_get) | **GET** /fund/notation/keyFigures/benchmark/week/1/get | End-of-day (EOD) benchmark key figures of a fund for the time range of one week.
[**get_fund_notation_key_figures_benchmark_year_1_get**](FundApi.md#get_fund_notation_key_figures_benchmark_year_1_get) | **GET** /fund/notation/keyFigures/benchmark/year/1/get | End-of-day (EOD) benchmark key figures of a fund for the time range of one year.
[**get_fund_notation_key_figures_benchmark_year_3_get**](FundApi.md#get_fund_notation_key_figures_benchmark_year_3_get) | **GET** /fund/notation/keyFigures/benchmark/year/3/get | End-of-day (EOD) benchmark key figures of a fund for the time range of three years.
[**get_fund_notation_key_figures_benchmark_year_5_get**](FundApi.md#get_fund_notation_key_figures_benchmark_year_5_get) | **GET** /fund/notation/keyFigures/benchmark/year/5/get | End-of-day (EOD) benchmark key figures of a fund for the time range of five years.
[**get_fund_share_class_get**](FundApi.md#get_fund_share_class_get) | **GET** /fund/shareClass/get | Fundamental data for a share class of a fund.
[**post_fund_issuer_search**](FundApi.md#post_fund_issuer_search) | **POST** /fund/issuer/search | Search for issuers of funds.
[**post_fund_notation_screener_search**](FundApi.md#post_fund_notation_screener_search) | **POST** /fund/notation/screener/search | Screener for notations of share classes of mutual and exchange traded funds based on fund-specific parameters.
[**post_fund_notation_screener_value_ranges_get**](FundApi.md#post_fund_notation_screener_value_ranges_get) | **POST** /fund/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/fund/notation/screener/search&#x60;.


# **get_fund_holding_list_by_instrument**
> InlineResponse200 get_fund_holding_list_by_instrument(id)

Holdings of a fund.

Holdings of a fund. Only the top 10 holdings with regard to their weighting in the fund portfolio are returned. Therefore, the weights of the holdings do not add up to 1 (i.e. 100%).

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FundsAPIforDigitalPortals
from fds.sdk.FundsAPIforDigitalPortals.api import fund_api
from fds.sdk.FundsAPIforDigitalPortals.models import *
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
configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FundsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fund_api.FundApi(api_client)

    id = "id_example" # str | Identifier of an instrument of a fund share class.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    sort = [
        "["-holdings.weight"]",
    ] # [str] | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) if omitted the server will use the default value of ["-holdings.weight"]

    try:
        # Holdings of a fund.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fund_holding_list_by_instrument(id, attributes=attributes, sort=sort)
        pprint(api_response)

    except fds.sdk.FundsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling FundApi->get_fund_holding_list_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of an instrument of a fund share class. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **[str]**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] if omitted the server will use the default value of ["-holdings.weight"]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fund_notation_key_figures_benchmark_month_1_get**
> InlineResponse2002 get_fund_notation_key_figures_benchmark_month_1_get(id, id_notation_benchmark)

End-of-day (EOD) benchmark key figures of a fund for the time range of one month.

End-of-day (EOD) benchmark key figures of a fund for the time range of one month.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FundsAPIforDigitalPortals
from fds.sdk.FundsAPIforDigitalPortals.api import fund_api
from fds.sdk.FundsAPIforDigitalPortals.models import *
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
configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FundsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fund_api.FundApi(api_client)

    id = "id_example" # str | Identifier of the notation.
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | List of benchmark notations.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a fund for the time range of one month.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fund_notation_key_figures_benchmark_month_1_get(id, id_notation_benchmark, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.FundsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling FundApi->get_fund_notation_key_figures_benchmark_month_1_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the notation. |
 **id_notation_benchmark** | **[str]**| List of benchmark notations. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fund_notation_key_figures_benchmark_month_3_get**
> InlineResponse2002 get_fund_notation_key_figures_benchmark_month_3_get(id, id_notation_benchmark)

End-of-day (EOD) benchmark key figures of a fund for the time range of three months.

End-of-day (EOD) benchmark key figures of a fund for the time range of three months.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FundsAPIforDigitalPortals
from fds.sdk.FundsAPIforDigitalPortals.api import fund_api
from fds.sdk.FundsAPIforDigitalPortals.models import *
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
configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FundsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fund_api.FundApi(api_client)

    id = "id_example" # str | Identifier of the notation.
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | List of benchmark notations.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a fund for the time range of three months.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fund_notation_key_figures_benchmark_month_3_get(id, id_notation_benchmark, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.FundsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling FundApi->get_fund_notation_key_figures_benchmark_month_3_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the notation. |
 **id_notation_benchmark** | **[str]**| List of benchmark notations. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fund_notation_key_figures_benchmark_week_1_get**
> InlineResponse2003 get_fund_notation_key_figures_benchmark_week_1_get(id, id_notation_benchmark)

End-of-day (EOD) benchmark key figures of a fund for the time range of one week.

End-of-day (EOD) benchmark key figures of a fund for the time range of one week.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FundsAPIforDigitalPortals
from fds.sdk.FundsAPIforDigitalPortals.api import fund_api
from fds.sdk.FundsAPIforDigitalPortals.models import *
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
configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FundsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fund_api.FundApi(api_client)

    id = "id_example" # str | Identifier of the notation.
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | List of benchmark notations.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a fund for the time range of one week.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fund_notation_key_figures_benchmark_week_1_get(id, id_notation_benchmark, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.FundsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling FundApi->get_fund_notation_key_figures_benchmark_week_1_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the notation. |
 **id_notation_benchmark** | **[str]**| List of benchmark notations. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fund_notation_key_figures_benchmark_year_1_get**
> InlineResponse2002 get_fund_notation_key_figures_benchmark_year_1_get(id, id_notation_benchmark)

End-of-day (EOD) benchmark key figures of a fund for the time range of one year.

End-of-day (EOD) benchmark key figures of a fund for the time range of one year.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FundsAPIforDigitalPortals
from fds.sdk.FundsAPIforDigitalPortals.api import fund_api
from fds.sdk.FundsAPIforDigitalPortals.models import *
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
configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FundsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fund_api.FundApi(api_client)

    id = "id_example" # str | Identifier of the notation.
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | List of benchmark notations.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a fund for the time range of one year.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fund_notation_key_figures_benchmark_year_1_get(id, id_notation_benchmark, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.FundsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling FundApi->get_fund_notation_key_figures_benchmark_year_1_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the notation. |
 **id_notation_benchmark** | **[str]**| List of benchmark notations. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fund_notation_key_figures_benchmark_year_3_get**
> InlineResponse2002 get_fund_notation_key_figures_benchmark_year_3_get(id, id_notation_benchmark)

End-of-day (EOD) benchmark key figures of a fund for the time range of three years.

End-of-day (EOD) benchmark key figures of a fund for the time range of three years.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FundsAPIforDigitalPortals
from fds.sdk.FundsAPIforDigitalPortals.api import fund_api
from fds.sdk.FundsAPIforDigitalPortals.models import *
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
configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FundsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fund_api.FundApi(api_client)

    id = "id_example" # str | Identifier of the notation.
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | List of benchmark notations.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a fund for the time range of three years.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fund_notation_key_figures_benchmark_year_3_get(id, id_notation_benchmark, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.FundsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling FundApi->get_fund_notation_key_figures_benchmark_year_3_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the notation. |
 **id_notation_benchmark** | **[str]**| List of benchmark notations. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fund_notation_key_figures_benchmark_year_5_get**
> InlineResponse2002 get_fund_notation_key_figures_benchmark_year_5_get(id, id_notation_benchmark)

End-of-day (EOD) benchmark key figures of a fund for the time range of five years.

End-of-day (EOD) benchmark key figures of a fund for the time range of five years.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FundsAPIforDigitalPortals
from fds.sdk.FundsAPIforDigitalPortals.api import fund_api
from fds.sdk.FundsAPIforDigitalPortals.models import *
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
configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FundsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fund_api.FundApi(api_client)

    id = "id_example" # str | Identifier of the notation.
    id_notation_benchmark = [
        "idNotationBenchmark_example",
    ] # [str] | List of benchmark notations.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # End-of-day (EOD) benchmark key figures of a fund for the time range of five years.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fund_notation_key_figures_benchmark_year_5_get(id, id_notation_benchmark, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.FundsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling FundApi->get_fund_notation_key_figures_benchmark_year_5_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the notation. |
 **id_notation_benchmark** | **[str]**| List of benchmark notations. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fund_share_class_get**
> InlineResponse2006 get_fund_share_class_get(id)

Fundamental data for a share class of a fund.

The provided fundamental data comprises share class-specific data and data applying to the fund and thus to all its share classes. An instrument other than a fund share class yields empty values for share class-specific or fund-specific attributes.   Dates are interpreted in the timezone of the fund company. For attributes referring to a country, see endpoint `/basic/region/country/list` for possible values.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FundsAPIforDigitalPortals
from fds.sdk.FundsAPIforDigitalPortals.api import fund_api
from fds.sdk.FundsAPIforDigitalPortals.models import *
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
configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FundsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fund_api.FundApi(api_client)

    id = "id_example" # str | Identifier of the instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Fundamental data for a share class of a fund.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fund_share_class_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.FundsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling FundApi->get_fund_share_class_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the instrument. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_fund_issuer_search**
> InlineResponse2001 post_fund_issuer_search()

Search for issuers of funds.

Search for issuers of funds. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FundsAPIforDigitalPortals
from fds.sdk.FundsAPIforDigitalPortals.api import fund_api
from fds.sdk.FundsAPIforDigitalPortals.models import *
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
configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FundsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fund_api.FundApi(api_client)

    body = InlineObject(
        data=FundIssuerSearchData(
            issuer=FundIssuerSearchDataIssuer(
                name="2)W2gl5wK*c-'LOQgfY,QI",
                country=FundIssuerSearchDataIssuerCountry(
                    restrict=FundIssuerSearchDataIssuerCountryRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundIssuerSearchDataIssuerCountryExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            fund=FundIssuerSearchDataFund(
                etf="include",
                domicile=FundIssuerSearchDataFundDomicile(
                    restrict=FundIssuerSearchDataFundDomicileRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundIssuerSearchDataFundDomicileExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            share_class=FundIssuerSearchDataShareClass(
                registration_country=FundIssuerSearchDataShareClassRegistrationCountry(
                    restrict=FundIssuerSearchDataShareClassRegistrationCountryRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundIssuerSearchDataShareClassRegistrationCountryExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            market=FundIssuerSearchDataMarket(
                restrict=FundIssuerSearchDataMarketRestrict(
                    ids=[
                        3.14,
                    ],
                ),
                exclude=FundIssuerSearchDataMarketExclude(
                    ids=[
                        3.14,
                    ],
                ),
            ),
        ),
        meta=FundIssuerSearchMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject |  (optional)

    try:
        # Search for issuers of funds.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_fund_issuer_search(body=body)
        pprint(api_response)

    except fds.sdk.FundsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling FundApi->post_fund_issuer_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_fund_notation_screener_search**
> InlineResponse2004 post_fund_notation_screener_search()

Screener for notations of share classes of mutual and exchange traded funds based on fund-specific parameters.

Screener for notations of share classes of mutual and exchange traded funds (ETF) based on fund-specific parameters. The funds represent legal entities, juristic persons in particular, and may have more than one share class. The share classes represent instruments, and the notations represent price sources for the share classes. Some parameters apply to the fund as a whole, i.e. a notation for each share class of a fund matching the criteria is returned, for example `issuer.selection`. Others apply to the share classes, thus only notations of matching share classes are returned, for example `minimumInvestment.initial`. The result is limited to the notations that satisfy all the selected filters. In order to guarantee comparability when using the performance parameters, the endpoint is restricted to three markets only, Mountain-View Funds (`id=1126`), FactSet Fund Prices (`id=1127`) and WM Datenservice (`id=1050`) since the notations from these markets provide a net asset value (NAV) - based total performance. The total performance factors in all earnings distributions of a share class and thus allows to compare the overall (total) performance of distributing and non-distributing share classes.       A specific set of share classes or share class notations can be restricted to or excluded by using customer-specific instrument or notation selection lists respectively. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FundsAPIforDigitalPortals
from fds.sdk.FundsAPIforDigitalPortals.api import fund_api
from fds.sdk.FundsAPIforDigitalPortals.models import *
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
configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FundsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fund_api.FundApi(api_client)

    body = InlineObject1(
        data=FundNotationScreenerSearchData(
            validation=FundNotationScreenerSearchDataValidation(
                only_active=True,
                prices=FundNotationScreenerSearchDataValidationPrices(
                    latest=FundNotationScreenerSearchDataValidationPricesLatest(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                    previous=FundNotationScreenerSearchDataValidationPricesPrevious(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                ),
                currency=FundNotationScreenerSearchDataValidationCurrency(
                    restrict=FundNotationScreenerSearchDataValidationCurrencyRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataValidationCurrencyExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                market=FundNotationScreenerSearchDataValidationMarket(
                    selection=FundNotationScreenerSearchDataValidationMarketSelection(
                        restrict=FundIssuerSearchDataMarketRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=FundIssuerSearchDataMarketExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    priority=FundNotationScreenerSearchDataValidationMarketPriority(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                instrument_selection_list=FundNotationScreenerSearchDataValidationInstrumentSelectionList(
                    restrict=FundNotationScreenerSearchDataValidationInstrumentSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataValidationInstrumentSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                notation_selection_list=FundNotationScreenerSearchDataValidationNotationSelectionList(
                    restrict=FundNotationScreenerSearchDataValidationNotationSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataValidationNotationSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            fund=FundNotationScreenerSearchDataFund(
                etf="include",
                currency=FundNotationScreenerSearchDataFundCurrency(
                    restrict=FundNotationScreenerSearchDataFundCurrencyRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataFundCurrencyExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                domicile=FundNotationScreenerSearchDataFundDomicile(
                    restrict=FundNotationScreenerSearchDataFundDomicileRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataFundDomicileExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                holding_type=FundNotationScreenerSearchDataFundHoldingType(
                    restrict=FundNotationScreenerSearchDataFundHoldingTypeRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataFundHoldingTypeExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                country_development=FundNotationScreenerSearchDataFundCountryDevelopment(
                    restrict=FundNotationScreenerSearchDataFundHoldingTypeRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataFundHoldingTypeExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                regional_exposure=FundNotationScreenerSearchDataFundRegionalExposure(
                    broad=FundNotationScreenerSearchDataFundRegionalExposureBroad(
                        restrict=FundNotationScreenerSearchDataFundHoldingTypeRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=FundNotationScreenerSearchDataFundHoldingTypeExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    specific=FundNotationScreenerSearchDataFundRegionalExposureSpecific(
                        restrict=FundNotationScreenerSearchDataFundHoldingTypeRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=FundNotationScreenerSearchDataFundHoldingTypeExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                ),
                strategy=FundNotationScreenerSearchDataFundStrategy(
                    restrict=FundNotationScreenerSearchDataFundHoldingTypeRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataFundHoldingTypeExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                industry=FundNotationScreenerSearchDataFundIndustry(
                    restrict=FundNotationScreenerSearchDataFundHoldingTypeRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataFundHoldingTypeExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                minimum_srri=FundNotationScreenerSearchDataFundMinimumSrri(
                    id=3.14,
                ),
                issuer=FundNotationScreenerSearchDataFundIssuer(
                    selection=FundNotationScreenerSearchDataFundIssuerSelection(
                        restrict=FundNotationScreenerSearchDataFundIssuerSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=FundNotationScreenerSearchDataFundIssuerSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    country=FundNotationScreenerSearchDataFundIssuerCountry(
                        restrict=FundIssuerSearchDataIssuerCountryRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=FundIssuerSearchDataIssuerCountryExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                ),
                assets_under_management=FundNotationScreenerSearchDataFundAssetsUnderManagement(
                    minimum=FundNotationScreenerSearchDataFundAssetsUnderManagementMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=FundNotationScreenerSearchDataFundAssetsUnderManagementMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                compliance=FundNotationScreenerSearchDataFundCompliance(
                    _or=[
                        FundNotationScreenerSearchDataFundComplianceOr(
                            _and=[
                                FundNotationScreenerSearchDataFundComplianceAnd(
                                    id=3.14,
                                    negate=True,
                                ),
                            ],
                        ),
                    ],
                ),
            ),
            share_class=FundNotationScreenerSearchDataShareClass(
                currency=FundNotationScreenerSearchDataShareClassCurrency(
                    restrict=FundNotationScreenerSearchDataShareClassCurrencyRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataShareClassCurrencyExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                distributing="include",
                registration_country=FundNotationScreenerSearchDataShareClassRegistrationCountry(
                    restrict=FundNotationScreenerSearchDataShareClassRegistrationCountryRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataShareClassRegistrationCountryExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                life_cycle=FundNotationScreenerSearchDataShareClassLifeCycle(
                    issue=FundNotationScreenerSearchDataShareClassLifeCycleIssue(
                        start=dateutil_parser('1970-01-01').date(),
                        end=dateutil_parser('1970-01-01').date(),
                    ),
                ),
                minimum_investment=FundNotationScreenerSearchDataShareClassMinimumInvestment(
                    initial=FundNotationScreenerSearchDataShareClassMinimumInvestmentInitial(
                        minimum=FundNotationScreenerSearchDataFundAssetsUnderManagementMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataFundAssetsUnderManagementMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    subsequent=FundNotationScreenerSearchDataShareClassMinimumInvestmentSubsequent(
                        minimum=FundNotationScreenerSearchDataFundAssetsUnderManagementMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataFundAssetsUnderManagementMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                assets_under_management=FundNotationScreenerSearchDataShareClassAssetsUnderManagement(
                    minimum=FundNotationScreenerSearchDataFundAssetsUnderManagementMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=FundNotationScreenerSearchDataFundAssetsUnderManagementMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                compliance=FundNotationScreenerSearchDataShareClassCompliance(
                    _or=[
                        FundNotationScreenerSearchDataFundComplianceOr(
                            _and=[
                                FundNotationScreenerSearchDataFundComplianceAnd(
                                    id=3.14,
                                    negate=True,
                                ),
                            ],
                        ),
                    ],
                ),
                fee=FundNotationScreenerSearchDataShareClassFee(
                    ongoing=FundNotationScreenerSearchDataShareClassFeeOngoing(
                        current=FundNotationScreenerSearchDataShareClassFeeOngoingCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    all_in=FundNotationScreenerSearchDataShareClassFeeAllIn(
                        current=FundNotationScreenerSearchDataShareClassFeeAllInCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    performance=FundNotationScreenerSearchDataShareClassFeePerformance(
                        current=FundNotationScreenerSearchDataShareClassFeePerformanceCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    management=FundNotationScreenerSearchDataShareClassFeeManagement(
                        current=FundNotationScreenerSearchDataShareClassFeeManagementCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    initial=FundNotationScreenerSearchDataShareClassFeeInitial(
                        minimum=FundNotationScreenerSearchDataShareClassFeeInitialMinimum(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        current=FundNotationScreenerSearchDataShareClassFeeInitialCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeInitialMaximum(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    distribution=FundNotationScreenerSearchDataShareClassFeeDistribution(
                        maximum=FundNotationScreenerSearchDataShareClassFeeDistributionMaximum(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    administration=FundNotationScreenerSearchDataShareClassFeeAdministration(
                        maximum=FundNotationScreenerSearchDataShareClassFeeAdministrationMaximum(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    handling=FundNotationScreenerSearchDataShareClassFeeHandling(
                        maximum=FundNotationScreenerSearchDataShareClassFeeHandlingMaximum(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    redemption=FundNotationScreenerSearchDataShareClassFeeRedemption(
                        current=FundNotationScreenerSearchDataShareClassFeeRedemptionCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeRedemptionMaximum(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    custodian_bank=FundNotationScreenerSearchDataShareClassFeeCustodianBank(
                        current=FundNotationScreenerSearchDataShareClassFeeCustodianBankCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    _12b=FundNotationScreenerSearchDataShareClassFee12b(
                        current=FundNotationScreenerSearchDataShareClassFee12bCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    switching=FundNotationScreenerSearchDataShareClassFeeSwitching(
                        current=FundNotationScreenerSearchDataShareClassFeeSwitchingCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                ),
            ),
            performance=FundNotationScreenerSearchDataPerformance(
                end_of_day=FundNotationScreenerSearchDataPerformanceEndOfDay(
                    day1=FundNotationScreenerSearchDataPerformanceEndOfDayDay1(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    week1=FundNotationScreenerSearchDataPerformanceEndOfDayWeek1(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    month1=FundNotationScreenerSearchDataPerformanceEndOfDayMonth1(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months3=FundNotationScreenerSearchDataPerformanceEndOfDayMonths3(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months6=FundNotationScreenerSearchDataPerformanceEndOfDayMonths6(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year1=FundNotationScreenerSearchDataPerformanceEndOfDayYear1(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years3=FundNotationScreenerSearchDataPerformanceEndOfDayYears3(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years5=FundNotationScreenerSearchDataPerformanceEndOfDayYears5(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year_to_date=FundNotationScreenerSearchDataPerformanceEndOfDayYearToDate(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
        ),
        meta=FundNotationScreenerSearchMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=[
                "currency.code",
            ],
            pagination=FundNotationScreenerSearchMetaPagination(
                offset=0,
                limit=0,
            ),
        ),
    ) # InlineObject1 |  (optional)

    try:
        # Screener for notations of share classes of mutual and exchange traded funds based on fund-specific parameters.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_fund_notation_screener_search(body=body)
        pprint(api_response)

    except fds.sdk.FundsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling FundApi->post_fund_notation_screener_search: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional]

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
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_fund_notation_screener_value_ranges_get**
> InlineResponse2005 post_fund_notation_screener_value_ranges_get()

Possible values and value ranges for the parameters used in the endpoint `/fund/notation/screener/search`.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/fund/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/fund/notation/screener/search` endpoint so that performing a search always leads to a non-empty set of notations. In order to guarantee comparability when using the performance parameter, the endpoint is restricted to three markets only, Mountain-View Funds (`id=1126`), FactSet Fund Prices (`id=1127`), and WM Datenservice (`id=1050`) since the notations from these markets provide a net asset value (NAV) - based total performance. The total performance factors in all earnings distributions of a share class and thus allows to compare the overall (total) performance of distributing and non-distributing share classes.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FundsAPIforDigitalPortals
from fds.sdk.FundsAPIforDigitalPortals.api import fund_api
from fds.sdk.FundsAPIforDigitalPortals.models import *
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
configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FundsAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FundsAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fund_api.FundApi(api_client)

    body = InlineObject2(
        data=FundNotationScreenerValueRangesGetData(
            validation=FundNotationScreenerSearchDataValidation(
                only_active=True,
                prices=FundNotationScreenerSearchDataValidationPrices(
                    latest=FundNotationScreenerSearchDataValidationPricesLatest(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                    previous=FundNotationScreenerSearchDataValidationPricesPrevious(
                        available_only=True,
                        minimum_date=dateutil_parser('1970-01-01').date(),
                    ),
                ),
                currency=FundNotationScreenerSearchDataValidationCurrency(
                    restrict=FundNotationScreenerSearchDataValidationCurrencyRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataValidationCurrencyExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                market=FundNotationScreenerSearchDataValidationMarket(
                    selection=FundNotationScreenerSearchDataValidationMarketSelection(
                        restrict=FundIssuerSearchDataMarketRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=FundIssuerSearchDataMarketExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    priority=FundNotationScreenerSearchDataValidationMarketPriority(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                instrument_selection_list=FundNotationScreenerSearchDataValidationInstrumentSelectionList(
                    restrict=FundNotationScreenerSearchDataValidationInstrumentSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataValidationInstrumentSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                notation_selection_list=FundNotationScreenerSearchDataValidationNotationSelectionList(
                    restrict=FundNotationScreenerSearchDataValidationNotationSelectionListRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataValidationNotationSelectionListExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
            ),
            fund=FundNotationScreenerSearchDataFund(
                etf="include",
                currency=FundNotationScreenerSearchDataFundCurrency(
                    restrict=FundNotationScreenerSearchDataFundCurrencyRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataFundCurrencyExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                domicile=FundNotationScreenerSearchDataFundDomicile(
                    restrict=FundNotationScreenerSearchDataFundDomicileRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataFundDomicileExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                holding_type=FundNotationScreenerSearchDataFundHoldingType(
                    restrict=FundNotationScreenerSearchDataFundHoldingTypeRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataFundHoldingTypeExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                country_development=FundNotationScreenerSearchDataFundCountryDevelopment(
                    restrict=FundNotationScreenerSearchDataFundHoldingTypeRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataFundHoldingTypeExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                regional_exposure=FundNotationScreenerSearchDataFundRegionalExposure(
                    broad=FundNotationScreenerSearchDataFundRegionalExposureBroad(
                        restrict=FundNotationScreenerSearchDataFundHoldingTypeRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=FundNotationScreenerSearchDataFundHoldingTypeExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    specific=FundNotationScreenerSearchDataFundRegionalExposureSpecific(
                        restrict=FundNotationScreenerSearchDataFundHoldingTypeRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=FundNotationScreenerSearchDataFundHoldingTypeExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                ),
                strategy=FundNotationScreenerSearchDataFundStrategy(
                    restrict=FundNotationScreenerSearchDataFundHoldingTypeRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataFundHoldingTypeExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                industry=FundNotationScreenerSearchDataFundIndustry(
                    restrict=FundNotationScreenerSearchDataFundHoldingTypeRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataFundHoldingTypeExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                minimum_srri=FundNotationScreenerSearchDataFundMinimumSrri(
                    id=3.14,
                ),
                issuer=FundNotationScreenerSearchDataFundIssuer(
                    selection=FundNotationScreenerSearchDataFundIssuerSelection(
                        restrict=FundNotationScreenerSearchDataFundIssuerSelectionRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=FundNotationScreenerSearchDataFundIssuerSelectionExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                    country=FundNotationScreenerSearchDataFundIssuerCountry(
                        restrict=FundIssuerSearchDataIssuerCountryRestrict(
                            ids=[
                                3.14,
                            ],
                        ),
                        exclude=FundIssuerSearchDataIssuerCountryExclude(
                            ids=[
                                3.14,
                            ],
                        ),
                    ),
                ),
                assets_under_management=FundNotationScreenerSearchDataFundAssetsUnderManagement(
                    minimum=FundNotationScreenerSearchDataFundAssetsUnderManagementMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=FundNotationScreenerSearchDataFundAssetsUnderManagementMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                compliance=FundNotationScreenerSearchDataFundCompliance(
                    _or=[
                        FundNotationScreenerSearchDataFundComplianceOr(
                            _and=[
                                FundNotationScreenerSearchDataFundComplianceAnd(
                                    id=3.14,
                                    negate=True,
                                ),
                            ],
                        ),
                    ],
                ),
            ),
            share_class=FundNotationScreenerSearchDataShareClass(
                currency=FundNotationScreenerSearchDataShareClassCurrency(
                    restrict=FundNotationScreenerSearchDataShareClassCurrencyRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataShareClassCurrencyExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                distributing="include",
                registration_country=FundNotationScreenerSearchDataShareClassRegistrationCountry(
                    restrict=FundNotationScreenerSearchDataShareClassRegistrationCountryRestrict(
                        ids=[
                            3.14,
                        ],
                    ),
                    exclude=FundNotationScreenerSearchDataShareClassRegistrationCountryExclude(
                        ids=[
                            3.14,
                        ],
                    ),
                ),
                life_cycle=FundNotationScreenerSearchDataShareClassLifeCycle(
                    issue=FundNotationScreenerSearchDataShareClassLifeCycleIssue(
                        start=dateutil_parser('1970-01-01').date(),
                        end=dateutil_parser('1970-01-01').date(),
                    ),
                ),
                minimum_investment=FundNotationScreenerSearchDataShareClassMinimumInvestment(
                    initial=FundNotationScreenerSearchDataShareClassMinimumInvestmentInitial(
                        minimum=FundNotationScreenerSearchDataFundAssetsUnderManagementMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataFundAssetsUnderManagementMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    subsequent=FundNotationScreenerSearchDataShareClassMinimumInvestmentSubsequent(
                        minimum=FundNotationScreenerSearchDataFundAssetsUnderManagementMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataFundAssetsUnderManagementMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
                assets_under_management=FundNotationScreenerSearchDataShareClassAssetsUnderManagement(
                    minimum=FundNotationScreenerSearchDataFundAssetsUnderManagementMinimum(
                        value=3.14,
                        inclusive=True,
                    ),
                    maximum=FundNotationScreenerSearchDataFundAssetsUnderManagementMaximum(
                        value=3.14,
                        inclusive=True,
                    ),
                ),
                compliance=FundNotationScreenerSearchDataShareClassCompliance(
                    _or=[
                        FundNotationScreenerSearchDataFundComplianceOr(
                            _and=[
                                FundNotationScreenerSearchDataFundComplianceAnd(
                                    id=3.14,
                                    negate=True,
                                ),
                            ],
                        ),
                    ],
                ),
                fee=FundNotationScreenerSearchDataShareClassFee(
                    ongoing=FundNotationScreenerSearchDataShareClassFeeOngoing(
                        current=FundNotationScreenerSearchDataShareClassFeeOngoingCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    all_in=FundNotationScreenerSearchDataShareClassFeeAllIn(
                        current=FundNotationScreenerSearchDataShareClassFeeAllInCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    performance=FundNotationScreenerSearchDataShareClassFeePerformance(
                        current=FundNotationScreenerSearchDataShareClassFeePerformanceCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    management=FundNotationScreenerSearchDataShareClassFeeManagement(
                        current=FundNotationScreenerSearchDataShareClassFeeManagementCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    initial=FundNotationScreenerSearchDataShareClassFeeInitial(
                        minimum=FundNotationScreenerSearchDataShareClassFeeInitialMinimum(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        current=FundNotationScreenerSearchDataShareClassFeeInitialCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeInitialMaximum(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    distribution=FundNotationScreenerSearchDataShareClassFeeDistribution(
                        maximum=FundNotationScreenerSearchDataShareClassFeeDistributionMaximum(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    administration=FundNotationScreenerSearchDataShareClassFeeAdministration(
                        maximum=FundNotationScreenerSearchDataShareClassFeeAdministrationMaximum(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    handling=FundNotationScreenerSearchDataShareClassFeeHandling(
                        maximum=FundNotationScreenerSearchDataShareClassFeeHandlingMaximum(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    redemption=FundNotationScreenerSearchDataShareClassFeeRedemption(
                        current=FundNotationScreenerSearchDataShareClassFeeRedemptionCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeRedemptionMaximum(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    custodian_bank=FundNotationScreenerSearchDataShareClassFeeCustodianBank(
                        current=FundNotationScreenerSearchDataShareClassFeeCustodianBankCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    _12b=FundNotationScreenerSearchDataShareClassFee12b(
                        current=FundNotationScreenerSearchDataShareClassFee12bCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                    switching=FundNotationScreenerSearchDataShareClassFeeSwitching(
                        current=FundNotationScreenerSearchDataShareClassFeeSwitchingCurrent(
                            minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                                value=3.14,
                                inclusive=True,
                            ),
                            maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                                value=3.14,
                                inclusive=True,
                            ),
                        ),
                    ),
                ),
            ),
            performance=FundNotationScreenerValueRangesGetDataPerformance(
                end_of_day=FundNotationScreenerValueRangesGetDataPerformanceEndOfDay(
                    day1=FundNotationScreenerSearchDataPerformanceEndOfDayDay1(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    week1=FundNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1Maximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    month1=FundNotationScreenerSearchDataPerformanceEndOfDayMonth1(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months3=FundNotationScreenerSearchDataPerformanceEndOfDayMonths3(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    months6=FundNotationScreenerSearchDataPerformanceEndOfDayMonths6(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year1=FundNotationScreenerSearchDataPerformanceEndOfDayYear1(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years3=FundNotationScreenerSearchDataPerformanceEndOfDayYears3(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    years5=FundNotationScreenerSearchDataPerformanceEndOfDayYears5(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                    year_to_date=FundNotationScreenerSearchDataPerformanceEndOfDayYearToDate(
                        minimum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum(
                            value=3.14,
                            inclusive=True,
                        ),
                        maximum=FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum(
                            value=3.14,
                            inclusive=True,
                        ),
                    ),
                ),
            ),
        ),
        meta=FundNotationScreenerValueRangesGetMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # InlineObject2 |  (optional)

    try:
        # Possible values and value ranges for the parameters used in the endpoint `/fund/notation/screener/search`.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_fund_notation_screener_value_ranges_get(body=body)
        pprint(api_response)

    except fds.sdk.FundsAPIforDigitalPortals.ApiException as e:
        print("Exception when calling FundApi->post_fund_notation_screener_value_ranges_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


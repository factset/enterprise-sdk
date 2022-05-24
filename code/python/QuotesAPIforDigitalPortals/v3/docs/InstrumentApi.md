# fds.sdk.QuotesAPIforDigitalPortals.InstrumentApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_instrument_background_text_list_by_instrument**](InstrumentApi.md#get_instrument_background_text_list_by_instrument) | **GET** /instrument/backgroundText/listByInstrument | Background texts of an instrument.
[**get_instrument_compliance_property_list_by_instrument**](InstrumentApi.md#get_instrument_compliance_property_list_by_instrument) | **GET** /instrument/complianceProperty/listByInstrument | Compliance properties of an instrument.
[**get_instrument_composite_get**](InstrumentApi.md#get_instrument_composite_get) | **GET** /instrument/composite/get | Composite instrument and its components.
[**get_instrument_coupon_day_count_convention_type_list**](InstrumentApi.md#get_instrument_coupon_day_count_convention_type_list) | **GET** /instrument/coupon/dayCountConvention/type/list | List of day count convention types.
[**get_instrument_coupon_interest_rate_type_list**](InstrumentApi.md#get_instrument_coupon_interest_rate_type_list) | **GET** /instrument/coupon/interestRate/type/list | List of interest rate types.
[**get_instrument_coupon_key_data_get**](InstrumentApi.md#get_instrument_coupon_key_data_get) | **GET** /instrument/coupon/keyData/get | Interest rate details for selected periods of an interest-bearing instrument.
[**get_instrument_coupon_list**](InstrumentApi.md#get_instrument_coupon_list) | **GET** /instrument/coupon/list | List of coupons for an interest-bearing instrument.
[**get_instrument_cross_reference_get_by_isin**](InstrumentApi.md#get_instrument_cross_reference_get_by_isin) | **GET** /instrument/crossReference/getByISIN | Translate ISIN to instrument.
[**get_instrument_cross_reference_get_by_wkn**](InstrumentApi.md#get_instrument_cross_reference_get_by_wkn) | **GET** /instrument/crossReference/getByWKN | Translate WKN to instrument.
[**get_instrument_cross_reference_history_get_by_isin**](InstrumentApi.md#get_instrument_cross_reference_history_get_by_isin) | **GET** /instrument/crossReference/history/getByISIN | ISIN to instrument translation history.
[**get_instrument_cross_reference_history_get_by_wkn**](InstrumentApi.md#get_instrument_cross_reference_history_get_by_wkn) | **GET** /instrument/crossReference/history/getByWKN | WKN to instrument translation history.
[**get_instrument_exchange_rate_get**](InstrumentApi.md#get_instrument_exchange_rate_get) | **GET** /instrument/exchangeRate/get | Retrieve an exchange rate instrument identifier.
[**get_instrument_exchange_rate_get_by_iso_code**](InstrumentApi.md#get_instrument_exchange_rate_get_by_iso_code) | **GET** /instrument/exchangeRate/getByISOCode | Retrieve an exchange rate instrument identifier.
[**get_instrument_get**](InstrumentApi.md#get_instrument_get) | **GET** /instrument/get | Basic data for an instrument.
[**get_instrument_get_by_notation**](InstrumentApi.md#get_instrument_get_by_notation) | **GET** /instrument/getByNotation | Basic data for an instrument.
[**get_instrument_legal_entity_background_text_list_by_instrument**](InstrumentApi.md#get_instrument_legal_entity_background_text_list_by_instrument) | **GET** /instrument/legalEntity/backgroundText/listByInstrument | Role-specific background texts of legal entities related to an instrument.
[**get_instrument_legal_entity_compliance_property_list_by_instrument**](InstrumentApi.md#get_instrument_legal_entity_compliance_property_list_by_instrument) | **GET** /instrument/legalEntity/complianceProperty/listByInstrument | Role-specific compliance properties of legal entities related to an instrument.
[**get_instrument_mifid_get**](InstrumentApi.md#get_instrument_mifid_get) | **GET** /instrument/mifid/get | MiFID II data for a financial instrument.
[**get_instrument_search_basic**](InstrumentApi.md#get_instrument_search_basic) | **GET** /instrument/search/basic | Basic search for instruments.
[**post_instrument_background_text_type_list**](InstrumentApi.md#post_instrument_background_text_type_list) | **POST** /instrument/backgroundText/type/list | List of background text types for instruments.
[**post_instrument_benchmark_list**](InstrumentApi.md#post_instrument_benchmark_list) | **POST** /instrument/benchmark/list | List of benchmarks of a financial instrument.
[**post_instrument_category_list**](InstrumentApi.md#post_instrument_category_list) | **POST** /instrument/category/list | List of categories assigned to a specific instrument the application is entitled to see.
[**post_instrument_compliance_property_list**](InstrumentApi.md#post_instrument_compliance_property_list) | **POST** /instrument/complianceProperty/list | List of compliance properties for instruments.
[**post_instrument_cross_reference_list_by_isin**](InstrumentApi.md#post_instrument_cross_reference_list_by_isin) | **POST** /instrument/crossReference/listByISIN | Translate a list of ISINs to instruments.
[**post_instrument_cross_reference_list_by_wkn**](InstrumentApi.md#post_instrument_cross_reference_list_by_wkn) | **POST** /instrument/crossReference/listByWKN | Translate a list of WKNs to instruments.
[**post_instrument_rating_grade_list**](InstrumentApi.md#post_instrument_rating_grade_list) | **POST** /instrument/rating/grade/list | List of rating grades for a list of instruments.


# **get_instrument_background_text_list_by_instrument**
> InlineResponse20044 get_instrument_background_text_list_by_instrument(id)

Background texts of an instrument.

Background texts of an instrument.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20044 import InlineResponse20044
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    id = "id_example" # str | Identifier of an instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Background texts of an instrument.
        api_response = api_instance.get_instrument_background_text_list_by_instrument(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_background_text_list_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of an instrument. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20044**](InlineResponse20044.md)

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

# **get_instrument_compliance_property_list_by_instrument**
> InlineResponse20049 get_instrument_compliance_property_list_by_instrument(id)

Compliance properties of an instrument.

Compliance properties of an instrument.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20049 import InlineResponse20049
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    id = "id_example" # str | Identifier of an instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Compliance properties of an instrument.
        api_response = api_instance.get_instrument_compliance_property_list_by_instrument(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_compliance_property_list_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of an instrument. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20049**](InlineResponse20049.md)

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

# **get_instrument_composite_get**
> InlineResponse20050 get_instrument_composite_get(id)

Composite instrument and its components.

Composite instrument and its components.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20050 import InlineResponse20050
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    id = "id_example" # str | Identifier of a composite instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Composite instrument and its components.
        api_response = api_instance.get_instrument_composite_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_composite_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of a composite instrument. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20050**](InlineResponse20050.md)

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

# **get_instrument_coupon_day_count_convention_type_list**
> InlineResponse20052 get_instrument_coupon_day_count_convention_type_list()

List of day count convention types.

List of day count convention types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20052 import InlineResponse20052
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # List of day count convention types.
        api_response = api_instance.get_instrument_coupon_day_count_convention_type_list(attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_coupon_day_count_convention_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20052**](InlineResponse20052.md)

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

# **get_instrument_coupon_interest_rate_type_list**
> InlineResponse20053 get_instrument_coupon_interest_rate_type_list()

List of interest rate types.

List of interest rate types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20053 import InlineResponse20053
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # List of interest rate types.
        api_response = api_instance.get_instrument_coupon_interest_rate_type_list(attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_coupon_interest_rate_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20053**](InlineResponse20053.md)

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

# **get_instrument_coupon_key_data_get**
> InlineResponse20054 get_instrument_coupon_key_data_get(id)

Interest rate details for selected periods of an interest-bearing instrument.

Interest rate details for selected periods of an interest-bearing instrument; any other instrument yields empty values.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20054 import InlineResponse20054
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    id = "id_example" # str | Identifier of an instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Interest rate details for selected periods of an interest-bearing instrument.
        api_response = api_instance.get_instrument_coupon_key_data_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_coupon_key_data_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of an instrument. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20054**](InlineResponse20054.md)

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

# **get_instrument_coupon_list**
> InlineResponse20051 get_instrument_coupon_list(id)

List of coupons for an interest-bearing instrument.

List of coupons for an interest-bearing instrument; any other instrument yields empty values. The endpoint provides details regarding the coupon period, the respective interest rate, and payable amount (the latter only for instruments with a fixed nominal value). The list of coupons is generally not available for a perpetual, i.e. without a predefined maturity date, interst-bearing instrument.   If there is no entitled provider supplying a full list of coupons, the list will be synthesized from summary data available from entitled suppliers (if any). Since the exact product terms are not known, e.g. the handling of holidays and weekends, the list may be imprecise.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20051 import InlineResponse20051
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    id = "id_example" # str | Identifier of an instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # List of coupons for an interest-bearing instrument.
        api_response = api_instance.get_instrument_coupon_list(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_coupon_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of an instrument. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20051**](InlineResponse20051.md)

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

# **get_instrument_cross_reference_get_by_isin**
> InlineResponse20055 get_instrument_cross_reference_get_by_isin(isin)

Translate ISIN to instrument.

Translate a given ISIN to the respective most recent instrument identifier, retrieved from the Cross Reference Service.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20055 import InlineResponse20055
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    isin = "isin_example" # str | Source ISIN to be translated.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Translate ISIN to instrument.
        api_response = api_instance.get_instrument_cross_reference_get_by_isin(isin, attributes=attributes)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_cross_reference_get_by_isin: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isin** | **str**| Source ISIN to be translated. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20055**](InlineResponse20055.md)

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

# **get_instrument_cross_reference_get_by_wkn**
> InlineResponse20055 get_instrument_cross_reference_get_by_wkn(wkn)

Translate WKN to instrument.

Translate a given WKN to the respective most recent instrument identifier, retrieved from the Cross Reference Service.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20055 import InlineResponse20055
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    wkn = "8Q6ZGCKEC0L3O4GI7XHK0J" # str | Source WKN to be translated.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Translate WKN to instrument.
        api_response = api_instance.get_instrument_cross_reference_get_by_wkn(wkn, attributes=attributes)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_cross_reference_get_by_wkn: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wkn** | **str**| Source WKN to be translated. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20055**](InlineResponse20055.md)

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

# **get_instrument_cross_reference_history_get_by_isin**
> InlineResponse20058 get_instrument_cross_reference_history_get_by_isin(isin)

ISIN to instrument translation history.

Retrieve the complete translation history of a given ISIN to the respective instrument association from the Cross Reference Service. The results are sorted in descending order, starting with the most recent.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20058 import InlineResponse20058
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    isin = "isin_example" # str | Source ISIN to be translated.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) (default to 0.0)
    pagination_limit = 10.0 # float | Non-negative maximum number of entries to return. (optional) (default to 10.0)

    try:
        # ISIN to instrument translation history.
        api_response = api_instance.get_instrument_cross_reference_history_get_by_isin(isin, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_cross_reference_history_get_by_isin: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isin** | **str**| Source ISIN to be translated. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 10.0

### Return type

[**InlineResponse20058**](InlineResponse20058.md)

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

# **get_instrument_cross_reference_history_get_by_wkn**
> InlineResponse20058 get_instrument_cross_reference_history_get_by_wkn(wkn)

WKN to instrument translation history.

Retrieve the complete translation history of a given WKN to the respective instrument association from the Cross Reference Service. The results are sorted in descending order, starting with the most recent.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20058 import InlineResponse20058
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    wkn = "8Q6ZGCKEC0L3O4GI7XHK0J" # str | Source WKN to be translated.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) (default to 0.0)
    pagination_limit = 10.0 # float | Non-negative maximum number of entries to return. (optional) (default to 10.0)

    try:
        # WKN to instrument translation history.
        api_response = api_instance.get_instrument_cross_reference_history_get_by_wkn(wkn, attributes=attributes, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_cross_reference_history_get_by_wkn: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wkn** | **str**| Source WKN to be translated. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 10.0

### Return type

[**InlineResponse20058**](InlineResponse20058.md)

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

# **get_instrument_exchange_rate_get**
> InlineResponse20059 get_instrument_exchange_rate_get(target, source)

Retrieve an exchange rate instrument identifier.

Retrieve an exchange rate instrument identifier using the identifier of the main currencies represented by that exchange rate.    An error is returned if one of the provided parameters is invalid or if no instrument is associated with the given combination of parameters.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20059 import InlineResponse20059
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    target = 3.14 # float | Identifier of the target main currency. See endpoint `/basic/valueUnit/currency/main/list` for valid values.
    source = 3.14 # float | Identifier of the source main currency. See endpoint `/basic/valueUnit/currency/main/list` for valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Retrieve an exchange rate instrument identifier.
        api_response = api_instance.get_instrument_exchange_rate_get(target, source, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_exchange_rate_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target** | **float**| Identifier of the target main currency. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for valid values. |
 **source** | **float**| Identifier of the source main currency. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for valid values. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20059**](InlineResponse20059.md)

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

# **get_instrument_exchange_rate_get_by_iso_code**
> InlineResponse20059 get_instrument_exchange_rate_get_by_iso_code(target, source)

Retrieve an exchange rate instrument identifier.

Retrieve an exchange rate instrument identifier using the ISO 4217 code of the main currencies represented by that exchange rate.   An error is returned if one of the provided parameters is invalid or if no instrument is associated with the given combination of parameters.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20059 import InlineResponse20059
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    target = "target_example" # str | ISO 4217 code of the target main currency.
    source = "source_example" # str | ISO 4217 code of the source main currency.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Retrieve an exchange rate instrument identifier.
        api_response = api_instance.get_instrument_exchange_rate_get_by_iso_code(target, source, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_exchange_rate_get_by_iso_code: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target** | **str**| ISO 4217 code of the target main currency. |
 **source** | **str**| ISO 4217 code of the source main currency. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20059**](InlineResponse20059.md)

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

# **get_instrument_get**
> InlineResponse20042 get_instrument_get(id)

Basic data for an instrument.

Basic data for an instrument.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20042 import InlineResponse20042
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    id = "id_example" # str | Identifier of an instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Basic data for an instrument.
        api_response = api_instance.get_instrument_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of an instrument. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20042**](InlineResponse20042.md)

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

# **get_instrument_get_by_notation**
> InlineResponse20043 get_instrument_get_by_notation(id)

Basic data for an instrument.

Basic data for an instrument.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20043 import InlineResponse20043
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    id = "id_example" # str | Identifier of a notation.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Basic data for an instrument.
        api_response = api_instance.get_instrument_get_by_notation(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_get_by_notation: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of a notation. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

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

# **get_instrument_legal_entity_background_text_list_by_instrument**
> InlineResponse20060 get_instrument_legal_entity_background_text_list_by_instrument(id)

Role-specific background texts of legal entities related to an instrument.

Role-specific background texts of legal entities related to an instrument.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20060 import InlineResponse20060
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    id = "id_example" # str | Identifier of an instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Role-specific background texts of legal entities related to an instrument.
        api_response = api_instance.get_instrument_legal_entity_background_text_list_by_instrument(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_legal_entity_background_text_list_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of an instrument. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20060**](InlineResponse20060.md)

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

# **get_instrument_legal_entity_compliance_property_list_by_instrument**
> InlineResponse20061 get_instrument_legal_entity_compliance_property_list_by_instrument(id)

Role-specific compliance properties of legal entities related to an instrument.

Role-specic compliance properties of legal entities related to an instrument.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20061 import InlineResponse20061
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    id = "id_example" # str | Identifier of an instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # Role-specific compliance properties of legal entities related to an instrument.
        api_response = api_instance.get_instrument_legal_entity_compliance_property_list_by_instrument(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_legal_entity_compliance_property_list_by_instrument: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of an instrument. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20061**](InlineResponse20061.md)

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

# **get_instrument_mifid_get**
> InlineResponse20062 get_instrument_mifid_get(id)

MiFID II data for a financial instrument.

MiFID II data for a specified financial instrument. The instruments governed by MiFID II are called \"investment products\".

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20062 import InlineResponse20062
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    id = "id_example" # str | Identifier of the instrument.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)

    try:
        # MiFID II data for a financial instrument.
        api_response = api_instance.get_instrument_mifid_get(id, attributes=attributes, language=language)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_mifid_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the instrument. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20062**](InlineResponse20062.md)

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

# **get_instrument_search_basic**
> InlineResponse20087 get_instrument_search_basic(search_value)

Basic search for instruments.

Search for instruments whose ISIN, specified NSINs, or name match the search value according to a tolerant full-text match algorithm. Better matching results appear in the response before less relevant matches.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20087 import InlineResponse20087
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    search_value = "RyDnZVoeN782F) 9-xW)gz" # str | The search value of the instruments searching for. It may be enclosed in double quotes (\"). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \" daimler\".
    nsins = [
        "wkn",
    ] # [str] | A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. (optional)
    asset_class = "index" # str | A parameter to limit the output to a particular asset class. (optional)
    only_active = True # bool | If true, restricts the result to active instruments. (optional) (default to True)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    language = "_language_example" # str | ISO 639-1 code of the language. (optional)
    pagination_offset = 0.0 # float | Non-negative number of entries to skip, or 0 (default). (optional) (default to 0.0)
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) (default to 20.0)

    try:
        # Basic search for instruments.
        api_response = api_instance.get_instrument_search_basic(search_value, nsins=nsins, asset_class=asset_class, only_active=only_active, attributes=attributes, language=language, pagination_offset=pagination_offset, pagination_limit=pagination_limit)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->get_instrument_search_basic: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_value** | **str**| The search value of the instruments searching for. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. |
 **nsins** | **[str]**| A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. | [optional]
 **asset_class** | **str**| A parameter to limit the output to a particular asset class. | [optional]
 **only_active** | **bool**| If true, restricts the result to active instruments. | [optional] if omitted the server will use the default value of True
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **str**| ISO 639-1 code of the language. | [optional]
 **pagination_offset** | **float**| Non-negative number of entries to skip, or 0 (default). | [optional] if omitted the server will use the default value of 0.0
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

### Return type

[**InlineResponse20087**](InlineResponse20087.md)

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

# **post_instrument_background_text_type_list**
> InlineResponse20045 post_instrument_background_text_type_list()

List of background text types for instruments.

List of background text types for instruments.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20045 import InlineResponse20045
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_object9 import InlineObject9
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    body = InlineObject9(
        data=InstrumentBackgroundTextTypeListData(
            filter=InstrumentBackgroundTextTypeListDataFilter(
                ids=[
                    3.14,
                ],
            ),
        ),
        meta=InstrumentBackgroundTextTypeListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # InlineObject9 |  (optional)

    try:
        # List of background text types for instruments.
        api_response = api_instance.post_instrument_background_text_type_list(body=body)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_background_text_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject9**](InlineObject9.md)|  | [optional]

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

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

# **post_instrument_benchmark_list**
> InlineResponse20046 post_instrument_benchmark_list()

List of benchmarks of a financial instrument.

Provides a list of benchmark notations for a selected financial instrument, optionally restricted to specific benchmark types.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20046 import InlineResponse20046
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_object10 import InlineObject10
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    body = InlineObject10(
        data=InstrumentBenchmarkListData(
            id="id_example",
            filter=InstrumentBenchmarkListDataFilter(
                types=[
                    3.14,
                ],
            ),
        ),
        meta=InstrumentBackgroundTextTypeListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # InlineObject10 |  (optional)

    try:
        # List of benchmarks of a financial instrument.
        api_response = api_instance.post_instrument_benchmark_list(body=body)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_benchmark_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject10**](InlineObject10.md)|  | [optional]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

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

# **post_instrument_category_list**
> InlineResponse20047 post_instrument_category_list()

List of categories assigned to a specific instrument the application is entitled to see.

List of categories assigned to a specific instrument the application is entitled to see. Optionally it is possible to restrict the output to only list those for a specific category dataset.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20047 import InlineResponse20047
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_object11 import InlineObject11
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    body = InlineObject11(
        data=InstrumentCategoryListData(
            id="id_example",
            filter=InstrumentCategoryListDataFilter(
                dataset=InstrumentCategoryListDataFilterDataset(
                    id=3.14,
                ),
            ),
        ),
        meta=InstrumentCategoryListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
            sort=[
                "dataset.id",
            ],
        ),
    ) # InlineObject11 |  (optional)

    try:
        # List of categories assigned to a specific instrument the application is entitled to see.
        api_response = api_instance.post_instrument_category_list(body=body)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_category_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject11**](InlineObject11.md)|  | [optional]

### Return type

[**InlineResponse20047**](InlineResponse20047.md)

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

# **post_instrument_compliance_property_list**
> InlineResponse20048 post_instrument_compliance_property_list()

List of compliance properties for instruments.

List of compliance properties for instruments.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20048 import InlineResponse20048
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_object12 import InlineObject12
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    body = InlineObject12(
        data=InstrumentCompliancePropertyListData(
            filter=InstrumentCompliancePropertyListDataFilter(
                ids=[
                    3.14,
                ],
            ),
        ),
        meta=InstrumentBackgroundTextTypeListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            language=LanguageMember("language_example"),
        ),
    ) # InlineObject12 |  (optional)

    try:
        # List of compliance properties for instruments.
        api_response = api_instance.post_instrument_compliance_property_list(body=body)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_compliance_property_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject12**](InlineObject12.md)|  | [optional]

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

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

# **post_instrument_cross_reference_list_by_isin**
> InlineResponse20056 post_instrument_cross_reference_list_by_isin(body)

Translate a list of ISINs to instruments.

Translate a given list of ISINs to the respective most recent instrument identifiers, retrieved from the Cross Reference Service.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20056 import InlineResponse20056
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_object13 import InlineObject13
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    body = InlineObject13(
        data=InstrumentCrossReferenceListByISINData(
            isins=[
                "isins_example",
            ],
        ),
        meta=BasicBackgroundTextTypeListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject13 | 

    try:
        # Translate a list of ISINs to instruments.
        api_response = api_instance.post_instrument_cross_reference_list_by_isin(body)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_cross_reference_list_by_isin: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject13**](InlineObject13.md)|  |

### Return type

[**InlineResponse20056**](InlineResponse20056.md)

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

# **post_instrument_cross_reference_list_by_wkn**
> InlineResponse20057 post_instrument_cross_reference_list_by_wkn(body)

Translate a list of WKNs to instruments.

Translate a given list of WKNs to the respective most recent instrument identifiers, retrieved from the Cross Reference Service.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20057 import InlineResponse20057
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_object14 import InlineObject14
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    body = InlineObject14(
        data=InstrumentCrossReferenceListByWKNData(
            wkns=[
                "8Q6ZGCKEC0L3O4GI7XHK0J",
            ],
        ),
        meta=BasicBackgroundTextTypeListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject14 | 

    try:
        # Translate a list of WKNs to instruments.
        api_response = api_instance.post_instrument_cross_reference_list_by_wkn(body)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_cross_reference_list_by_wkn: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject14**](InlineObject14.md)|  |

### Return type

[**InlineResponse20057**](InlineResponse20057.md)

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

# **post_instrument_rating_grade_list**
> InlineResponse20063 post_instrument_rating_grade_list()

List of rating grades for a list of instruments.

List of rating grades for a list of instruments. The list can be restricted to rating grades belonging to particular rating systems.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import instrument_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20063 import InlineResponse20063
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_object15 import InlineObject15
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = instrument_api.InstrumentApi(api_client)

    body = InlineObject15(
        data=InstrumentRatingGradeListData(
            ids=[
                "ids_example",
            ],
            filter=InstrumentRatingGradeListDataFilter(
                rating_system=InstrumentRatingGradeListDataFilterRatingSystem(
                    ids=[
                        3.14,
                    ],
                ),
            ),
        ),
        meta=BasicBackgroundTextTypeListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject15 |  (optional)

    try:
        # List of rating grades for a list of instruments.
        api_response = api_instance.post_instrument_rating_grade_list(body=body)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling InstrumentApi->post_instrument_rating_grade_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject15**](InlineObject15.md)|  | [optional]

### Return type

[**InlineResponse20063**](InlineResponse20063.md)

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


# fds.sdk.ChartGenerationService.ChartTemplatesApi

All URIs are relative to *https://api.factset.com/charting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_category_list**](ChartTemplatesApi.md#get_category_list) | **GET** /catalog/categories | Get a list of chart categories
[**get_chart_list**](ChartTemplatesApi.md#get_chart_list) | **GET** /catalog/charts | Get a list of chart templates that can be used for getting the image from the service.
[**images**](ChartTemplatesApi.md#images) | **GET** /image | Get chart image back in PNG or JPEG formats



# **get_category_list**
> CategoryListResponse get_category_list()

Get a list of chart categories

Retrieve a list of all chart categories with getCategoryList() API call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ChartGenerationService
from fds.sdk.ChartGenerationService.api import chart_templates_api
from fds.sdk.ChartGenerationService.models import *
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
configuration = fds.sdk.ChartGenerationService.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ChartGenerationService.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ChartGenerationService.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = chart_templates_api.ChartTemplatesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Get a list of chart categories
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_category_list()

        pprint(api_response)

    except fds.sdk.ChartGenerationService.ApiException as e:
        print("Exception when calling ChartTemplatesApi->get_category_list: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**CategoryListResponse**](CategoryListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Input |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_chart_list**
> CategorizedChartList get_chart_list()

Get a list of chart templates that can be used for getting the image from the service.

You can get all the charts present or can just get the information by categories. The response includes the name of the chart, description, tags and any additional input specific to that chart. Use the information from this response to determine what charts you want and get its image from /images endpoint. Additionally you can also get back a auto generated PDF for the categories you requested for.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ChartGenerationService
from fds.sdk.ChartGenerationService.api import chart_templates_api
from fds.sdk.ChartGenerationService.models import *
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
configuration = fds.sdk.ChartGenerationService.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ChartGenerationService.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ChartGenerationService.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = chart_templates_api.ChartTemplatesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    categories = "categories_example" # str | A comma delimited string of catgory names to limit the response to certain categories. If nothing is provided, all charts under every category would be listed out. (optional)

    try:
        # Get a list of chart templates that can be used for getting the image from the service.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_chart_list(categories=categories)

        pprint(api_response)

    except fds.sdk.ChartGenerationService.ApiException as e:
        print("Exception when calling ChartTemplatesApi->get_chart_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categories** | **str**| A comma delimited string of catgory names to limit the response to certain categories. If nothing is provided, all charts under every category would be listed out. | [optional]

### Return type

[**CategorizedChartList**](CategorizedChartList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Input |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **images**
> file_type images(chart)

Get chart image back in PNG or JPEG formats

Get a chart image in PNG or JPEG formats with the images() API call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ChartGenerationService
from fds.sdk.ChartGenerationService.api import chart_templates_api
from fds.sdk.ChartGenerationService.models import *
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
configuration = fds.sdk.ChartGenerationService.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ChartGenerationService.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ChartGenerationService.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = chart_templates_api.ChartTemplatesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    chart = "Equity/RSI" # str | Path to the saved chart. For any of the default charts, the option should be `categoryName + '/' + chartName`. For charts under the Client or Personal directories, the option should be `directoryName + ':/' + pathTotheChart`.  
    ids = "FDS,AAPL" # str | List of identifiers to be charted in a comma(,) separated string. Only the first one would be considered as primary and rest would be added as comps. Check the catalog for more information on which charts require a ticker. (optional)
    sd = "-1Y" # str | Option for overriding the startDate of the chart.  #### Absolute Dates  For absolute dates, provide a string in `YYYYMMDD` format.  #### Relative Dates  Relative dates represent a date relative to the most recently-updated period. For example, 0 (zero) represents the most recently-updated period; -1 represents the time period prior to the most recently updated.\\ \\ The \"zero date\" is determined by the default time period or the natural frequency of the data being requested. Zero (0), when used with monthly data, indicates the most recent month-end. Negative one (-1), when used with annual data, indicates one fiscal year prior to the most recently-updated fiscal year.  #### Relative Date Options  **D:** `0D` is the most recent trading day, `-1D` is one trading day prior  **M:** `0M` is the last trading day of the most recent month, `-1M` is the last trading day of the prior month  **AY:** `0AY` is the most recent trading day, `-1AY` is one actual year (365 days) prior  **Y:** `0Y` is the last trading day of the company's most recent fiscal year, `-1Y` is the last trading day of the prior fiscal year\\ \\ For more information and examples, refer to our [date format documentation](https://my.apps.factset.com/oa/pages/1964#date_f). (optional)
    ed = "0" # str | Option for overriding the endDate of the chart. For absolute dates provide a string in `YYYYMMDD` format. We can also specify relative date options as described in the above `sd` option. (optional)
    width = 600 # int | Option for setting the width of the image (optional) if omitted the server will use the default value of 1056
    height = 500 # int | Option for setting the height of the image (optional) if omitted the server will use the default value of 816
    freq = "D" # str | A shorthand string for the overall frequency of the chart like `D` (daily), `W` (weekly), `Y` (yearly) and `Q` (Quarterly). This will default to frequency stored in the document. (optional)
    ccy = "USD" # str | Currency ISO code for the overall currency of the chart. The API doesn't allow per series currency at this point in time. (optional)
    split = "SPLIT" # str | Option to specify the splits adjustment (optional)
    spin = 1 # float | Numeric option to specify the spinOffs adjustment. Possible options include `0` (When we only want spits adjustment), `1` (spinOffs), `4` (spinOffs and cash dividends) and `9` (No adjustments) (optional)
    cal = "local" # str | Option for the calendarType of the chart (optional) if omitted the server will use the default value of "local"
    title = "title_example" # str | Option to customize the title. If you don't customize the title, then it displays by default the security name. (optional)
    font_size = 10 # float | Option to adjust chart's fontSize (optional)
    type = "png" # str | The type of image to be generated by the service (optional) if omitted the server will use the default value of "png"
    grid_lines = False # bool | Option to toggle gridLines on/off on the chart (optional) if omitted the server will use the default value of True
    decimal_precision = 2 # float | Option to add custom decimal precision on the chart (optional)

    try:
        # Get chart image back in PNG or JPEG formats
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.images(chart, ids=ids, sd=sd, ed=ed, width=width, height=height, freq=freq, ccy=ccy, split=split, spin=spin, cal=cal, title=title, font_size=font_size, type=type, grid_lines=grid_lines, decimal_precision=decimal_precision)

        pprint(api_response)

    except fds.sdk.ChartGenerationService.ApiException as e:
        print("Exception when calling ChartTemplatesApi->images: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chart** | **str**| Path to the saved chart. For any of the default charts, the option should be &#x60;categoryName + &#39;/&#39; + chartName&#x60;. For charts under the Client or Personal directories, the option should be &#x60;directoryName + &#39;:/&#39; + pathTotheChart&#x60;.   |
 **ids** | **str**| List of identifiers to be charted in a comma(,) separated string. Only the first one would be considered as primary and rest would be added as comps. Check the catalog for more information on which charts require a ticker. | [optional]
 **sd** | **str**| Option for overriding the startDate of the chart.  #### Absolute Dates  For absolute dates, provide a string in &#x60;YYYYMMDD&#x60; format.  #### Relative Dates  Relative dates represent a date relative to the most recently-updated period. For example, 0 (zero) represents the most recently-updated period; -1 represents the time period prior to the most recently updated.\\ \\ The \&quot;zero date\&quot; is determined by the default time period or the natural frequency of the data being requested. Zero (0), when used with monthly data, indicates the most recent month-end. Negative one (-1), when used with annual data, indicates one fiscal year prior to the most recently-updated fiscal year.  #### Relative Date Options  **D:** &#x60;0D&#x60; is the most recent trading day, &#x60;-1D&#x60; is one trading day prior  **M:** &#x60;0M&#x60; is the last trading day of the most recent month, &#x60;-1M&#x60; is the last trading day of the prior month  **AY:** &#x60;0AY&#x60; is the most recent trading day, &#x60;-1AY&#x60; is one actual year (365 days) prior  **Y:** &#x60;0Y&#x60; is the last trading day of the company&#39;s most recent fiscal year, &#x60;-1Y&#x60; is the last trading day of the prior fiscal year\\ \\ For more information and examples, refer to our [date format documentation](https://my.apps.factset.com/oa/pages/1964#date_f). | [optional]
 **ed** | **str**| Option for overriding the endDate of the chart. For absolute dates provide a string in &#x60;YYYYMMDD&#x60; format. We can also specify relative date options as described in the above &#x60;sd&#x60; option. | [optional]
 **width** | **int**| Option for setting the width of the image | [optional] if omitted the server will use the default value of 1056
 **height** | **int**| Option for setting the height of the image | [optional] if omitted the server will use the default value of 816
 **freq** | **str**| A shorthand string for the overall frequency of the chart like &#x60;D&#x60; (daily), &#x60;W&#x60; (weekly), &#x60;Y&#x60; (yearly) and &#x60;Q&#x60; (Quarterly). This will default to frequency stored in the document. | [optional]
 **ccy** | **str**| Currency ISO code for the overall currency of the chart. The API doesn&#39;t allow per series currency at this point in time. | [optional]
 **split** | **str**| Option to specify the splits adjustment | [optional]
 **spin** | **float**| Numeric option to specify the spinOffs adjustment. Possible options include &#x60;0&#x60; (When we only want spits adjustment), &#x60;1&#x60; (spinOffs), &#x60;4&#x60; (spinOffs and cash dividends) and &#x60;9&#x60; (No adjustments) | [optional]
 **cal** | **str**| Option for the calendarType of the chart | [optional] if omitted the server will use the default value of "local"
 **title** | **str**| Option to customize the title. If you don&#39;t customize the title, then it displays by default the security name. | [optional]
 **font_size** | **float**| Option to adjust chart&#39;s fontSize | [optional]
 **type** | **str**| The type of image to be generated by the service | [optional] if omitted the server will use the default value of "png"
 **grid_lines** | **bool**| Option to toggle gridLines on/off on the chart | [optional] if omitted the server will use the default value of True
 **decimal_precision** | **float**| Option to add custom decimal precision on the chart | [optional]

### Return type

**file_type**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: img/png, img/jpeg, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Input |  -  |
**401** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


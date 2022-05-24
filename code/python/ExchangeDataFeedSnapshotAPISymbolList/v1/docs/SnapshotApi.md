# fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.SnapshotApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_df_snapshot**](SnapshotApi.md#get_df_snapshot) | **GET** /DFSnapshot | Request a snapshot of exchange data for a list of symbols.
[**post_df_snapshot**](SnapshotApi.md#post_df_snapshot) | **POST** /DFSnapshot | Snap exchange data. Use if URL lengh of 2,048 is exceeded.


# **get_df_snapshot**
> DFSnapshotResponse get_df_snapshot()

Request a snapshot of exchange data for a list of symbols.

 `ids` and `oc` are required parameters, but only one can be used based on request. Use `ids` for regular snapshot requests, and `oc` for requesting an option chain.   **Try it Out** feature is available using a pre-recorded sandbox environment. Follow Try it Out inscrutions on each parameter to develop a request and view a sample server response.  '*You must be logged into the Developer Portal and obtain an **[API Key](https://developer.factset.com/factset/api-key-listing)** for ''Try it Out'' to receive a successful server response. Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.*' 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ExchangeDataFeedSnapshotAPISymbolList
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.api import snapshot_api
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.model.error_response import ErrorResponse
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.model.df_snapshot_response import DFSnapshotResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = snapshot_api.SnapshotApi(api_client)

    ids = "ids_example" # str | Requested symbols or securities. **Required** if not using `oc`. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with `chain` parameter to pull in a custom portfolio.<P>**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the `oc` parameter*.</p> (optional)
    oc = "oc_example" # str | Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using `ids`. <p>**Try it Out** - Only available for BABA-USA</p> (optional)
    fields = "fields_example" # str | All available fields. This is a comma-seperated list (no spaces). **Required** only when using `oc`. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.<p>**Try it Out** - All fields available. Use either FID # or name. For `oc`, recommend to use BID_1,ASK_1,STRIKE_PRICE. (optional)
    sf = "sf_example" # str | Symbol Filters, ability to apply filtering to the result of an option chain `oc` request based on available fields and values for the symbols. `sf`=VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   (optional)
    format = "XML" # str | The format of the output file.<p>**Try it Out** - All formats available</p> (optional) (default to "XML")
    serv = "FDS1" # str | The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  (optional)
    req_id = "req_id_example" # str | Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.<p> **Try it Out** - any value can be passed through.</p> (optional)

    try:
        # Request a snapshot of exchange data for a list of symbols.
        api_response = api_instance.get_df_snapshot(ids=ids, oc=oc, fields=fields, sf=sf, format=format, serv=serv, req_id=req_id)
        pprint(api_response)

    except fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.ApiException as e:
        print("Exception when calling SnapshotApi->get_df_snapshot: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **str**| Requested symbols or securities. **Required** if not using &#x60;oc&#x60;. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with &#x60;chain&#x60; parameter to pull in a custom portfolio.&lt;P&gt;**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the &#x60;oc&#x60; parameter*.&lt;/p&gt; | [optional]
 **oc** | **str**| Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using &#x60;ids&#x60;. &lt;p&gt;**Try it Out** - Only available for BABA-USA&lt;/p&gt; | [optional]
 **fields** | **str**| All available fields. This is a comma-seperated list (no spaces). **Required** only when using &#x60;oc&#x60;. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.&lt;p&gt;**Try it Out** - All fields available. Use either FID # or name. For &#x60;oc&#x60;, recommend to use BID_1,ASK_1,STRIKE_PRICE. | [optional]
 **sf** | **str**| Symbol Filters, ability to apply filtering to the result of an option chain &#x60;oc&#x60; request based on available fields and values for the symbols. &#x60;sf&#x60;&#x3D;VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   | [optional]
 **format** | **str**| The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; | [optional] if omitted the server will use the default value of "XML"
 **serv** | **str**| The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  | [optional]
 **req_id** | **str**| Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.&lt;p&gt; **Try it Out** - any value can be passed through.&lt;/p&gt; | [optional]

### Return type

[**DFSnapshotResponse**](DFSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, text/csv


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**402** | Invalid HTTP method. Either the method is not POST or GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. |  -  |
**403** | Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_df_snapshot**
> DFSnapshotResponse post_df_snapshot()

Snap exchange data. Use if URL lengh of 2,048 is exceeded.

Request Snapshot exchange data. Use POST when your URL length exceeds 2,048 characters.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ExchangeDataFeedSnapshotAPISymbolList
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.api import snapshot_api
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.model.error_response import ErrorResponse
from fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.model.df_snapshot_response import DFSnapshotResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = snapshot_api.SnapshotApi(api_client)

    ids = "ids_example" # str | Requested symbols or securities. **Required** if not using `oc`. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with `chain` parameter to pull in a custom portfolio.<P>**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the `oc` parameter*.</p> (optional)
    oc = "oc_example" # str | Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using `ids`. <p>**Try it Out** - Only available for BABA-USA</p> (optional)
    fields = "fields_example" # str | All available fields. This is a comma-seperated list (no spaces). **Required** only when using `oc`. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.<p>**Try it Out** - All fields available. Use either FID # or name. For `oc`, recommend to use BID_1,ASK_1,STRIKE_PRICE. (optional)
    sf = "sf_example" # str | Symbol Filters, ability to apply filtering to the result of an option chain `oc` request based on available fields and values for the symbols. `sf`=VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   (optional)
    format = "XML" # str | The format of the output file.<p>**Try it Out** - All formats available</p> (optional) (default to "XML")
    serv = "FDS1" # str | The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  (optional)
    req_id = "req_id_example" # str | Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.<p> **Try it Out** - any value can be passed through.</p> (optional)

    try:
        # Snap exchange data. Use if URL lengh of 2,048 is exceeded.
        api_response = api_instance.post_df_snapshot(ids=ids, oc=oc, fields=fields, sf=sf, format=format, serv=serv, req_id=req_id)
        pprint(api_response)

    except fds.sdk.ExchangeDataFeedSnapshotAPISymbolList.ApiException as e:
        print("Exception when calling SnapshotApi->post_df_snapshot: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **str**| Requested symbols or securities. **Required** if not using &#x60;oc&#x60;. This is a comma-seperated list with a maximum of 500. Each symbol can be a FactSet Exchange Symbol, CUSIP, or SEDOL. This can be used in combination with &#x60;chain&#x60; parameter to pull in a custom portfolio.&lt;P&gt;**Try it out** - Choose one or multiple - IBM-USA, BABA-USA, WALMEX-MX, 7203-TKS, VOD-LON, NPN-JSE, MABAX, NZF, SPY-USA, AGG-USA, GLD-USA, AOR-USA, MNA-USA, UUP-USA, SP50-SPX, ESX-STX, XAO-ASX, WD-MSX, NG00-USA, GC00-USA, CC00-USA, C00-USA, FC00-USA, ER00-USA, EURUSD-FX1, USDMXN-FX1, AUDJPY-FX1, EURCZK-FX1, USDILS-FX1, USDZAR-FX1, US10YY-TU1, FDS#190621C00145000-USA, FDS#190621P00145000-USA. *Leave blank if you are trying the &#x60;oc&#x60; parameter*.&lt;/p&gt; | [optional]
 **oc** | **str**| Option Chain, accepts one underlying symbol for which the option chain will be returned. **Required** if not using &#x60;ids&#x60;. &lt;p&gt;**Try it Out** - Only available for BABA-USA&lt;/p&gt; | [optional]
 **fields** | **str**| All available fields. This is a comma-seperated list (no spaces). **Required** only when using &#x60;oc&#x60;. Otherwise, leave blank to return all fields by default. See definitions for details on available field names and Field ID #s. The Data Service Manual has complete reference.&lt;p&gt;**Try it Out** - All fields available. Use either FID # or name. For &#x60;oc&#x60;, recommend to use BID_1,ASK_1,STRIKE_PRICE. | [optional]
 **sf** | **str**| Symbol Filters, ability to apply filtering to the result of an option chain &#x60;oc&#x60; request based on available fields and values for the symbols. &#x60;sf&#x60;&#x3D;VALUE_[filter],[field],[value]   * **VALUE_MINMAX** -  Field value will be within specified interval. ex. - VALUE_MINMAX,BID_1,min,max   * **VALUE_EQUALS** - Field value will equal specified value. ex. - VALUE_EQUALS,BID_1,value   * **VALUE_NOT_EQUALS** - Field value will not equal specified value. ex. - VALUE_NOT_EQUALS,BID_1,value      **Try it Out** - depends on fields used. Example - VALUE_MINMAX,STRIKE_PRICE,120,130   | [optional]
 **format** | **str**| The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; | [optional] if omitted the server will use the default value of "XML"
 **serv** | **str**| The Data Service that handles the request for the specified symbols. Available live services are -    * **FDS1** -Production Data Service   * **FDS_FUND** -Fundamental Data Service used for End-of-Day data.  **Try it Out** - use FDS1  | [optional]
 **req_id** | **str**| Request Identification String. Can be used by the application to keep track of requests.  The id is not used by this service, however, it is included in the XML response.&lt;p&gt; **Try it Out** - any value can be passed through.&lt;/p&gt; | [optional]

### Return type

[**DFSnapshotResponse**](DFSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, text/csv


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**402** | Invalid HTTP method. Either the method is not POST or GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. |  -  |
**403** | Invalid HTTP URL. Necessary query parameters are missing in the request. The description field will indicate the exact reason. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


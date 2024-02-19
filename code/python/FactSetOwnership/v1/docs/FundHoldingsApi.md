# fds.sdk.FactSetOwnership.FundHoldingsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ownership_holdings**](FundHoldingsApi.md#get_ownership_holdings) | **GET** /factset-ownership/v1/fund-holdings | Get underlying holdings information for a requested fund identifer.
[**post_ownership_holdings**](FundHoldingsApi.md#post_ownership_holdings) | **POST** /factset-ownership/v1/fund-holdings | Get holdings for a list of funds.



# **get_ownership_holdings**
> FundHoldingsResponse get_ownership_holdings(ids)

Get underlying holdings information for a requested fund identifer.

Gets holdings information for list of fund identifiers. The service allows you to filter by the TopN holdings and Asset Type. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnership
from fds.sdk.FactSetOwnership.api import fund_holdings_api
from fds.sdk.FactSetOwnership.models import *
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
configuration = fds.sdk.FactSetOwnership.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOwnership.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOwnership.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fund_holdings_api.FundHoldingsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ids = ["VTI-USA"] # [str] | List of requested fund identifiers. <p>***ids limit** =  10 per request*</p>
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    date = "2019-12-31" # str | Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    topn = "5" # str | Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. (optional) if omitted the server will use the default value of "ALL"
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    asset_type = "EQ" # str | Filter holdings by the following major asset classes -   * **EQ**  = Equity   * **FI** = Fixed Income   * **ALL** = ALL  (optional) if omitted the server will use the default value of "EQ"
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    currency = "USD" # str | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional)

    try:
        # Get underlying holdings information for a requested fund identifer.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ownership_holdings(ids, date=date, topn=topn, asset_type=asset_type, currency=currency)

        pprint(api_response)

    except fds.sdk.FactSetOwnership.ApiException as e:
        print("Exception when calling FundHoldingsApi->get_ownership_holdings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| List of requested fund identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p&gt; |
 **date** | **str**| Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. | [optional]
 **topn** | **str**| Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. | [optional] if omitted the server will use the default value of "ALL"
 **asset_type** | **str**| Filter holdings by the following major asset classes -   * **EQ**  &#x3D; Equity   * **FI** &#x3D; Fixed Income   * **ALL** &#x3D; ALL  | [optional] if omitted the server will use the default value of "EQ"
 **currency** | **str**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional]

### Return type

[**FundHoldingsResponse**](FundHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fund Holdings Response. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_ownership_holdings**
> FundHoldingsResponse post_ownership_holdings(fund_holdings_request)

Get holdings for a list of funds.

Gets Holding information for a long list of Fund objects.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnership
from fds.sdk.FactSetOwnership.api import fund_holdings_api
from fds.sdk.FactSetOwnership.models import *
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
configuration = fds.sdk.FactSetOwnership.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOwnership.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOwnership.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fund_holdings_api.FundHoldingsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    fund_holdings_request = FundHoldingsRequest(
        ids=IdFundHoldings(["FDIVX-US"]),
        date="2019-09-30",
        topn="5",
        asset_type=AssetType("EQ"),
        currency="USD",
    ) # FundHoldingsRequest | Requesting Underlying Holdings for a list of Fund Identifiers.

    try:
        # Get holdings for a list of funds.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_ownership_holdings(fund_holdings_request)

        pprint(api_response)

    except fds.sdk.FactSetOwnership.ApiException as e:
        print("Exception when calling FundHoldingsApi->post_ownership_holdings: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fund_holdings_request** | [**FundHoldingsRequest**](FundHoldingsRequest.md)| Requesting Underlying Holdings for a list of Fund Identifiers. |

### Return type

[**FundHoldingsResponse**](FundHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fund Holdings Response. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# GroupHoldingsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGroupHoldings**](GroupHoldingsApi.md#getGroupHoldings) | **GET** /factset-funds/v1/holdings/group | Get group holdings for a specific date and group.
[**getGroupHoldingsForList**](GroupHoldingsApi.md#getGroupHoldingsForList) | **POST** /factset-funds/v1/holdings/group | Get group holdings for a specific date and group.



## getGroupHoldings

> GroupHoldingsResponse getGroupHoldings(ids, asOfDate, group)

Get group holdings for a specific date and group.

Retrieves the holding percentages for the group and funds specified. Available groups are:
  * **ASSET** = Asset Class
  * **ASSETISTYP** = Issue Type with Asset Class
  * **CAPGRP** = Cap Group
  * **CNTRY** = Country
  * **EXCHANGE** = Exchange
  * **INDUSTRY** = Industry
  * **ISSUE_TYPE** = Issue Type
  * **REGION** = Region
  * **SECTOR** = Sector
  * **ULTPARENT** = Ultimate Parent


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.GroupHoldingsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        GroupHoldingsApi apiInstance = new GroupHoldingsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        String asOfDate = "2024-02-20"; // String | As of date for historical group holdings in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
        String group = "ASSET"; // String | Controls the group of the data returned.   * **ASSET** = Asset Class   * **ASSETISTYP** = Issue Type with Asset Class   * **CAPGRP** = Cap Group   * **CNTRY** = Country   * **EXCHANGE** = Exchange   * **INDUSTRY** = Industry   * **ISSUE_TYPE** = Issue Type   * **REGION** = Region   * **SECTOR** = Sector   * **ULTPARENT** = Ultimate Parent       
        try {
            GroupHoldingsResponse result = apiInstance.getGroupHoldings(ids, asOfDate, group);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling GroupHoldingsApi#getGroupHoldings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **List&lt;String&gt;**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **asOfDate** | **String**| As of date for historical group holdings in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **group** | **String**| Controls the group of the data returned.   * **ASSET** &#x3D; Asset Class   * **ASSETISTYP** &#x3D; Issue Type with Asset Class   * **CAPGRP** &#x3D; Cap Group   * **CNTRY** &#x3D; Country   * **EXCHANGE** &#x3D; Exchange   * **INDUSTRY** &#x3D; Industry   * **ISSUE_TYPE** &#x3D; Issue Type   * **REGION** &#x3D; Region   * **SECTOR** &#x3D; Sector   * **ULTPARENT** &#x3D; Ultimate Parent        | [optional] [default to CNTRY] [enum: ASSET, ASSETISTYP, CAPGRP, CNTRY, EXCHANGE, INDUSTRY, ISSUE_TYPE, REGION, SECTOR, ULTPARENT]

### Return type

[**GroupHoldingsResponse**](GroupHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Group Holdings response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getGroupHoldingsForList

> GroupHoldingsResponse getGroupHoldingsForList(groupHoldingsRequest)

Get group holdings for a specific date and group.

Retrieves the holding percentages for the group and funds specified. Available groups are:
  * **ASSET** = Asset Class
  * **ASSETISTYP** = Issue Type with Asset Class
  * **CAPGRP** = Cap Group
  * **CNTRY** = Country
  * **EXCHANGE** = Exchange
  * **INDUSTRY** = Industry
  * **ISSUE_TYPE** = Issue Type
  * **REGION** = Region
  * **SECTOR** = Sector
  * **ULTPARENT** = Ultimate Parent


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetFunds.ApiClient;
import com.factset.sdk.FactSetFunds.ApiException;
import com.factset.sdk.FactSetFunds.Configuration;
import com.factset.sdk.FactSetFunds.auth.*;
import com.factset.sdk.FactSetFunds.models.*;
import com.factset.sdk.FactSetFunds.api.GroupHoldingsApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        GroupHoldingsApi apiInstance = new GroupHoldingsApi(defaultClient);
        GroupHoldingsRequest groupHoldingsRequest = new GroupHoldingsRequest(); // GroupHoldingsRequest | The Group Holdings request body, allowing the user to specify a list of ids, date, and group.
        try {
            GroupHoldingsResponse result = apiInstance.getGroupHoldingsForList(groupHoldingsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling GroupHoldingsApi#getGroupHoldingsForList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupHoldingsRequest** | [**GroupHoldingsRequest**](GroupHoldingsRequest.md)| The Group Holdings request body, allowing the user to specify a list of ids, date, and group. |

### Return type

[**GroupHoldingsResponse**](GroupHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Group Holdings response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


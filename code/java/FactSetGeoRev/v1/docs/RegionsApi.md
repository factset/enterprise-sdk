# RegionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRegions**](RegionsApi.md#getRegions) | **GET** /factset-georev/v1/regions | Gets the revenue details for the requested Regions
[**getRegionsForList**](RegionsApi.md#getRegionsForList) | **POST** /factset-georev/v1/regions | Gets the revenue details for the requested Regions. Use for large lists of company ids.



## getRegions

> RegionResponse getRegions(ids, regionIds, startDate, endDate, frequency, currency)

Gets the revenue details for the requested Regions

Gets the Geographic Revenue, Percents, Confidence, and Ranks for a requested list of ids and Regions, for a given start-date and end-date. Regions represent a taxonomy of Super Regions, Regions, and Areas, with Super Regions being the largest collection. *Country specific revenue can be requested in the /countries endpoint.*


### Example

```java
// Import classes:
import com.factset.sdk.FactSetGeoRev.ApiClient;
import com.factset.sdk.FactSetGeoRev.ApiException;
import com.factset.sdk.FactSetGeoRev.Configuration;
import com.factset.sdk.FactSetGeoRev.auth.*;
import com.factset.sdk.FactSetGeoRev.model.*;
import com.factset.sdk.FactSetGeoRev.api.RegionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RegionsApi apiInstance = new RegionsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  300 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        java.util.List<String> regionIds = Arrays.asList(); // java.util.List<String> | The Regional Identifier or Regional Group. Groups include \"SUPER_REGIONS\", \"REGIONS\", and \"AREAS\". When requesting a group, all regionIds within that group will be requested. To limit or specify select regions returned in the response, provide a comma-separated list of the below regionIds. |Regional Group|regionId|Descriptions| |---|---|---| |Group|SUPER_REGIONS|Fetchs all regionIds for Super Regions| |Group|REGIONS|Fetchs all regionIds for Regions| |Group|AREAS|Fetchs all regionIds for Areas|  |Level|regionId|Parent|Description|Level|regionId|Parent|Description| |---|---|---|---|---|---|---|---| |__**Super Region**__||||__**Area**__|||| |Super Region|R1|R100|Africa and Middle East|Area|R3|R2|Eastern Africa| |Super Region|R101|R100|Americas|Area|R18|R2|Southern Africa| |Super Region|R170|R100|Asia/Pacific|Area|R45|R2|Western Africa| |Super Region|R274|R100|Europe|Area|R69|R68|Central Middle East| |Super Region|R349|R100|Non-Disclosed Revenue|Area|R87|R68|Eastern Middle East| |Super Region|R354|R100|No Operations|Area|R97|R68|Western Middle East| |Super Region|R393|R100|Non-Geographic Revenue|Area|R103|R102|Caribbean| |__**Region**__||||Area|R135|R102|Central America| |Region|R2|R1|Africa|Area|R145|R102|South America| |Region|R68|R1|Middle East|Area|R165|R164|Other North America| |Region|R102|R101|Latin America|Area|R167|R164|United States and Canada| |Region|R164|R101|North America|Area|R172|R171|Far East| |Region|R171|R170|Asia|Area|R219|R171|Indian Region| |Region|R233|R170|Oceania|Area|R234|R233|Australia and New Zealand| |Region|R275|R274|European Union|Area|R237|R233|Pacific Islands| |Region|R314|R274|Non-European Union|Area|R276|R275|Eastern European Union| |Region|R350|R349|Region Unspecified|Area|R286|R275|Northern European Union| |Region|R355|R354|Non-Operating Region|Area|R292|R275|Southern European Union| |Region|R394|R393|Non-Geographic Revenue Region|Area|R298|R275|Western European Union| |Region|R398|R1|Africa and Middle East Unallocated Region|Area|R315|R314|Eastern Non-European Union| |Region|R401|R170|Asia/Pacific Unallocated Region|Area|R323|R314|Northern Non-European Union| |Region|R404|R101|Americas Unallocated Revenue Region|Area|R328|R314|Southern Non-European Union| |Region|R407|R274|Europe Unallocated Region|Area|R340|R314|Western Non-European Union| |||||Area|R351|R350|Area Unspecified| |||||Area|R356|R355|Non-Operating Area| |||||Area|R395|R394|Non-Geographic Revenue Area| |||||Area|R399|R398|Africa and Middle East Unallocated Area| 
        String startDate = "2018-12-31"; // String | The start date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated Daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint. 
        String endDate = "2019-12-31"; // String | The end date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint. 
        String frequency = "D"; // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.    
        String currency = "USD"; // String | Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
        try {
            RegionResponse result = apiInstance.getRegions(ids, regionIds, startDate, endDate, frequency, currency);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegionsApi#getRegions");
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
 **ids** | **List&lt;String&gt;**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  300 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **regionIds** | **List&lt;String&gt;**| The Regional Identifier or Regional Group. Groups include \&quot;SUPER_REGIONS\&quot;, \&quot;REGIONS\&quot;, and \&quot;AREAS\&quot;. When requesting a group, all regionIds within that group will be requested. To limit or specify select regions returned in the response, provide a comma-separated list of the below regionIds. |Regional Group|regionId|Descriptions| |---|---|---| |Group|SUPER_REGIONS|Fetchs all regionIds for Super Regions| |Group|REGIONS|Fetchs all regionIds for Regions| |Group|AREAS|Fetchs all regionIds for Areas|  |Level|regionId|Parent|Description|Level|regionId|Parent|Description| |---|---|---|---|---|---|---|---| |__**Super Region**__||||__**Area**__|||| |Super Region|R1|R100|Africa and Middle East|Area|R3|R2|Eastern Africa| |Super Region|R101|R100|Americas|Area|R18|R2|Southern Africa| |Super Region|R170|R100|Asia/Pacific|Area|R45|R2|Western Africa| |Super Region|R274|R100|Europe|Area|R69|R68|Central Middle East| |Super Region|R349|R100|Non-Disclosed Revenue|Area|R87|R68|Eastern Middle East| |Super Region|R354|R100|No Operations|Area|R97|R68|Western Middle East| |Super Region|R393|R100|Non-Geographic Revenue|Area|R103|R102|Caribbean| |__**Region**__||||Area|R135|R102|Central America| |Region|R2|R1|Africa|Area|R145|R102|South America| |Region|R68|R1|Middle East|Area|R165|R164|Other North America| |Region|R102|R101|Latin America|Area|R167|R164|United States and Canada| |Region|R164|R101|North America|Area|R172|R171|Far East| |Region|R171|R170|Asia|Area|R219|R171|Indian Region| |Region|R233|R170|Oceania|Area|R234|R233|Australia and New Zealand| |Region|R275|R274|European Union|Area|R237|R233|Pacific Islands| |Region|R314|R274|Non-European Union|Area|R276|R275|Eastern European Union| |Region|R350|R349|Region Unspecified|Area|R286|R275|Northern European Union| |Region|R355|R354|Non-Operating Region|Area|R292|R275|Southern European Union| |Region|R394|R393|Non-Geographic Revenue Region|Area|R298|R275|Western European Union| |Region|R398|R1|Africa and Middle East Unallocated Region|Area|R315|R314|Eastern Non-European Union| |Region|R401|R170|Asia/Pacific Unallocated Region|Area|R323|R314|Northern Non-European Union| |Region|R404|R101|Americas Unallocated Revenue Region|Area|R328|R314|Southern Non-European Union| |Region|R407|R274|Europe Unallocated Region|Area|R340|R314|Western Non-European Union| |||||Area|R351|R350|Area Unspecified| |||||Area|R356|R355|Non-Operating Area| |||||Area|R395|R394|Non-Geographic Revenue Area| |||||Area|R399|R398|Africa and Middle East Unallocated Area|  | [optional]
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated Daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint.  | [optional]
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity and updated daily. If left blank, the API will default to latest available fiscal period. Future dates (T+1) are not accepted in this endpoint.  | [optional]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.     | [optional] [default to FY] [enum: D, W, M, AM, CQ, FQ, AY, CY, FY, ]
 **currency** | **String**| Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional]

### Return type

[**RegionResponse**](RegionResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Region response object, including the Revenue, Percent, Certainty Ranks, Certainty Class, and other meta data. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getRegionsForList

> RegionResponse getRegionsForList(regionRequest)

Gets the revenue details for the requested Regions. Use for large lists of company ids.

Gets the Geographic Revenue, Percents, Confidence, and Ranks for a requested list of ids and Regions, for a given start-date and end-date. Regions represent a taxonomy of Super Regions, Regions, and Areas, with Super Regions being the largest collection. *Country specific revenue can be requested in the /countries endpoint.*


### Example

```java
// Import classes:
import com.factset.sdk.FactSetGeoRev.ApiClient;
import com.factset.sdk.FactSetGeoRev.ApiException;
import com.factset.sdk.FactSetGeoRev.Configuration;
import com.factset.sdk.FactSetGeoRev.auth.*;
import com.factset.sdk.FactSetGeoRev.model.*;
import com.factset.sdk.FactSetGeoRev.api.RegionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.factset.com/content");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        RegionsApi apiInstance = new RegionsApi(defaultClient);
        RegionRequest regionRequest = new RegionRequest(); // RegionRequest | The Region request body, allowing the user to specify a list of ids, time range, and regionIds.
        try {
            RegionResponse result = apiInstance.getRegionsForList(regionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegionsApi#getRegionsForList");
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
 **regionRequest** | [**RegionRequest**](RegionRequest.md)| The Region request body, allowing the user to specify a list of ids, time range, and regionIds. |

### Return type

[**RegionResponse**](RegionResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Region response object, including the Revenue, Percent, Certainty Ranks, Certainty Class, and other meta data. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


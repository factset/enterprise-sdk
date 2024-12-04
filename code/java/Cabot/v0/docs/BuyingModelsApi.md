# BuyingModelsApi

All URIs are relative to *https://api.factset.com/analytics/cabot/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBuyContextModelAnalytic**](BuyingModelsApi.md#getBuyContextModelAnalytic) | **GET** /models/buy-context | Cabot main path for Buy Context API
[**getBuyTimingModelAnalytic**](BuyingModelsApi.md#getBuyTimingModelAnalytic) | **GET** /models/buy-timing | Cabot main path for Buy Timing API



## getBuyContextModelAnalytic

> BuyContextResponseRoot getBuyContextModelAnalytic(accountPath, benchmarkPath, period, attribute, sector, region)

Cabot main path for Buy Context API

Cabot main path for Buy Context API

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Cabot.ApiClient;
import com.factset.sdk.Cabot.ApiException;
import com.factset.sdk.Cabot.Configuration;
import com.factset.sdk.Cabot.auth.*;
import com.factset.sdk.Cabot.models.*;
import com.factset.sdk.Cabot.api.BuyingModelsApi;

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

        BuyingModelsApi apiInstance = new BuyingModelsApi(defaultClient);
        String accountPath = "accountPath_example"; // String | The account path of the portfolio you want to retrieve the data for.
        String benchmarkPath = "BENCH:SP50"; // String | The path of the benchmark you want to retrieve the data for.<br /><br />
        String period = "period_example"; // String | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
        Attributes attribute = Attributes.fromValue("QFL_EY"); // Attributes | The attribute represents the different factors.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />If provided, the API response will contain both \"LOW\" and \"HIGH\" values for it.<br /><br />
        Sectors sector = Sectors.fromValue("energy"); // Sectors | Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
        Regions region = Regions.fromValue("africa"); // Regions | Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
        try {
            BuyContextResponseRoot result = apiInstance.getBuyContextModelAnalytic(accountPath, benchmarkPath, period, attribute, sector, region);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BuyingModelsApi#getBuyContextModelAnalytic");
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
 **accountPath** | **String**| The account path of the portfolio you want to retrieve the data for. |
 **benchmarkPath** | **String**| The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; |
 **period** | **String**| For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; |
 **attribute** | **Attributes**| The attribute represents the different factors.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt;If provided, the API response will contain both \&quot;LOW\&quot; and \&quot;HIGH\&quot; values for it.&lt;br /&gt;&lt;br /&gt; | [enum: QFL_EY, QFL_PEG, QFL_OCFY, QFL_BP, QFL_SP, QFL_OCF_EARNINGS_VAR, QFL_DY, QFL_NET_MGN, QFL_OPER_MGN, QFL_ROE, QFL_CFROE, QFL_EPS_GR_5Y, QFL_OCF_GR_5Y, QFL_SALES_GR_5Y, QFL_DPS_GR_5Y, QFL_EPS_GR_1Y, QFL_OCF_GR_1Y, QFL_SALES_GR_1Y, QFL_LT_DEBT_EQUITY, QFL_DEBT_ASSETS, QFL_EBITDAEV, QFL_REVEV, QFL_ROIC, QFL_CFROIC]
 **sector** | **Sectors**| Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] [enum: energy, materials, industrials, consumerDiscretionary, consumerStaples, healthCare, financials, informationTechnology, communicationServices, utilities, realEstate, equityDiversified, equityHealthCare, equitySelfStorage, equityIndustrial, equityOffice, equityResidential, equityRetail, equityLodgingAndResorts, equitySpecialty, equityTimberReits, equityInfrastructureReits, equityDataCenters, mortageHomeFinancing, mortageCommercialFinancing]
 **region** | **Regions**| Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] [enum: africa, centralAsia, easternEurope, middleEast, northAmerica, pacificRim, southAmerica, westernEurope]

### Return type

[**BuyContextResponseRoot**](BuyContextResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **400** | Bad request, invalid query parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **408** | Request timeout. Retry the request in sometime. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **500** | Server error. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |


## getBuyTimingModelAnalytic

> BuyTimingResponseRoot getBuyTimingModelAnalytic(accountPath, benchmarkPath, period, attribute, sector, region, holdings)

Cabot main path for Buy Timing API

Cabot main path for Buy Timing API. 

Buy timing examines the timeliness of entry points and measures how quickly new buys contribute to results. This is done by delaying the buys by the specified number of days to see if buying into the position early would have benefited the portfolio.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Cabot.ApiClient;
import com.factset.sdk.Cabot.ApiException;
import com.factset.sdk.Cabot.Configuration;
import com.factset.sdk.Cabot.auth.*;
import com.factset.sdk.Cabot.models.*;
import com.factset.sdk.Cabot.api.BuyingModelsApi;

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

        BuyingModelsApi apiInstance = new BuyingModelsApi(defaultClient);
        String accountPath = "accountPath_example"; // String | The account path of the portfolio you want to retrieve the data for.<br /><br />
        String benchmarkPath = "benchmarkPath_example"; // String | The path of the benchmark you want to retrieve the data for.<br /><br />
        String period = "2015-2017"; // String | For which period you want to retrieve the data.<br />There are four options available as follows:<br /><br />1 -> YYYY (Repeating One Year)<br /><br />2 -> YYYY-YYYY (Repeating Three/Five/Ten Year)<br /><br />3 -> 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))<br /><br />4 -> INCEPTION_TO_DATE<br /><br />You can only get the data for one period per request.<br /><br />
        Attributes attribute = Attributes.fromValue("QFL_EY"); // Attributes | The attribute represents the different factors.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />If provided, the API response will contain both \"LOW\" and \"HIGH\" values for it.<br /><br />
        Sectors sector = Sectors.fromValue("energy"); // Sectors | Sector represents the sector based on the company's industry breakdown.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
        Regions region = Regions.fromValue("africa"); // Regions | Region of domicile represents the region based on the company's primary listing.<br />You can choose which of them (if any) you want to see analytics for.<br /><br />
        BuyTimingHoldings holdings = BuyTimingHoldings.fromValue("all"); // BuyTimingHoldings | If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).<br /><br />
        try {
            BuyTimingResponseRoot result = apiInstance.getBuyTimingModelAnalytic(accountPath, benchmarkPath, period, attribute, sector, region, holdings);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BuyingModelsApi#getBuyTimingModelAnalytic");
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
 **accountPath** | **String**| The account path of the portfolio you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; |
 **benchmarkPath** | **String**| The path of the benchmark you want to retrieve the data for.&lt;br /&gt;&lt;br /&gt; |
 **period** | **String**| For which period you want to retrieve the data.&lt;br /&gt;There are four options available as follows:&lt;br /&gt;&lt;br /&gt;1 -&gt; YYYY (Repeating One Year)&lt;br /&gt;&lt;br /&gt;2 -&gt; YYYY-YYYY (Repeating Three/Five/Ten Year)&lt;br /&gt;&lt;br /&gt;3 -&gt; 1M_TRAILING, 3M_TRAILING, 1Y_TRAILING, 3Y_TRAILING, 5Y_TRAILING (Trailing Periods (If available for your portfolio))&lt;br /&gt;&lt;br /&gt;4 -&gt; INCEPTION_TO_DATE&lt;br /&gt;&lt;br /&gt;You can only get the data for one period per request.&lt;br /&gt;&lt;br /&gt; |
 **attribute** | **Attributes**| The attribute represents the different factors.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt;If provided, the API response will contain both \&quot;LOW\&quot; and \&quot;HIGH\&quot; values for it.&lt;br /&gt;&lt;br /&gt; | [optional] [enum: QFL_EY, QFL_PEG, QFL_OCFY, QFL_BP, QFL_SP, QFL_OCF_EARNINGS_VAR, QFL_DY, QFL_NET_MGN, QFL_OPER_MGN, QFL_ROE, QFL_CFROE, QFL_EPS_GR_5Y, QFL_OCF_GR_5Y, QFL_SALES_GR_5Y, QFL_DPS_GR_5Y, QFL_EPS_GR_1Y, QFL_OCF_GR_1Y, QFL_SALES_GR_1Y, QFL_LT_DEBT_EQUITY, QFL_DEBT_ASSETS, QFL_EBITDAEV, QFL_REVEV, QFL_ROIC, QFL_CFROIC]
 **sector** | **Sectors**| Sector represents the sector based on the company&#39;s industry breakdown.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] [enum: energy, materials, industrials, consumerDiscretionary, consumerStaples, healthCare, financials, informationTechnology, communicationServices, utilities, realEstate, equityDiversified, equityHealthCare, equitySelfStorage, equityIndustrial, equityOffice, equityResidential, equityRetail, equityLodgingAndResorts, equitySpecialty, equityTimberReits, equityInfrastructureReits, equityDataCenters, mortageHomeFinancing, mortageCommercialFinancing]
 **region** | **Regions**| Region of domicile represents the region based on the company&#39;s primary listing.&lt;br /&gt;You can choose which of them (if any) you want to see analytics for.&lt;br /&gt;&lt;br /&gt; | [optional] [enum: africa, centralAsia, easternEurope, middleEast, northAmerica, pacificRim, southAmerica, westernEurope]
 **holdings** | **BuyTimingHoldings**| If set, the API will add holding-level details for all or only the selected analytic (if available for your portfolio).&lt;br /&gt;&lt;br /&gt; | [optional] [enum: all, 3 days, 5 days, 10 days, 20 days, a month]

### Return type

[**BuyTimingResponseRoot**](BuyTimingResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **400** | Bad request, invalid query parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **403** | User is forbidden with current credentials. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **408** | Request timeout. Retry the request in sometime. |  -  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **500** | Server error. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |


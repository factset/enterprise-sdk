# ChartTemplatesApi

All URIs are relative to *https://api.factset.com/charting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoryList**](ChartTemplatesApi.md#getCategoryList) | **GET** /catalog/categories | Get a list of chart categories
[**getChartList**](ChartTemplatesApi.md#getChartList) | **GET** /catalog/charts | Get a list of chart templates that can be used for getting the image from the service.
[**images**](ChartTemplatesApi.md#images) | **GET** /image | Get chart image back in PNG or JPEG formats



## getCategoryList

> java.util.List<String> getCategoryList()

Get a list of chart categories

Retrieve a list of all chart categories with getCategoryList() API call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ChartGenerationService.ApiClient;
import com.factset.sdk.ChartGenerationService.ApiException;
import com.factset.sdk.ChartGenerationService.Configuration;
import com.factset.sdk.ChartGenerationService.auth.*;
import com.factset.sdk.ChartGenerationService.models.*;
import com.factset.sdk.ChartGenerationService.api.ChartTemplatesApi;

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

        ChartTemplatesApi apiInstance = new ChartTemplatesApi(defaultClient);
        try {
            java.util.List<String> result = apiInstance.getCategoryList();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ChartTemplatesApi#getCategoryList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**java.util.List&lt;String&gt;**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Input |  -  |


## getChartList

> java.util.List<CategoryChartListErrorObject> getChartList(categories)

Get a list of chart templates that can be used for getting the image from the service.

You can get all the charts present or can just get the information by categories. The response includes the name of the chart, description, tags and any additional input specific to that chart. Use the information from this response to determine what charts you want and get its image from /images endpoint. Additionally you can also get back a auto generated PDF for the categories you requested for.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ChartGenerationService.ApiClient;
import com.factset.sdk.ChartGenerationService.ApiException;
import com.factset.sdk.ChartGenerationService.Configuration;
import com.factset.sdk.ChartGenerationService.auth.*;
import com.factset.sdk.ChartGenerationService.models.*;
import com.factset.sdk.ChartGenerationService.api.ChartTemplatesApi;

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

        ChartTemplatesApi apiInstance = new ChartTemplatesApi(defaultClient);
        String categories = "categories_example"; // String | A comma delimited string of catgory names to limit the response to certain categories. If nothing is provided, all charts under every category would be listed out.
        try {
            java.util.List<CategoryChartListErrorObject> result = apiInstance.getChartList(categories);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ChartTemplatesApi#getChartList");
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
 **categories** | **String**| A comma delimited string of catgory names to limit the response to certain categories. If nothing is provided, all charts under every category would be listed out. | [optional]

### Return type

[**java.util.List&lt;CategoryChartListErrorObject&gt;**](CategoryChartListErrorObject.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Input |  -  |


## images

> File images(chart, ids, sd, ed, width, height, freq, ccy, split, spin, cal, title, fontSize, type, gridLines, decimalPrecision)

Get chart image back in PNG or JPEG formats

Get a chart image in PNG or JPEG formats with the images() API call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.ChartGenerationService.ApiClient;
import com.factset.sdk.ChartGenerationService.ApiException;
import com.factset.sdk.ChartGenerationService.Configuration;
import com.factset.sdk.ChartGenerationService.auth.*;
import com.factset.sdk.ChartGenerationService.models.*;
import com.factset.sdk.ChartGenerationService.api.ChartTemplatesApi;

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

        ChartTemplatesApi apiInstance = new ChartTemplatesApi(defaultClient);
        String chart = "Equity/RSI"; // String | Path to the saved chart. For any of the default charts, the option should be `categoryName + '/' + chartName`. For charts under the Client or Personal directories, the option should be `directoryName + ':/' + pathTotheChart`.  
        String ids = "FDS,AAPL"; // String | List of identifiers to be charted in a comma(,) separated string. Only the first one would be considered as primary and rest would be added as comps. Check the catalog for more information on which charts require a ticker.
        String sd = "-1Y"; // String | Option for overriding the startDate of the chart.  #### Absolute Dates  For absolute dates, provide a string in `YYYYMMDD` format.  #### Relative Dates  Relative dates represent a date relative to the most recently-updated period. For example, 0 (zero) represents the most recently-updated period; -1 represents the time period prior to the most recently updated.\\ \\ The \"zero date\" is determined by the default time period or the natural frequency of the data being requested. Zero (0), when used with monthly data, indicates the most recent month-end. Negative one (-1), when used with annual data, indicates one fiscal year prior to the most recently-updated fiscal year.  #### Relative Date Options  **D:** `0D` is the most recent trading day, `-1D` is one trading day prior  **M:** `0M` is the last trading day of the most recent month, `-1M` is the last trading day of the prior month  **AY:** `0AY` is the most recent trading day, `-1AY` is one actual year (365 days) prior  **Y:** `0Y` is the last trading day of the company's most recent fiscal year, `-1Y` is the last trading day of the prior fiscal year\\ \\ For more information and examples, refer to our [date format documentation](https://my.apps.factset.com/oa/pages/1964#date_f).
        String ed = "0"; // String | Option for overriding the endDate of the chart. For absolute dates provide a string in `YYYYMMDD` format. We can also specify relative date options as described in the above `sd` option.
        Long width = 1056L; // Long | Option for setting the width of the image
        Long height = 816L; // Long | Option for setting the height of the image
        String freq = "D"; // String | A shorthand string for the overall frequency of the chart like `D` (daily), `W` (weekly), `Y` (yearly) and `Q` (Quarterly). This will default to frequency stored in the document.
        String ccy = "USD"; // String | Currency ISO code for the overall currency of the chart. The API doesn't allow per series currency at this point in time.
        String split = "SPLIT"; // String | Option to specify the splits adjustment
        BigDecimal spin = new BigDecimal("0"); // BigDecimal | Numeric option to specify the spinOffs adjustment. Possible options include `0` (When we only want spits adjustment), `1` (spinOffs), `4` (spinOffs and cash dividends) and `9` (No adjustments)
        String cal = "local"; // String | Option for the calendarType of the chart
        String title = "title_example"; // String | Option to customize the title. If you don't customize the title, then it displays by default the security name.
        BigDecimal fontSize = new BigDecimal("10"); // BigDecimal | Option to adjust chart's fontSize
        String type = "png"; // String | The type of image to be generated by the service
        Boolean gridLines = true; // Boolean | Option to toggle gridLines on/off on the chart
        BigDecimal decimalPrecision = new BigDecimal("2"); // BigDecimal | Option to add custom decimal precision on the chart
        try {
            File result = apiInstance.images(chart, ids, sd, ed, width, height, freq, ccy, split, spin, cal, title, fontSize, type, gridLines, decimalPrecision);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ChartTemplatesApi#images");
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
 **chart** | **String**| Path to the saved chart. For any of the default charts, the option should be &#x60;categoryName + &#39;/&#39; + chartName&#x60;. For charts under the Client or Personal directories, the option should be &#x60;directoryName + &#39;:/&#39; + pathTotheChart&#x60;.   |
 **ids** | **String**| List of identifiers to be charted in a comma(,) separated string. Only the first one would be considered as primary and rest would be added as comps. Check the catalog for more information on which charts require a ticker. | [optional]
 **sd** | **String**| Option for overriding the startDate of the chart.  #### Absolute Dates  For absolute dates, provide a string in &#x60;YYYYMMDD&#x60; format.  #### Relative Dates  Relative dates represent a date relative to the most recently-updated period. For example, 0 (zero) represents the most recently-updated period; -1 represents the time period prior to the most recently updated.\\ \\ The \&quot;zero date\&quot; is determined by the default time period or the natural frequency of the data being requested. Zero (0), when used with monthly data, indicates the most recent month-end. Negative one (-1), when used with annual data, indicates one fiscal year prior to the most recently-updated fiscal year.  #### Relative Date Options  **D:** &#x60;0D&#x60; is the most recent trading day, &#x60;-1D&#x60; is one trading day prior  **M:** &#x60;0M&#x60; is the last trading day of the most recent month, &#x60;-1M&#x60; is the last trading day of the prior month  **AY:** &#x60;0AY&#x60; is the most recent trading day, &#x60;-1AY&#x60; is one actual year (365 days) prior  **Y:** &#x60;0Y&#x60; is the last trading day of the company&#39;s most recent fiscal year, &#x60;-1Y&#x60; is the last trading day of the prior fiscal year\\ \\ For more information and examples, refer to our [date format documentation](https://my.apps.factset.com/oa/pages/1964#date_f). | [optional]
 **ed** | **String**| Option for overriding the endDate of the chart. For absolute dates provide a string in &#x60;YYYYMMDD&#x60; format. We can also specify relative date options as described in the above &#x60;sd&#x60; option. | [optional]
 **width** | **Long**| Option for setting the width of the image | [optional] [default to 1056]
 **height** | **Long**| Option for setting the height of the image | [optional] [default to 816]
 **freq** | **String**| A shorthand string for the overall frequency of the chart like &#x60;D&#x60; (daily), &#x60;W&#x60; (weekly), &#x60;Y&#x60; (yearly) and &#x60;Q&#x60; (Quarterly). This will default to frequency stored in the document. | [optional]
 **ccy** | **String**| Currency ISO code for the overall currency of the chart. The API doesn&#39;t allow per series currency at this point in time. | [optional]
 **split** | **String**| Option to specify the splits adjustment | [optional] [enum: SPLIT, UNSPLIT]
 **spin** | **BigDecimal**| Numeric option to specify the spinOffs adjustment. Possible options include &#x60;0&#x60; (When we only want spits adjustment), &#x60;1&#x60; (spinOffs), &#x60;4&#x60; (spinOffs and cash dividends) and &#x60;9&#x60; (No adjustments) | [optional] [enum: 0, 1, 4, 9]
 **cal** | **String**| Option for the calendarType of the chart | [optional] [default to local] [enum: local, fiveDay, sevenDay]
 **title** | **String**| Option to customize the title. If you don&#39;t customize the title, then it displays by default the security name. | [optional]
 **fontSize** | **BigDecimal**| Option to adjust chart&#39;s fontSize | [optional]
 **type** | **String**| The type of image to be generated by the service | [optional] [default to png] [enum: png, jpg]
 **gridLines** | **Boolean**| Option to toggle gridLines on/off on the chart | [optional] [default to true]
 **decimalPrecision** | **BigDecimal**| Option to add custom decimal precision on the chart | [optional]

### Return type

[**File**](File.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: img/png, img/jpeg, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Input |  -  |
| **401** | Unauthorized |  -  |


# ExPostApi

All URIs are relative to *https://api.factset.com/analytics/engines/proposal-generation/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateExPostCorrelationsStats**](ExPostApi.md#calculateExPostCorrelationsStats) | **POST** /portfolios/ex-post/stats/correlations | calculate portfolio vs benchmark correlation and correlation between portfolio holdings
[**calculateExPostFactorExposureStats**](ExPostApi.md#calculateExPostFactorExposureStats) | **POST** /portfolios/ex-post/stats/factor-exposure | Create portfolio and return risk factor contribution
[**calculateExPostRollingSeries**](ExPostApi.md#calculateExPostRollingSeries) | **POST** /portfolios/ex-post/series/rolling | retrieve series of rolling stats for the portfolio
[**calculateExPostRollingStats**](ExPostApi.md#calculateExPostRollingStats) | **POST** /portfolios/ex-post/stats/rolling | calculate rolling stats (for ex-post data)
[**calculateExPostSeries**](ExPostApi.md#calculateExPostSeries) | **POST** /portfolios/ex-post/series | retrieve portfolio and benchmark data series, generated from the underlying holdings data series
[**calculateExPostStats**](ExPostApi.md#calculateExPostStats) | **POST** /portfolios/ex-post/stats | calculate ex-post stats (on portfolio or holdings level)



## calculateExPostCorrelationsStats

> ExPostStatsCorrelationsResponse calculateExPostCorrelationsStats(exPostStatsCorrelations)

calculate portfolio vs benchmark correlation and correlation between portfolio holdings

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProposalGenerationEngine.ApiClient;
import com.factset.sdk.ProposalGenerationEngine.ApiException;
import com.factset.sdk.ProposalGenerationEngine.Configuration;
import com.factset.sdk.ProposalGenerationEngine.auth.*;
import com.factset.sdk.ProposalGenerationEngine.models.*;
import com.factset.sdk.ProposalGenerationEngine.api.ExPostApi;

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

        ExPostApi apiInstance = new ExPostApi(defaultClient);
        ExPostStatsCorrelations exPostStatsCorrelations = new ExPostStatsCorrelations(); // ExPostStatsCorrelations | 
        try {
            ExPostStatsCorrelationsResponse result = apiInstance.calculateExPostCorrelationsStats(exPostStatsCorrelations);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ExPostApi#calculateExPostCorrelationsStats");
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
 **exPostStatsCorrelations** | [**ExPostStatsCorrelations**](ExPostStatsCorrelations.md)|  | [optional]

### Return type

[**ExPostStatsCorrelationsResponse**](ExPostStatsCorrelationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status 200 |  -  |
| **501** | Server is unable to process your request |  -  |


## calculateExPostFactorExposureStats

> ExPostStatsFactorExposureResponse calculateExPostFactorExposureStats(exPostStatsFactorExposure)

Create portfolio and return risk factor contribution

Ex-Post factor-exposure Stats

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProposalGenerationEngine.ApiClient;
import com.factset.sdk.ProposalGenerationEngine.ApiException;
import com.factset.sdk.ProposalGenerationEngine.Configuration;
import com.factset.sdk.ProposalGenerationEngine.auth.*;
import com.factset.sdk.ProposalGenerationEngine.models.*;
import com.factset.sdk.ProposalGenerationEngine.api.ExPostApi;

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

        ExPostApi apiInstance = new ExPostApi(defaultClient);
        ExPostStatsFactorExposure exPostStatsFactorExposure = new ExPostStatsFactorExposure(); // ExPostStatsFactorExposure | 
        try {
            ExPostStatsFactorExposureResponse result = apiInstance.calculateExPostFactorExposureStats(exPostStatsFactorExposure);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ExPostApi#calculateExPostFactorExposureStats");
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
 **exPostStatsFactorExposure** | [**ExPostStatsFactorExposure**](ExPostStatsFactorExposure.md)|  | [optional]

### Return type

[**ExPostStatsFactorExposureResponse**](ExPostStatsFactorExposureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status 200 |  -  |
| **501** | Server is unable to process your request |  -  |


## calculateExPostRollingSeries

> ExPostSeriesRollingResponse calculateExPostRollingSeries(exPostSeriesRolling)

retrieve series of rolling stats for the portfolio

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProposalGenerationEngine.ApiClient;
import com.factset.sdk.ProposalGenerationEngine.ApiException;
import com.factset.sdk.ProposalGenerationEngine.Configuration;
import com.factset.sdk.ProposalGenerationEngine.auth.*;
import com.factset.sdk.ProposalGenerationEngine.models.*;
import com.factset.sdk.ProposalGenerationEngine.api.ExPostApi;

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

        ExPostApi apiInstance = new ExPostApi(defaultClient);
        ExPostSeriesRolling exPostSeriesRolling = new ExPostSeriesRolling(); // ExPostSeriesRolling | 
        try {
            ExPostSeriesRollingResponse result = apiInstance.calculateExPostRollingSeries(exPostSeriesRolling);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ExPostApi#calculateExPostRollingSeries");
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
 **exPostSeriesRolling** | [**ExPostSeriesRolling**](ExPostSeriesRolling.md)|  | [optional]

### Return type

[**ExPostSeriesRollingResponse**](ExPostSeriesRollingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status 200 |  -  |
| **501** | Server is unable to process your request |  -  |


## calculateExPostRollingStats

> ExPostStatsRollingResponse calculateExPostRollingStats(exPostStatsRolling)

calculate rolling stats (for ex-post data)

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProposalGenerationEngine.ApiClient;
import com.factset.sdk.ProposalGenerationEngine.ApiException;
import com.factset.sdk.ProposalGenerationEngine.Configuration;
import com.factset.sdk.ProposalGenerationEngine.auth.*;
import com.factset.sdk.ProposalGenerationEngine.models.*;
import com.factset.sdk.ProposalGenerationEngine.api.ExPostApi;

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

        ExPostApi apiInstance = new ExPostApi(defaultClient);
        ExPostStatsRolling exPostStatsRolling = new ExPostStatsRolling(); // ExPostStatsRolling | 
        try {
            ExPostStatsRollingResponse result = apiInstance.calculateExPostRollingStats(exPostStatsRolling);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ExPostApi#calculateExPostRollingStats");
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
 **exPostStatsRolling** | [**ExPostStatsRolling**](ExPostStatsRolling.md)|  | [optional]

### Return type

[**ExPostStatsRollingResponse**](ExPostStatsRollingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status 200 |  -  |
| **501** | Server is unable to process your request |  -  |


## calculateExPostSeries

> ExPostSeriesResponse calculateExPostSeries(exPostSeries)

retrieve portfolio and benchmark data series, generated from the underlying holdings data series

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProposalGenerationEngine.ApiClient;
import com.factset.sdk.ProposalGenerationEngine.ApiException;
import com.factset.sdk.ProposalGenerationEngine.Configuration;
import com.factset.sdk.ProposalGenerationEngine.auth.*;
import com.factset.sdk.ProposalGenerationEngine.models.*;
import com.factset.sdk.ProposalGenerationEngine.api.ExPostApi;

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

        ExPostApi apiInstance = new ExPostApi(defaultClient);
        ExPostSeries exPostSeries = new ExPostSeries(); // ExPostSeries | 
        try {
            ExPostSeriesResponse result = apiInstance.calculateExPostSeries(exPostSeries);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ExPostApi#calculateExPostSeries");
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
 **exPostSeries** | [**ExPostSeries**](ExPostSeries.md)|  | [optional]

### Return type

[**ExPostSeriesResponse**](ExPostSeriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful request |  -  |
| **400** | Bad request |  -  |


## calculateExPostStats

> ExPostStatsResponse calculateExPostStats(exPostStats)

calculate ex-post stats (on portfolio or holdings level)

Notes:<br> * id 'Cash proxy' can be used in order to set cash amount for the portfolio

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProposalGenerationEngine.ApiClient;
import com.factset.sdk.ProposalGenerationEngine.ApiException;
import com.factset.sdk.ProposalGenerationEngine.Configuration;
import com.factset.sdk.ProposalGenerationEngine.auth.*;
import com.factset.sdk.ProposalGenerationEngine.models.*;
import com.factset.sdk.ProposalGenerationEngine.api.ExPostApi;

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

        ExPostApi apiInstance = new ExPostApi(defaultClient);
        ExPostStats exPostStats = new ExPostStats(); // ExPostStats | 
        try {
            ExPostStatsResponse result = apiInstance.calculateExPostStats(exPostStats);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ExPostApi#calculateExPostStats");
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
 **exPostStats** | [**ExPostStats**](ExPostStats.md)|  | [optional]

### Return type

[**ExPostStatsResponse**](ExPostStatsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status 200 |  -  |
| **400** | Bad request |  -  |


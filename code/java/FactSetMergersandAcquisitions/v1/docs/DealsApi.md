# DealsApi

All URIs are relative to *https://api.factset.com/content/factset-mergers-acquisitions/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDealsByCompanyList**](DealsApi.md#getDealsByCompanyList) | **POST** /deals/by-company | Returns details for a list of companies.
[**getDealsDetailsList**](DealsApi.md#getDealsDetailsList) | **POST** /deals/details | Returns details for specified deals.
[**getPublicTargetDealsList**](DealsApi.md#getPublicTargetDealsList) | **POST** /deals/public-targets | Returns a list of deals in which the target is a public company.



## getDealsByCompanyList

> DealsResponse getDealsByCompanyList(dealsRequest)

Returns details for a list of companies.

Gets deals for a specified list of companies within a date range. Deals returned are any in which the requested company is involved as either the buyer, seller, or target. The start and end date parameters will find deals based on their announcement date. The response of this endpoint includes `dealId` which can be sent to the `/deals/details` endpoint for more information about the deal.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetMergersandAcquisitions.ApiClient;
import com.factset.sdk.FactSetMergersandAcquisitions.ApiException;
import com.factset.sdk.FactSetMergersandAcquisitions.Configuration;
import com.factset.sdk.FactSetMergersandAcquisitions.auth.*;
import com.factset.sdk.FactSetMergersandAcquisitions.models.*;
import com.factset.sdk.FactSetMergersandAcquisitions.api.DealsApi;

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

        DealsApi apiInstance = new DealsApi(defaultClient);
        DealsRequest dealsRequest = new DealsRequest(); // DealsRequest | Request object for `Deals`.
        try {
            DealsResponse result = apiInstance.getDealsByCompanyList(dealsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DealsApi#getDealsByCompanyList");
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
 **dealsRequest** | [**DealsRequest**](DealsRequest.md)| Request object for &#x60;Deals&#x60;. |

### Return type

[**DealsResponse**](DealsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of deals |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getDealsDetailsList

> DetailsResponse getDealsDetailsList(detailsRequest)

Returns details for specified deals.

Gets deal details for a specified list of FactSet deal identifiers. Monetary values returned by this API are converted and represented in USD.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetMergersandAcquisitions.ApiClient;
import com.factset.sdk.FactSetMergersandAcquisitions.ApiException;
import com.factset.sdk.FactSetMergersandAcquisitions.Configuration;
import com.factset.sdk.FactSetMergersandAcquisitions.auth.*;
import com.factset.sdk.FactSetMergersandAcquisitions.models.*;
import com.factset.sdk.FactSetMergersandAcquisitions.api.DealsApi;

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

        DealsApi apiInstance = new DealsApi(defaultClient);
        DetailsRequest detailsRequest = new DetailsRequest(); // DetailsRequest | Request object for `Deal Details`.
        try {
            DetailsResponse result = apiInstance.getDealsDetailsList(detailsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DealsApi#getDealsDetailsList");
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
 **detailsRequest** | [**DetailsRequest**](DetailsRequest.md)| Request object for &#x60;Deal Details&#x60;. |

### Return type

[**DetailsResponse**](DetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of deal details |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getPublicTargetDealsList

> DealsPublicResponse getPublicTargetDealsList(dealsPublicRequest)

Returns a list of deals in which the target is a public company.

Gets deals in which the target is a public company for a specified date range and status. The start and end date parameters will find deals based on their announcement date. The response of this endpoint includes `dealId` which can be sent to the `/deals/details` endpoint for more information about the deal.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetMergersandAcquisitions.ApiClient;
import com.factset.sdk.FactSetMergersandAcquisitions.ApiException;
import com.factset.sdk.FactSetMergersandAcquisitions.Configuration;
import com.factset.sdk.FactSetMergersandAcquisitions.auth.*;
import com.factset.sdk.FactSetMergersandAcquisitions.models.*;
import com.factset.sdk.FactSetMergersandAcquisitions.api.DealsApi;

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

        DealsApi apiInstance = new DealsApi(defaultClient);
        DealsPublicRequest dealsPublicRequest = new DealsPublicRequest(); // DealsPublicRequest | Request object for `Deals`.
        try {
            DealsPublicResponse result = apiInstance.getPublicTargetDealsList(dealsPublicRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DealsApi#getPublicTargetDealsList");
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
 **dealsPublicRequest** | [**DealsPublicRequest**](DealsPublicRequest.md)| Request object for &#x60;Deals&#x60;. |

### Return type

[**DealsPublicResponse**](DealsPublicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of deals |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


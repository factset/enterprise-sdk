# OptionChainsScreeningApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptionsChainsForList**](OptionChainsScreeningApi.md#getOptionsChainsForList) | **POST** /factset-options/v1/chains | Returns all the underlying option identifiers for the specified underlying Security identifier
[**getOptionsScreeningForList**](OptionChainsScreeningApi.md#getOptionsScreeningForList) | **POST** /factset-options/v1/option-screening | Returns all the option identifiers based on the conditions provided as input in the request



## getOptionsChainsForList

> ChainsResponse getOptionsChainsForList(chainsRequest)

Returns all the underlying option identifiers for the specified underlying Security identifier

Returns all the underlying option identifiers for the underlying security identifier. Specify the date and or exhcange for the list of options associated to the id. 

  *Currently only OPRA Exchange is supported with exchange ISO "USA"*


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetOptions.ApiClient;
import com.factset.sdk.FactSetOptions.ApiException;
import com.factset.sdk.FactSetOptions.Configuration;
import com.factset.sdk.FactSetOptions.auth.*;
import com.factset.sdk.FactSetOptions.models.*;
import com.factset.sdk.FactSetOptions.api.OptionChainsScreeningApi;

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

        OptionChainsScreeningApi apiInstance = new OptionChainsScreeningApi(defaultClient);
        ChainsRequest chainsRequest = new ChainsRequest(); // ChainsRequest | Options Chains Request Object
        try {
            ChainsResponse result = apiInstance.getOptionsChainsForList(chainsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OptionChainsScreeningApi#getOptionsChainsForList");
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
 **chainsRequest** | [**ChainsRequest**](ChainsRequest.md)| Options Chains Request Object |

### Return type

[**ChainsResponse**](ChainsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Options Chain Response Object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getOptionsScreeningForList

> OptionScreeningResponse getOptionsScreeningForList(optionScreeningRequest)

Returns all the option identifiers based on the conditions provided as input in the request

Returns all the option identifiers based on the conditions provided as input in the request. Conditions are as follows and will follow "AND" logic if more than one condition is applied and allows up to **three conditions** using AND Logic.If a condition is used the accompanying value MUST be used - 
|conditions|description|
|---|---|
|P_OPT_UNDERLYING_SECURITY_E|Underlying Security Equal To|
|P_OPT_STRIKE_PRICE_E|Strike Price Equal To|
|P_OPT_EXP_DATEN_E|Expiration Date (YYYYMMDD) Equal To|
|P_OPT_VOLUME_G|Volume Greater Than|
|P_OPT_VOLUME_GE|Volume Greater Than or Equal To|
|P_OPT_VOLUME_L|Volume Less Than|
|P_OPT_VOLUME_LE|Volume Less Than or Equal To|
|P_OPT_VOLUME_E|Volume Equal To|
|P_OPT_OPTION_TYPE_E|Option Type (1= Equity, 2=Index)|
|P_OPT_CALL_OR_PUT_E|Call or Put (0=Call, 1=Put)|

  *Currently only OPRA Exchange is supported with exchange ISO "USA"*


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetOptions.ApiClient;
import com.factset.sdk.FactSetOptions.ApiException;
import com.factset.sdk.FactSetOptions.Configuration;
import com.factset.sdk.FactSetOptions.auth.*;
import com.factset.sdk.FactSetOptions.models.*;
import com.factset.sdk.FactSetOptions.api.OptionChainsScreeningApi;

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

        OptionChainsScreeningApi apiInstance = new OptionChainsScreeningApi(defaultClient);
        OptionScreeningRequest optionScreeningRequest = new OptionScreeningRequest(); // OptionScreeningRequest | Option Screening Request. Example request asks for Put Options where Underlying Security is AAPL and Volume is greater than 0 as of 2021-03-31.  
        try {
            OptionScreeningResponse result = apiInstance.getOptionsScreeningForList(optionScreeningRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OptionChainsScreeningApi#getOptionsScreeningForList");
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
 **optionScreeningRequest** | [**OptionScreeningRequest**](OptionScreeningRequest.md)| Option Screening Request. Example request asks for Put Options where Underlying Security is AAPL and Volume is greater than 0 as of 2021-03-31.   |

### Return type

[**OptionScreeningResponse**](OptionScreeningResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Screening Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


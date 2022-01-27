# CompanyApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanyCompensation**](CompanyApi.md#getCompanyCompensation) | **GET** /factset-people/v1/company-compensation | Returns the compensation details of the people for the specified company identifier
[**getCompanyCompensationForList**](CompanyApi.md#getCompanyCompensationForList) | **POST** /factset-people/v1/company-compensation | Returns the compensation details for the people for the specified company identifier
[**getCompanyPeople**](CompanyApi.md#getCompanyPeople) | **GET** /factset-people/v1/company-people | Returns the list of people for the specified company identifiers
[**getCompanyPeopleForList**](CompanyApi.md#getCompanyPeopleForList) | **POST** /factset-people/v1/company-people | Returns the list of people associated for a large list of company identitifers
[**getCompanyPositions**](CompanyApi.md#getCompanyPositions) | **GET** /factset-people/v1/company-positions | Returns the list of people for the specified company identifiers and position
[**getCompanyPositionsForList**](CompanyApi.md#getCompanyPositionsForList) | **POST** /factset-people/v1/company-positions | Returns the list of people associated for a large list of company identitifers and position
[**getCompanyStats**](CompanyApi.md#getCompanyStats) | **GET** /factset-people/v1/company-stats | Returns statistics about top leadership of a company.
[**getCompanyStatsForList**](CompanyApi.md#getCompanyStatsForList) | **POST** /factset-people/v1/company-stats | Returns statistics about top leadership of a company.



## getCompanyCompensation

> CompanyCompensationResponse getCompanyCompensation(ids)

Returns the compensation details of the people for the specified company identifier

Returns the list of company-level executive compensation data items for the top executives listed in annual filings.The coverage of the compensation details for the executives are limited to US region. All the compensation figures are expressed in raw units. 


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPeople.ApiClient;
import com.factset.sdk.FactSetPeople.ApiException;
import com.factset.sdk.FactSetPeople.Configuration;
import com.factset.sdk.FactSetPeople.auth.*;
import com.factset.sdk.FactSetPeople.model.*;
import com.factset.sdk.FactSetPeople.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        try {
            CompanyCompensationResponse result = apiInstance.getCompanyCompensation(ids);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyCompensation");
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
 **ids** | **List&lt;String&gt;**| The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |

### Return type

[**CompanyCompensationResponse**](CompanyCompensationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company Compensation objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getCompanyCompensationForList

> CompanyCompensationResponse getCompanyCompensationForList(companyCompensationRequest)

Returns the compensation details for the people for the specified company identifier

Returns the list of company-level executive compensation data items for the top executives listed in annual filings for the most recent fiscal year. The coverage of the compensation details for the executives are limited to US region. All the compensation figures are expressed in raw units. 


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPeople.ApiClient;
import com.factset.sdk.FactSetPeople.ApiException;
import com.factset.sdk.FactSetPeople.Configuration;
import com.factset.sdk.FactSetPeople.auth.*;
import com.factset.sdk.FactSetPeople.model.*;
import com.factset.sdk.FactSetPeople.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        CompanyCompensationRequest companyCompensationRequest = new CompanyCompensationRequest(); // CompanyCompensationRequest | 
        try {
            CompanyCompensationResponse result = apiInstance.getCompanyCompensationForList(companyCompensationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyCompensationForList");
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
 **companyCompensationRequest** | [**CompanyCompensationRequest**](CompanyCompensationRequest.md)|  |

### Return type

[**CompanyCompensationResponse**](CompanyCompensationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company Positions objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getCompanyPeople

> CompanyPeopleResponse getCompanyPeople(ids, function)

Returns the list of people for the specified company identifiers

Returns the list of executives associated the company identifier requested. Information includes the job functions, email, phone, title, name, and FactSet Entity Identifier. The personId returned can then be used in the `/profiles` endpoint to learn more about the given person.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPeople.ApiClient;
import com.factset.sdk.FactSetPeople.ApiException;
import com.factset.sdk.FactSetPeople.Configuration;
import com.factset.sdk.FactSetPeople.auth.*;
import com.factset.sdk.FactSetPeople.model.*;
import com.factset.sdk.FactSetPeople.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        String function = "PEOPLE"; // String | Controls the types of people returned based on high-level job functions. Filter by -    |function|description|   |---|---|   |PEOPLE|Retrieve **ALL** Executives of a requested company|   |OFFICER|Retrieve only the Officers of a requested company|   |DIRECTOR|Retrieve only the Directors of a requested company| 
        try {
            CompanyPeopleResponse result = apiInstance.getCompanyPeople(ids, function);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyPeople");
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
 **ids** | **List&lt;String&gt;**| The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **function** | **String**| Controls the types of people returned based on high-level job functions. Filter by -    |function|description|   |---|---|   |PEOPLE|Retrieve **ALL** Executives of a requested company|   |OFFICER|Retrieve only the Officers of a requested company|   |DIRECTOR|Retrieve only the Directors of a requested company|  | [optional] [default to PEOPLE] [enum: PEOPLE, OFFICER, DIRECTOR]

### Return type

[**CompanyPeopleResponse**](CompanyPeopleResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company People objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getCompanyPeopleForList

> CompanyPeopleResponse getCompanyPeopleForList(companyPeopleRequest)

Returns the list of people associated for a large list of company identitifers

Returns the list of executives associated the company identifier requested. Information includes the job functions, email, phone, title, name, and FactSet Entity Identifier. The personId returned can then be used in the /profiles endpoint to learn more about the given person.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPeople.ApiClient;
import com.factset.sdk.FactSetPeople.ApiException;
import com.factset.sdk.FactSetPeople.Configuration;
import com.factset.sdk.FactSetPeople.auth.*;
import com.factset.sdk.FactSetPeople.model.*;
import com.factset.sdk.FactSetPeople.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        CompanyPeopleRequest companyPeopleRequest = new CompanyPeopleRequest(); // CompanyPeopleRequest | 
        try {
            CompanyPeopleResponse result = apiInstance.getCompanyPeopleForList(companyPeopleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyPeopleForList");
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
 **companyPeopleRequest** | [**CompanyPeopleRequest**](CompanyPeopleRequest.md)|  |

### Return type

[**CompanyPeopleResponse**](CompanyPeopleResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company People objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getCompanyPositions

> CompanyPositionsResponse getCompanyPositions(ids, position)

Returns the list of people for the specified company identifiers and position

Returns the list of people, name, and title for a list of company ids and requested position. Positions include-
  * Chairman
  * Chief Executive Officer
  * President
  * Chief Operating Officer
  * Chief Financial Officer
  * Chief Technology Officer
  * Chief Investment Officer
  * Founder(s)
  * Compliance Officer
  * Admin
  * Independent Director
  * Directors/Board Members
  * Investor Relations
  * Legal Counsel
  * Treasurer
  * Sales and Marketing Managers
  * Human Resources


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPeople.ApiClient;
import com.factset.sdk.FactSetPeople.ApiException;
import com.factset.sdk.FactSetPeople.Configuration;
import com.factset.sdk.FactSetPeople.auth.*;
import com.factset.sdk.FactSetPeople.model.*;
import com.factset.sdk.FactSetPeople.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        String position = "CHAIR"; // String | Controls the position details returned for the requested company. By default, the service returns the CEO name, title, and ID for the requested company ids.   |position|description|   |---|---|   |CHAIR|Chairman|   |CEO|Chief Executive Officer|   |PRES|President|   |COO|Chief Operating Officer|   |CFO|Chief Financial Officer|   |CTO|Chief Technology Officer|   |CIO|Chief Investment Officer|   |FOU|Founder(s)|   |CMP|Compliance Officer|   |ADM|Admin|   |IND|Independent Director|   |BRD|Directors/Board Members|   |IR|Investor Relations|   |LEG|Legal Counsel|   |TREAS|Treasurer|   |MKT|Sales and Marketing Managers|   |HR|Human Resources| 
        try {
            CompanyPositionsResponse result = apiInstance.getCompanyPositions(ids, position);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyPositions");
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
 **ids** | **List&lt;String&gt;**| The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **position** | **String**| Controls the position details returned for the requested company. By default, the service returns the CEO name, title, and ID for the requested company ids.   |position|description|   |---|---|   |CHAIR|Chairman|   |CEO|Chief Executive Officer|   |PRES|President|   |COO|Chief Operating Officer|   |CFO|Chief Financial Officer|   |CTO|Chief Technology Officer|   |CIO|Chief Investment Officer|   |FOU|Founder(s)|   |CMP|Compliance Officer|   |ADM|Admin|   |IND|Independent Director|   |BRD|Directors/Board Members|   |IR|Investor Relations|   |LEG|Legal Counsel|   |TREAS|Treasurer|   |MKT|Sales and Marketing Managers|   |HR|Human Resources|  | [optional] [default to CEO] [enum: CHAIR, CEO, PRES, COO, CFO, CTO, CIO, FOU, CMP, ADM, IND, BRD, IR, LEG, TREAS, MKT, HR]

### Return type

[**CompanyPositionsResponse**](CompanyPositionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company Positions objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getCompanyPositionsForList

> CompanyPositionsResponse getCompanyPositionsForList(companyPositionsRequest)

Returns the list of people associated for a large list of company identitifers and position

Returns the list of people, name, and title for a list of company ids and requested position. Positions include-
  * Chairman
  * Chief Executive Officer
  * President
  * Chief Operating Officer
  * Chief Financial Officer
  * Chief Technology Officer
  * Chief Investment Officer
  * Founder(s)
  * Compliance Officer
  * Admin
  * Independent Director
  * Directors/Board Members
  * Investor Relations
  * Legal Counsel
  * Treasurer
  * Sales and Marketing Managers
  * Human Resources


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPeople.ApiClient;
import com.factset.sdk.FactSetPeople.ApiException;
import com.factset.sdk.FactSetPeople.Configuration;
import com.factset.sdk.FactSetPeople.auth.*;
import com.factset.sdk.FactSetPeople.model.*;
import com.factset.sdk.FactSetPeople.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        CompanyPositionsRequest companyPositionsRequest = new CompanyPositionsRequest(); // CompanyPositionsRequest | 
        try {
            CompanyPositionsResponse result = apiInstance.getCompanyPositionsForList(companyPositionsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyPositionsForList");
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
 **companyPositionsRequest** | [**CompanyPositionsRequest**](CompanyPositionsRequest.md)|  |

### Return type

[**CompanyPositionsResponse**](CompanyPositionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company Positions objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getCompanyStats

> CompanyStatsResponse getCompanyStats(ids, mbType)

Returns statistics about top leadership of a company.

Returns the statistics such as the average age, tenure, compensation of leadership, number of executives, and the gender diversity of leadership. We can utilize the data for analyzing a company's board and management.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPeople.ApiClient;
import com.factset.sdk.FactSetPeople.ApiException;
import com.factset.sdk.FactSetPeople.Configuration;
import com.factset.sdk.FactSetPeople.auth.*;
import com.factset.sdk.FactSetPeople.model.*;
import com.factset.sdk.FactSetPeople.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        String mbType = "MB"; // String | Search based on the management and board types. The types include -  |type|description| |---|---| |MB|Management & Board| |MGMT|Management| |BRD|Board| 
        try {
            CompanyStatsResponse result = apiInstance.getCompanyStats(ids, mbType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyStats");
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
 **ids** | **List&lt;String&gt;**| The requested company identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **mbType** | **String**| Search based on the management and board types. The types include -  |type|description| |---|---| |MB|Management &amp; Board| |MGMT|Management| |BRD|Board|  | [optional] [default to MB] [enum: MB, MGMT, BRD]

### Return type

[**CompanyStatsResponse**](CompanyStatsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company Stats objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getCompanyStatsForList

> CompanyStatsResponse getCompanyStatsForList(companyStatsRequest)

Returns statistics about top leadership of a company.

Returns the statistics such as the average age, tenure, compensation of leadership, number of executives, and the gender diversity of leadership. We can utilize the data for analyzing a company's board and management. 


### Example

```java
// Import classes:
import com.factset.sdk.FactSetPeople.ApiClient;
import com.factset.sdk.FactSetPeople.ApiException;
import com.factset.sdk.FactSetPeople.Configuration;
import com.factset.sdk.FactSetPeople.auth.*;
import com.factset.sdk.FactSetPeople.model.*;
import com.factset.sdk.FactSetPeople.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        CompanyStatsRequest companyStatsRequest = new CompanyStatsRequest(); // CompanyStatsRequest | 
        try {
            CompanyStatsResponse result = apiInstance.getCompanyStatsForList(companyStatsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyStatsForList");
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
 **companyStatsRequest** | [**CompanyStatsRequest**](CompanyStatsRequest.md)|  |

### Return type

[**CompanyStatsResponse**](CompanyStatsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Company Positions objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


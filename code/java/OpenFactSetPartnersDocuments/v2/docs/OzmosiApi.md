# OzmosiApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOzmosiBiomarkersDaily**](OzmosiApi.md#getOzmosiBiomarkersDaily) | **GET** /ozmosi/biomarkers/daily | Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.
[**getOzmosiClinicalTrialsDaily**](OzmosiApi.md#getOzmosiClinicalTrialsDaily) | **GET** /ozmosi/clinical-trials/daily | Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.
[**getOzmosiClinicalTrialsHistory**](OzmosiApi.md#getOzmosiClinicalTrialsHistory) | **GET** /ozmosi/clinical-trials/history | Returns the history files from Open:FactSet Partner - Ozmosi
[**getOzmosiCollaboratorsDaily**](OzmosiApi.md#getOzmosiCollaboratorsDaily) | **GET** /ozmosi/collaborators/daily | Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.
[**getOzmosiDiseasesDaily**](OzmosiApi.md#getOzmosiDiseasesDaily) | **GET** /ozmosi/diseases/daily | Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.
[**getOzmosiEndpointsDaily**](OzmosiApi.md#getOzmosiEndpointsDaily) | **GET** /ozmosi/beam-endpoints/daily | Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.
[**getOzmosiInterventionDaily**](OzmosiApi.md#getOzmosiInterventionDaily) | **GET** /ozmosi/intervention/daily | Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.
[**getOzmosiOrangepurpleDaily**](OzmosiApi.md#getOzmosiOrangepurpleDaily) | **GET** /ozmosi/orangepurple/daily | Returns the daily files of OrangePurple Details from Open:FactSet Partner - Ozmosi.
[**getOzmosiPrimaryoutcomeDaily**](OzmosiApi.md#getOzmosiPrimaryoutcomeDaily) | **GET** /ozmosi/primaryoutcome/daily | Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.
[**getOzmosiSponsorsDaily**](OzmosiApi.md#getOzmosiSponsorsDaily) | **GET** /ozmosi/sponsors/daily | Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.



## getOzmosiBiomarkersDaily

> BiomarkersResponse getOzmosiBiomarkersDaily(paginationLimit, paginationOffset, clinicalTrialId, biomarkerName, biomarkerFullName)

Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.

### Example

```java
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.OzmosiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        OzmosiApi apiInstance = new OzmosiApi(defaultClient);
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        String clinicalTrialId = "NCT03037385_037"; // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
        String biomarkerName = "EGFR"; // String | This parameter specifies the abbreviated name of any patient biomarkers being targeted for research in the trial.
        String biomarkerFullName = "epidermal growth factor receptor"; // String | Specifies the full name of the biomarker.
        try {
            BiomarkersResponse result = apiInstance.getOzmosiBiomarkersDaily(paginationLimit, paginationOffset, clinicalTrialId, biomarkerName, biomarkerFullName);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OzmosiApi#getOzmosiBiomarkersDaily");
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
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **String**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **biomarkerName** | **String**| This parameter specifies the abbreviated name of any patient biomarkers being targeted for research in the trial. | [optional]
 **biomarkerFullName** | **String**| Specifies the full name of the biomarker. | [optional]

### Return type

[**BiomarkersResponse**](BiomarkersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Biomarkers Details. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getOzmosiClinicalTrialsDaily

> DataResponse getOzmosiClinicalTrialsDaily(sort, paginationLimit, paginationOffset, clinicalTrialId, officalTitle, trialId, date)

Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.OzmosiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        OzmosiApi apiInstance = new OzmosiApi(defaultClient);
        String sort = "startDate"; // String | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used.
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result Default value 20 and Maximum value 300
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        String clinicalTrialId = "NCT03037385_037"; // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
        String officalTitle = "A Phase 1/2 Study of the Highly-selective RET Inhibitor, BLU-667, in Patients With Thyroid Cancer, Non-Small Cell Lung Cancer (NSCLC) and Other Advanced Solid Tumors"; // String | Specifies full scientific title of a trial.
        String trialId = "NCT03037385"; // String | This parameter specifies ID of the trial assigned by the trial registry.
        OffsetDateTime date = OffsetDateTime.parse("2022-10-13 00:00:00"); // OffsetDateTime | Specifies the timestamp of each version of a trial in YYYY-MM-DD format.
        try {
            DataResponse result = apiInstance.getOzmosiClinicalTrialsDaily(sort, paginationLimit, paginationOffset, clinicalTrialId, officalTitle, trialId, date);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OzmosiApi#getOzmosiClinicalTrialsDaily");
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
 **sort** | **String**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. | [optional] [default to -startDate] [enum: startDate, -startDate]
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result Default value 20 and Maximum value 300 | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **String**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **officalTitle** | **String**| Specifies full scientific title of a trial. | [optional]
 **trialId** | **String**| This parameter specifies ID of the trial assigned by the trial registry. | [optional]
 **date** | **OffsetDateTime**| Specifies the timestamp of each version of a trial in YYYY-MM-DD format. | [optional]

### Return type

[**DataResponse**](DataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Clinical Trial Details. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getOzmosiClinicalTrialsHistory

> FullHistoryResponse getOzmosiClinicalTrialsHistory(paginationLimit, paginationOffset)

Returns the history files from Open:FactSet Partner - Ozmosi

Returns the historical files from June 23rd, 2005 to current date.

### Example

```java
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.OzmosiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        OzmosiApi apiInstance = new OzmosiApi(defaultClient);
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        try {
            FullHistoryResponse result = apiInstance.getOzmosiClinicalTrialsHistory(paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OzmosiApi#getOzmosiClinicalTrialsHistory");
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
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]

### Return type

[**FullHistoryResponse**](FullHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Ozmosi full history. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getOzmosiCollaboratorsDaily

> CollaboratorsResponse getOzmosiCollaboratorsDaily(paginationLimit, paginationOffset, clinicalTrialId, beamCollaboratorsName, beamCollaboratorsTicker)

Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.

### Example

```java
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.OzmosiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        OzmosiApi apiInstance = new OzmosiApi(defaultClient);
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        String clinicalTrialId = "NCT03037385_037"; // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
        String beamCollaboratorsName = "Inventivan Pharma"; // String | It specifies the cleaned name of the collaborator.
        String beamCollaboratorsTicker = "SSNLF"; // String | It specifies the Stock ticker for collaborator.
        try {
            CollaboratorsResponse result = apiInstance.getOzmosiCollaboratorsDaily(paginationLimit, paginationOffset, clinicalTrialId, beamCollaboratorsName, beamCollaboratorsTicker);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OzmosiApi#getOzmosiCollaboratorsDaily");
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
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **String**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **beamCollaboratorsName** | **String**| It specifies the cleaned name of the collaborator. | [optional]
 **beamCollaboratorsTicker** | **String**| It specifies the Stock ticker for collaborator. | [optional]

### Return type

[**CollaboratorsResponse**](CollaboratorsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Collaborators Details.. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getOzmosiDiseasesDaily

> DiseasesResponse getOzmosiDiseasesDaily(paginationLimit, paginationOffset, clinicalTrialId, diseaseArea, subTherapyArea, therapyArea)

Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.

Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.

### Example

```java
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.OzmosiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        OzmosiApi apiInstance = new OzmosiApi(defaultClient);
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        String clinicalTrialId = "NCT03037385_037"; // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
        String diseaseArea = "Inflammation"; // String | Specifies the cleaned disease name.
        String subTherapyArea = "Inflammation"; // String | Specifies the Sub Therapy Area of the disease.
        String therapyArea = "Musculoskeletal"; // String | Specifies the Therapy Area of the disease.
        try {
            DiseasesResponse result = apiInstance.getOzmosiDiseasesDaily(paginationLimit, paginationOffset, clinicalTrialId, diseaseArea, subTherapyArea, therapyArea);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OzmosiApi#getOzmosiDiseasesDaily");
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
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **String**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **diseaseArea** | **String**| Specifies the cleaned disease name. | [optional]
 **subTherapyArea** | **String**| Specifies the Sub Therapy Area of the disease. | [optional]
 **therapyArea** | **String**| Specifies the Therapy Area of the disease. | [optional]

### Return type

[**DiseasesResponse**](DiseasesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Diseases Details. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getOzmosiEndpointsDaily

> BeamEndpointsResponse getOzmosiEndpointsDaily(paginationLimit, paginationOffset, clinicalTrialId, name, fullForm)

Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.

### Example

```java
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.OzmosiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        OzmosiApi apiInstance = new OzmosiApi(defaultClient);
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        String clinicalTrialId = "NCT03037385_037"; // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
        String name = "OS"; // String | This parameter specifies cleaned and standardized abbreviations of primary endpoints that are common or of key interest.
        String fullForm = "Overall Survival"; // String | This parameter specifies cleaned and standardized full names of primary endpoints that are common or of key interest.
        try {
            BeamEndpointsResponse result = apiInstance.getOzmosiEndpointsDaily(paginationLimit, paginationOffset, clinicalTrialId, name, fullForm);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OzmosiApi#getOzmosiEndpointsDaily");
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
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **String**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **name** | **String**| This parameter specifies cleaned and standardized abbreviations of primary endpoints that are common or of key interest. | [optional]
 **fullForm** | **String**| This parameter specifies cleaned and standardized full names of primary endpoints that are common or of key interest. | [optional]

### Return type

[**BeamEndpointsResponse**](BeamEndpointsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Beam Endpoint Details. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getOzmosiInterventionDaily

> InterventionResponse getOzmosiInterventionDaily(paginationLimit, paginationOffset, clinicalTrialId, beamInterventionName, beamInterventionDesc)

Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.

### Example

```java
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.OzmosiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        OzmosiApi apiInstance = new OzmosiApi(defaultClient);
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        String clinicalTrialId = "NCT03037385_037"; // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
        String beamInterventionName = "Etelcalcetide"; // String | This parameter specifies the name of intervention applied.
        String beamInterventionDesc = "Cinacalcet oral once-daily"; // String | It specifies the description of intervention applied.
        try {
            InterventionResponse result = apiInstance.getOzmosiInterventionDaily(paginationLimit, paginationOffset, clinicalTrialId, beamInterventionName, beamInterventionDesc);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OzmosiApi#getOzmosiInterventionDaily");
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
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **String**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **beamInterventionName** | **String**| This parameter specifies the name of intervention applied. | [optional]
 **beamInterventionDesc** | **String**| It specifies the description of intervention applied. | [optional]

### Return type

[**InterventionResponse**](InterventionResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Intervention Details. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error. |  -  |


## getOzmosiOrangepurpleDaily

> OrangePurpleResponse getOzmosiOrangepurpleDaily(paginationLimit, paginationOffset, clinicalTrialId, beamOpNovelDrug, beamOpNovelTarget)

Returns the daily files of OrangePurple Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of OrangePurple Details from Open:FaStset Partner - Ozmosi.

### Example

```java
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.OzmosiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        OzmosiApi apiInstance = new OzmosiApi(defaultClient);
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        String clinicalTrialId = "NCT03037385_037"; // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
        String beamOpNovelDrug = "EDP-305"; // String | This parameter identifies if the trial includes a drug that is not approved by the FDA.
        String beamOpNovelTarget = "tricalcium"; // String | It lists the unapproved drug.
        try {
            OrangePurpleResponse result = apiInstance.getOzmosiOrangepurpleDaily(paginationLimit, paginationOffset, clinicalTrialId, beamOpNovelDrug, beamOpNovelTarget);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OzmosiApi#getOzmosiOrangepurpleDaily");
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
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **String**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **beamOpNovelDrug** | **String**| This parameter identifies if the trial includes a drug that is not approved by the FDA. | [optional]
 **beamOpNovelTarget** | **String**| It lists the unapproved drug. | [optional]

### Return type

[**OrangePurpleResponse**](OrangePurpleResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for OrangePurple Details. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getOzmosiPrimaryoutcomeDaily

> PrimaryOutcomeResponse getOzmosiPrimaryoutcomeDaily(paginationLimit, paginationOffset, clinicalTrialId, primaryOutcomeMeasure, primaryOutcomeDesc)

Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.

### Example

```java
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.OzmosiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        OzmosiApi apiInstance = new OzmosiApi(defaultClient);
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        String clinicalTrialId = "NCT03037385_037"; // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
        String primaryOutcomeMeasure = "Percentage of Participants Achieving an American College of Rheumatology (ACR) 50 Response at Week 12."; // String | It specifies the description of each primary outcome measure (or for observational studies, specific key measurement[s] or observation[s] used to describe patterns of diseases or traits or associations with exposures, risk factors or treatment).
        String primaryOutcomeDesc = "Week 12"; // String | It describes the metric used to characterize the specific primary outcome measure, if not included in the primary outcome measure title.
        try {
            PrimaryOutcomeResponse result = apiInstance.getOzmosiPrimaryoutcomeDaily(paginationLimit, paginationOffset, clinicalTrialId, primaryOutcomeMeasure, primaryOutcomeDesc);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OzmosiApi#getOzmosiPrimaryoutcomeDaily");
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
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **String**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **primaryOutcomeMeasure** | **String**| It specifies the description of each primary outcome measure (or for observational studies, specific key measurement[s] or observation[s] used to describe patterns of diseases or traits or associations with exposures, risk factors or treatment). | [optional]
 **primaryOutcomeDesc** | **String**| It describes the metric used to characterize the specific primary outcome measure, if not included in the primary outcome measure title. | [optional]

### Return type

[**PrimaryOutcomeResponse**](PrimaryOutcomeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for PrimaryOutcome Details |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


## getOzmosiSponsorsDaily

> SponsorsResponse getOzmosiSponsorsDaily(paginationLimit, paginationOffset, clinicalTrialId, beamSponsorsName, beamSponsorsTicker)

Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.

### Example

```java
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.OzmosiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        OzmosiApi apiInstance = new OzmosiApi(defaultClient);
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        String clinicalTrialId = "NCT03037385_037"; // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
        String beamSponsorsName = "AtriCure"; // String | It specifies the cleaned name of the Sponsor.
        String beamSponsorsTicker = "ATRC"; // String | It specifies the stock ticker for primary sponsor.
        try {
            SponsorsResponse result = apiInstance.getOzmosiSponsorsDaily(paginationLimit, paginationOffset, clinicalTrialId, beamSponsorsName, beamSponsorsTicker);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OzmosiApi#getOzmosiSponsorsDaily");
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
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **String**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional]
 **beamSponsorsName** | **String**| It specifies the cleaned name of the Sponsor. | [optional]
 **beamSponsorsTicker** | **String**| It specifies the stock ticker for primary sponsor. | [optional]

### Return type

[**SponsorsResponse**](SponsorsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Sponsors Details. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |


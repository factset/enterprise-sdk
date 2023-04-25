# FactSet.SDK.OpenFactSetPartnersDocuments.Api.OzmosiApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOzmosiBiomarkersDaily**](OzmosiApi.md#getozmosibiomarkersdaily) | **GET** /ozmosi/biomarkers/daily | Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.
[**GetOzmosiClinicalTrialsDaily**](OzmosiApi.md#getozmosiclinicaltrialsdaily) | **GET** /ozmosi/clinical-trials/daily | Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.
[**GetOzmosiClinicalTrialsHistory**](OzmosiApi.md#getozmosiclinicaltrialshistory) | **GET** /ozmosi/clinical-trials/history | Returns the history files from Open:FactSet Partner - Ozmosi
[**GetOzmosiCollaboratorsDaily**](OzmosiApi.md#getozmosicollaboratorsdaily) | **GET** /ozmosi/collaborators/daily | Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.
[**GetOzmosiDiseasesDaily**](OzmosiApi.md#getozmosidiseasesdaily) | **GET** /ozmosi/diseases/daily | Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.
[**GetOzmosiEndpointsDaily**](OzmosiApi.md#getozmosiendpointsdaily) | **GET** /ozmosi/beam-endpoints/daily | Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.
[**GetOzmosiInterventionDaily**](OzmosiApi.md#getozmosiinterventiondaily) | **GET** /ozmosi/intervention/daily | Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.
[**GetOzmosiOrangepurpleDaily**](OzmosiApi.md#getozmosiorangepurpledaily) | **GET** /ozmosi/orangepurple/daily | Returns the daily files of OrangePurple Details from Open:FactSet Partner - Ozmosi.
[**GetOzmosiPrimaryoutcomeDaily**](OzmosiApi.md#getozmosiprimaryoutcomedaily) | **GET** /ozmosi/primaryoutcome/daily | Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.
[**GetOzmosiSponsorsDaily**](OzmosiApi.md#getozmosisponsorsdaily) | **GET** /ozmosi/sponsors/daily | Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.



<a name="getozmosibiomarkersdaily"></a>
# **GetOzmosiBiomarkersDaily**
> BiomarkersResponse GetOzmosiBiomarkersDaily (int? paginationLimit = null, int? paginationOffset = null, string clinicalTrialId = null, string biomarkerName = null, string biomarkerFullName = null)

Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetOzmosiBiomarkersDailyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new OzmosiApi(config);

            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var clinicalTrialId = "NCT03037385_037";  // string | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional) 
            var biomarkerName = "EGFR";  // string | This parameter specifies the abbreviated name of any patient biomarkers being targeted for research in the trial. (optional) 
            var biomarkerFullName = "epidermal growth factor receptor";  // string | Specifies the full name of the biomarker. (optional) 

            try
            {
                // Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.
                BiomarkersResponse result = apiInstance.GetOzmosiBiomarkersDaily(paginationLimit, paginationOffset, clinicalTrialId, biomarkerName, biomarkerFullName);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OzmosiApi.GetOzmosiBiomarkersDaily: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **string**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional] 
 **biomarkerName** | **string**| This parameter specifies the abbreviated name of any patient biomarkers being targeted for research in the trial. | [optional] 
 **biomarkerFullName** | **string**| Specifies the full name of the biomarker. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getozmosiclinicaltrialsdaily"></a>
# **GetOzmosiClinicalTrialsDaily**
> DataResponse GetOzmosiClinicalTrialsDaily (string sort = null, int? paginationLimit = null, int? paginationOffset = null, string clinicalTrialId = null, string officalTitle = null, string trialId = null, DateTime? date = null)

Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetOzmosiClinicalTrialsDailyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new OzmosiApi(config);

            var sort = "startDate";  // string | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional)  (default to -startDate)
            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result Default value 20 and Maximum value 300 (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var clinicalTrialId = "NCT03037385_037";  // string | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional) 
            var officalTitle = "A Phase 1/2 Study of the Highly-selective RET Inhibitor, BLU-667, in Patients With Thyroid Cancer, Non-Small Cell Lung Cancer (NSCLC) and Other Advanced Solid Tumors";  // string | Specifies full scientific title of a trial. (optional) 
            var trialId = "NCT03037385";  // string | This parameter specifies ID of the trial assigned by the trial registry. (optional) 
            var date = DateTime.Parse("2022-10-13 00:00:00");  // DateTime? | Specifies the timestamp of each version of a trial in YYYY-MM-DD format. (optional) 

            try
            {
                // Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.
                DataResponse result = apiInstance.GetOzmosiClinicalTrialsDaily(sort, paginationLimit, paginationOffset, clinicalTrialId, officalTitle, trialId, date);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OzmosiApi.GetOzmosiClinicalTrialsDaily: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **string**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. | [optional] [default to -startDate]
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result Default value 20 and Maximum value 300 | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **string**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional] 
 **officalTitle** | **string**| Specifies full scientific title of a trial. | [optional] 
 **trialId** | **string**| This parameter specifies ID of the trial assigned by the trial registry. | [optional] 
 **date** | **DateTime?**| Specifies the timestamp of each version of a trial in YYYY-MM-DD format. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getozmosiclinicaltrialshistory"></a>
# **GetOzmosiClinicalTrialsHistory**
> FullHistoryResponse GetOzmosiClinicalTrialsHistory (int? paginationLimit = null, int? paginationOffset = null)

Returns the history files from Open:FactSet Partner - Ozmosi

Returns the historical files from June 23rd, 2005 to current date.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetOzmosiClinicalTrialsHistoryExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new OzmosiApi(config);

            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)

            try
            {
                // Returns the history files from Open:FactSet Partner - Ozmosi
                FullHistoryResponse result = apiInstance.GetOzmosiClinicalTrialsHistory(paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OzmosiApi.GetOzmosiClinicalTrialsHistory: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getozmosicollaboratorsdaily"></a>
# **GetOzmosiCollaboratorsDaily**
> CollaboratorsResponse GetOzmosiCollaboratorsDaily (int? paginationLimit = null, int? paginationOffset = null, string clinicalTrialId = null, string beamCollaboratorsName = null, string beamCollaboratorsTicker = null)

Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetOzmosiCollaboratorsDailyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new OzmosiApi(config);

            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var clinicalTrialId = "NCT03037385_037";  // string | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional) 
            var beamCollaboratorsName = "Inventivan Pharma";  // string | It specifies the cleaned name of the collaborator. (optional) 
            var beamCollaboratorsTicker = "SSNLF";  // string | It specifies the Stock ticker for collaborator. (optional) 

            try
            {
                // Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.
                CollaboratorsResponse result = apiInstance.GetOzmosiCollaboratorsDaily(paginationLimit, paginationOffset, clinicalTrialId, beamCollaboratorsName, beamCollaboratorsTicker);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OzmosiApi.GetOzmosiCollaboratorsDaily: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **string**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional] 
 **beamCollaboratorsName** | **string**| It specifies the cleaned name of the collaborator. | [optional] 
 **beamCollaboratorsTicker** | **string**| It specifies the Stock ticker for collaborator. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getozmosidiseasesdaily"></a>
# **GetOzmosiDiseasesDaily**
> DiseasesResponse GetOzmosiDiseasesDaily (int? paginationLimit = null, int? paginationOffset = null, string clinicalTrialId = null, string diseaseArea = null, string subTherapyArea = null, string therapyArea = null)

Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.

Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetOzmosiDiseasesDailyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new OzmosiApi(config);

            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var clinicalTrialId = "NCT03037385_037";  // string | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional) 
            var diseaseArea = "Inflammation";  // string | Specifies the cleaned disease name. (optional) 
            var subTherapyArea = "Inflammation";  // string | Specifies the Sub Therapy Area of the disease. (optional) 
            var therapyArea = "Musculoskeletal";  // string | Specifies the Therapy Area of the disease. (optional) 

            try
            {
                // Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.
                DiseasesResponse result = apiInstance.GetOzmosiDiseasesDaily(paginationLimit, paginationOffset, clinicalTrialId, diseaseArea, subTherapyArea, therapyArea);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OzmosiApi.GetOzmosiDiseasesDaily: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **string**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional] 
 **diseaseArea** | **string**| Specifies the cleaned disease name. | [optional] 
 **subTherapyArea** | **string**| Specifies the Sub Therapy Area of the disease. | [optional] 
 **therapyArea** | **string**| Specifies the Therapy Area of the disease. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getozmosiendpointsdaily"></a>
# **GetOzmosiEndpointsDaily**
> BeamEndpointsResponse GetOzmosiEndpointsDaily (int? paginationLimit = null, int? paginationOffset = null, string clinicalTrialId = null, string name = null, string fullForm = null)

Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetOzmosiEndpointsDailyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new OzmosiApi(config);

            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var clinicalTrialId = "NCT03037385_037";  // string | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional) 
            var name = "OS";  // string | This parameter specifies cleaned and standardized abbreviations of primary endpoints that are common or of key interest. (optional) 
            var fullForm = "Overall Survival";  // string | This parameter specifies cleaned and standardized full names of primary endpoints that are common or of key interest. (optional) 

            try
            {
                // Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.
                BeamEndpointsResponse result = apiInstance.GetOzmosiEndpointsDaily(paginationLimit, paginationOffset, clinicalTrialId, name, fullForm);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OzmosiApi.GetOzmosiEndpointsDaily: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **string**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional] 
 **name** | **string**| This parameter specifies cleaned and standardized abbreviations of primary endpoints that are common or of key interest. | [optional] 
 **fullForm** | **string**| This parameter specifies cleaned and standardized full names of primary endpoints that are common or of key interest. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getozmosiinterventiondaily"></a>
# **GetOzmosiInterventionDaily**
> InterventionResponse GetOzmosiInterventionDaily (int? paginationLimit = null, int? paginationOffset = null, string clinicalTrialId = null, string beamInterventionName = null, string beamInterventionDesc = null)

Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetOzmosiInterventionDailyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new OzmosiApi(config);

            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var clinicalTrialId = "NCT03037385_037";  // string | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional) 
            var beamInterventionName = "Etelcalcetide";  // string | This parameter specifies the name of intervention applied. (optional) 
            var beamInterventionDesc = "Cinacalcet oral once-daily";  // string | It specifies the description of intervention applied. (optional) 

            try
            {
                // Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.
                InterventionResponse result = apiInstance.GetOzmosiInterventionDaily(paginationLimit, paginationOffset, clinicalTrialId, beamInterventionName, beamInterventionDesc);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OzmosiApi.GetOzmosiInterventionDaily: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **string**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional] 
 **beamInterventionName** | **string**| This parameter specifies the name of intervention applied. | [optional] 
 **beamInterventionDesc** | **string**| It specifies the description of intervention applied. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getozmosiorangepurpledaily"></a>
# **GetOzmosiOrangepurpleDaily**
> OrangePurpleResponse GetOzmosiOrangepurpleDaily (int? paginationLimit = null, int? paginationOffset = null, string clinicalTrialId = null, string beamOpNovelDrug = null, string beamOpNovelTarget = null)

Returns the daily files of OrangePurple Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of OrangePurple Details from Open:FaStset Partner - Ozmosi.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetOzmosiOrangepurpleDailyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new OzmosiApi(config);

            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var clinicalTrialId = "NCT03037385_037";  // string | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional) 
            var beamOpNovelDrug = "EDP-305";  // string | This parameter identifies if the trial includes a drug that is not approved by the FDA. (optional) 
            var beamOpNovelTarget = "tricalcium";  // string | It lists the unapproved drug. (optional) 

            try
            {
                // Returns the daily files of OrangePurple Details from Open:FactSet Partner - Ozmosi.
                OrangePurpleResponse result = apiInstance.GetOzmosiOrangepurpleDaily(paginationLimit, paginationOffset, clinicalTrialId, beamOpNovelDrug, beamOpNovelTarget);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OzmosiApi.GetOzmosiOrangepurpleDaily: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **string**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional] 
 **beamOpNovelDrug** | **string**| This parameter identifies if the trial includes a drug that is not approved by the FDA. | [optional] 
 **beamOpNovelTarget** | **string**| It lists the unapproved drug. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getozmosiprimaryoutcomedaily"></a>
# **GetOzmosiPrimaryoutcomeDaily**
> PrimaryOutcomeResponse GetOzmosiPrimaryoutcomeDaily (int? paginationLimit = null, int? paginationOffset = null, string clinicalTrialId = null, string primaryOutcomeMeasure = null, string primaryOutcomeDesc = null)

Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetOzmosiPrimaryoutcomeDailyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new OzmosiApi(config);

            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var clinicalTrialId = "NCT03037385_037";  // string | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional) 
            var primaryOutcomeMeasure = "Percentage of Participants Achieving an American College of Rheumatology (ACR) 50 Response at Week 12.";  // string | It specifies the description of each primary outcome measure (or for observational studies, specific key measurement[s] or observation[s] used to describe patterns of diseases or traits or associations with exposures, risk factors or treatment). (optional) 
            var primaryOutcomeDesc = "Week 12";  // string | It describes the metric used to characterize the specific primary outcome measure, if not included in the primary outcome measure title. (optional) 

            try
            {
                // Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.
                PrimaryOutcomeResponse result = apiInstance.GetOzmosiPrimaryoutcomeDaily(paginationLimit, paginationOffset, clinicalTrialId, primaryOutcomeMeasure, primaryOutcomeDesc);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OzmosiApi.GetOzmosiPrimaryoutcomeDaily: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **string**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional] 
 **primaryOutcomeMeasure** | **string**| It specifies the description of each primary outcome measure (or for observational studies, specific key measurement[s] or observation[s] used to describe patterns of diseases or traits or associations with exposures, risk factors or treatment). | [optional] 
 **primaryOutcomeDesc** | **string**| It describes the metric used to characterize the specific primary outcome measure, if not included in the primary outcome measure title. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getozmosisponsorsdaily"></a>
# **GetOzmosiSponsorsDaily**
> SponsorsResponse GetOzmosiSponsorsDaily (int? paginationLimit = null, int? paginationOffset = null, string clinicalTrialId = null, string beamSponsorsName = null, string beamSponsorsTicker = null)

Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetOzmosiSponsorsDailyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new OzmosiApi(config);

            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var clinicalTrialId = "NCT03037385_037";  // string | This parameter specifies Ozmosi unique ID for each historical version of a trial. (optional) 
            var beamSponsorsName = "AtriCure";  // string | It specifies the cleaned name of the Sponsor. (optional) 
            var beamSponsorsTicker = "ATRC";  // string | It specifies the stock ticker for primary sponsor. (optional) 

            try
            {
                // Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.
                SponsorsResponse result = apiInstance.GetOzmosiSponsorsDaily(paginationLimit, paginationOffset, clinicalTrialId, beamSponsorsName, beamSponsorsTicker);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OzmosiApi.GetOzmosiSponsorsDaily: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **string**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional] 
 **beamSponsorsName** | **string**| It specifies the cleaned name of the Sponsor. | [optional] 
 **beamSponsorsTicker** | **string**| It specifies the stock ticker for primary sponsor. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)



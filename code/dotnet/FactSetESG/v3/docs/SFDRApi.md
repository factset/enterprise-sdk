# FactSet.SDK.FactSetESG.Api.SFDRApi

All URIs are relative to *https://api.factset.com/content/factset-esg/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSfdrPai**](SFDRApi.md#getsfdrpai) | **GET** /sfdr/pai | Requests Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting
[**GetSfdrPaiForList**](SFDRApi.md#getsfdrpaiforlist) | **POST** /sfdr/pai | Requests Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting



<a name="getsfdrpai"></a>
# **GetSfdrPai**
> SfdrPaiResponse GetSfdrPai (List<string> ids, DateTime fiscalPeriodStart, DateTime fiscalPeriodEnd, bool? feelback = null, string currency = null, List<string> indicators = null, bool? calculation = null)

Requests Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting

SFDR Principle Adverse Impact (PAI) data is built specifically to support compliant Sustainable Finance Disclosure Regulation (SFDR) reporting. FactSet collects PAI data items from publicly available company-reported information and FactSet databases, such as FactSet Fundamentals, FactSet RBICS with Revenue and FactSet People, which are also based on company-disclosures. FactSet uses Truvalue Labs SASB Spotlights for supplemental OECD & UNGC violation checks where company reporting is sparse.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetESG.Api;
using FactSet.SDK.FactSetESG.Client;
using FactSet.SDK.FactSetESG.Model;

namespace Example
{
    public class GetSfdrPaiExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetESG.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new SFDRApi(config);

            var ids = new List<string>(); // List<string> | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  1500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total  length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
            var fiscalPeriodStart = DateTime.Parse("2020-01-01");  // DateTime | Fiscal period start is expressed in YYYY-MM-DD formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint. 
            var fiscalPeriodEnd = DateTime.Parse("2022-02-20");  // DateTime | Fiscal period end is expressed in YYYY-MM-DD formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint. 
            var feelback = false;  // bool? | This parameter would return the latest PAI data/s based on the indicators, date range and/or subtopics requested.   (optional)  (default to false)
            var currency = "\"LOCAL\"";  // string | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  (optional)  (default to "LOCAL")
            var indicators = new List<string>(); // List<string> | The indicators are the Principal Adverse Impact (PAI) metrics which consists of General, Mandatory and Additional indicators which supports the SFDR reporting.   The General indicators data can retrieved by providing the `GL001` and `GL002` subTopic codes as input. Please refer to the attached documentation for the full list of subtopics codes and their mapping with the indicators.  The data can also be requested for individual sub topic codes in addition to the indicators mentioned below -    |**SFDR PAI Indicators**|**Description**| |- --|- --| |**MandatoryIndicators**| Mandatory indicators are the indicators which must be reported under the EU Sustainable Finance Disclosure Regulation (SFDR).| |**AdditionalIndicators**| These are additional environmental and social indicators as mentioned in additional tables as provided in the Annex 1 table in the SFDR RTS report.| |**GHGEmissions**| This mandatory indicator includes metrics related to greenhouse emissions such as - Scope 1, 2, and 3 emissions, footprint and intensity and energy consumption from non-renewable and high climate sectors.| |**Biodiversity**| This mandatory indicator includes metrics pertaining to biodiversity and a company's impacts on biodiversity-sensitive areas.| |**Water**| This mandatory indicator includes data relating to emissions to water as made by the companies.| |**Waste**| This mandatory indicator includes data relating to hazardous waste as generated by the companies.| |**SocialEmployeeMatters**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**Emissions**| This additional indicator includes metrics related to air pollutants, inorganic pollutants and ozone depleting substance. | |**EnergyPerformance**| This additional indicator includes metrics related to various sources of non-renewable energy as used by the companies. | |**WaterWasteMaterialEmissions**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**AdditionalEmployeeMatters**| This additional indicator includes metrics related to workplace discrimination and safety, whistleblower mechanism and supplier code of conduct.| |**HumanRights**| This additional indicator includes metrics related to both policies and performance of a company in the areas of human rights, forced labor and human trafficking.| |**AntiCorruptionAntiBribery**| This additional indicator includes data related to company violations of anti-corruption and anti-bribery laws, and resulting fines.|  (optional) 
            var calculation = true;  // bool? | This parameter would return the PAI data based on the input provided. All the data for indicators or subtopics requested are returned when the input is `true` and the SFDR required metrics are only returned when the input is`false`  (optional)  (default to true)

            try
            {
                // Requests Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting
                SfdrPaiResponse result = apiInstance.GetSfdrPai(ids, fiscalPeriodStart, fiscalPeriodEnd, feelback, currency, indicators, calculation);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SFDRApi.GetSfdrPai: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total  length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **fiscalPeriodStart** | **DateTime**| Fiscal period start is expressed in YYYY-MM-DD formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | 
 **fiscalPeriodEnd** | **DateTime**| Fiscal period end is expressed in YYYY-MM-DD formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | 
 **feelback** | **bool?**| This parameter would return the latest PAI data/s based on the indicators, date range and/or subtopics requested.   | [optional] [default to false]
 **currency** | **string**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to &quot;LOCAL&quot;]
 **indicators** | [**List&lt;string&gt;**](string.md)| The indicators are the Principal Adverse Impact (PAI) metrics which consists of General, Mandatory and Additional indicators which supports the SFDR reporting.   The General indicators data can retrieved by providing the &#x60;GL001&#x60; and &#x60;GL002&#x60; subTopic codes as input. Please refer to the attached documentation for the full list of subtopics codes and their mapping with the indicators.  The data can also be requested for individual sub topic codes in addition to the indicators mentioned below -    |**SFDR PAI Indicators**|**Description**| |- --|- --| |**MandatoryIndicators**| Mandatory indicators are the indicators which must be reported under the EU Sustainable Finance Disclosure Regulation (SFDR).| |**AdditionalIndicators**| These are additional environmental and social indicators as mentioned in additional tables as provided in the Annex 1 table in the SFDR RTS report.| |**GHGEmissions**| This mandatory indicator includes metrics related to greenhouse emissions such as - Scope 1, 2, and 3 emissions, footprint and intensity and energy consumption from non-renewable and high climate sectors.| |**Biodiversity**| This mandatory indicator includes metrics pertaining to biodiversity and a company&#39;s impacts on biodiversity-sensitive areas.| |**Water**| This mandatory indicator includes data relating to emissions to water as made by the companies.| |**Waste**| This mandatory indicator includes data relating to hazardous waste as generated by the companies.| |**SocialEmployeeMatters**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**Emissions**| This additional indicator includes metrics related to air pollutants, inorganic pollutants and ozone depleting substance. | |**EnergyPerformance**| This additional indicator includes metrics related to various sources of non-renewable energy as used by the companies. | |**WaterWasteMaterialEmissions**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**AdditionalEmployeeMatters**| This additional indicator includes metrics related to workplace discrimination and safety, whistleblower mechanism and supplier code of conduct.| |**HumanRights**| This additional indicator includes metrics related to both policies and performance of a company in the areas of human rights, forced labor and human trafficking.| |**AntiCorruptionAntiBribery**| This additional indicator includes data related to company violations of anti-corruption and anti-bribery laws, and resulting fines.|  | [optional] 
 **calculation** | **bool?**| This parameter would return the PAI data based on the input provided. All the data for indicators or subtopics requested are returned when the input is &#x60;true&#x60; and the SFDR required metrics are only returned when the input is&#x60;false&#x60;  | [optional] [default to true]

### Return type
[**SfdrPaiResponse**](SfdrPaiResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The SFDR PAI response object, including the Calculation, Sub Topic Codes, Sub Topic Names, Report End Date,Reporting Period, Standardized Units and Standardized Values |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **403** | The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **408** | Request Time-Out. This error would be returned if the request takes more than 29 seconds. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **429** | Too Many Requests. This error occurs when the rate limits for requests have been exceeded. Please wait before making more requests. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  * Retry-After - The time, in seconds, the user agent should wait before making a follow-up request. <br>  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getsfdrpaiforlist"></a>
# **GetSfdrPaiForList**
> SfdrPaiResponse GetSfdrPaiForList (SfdrPaiRequest sfdrPaiRequest)

Requests Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting

SFDR Principle Adverse Impact (PAI) data is built specifically to support compliant Sustainable Finance Disclosure Regulation (SFDR) reporting. FactSet collects PAI data items from publicly available company-reported information and FactSet databases, such as FactSet Fundamentals, FactSet RBICS with Revenue and FactSet People, which are also based on company-disclosures. FactSet uses Truvalue Labs SASB Spotlights for supplemental OECD & UNGC violation checks where company reporting is sparse. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetESG.Api;
using FactSet.SDK.FactSetESG.Client;
using FactSet.SDK.FactSetESG.Model;

namespace Example
{
    public class GetSfdrPaiForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetESG.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new SFDRApi(config);

            var sfdrPaiRequest = new SfdrPaiRequest(); // SfdrPaiRequest | The request body, allows the user to specify a list of ids, date range(Annual), and PAI Indicators

            try
            {
                // Requests Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting
                SfdrPaiResponse result = apiInstance.GetSfdrPaiForList(sfdrPaiRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SFDRApi.GetSfdrPaiForList: " + e.Message );
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
 **sfdrPaiRequest** | [**SfdrPaiRequest**](SfdrPaiRequest.md)| The request body, allows the user to specify a list of ids, date range(Annual), and PAI Indicators | 

### Return type
[**SfdrPaiResponse**](SfdrPaiResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The SFDR PAI response object, including the Calculation, SubTopic Codes, SubTopic Names, Report End Date,Reporting Period, Standardized Units and Standardized Values |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **403** | The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **408** | Request Time-Out. This error would be returned if the request takes more than 29 seconds. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **429** | Too Many Requests. This error occurs when the rate limits for requests have been exceeded. Please wait before making more requests. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  * Retry-After - The time, in seconds, the user agent should wait before making a follow-up request. <br>  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)



# SasbApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSasbRanks**](SasbApi.md#getSasbRanks) | **GET** /factset-esg/v1/sasb-ranks | Gets ESG Rankings for a requested list of ids and dates.
[**getSasbRanksPost**](SasbApi.md#getSasbRanksPost) | **POST** /factset-esg/v1/sasb-ranks | Get ESG Ranks for a large list of ids and specified date range.
[**getSasbScores**](SasbApi.md#getSasbScores) | **GET** /factset-esg/v1/sasb-scores | Gets short-term, long-term, and momentum scores based on the 26 ESG categories defined by the Sustainability Accounting Standards Board (SASB).
[**getSasbScoresAll**](SasbApi.md#getSasbScoresAll) | **GET** /factset-esg/v1/sasb-scores-all | Gets a flat key value array of scores for named categories of the input scoreType(s).
[**getSasbScoresAllPost**](SasbApi.md#getSasbScoresAllPost) | **POST** /factset-esg/v1/sasb-scores-all | Gets a flat key value array of scores for named categories of the input score type(s).
[**getSasbScoresPost**](SasbApi.md#getSasbScoresPost) | **POST** /factset-esg/v1/sasb-scores | For a large list of ids, gets short-term, long-term, and momentum scores based on the 26 ESG categories defined by the Sustainability Accounting Standards Board (SASB).



## getSasbRanks

> SasbRanksResponse getSasbRanks(ids, categories, startDate, endDate, frequency, calendar)

Gets ESG Rankings for a requested list of ids and dates.

Indicates if a company is a Leader, Above Average, Average, Below Average, or a Laggard; directly mapping from Industry Percentiles (*request IND_PCTL in scores endpoints*). Mapping of ESG Ranks to Industry Percentile Ranges is as follows - 

|Rank|Industry Percentile Range (%)|
|---|---|
|Leader|90 - 100|
|Above Average|70 - 89.9|
|Average|30 - 69.9|
|Below Average|10 - 29.9|
|Laggard|0 - 9.9|

Industry classifications follow SICS, SASB's Industry Classification System. Using the Adjusted Insight scores, Industry Percentiles are generated for all companies. Companies with five or more articles in a year get ranked in a first pass, then companies with filled-in values are interpolated without forcing the ranking of higher-volume companies up or down.  In the case where a company falls into an industry with fewer than 7 high or medium volume companies the Sector Percentile is inserted in the place of the Industry Percentile score.
<p>Only Vaild for ALLCATEGORIES and MATERIALITY categories.</p>


### Example

```java
// Import classes:
import com.factset.sdk.FactSetESG.ApiClient;
import com.factset.sdk.FactSetESG.ApiException;
import com.factset.sdk.FactSetESG.Configuration;
import com.factset.sdk.FactSetESG.auth.*;
import com.factset.sdk.FactSetESG.models.*;
import com.factset.sdk.FactSetESG.api.SasbApi;

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

        SasbApi apiInstance = new SasbApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may exceed this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        java.util.List<String> categories = Arrays.asList(); // java.util.List<String> | The Categories representing overall or composite rankings from all underlying 26 SASB Categories.  ### SASB Categories |**SASB Category Inputs**|**Description**| |---|---| |**ALLCATEGORIES**|**All Categories** - The company's overall SASB Rank. This value is equal to the cumulative average of all 26 SASB categories. |**MATERIALITY**|**Materiality** - The composite rank of all 'material' SASB categories for the given entity. For more information on SASB's Materiality Map, visit [materiality.sasb.org](https://materiality.sasb.org/)|  ### Helper Input **ALL** = Simply gives the ability to request all categories in a single request without having to explicitly list each available category.  
        String startDate = "2018-12-31"; // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
        String endDate = "2019-12-31"; // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
        String frequency = "D"; // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.    
        String calendar = "FIVEDAY"; // String | Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods.
        try {
            SasbRanksResponse result = apiInstance.getSasbRanks(ids, categories, startDate, endDate, frequency, calendar);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SasbApi#getSasbRanks");
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
 **ids** | **List&lt;String&gt;**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may exceed this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **categories** | **List&lt;String&gt;**| The Categories representing overall or composite rankings from all underlying 26 SASB Categories.  ### SASB Categories |**SASB Category Inputs**|**Description**| |---|---| |**ALLCATEGORIES**|**All Categories** - The company&#39;s overall SASB Rank. This value is equal to the cumulative average of all 26 SASB categories. |**MATERIALITY**|**Materiality** - The composite rank of all &#39;material&#39; SASB categories for the given entity. For more information on SASB&#39;s Materiality Map, visit [materiality.sasb.org](https://materiality.sasb.org/)|  ### Helper Input **ALL** &#x3D; Simply gives the ability to request all categories in a single request without having to explicitly list each available category.   | [optional]
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.     | [optional] [default to D] [enum: D, W, M, CY, ]
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. | [optional] [default to SEVENDAY] [enum: FIVEDAY, SEVENDAY, LOCAL]

### Return type

[**SasbRanksResponse**](SasbRanksResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The SASB Ranks response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getSasbRanksPost

> SasbRanksResponse getSasbRanksPost(sasbRanksRequest)

Get ESG Ranks for a large list of ids and specified date range.

Indicates if a company is a Leader, Above Average, Average, Below Average, or a Laggard; directly mapping from Industry Percentiles (*request IND_PCTL in scores endpoints*). Mapping of ESG Ranks to Industry Percentile Ranges is as follows - 

|Rank|Industry Percentile Range (%)|
|---|---|
|Leader|90 - 100|
|Above Average|70 - 89.9|
|Average|30 - 69.9|
|Below Average|10 - 29.9|
|Laggard|0 - 9.9|

Industry classifications follow SICS, SASB's Industry Classification System. Using the Adjusted Insight scores, Industry Percentiles are generated for all companies. Companies with five or more articles in a year get ranked in a first pass, then companies with filled-in values are interpolated without forcing the ranking of higher-volume companies up or down.  In the case where a company falls into an industry with fewer than 7 high or medium volume companies the Sector Percentile is inserted in the place of the Industry Percentile score.
<p>Only Vaild for ALLCATEGORIES and MATERIALITY categories.</p>


### Example

```java
// Import classes:
import com.factset.sdk.FactSetESG.ApiClient;
import com.factset.sdk.FactSetESG.ApiException;
import com.factset.sdk.FactSetESG.Configuration;
import com.factset.sdk.FactSetESG.auth.*;
import com.factset.sdk.FactSetESG.models.*;
import com.factset.sdk.FactSetESG.api.SasbApi;

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

        SasbApi apiInstance = new SasbApi(defaultClient);
        SasbRanksRequest sasbRanksRequest = new SasbRanksRequest(); // SasbRanksRequest | The SASB Ranks Request Object
        try {
            SasbRanksResponse result = apiInstance.getSasbRanksPost(sasbRanksRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SasbApi#getSasbRanksPost");
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
 **sasbRanksRequest** | [**SasbRanksRequest**](SasbRanksRequest.md)| The SASB Ranks Request Object |

### Return type

[**SasbRanksResponse**](SasbRanksResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The SASB Ranks response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getSasbScores

> SasbScoresResponse getSasbScores(ids, scoreTypes, categories, startDate, endDate, frequency, calendar)

Gets short-term, long-term, and momentum scores based on the 26 ESG categories defined by the Sustainability Accounting Standards Board (SASB).

FactSet Truvalue Labs SASB Scores provides short-term, long-term, and momentum scores that are generated for 26 ESG categories defined by the Sustainability Accounting Standards Board. FactSet Truvalue also calculates a custom overall score called ALLCATEGORIES, can indicate data volume flow, and the Dynamic Materiality of that data flow.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetESG.ApiClient;
import com.factset.sdk.FactSetESG.ApiException;
import com.factset.sdk.FactSetESG.Configuration;
import com.factset.sdk.FactSetESG.auth.*;
import com.factset.sdk.FactSetESG.models.*;
import com.factset.sdk.FactSetESG.api.SasbApi;

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

        SasbApi apiInstance = new SasbApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may exceed this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        java.util.List<String> scoreTypes = Arrays.asList(); // java.util.List<String> | The FactSet Truvalue Score types being requested. Score Types include the Pulse, Insight, Momentum, Article Volume, Category Volume, Dynamic Materiality Score, Adjusted Insight, and Industry Percentile. When left blank all score types will be returned for the requested Id. To specify select scores returned in the response, provide a comma-separated list of the scores using the description below. <p>These scores use the same underlying data and 100-point scale, except for ranks and percentiles. The cognitive computing system behind FactSet's Truvalue Platform uses natural language processing to interpret semantic content and generate analytics. It does so by applying criteria that are consistent with established sustainability and ESG frameworks, scoring data points on performance using a 0 to 100 scale. A score of 50 represents a neutral impact. Scores above 50 indicate positive performance, and scores below reflect negative performance.</p>  ### ESG Score Types  |**SASB Category Input**|**Description**| |---|---| |**PULSE**|*Pulse Score*, is a measure of near-term performance changes that highlights opportunities and controversies, enabling real-time monitoring of companies. It focuses on events of the day and provides a responsive signal to alert investors to dynamic moves.| |**INSIGHT**|*Insight Score*, a measure of a company’s longer-term ESG track record, similar to a ratings system. Scores are less sensitive to daily events and reflect the enduring performance record of a company over time. Scores are derived using an exponentially-weighted moving average of the Pulse, defined below, and the half-life of an event’s influence on the overall score is 6 months.| |**MOMENTUM**|*Momentum Score*, measures the trend of a company's Insight score. It is a unique ESG metric in the industry that gives investors a high-precision view of the trajectory of a company’s ESG performance, relative to peers. It does so by precisely articulating upward or downward movement, relative to that of all others in the universe, making it a measure that enhances quantitative workflows.| |**ART_VOL_TTM**|*Article Volume Score*, measures the information flow or number of articles about a company over the past 12 months.| |**CAT_VOL_TTM**|*Category Volume Score*, returns the total number of times any of the 26 categories received a score over a trailing twelve-month (TTM) period of time.| |**DYNAMIC_MAT**|*Dynamic Materiality Score*, shows the percentage value of data flow by category compared with the total data flow for the organization **(NOT VALID for `ALLCATEGORIES` and `MATERIALITY` category types).**| |**ADJ_INSIGHT**|*Adjusted Insight*, Measures company ESG performance, generating scores for lower-volume and zero-volume firms by blending company scores with industry medians. **(ONLY Vaild for `ALLCATEGORIES` and `MATERIALITY` categories). <p>**Adjusted Insight Score = (# of articles / 5) x Company Insight Score + ((5 - # of articles) / 5) x Industry (or Sector) Median Insight Score.</p>| |**IND_PCTL**|*Industry Percentile*, offers context on company Adjusted Insight scores relative to peers in the same SICS Industry. This value is used to establish the textual ESG Rank. **(ONLY Vaild for `ALLCATEGORIES` and `MATERIALITY` categories).**|  ### Helper Input **ALL**= *Ability to fetch all of the \"scoreTypes\" listed above in a simplified query.* This is used by default and removes the need to explitly request each scoreType in the list. 
        java.util.List<String> categories = Arrays.asList(); // java.util.List<String> | The SASB Categories requested for the respective scoreType(s). The default value is **ALLCATEGORIES**, which represents all 26 categories in a single overall score. To request a specifc category or list of categories, simply input the category names below.   ### SASB Categories |**SASB Category Inputs**|**Description**| |---|---| |**ALLCATEGORIES**|**All Categories** - this category represents a company's overall SASB Score for the specific 'scoreType'. This value is equal to the cumulative average of all 26 SASB categories for the specific 'scoreType'.*Note that category is not available for the Dynamic Materiality 'scoreType'. |**ACCESSANDAFFORDABILITY**|**Access and Affordability** - The category addresses a company's ability to ensure broad access to its products and services, specifically in the context of underserved markets and/or population groups. It includes the management of issues related to universal needs, such as the accessibility and affordability of health care, financial services, utilities , education, and telecommunications.| |**AIRQUALITY**|**Air Quality** - the category addresses management of air quality impacts resulting from stationary (e.g., factories, power plants) and mobile sources (e.g., trucks, delivery vehicles, planes) as well as industrial emissions. Relevant airborne pollutants include, but are not limited to, oxides of nitrogen (NOx), oxides of sulfur (SOx), volatile organic compounds (VOCs), heavy metals, particulate matter, and chlorofluorocarbons. The category does not include GHG emissions, which are addressed in a separate category.| |**BUSINESSETHICS**|**Business Ethics** - the category addresses the company's approach to managing risks and opportunities surrounding ethical conduct of business, including fraud, corruption, bribery and facilitation payments, fiduciary responsibilities, and other behavior that may have an ethical component. This includes sensitivity to business norms and standards as they shift over time, jurisdiction, and culture. It addresses the company's ability to provide services that satisfy the highest professional and ethical standards of the industry, which means to avoid conflicts of interest, misrepresentation, bias, and negligence through training employees adequately and implementing policies and procedures to ensure employees provide services free from bias and error.| |**BUSMODELRESILIENCE**|**Business Model Resilience** - the category addresses an industry's capacity to manage risks and opportunities associated with incorporating social, environmental, and political transitions into long-term business model planning. This includes responsiveness to the transition to a low-carbon and climate-constrained economy, as well as growth and creation of new markets among unserved and underserved socioeconomic populations. The category highlights industries in which evolving environmental and social realities may challenge companies to fundamentally adapt or may put their business models at risk.| |**COMPETITIVEBEHAVIOR**|**Competitive Behavior** - the category covers social issues associated with existence of monopolies, which may include, but are not limited to, excessive prices, poor quality of service, and inefficiencies. It addresses a company's management of legal and social expectation around monopolistic and anti-competitive practices, including issues related to bargaining power, collusion, price fixing or manipulation, and protection of patents and intellectual property (IP).| |**CRITINCIDENTRISKMGT**|**Critical Incident Risk Management** - the category addresses the company's use of management systems and scenario planning to identify, understand, and prevent or minimize the occurrence of low-probability, high-impact accidents and emergencies with significant potential environmental and social externalities. It relates to the culture of safety at a company, its relevant safety management systems and technological controls, the potential human, environmental, and social implications of such events occurring, and the long-term effects to an organization, its workers, and society should these events occur.| |**CUSTOMERPRIVACY**|**Customer Privacy** - the category addresses management of risks related to the use of personally identifiable information (PII) and other customer or user data for secondary purposes including but not limited to marketing through affiliates and non-affiliates. The scope of the category includes social issues that may arise from a company's approach to collecting data, obtaining consent (e.g., opt-in policies), managing user and customer expectations regarding how their data is used, and managing evolving regulation. It excludes social issues arising from cybersecurity risks, which are covered in a separate category.| |**CUSTWELFARE**|**Customer Welfare** - the category addresses customer welfare concerns over issues including, but not limited to, health and nutrition of foods and beverages, antibiotic use in animal production, and management of controlled substances. The category addresses the company's ability to provide consumers with manufactured products and services that are aligned with societal expectations. It does not include issues directly related to quality and safety malfunctions of manufactured products and services, but instead addresses qualities inherent to the design and delivery of products and services where customer welfare may be in question. The scope of the category also captures companies' ability to prevent counterfeit products.| |**DATASECURITY**|**Data Security** - the category addresses management of risks related to collection, retention, and use of sensitive, confidential, and/or proprietary customer or user data. It includes social issues that may arise from incidents such as data breaches in which personally identifiable information (PII) and other user or customer data may be exposed. It addresses a company's strategy, policies, and practices related to IT infrastructure, staff training, record keeping, cooperation with law enforcement, and other mechanisms used to ensure security of customer or user data.| |**ECOLOGICALIMPACTS**|**Ecological Impacts** - the category addresses management of the company's impacts on ecosystems and biodiversity through activities including, but not limited to, land use for exploration, natural resource extraction, and cultivation, as well as project development, construction, and siting. The impacts include, but are not limited to, biodiversity loss, habitat destruction, and deforestation at all stages – planning, land acquisition, permitting, development, operations, and site remediation. The category does not cover impacts of climate change on ecosystems and biodiversity.| |**EMPENGDIVANDINC**|**Employee Engagement Diversity and Inclusion** - the category addresses a company's ability to ensure that its culture and hiring and promotion practices embrace the building of a diverse and inclusive workforce that reflects the makeup of local talent pools and its customer base. It addresses the issues of discriminatory practices on the bases of race, gender, ethnicity, religion, sexual orientation, and other factors.| |**EMPHEALTHANDSAFETY**|**Employee Health and Safety** - the category addresses a company's ability to create and maintain a safe and healthy workplace environment that is free of injuries, fatalities, and illness (both chronic and acute). It is traditionally accomplished through implementing safety management plans, developing training requirements for employees and contractors, and conducting regular audits of their own practices as well as those of their subcontractors. The category further captures how companies ensure physical and mental health of workforce through technology, training, corporate culture, regulatory compliance, monitoring and testing, and personal protective equipment.| |**ENERGYMGT**|**Energy Management** - the category addresses environmental impacts associated with energy consumption. It addresses the company's management of energy in manufacturing and/or for provision of products and services derived from utility providers (grid energy) not owned or controlled by the company. More specifically, it includes management of energy efficiency and intensity, energy mix, as well as grid reliance. Upstream (e.g., suppliers) and downstream (e.g., product use) energy use is not included in the scope.| |**GHGEMISSIONS**|**Greenhouse Gas Emissions** - the category addresses direct (Scope 1) greenhouse gas (GHG) emissions that a company generates through its operations. This includes GHG emissions from stationary (e.g., factories, power plants) and mobile sources (e.g., trucks, delivery vehicles, planes), whether a result of combustion of fuel or non-combusted direct releases during activities such as natural resource extraction, power generation, land use, or biogenic processes. The category further includes management of regulatory risks, environmental compliance, and reputational risks and opportunities, as they related to direct GHG emissions. The seven GHGs covered under the Kyoto Protocol are included within the category— carbon dioxide (CO2 ), methane (CH4), nitrous oxide (N2O), hydrofluorocarbons (HFCs), perfluorocarbons (PFCs), sulfur hexafluoride (SF6), and nitrogen trifluoride (NF3).| |**HUMANRIGHTSANDCOMRELS**|**Human Rights and Community Relations** - the category addresses management of the relationship between businesses and the communities in which they operate, including, but not limited to, management of direct and indirect impacts on core human rights and the treatment of indigenous peoples. More specifically, such management may cover socio-economic community impacts, community engagement, environmental justice, cultivation of local workforces, impact on local businesses, license to operate, and environmental/social impact assessments. The category does not include environmental impacts such as air pollution or waste which, although they may impact the health and safety of members of local communities, are addressed in separate categories.| |**LABORPRACTICES**|**Labor Practices** - the category addresses the company's ability to uphold commonly accepted labor standards in the workplace, including compliance with labor laws and internationally accepted norms and standards. This includes, but is not limited to, ensuring basic human rights related to child labor, forced or bonded labor, exploitative labor, fair wages and overtime pay, and other basic workers' rights. It also includes minimum wage policies and provision of benefits, which may influence how a workforce is attracted, retained, and motivated. The category further addresses a company's relationship with organized labor and freedom of association.| |**MGTOFLEGALANDREGENV**|**Management of the Legal and Regulatory Environment** - the category addresses a company's approach to engaging with regulators in cases where conflicting corporate and public interests may have the potential for long-term adverse direct or indirect environmental and social impacts. The category addresses a company's level of reliance upon regulatory policy or monetary incentives (such as subsidies and taxes), actions to influence industry policy (such as through lobbying), overall reliance on a favorable regulatory environment for business competitiveness, and ability to comply with relevant regulations. It may relate to the alignment of management and investor views of regulatory engagement and compliance at large.| |**MATSOURCINGANDEFF**|**Materials Sourcing and Efficiency** - the category addresses issues related to the resilience of materials supply chains to impacts of climate change and other external environmental and social factors. It captures the impacts of such external factors on operational activity of suppliers, which can further affect availability and pricing of key resources. It addresses a company's ability to manage these risks through product design, manufacturing, and end-of-life management, such as by using of recycled and renewable materials, reducing the use of key materials (dematerialization), maximizing resource efficiency in manufacturing, and making R&D investments in substitute materials. Additionally, companies can manage these issues by screening, selection, monitoring, and engagement with suppliers to ensure their resilience to external risks. It does not address issues associated with environmental and social externalities created by operational activity of individual suppliers, which is covered in a separate category.| |**MATERIALITY**|**Materiality** - this category represents a composite score of all 'material' SASB categories for the given entity. For more information on SASB's Materiality Map, visit [materiality.sasb.org](https://materiality.sasb.org/)| |**PHYIMPACTSOFCLIMATECHG**|**Physical Impacts of Climate Change** - the category addresses the company's ability to manage risks and opportunities associated with direct exposure of its owned or controlled assets and operations to actual or potential physical impacts of climate change. It captures environmental and social issues that may arise from operational disruptions due to physical impacts of climate change. It further captures socioeconomic issues resulting from companies failing to incorporate climate change consideration in products and services sold, such as insurance policies and mortgages. The category relates to the company's ability to adapt to increased frequency and severity of extreme weather, shifting climate, sea level risk, and other expected physical impacts of climate change. Management may involve enhancing resiliency of physical assets and/or surrounding infrastructure as well as incorporation of climate change-related considerations into key business activities (e.g., mortgage and insurance underwriting, planning and development of real estate projects).| |**PDANDLIFECYCLEMGT**|**Product Design and Lifecycle Management** - the category addresses incorporation of environmental, social, and governance (ESG) considerations in characteristics of products and services provided or sold by the company. It includes, but is not limited to, managing the lifecycle impacts of products and services, such as those related to packaging, distribution, use-phase resource intensity, and other environmental and social externalities that may occur during their use-phase or at the end of life. The category captures a company's ability to address customer and societal demand for more sustainable products and services as well as to meet evolving environmental and social regulation. It does not address direct environmental or social impacts of the company's operations nor does it address health and safety risks to consumers from product use, which are covered in other categories.| |**PRODQUALITYANDSFTY**|**Product Quality and Safety** - the category addresses issues involving unintended characteristics of products sold or services provided that may create health or safety risks to end-users. It addresses a company's ability to offer manufactured products and/or services that meet customer expectations with respect to their health and safety characteristics. It includes, but is not limited to, issues involving liability, management of recalls and market withdrawals, product testing, and chemicals/content/ ingredient management in products.| |**SELLPRACANDPRODLABEL**|**Selling Practices and Product Labeling** - the category addresses social issues that may arise from a failure to manage the transparency, accuracy, and comprehensibility of marketing statements, advertising, and labeling of products and services. It includes, but is not limited to, advertising standards and regulations, ethical and responsible marketing practices, misleading or deceptive labeling, as well as discriminatory or predatory selling and lending practices. This may include deceptive or aggressive selling practices in which incentive structures for employees could encourage the sale of products or services that are not in the best interest of customers or clients.| |**SUPPLYCHAINMGT**|**Supply Chain Management** - the category addresses management of environmental, social, and governance (ESG) risks within a company's supply chain. It addresses issues associated with environmental and social externalities created by suppliers through their operational activities. Such issues include, but are not limited to, environmental responsibility, human rights, labor practices, and ethics and corruption. Management may involve screening, selection, monitoring, and engagement with suppliers on their environmental and social impacts. The category does not address the impacts of external factors – such as climate change and other environmental and social factors – on suppliers' operations and/or on the availability and pricing of key resources, which is covered in a separate category.| |**SYSTEMICRISKMGT**|**Systemic Risk Management** - the category addresses the company's contributions to, or management of systemic risks resulting from large-scale weakening or collapse of systems upon which the economy and society depend. This includes financial systems, natural resource systems, and technological systems. It addresses the mechanisms a company has in place to reduce its contributions to systemic risks and to improve safeguards that may mitigate the impacts of systemic failure. For financial institutions, the category also captures the company's ability to absorb shocks arising from financial and economic stress and meet stricter regulatory requirements related to the complexity and interconnectedness of companies in the industry.| |**WASTEANDHZRDMATSMGT**|**Waste and Hazardous Materials Management** - the category addresses environmental issues associated with hazardous and non-hazardous waste generated by companies. It addresses a company's management of solid wastes in manufacturing, agriculture, and other industrial processes. It covers treatment, handling, storage, disposal, and regulatory compliance. The category does not cover emissions to air or wastewater, nor does it cover waste from end-of-life of products, which are addressed in separate categories.| |**WATERANDWASTEWATERMGT**|**Water and Wastewater Management** - the category addresses a company's water use, water consumption, wastewater generation, and other impacts of operations on water resources, which may be influenced by regional differences in the availability and quality of and competition for water resources. More specifically, it addresses management strategies including, but not limited to, water efficiency, intensity, and recycling. Lastly, the category also addresses management of wastewater treatment and discharge, including groundwater and aquifer pollution.|  ### Helper Input **ALL** = Simply gives the ability to request all categories in a single request without having to explicitly list out all 26 in the request. *This is not the same as \"ALLCATEGORIES\" which is a single overall score for the company and returned as default.* 
        String startDate = "2018-12-31"; // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
        String endDate = "2019-12-31"; // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
        String frequency = "D"; // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.    
        String calendar = "FIVEDAY"; // String | Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods.
        try {
            SasbScoresResponse result = apiInstance.getSasbScores(ids, scoreTypes, categories, startDate, endDate, frequency, calendar);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SasbApi#getSasbScores");
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
 **ids** | **List&lt;String&gt;**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may exceed this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **scoreTypes** | **List&lt;String&gt;**| The FactSet Truvalue Score types being requested. Score Types include the Pulse, Insight, Momentum, Article Volume, Category Volume, Dynamic Materiality Score, Adjusted Insight, and Industry Percentile. When left blank all score types will be returned for the requested Id. To specify select scores returned in the response, provide a comma-separated list of the scores using the description below. &lt;p&gt;These scores use the same underlying data and 100-point scale, except for ranks and percentiles. The cognitive computing system behind FactSet&#39;s Truvalue Platform uses natural language processing to interpret semantic content and generate analytics. It does so by applying criteria that are consistent with established sustainability and ESG frameworks, scoring data points on performance using a 0 to 100 scale. A score of 50 represents a neutral impact. Scores above 50 indicate positive performance, and scores below reflect negative performance.&lt;/p&gt;  ### ESG Score Types  |**SASB Category Input**|**Description**| |---|---| |**PULSE**|*Pulse Score*, is a measure of near-term performance changes that highlights opportunities and controversies, enabling real-time monitoring of companies. It focuses on events of the day and provides a responsive signal to alert investors to dynamic moves.| |**INSIGHT**|*Insight Score*, a measure of a company’s longer-term ESG track record, similar to a ratings system. Scores are less sensitive to daily events and reflect the enduring performance record of a company over time. Scores are derived using an exponentially-weighted moving average of the Pulse, defined below, and the half-life of an event’s influence on the overall score is 6 months.| |**MOMENTUM**|*Momentum Score*, measures the trend of a company&#39;s Insight score. It is a unique ESG metric in the industry that gives investors a high-precision view of the trajectory of a company’s ESG performance, relative to peers. It does so by precisely articulating upward or downward movement, relative to that of all others in the universe, making it a measure that enhances quantitative workflows.| |**ART_VOL_TTM**|*Article Volume Score*, measures the information flow or number of articles about a company over the past 12 months.| |**CAT_VOL_TTM**|*Category Volume Score*, returns the total number of times any of the 26 categories received a score over a trailing twelve-month (TTM) period of time.| |**DYNAMIC_MAT**|*Dynamic Materiality Score*, shows the percentage value of data flow by category compared with the total data flow for the organization **(NOT VALID for &#x60;ALLCATEGORIES&#x60; and &#x60;MATERIALITY&#x60; category types).**| |**ADJ_INSIGHT**|*Adjusted Insight*, Measures company ESG performance, generating scores for lower-volume and zero-volume firms by blending company scores with industry medians. **(ONLY Vaild for &#x60;ALLCATEGORIES&#x60; and &#x60;MATERIALITY&#x60; categories). &lt;p&gt;**Adjusted Insight Score &#x3D; (# of articles / 5) x Company Insight Score + ((5 - # of articles) / 5) x Industry (or Sector) Median Insight Score.&lt;/p&gt;| |**IND_PCTL**|*Industry Percentile*, offers context on company Adjusted Insight scores relative to peers in the same SICS Industry. This value is used to establish the textual ESG Rank. **(ONLY Vaild for &#x60;ALLCATEGORIES&#x60; and &#x60;MATERIALITY&#x60; categories).**|  ### Helper Input **ALL**&#x3D; *Ability to fetch all of the \&quot;scoreTypes\&quot; listed above in a simplified query.* This is used by default and removes the need to explitly request each scoreType in the list.  | [optional]
 **categories** | **List&lt;String&gt;**| The SASB Categories requested for the respective scoreType(s). The default value is **ALLCATEGORIES**, which represents all 26 categories in a single overall score. To request a specifc category or list of categories, simply input the category names below.   ### SASB Categories |**SASB Category Inputs**|**Description**| |---|---| |**ALLCATEGORIES**|**All Categories** - this category represents a company&#39;s overall SASB Score for the specific &#39;scoreType&#39;. This value is equal to the cumulative average of all 26 SASB categories for the specific &#39;scoreType&#39;.*Note that category is not available for the Dynamic Materiality &#39;scoreType&#39;. |**ACCESSANDAFFORDABILITY**|**Access and Affordability** - The category addresses a company&#39;s ability to ensure broad access to its products and services, specifically in the context of underserved markets and/or population groups. It includes the management of issues related to universal needs, such as the accessibility and affordability of health care, financial services, utilities , education, and telecommunications.| |**AIRQUALITY**|**Air Quality** - the category addresses management of air quality impacts resulting from stationary (e.g., factories, power plants) and mobile sources (e.g., trucks, delivery vehicles, planes) as well as industrial emissions. Relevant airborne pollutants include, but are not limited to, oxides of nitrogen (NOx), oxides of sulfur (SOx), volatile organic compounds (VOCs), heavy metals, particulate matter, and chlorofluorocarbons. The category does not include GHG emissions, which are addressed in a separate category.| |**BUSINESSETHICS**|**Business Ethics** - the category addresses the company&#39;s approach to managing risks and opportunities surrounding ethical conduct of business, including fraud, corruption, bribery and facilitation payments, fiduciary responsibilities, and other behavior that may have an ethical component. This includes sensitivity to business norms and standards as they shift over time, jurisdiction, and culture. It addresses the company&#39;s ability to provide services that satisfy the highest professional and ethical standards of the industry, which means to avoid conflicts of interest, misrepresentation, bias, and negligence through training employees adequately and implementing policies and procedures to ensure employees provide services free from bias and error.| |**BUSMODELRESILIENCE**|**Business Model Resilience** - the category addresses an industry&#39;s capacity to manage risks and opportunities associated with incorporating social, environmental, and political transitions into long-term business model planning. This includes responsiveness to the transition to a low-carbon and climate-constrained economy, as well as growth and creation of new markets among unserved and underserved socioeconomic populations. The category highlights industries in which evolving environmental and social realities may challenge companies to fundamentally adapt or may put their business models at risk.| |**COMPETITIVEBEHAVIOR**|**Competitive Behavior** - the category covers social issues associated with existence of monopolies, which may include, but are not limited to, excessive prices, poor quality of service, and inefficiencies. It addresses a company&#39;s management of legal and social expectation around monopolistic and anti-competitive practices, including issues related to bargaining power, collusion, price fixing or manipulation, and protection of patents and intellectual property (IP).| |**CRITINCIDENTRISKMGT**|**Critical Incident Risk Management** - the category addresses the company&#39;s use of management systems and scenario planning to identify, understand, and prevent or minimize the occurrence of low-probability, high-impact accidents and emergencies with significant potential environmental and social externalities. It relates to the culture of safety at a company, its relevant safety management systems and technological controls, the potential human, environmental, and social implications of such events occurring, and the long-term effects to an organization, its workers, and society should these events occur.| |**CUSTOMERPRIVACY**|**Customer Privacy** - the category addresses management of risks related to the use of personally identifiable information (PII) and other customer or user data for secondary purposes including but not limited to marketing through affiliates and non-affiliates. The scope of the category includes social issues that may arise from a company&#39;s approach to collecting data, obtaining consent (e.g., opt-in policies), managing user and customer expectations regarding how their data is used, and managing evolving regulation. It excludes social issues arising from cybersecurity risks, which are covered in a separate category.| |**CUSTWELFARE**|**Customer Welfare** - the category addresses customer welfare concerns over issues including, but not limited to, health and nutrition of foods and beverages, antibiotic use in animal production, and management of controlled substances. The category addresses the company&#39;s ability to provide consumers with manufactured products and services that are aligned with societal expectations. It does not include issues directly related to quality and safety malfunctions of manufactured products and services, but instead addresses qualities inherent to the design and delivery of products and services where customer welfare may be in question. The scope of the category also captures companies&#39; ability to prevent counterfeit products.| |**DATASECURITY**|**Data Security** - the category addresses management of risks related to collection, retention, and use of sensitive, confidential, and/or proprietary customer or user data. It includes social issues that may arise from incidents such as data breaches in which personally identifiable information (PII) and other user or customer data may be exposed. It addresses a company&#39;s strategy, policies, and practices related to IT infrastructure, staff training, record keeping, cooperation with law enforcement, and other mechanisms used to ensure security of customer or user data.| |**ECOLOGICALIMPACTS**|**Ecological Impacts** - the category addresses management of the company&#39;s impacts on ecosystems and biodiversity through activities including, but not limited to, land use for exploration, natural resource extraction, and cultivation, as well as project development, construction, and siting. The impacts include, but are not limited to, biodiversity loss, habitat destruction, and deforestation at all stages – planning, land acquisition, permitting, development, operations, and site remediation. The category does not cover impacts of climate change on ecosystems and biodiversity.| |**EMPENGDIVANDINC**|**Employee Engagement Diversity and Inclusion** - the category addresses a company&#39;s ability to ensure that its culture and hiring and promotion practices embrace the building of a diverse and inclusive workforce that reflects the makeup of local talent pools and its customer base. It addresses the issues of discriminatory practices on the bases of race, gender, ethnicity, religion, sexual orientation, and other factors.| |**EMPHEALTHANDSAFETY**|**Employee Health and Safety** - the category addresses a company&#39;s ability to create and maintain a safe and healthy workplace environment that is free of injuries, fatalities, and illness (both chronic and acute). It is traditionally accomplished through implementing safety management plans, developing training requirements for employees and contractors, and conducting regular audits of their own practices as well as those of their subcontractors. The category further captures how companies ensure physical and mental health of workforce through technology, training, corporate culture, regulatory compliance, monitoring and testing, and personal protective equipment.| |**ENERGYMGT**|**Energy Management** - the category addresses environmental impacts associated with energy consumption. It addresses the company&#39;s management of energy in manufacturing and/or for provision of products and services derived from utility providers (grid energy) not owned or controlled by the company. More specifically, it includes management of energy efficiency and intensity, energy mix, as well as grid reliance. Upstream (e.g., suppliers) and downstream (e.g., product use) energy use is not included in the scope.| |**GHGEMISSIONS**|**Greenhouse Gas Emissions** - the category addresses direct (Scope 1) greenhouse gas (GHG) emissions that a company generates through its operations. This includes GHG emissions from stationary (e.g., factories, power plants) and mobile sources (e.g., trucks, delivery vehicles, planes), whether a result of combustion of fuel or non-combusted direct releases during activities such as natural resource extraction, power generation, land use, or biogenic processes. The category further includes management of regulatory risks, environmental compliance, and reputational risks and opportunities, as they related to direct GHG emissions. The seven GHGs covered under the Kyoto Protocol are included within the category— carbon dioxide (CO2 ), methane (CH4), nitrous oxide (N2O), hydrofluorocarbons (HFCs), perfluorocarbons (PFCs), sulfur hexafluoride (SF6), and nitrogen trifluoride (NF3).| |**HUMANRIGHTSANDCOMRELS**|**Human Rights and Community Relations** - the category addresses management of the relationship between businesses and the communities in which they operate, including, but not limited to, management of direct and indirect impacts on core human rights and the treatment of indigenous peoples. More specifically, such management may cover socio-economic community impacts, community engagement, environmental justice, cultivation of local workforces, impact on local businesses, license to operate, and environmental/social impact assessments. The category does not include environmental impacts such as air pollution or waste which, although they may impact the health and safety of members of local communities, are addressed in separate categories.| |**LABORPRACTICES**|**Labor Practices** - the category addresses the company&#39;s ability to uphold commonly accepted labor standards in the workplace, including compliance with labor laws and internationally accepted norms and standards. This includes, but is not limited to, ensuring basic human rights related to child labor, forced or bonded labor, exploitative labor, fair wages and overtime pay, and other basic workers&#39; rights. It also includes minimum wage policies and provision of benefits, which may influence how a workforce is attracted, retained, and motivated. The category further addresses a company&#39;s relationship with organized labor and freedom of association.| |**MGTOFLEGALANDREGENV**|**Management of the Legal and Regulatory Environment** - the category addresses a company&#39;s approach to engaging with regulators in cases where conflicting corporate and public interests may have the potential for long-term adverse direct or indirect environmental and social impacts. The category addresses a company&#39;s level of reliance upon regulatory policy or monetary incentives (such as subsidies and taxes), actions to influence industry policy (such as through lobbying), overall reliance on a favorable regulatory environment for business competitiveness, and ability to comply with relevant regulations. It may relate to the alignment of management and investor views of regulatory engagement and compliance at large.| |**MATSOURCINGANDEFF**|**Materials Sourcing and Efficiency** - the category addresses issues related to the resilience of materials supply chains to impacts of climate change and other external environmental and social factors. It captures the impacts of such external factors on operational activity of suppliers, which can further affect availability and pricing of key resources. It addresses a company&#39;s ability to manage these risks through product design, manufacturing, and end-of-life management, such as by using of recycled and renewable materials, reducing the use of key materials (dematerialization), maximizing resource efficiency in manufacturing, and making R&amp;D investments in substitute materials. Additionally, companies can manage these issues by screening, selection, monitoring, and engagement with suppliers to ensure their resilience to external risks. It does not address issues associated with environmental and social externalities created by operational activity of individual suppliers, which is covered in a separate category.| |**MATERIALITY**|**Materiality** - this category represents a composite score of all &#39;material&#39; SASB categories for the given entity. For more information on SASB&#39;s Materiality Map, visit [materiality.sasb.org](https://materiality.sasb.org/)| |**PHYIMPACTSOFCLIMATECHG**|**Physical Impacts of Climate Change** - the category addresses the company&#39;s ability to manage risks and opportunities associated with direct exposure of its owned or controlled assets and operations to actual or potential physical impacts of climate change. It captures environmental and social issues that may arise from operational disruptions due to physical impacts of climate change. It further captures socioeconomic issues resulting from companies failing to incorporate climate change consideration in products and services sold, such as insurance policies and mortgages. The category relates to the company&#39;s ability to adapt to increased frequency and severity of extreme weather, shifting climate, sea level risk, and other expected physical impacts of climate change. Management may involve enhancing resiliency of physical assets and/or surrounding infrastructure as well as incorporation of climate change-related considerations into key business activities (e.g., mortgage and insurance underwriting, planning and development of real estate projects).| |**PDANDLIFECYCLEMGT**|**Product Design and Lifecycle Management** - the category addresses incorporation of environmental, social, and governance (ESG) considerations in characteristics of products and services provided or sold by the company. It includes, but is not limited to, managing the lifecycle impacts of products and services, such as those related to packaging, distribution, use-phase resource intensity, and other environmental and social externalities that may occur during their use-phase or at the end of life. The category captures a company&#39;s ability to address customer and societal demand for more sustainable products and services as well as to meet evolving environmental and social regulation. It does not address direct environmental or social impacts of the company&#39;s operations nor does it address health and safety risks to consumers from product use, which are covered in other categories.| |**PRODQUALITYANDSFTY**|**Product Quality and Safety** - the category addresses issues involving unintended characteristics of products sold or services provided that may create health or safety risks to end-users. It addresses a company&#39;s ability to offer manufactured products and/or services that meet customer expectations with respect to their health and safety characteristics. It includes, but is not limited to, issues involving liability, management of recalls and market withdrawals, product testing, and chemicals/content/ ingredient management in products.| |**SELLPRACANDPRODLABEL**|**Selling Practices and Product Labeling** - the category addresses social issues that may arise from a failure to manage the transparency, accuracy, and comprehensibility of marketing statements, advertising, and labeling of products and services. It includes, but is not limited to, advertising standards and regulations, ethical and responsible marketing practices, misleading or deceptive labeling, as well as discriminatory or predatory selling and lending practices. This may include deceptive or aggressive selling practices in which incentive structures for employees could encourage the sale of products or services that are not in the best interest of customers or clients.| |**SUPPLYCHAINMGT**|**Supply Chain Management** - the category addresses management of environmental, social, and governance (ESG) risks within a company&#39;s supply chain. It addresses issues associated with environmental and social externalities created by suppliers through their operational activities. Such issues include, but are not limited to, environmental responsibility, human rights, labor practices, and ethics and corruption. Management may involve screening, selection, monitoring, and engagement with suppliers on their environmental and social impacts. The category does not address the impacts of external factors – such as climate change and other environmental and social factors – on suppliers&#39; operations and/or on the availability and pricing of key resources, which is covered in a separate category.| |**SYSTEMICRISKMGT**|**Systemic Risk Management** - the category addresses the company&#39;s contributions to, or management of systemic risks resulting from large-scale weakening or collapse of systems upon which the economy and society depend. This includes financial systems, natural resource systems, and technological systems. It addresses the mechanisms a company has in place to reduce its contributions to systemic risks and to improve safeguards that may mitigate the impacts of systemic failure. For financial institutions, the category also captures the company&#39;s ability to absorb shocks arising from financial and economic stress and meet stricter regulatory requirements related to the complexity and interconnectedness of companies in the industry.| |**WASTEANDHZRDMATSMGT**|**Waste and Hazardous Materials Management** - the category addresses environmental issues associated with hazardous and non-hazardous waste generated by companies. It addresses a company&#39;s management of solid wastes in manufacturing, agriculture, and other industrial processes. It covers treatment, handling, storage, disposal, and regulatory compliance. The category does not cover emissions to air or wastewater, nor does it cover waste from end-of-life of products, which are addressed in separate categories.| |**WATERANDWASTEWATERMGT**|**Water and Wastewater Management** - the category addresses a company&#39;s water use, water consumption, wastewater generation, and other impacts of operations on water resources, which may be influenced by regional differences in the availability and quality of and competition for water resources. More specifically, it addresses management strategies including, but not limited to, water efficiency, intensity, and recycling. Lastly, the category also addresses management of wastewater treatment and discharge, including groundwater and aquifer pollution.|  ### Helper Input **ALL** &#x3D; Simply gives the ability to request all categories in a single request without having to explicitly list out all 26 in the request. *This is not the same as \&quot;ALLCATEGORIES\&quot; which is a single overall score for the company and returned as default.*  | [optional]
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.     | [optional] [default to D] [enum: D, W, M, CY, ]
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. | [optional] [default to SEVENDAY] [enum: FIVEDAY, SEVENDAY, LOCAL]

### Return type

[**SasbScoresResponse**](SasbScoresResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The SASB Scores response object, including the Pulse Score, Insight Score, Momentum Score, Category Volume, Dynamic Materiality Score and other meta data. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getSasbScoresAll

> SasbScoresAllResponse getSasbScoresAll(ids, scoreTypes, startDate, endDate, frequency, calendar)

Gets a flat key value array of scores for named categories of the input scoreType(s).

**Retrieves a flat array of all categories for the requested scoreType and ids. Unlike the /sasb-scores endpoint the format of the response returns category names as part of the key value.**<p> Gets values for all categories for the selected score type(s) for the requested identifier(s). FactSet Truvalue Labs SASB Scores provides short-term, long-term, and momentum scores that are generated for 26 ESG categories defined by the Sustainability Accounting Standards Board. ESG Ranks are not supported in this Endpoint.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetESG.ApiClient;
import com.factset.sdk.FactSetESG.ApiException;
import com.factset.sdk.FactSetESG.Configuration;
import com.factset.sdk.FactSetESG.auth.*;
import com.factset.sdk.FactSetESG.models.*;
import com.factset.sdk.FactSetESG.api.SasbApi;

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

        SasbApi apiInstance = new SasbApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may exceed this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        java.util.List<String> scoreTypes = Arrays.asList(); // java.util.List<String> | The FactSet Truvalue Score types being requested. Score Types include the Pulse, Insight, Momentum, Article Volume, Category Volume, Dynamic Materiality Score, Adjusted Insight, and Industry Percentile. When left blank all score types will be returned for the requested Id. To specify select scores returned in the response, provide a comma-separated list of the scores using the description below. <p>These scores use the same underlying data and 100-point scale, except for ranks and percentiles. The cognitive computing system behind FactSet's Truvalue Platform uses natural language processing to interpret semantic content and generate analytics. It does so by applying criteria that are consistent with established sustainability and ESG frameworks, scoring data points on performance using a 0 to 100 scale. A score of 50 represents a neutral impact. Scores above 50 indicate positive performance, and scores below reflect negative performance.</p>  ### ESG Score Types  |**SASB Category Input**|**Description**| |---|---| |**PULSE**|*Pulse Score*, is a measure of near-term performance changes that highlights opportunities and controversies, enabling real-time monitoring of companies. It focuses on events of the day and provides a responsive signal to alert investors to dynamic moves.| |**INSIGHT**|*Insight Score*, a measure of a company’s longer-term ESG track record, similar to a ratings system. Scores are less sensitive to daily events and reflect the enduring performance record of a company over time. Scores are derived using an exponentially-weighted moving average of the Pulse, defined below, and the half-life of an event’s influence on the overall score is 6 months.| |**MOMENTUM**|*Momentum Score*, measures the trend of a company's Insight score. It is a unique ESG metric in the industry that gives investors a high-precision view of the trajectory of a company’s ESG performance, relative to peers. It does so by precisely articulating upward or downward movement, relative to that of all others in the universe, making it a measure that enhances quantitative workflows.| |**ART_VOL_TTM**|*Article Volume Score*, measures the information flow or number of articles about a company over the past 12 months.| |**CAT_VOL_TTM**|*Category Volume Score*, returns the total number of times any of the 26 categories received a score over a trailing twelve-month (TTM) period of time.| |**DYNAMIC_MAT**|*Dynamic Materiality Score*, shows the percentage value of data flow by category compared with the total data flow for the organization **(NOT VALID for `ALLCATEGORIES` and `MATERIALITY` category types).**| |**ADJ_INSIGHT**|*Adjusted Insight*, Measures company ESG performance, generating scores for lower-volume and zero-volume firms by blending company scores with industry medians. **(ONLY Vaild for `ALLCATEGORIES` and `MATERIALITY` categories). <p>**Adjusted Insight Score = (# of articles / 5) x Company Insight Score + ((5 - # of articles) / 5) x Industry (or Sector) Median Insight Score.</p>| |**IND_PCTL**|*Industry Percentile*, offers context on company Adjusted Insight scores relative to peers in the same SICS Industry. This value is used to establish the textual ESG Rank. **(ONLY Vaild for `ALLCATEGORIES` and `MATERIALITY` categories).**|  ### Helper Input **ALL**= *Ability to fetch all of the \"scoreTypes\" listed above in a simplified query.* This is used by default and removes the need to explitly request each scoreType in the list. 
        String startDate = "2018-12-31"; // String | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
        String endDate = "2019-12-31"; // String | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period. 
        String frequency = "D"; // String | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.    
        String calendar = "FIVEDAY"; // String | Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods.
        try {
            SasbScoresAllResponse result = apiInstance.getSasbScoresAll(ids, scoreTypes, startDate, endDate, frequency, calendar);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SasbApi#getSasbScoresAll");
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
 **ids** | **List&lt;String&gt;**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may exceed this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **scoreTypes** | **List&lt;String&gt;**| The FactSet Truvalue Score types being requested. Score Types include the Pulse, Insight, Momentum, Article Volume, Category Volume, Dynamic Materiality Score, Adjusted Insight, and Industry Percentile. When left blank all score types will be returned for the requested Id. To specify select scores returned in the response, provide a comma-separated list of the scores using the description below. &lt;p&gt;These scores use the same underlying data and 100-point scale, except for ranks and percentiles. The cognitive computing system behind FactSet&#39;s Truvalue Platform uses natural language processing to interpret semantic content and generate analytics. It does so by applying criteria that are consistent with established sustainability and ESG frameworks, scoring data points on performance using a 0 to 100 scale. A score of 50 represents a neutral impact. Scores above 50 indicate positive performance, and scores below reflect negative performance.&lt;/p&gt;  ### ESG Score Types  |**SASB Category Input**|**Description**| |---|---| |**PULSE**|*Pulse Score*, is a measure of near-term performance changes that highlights opportunities and controversies, enabling real-time monitoring of companies. It focuses on events of the day and provides a responsive signal to alert investors to dynamic moves.| |**INSIGHT**|*Insight Score*, a measure of a company’s longer-term ESG track record, similar to a ratings system. Scores are less sensitive to daily events and reflect the enduring performance record of a company over time. Scores are derived using an exponentially-weighted moving average of the Pulse, defined below, and the half-life of an event’s influence on the overall score is 6 months.| |**MOMENTUM**|*Momentum Score*, measures the trend of a company&#39;s Insight score. It is a unique ESG metric in the industry that gives investors a high-precision view of the trajectory of a company’s ESG performance, relative to peers. It does so by precisely articulating upward or downward movement, relative to that of all others in the universe, making it a measure that enhances quantitative workflows.| |**ART_VOL_TTM**|*Article Volume Score*, measures the information flow or number of articles about a company over the past 12 months.| |**CAT_VOL_TTM**|*Category Volume Score*, returns the total number of times any of the 26 categories received a score over a trailing twelve-month (TTM) period of time.| |**DYNAMIC_MAT**|*Dynamic Materiality Score*, shows the percentage value of data flow by category compared with the total data flow for the organization **(NOT VALID for &#x60;ALLCATEGORIES&#x60; and &#x60;MATERIALITY&#x60; category types).**| |**ADJ_INSIGHT**|*Adjusted Insight*, Measures company ESG performance, generating scores for lower-volume and zero-volume firms by blending company scores with industry medians. **(ONLY Vaild for &#x60;ALLCATEGORIES&#x60; and &#x60;MATERIALITY&#x60; categories). &lt;p&gt;**Adjusted Insight Score &#x3D; (# of articles / 5) x Company Insight Score + ((5 - # of articles) / 5) x Industry (or Sector) Median Insight Score.&lt;/p&gt;| |**IND_PCTL**|*Industry Percentile*, offers context on company Adjusted Insight scores relative to peers in the same SICS Industry. This value is used to establish the textual ESG Rank. **(ONLY Vaild for &#x60;ALLCATEGORIES&#x60; and &#x60;MATERIALITY&#x60; categories).**|  ### Helper Input **ALL**&#x3D; *Ability to fetch all of the \&quot;scoreTypes\&quot; listed above in a simplified query.* This is used by default and removes the need to explitly request each scoreType in the list.  | [optional]
 **startDate** | **String**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **endDate** | **String**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **frequency** | **String**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.     | [optional] [default to D] [enum: D, W, M, CY, ]
 **calendar** | **String**| Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. | [optional] [default to SEVENDAY] [enum: FIVEDAY, SEVENDAY, LOCAL]

### Return type

[**SasbScoresAllResponse**](SasbScoresAllResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The SASB Scores All Response Object, including the Pulse, Insight, Momentum, Article Volume, Category Volume, Dynamic Materiality, Adjusted Insight, and Industry Percentile scores for all categories. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getSasbScoresAllPost

> SasbScoresAllResponse getSasbScoresAllPost(sasbScoresAllRequest)

Gets a flat key value array of scores for named categories of the input score type(s).

**Retrieves a flat array of all categories for the requested scoreType and ids. Unlike the /sasb-scores endpoint the format of the response returns category names as part of the key value.**<p> Gets values for all categories for the selected score type(s) for the requested identifier(s). FactSet Truvalue Labs SASB Scores provides short-term, long-term, and momentum scores that are generated for 26 ESG categories defined by the Sustainability Accounting Standards Board. ESG Ranks are not supported in this Endpoint.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetESG.ApiClient;
import com.factset.sdk.FactSetESG.ApiException;
import com.factset.sdk.FactSetESG.Configuration;
import com.factset.sdk.FactSetESG.auth.*;
import com.factset.sdk.FactSetESG.models.*;
import com.factset.sdk.FactSetESG.api.SasbApi;

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

        SasbApi apiInstance = new SasbApi(defaultClient);
        SasbScoresAllRequest sasbScoresAllRequest = new SasbScoresAllRequest(); // SasbScoresAllRequest | The SASB Scores request body, allowing the user to specify a list of ids, SASB Score Items, SASB categories, date range, and frequency.
        try {
            SasbScoresAllResponse result = apiInstance.getSasbScoresAllPost(sasbScoresAllRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SasbApi#getSasbScoresAllPost");
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
 **sasbScoresAllRequest** | [**SasbScoresAllRequest**](SasbScoresAllRequest.md)| The SASB Scores request body, allowing the user to specify a list of ids, SASB Score Items, SASB categories, date range, and frequency. |

### Return type

[**SasbScoresAllResponse**](SasbScoresAllResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The SASB Scores All Response Object, including the Pulse, Insight, Momentum, Article Volume, Category Volume, Dynamic Materiality, Adjusted Insight, and Industry Percentile scores for all categories. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getSasbScoresPost

> SasbScoresResponse getSasbScoresPost(sasbScoresRequest)

For a large list of ids, gets short-term, long-term, and momentum scores based on the 26 ESG categories defined by the Sustainability Accounting Standards Board (SASB).

FactSet Truvalue Labs SASB Scores provides short-term, long-term, and momentum scores that are generated for 26 ESG categories defined by the Sustainability Accounting Standards Board. FactSet Truvalue also calculates a custom overall score called ALLCATEGORIES, can indicate data volume flow, and the Dynamic Materiality of that data flow.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetESG.ApiClient;
import com.factset.sdk.FactSetESG.ApiException;
import com.factset.sdk.FactSetESG.Configuration;
import com.factset.sdk.FactSetESG.auth.*;
import com.factset.sdk.FactSetESG.models.*;
import com.factset.sdk.FactSetESG.api.SasbApi;

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

        SasbApi apiInstance = new SasbApi(defaultClient);
        SasbScoresRequest sasbScoresRequest = new SasbScoresRequest(); // SasbScoresRequest | The SASB Scores request body, allowing the user to specify a list of ids, SASB Score Items, SASB categories, date range, and frequency.
        try {
            SasbScoresResponse result = apiInstance.getSasbScoresPost(sasbScoresRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SasbApi#getSasbScoresPost");
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
 **sasbScoresRequest** | [**SasbScoresRequest**](SasbScoresRequest.md)| The SASB Scores request body, allowing the user to specify a list of ids, SASB Score Items, SASB categories, date range, and frequency. |

### Return type

[**SasbScoresResponse**](SasbScoresResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The SASB Scores response object, including the Pulse Score, Insight Score, Momentum Score, Category Volume, Dynamic Materiality Score and other meta data. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


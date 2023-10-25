# factsetesg.SFDRApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSfdrPai**](SFDRApi.md#getSfdrPai) | **GET** /factset-esg/v1/sfdr-pai | Gets Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting
[**getSfdrPaiForList**](SFDRApi.md#getSfdrPaiForList) | **POST** /factset-esg/v1/sfdr-pai | Gets Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting



## getSfdrPai

> SfdrPaiResponse getSfdrPai(ids, opts)

Gets Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting

SFDR Principle Adverse Impact (PAI) data is built specifically to support compliant Sustainable Finance Disclosure Regulation (SFDR) reporting. FactSet collects PAI data items from publicly available company-reported information and FactSet databases, such as FactSet Fundamentals, FactSet RBICS with Revenue and FactSet People, which are also based on company-disclosures. FactSet uses Truvalue Labs SASB Spotlights for supplemental OECD &amp; UNGC violation checks where company reporting is sparse.  

### Example

```javascript
const { ApiClient, SFDRApi } = require('@factset/sdk-factsetesg');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new SFDRApi();
const ids = ["AAPL-USA"]; // [String] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  1500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total  length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
const opts = {
  'feelback': false, // Boolean | This parameter would return the latest PAI data based on the indicators or the subtopics requested. This parameter should not be used in conjuction with `fiscalPeriodStart` and `fiscalPeriodEnd`  
  'fiscalPeriodStart': 2020, // String | Fiscal period start is expressed in YYYY formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint. 
  'fiscalPeriodEnd': 2021, // String | Fiscal period end is expressed in YYYY formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint. 
  'indicators': ["Water","HumanRights"], // [String] | The indicators are the Principal Adverse Impact (PAI) metrics which consists of General, Mandatory and Additional indicators which supports the SFDR reporting.   The General indicators data can retrieved by providing the `GL001` and `GL002` subTopic codes as input. Please refer to the attached documentation for the full list of subtopics codes and their mapping with the indicators.  The data can also be requested for individual sub topic codes in addition to the indicators mentioned below -    |**SFDR PAI Indicators**|**Description**| |---|---| |**MandatoryIndicators**| Mandatory indicators are the indicators which must be reported under the EU Sustainable Finance Disclosure Regulation (SFDR).| |**AdditionalIndicators**| These are additional environmental and social indicators as mentioned in additional tables as provided in the Annex 1 table in the SFDR RTS report.| |**GHGEmissions**| This mandatory indicator includes metrics related to greenhouse emissions such as - Scope 1, 2, and 3 emissions, footprint and intensity and energy consumption from non-renewable and high climate sectors.| |**Biodiversity**| This mandatory indicator includes metrics pertaining to biodiversity and a company's impacts on biodiversity-sensitive areas.| |**Water**| This mandatory indicator includes data relating to emissions to water as made by the companies.| |**Waste**| This mandatory indicator includes data relating to hazardous waste as generated by the companies.| |**SocialEmployeeMatters**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**Emissions**| This additional indicator includes metrics related to air pollutants, inorganic pollutants and ozone depleting substance. | |**EnergyPerformance**| This additional indicator includes metrics related to various sources of non-renewable energy as used by the companies. | |**WaterWasteMaterialEmissions**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**AdditionalEmployeeMatters**| This additional indicator includes metrics related to workplace discrimination and safety, whistleblower mechanism and supplier code of conduct.| |**HumanRights**| This additional indicator includes metrics related to both policies and performance of a company in the areas of human rights, forced labor and human trafficking.| |**AntiCorruptionAntiBribery**| This additional indicator includes data related to company violations of anti-corruption and anti-bribery laws, and resulting fines.| 
  'calculation': true // Boolean | This parameter would return the PAI data based on the input provided. All the data for indicators or subtopics requested are returned when the input is `true` and the SFDR required metrics are only returned when the input is`false` 
};

// Call api endpoint
apiInstance.getSfdrPai(ids, opts).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

```


### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**[String]**](String.md)| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total  length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **feelback** | **Boolean**| This parameter would return the latest PAI data based on the indicators or the subtopics requested. This parameter should not be used in conjuction with &#x60;fiscalPeriodStart&#x60; and &#x60;fiscalPeriodEnd&#x60;   | [optional] [default to false]
 **fiscalPeriodStart** | **String**| Fiscal period start is expressed in YYYY formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **fiscalPeriodEnd** | **String**| Fiscal period end is expressed in YYYY formats. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **indicators** | [**[String]**](String.md)| The indicators are the Principal Adverse Impact (PAI) metrics which consists of General, Mandatory and Additional indicators which supports the SFDR reporting.   The General indicators data can retrieved by providing the &#x60;GL001&#x60; and &#x60;GL002&#x60; subTopic codes as input. Please refer to the attached documentation for the full list of subtopics codes and their mapping with the indicators.  The data can also be requested for individual sub topic codes in addition to the indicators mentioned below -    |**SFDR PAI Indicators**|**Description**| |---|---| |**MandatoryIndicators**| Mandatory indicators are the indicators which must be reported under the EU Sustainable Finance Disclosure Regulation (SFDR).| |**AdditionalIndicators**| These are additional environmental and social indicators as mentioned in additional tables as provided in the Annex 1 table in the SFDR RTS report.| |**GHGEmissions**| This mandatory indicator includes metrics related to greenhouse emissions such as - Scope 1, 2, and 3 emissions, footprint and intensity and energy consumption from non-renewable and high climate sectors.| |**Biodiversity**| This mandatory indicator includes metrics pertaining to biodiversity and a company&#39;s impacts on biodiversity-sensitive areas.| |**Water**| This mandatory indicator includes data relating to emissions to water as made by the companies.| |**Waste**| This mandatory indicator includes data relating to hazardous waste as generated by the companies.| |**SocialEmployeeMatters**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**Emissions**| This additional indicator includes metrics related to air pollutants, inorganic pollutants and ozone depleting substance. | |**EnergyPerformance**| This additional indicator includes metrics related to various sources of non-renewable energy as used by the companies. | |**WaterWasteMaterialEmissions**| This mandatory indicator includes employee-related metrics like gender diversity, pay gap and social-related metrics like violation of UNGC/OECD principles and exposure to controversial weapons.| |**AdditionalEmployeeMatters**| This additional indicator includes metrics related to workplace discrimination and safety, whistleblower mechanism and supplier code of conduct.| |**HumanRights**| This additional indicator includes metrics related to both policies and performance of a company in the areas of human rights, forced labor and human trafficking.| |**AntiCorruptionAntiBribery**| This additional indicator includes data related to company violations of anti-corruption and anti-bribery laws, and resulting fines.|  | [optional] 
 **calculation** | **Boolean**| This parameter would return the PAI data based on the input provided. All the data for indicators or subtopics requested are returned when the input is &#x60;true&#x60; and the SFDR required metrics are only returned when the input is&#x60;false&#x60;  | [optional] [default to true]

### Return type

[**SfdrPaiResponse**](SfdrPaiResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSfdrPaiForList

> SfdrPaiResponse getSfdrPaiForList(sfdrPaiRequest)

Gets Principle Adverse Impact (PAI) data to support compliant SFDR Sustainable Finance Disclosure Regulation (SFDR) reporting

SFDR Principle Adverse Impact (PAI) data is built specifically to support compliant Sustainable Finance Disclosure Regulation (SFDR) reporting. FactSet collects PAI data items from publicly available company-reported information and FactSet databases, such as FactSet Fundamentals, FactSet RBICS with Revenue and FactSet People, which are also based on company-disclosures. FactSet uses Truvalue Labs SASB Spotlights for supplemental OECD &amp; UNGC violation checks where company reporting is sparse. 

### Example

```javascript
const { ApiClient, SFDRApi } = require('@factset/sdk-factsetesg');
const { ConfidentialClient } = require('@factset/sdk-utils');

const apiClient = ApiClient.instance;

// Examples for each supported authentication method are below,
// choose one that satisfies your use case.

// (Preferred) OAuth 2.0: FactSetOAuth2
// See https://github.com/FactSet/enterprise-sdk#oauth-20
// for information on how to create the app-config.json file
//
// The confidential client instance should be reused in production environments.
// See https://github.com/FactSet/enterprise-sdk-utils-typescript#authentication
// for more information on using the ConfidentialClient class
apiClient.factsetOauth2Client = new ConfidentialClient('/path/to/app-config.json');

// Basic authentication: FactSetApiKey
// See https://github.com/FactSet/enterprise-sdk#api-key
// for information how to create an API key
// const FactSetApiKey = apiClient.authentications['FactSetApiKey'];
// FactSetApiKey.username = 'USERNAME-SERIAL';
// FactSetApiKey.password = 'API-KEY';

const apiInstance = new SFDRApi();
const sfdrPaiRequest = new factsetesg.SfdrPaiRequest(); // SfdrPaiRequest | The request body, allows the user to specify a list of ids, date range(Annual), and PAI Indicators

// Call api endpoint
apiInstance.getSfdrPaiForList(sfdrPaiRequest).then(
  data => {

    console.log('API called successfully. Returned data:');
    console.log(data);
  },
  error => {
    console.error(error);
  },
);

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


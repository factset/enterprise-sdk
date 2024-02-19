# openfactsetpartnersdocuments.OzmosiApi

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

> BiomarkersResponse getOzmosiBiomarkersDaily(opts)

Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Biomarkers Details from Open:FactSet Partner - Ozmosi.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OzmosiApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new OzmosiApi();
const opts = {
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result.
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
  'clinicalTrialId': NCT03037385_037, // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
  'biomarkerName': EGFR, // String | This parameter specifies the abbreviated name of any patient biomarkers being targeted for research in the trial.
  'biomarkerFullName': epidermal growth factor receptor // String | Specifies the full name of the biomarker.
};

// Call api endpoint
apiInstance.getOzmosiBiomarkersDaily(opts).then(
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
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
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


## getOzmosiClinicalTrialsDaily

> DataResponse getOzmosiClinicalTrialsDaily(opts)

Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Clinical Trial Details from Open:FactSet Partner - Ozmosi.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OzmosiApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new OzmosiApi();
const opts = {
  'sort': "'-startDate'", // String | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used.
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result Default value 20 and Maximum value 300
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
  'clinicalTrialId': NCT03037385_037, // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
  'officialTitle': A Phase 1/2 Study of the Highly-selective RET Inhibitor, BLU-667, in Patients With Thyroid Cancer, Non-Small Cell Lung Cancer (NSCLC) and Other Advanced Solid Tumors, // String | Specifies full scientific title of a trial.
  'trialId': NCT03037385, // String | This parameter specifies ID of the trial assigned by the trial registry.
  'date': 2022-10-13 00:00:00 // Date | Specifies the timestamp of each version of a trial in YYYY-MM-DD format.
};

// Call api endpoint
apiInstance.getOzmosiClinicalTrialsDaily(opts).then(
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
 **sort** | **String**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. | [optional] [default to &#39;-startDate&#39;]
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result Default value 20 and Maximum value 300 | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **clinicalTrialId** | **String**| This parameter specifies Ozmosi unique ID for each historical version of a trial. | [optional] 
 **officialTitle** | **String**| Specifies full scientific title of a trial. | [optional] 
 **trialId** | **String**| This parameter specifies ID of the trial assigned by the trial registry. | [optional] 
 **date** | **Date**| Specifies the timestamp of each version of a trial in YYYY-MM-DD format. | [optional] 

### Return type

[**DataResponse**](DataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOzmosiClinicalTrialsHistory

> FullHistoryResponse getOzmosiClinicalTrialsHistory(opts)

Returns the history files from Open:FactSet Partner - Ozmosi

Returns the historical files from June 23rd, 2005 to current date.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OzmosiApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new OzmosiApi();
const opts = {
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result.
  'paginationOffset': 0 // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
};

// Call api endpoint
apiInstance.getOzmosiClinicalTrialsHistory(opts).then(
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
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]

### Return type

[**FullHistoryResponse**](FullHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getOzmosiCollaboratorsDaily

> CollaboratorsResponse getOzmosiCollaboratorsDaily(opts)

Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Collaborators Details from Open:FactSet Partner - Ozmosi.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OzmosiApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new OzmosiApi();
const opts = {
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result.
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
  'clinicalTrialId': NCT03037385_037, // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
  'beamCollaboratorsName': Inventivan Pharma, // String | It specifies the cleaned name of the collaborator.
  'beamCollaboratorsTicker': SSNLF // String | It specifies the Stock ticker for collaborator.
};

// Call api endpoint
apiInstance.getOzmosiCollaboratorsDaily(opts).then(
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
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
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


## getOzmosiDiseasesDaily

> DiseasesResponse getOzmosiDiseasesDaily(opts)

Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.

Returns the daily files of Diseases Details from Open:FactSet Partner- Ozmosi.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OzmosiApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new OzmosiApi();
const opts = {
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result.
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
  'clinicalTrialId': NCT03037385_037, // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
  'diseaseArea': Inflammation, // String | Specifies the cleaned disease name.
  'subTherapyArea': Inflammation, // String | Specifies the Sub Therapy Area of the disease.
  'therapyArea': Musculoskeletal // String | Specifies the Therapy Area of the disease.
};

// Call api endpoint
apiInstance.getOzmosiDiseasesDaily(opts).then(
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
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
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


## getOzmosiEndpointsDaily

> BeamEndpointsResponse getOzmosiEndpointsDaily(opts)

Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Beam Endpoints Details from Open:FactSet Partner - Ozmosi.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OzmosiApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new OzmosiApi();
const opts = {
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result.
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
  'clinicalTrialId': NCT03037385_037, // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
  'name': OS, // String | This parameter specifies cleaned and standardized abbreviations of primary endpoints that are common or of key interest.
  'fullForm': Overall Survival // String | This parameter specifies cleaned and standardized full names of primary endpoints that are common or of key interest.
};

// Call api endpoint
apiInstance.getOzmosiEndpointsDaily(opts).then(
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
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
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


## getOzmosiInterventionDaily

> InterventionResponse getOzmosiInterventionDaily(opts)

Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Intervention details from Open:FactSet Partner - Ozmosi.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OzmosiApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new OzmosiApi();
const opts = {
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result.
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
  'clinicalTrialId': NCT03037385_037, // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
  'beamInterventionName': Etelcalcetide, // String | This parameter specifies the name of intervention applied.
  'beamInterventionDesc': Cinacalcet oral once-daily // String | It specifies the description of intervention applied.
};

// Call api endpoint
apiInstance.getOzmosiInterventionDaily(opts).then(
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
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
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


## getOzmosiOrangepurpleDaily

> OrangePurpleResponse getOzmosiOrangepurpleDaily(opts)

Returns the daily files of OrangePurple Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of OrangePurple Details from Open:FaStset Partner - Ozmosi.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OzmosiApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new OzmosiApi();
const opts = {
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result.
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
  'clinicalTrialId': NCT03037385_037, // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
  'beamOpNovelDrug': EDP-305, // String | This parameter identifies if the trial includes a drug that is not approved by the FDA.
  'beamOpNovelTarget': tricalcium // String | It lists the unapproved drug.
};

// Call api endpoint
apiInstance.getOzmosiOrangepurpleDaily(opts).then(
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
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
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


## getOzmosiPrimaryoutcomeDaily

> PrimaryOutcomeResponse getOzmosiPrimaryoutcomeDaily(opts)

Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of PrimaryOutcome Details from Open:FactSet Partner - Ozmosi.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OzmosiApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new OzmosiApi();
const opts = {
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result.
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
  'clinicalTrialId': NCT03037385_037, // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
  'primaryOutcomeMeasure': Percentage of Participants Achieving an American College of Rheumatology (ACR) 50 Response at Week 12., // String | It specifies the description of each primary outcome measure (or for observational studies, specific key measurement[s] or observation[s] used to describe patterns of diseases or traits or associations with exposures, risk factors or treatment).
  'primaryOutcomeDesc': Week 12 // String | It describes the metric used to characterize the specific primary outcome measure, if not included in the primary outcome measure title.
};

// Call api endpoint
apiInstance.getOzmosiPrimaryoutcomeDaily(opts).then(
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
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
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


## getOzmosiSponsorsDaily

> SponsorsResponse getOzmosiSponsorsDaily(opts)

Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.

Returns the daily files of Sponsors Details from Open:FactSet Partner - Ozmosi.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```javascript
const { ApiClient, OzmosiApi } = require('@factset/sdk-openfactsetpartnersdocuments');
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

const apiInstance = new OzmosiApi();
const opts = {
  'paginationLimit': 20, // Number | Specifies the maximum number of results to return per result.
  'paginationOffset': 0, // Number | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
  'clinicalTrialId': NCT03037385_037, // String | This parameter specifies Ozmosi unique ID for each historical version of a trial.
  'beamSponsorsName': AtriCure, // String | It specifies the cleaned name of the Sponsor.
  'beamSponsorsTicker': ATRC // String | It specifies the stock ticker for primary sponsor.
};

// Call api endpoint
apiInstance.getOzmosiSponsorsDaily(opts).then(
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
 **paginationLimit** | **Number**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Number**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
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


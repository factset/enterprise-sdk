# factsetconcordance.EntityMatchApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityMatch**](EntityMatchApi.md#getEntityMatch) | **GET** /factset-concordance/v2/entity-match | Get Entity Candidates and Matches for a single name and attributes.
[**getEntityMatchForList**](EntityMatchApi.md#getEntityMatchForList) | **POST** /factset-concordance/v2/entity-match | Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.



## getEntityMatch

> EntityMatchesResponse getEntityMatch(name, opts)

Get Entity Candidates and Matches for a single name and attributes.

Finds the best candidate entities matching the given entity name. Additional attributes can be supplied to narrow the search, such as State, URL, and Entity Types. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names. Otherwise, use the \&quot;Entity Match - Bulk\&quot; workflow to submit larger universes of names to be concorded via a file.&lt;/p&gt;&lt;p&gt; 

### Example

```javascript
const { ApiClient, EntityMatchApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new EntityMatchApi();
const name = FactSet; // String | Name of Entity to match.
const opts = {
  'country': US, // String | ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).
  'state': CT, // String | Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported.
  'url': "url_example", // String | URL corresponding to the entity name that is used when evaluating candidates for a match.
  'includeEntityType': ["PUB"], // [String] | Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |ABS|Asset-Backed||MED|Broadcast Call Sign|   |BAS|Business Association (JP)||MUC|Mutual Fd-Closed End|   |CAC|Consolidated Accounting||MUE|Mutual Fd-ETF|   |CMD|Commodity||MUT|Mutual Fd-Open End|   |COL|College/University||NPO|Non-Profit Organization|   |CUR|Currency||OPD|Operating Division|   |ESP|Emp Stk Ownership Plan||OTH|Other|   |EXT|Extinct||PEF|Pension Fund|   |FAF|Family of Fds (VC/Pvt EQ)||PRO|Real Property|   |FND|Foundation/Endowment||PUB|Public Company|   |FNS|Financing Subsidiary/SPE||PVF|Private Eq Fd/Alt Invt|   |FRX|ForEx||PVT|Private Company|   |GOV|Government||SOV|Sovereign Wealth Fund|   |HED|Hedge Fund||SUB|Subsidiary|   |HOL|Holding Company||TRU|Trust/Trustee|   |IDX|Index||UMB|Umbrella Fund|   |VEN|Venture Capital Fund||JVT|Joint Venture| 
  'excludeEntityType': ["EXT"], // [String] | Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Candidates with an entity type specified will *not* be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---| |ABS|Asset-Backed||MED|Broadcast Call Sign| |BAS|Business Association (JP)||MUC|Mutual Fd-Closed End| |CAC|Consolidated Accounting||MUE|Mutual Fd-ETF| |CMD|Commodity||MUT|Mutual Fd-Open End| |COL|College/University||NPO|Non-Profit Organization| |CUR|Currency||OPD|Operating Division| |ESP|Emp Stk Ownership Plan||OTH|Other| |EXT|Extinct||PEF|Pension Fund| |FAF|Family of Fds (VC/Pvt EQ)||PRO|Real Property| |FND|Foundation/Endowment||PUB|Public Company| |FNS|Financing Subsidiary/SPE||PVF|Private Eq Fd/Alt Invt| |FRX|ForEx||PVT|Private Company| |GOV|Government||SOV|Sovereign Wealth Fund| |HED|Hedge Fund||SUB|Subsidiary| |HOL|Holding Company||TRU|Trust/Trustee| |IDX|Index||UMB|Umbrella Fund| |VEN|Venture Capital Fund||JVT|Joint Venture| 
  'includeEntitySubType': ["PR"], // [String] | Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description|   |---|---|---|---|   |AR|Arbitrage|IC|Investment Company|   |BM|Bank Investment Division|IN|Insurance Company|   |BR|Broker|MF|Mutual Fund Manager|   |CP|Corporate|ML|Master Ltd Part|   |CU|Custodial|MM|Market Maker|   |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt|   |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager|   |FO|Foundation/Endowment Manager|PP|Real Estate Manager|   |FS|Fund Distributor|RE|Research Firm|   |FU|Fund|SB|Subsidiary Branch|   |FY|Family Office|ST|Stock Borrowing/Lending|   |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager|   |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity|   |IA|Investment Adviser|   |IB|Investment Banking| 
  'excludeEntitySubType': ["HF"], // [String] | Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will not be considered for the final match result. Multiple types can be entered separated by commas. |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description| |---|---|---|---| |AR|Arbitrage|IC|Investment Company| |BM|Bank Investment Division|IN|Insurance Company| |BR|Broker|MF|Mutual Fund Manager| |CP|Corporate|ML|Master Ltd Part| |CU|Custodial|MM|Market Maker| |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt| |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager| |FO|Foundation/Endowment Manager|PP|Real Estate Manager| |FS|Fund Distributor|RE|Research Firm| |FU|Fund|SB|Subsidiary Branch| |FY|Family Office|ST|Stock Borrowing/Lending| |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager| |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity| |IA|Investment Adviser| |IB|Investment Banking| 
  'includeParent': false, // Boolean | Flag to include parent entities in the list of candidates. This parameter does not influence the match result.
  'bbgFigi': BBG009S39JY5, // String | Input identifiers for the Bloomberg Listing/Regional/Security ID symbol type.
  'bbgTicker': BloombergId, // String | Input identifiers for the Bloomberg Listing and Regional Ticker symbol Type.
  'bic': BICCode, // String | Input identifiers for the BICCode - Bank Indentification Code symbol Type.
  'cik': CIK, // String | Input identifiers for the CIK - Edgar Central Index Keys symbol type.
  'crd': CRD, // String | Input identifiers for the CRD - Central Registration Depository symbol type.
  'cusip': CUSIP, // String | Input identifiers for the CUSIP symbol type.
  'duns': Dun&Bradstreet, // String | Input identifiers for the DUNS - Dun & Bradstreet Data Universal Numbering System symbol type.
  'ein': EmployerIdentificationNumber, // String | Input identifiers for the EIN - Employer Identification Number symbol type.
  'factsetId': FactSetIdentifier, // String | Input identifiers for the type FactSet Identifier - FactSet -E,-S,-R, -L Permanent Identifier symbol type.
  'fitch': FitchCreditRating, // String | Input identifiers for the Fitch - Fitch Ratings symbol type.
  'gvkey': GVKey, // String | Input identifiers for the type GVKEY - Compustat Global Company Key symbol type.
  'gvkeyIid': GVKeyIssueIdentifier, // String | Input identifiers for the type GVKEY+IID - Compustat Global Company Key and Issue Identifier symbol type.
  'isin': ISIN, // String | Input identifiers for the ISIN - International Securities Identification Number symbol type.
  'jcn': JCN, // String | Input identifiers for the type JCN - Japanese Corporate Number symbol type.
  'lei': LegalEntityIdentifier, // String | Input identifiers for the LEI - Legal Entity Identifier symbol type
  'lxid': LXID, // String | Input identifiers for the type LXID - Markit Syndicated Loan Identifier symbol type.
  'md': MoodysIssuer, // String | Input identifiers for the Moody's Ratings Identifier type.
  'redCode': RedCode, // String | Input identifiers for the type Red Code - Markit Reference Entity Identifier symbol type.
  'rssd': FederalReserveRSSDIdentifier, // String | Input identifiers for the RSSD - Federal Reserve RSSD symbol typ.
  'sedol': SEDOL, // String | Input identifiers for the SEDOL symbol type.
  'spr': SPRating, // String | Input identifiers for the Price Ticker symbol type.
  'ticker': PriceTicker, // String | Input identifiers for the Price Ticker symbol type.
  'tickerExchange': TickerExch, // String | Input identifiers for the TickerExchange.
  'tickerRegion': TickerRegion, // String | Input identifiers for the TickerRegion.
  'ukch': UKCompanyHouse, // String | Input identifiers for the UKCH - UK Company House symbol type.
  'valoren': VALOR, // String | Input identifiers for the Valoren (\"Valor\") symbol type.
  'wkn': WKN // String | Input identifiers for the WKN - German Securities symbol type.
};

// Call api endpoint
apiInstance.getEntityMatch(name, opts).then(
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
 **name** | **String**| Name of Entity to match. | 
 **country** | **String**| ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). | [optional] 
 **state** | **String**| Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported. | [optional] 
 **url** | **String**| URL corresponding to the entity name that is used when evaluating candidates for a match. | [optional] 
 **includeEntityType** | [**[String]**](String.md)| Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |ABS|Asset-Backed||MED|Broadcast Call Sign|   |BAS|Business Association (JP)||MUC|Mutual Fd-Closed End|   |CAC|Consolidated Accounting||MUE|Mutual Fd-ETF|   |CMD|Commodity||MUT|Mutual Fd-Open End|   |COL|College/University||NPO|Non-Profit Organization|   |CUR|Currency||OPD|Operating Division|   |ESP|Emp Stk Ownership Plan||OTH|Other|   |EXT|Extinct||PEF|Pension Fund|   |FAF|Family of Fds (VC/Pvt EQ)||PRO|Real Property|   |FND|Foundation/Endowment||PUB|Public Company|   |FNS|Financing Subsidiary/SPE||PVF|Private Eq Fd/Alt Invt|   |FRX|ForEx||PVT|Private Company|   |GOV|Government||SOV|Sovereign Wealth Fund|   |HED|Hedge Fund||SUB|Subsidiary|   |HOL|Holding Company||TRU|Trust/Trustee|   |IDX|Index||UMB|Umbrella Fund|   |VEN|Venture Capital Fund||JVT|Joint Venture|  | [optional] 
 **excludeEntityType** | [**[String]**](String.md)| Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Candidates with an entity type specified will *not* be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---| |ABS|Asset-Backed||MED|Broadcast Call Sign| |BAS|Business Association (JP)||MUC|Mutual Fd-Closed End| |CAC|Consolidated Accounting||MUE|Mutual Fd-ETF| |CMD|Commodity||MUT|Mutual Fd-Open End| |COL|College/University||NPO|Non-Profit Organization| |CUR|Currency||OPD|Operating Division| |ESP|Emp Stk Ownership Plan||OTH|Other| |EXT|Extinct||PEF|Pension Fund| |FAF|Family of Fds (VC/Pvt EQ)||PRO|Real Property| |FND|Foundation/Endowment||PUB|Public Company| |FNS|Financing Subsidiary/SPE||PVF|Private Eq Fd/Alt Invt| |FRX|ForEx||PVT|Private Company| |GOV|Government||SOV|Sovereign Wealth Fund| |HED|Hedge Fund||SUB|Subsidiary| |HOL|Holding Company||TRU|Trust/Trustee| |IDX|Index||UMB|Umbrella Fund| |VEN|Venture Capital Fund||JVT|Joint Venture|  | [optional] 
 **includeEntitySubType** | [**[String]**](String.md)| Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description|   |---|---|---|---|   |AR|Arbitrage|IC|Investment Company|   |BM|Bank Investment Division|IN|Insurance Company|   |BR|Broker|MF|Mutual Fund Manager|   |CP|Corporate|ML|Master Ltd Part|   |CU|Custodial|MM|Market Maker|   |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt|   |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager|   |FO|Foundation/Endowment Manager|PP|Real Estate Manager|   |FS|Fund Distributor|RE|Research Firm|   |FU|Fund|SB|Subsidiary Branch|   |FY|Family Office|ST|Stock Borrowing/Lending|   |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager|   |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity|   |IA|Investment Adviser|   |IB|Investment Banking|  | [optional] 
 **excludeEntitySubType** | [**[String]**](String.md)| Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will not be considered for the final match result. Multiple types can be entered separated by commas. |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description| |---|---|---|---| |AR|Arbitrage|IC|Investment Company| |BM|Bank Investment Division|IN|Insurance Company| |BR|Broker|MF|Mutual Fund Manager| |CP|Corporate|ML|Master Ltd Part| |CU|Custodial|MM|Market Maker| |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt| |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager| |FO|Foundation/Endowment Manager|PP|Real Estate Manager| |FS|Fund Distributor|RE|Research Firm| |FU|Fund|SB|Subsidiary Branch| |FY|Family Office|ST|Stock Borrowing/Lending| |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager| |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity| |IA|Investment Adviser| |IB|Investment Banking|  | [optional] 
 **includeParent** | **Boolean**| Flag to include parent entities in the list of candidates. This parameter does not influence the match result. | [optional] [default to false]
 **bbgFigi** | **String**| Input identifiers for the Bloomberg Listing/Regional/Security ID symbol type. | [optional] 
 **bbgTicker** | **String**| Input identifiers for the Bloomberg Listing and Regional Ticker symbol Type. | [optional] 
 **bic** | **String**| Input identifiers for the BICCode - Bank Indentification Code symbol Type. | [optional] 
 **cik** | **String**| Input identifiers for the CIK - Edgar Central Index Keys symbol type. | [optional] 
 **crd** | **String**| Input identifiers for the CRD - Central Registration Depository symbol type. | [optional] 
 **cusip** | **String**| Input identifiers for the CUSIP symbol type. | [optional] 
 **duns** | **String**| Input identifiers for the DUNS - Dun &amp; Bradstreet Data Universal Numbering System symbol type. | [optional] 
 **ein** | **String**| Input identifiers for the EIN - Employer Identification Number symbol type. | [optional] 
 **factsetId** | **String**| Input identifiers for the type FactSet Identifier - FactSet -E,-S,-R, -L Permanent Identifier symbol type. | [optional] 
 **fitch** | **String**| Input identifiers for the Fitch - Fitch Ratings symbol type. | [optional] 
 **gvkey** | **String**| Input identifiers for the type GVKEY - Compustat Global Company Key symbol type. | [optional] 
 **gvkeyIid** | **String**| Input identifiers for the type GVKEY+IID - Compustat Global Company Key and Issue Identifier symbol type. | [optional] 
 **isin** | **String**| Input identifiers for the ISIN - International Securities Identification Number symbol type. | [optional] 
 **jcn** | **String**| Input identifiers for the type JCN - Japanese Corporate Number symbol type. | [optional] 
 **lei** | **String**| Input identifiers for the LEI - Legal Entity Identifier symbol type | [optional] 
 **lxid** | **String**| Input identifiers for the type LXID - Markit Syndicated Loan Identifier symbol type. | [optional] 
 **md** | **String**| Input identifiers for the Moody&#39;s Ratings Identifier type. | [optional] 
 **redCode** | **String**| Input identifiers for the type Red Code - Markit Reference Entity Identifier symbol type. | [optional] 
 **rssd** | **String**| Input identifiers for the RSSD - Federal Reserve RSSD symbol typ. | [optional] 
 **sedol** | **String**| Input identifiers for the SEDOL symbol type. | [optional] 
 **spr** | **String**| Input identifiers for the Price Ticker symbol type. | [optional] 
 **ticker** | **String**| Input identifiers for the Price Ticker symbol type. | [optional] 
 **tickerExchange** | **String**| Input identifiers for the TickerExchange. | [optional] 
 **tickerRegion** | **String**| Input identifiers for the TickerRegion. | [optional] 
 **ukch** | **String**| Input identifiers for the UKCH - UK Company House symbol type. | [optional] 
 **valoren** | **String**| Input identifiers for the Valoren (\&quot;Valor\&quot;) symbol type. | [optional] 
 **wkn** | **String**| Input identifiers for the WKN - German Securities symbol type. | [optional] 

### Return type

[**EntityMatchesResponse**](EntityMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8, application/json


## getEntityMatchForList

> EntityMatchesResponse getEntityMatchForList(entityMatchRequest)

Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.

Finds the best candidate entities matching the given entity name. If a &#x60;universeId&#x60; is provided, any match for an input including a &#x60;clientId&#x60; will be saved to that universe. Additional attributes can be supplied to narrow the search, such as State, URL, and Entity Types. Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search.  &lt;p&gt;**Max of 25 Names inputted.** Use the \&quot;Entity Match - Bulk\&quot; workflow to submit larger universes of names to be concorded via a file.&lt;/p&gt;&lt;p&gt; Supported types of Entities in which the names can match to include -   * Corporations, Joint Ventures, and Holding Companies   * Fund Managers and various Fund Types (Open-end, Closed End, Hedge, Soverign Wealth, Pension, Exchange Traded, and more).&lt;/p&gt; 

### Example

```javascript
const { ApiClient, EntityMatchApi } = require('@factset/sdk-factsetconcordance');
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

const apiInstance = new EntityMatchApi();
const entityMatchRequest = new factsetconcordance.EntityMatchRequest(); // EntityMatchRequest | A request to match a Entity.

// Call api endpoint
apiInstance.getEntityMatchForList(entityMatchRequest).then(
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
 **entityMatchRequest** | [**EntityMatchRequest**](EntityMatchRequest.md)| A request to match a Entity. | 

### Return type

[**EntityMatchesResponse**](EntityMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8, application/json


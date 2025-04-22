# EntityMatchApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityMatch**](EntityMatchApi.md#getEntityMatch) | **GET** /factset-concordance/v2/entity-match | Get Entity Candidates and Matches for a single name and attributes.
[**getEntityMatchForList**](EntityMatchApi.md#getEntityMatchForList) | **POST** /factset-concordance/v2/entity-match | Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.



## getEntityMatch

> EntityMatchesResponse getEntityMatch(name, country, state, url, includeEntityType, excludeEntityType, includeEntitySubType, excludeEntitySubType, includeParent, bbgFigi, bbgTicker, bic, cik, crd, cusip, ein, factsetId, fitch, gvkey, gvkeyIid, isin, jcn, lei, lxid, md, redCode, rssd, sedol, spr, ticker, tickerExchange, tickerRegion, ukch, valoren, wkn, candidatesCount)

Get Entity Candidates and Matches for a single name and attributes.

Finds the best candidate entities matching the given entity name. Additional attributes can be supplied to narrow the search, such as State, URL, and Entity Types. <p>**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names. Otherwise, use the "Entity Match - Bulk" workflow to submit larger universes of names to be concorded via a file.</p><p>


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.EntityMatchApi;

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

        EntityMatchApi apiInstance = new EntityMatchApi(defaultClient);
        String name = "Tesla"; // String | Name of Entity to match.
        String country = "US"; // String | ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754#country).
        String state = "TX"; // String | Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported.
        String url = "www.tesla.com"; // String | URL corresponding to the entity name that is used when evaluating candidates for a match.
        java.util.List<String> includeEntityType = Arrays.asList(); // java.util.List<String> | Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |ABS|Asset-Backed|MED|Broadcast Call Sign|   |BAS|Business Association (JP)|MUC|Mutual Fd-Closed End|   |CAC|Consolidated Accounting|MUE|Mutual Fd-ETF|   |CMD|Commodity|MUT|Mutual Fd-Open End|   |COL|College/University|NPO|Non-Profit Organization|   |CUR|Currency|OPD|Operating Division|   |ESP|Emp Stk Ownership Plan|OTH|Other|   |EXT|Extinct|PEF|Pension Fund|   |FAF|Family of Fds (VC/Pvt EQ)|PRO|Real Property|   |FND|Foundation/Endowment|PUB|Public Company|   |FNS|Financing Subsidiary/SPE|PVF|Private Eq Fd/Alt Invt|   |FRX|ForEx|PVT|Private Company|   |GOV|Government|SOV|Sovereign Wealth Fund|   |HED|Hedge Fund|SUB|Subsidiary|   |HOL|Holding Company|TRU|Trust/Trustee|   |IDX|Index|UMB|Umbrella Fund|   |VEN|Venture Capital Fund|JVT|Joint Venture| 
        java.util.List<String> excludeEntityType = Arrays.asList(); // java.util.List<String> | Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Candidates with an entity type specified will *not* be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---| |ABS|Asset-Backed|MED|Broadcast Call Sign| |BAS|Business Association (JP)|MUC|Mutual Fd-Closed End| |CAC|Consolidated Accounting|MUE|Mutual Fd-ETF| |CMD|Commodity|MUT|Mutual Fd-Open End| |COL|College/University|NPO|Non-Profit Organization| |CUR|Currency|OPD|Operating Division| |ESP|Emp Stk Ownership Plan|OTH|Other| |EXT|Extinct|PEF|Pension Fund| |FAF|Family of Fds (VC/Pvt EQ)|PRO|Real Property| |FND|Foundation/Endowment|PUB|Public Company| |FNS|Financing Subsidiary/SPE|PVF|Private Eq Fd/Alt Invt| |FRX|ForEx|PVT|Private Company| |GOV|Government|SOV|Sovereign Wealth Fund| |HED|Hedge Fund|SUB|Subsidiary| |HOL|Holding Company|TRU|Trust/Trustee| |IDX|Index|UMB|Umbrella Fund| |VEN|Venture Capital Fund|JVT|Joint Venture| 
        java.util.List<String> includeEntitySubType = Arrays.asList(); // java.util.List<String> | Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description|   |---|---|---|---|   |AR|Arbitrage|IC|Investment Company|   |BM|Bank Investment Division|IN|Insurance Company|   |BR|Broker|MF|Mutual Fund Manager|   |CP|Corporate|ML|Master Ltd Part|   |CU|Custodial|MM|Market Maker|   |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt|   |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager|   |FO|Foundation/Endowment Manager|PP|Real Estate Manager|   |FS|Fund Distributor|RE|Research Firm|   |FU|Fund|SB|Subsidiary Branch|   |FY|Family Office|ST|Stock Borrowing/Lending|   |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager|   |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity|   |IA|Investment Adviser|   |IB|Investment Banking| 
        java.util.List<String> excludeEntitySubType = Arrays.asList(); // java.util.List<String> | Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will not be considered for the final match result. Multiple types can be entered separated by commas. |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description| |---|---|---|---| |AR|Arbitrage|IC|Investment Company| |BM|Bank Investment Division|IN|Insurance Company| |BR|Broker|MF|Mutual Fund Manager| |CP|Corporate|ML|Master Ltd Part| |CU|Custodial|MM|Market Maker| |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt| |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager| |FO|Foundation/Endowment Manager|PP|Real Estate Manager| |FS|Fund Distributor|RE|Research Firm| |FU|Fund|SB|Subsidiary Branch| |FY|Family Office|ST|Stock Borrowing/Lending| |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager| |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity| |IA|Investment Adviser| |IB|Investment Banking| 
        Boolean includeParent = false; // Boolean | Flag to include parent entities in the list of candidates. This parameter does not influence the match result.
        String bbgFigi = "BBG000N9P426"; // String | Input identifiers for the Bloomberg Listing/Regional/Security ID symbol type.
        String bbgTicker = "TSLA UW"; // String | Input identifiers for the Bloomberg Listing and Regional Ticker symbol Type.
        String bic = "TSLAUS66"; // String | Input identifiers for the BICCode - Bank Indentification Code symbol Type.
        String cik = "1318605"; // String | Input identifiers for the CIK - Edgar Central Index Keys symbol type.
        String crd = "CRD"; // String | Input identifiers for the CRD - Central Registration Depository symbol type.
        String cusip = "88160R101"; // String | Input identifiers for the CUSIP symbol type.
        String ein = "912197729"; // String | Input identifiers for the EIN - Employer Identification Number symbol type.
        String factsetId = "006XY7-E"; // String | Input identifiers for the type FactSet Identifier - FactSet -E,-S,-R, -L Permanent Identifier symbol type.
        String fitch = "FitchCreditRating"; // String | Input identifiers for the Fitch - Fitch Ratings symbol type.
        String gvkey = "GVKey"; // String | Input identifiers for the type GVKEY - Compustat Global Company Key symbol type.
        String gvkeyIid = "GVKeyIssueIdentifier"; // String | Input identifiers for the type GVKEY+IID - Compustat Global Company Key and Issue Identifier symbol type.
        String isin = "US88160R1014"; // String | Input identifiers for the ISIN - International Securities Identification Number symbol type.
        String jcn = "JCN"; // String | Input identifiers for the type JCN - Japanese Corporate Number symbol type.
        String lei = "54930043XZGB27CTOV49"; // String | Input identifiers for the LEI - Legal Entity Identifier symbol type
        String lxid = "LXID"; // String | Input identifiers for the type LXID - Markit Syndicated Loan Identifier symbol type.
        String md = "823642219"; // String | Input identifiers for the Moody's Ratings Identifier type.
        String redCode = "RedCode"; // String | Input identifiers for the type Red Code - Markit Reference Entity Identifier symbol type.
        String rssd = "FederalReserveRSSDIdentifier"; // String | Input identifiers for the RSSD - Federal Reserve RSSD symbol typ.
        String sedol = "B616C79"; // String | Input identifiers for the SEDOL symbol type.
        String spr = "562703"; // String | Input identifiers for the Price Ticker symbol type.
        String ticker = "PriceTicker"; // String | Input identifiers for the Price Ticker symbol type.
        String tickerExchange = "TSLA-NAS"; // String | Input identifiers for the TickerExchange.
        String tickerRegion = "TSLA-US"; // String | Input identifiers for the TickerRegion.
        String ukch = "UKCompanyHouse"; // String | Input identifiers for the UKCH - UK Company House symbol type.
        String valoren = "VALOR"; // String | Input identifiers for the Valoren (\"Valor\") symbol type.
        String wkn = "A1CX3T"; // String | Input identifiers for the WKN - German Securities symbol type.
        Integer candidatesCount = 40; // Integer | Maximum number of candidates to be returned. Parent entities, when includeParent is true, are not included in this count. <p>*minimum - 20*</p> <p>*maximum - 100*</p>
        try {
            EntityMatchesResponse result = apiInstance.getEntityMatch(name, country, state, url, includeEntityType, excludeEntityType, includeEntitySubType, excludeEntitySubType, includeParent, bbgFigi, bbgTicker, bic, cik, crd, cusip, ein, factsetId, fitch, gvkey, gvkeyIid, isin, jcn, lei, lxid, md, redCode, rssd, sedol, spr, ticker, tickerExchange, tickerRegion, ukch, valoren, wkn, candidatesCount);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityMatchApi#getEntityMatch");
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
 **name** | **String**| Name of Entity to match. |
 **country** | **String**| ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754#country). | [optional]
 **state** | **String**| Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported. | [optional]
 **url** | **String**| URL corresponding to the entity name that is used when evaluating candidates for a match. | [optional]
 **includeEntityType** | **List&lt;String&gt;**| Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |ABS|Asset-Backed|MED|Broadcast Call Sign|   |BAS|Business Association (JP)|MUC|Mutual Fd-Closed End|   |CAC|Consolidated Accounting|MUE|Mutual Fd-ETF|   |CMD|Commodity|MUT|Mutual Fd-Open End|   |COL|College/University|NPO|Non-Profit Organization|   |CUR|Currency|OPD|Operating Division|   |ESP|Emp Stk Ownership Plan|OTH|Other|   |EXT|Extinct|PEF|Pension Fund|   |FAF|Family of Fds (VC/Pvt EQ)|PRO|Real Property|   |FND|Foundation/Endowment|PUB|Public Company|   |FNS|Financing Subsidiary/SPE|PVF|Private Eq Fd/Alt Invt|   |FRX|ForEx|PVT|Private Company|   |GOV|Government|SOV|Sovereign Wealth Fund|   |HED|Hedge Fund|SUB|Subsidiary|   |HOL|Holding Company|TRU|Trust/Trustee|   |IDX|Index|UMB|Umbrella Fund|   |VEN|Venture Capital Fund|JVT|Joint Venture|  | [optional]
 **excludeEntityType** | **List&lt;String&gt;**| Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Candidates with an entity type specified will *not* be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---| |ABS|Asset-Backed|MED|Broadcast Call Sign| |BAS|Business Association (JP)|MUC|Mutual Fd-Closed End| |CAC|Consolidated Accounting|MUE|Mutual Fd-ETF| |CMD|Commodity|MUT|Mutual Fd-Open End| |COL|College/University|NPO|Non-Profit Organization| |CUR|Currency|OPD|Operating Division| |ESP|Emp Stk Ownership Plan|OTH|Other| |EXT|Extinct|PEF|Pension Fund| |FAF|Family of Fds (VC/Pvt EQ)|PRO|Real Property| |FND|Foundation/Endowment|PUB|Public Company| |FNS|Financing Subsidiary/SPE|PVF|Private Eq Fd/Alt Invt| |FRX|ForEx|PVT|Private Company| |GOV|Government|SOV|Sovereign Wealth Fund| |HED|Hedge Fund|SUB|Subsidiary| |HOL|Holding Company|TRU|Trust/Trustee| |IDX|Index|UMB|Umbrella Fund| |VEN|Venture Capital Fund|JVT|Joint Venture|  | [optional]
 **includeEntitySubType** | **List&lt;String&gt;**| Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description|   |---|---|---|---|   |AR|Arbitrage|IC|Investment Company|   |BM|Bank Investment Division|IN|Insurance Company|   |BR|Broker|MF|Mutual Fund Manager|   |CP|Corporate|ML|Master Ltd Part|   |CU|Custodial|MM|Market Maker|   |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt|   |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager|   |FO|Foundation/Endowment Manager|PP|Real Estate Manager|   |FS|Fund Distributor|RE|Research Firm|   |FU|Fund|SB|Subsidiary Branch|   |FY|Family Office|ST|Stock Borrowing/Lending|   |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager|   |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity|   |IA|Investment Adviser|   |IB|Investment Banking|  | [optional]
 **excludeEntitySubType** | **List&lt;String&gt;**| Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will not be considered for the final match result. Multiple types can be entered separated by commas. |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description| |---|---|---|---| |AR|Arbitrage|IC|Investment Company| |BM|Bank Investment Division|IN|Insurance Company| |BR|Broker|MF|Mutual Fund Manager| |CP|Corporate|ML|Master Ltd Part| |CU|Custodial|MM|Market Maker| |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt| |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager| |FO|Foundation/Endowment Manager|PP|Real Estate Manager| |FS|Fund Distributor|RE|Research Firm| |FU|Fund|SB|Subsidiary Branch| |FY|Family Office|ST|Stock Borrowing/Lending| |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager| |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity| |IA|Investment Adviser| |IB|Investment Banking|  | [optional]
 **includeParent** | **Boolean**| Flag to include parent entities in the list of candidates. This parameter does not influence the match result. | [optional] [default to false]
 **bbgFigi** | **String**| Input identifiers for the Bloomberg Listing/Regional/Security ID symbol type. | [optional]
 **bbgTicker** | **String**| Input identifiers for the Bloomberg Listing and Regional Ticker symbol Type. | [optional]
 **bic** | **String**| Input identifiers for the BICCode - Bank Indentification Code symbol Type. | [optional]
 **cik** | **String**| Input identifiers for the CIK - Edgar Central Index Keys symbol type. | [optional]
 **crd** | **String**| Input identifiers for the CRD - Central Registration Depository symbol type. | [optional]
 **cusip** | **String**| Input identifiers for the CUSIP symbol type. | [optional]
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
 **candidatesCount** | **Integer**| Maximum number of candidates to be returned. Parent entities, when includeParent is true, are not included in this count. &lt;p&gt;*minimum - 20*&lt;/p&gt; &lt;p&gt;*maximum - 100*&lt;/p&gt; | [optional]

### Return type

[**EntityMatchesResponse**](EntityMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing Entity Match results. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getEntityMatchForList

> EntityMatchesResponse getEntityMatchForList(entityMatchRequest)

Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.

Finds the best candidate entities matching the given entity name. If a `universeId` is provided, any match for an input including a `clientId` will be saved to that universe. Additional attributes can be supplied to narrow the search, such as State, URL, and Entity Types. Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search.  <p>**Max of 25 Names inputted.** Use the "Entity Match - Bulk" workflow to submit larger universes of names to be concorded via a file.</p><p> Supported types of Entities in which the names can match to include -
  * Corporations, Joint Ventures, and Holding Companies
  * Fund Managers and various Fund Types (Open-end, Closed End, Hedge, Soverign Wealth, Pension, Exchange Traded, and more).</p>


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.EntityMatchApi;

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

        EntityMatchApi apiInstance = new EntityMatchApi(defaultClient);
        EntityMatchRequest entityMatchRequest = new EntityMatchRequest(); // EntityMatchRequest | A request to match a Entity.
        try {
            EntityMatchesResponse result = apiInstance.getEntityMatchForList(entityMatchRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityMatchApi#getEntityMatchForList");
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
 **entityMatchRequest** | [**EntityMatchRequest**](EntityMatchRequest.md)| A request to match a Entity. |

### Return type

[**EntityMatchesResponse**](EntityMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing Entity Match results. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


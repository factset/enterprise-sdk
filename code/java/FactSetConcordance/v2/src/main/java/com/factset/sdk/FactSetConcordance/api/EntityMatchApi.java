package com.factset.sdk.FactSetConcordance.api;

import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiResponse;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.Pair;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetConcordance.models.EntityMatchRequest;
import com.factset.sdk.FactSetConcordance.models.EntityMatchesResponse;
import com.factset.sdk.FactSetConcordance.models.ErrorResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityMatchApi {
  private ApiClient apiClient;

  public EntityMatchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntityMatchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getEntityMatchResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityMatchResponseTypeMap.put(200, new GenericType<EntityMatchesResponse>(){});
    getEntityMatchResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityMatchResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntityMatchResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityMatchResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntityMatchResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getEntityMatchForListResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getEntityMatchForListResponseTypeMap.put(200, new GenericType<EntityMatchesResponse>(){});
    getEntityMatchForListResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getEntityMatchForListResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getEntityMatchForListResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getEntityMatchForListResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getEntityMatchForListResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  


  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Entity Candidates and Matches for a single name and attributes.
   * Finds the best candidate entities matching the given entity name. Additional attributes can be supplied to narrow the search, such as State, URL, and Entity Types. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names. Otherwise, use the \&quot;Entity Match - Bulk\&quot; workflow to submit larger universes of names to be concorded via a file.&lt;/p&gt;&lt;p&gt; 
   * @param name Name of Entity to match. (required)
   * @param country ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)
   * @param state Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported. (optional)
   * @param url URL corresponding to the entity name that is used when evaluating candidates for a match. (optional)
   * @param includeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |ABS|Asset-Backed||MED|Broadcast Call Sign|   |BAS|Business Association (JP)||MUC|Mutual Fd-Closed End|   |CAC|Consolidated Accounting||MUE|Mutual Fd-ETF|   |CMD|Commodity||MUT|Mutual Fd-Open End|   |COL|College/University||NPO|Non-Profit Organization|   |CUR|Currency||OPD|Operating Division|   |ESP|Emp Stk Ownership Plan||OTH|Other|   |EXT|Extinct||PEF|Pension Fund|   |FAF|Family of Fds (VC/Pvt EQ)||PRO|Real Property|   |FND|Foundation/Endowment||PUB|Public Company|   |FNS|Financing Subsidiary/SPE||PVF|Private Eq Fd/Alt Invt|   |FRX|ForEx||PVT|Private Company|   |GOV|Government||SOV|Sovereign Wealth Fund|   |HED|Hedge Fund||SUB|Subsidiary|   |HOL|Holding Company||TRU|Trust/Trustee|   |IDX|Index||UMB|Umbrella Fund|   |VEN|Venture Capital Fund||JVT|Joint Venture|  (optional)
   * @param excludeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Candidates with an entity type specified will *not* be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---| |ABS|Asset-Backed||MED|Broadcast Call Sign| |BAS|Business Association (JP)||MUC|Mutual Fd-Closed End| |CAC|Consolidated Accounting||MUE|Mutual Fd-ETF| |CMD|Commodity||MUT|Mutual Fd-Open End| |COL|College/University||NPO|Non-Profit Organization| |CUR|Currency||OPD|Operating Division| |ESP|Emp Stk Ownership Plan||OTH|Other| |EXT|Extinct||PEF|Pension Fund| |FAF|Family of Fds (VC/Pvt EQ)||PRO|Real Property| |FND|Foundation/Endowment||PUB|Public Company| |FNS|Financing Subsidiary/SPE||PVF|Private Eq Fd/Alt Invt| |FRX|ForEx||PVT|Private Company| |GOV|Government||SOV|Sovereign Wealth Fund| |HED|Hedge Fund||SUB|Subsidiary| |HOL|Holding Company||TRU|Trust/Trustee| |IDX|Index||UMB|Umbrella Fund| |VEN|Venture Capital Fund||JVT|Joint Venture|  (optional)
   * @param includeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description|   |---|---|---|---|   |AR|Arbitrage|IC|Investment Company|   |BM|Bank Investment Division|IN|Insurance Company|   |BR|Broker|MF|Mutual Fund Manager|   |CP|Corporate|ML|Master Ltd Part|   |CU|Custodial|MM|Market Maker|   |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt|   |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager|   |FO|Foundation/Endowment Manager|PP|Real Estate Manager|   |FS|Fund Distributor|RE|Research Firm|   |FU|Fund|SB|Subsidiary Branch|   |FY|Family Office|ST|Stock Borrowing/Lending|   |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager|   |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity|   |IA|Investment Adviser|   |IB|Investment Banking|  (optional)
   * @param excludeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will not be considered for the final match result. Multiple types can be entered separated by commas. |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description| |---|---|---|---| |AR|Arbitrage|IC|Investment Company| |BM|Bank Investment Division|IN|Insurance Company| |BR|Broker|MF|Mutual Fund Manager| |CP|Corporate|ML|Master Ltd Part| |CU|Custodial|MM|Market Maker| |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt| |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager| |FO|Foundation/Endowment Manager|PP|Real Estate Manager| |FS|Fund Distributor|RE|Research Firm| |FU|Fund|SB|Subsidiary Branch| |FY|Family Office|ST|Stock Borrowing/Lending| |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager| |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity| |IA|Investment Adviser| |IB|Investment Banking|  (optional)
   * @param includeParent Flag to include parent entities in the list of candidates. This parameter does not influence the match result. (optional, default to false)
   * @param bbgFigi Input identifiers for the Bloomberg Listing/Regional/Security ID symbol type. (optional)
   * @param bbgTicker Input identifiers for the Bloomberg Listing and Regional Ticker symbol Type. (optional)
   * @param bic Input identifiers for the BICCode - Bank Indentification Code symbol Type. (optional)
   * @param cik Input identifiers for the CIK - Edgar Central Index Keys symbol type. (optional)
   * @param crd Input identifiers for the CRD - Central Registration Depository symbol type. (optional)
   * @param cusip Input identifiers for the CUSIP symbol type. (optional)
   * @param duns Input identifiers for the DUNS - Dun &amp; Bradstreet Data Universal Numbering System symbol type. (optional)
   * @param ein Input identifiers for the EIN - Employer Identification Number symbol type. (optional)
   * @param factsetId Input identifiers for the type FactSet Identifier - FactSet -E,-S,-R, -L Permanent Identifier symbol type. (optional)
   * @param fitch Input identifiers for the Fitch - Fitch Ratings symbol type. (optional)
   * @param gvkey Input identifiers for the type GVKEY - Compustat Global Company Key symbol type. (optional)
   * @param gvkeyIid Input identifiers for the type GVKEY+IID - Compustat Global Company Key and Issue Identifier symbol type. (optional)
   * @param isin Input identifiers for the ISIN - International Securities Identification Number symbol type. (optional)
   * @param jcn Input identifiers for the type JCN - Japanese Corporate Number symbol type. (optional)
   * @param lei Input identifiers for the LEI - Legal Entity Identifier symbol type (optional)
   * @param lxid Input identifiers for the type LXID - Markit Syndicated Loan Identifier symbol type. (optional)
   * @param md Input identifiers for the Moody&#39;s Ratings Identifier type. (optional)
   * @param redCode Input identifiers for the type Red Code - Markit Reference Entity Identifier symbol type. (optional)
   * @param rssd Input identifiers for the RSSD - Federal Reserve RSSD symbol typ. (optional)
   * @param sedol Input identifiers for the SEDOL symbol type. (optional)
   * @param spr Input identifiers for the Price Ticker symbol type. (optional)
   * @param ticker Input identifiers for the Price Ticker symbol type. (optional)
   * @param tickerExchange Input identifiers for the TickerExchange. (optional)
   * @param tickerRegion Input identifiers for the TickerRegion. (optional)
   * @param ukch Input identifiers for the UKCH - UK Company House symbol type. (optional)
   * @param valoren Input identifiers for the Valoren (\&quot;Valor\&quot;) symbol type. (optional)
   * @param wkn Input identifiers for the WKN - German Securities symbol type. (optional)
   * @return EntityMatchesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response containing Entity Match results. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityMatchesResponse getEntityMatch(String name, String country, String state, String url, java.util.List<String> includeEntityType, java.util.List<String> excludeEntityType, java.util.List<String> includeEntitySubType, java.util.List<String> excludeEntitySubType, Boolean includeParent, String bbgFigi, String bbgTicker, String bic, String cik, String crd, String cusip, String duns, String ein, String factsetId, String fitch, String gvkey, String gvkeyIid, String isin, String jcn, String lei, String lxid, String md, String redCode, String rssd, String sedol, String spr, String ticker, String tickerExchange, String tickerRegion, String ukch, String valoren, String wkn) throws ApiException {
    return getEntityMatchWithHttpInfo(name, country, state, url, includeEntityType, excludeEntityType, includeEntitySubType, excludeEntitySubType, includeParent, bbgFigi, bbgTicker, bic, cik, crd, cusip, duns, ein, factsetId, fitch, gvkey, gvkeyIid, isin, jcn, lei, lxid, md, redCode, rssd, sedol, spr, ticker, tickerExchange, tickerRegion, ukch, valoren, wkn).getData();
  }

  /**
   * Get Entity Candidates and Matches for a single name and attributes.
   * Finds the best candidate entities matching the given entity name. Additional attributes can be supplied to narrow the search, such as State, URL, and Entity Types. &lt;p&gt;**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names. Otherwise, use the \&quot;Entity Match - Bulk\&quot; workflow to submit larger universes of names to be concorded via a file.&lt;/p&gt;&lt;p&gt; 
   * @param name Name of Entity to match. (required)
   * @param country ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). (optional)
   * @param state Two-character state code corresponding to the entity name that is used when evaluating candidates for a match. Currently, only US state codes are supported. (optional)
   * @param url URL corresponding to the entity name that is used when evaluating candidates for a match. (optional)
   * @param includeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---|   |ABS|Asset-Backed||MED|Broadcast Call Sign|   |BAS|Business Association (JP)||MUC|Mutual Fd-Closed End|   |CAC|Consolidated Accounting||MUE|Mutual Fd-ETF|   |CMD|Commodity||MUT|Mutual Fd-Open End|   |COL|College/University||NPO|Non-Profit Organization|   |CUR|Currency||OPD|Operating Division|   |ESP|Emp Stk Ownership Plan||OTH|Other|   |EXT|Extinct||PEF|Pension Fund|   |FAF|Family of Fds (VC/Pvt EQ)||PRO|Real Property|   |FND|Foundation/Endowment||PUB|Public Company|   |FNS|Financing Subsidiary/SPE||PVF|Private Eq Fd/Alt Invt|   |FRX|ForEx||PVT|Private Company|   |GOV|Government||SOV|Sovereign Wealth Fund|   |HED|Hedge Fund||SUB|Subsidiary|   |HOL|Holding Company||TRU|Trust/Trustee|   |IDX|Index||UMB|Umbrella Fund|   |VEN|Venture Capital Fund||JVT|Joint Venture|  (optional)
   * @param excludeEntityType Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Candidates with an entity type specified will *not* be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Type Code|Entity Type Description|Entity Type Code|Entity Type Description|   |---|---|---|---| |ABS|Asset-Backed||MED|Broadcast Call Sign| |BAS|Business Association (JP)||MUC|Mutual Fd-Closed End| |CAC|Consolidated Accounting||MUE|Mutual Fd-ETF| |CMD|Commodity||MUT|Mutual Fd-Open End| |COL|College/University||NPO|Non-Profit Organization| |CUR|Currency||OPD|Operating Division| |ESP|Emp Stk Ownership Plan||OTH|Other| |EXT|Extinct||PEF|Pension Fund| |FAF|Family of Fds (VC/Pvt EQ)||PRO|Real Property| |FND|Foundation/Endowment||PUB|Public Company| |FNS|Financing Subsidiary/SPE||PVF|Private Eq Fd/Alt Invt| |FRX|ForEx||PVT|Private Company| |GOV|Government||SOV|Sovereign Wealth Fund| |HED|Hedge Fund||SUB|Subsidiary| |HOL|Holding Company||TRU|Trust/Trustee| |IDX|Index||UMB|Umbrella Fund| |VEN|Venture Capital Fund||JVT|Joint Venture|  (optional)
   * @param includeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas.   |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description|   |---|---|---|---|   |AR|Arbitrage|IC|Investment Company|   |BM|Bank Investment Division|IN|Insurance Company|   |BR|Broker|MF|Mutual Fund Manager|   |CP|Corporate|ML|Master Ltd Part|   |CU|Custodial|MM|Market Maker|   |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt|   |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager|   |FO|Foundation/Endowment Manager|PP|Real Estate Manager|   |FS|Fund Distributor|RE|Research Firm|   |FU|Fund|SB|Subsidiary Branch|   |FY|Family Office|ST|Stock Borrowing/Lending|   |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager|   |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity|   |IA|Investment Adviser|   |IB|Investment Banking|  (optional)
   * @param excludeEntitySubType Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will not be considered for the final match result. Multiple types can be entered separated by commas. |Entity Subtype Code|Entity Subtype Description|Entity Subtype Code|Entity Subtype Description| |---|---|---|---| |AR|Arbitrage|IC|Investment Company| |BM|Bank Investment Division|IN|Insurance Company| |BR|Broker|MF|Mutual Fund Manager| |CP|Corporate|ML|Master Ltd Part| |CU|Custodial|MM|Market Maker| |FF|Fund of Funds Manager|PB|Private Banking/Wealth Mgmt| |FH|Fund of Hedge Funds Manager|PF|Pension Fund Manager| |FO|Foundation/Endowment Manager|PP|Real Estate Manager| |FS|Fund Distributor|RE|Research Firm| |FU|Fund|SB|Subsidiary Branch| |FY|Family Office|ST|Stock Borrowing/Lending| |GV|Govt (Fed/Local/Agency)|SV|Sovereign Wealth Manager| |HF|Hedge Fund Manager|VC|Venture Capital/Pvt Equity| |IA|Investment Adviser| |IB|Investment Banking|  (optional)
   * @param includeParent Flag to include parent entities in the list of candidates. This parameter does not influence the match result. (optional, default to false)
   * @param bbgFigi Input identifiers for the Bloomberg Listing/Regional/Security ID symbol type. (optional)
   * @param bbgTicker Input identifiers for the Bloomberg Listing and Regional Ticker symbol Type. (optional)
   * @param bic Input identifiers for the BICCode - Bank Indentification Code symbol Type. (optional)
   * @param cik Input identifiers for the CIK - Edgar Central Index Keys symbol type. (optional)
   * @param crd Input identifiers for the CRD - Central Registration Depository symbol type. (optional)
   * @param cusip Input identifiers for the CUSIP symbol type. (optional)
   * @param duns Input identifiers for the DUNS - Dun &amp; Bradstreet Data Universal Numbering System symbol type. (optional)
   * @param ein Input identifiers for the EIN - Employer Identification Number symbol type. (optional)
   * @param factsetId Input identifiers for the type FactSet Identifier - FactSet -E,-S,-R, -L Permanent Identifier symbol type. (optional)
   * @param fitch Input identifiers for the Fitch - Fitch Ratings symbol type. (optional)
   * @param gvkey Input identifiers for the type GVKEY - Compustat Global Company Key symbol type. (optional)
   * @param gvkeyIid Input identifiers for the type GVKEY+IID - Compustat Global Company Key and Issue Identifier symbol type. (optional)
   * @param isin Input identifiers for the ISIN - International Securities Identification Number symbol type. (optional)
   * @param jcn Input identifiers for the type JCN - Japanese Corporate Number symbol type. (optional)
   * @param lei Input identifiers for the LEI - Legal Entity Identifier symbol type (optional)
   * @param lxid Input identifiers for the type LXID - Markit Syndicated Loan Identifier symbol type. (optional)
   * @param md Input identifiers for the Moody&#39;s Ratings Identifier type. (optional)
   * @param redCode Input identifiers for the type Red Code - Markit Reference Entity Identifier symbol type. (optional)
   * @param rssd Input identifiers for the RSSD - Federal Reserve RSSD symbol typ. (optional)
   * @param sedol Input identifiers for the SEDOL symbol type. (optional)
   * @param spr Input identifiers for the Price Ticker symbol type. (optional)
   * @param ticker Input identifiers for the Price Ticker symbol type. (optional)
   * @param tickerExchange Input identifiers for the TickerExchange. (optional)
   * @param tickerRegion Input identifiers for the TickerRegion. (optional)
   * @param ukch Input identifiers for the UKCH - UK Company House symbol type. (optional)
   * @param valoren Input identifiers for the Valoren (\&quot;Valor\&quot;) symbol type. (optional)
   * @param wkn Input identifiers for the WKN - German Securities symbol type. (optional)
   * @return ApiResponse&lt;EntityMatchesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response containing Entity Match results. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityMatchesResponse> getEntityMatchWithHttpInfo(String name, String country, String state, String url, java.util.List<String> includeEntityType, java.util.List<String> excludeEntityType, java.util.List<String> includeEntitySubType, java.util.List<String> excludeEntitySubType, Boolean includeParent, String bbgFigi, String bbgTicker, String bic, String cik, String crd, String cusip, String duns, String ein, String factsetId, String fitch, String gvkey, String gvkeyIid, String isin, String jcn, String lei, String lxid, String md, String redCode, String rssd, String sedol, String spr, String ticker, String tickerExchange, String tickerRegion, String ukch, String valoren, String wkn) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getEntityMatch");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/entity-match";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeEntityType", includeEntityType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "excludeEntityType", excludeEntityType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "includeEntitySubType", includeEntitySubType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "excludeEntitySubType", excludeEntitySubType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeParent", includeParent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bbgFigi", bbgFigi));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bbgTicker", bbgTicker));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bic", bic));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cik", cik));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "crd", crd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cusip", cusip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duns", duns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ein", ein));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "factsetId", factsetId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fitch", fitch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gvkey", gvkey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gvkeyIid", gvkeyIid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isin", isin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jcn", jcn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lei", lei));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lxid", lxid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "md", md));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "redCode", redCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rssd", rssd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sedol", sedol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "spr", spr));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ticker", ticker));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tickerExchange", tickerExchange));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tickerRegion", tickerRegion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ukch", ukch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "valoren", valoren));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wkn", wkn));

    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=utf-8", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityMatchesResponse
      
    > apiResponse = apiClient.invokeAPI("EntityMatchApi.getEntityMatch", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityMatchResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.
   * Finds the best candidate entities matching the given entity name. If a &#x60;universeId&#x60; is provided, any match for an input including a &#x60;clientId&#x60; will be saved to that universe. Additional attributes can be supplied to narrow the search, such as State, URL, and Entity Types. Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search.  &lt;p&gt;**Max of 25 Names inputted.** Use the \&quot;Entity Match - Bulk\&quot; workflow to submit larger universes of names to be concorded via a file.&lt;/p&gt;&lt;p&gt; Supported types of Entities in which the names can match to include -   * Corporations, Joint Ventures, and Holding Companies   * Fund Managers and various Fund Types (Open-end, Closed End, Hedge, Soverign Wealth, Pension, Exchange Traded, and more).&lt;/p&gt; 
   * @param entityMatchRequest A request to match a Entity. (required)
   * @return EntityMatchesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response containing Entity Match results. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public EntityMatchesResponse getEntityMatchForList(EntityMatchRequest entityMatchRequest) throws ApiException {
    return getEntityMatchForListWithHttpInfo(entityMatchRequest).getData();
  }

  /**
   * Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.
   * Finds the best candidate entities matching the given entity name. If a &#x60;universeId&#x60; is provided, any match for an input including a &#x60;clientId&#x60; will be saved to that universe. Additional attributes can be supplied to narrow the search, such as State, URL, and Entity Types. Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search.  &lt;p&gt;**Max of 25 Names inputted.** Use the \&quot;Entity Match - Bulk\&quot; workflow to submit larger universes of names to be concorded via a file.&lt;/p&gt;&lt;p&gt; Supported types of Entities in which the names can match to include -   * Corporations, Joint Ventures, and Holding Companies   * Fund Managers and various Fund Types (Open-end, Closed End, Hedge, Soverign Wealth, Pension, Exchange Traded, and more).&lt;/p&gt; 
   * @param entityMatchRequest A request to match a Entity. (required)
   * @return ApiResponse&lt;EntityMatchesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response containing Entity Match results. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EntityMatchesResponse> getEntityMatchForListWithHttpInfo(EntityMatchRequest entityMatchRequest) throws ApiException {
    Object localVarPostBody = entityMatchRequest;
    
    // verify the required parameter 'entityMatchRequest' is set
    if (entityMatchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'entityMatchRequest' when calling getEntityMatchForList");
    }
    
    // create path and map variables
    String localVarPath = "/factset-concordance/v2/entity-match";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=utf-8", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=utf-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        EntityMatchesResponse
      
    > apiResponse = apiClient.invokeAPI("EntityMatchApi.getEntityMatchForList", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getEntityMatchForListResponseTypeMap, false);

    return apiResponse;

  }
}

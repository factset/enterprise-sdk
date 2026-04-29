

# SummariesAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**fsymEntityId** | **String** | FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**fsymRegionalId** | **String** | FactSet Regional Identifier. Six alpha-numeric characters, excluding vowels, with a -R suffix (XXXXXX-R), resolved from the&#x60;requestId&#x60; of the Fund requested. |  [optional]
**fsymTickerRegion** | **String** | FactSet Ticker-Region for the requested fund. |  [optional]
**fsymUltimateParentId** | **String** | The FactSet Ultimate Parent Entity Identifier, with a -E suffix (XXXXXX-E). |  [optional]
**name** | **String** | The Fund security&#39;s name in proper format. |  [optional]
**isin** | **String** | Unique 12-character identifier for the requested fund, as per the International Securities Identification Number (ISIN) standard. |  [optional]
**cusip** | **String** | Unique 9-character identifier for the requested fund, as per the CUSIP Numbering System. |  [optional]
**sedol** | **String** | Sedol Identifier |  [optional]
**wkn** | **String** | WKN |  [optional]
**valoren** | **String** | Valoren |  [optional]
**issuerId** | **String** | The Issuer Identifier. |  [optional]
**issuerName** | **String** | The Issuer Name in proper format. |  [optional]
**activeFlag** | **Boolean** | Boolean flag to indicate whether the fund is currently active or not. |  [optional]
**activelyManagedFlag** | **Boolean** | Boolean flag of whether the fund is actively managed or not. |  [optional]
**brand** | **String** | The Funds Brand Name in proper format. |  [optional]
**fundDomicile** | **String** | Returns the fund&#39;s country of domicile in ISO2 format. Only available for Mutual Funds. |  [optional]
**currency** | **String** | ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; |  [optional]
**currencyHedged** | **Boolean** | Returns selected ETF currency hedge information. |  [optional]
**shareClass** | **String** | The Funds Share class type name in proper format. |  [optional]
**shareClassName** | **String** | The specified share class name for the fund in proper format. |  [optional]
**shareClassActiveFlag** | **Boolean** | Returns a binary indicator of whether the specified share class is currently active, where 1 is active and 0 is inactive. |  [optional]
**shareClassActivelyManagedFlag** | **Boolean** | Returns a binary indicator of whether the specified share class is actively managed, where 1 is active and 0 is inactive. |  [optional]
**shareClassCurrency** | **String** | The currency for the specified share class. ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; |  [optional]
**isOldestShareClass** | **Boolean** | Returns a flag to indicate whether the specified ID is the oldest share class. Data is returned for Mutual Funds only. |  [optional]
**descInfo** | **String** | The Fund&#39;s Investment Strategy short description.  For the long-form description, see &#x60;insight&#x60;. |  [optional]
**priceFirstDate** | **LocalDate** | The fund&#39;s first available date for prices (NAV) in YYYY-MM-DD format. This can be used to fetch the first available price from FactSet. *NOTE: This is not the inception date of fund.* |  [optional]
**priceRecentDate** | **LocalDate** | The fund&#39;s most recent available date for prices (NAV) in YYYY-MM-DD format. |  [optional]
**insight** | **String** | The fund&#39;s investment strategy long description. Use &#x60;descInfo&#x60; if needing short description. |  [optional]
**legalStructure** | **String** | The legal structure of the fund, e.g. Open-Ended Fund, close-ended fund |  [optional]
**inceptionDate** | **LocalDate** | The fund&#39;s inception date in YYYY-MM-DD format. |  [optional]
**shareClassLaunchDate** | **LocalDate** | The specified share class&#39;s inception date in YYYY-MM-DD format. Available only for Mutual Funds |  [optional]
**primaryExchange** | **String** | Returns exchange information for the fund.  Exchange Name is available for Mutual Funds and ETFs, returns a short-form exchange code (e.g., \&quot;NYSE\&quot;), rather than the full exchange name. |  [optional]
**webSite** | **String** | The URL of the Fund. |  [optional]
**webSiteShareClass** | **String** | URL of the share class webpage. |  [optional]
**backing** | **String** | Returns selected ETF structure backing information. Data items available are ETF type, legal structure, and disclosures. |  [optional]
**syntheticType** | **String** | Returns selected ETF structure information. Data items available are ETF type, legal structure, and disclosures. |  [optional]
**underlyingIndex** | **String** | Returns the name of the fund&#39;s benchmark. Data is returned for both Mutual Funds and ETFs. |  [optional]
**broadBasedIndex** | **String** | Returns the index that represents the overall market applicable to the fund, providing a broad measure of market performance. Data is returned for both Mutual Funds and ETFs. |  [optional]
**narrowBenchmark** | **String** | Returns the fund&#39;s narrow benchmark data. Narrow Benchmark returns the primary benchmark for an actively managed fund, reflecting the specific market in which the fund primarily invests. It is a more focused measure compared to a broad-based index, offering a closer alignment with the fund’s investment strategy |  [optional]
**additionalNarrowBenchmark** | **String** | Returns the fund&#39;s additional narrow benchmark data. Narrow Benchmark returns the primary benchmark for an actively managed fund, reflecting the specific market in which the fund primarily invests. Additional Narrow Benchmark returns an additional benchmark for an actively managed fund that measures performance within a specific market segment, providing a more detailed comparison than the primary benchmark. Data is returned for both Mutual Funds and ETFs.  |  [optional]
**fundObjective** | **String** | Returns the fund&#39;s objective long description. National language returns French translations for US Mutual Funds and US and Canadian ETFs. Data is returned for both Mutual Funds and ETFs.  |  [optional]
**dualPriced** | **Boolean** | Returns true if the fund is based on \&quot;dual pricing\&quot;. These unit trusts have an offer (buying) price and a bid (selling) price. In such cases, Net Asset Value (NAV) is substituted with either a bid, offer, or mid price, as provided by the fund issuer. Data is returned for Mutual Funds only.  |  [optional]
**currencyHedgedFrom** | **String** | Returns ETF currency hedge source currency. Part of ETF hedge information including: - currency hedged flag - currency hedged from - currency hedged into ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39;  |  [optional]
**currencyHedgedInto** | **String** | Returns ETF currency hedge target currency. Part of ETF hedge information including: - currency hedged flag - currency hedged from - currency hedged into ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39;  |  [optional]
**managers** | [**java.util.List&lt;Managers&gt;**](Managers.md) | Fetch basic Fund manager details, such as Title, Phone, Job Id and Name. |  [optional]


## Implemented Interfaces

* Serializable





# Profile


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. |  [optional]
**error** | [**CompanyReportErrorObject**](CompanyReportErrorObject.md) |  |  [optional]
**fsymId** | **String** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. |  [optional]
**tickerRegion** | **String** | FactSet Ticker-Region for the requested security. |  [optional]
**exchange** | [**Exchange**](Exchange.md) |  |  [optional]
**name** | **String** | Name of the security |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**economyId** | **String** | The economy classification Id for this security. The industry level 1 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) |  [optional]
**economy** | **String** | The economy classification for this security. The industry level 1 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) |  [optional]
**subSectorId** | **String** | The subSector classification Id for this security. The industry level 3 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) |  [optional]
**subSector** | **String** | The subSector classification for this security. The industry level 3 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) |  [optional]
**industryGroupId** | **String** | The industryGroup classification Id for this security. The industry level 4 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) |  [optional]
**industryGroup** | **String** | The industryGroup classification for this security. The industry level 4 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) |  [optional]
**industryId** | **String** | The industry classification Id for this security. The industry level 5 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) |  [optional]
**industry** | **String** | The industry classification for this security. The industry level 5 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) |  [optional]
**subIndustryId** | **String** | The subIndustry classification Id for this security. The industry level 6 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) |  [optional]
**subIndustry** | **String** | The subIndustry classification for this security. The industry level 6 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) |  [optional]
**sectorId** | **String** | The sector classification Id for this security. The sector level 2 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) |  [optional]
**sector** | **String** | The sector classification for this security. The sector level 2 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) |  [optional]
**numberOfEmployees** | **Integer** | Number of employees working in the company |  [optional]
**ceo** | **String** | A chief executive officer (CEO) is the highest-ranking executive in a company |  [optional]
**businessSummary** | **String** | Summary of the security being requested |  [optional]
**yearFounded** | **Integer** | The year this security is founded |  [optional]
**marketCapitalization** | **Long** | The market capitalization of a company. It is the total value of the company&#39;s outstanding shares of common stock |  [optional]
**totalMarketCapitalization** | **Long** | The total public shares for the company&#39;s listed equity. This aggregates across all share classes, with including non-traded shares. |  [optional]
**sharesOutstanding** | **Long** | The number of common shares that a company has issued and are held by investors |  [optional]
**peRatio** | **Double** | The price-earnings ratio (P/E ratio) is the ratio for valuing a company that measures its current share price relative to its per-share earnings (EPS) |  [optional]


## Implemented Interfaces

* Serializable



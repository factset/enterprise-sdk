# FactSet.SDK.FactSetFundamentals.Model.Profile

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier that was used for the request. | [optional] 
**Error** | [**CompanyReportErrorObject**](CompanyReportErrorObject.md) |  | [optional] 
**FsymId** | **string** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**TickerRegion** | **string** | FactSet Ticker-Region for the requested security. | [optional] 
**Exchange** | [**Exchange**](Exchange.md) |  | [optional] 
**Name** | **string** | Name of the security | [optional] 
**Address** | [**Address**](Address.md) |  | [optional] 
**IndustryId** | **string** | The industry classification Id for this security. The industry level 5 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) | [optional] 
**Industry** | **string** | The industry classification for this security. The industry level 5 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) | [optional] 
**SectorId** | **string** | The sector classification Id for this security. The sector level 2 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) | [optional] 
**Sector** | **string** | The sector classification for this security. The sector level 2 RBIC (Revere Business Industry Classification) system is used in classification. For more info, visit: [OA page](https://my.apps.factset.com/oa/pages/17498) | [optional] 
**NumberOfEmployees** | **int?** | Number of employees working in the company | [optional] 
**Ceo** | **string** | A chief executive officer (CEO) is the highest-ranking executive in a company | [optional] 
**BusinessSummary** | **string** | Summary of the security being requested | [optional] 
**YearFounded** | **int?** | The year this security is founded | [optional] 
**MarketCapitalization** | **long?** | The market capitalization of a company. It is the total value of the company&#39;s outstanding shares of common stock | [optional] 
**TotalMarketCapitalization** | **long?** | The total public shares for the company&#39;s listed equity. This aggregates across all share classes, with including non-traded shares. | [optional] 
**SharesOutstanding** | **long?** | The number of common shares that a company has issued and are held by investors | [optional] 
**PeRatio** | **double?** | The price-earnings ratio (P/E ratio) is the ratio for valuing a company that measures its current share price relative to its per-share earnings (EPS) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


# FactSet.SDK.FactSetEstimates.Model.FixedConsensusRequest
Request object for requesting fixed consensus estimates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  | 
**Metrics** | **List&lt;string&gt;** | Requested metrics. Use the metrics endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). | 
**StartDate** | **string** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint.  | [optional] 
**EndDate** | **string** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**Frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**FiscalPeriodStart** | **string** | Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019)  | [optional] 
**FiscalPeriodEnd** | **string** | Fiscal period end expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Month-end** - MM/YYYY (e.g., 11/2019)   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019)  | [optional] 
**Periodicity** | [**Periodicity**](Periodicity.md) |  | [optional] 
**Currency** | **string** | Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


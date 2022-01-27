# FactSet.SDK.FactSetESG.Model.SasbRanksRequest
SASB Scores Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may exceed this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
**Categories** | **List&lt;string&gt;** | The Categories representing overall or composite rankings from all underlying 26 SASB Categories.  ### SASB Categories |**SASB Category Inputs**|**Description**| |- --|- --| |**ALLCATEGORIES**|**All Categories** - The company&#39;s overall SASB Rank. This value is equal to the cumulative average of all 26 SASB categories. |**MATERIALITY**|**Materiality** - The composite rank of all &#39;material&#39; SASB categories for the given entity. For more information on SASB&#39;s Materiality Map, visit [materiality.sasb.org](https://materiality.sasb.org/)|  ### Helper Input **ALL** &#x3D; Simply gives the ability to request all categories in a single request without having to explicitly list each available category.   | [optional] 
**StartDate** | **string** | The start date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity, but updated Daily. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**EndDate** | **string** | The end date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity, but updated Daily. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**Frequency** | [**Frequency**](Frequency.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


# FactSet.SDK.Formula.Model.CrossSectionalResultObjectFlattened
 Data model returned when the parameter **flatten=Y** is used in the request. This flattened, simplified JSON data returned from **flatten=Y** can be conceptualized as a table (rows and columns) where each data object in the result is a row in the table and the field names are the column names.  There will be one data object for each request containing the request, fsymId if requested, and Key-Value pairs for each data item (formula). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Identifier requested. | 
**FsymId** | **string** | The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Included only if the &#x60;fsymId&#x60; parameter is set to Y.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


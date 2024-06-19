# FactSet.SDK.Formula.Model.BatchData
The schema for the batched result is determined by the endpoint you used with the _batch_ parameter. Please see the schema for that endpoint for the definition. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Universe** | **string** | If &#x60;universe&#x60; is submitted instead of &#x60;ids&#x60;, then the universe attribute will display the universe expression requested. | [optional] 
**DataItemName** | **string** | Name of data item (requestId, requested Screening formula, or fsymId) | 
**DisplayName** | **string** | Display Name. | [optional] 
**Result** | [**List&lt;CrossSectionalResultObjectNonflattenedResultAttribute&gt;**](CrossSectionalResultObjectNonflattenedResultAttribute.md) |  | 
**DataType** | **string** | Data type of the data item | 
**Error** | **int** | Data item error indicator.  * Zero – success  * Non-zero – failure  | 
**ErrorMessage** | **string** | If error is non-zero, errorMessage will display the Screening formula error. | [optional] 
**Warnings** | [**List&lt;WarningsObject&gt;**](WarningsObject.md) | Screening formula warnings. This attribute is only displayed if warnings are generated in the execution of the Screening formula. | [optional] 
**RequestId** | **string** | Identifier requested. | 
**FsymId** | **string** | The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Included only if the &#x60;fsymId&#x60; parameter is set to Y.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


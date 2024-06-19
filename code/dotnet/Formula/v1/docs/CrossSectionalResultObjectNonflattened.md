# FactSet.SDK.Formula.Model.CrossSectionalResultObjectNonflattened
An object returning the results for a single formula.

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

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


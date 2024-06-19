# CrossSectionalResultObjectNonflattened

An object returning the results for a single formula.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_item_name** | **str** | Name of data item (requestId, requested Screening formula, or fsymId) | 
**result** | [**[CrossSectionalResultObjectNonflattenedResultAttribute]**](CrossSectionalResultObjectNonflattenedResultAttribute.md) |  | 
**data_type** | **str** | Data type of the data item | 
**error** | **int** | Data item error indicator.  * Zero – success  * Non-zero – failure  | 
**universe** | **str** | If &#x60;universe&#x60; is submitted instead of &#x60;ids&#x60;, then the universe attribute will display the universe expression requested. | [optional] 
**display_name** | **str, none_type** | Display Name. | [optional] 
**error_message** | **str, none_type** | If error is non-zero, errorMessage will display the Screening formula error. | [optional] 
**warnings** | [**[WarningsObject]**](WarningsObject.md) | Screening formula warnings. This attribute is only displayed if warnings are generated in the execution of the Screening formula. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



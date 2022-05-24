# CrossSectionalResponseObjectItems


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**universe** | **str** | If &#x60;universe&#x60; is submitted instead of &#x60;ids&#x60;, then the universe attribute will display the universe expression requested. | [optional] 
**display_name** | **str, none_type** | Display Name. | [optional] 
**error_message** | **str, none_type** | If error is non-zero, errorMessage will display the Screening formula error. | [optional] 
**warnings** | [**[CrossSectionalResultObjectNonflattenedWarnings]**](CrossSectionalResultObjectNonflattenedWarnings.md) | Screening formula warnings. This attribute is only displayed if warnings are generated in the execution of the Screening formula. | [optional] 
**fsym_id** | **str, none_type** | The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881). Included only if the &#x60;fsymId&#x60; parameter is set to Y.  | [optional] 
**data_item_name** | **str** | Name of data item (requestId, requested Screening formula, or fsymId) | [optional] 
**result** | [**[CrossSectionalResultObjectNonflattenedResultAttribute]**](CrossSectionalResultObjectNonflattenedResultAttribute.md) |  | [optional] 
**data_type** | **str** | Data type of the data item | [optional] 
**error** | **int** | Data item error indicator.  * Zero – success  * Non-zero – failure  | [optional] 
**request_id** | **str** | Identifier requested. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



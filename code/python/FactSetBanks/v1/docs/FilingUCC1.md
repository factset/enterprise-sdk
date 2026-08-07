# FilingUCC1

A single UCC-1 financing statement record.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request (e.g., ticker or entity ID) | [optional] 
**vendor_filing_id** | **str** | Vendor filing identifier. Format varies by state. | [optional] 
**debtor_name** | **str** | Name of the party granting security interest. | [optional] 
**filing_state** | **str** | US state code where the UCC-1 was filed. | [optional] 
**effective_date** | **date** | Date when the financing statement becomes effective. | [optional] 
**expiration_date** | **date** | Date when the financing statement expires (typically 5 years from effective date). | [optional] 
**entity_proper_name** | **str, none_type** | Institution legal name | [optional] 
**factset_entity_id** | **str, none_type** | FactSet entity identifier | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



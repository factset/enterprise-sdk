# OwnershipSummary

Ownership Summary response object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used in the request. | [optional] 
**fsym_id** | **str** | FactSet Security Identifier of Fund. Identifies the security level id of the Fund requested (not-representing the underlying holding). Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. | [optional] 
**shares_outstanding** | **float, none_type** | Number of shares outstanding for the security. | [optional] 
**percent_total_outstanding** | **float, none_type** | Position held as a percentage of the total outstanding shares of the security. | [optional] 
**percent_institutional_outstanding** | **float, none_type** | Position held by institutional holders as a percentage of total outstanding shares. | [optional] 
**percent_top_ten_institutional** | **float, none_type** | Position held by the top 10 institutional holders as a percentage of total outstanding shares. | [optional] 
**percent_insider_outstanding** | **float, none_type** | Position held by insiders as a percentage of total outstanding shares. | [optional] 
**as_of_date** | **date, none_type** | Date as of which the ownership data is current. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



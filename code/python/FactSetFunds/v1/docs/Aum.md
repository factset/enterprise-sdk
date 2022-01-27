# Aum


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**fund_level_aum** | **float** | Returns fund-level Assets Under Management (AUM) data. Fund-level AUM is the sum of the market values of the positions in the fund&#39;s portfolio. This represents all share classes. | [optional] 
**shr_class_aum_rpt** | **float** | As-Reported AUM. Calculated by using shares outstanding at previous close multiplied by NAV at previous close. This is typically the value seen on fund websites. As Reported AUM &#x3D; (Shares Outstanding t0 * NAV t0). | [optional] 
**shr_class_aum_act** | **float** | Actual AUM. Calculated by using shares outstanding at previous close multiplied by NAV of one day prior to close. This is the value used in calculating fund flows. Actual AUM &#x3D; (Shares Outstanding t0 * NAV t-1) | [optional] 
**currency** | **str** | The Currency of the AUM values. By default it will be in the FUnds Currency, unless otherwise requested via the currency parameter. | [optional] 
**date** | **str** | The date of the AUM in YYYY-MM-DD format. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



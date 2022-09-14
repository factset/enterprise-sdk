# Dividend


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**divs_ex_date** | **date, none_type** | Ex-Date of the dividend expressed in YYYY-MM-DD format. | [optional] 
**adj_date** | **date, none_type** | Date of last split for which prices and volume have been adjusted. | [optional] 
**currency** | **str, none_type** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**divs_paid** | **float, none_type** | Amount of the dividend paid. | [optional] 
**divs_rec_date** | **date, none_type** | Date the dividend was recorded expressed in YYYY-MM-DD format. | [optional] 
**divs_pay_date** | **date, none_type** | Date the dividend will be paid expressed in YYYY-MM-DD format. | [optional] 
**divs_type_c** | **int, none_type** | Dividend type code. For code descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764). | [optional] 
**divs_type_d** | **str, none_type** | Description of dividend type. For type descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764). | [optional] 
**divs_tax_c** | **str, none_type** | Tax Marker Code. For code descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265). | [optional] 
**divs_tax_d** | **str, none_type** | Description of Tax Marker. For type descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265). | [optional] 
**divs_ng_flag** | **str, none_type** | Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512). | [optional] 
**divs_ng_equiv** | **float, none_type** | Net/Gross equivalent (opposite of dividend paid). For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512). | [optional] 
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



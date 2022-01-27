# FactSet.SDK.FactSetPrices.Model.Dividend

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**DivsExDate** | **DateTime** | Ex-Date of the dividend expressed in YYYY-MM-DD format. | [optional] 
**AdjDate** | **DateTime** | Date of last split for which prices and volume have been adjusted. | [optional] 
**Currency** | **string** | Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**DivsPaid** | **double** | Amount of the dividend paid. | [optional] 
**DivsRecDate** | **DateTime** | Date the dividend was recorded expressed in YYYY-MM-DD format. | [optional] 
**DivsPayDate** | **DateTime** | Date the dividend will be paid expressed in YYYY-MM-DD format. | [optional] 
**DivsTypeC** | **int** | Dividend type code. For code descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764). | [optional] 
**DivsTypeD** | **string** | Description of dividend type. For type descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764). | [optional] 
**DivsTaxC** | **string** | Tax Marker Code. For code descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265). | [optional] 
**DivsTaxD** | **string** | Description of Tax Marker. For type descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265). | [optional] 
**DivsNGFlag** | **string** | Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512). | [optional] 
**DivsNGEquiv** | **double** | Net/Gross equivalent (opposite of dividend paid). For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512). | [optional] 
**RequestId** | **string** | Identifier that was used for the request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


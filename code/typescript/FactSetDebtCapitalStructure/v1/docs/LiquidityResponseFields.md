# factsetdebtcapitalstructure.LiquidityResponseFields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. | [optional] 
**fysmId** | **String** | Identifier that was used for the request. | [optional] 
**metric** | **String** | The requested &#x60;metric&#x60; input, representing the Liquidity data item. For a definition of the item please use the &#x60;/metrics&#x60; endpoint. | [optional] 
**fiscalYear** | **Number** | Fiscal year of the reported period in YYYY format. | [optional] 
**reportDate** | **Date** | Reporting date for the debt instrument. | [optional] 
**currency** | **String** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**value** | [**LiquidityValue**](LiquidityValue.md) |  | [optional] 
**instrumentId** | **String** | Identifier for the debt instrument. | [optional] 
**instrumentType** | **String** | Type of debt instrument. | [optional] 
**description** | **String** | Description of the debt instrument. | [optional] 
**amountOutstanding** | **Number** | Balance sheet amount outstanding. | [optional] 
**facilityAmount** | **Number** | Facility Amount for liquidity. | [optional] 
**borrowingBase** | **Number** | Borrowing Base for liquidity. | [optional] 
**maturityDate** | **Date** | Maturity date for the debt instrument. | [optional] 



## Enum: InstrumentTypeEnum


* `Revolving Credit` (value: `"Revolving Credit"`)

* `Term Loans` (value: `"Term Loans"`)

* `ST Debt Total` (value: `"ST Debt Total"`)

* `Notes/Bonds` (value: `"Notes/Bonds"`)

* `Other` (value: `"Other"`)




